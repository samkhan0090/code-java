
import java.util.Scanner;
    public class employfunction{
        static float findhra(float a){
            float hra=(a*30)/100;
            return hra;

        }
         static float findda(float a){
            float  da =(a*20)/100;
            return da;
          }
          static float findta(float a){
           float ta=(a*10)/100;
           return ta;
          } 


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the basic salary");
        float a=scan.nextFloat();
        int pf=1500;
        float hra=(a*30)/100;
        float  da =(a*20)/100;
        float ta=(a*10)/100;
        float net_sal=a+hra+dr+ta-pf;
        System.out.println("Net_salary is:" +net_sal);
        scan.close();



    }
}

    

