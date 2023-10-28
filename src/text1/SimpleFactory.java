package text1;

public class SimpleFactory{
    public static void main(String[] args){
//        Factory factoryA = new FactoryA();
         // 父类 对象名 = new 子类;
        Product productA = Factory.createProduct("A");
        productA.info();
        Product productB = Factory.createProduct("B");
        productB.info();
    }
}

