package interfacePackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Child2  extends Child1{



    public Child2(){
        super();
    }

//    @Override
//    private String findChildren(int a)  throws IOException {
//
//        System.out.println("===============Child 2======="+i);
//        return  " ";
//    }

    @Override
    public void findChildren() throws Exception{

        System.out.println("===============Child 2======="+i);
    }

}
