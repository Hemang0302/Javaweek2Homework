package Practice;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(100);
        arr.add("f");
        arr.add("tester");
        arr.add(true);

        System.out.println(arr.get(2));
        System.out.println(arr.size());

    }
}
