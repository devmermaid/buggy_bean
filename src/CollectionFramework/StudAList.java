package CollectionFramework;

import java.util.*;

import static java.lang.reflect.Array.get;

public class StudAList
{
    static void main() {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list1.add("Mohini");
        list1.add(1,"Rudraksh");
        list2.add("Radha");
        list1.addAll(list2);
        list1.get(1);
        list1.remove(0);
        list1.remove(Integer.valueOf(1));
        list1.clear();
        list1.add(0,"Mohini");
        list1.contains("Mohini");

        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }

        for(String i:list1)
        {
            System.out.println(i);
        }

        Iterator<String> it=list1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
