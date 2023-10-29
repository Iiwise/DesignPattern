package compositepattern;

import java.util.List;

public class File extends AbstractFile {
    public File(String name){
        this.name = name;
    }
    @Override
    public boolean Add(AbstractFile file){
        return false;
    }
    @Override
    public boolean Remove(AbstractFile file){
        return false;
    }
    public List<AbstractFile> getChildren(){
        return null;
    }

}
