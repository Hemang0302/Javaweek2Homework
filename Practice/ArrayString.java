package Practice;

public class ArrayString {
    public static void main(String[] args) {
        String name[]=new String[5];
        name[0]="Tester1";
        name[1]="Tester2";
        name[2]="Tester3";
        name[3]="Tester4";
        System.out.println(name[1]);
        System.out.println(name[0]+" "+name[2]);
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);


        }
    }
}
