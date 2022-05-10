package Practice;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        data[0][0]=1;
        data[0][1]=2;
        data[0][2]=3;

        data[1][0]=4;
        data[1][1]=5;
        data[1][2]=6;

        data[2][0]=8;
        data[2][1]=9;
        data[2][2]=10;


       // System.out.println(data[2][2]);
        for(int i=0;i<data.length;i++) {
            for (int j = 0; j < data.length; j++)
                {
                    System.out.print(data[i][j] + " ");
                }
                     System.out.println();
                }


            }
       }
