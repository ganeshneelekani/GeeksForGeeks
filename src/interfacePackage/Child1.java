package interfacePackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Child1 implements ParentClass {

    String y;
    int z;
    int k;
    int h=z+k;

    public Child1() {

    }

    public static void findChildren1() {

    }

    public void findChildren() throws  Exception {


        System.out.println(z);

        try {
            System.out.println("=============Child 1=======" + y);
            BufferedReader reader;

            reader = new BufferedReader(new FileReader(
                    "/Users/pankaj/Downloads/myfile.txt"));
            String line = null;

            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {

        }
    }

    @Override
    public void add() {

        System.out.println("==========ADD======");
    }

    @Override
    public void substract() {
        System.out.println("==========SUBSTRACT======");
    }

    public void multiplication() {
        System.out.println("==========Multiplication======");
    }

    interface K{

        void hello();
    }

    void hello(){
        System.out.println("====111======");
    };
}
