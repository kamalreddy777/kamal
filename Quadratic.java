import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a,b,c,D;
        double root1,root2;
        System.out.println("enter the values of a,b,c");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        D=(b*b)-(4*a*c);
        if (D>0){
            root1=(-b+Math.sqrt(D))/2*a;
            root2=(-b-Math.sqrt(D))/2*a;
            System.out.println("The root1 is " + root1);
            System.out.println("The root2 is " + root2);
        }
        else if(D<0){
            System.out.println("The roots are imaginary");
        }

        }
    }

