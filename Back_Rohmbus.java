import java.util.Scanner;

public class Back_Rohmbus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no is:");
        int num=sc.nextInt();
        for(int i=num;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
             for(int j=0;j<num;j++){
                System.out.print("*");
             }
            System.out.print("\n");
        } 
        sc.close();
    }
}
