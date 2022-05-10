package Inheritance;

import java.util.SortedMap;

public class RunTest {
  public static void main(String[] args) {
   House h = new House();
h.cleanHouse();
h.paintHouse();
h.furnitureHouse();
h.decorateHouse();
h.sizeofhouse();

        System.out.println(" DetachedHouse:");
        DetachedHouse dh = new DetachedHouse();
        dh.cleanHouse();
        dh.paintHouse();
        dh.furnitureHouse();
        dh.decorateHouse();

        System.out.println(" Flat:");
        DetachedHouse f = new DetachedHouse();
        f.cleanHouse();
        f.paintHouse();
        f.furnitureHouse();
        f.decorateHouse();

        System.out.println(" SemiDetachedHouse:");
        SemiDetachedHouse sd = new SemiDetachedHouse();
        sd.cleanHouse();
        sd.paintHouse();
        sd.furnitureHouse();
        sd.decorateHouse();

        Commercial C = new Commercial();
        C.sizeofProperty();


    }
}
