package Practice;

public class ArrayObject {
    public static void main(String[] args) {
        Object Employee[]=new Object[4];
        Employee[0]= 1;
        Employee[1]= "Tester";
        Employee[2]=2500.50f;
        Employee[3]="Manual Tester";
        System.out.println(Employee[1]);
        System.out.println(Employee[3]+" £ " +Employee[2]);
        for(int i=0;i<4;i++){
            System.out.println(Employee[i]);
        }
    }


}
