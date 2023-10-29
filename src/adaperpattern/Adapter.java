package adaperpattern;

public class Adapter extends USB{
    private final typeC TypeC = new typeC();
    @Override
    public void Request(){
        TypeC.Request();
    }
}
