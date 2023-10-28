package AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args){
        Factory factory1 = new Factory1();
        ProductA productA = factory1.createProductA();
        productA.info();

        Factory factory2 = new Factory1();
        ProductB productB = factory2.createProductB();
        productB.info();
    }

}

