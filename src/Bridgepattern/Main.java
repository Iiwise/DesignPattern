package Bridgepattern;

public class Main {
    public static void main(String[] args){
        Product productA1 = new ProductA();
        Product productA2 = new ProductA();
        Color red = new Red();

        productA1.SetName("产品A");
        productA1.SetColor(red);
        productA1.Operation();

        Color blue = new Blue();
        productA2.SetColor(blue);
        productA2.SetName("产品B");
        productA2.Operation();
    }
}
