package co.edu.konrad.marketplace.persistence;

import co.edu.konrad.marketplace.entities.TipoDocumentoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *Manejador tabla producto
 * @author Luis
 */
@Stateless
public class TipoDocumentoPersistence {
    
    /**
     * Manejador
     */
    @PersistenceContext(unitName = "marketplacePU")
    protected EntityManager em;
    
    /**
     * retorna todo
     * @return 
     */
    public List<TipoDocumentoEntity> findAll(){
        Query q=em.createQuery("select p from TipoDocumentoEntity p");
        return q.getResultList();
    }
    /**
     * retorna un dato
     * @param id
     * @return 
     */
    public TipoDocumentoEntity find(Long id){
        return em.find(TipoDocumentoEntity.class, id);
    }
    
    /**insert
     * Puede ser void
     * @param p
     * @return 
     */
    public TipoDocumentoEntity create(TipoDocumentoEntity p){
        em.persist(p);
        return p;
    }
    
    /**
     * Update
     * @param p
     * @return producto actualizado
     */
    public TipoDocumentoEntity merge(TipoDocumentoEntity p){
        return em.merge(p);
    }
    
    /**
     * Delete 
     * @param id 
     */
    public void delete(long id){
        TipoDocumentoEntity entity = em.find(TipoDocumentoEntity.class, id);
        em.remove(id);
    }
}
