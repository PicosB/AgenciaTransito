/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Clientes;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Tramite;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author PC
 */
public class ClientesJpaController implements Serializable {

    public ClientesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ClientesJpaController(){
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Clientes clientes) {
        if (clientes.getListaTramites() == null) {
            clientes.setListaTramites(new ArrayList<Tramite>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Tramite> attachedListaTramites = new ArrayList<Tramite>();
            for (Tramite listaTramitesTramiteToAttach : clientes.getListaTramites()) {
                listaTramitesTramiteToAttach = em.getReference(listaTramitesTramiteToAttach.getClass(), listaTramitesTramiteToAttach.getId());
                attachedListaTramites.add(listaTramitesTramiteToAttach);
            }
            clientes.setListaTramites(attachedListaTramites);
            em.persist(clientes);
            for (Tramite listaTramitesTramite : clientes.getListaTramites()) {
                Clientes oldCliOfListaTramitesTramite = listaTramitesTramite.getCli();
                listaTramitesTramite.setCli(clientes);
                listaTramitesTramite = em.merge(listaTramitesTramite);
                if (oldCliOfListaTramitesTramite != null) {
                    oldCliOfListaTramitesTramite.getListaTramites().remove(listaTramitesTramite);
                    oldCliOfListaTramitesTramite = em.merge(oldCliOfListaTramitesTramite);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Clientes clientes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes persistentClientes = em.find(Clientes.class, clientes.getId());
            List<Tramite> listaTramitesOld = persistentClientes.getListaTramites();
            List<Tramite> listaTramitesNew = clientes.getListaTramites();
            List<Tramite> attachedListaTramitesNew = new ArrayList<Tramite>();
            for (Tramite listaTramitesNewTramiteToAttach : listaTramitesNew) {
                listaTramitesNewTramiteToAttach = em.getReference(listaTramitesNewTramiteToAttach.getClass(), listaTramitesNewTramiteToAttach.getId());
                attachedListaTramitesNew.add(listaTramitesNewTramiteToAttach);
            }
            listaTramitesNew = attachedListaTramitesNew;
            clientes.setListaTramites(listaTramitesNew);
            clientes = em.merge(clientes);
            for (Tramite listaTramitesOldTramite : listaTramitesOld) {
                if (!listaTramitesNew.contains(listaTramitesOldTramite)) {
                    listaTramitesOldTramite.setCli(null);
                    listaTramitesOldTramite = em.merge(listaTramitesOldTramite);
                }
            }
            for (Tramite listaTramitesNewTramite : listaTramitesNew) {
                if (!listaTramitesOld.contains(listaTramitesNewTramite)) {
                    Clientes oldCliOfListaTramitesNewTramite = listaTramitesNewTramite.getCli();
                    listaTramitesNewTramite.setCli(clientes);
                    listaTramitesNewTramite = em.merge(listaTramitesNewTramite);
                    if (oldCliOfListaTramitesNewTramite != null && !oldCliOfListaTramitesNewTramite.equals(clientes)) {
                        oldCliOfListaTramitesNewTramite.getListaTramites().remove(listaTramitesNewTramite);
                        oldCliOfListaTramitesNewTramite = em.merge(oldCliOfListaTramitesNewTramite);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = clientes.getId();
                if (findClientes(id) == null) {
                    throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.");
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
            Clientes clientes;
            try {
                clientes = em.getReference(Clientes.class, id);
                clientes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.", enfe);
            }
            List<Tramite> listaTramites = clientes.getListaTramites();
            for (Tramite listaTramitesTramite : listaTramites) {
                listaTramitesTramite.setCli(null);
                listaTramitesTramite = em.merge(listaTramitesTramite);
            }
            em.remove(clientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Clientes> findClientesEntities() {
        return findClientesEntities(true, -1, -1);
    }

    public List<Clientes> findClientesEntities(int maxResults, int firstResult) {
        return findClientesEntities(false, maxResults, firstResult);
    }

    private List<Clientes> findClientesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Clientes.class));
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

    public Clientes findClientes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Clientes.class, id);
        } finally {
            em.close();
        }
    }
    
    public Clientes findClientes(String RFC) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Clientes.class, RFC);
        } finally {
            em.close();
        }
    }

    public int getClientesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Clientes> rt = cq.from(Clientes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
