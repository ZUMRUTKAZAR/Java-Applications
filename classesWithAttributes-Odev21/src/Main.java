public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setid(1);
        product.setDescription("Lenovo Laptop");
        product.setPrice(7200);
        product.setStocAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
