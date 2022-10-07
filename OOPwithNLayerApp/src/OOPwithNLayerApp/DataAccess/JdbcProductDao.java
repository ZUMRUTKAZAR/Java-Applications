package OOPwithNLayerApp.DataAccess;

import OOPwithNLayerApp.entities.Product;

public class JdbcProductDao implements ProductDao{

    public void add(Product product){
        // sadece ve sadce db erişim kodları buraya yazılır...SQL bilmek gerekir.
        System.out.println("JDBC ile veri tabanına eklendi");
    }
}
