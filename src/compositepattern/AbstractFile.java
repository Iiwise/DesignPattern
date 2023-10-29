package compositepattern;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractFile {
    protected String name;
    public void printName(){
        System.out.println(name);
    }
    public abstract boolean Add(AbstractFile file);
    public abstract boolean Remove(AbstractFile file);
    public abstract List<AbstractFile> getChildren();
}
