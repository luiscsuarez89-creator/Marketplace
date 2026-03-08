package co.edu.konrad.marketplace.persistence;

import co.edu.konrad.marketplace.entities.ProductoEntity;
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
public class ProductoPersistence {
    
    /**
     * Manejador
     */
    @PersistenceContext(unitName = "marketplacePU")
    protected EntityManager em;
    
    /**
     * retorna todo
     * @return 
     */
    public List<ProductoEntity> findAll(){
        Query q=em.createQuery("select p from ProductoEntity p");
        return q.getResultList();
    }
    /**
     * retorna un dato
     * @param id
     * @return 
     */
    public ProductoEntity find(Long id){
        return em.find(ProductoEntity.class, id);
    }
    
    /**insert
     * Puede ser void
     * @param p
     * @return 
     */
    public ProductoEntity create(ProductoEntity p){
        em.persist(p);
        return p;
    }
    
    /**
     * Update
     * @param p
     * @return producto actualizado
     */
    public ProductoEntity merge(ProductoEntity p){
        return em.merge(p);
    }
    
    /**
     * Delete 
     * @param id 
     */
    public void delete(long id){
        ProductoEntity entity = em.find(ProductoEntity.class, id);
        em.remove(id);
    }
}
