package Scene;

import Figure.*;
import Plane.*;
import WearClothes.*;

public class Scene2 {
    public static void main(String[] args) {
        try {
            System.out.println("\n场景2（Cold）：");
            Thread.sleep(1000);

            Boy boy = new Boy();
            boy.display();
            Thread.sleep(1000);

            Girl girl = new Girl();
            girl.display();
            Thread.sleep(1000);

            boy.walk();
            girl.walk();
            Thread.sleep(1000);

            Boeing boeing = new Boeing();
            boeing.display();
            Thread.sleep(1000);

            Apache apache = new Apache();
            apache.display();
            Thread.sleep(1000);

            boeing.performFly();
            Thread.sleep(1000);

            apache.performFly();
        } catch (InterruptedException e) {
            System.out.println("线程被中断");
            e.printStackTrace();
        }
    }
}