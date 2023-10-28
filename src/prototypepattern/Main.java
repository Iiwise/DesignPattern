package prototypepattern;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product(2023,11.5);
        System.out.println(product1.getId() + " " + product1.getPrice());

//        Product product2 = new Product(2023 , 11.5);
        Product product2 = (Product) product1.Clone();
        System.out.println(product2.getId() + " " + product2.getPrice());

        Product product3 = (Product) product1.Clone();
        System.out.println(product3.getId() + " " + product3.getPrice());
    }
}
