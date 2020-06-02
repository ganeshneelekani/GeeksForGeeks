package interfacePackage;

import java.io.IOException;

import static interfacePackage.CompanyInterface.*;

public class MainClass {

    public static void main(String[] args) {

        ParentClass parentClass=new Child1();

        try {
            parentClass.findChildren();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Child1 child2=new Child2();

        try {
            child2.findChildren();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
