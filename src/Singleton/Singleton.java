package Singleton;

public class Singleton {
    private int number = 2023;
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    private static final Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
