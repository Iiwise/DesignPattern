package compositepattern;

import java.util.List;

public class Main {
    public static void main(String[] args){
        AbstractFile root = new Folder("root");
        AbstractFile folder1 = new Folder("folder1");
        AbstractFile folder2 = new Folder("folder2");

        AbstractFile file1 = new File("file1");
        AbstractFile file2 = new File("file2");
        AbstractFile file3 = new File("file3");
        AbstractFile file4 = new File("file4");

        root.Add(file1);
        root.Add(file2);
        root.Add(folder1);

        folder1.Add(file3);
        folder1.Add(file4);

        print(root);
     }
     static void print(AbstractFile file){
        file.printName();
        List<AbstractFile> childrenList = file.getChildren();
        if(childrenList == null) return;
        for(AbstractFile children : childrenList){
            print(children);
        }
     }
}
