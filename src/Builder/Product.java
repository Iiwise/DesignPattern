package Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<String>();

    public void Add(String part){
        parts.add(part);
    }
    public void show(){
        System.out.print("产品的组成：");
        for(String str: parts){
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
