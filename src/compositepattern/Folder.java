package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    private final List<AbstractFile> ChildrenList = new ArrayList<AbstractFile>();
    public Folder(String name){
        this.name = name;
    }

    @Override
    public boolean Add(AbstractFile file){
        return ChildrenList.add(file);
    }
    public boolean Remove(AbstractFile file){
        return ChildrenList.remove(file);
    }
    public List<AbstractFile> getChildren(){
        return ChildrenList;
    }
}
