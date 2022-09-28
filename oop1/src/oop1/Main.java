package oop1;// object oriented programing

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

//nesne güdümlü nesne yönelimli programlama
public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";
//set value

        //normalde bu verileri elle girmeyiz bu veriler bize db(database)üzerinden gelir.
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinası");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInstock(3);
        product1.setImageUrl("Image1.jpg");
        //get value
        //System.out.println(product1.name);
        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinası");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInstock(3);
        product2.setImageUrl("Image1.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen aid Kahve Makinası");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInstock(3);
        product3.setImageUrl("Image1.jpg");

        Product[] products = {product1, product2, product3};
        // bu aşşağıdaki kodd DEMEK İSTEDİĞİ productstakileri tek tek gez demek.
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() +"</li>");
        }
        System.out.println("</ul>");

         IndividualCustomer individualCustomer= new IndividualCustomer();
         individualCustomer.setId(1);
         individualCustomer.setCustomerNumber("052222220");
         individualCustomer.setPhone("12345");
         individualCustomer.setFirstName("ENGİN");
         individualCustomer.setLastName("DEMİROĞ");

         CorporateCustomer corporateCustomer= new CorporateCustomer();
         corporateCustomer.setId(2);
         corporateCustomer.setCompanyName("Kodlama.io");
         corporateCustomer.setPhone("05333333");
         corporateCustomer.setTaxNumber("1111111");
         corporateCustomer.setCustomerNumber("54321");

         Customer[] customers = {individualCustomer,corporateCustomer}

    }
}
