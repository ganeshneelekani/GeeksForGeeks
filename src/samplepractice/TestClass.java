package samplepractice;

import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);


        List list=Collections.emptyList();
        list=new ArrayList();

        List list1=Collections.emptyList();

        Iterator iterator1=list1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        Map map=new HashMap();
        map.put(1,2);
        System.out.println(map.get(1));
    }
}
