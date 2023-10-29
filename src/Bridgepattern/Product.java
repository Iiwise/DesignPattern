package Bridgepattern;

public abstract class Product {
    private String name = null;
    protected Color color = null;

    public void SetName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void SetColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }
    public abstract void Operation();
}
