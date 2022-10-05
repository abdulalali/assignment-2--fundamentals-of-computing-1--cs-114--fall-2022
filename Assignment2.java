import java.util.Scanner;


public class Assignment2 {
    public static void main(String [] args){
        int n;
        int a;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        
        if(n % 2 == 0){
            for(i=0; i <= n/2; i++)
                System.out.print("  ");
            System.out.println("*");
            
            a = 2;
            
            while(a <= n){
                for(i=0; i<=(n/2 - a/2); i++)
                    System.out.print("  ");
                for(i=0; i<a; i++)
                    System.out.print(" *");
                System.out.println();
                a += 2;
            }
            
            a -= 4;
            while(a > 1){
                for(i=0; i<=(n/2 - a/2); i++)
                    System.out.print("  ");
                for(i=0; i<a; i++)
                    System.out.print(" *");
                System.out.println();
                a -= 2;
            }
            
            for(i=0; i <= n/2; i++)
                System.out.print("  ");
            System.out.println("*");
        }
        else{
            for(i=0; i <= n/2; i++)
                System.out.print("  ");
            System.out.println("*");
            
            a = 3;
            
            while(a <= n){
                for(i=0; i<=(n/2 - a/2); i++)
                    System.out.print("  ");
                for(i=0; i<a; i++)
                    System.out.print("* ");
                System.out.println();
                a += 2;
            }
            
            a -= 4;
            while(a > 1){
                for(i=0; i<=(n/2 - a/2); i++)
                    System.out.print("  ");
                for(i=0; i<a; i++)
                    System.out.print("* ");
                System.out.println();
                a -= 2;
            }
            
            for(i=0; i <= n/2; i++)
                System.out.print("  ");
            System.out.println("*");
        }
        
        
    }
}
