package homework01;

import homework02.Product;

public class App {

    public static void main(String[] args) {

        Product product= new Product();
        product.setId(1L);
        product.setDescription("car");
        product.setPrice(100.00);
        product.setQuantity(12);

        Product product1=new Product(2L, "bike", 30.0, 15);

        System.out.println(product);
        System.out.println(product1);
    }
}
