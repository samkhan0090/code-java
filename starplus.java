import java.util.Scanner;

public class plus_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int i=9;
       int j=9;

        for(i=1;i<=size;i++){
            for(j=1;j<=size;j++){
                if(i=3 || j=3)
                {
                System.out.print("*"); 
                }
            else{
                System.out.print(" ");
                }
            System.out.print("\n");
                }   
             }
        sc.close();
    }
}
