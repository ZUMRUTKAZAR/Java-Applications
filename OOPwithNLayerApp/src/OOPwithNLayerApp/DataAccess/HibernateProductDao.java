package OOPwithNLayerApp.DataAccess;

import OOPwithNLayerApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){

        // sadece ve sadce db erişim kodları buraya yazılır...SQL bilmek gerekir.
        System.out.println("Hibernate ile veri tabanına eklendi");

}
}
