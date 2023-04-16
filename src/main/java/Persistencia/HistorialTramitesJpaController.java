/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.HistorialTramites;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author luis
 */
public class HistorialTramitesJpaController implements Serializable {

    public HistorialTramitesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public HistorialTramitesJpaController() {
         emf = Persistence.createEntityManagerFactory("ConexionPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HistorialTramites historialTramites) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(historialTramites);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HistorialTramites historialTramites) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            historialTramites = em.merge(historialTramites);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = historialTramites.getId();
                if (findHistorialTramites(id) == null) {
                    throw new NonexistentEntityException("The historialTramites with id " + id + " no longer exists.");
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
            HistorialTramites historialTramites;
            try {
                historialTramites = em.getReference(HistorialTramites.class, id);
                historialTramites.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The historialTramites with id " + id + " no longer exists.", enfe);
            }
            em.remove(historialTramites);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HistorialTramites> findHistorialTramitesEntities() {
        return findHistorialTramitesEntities(true, -1, -1);
    }

    public List<HistorialTramites> findHistorialTramitesEntities(int maxResults, int firstResult) {
        return findHistorialTramitesEntities(false, maxResults, firstResult);
    }

    private List<HistorialTramites> findHistorialTramitesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HistorialTramites.class));
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

    public HistorialTramites findHistorialTramites(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HistorialTramites.class, id);
        } finally {
            em.close();
        }
    }

    public int getHistorialTramitesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HistorialTramites> rt = cq.from(HistorialTramites.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
