/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Clientes;
import Entidades.Tramite;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author PC
 */
public class TramiteJpaController implements Serializable {

    public TramiteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public TramiteJpaController(){
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tramite tramite) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes cli = tramite.getCli();
            if (cli != null) {
                cli = em.getReference(cli.getClass(), cli.getId());
                tramite.setCli(cli);
            }
            em.persist(tramite);
            if (cli != null) {
                cli.getListaTramites().add(tramite);
                cli = em.merge(cli);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tramite tramite) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tramite persistentTramite = em.find(Tramite.class, tramite.getId());
            Clientes cliOld = persistentTramite.getCli();
            Clientes cliNew = tramite.getCli();
            if (cliNew != null) {
                cliNew = em.getReference(cliNew.getClass(), cliNew.getId());
                tramite.setCli(cliNew);
            }
            tramite = em.merge(tramite);
            if (cliOld != null && !cliOld.equals(cliNew)) {
                cliOld.getListaTramites().remove(tramite);
                cliOld = em.merge(cliOld);
            }
            if (cliNew != null && !cliNew.equals(cliOld)) {
                cliNew.getListaTramites().add(tramite);
                cliNew = em.merge(cliNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tramite.getId();
                if (findTramite(id) == null) {
                    throw new NonexistentEntityException("The tramite with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tramite tramite;
            try {
                tramite = em.getReference(Tramite.class, id);
                tramite.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tramite with id " + id + " no longer exists.", enfe);
            }
            Clientes cli = tramite.getCli();
            if (cli != null) {
                cli.getListaTramites().remove(tramite);
                cli = em.merge(cli);
            }
            em.remove(tramite);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tramite> findTramiteEntities() {
        return findTramiteEntities(true, -1, -1);
    }

    public List<Tramite> findTramiteEntities(int maxResults, int firstResult) {
        return findTramiteEntities(false, maxResults, firstResult);
    }

    private List<Tramite> findTramiteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tramite.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Tramite findTramite(Integer id) {
        EntityManager em = getEntityManager();
        
        try {
            return em.find(Tramite.class, id);
        } finally {
            em.close();
        }
    }
    
    public int getTramiteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tramite> rt = cq.from(Tramite.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Tramite> obtenerTramites(){
        try{
            EntityManager emf = getEntityManager();
            emf.getTransaction().begin();
            
            TypedQuery<Tramite> query = emf.createQuery("SELECT t FROM Tramite t", Tramite.class);
            List<Tramite> Tramites = query.getResultList();
            
            emf.getTransaction().commit();
            emf.close();
            
            return Tramites;
        } catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
}
