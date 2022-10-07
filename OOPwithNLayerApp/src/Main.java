import OOPwithNLayerApp.Business.ProductManager;
import OOPwithNLayerApp.DataAccess.HibernateProductDao;
import OOPwithNLayerApp.DataAccess.JdbcProductDao;
import OOPwithNLayerApp.core.logging.DatabaseLogger;
import OOPwithNLayerApp.core.logging.FileLogger;
import OOPwithNLayerApp.core.logging.Logger;
import OOPwithNLayerApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"IPhone Xr", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
