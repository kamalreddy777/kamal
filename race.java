import java.util.Scanner;

public class race {
    public static void main(String[] args) {
        int s1,s2,s3,s4,s5,average,count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the values");
        s1=s.nextInt();
        s2=s.nextInt();
        s3=s.nextInt();
        s4=s.nextInt();
        s5=s.nextInt();
        average=(s1+s2+s3+s4+s5)/5;
        if (s1>average){
            System.out.println("speed is " + s1);
            count++;
        }
        if (s2>average){
            System.out.println("speed is "+ s2);
            count++;
        }
        if (s3>average){
            System.out.println("speed is" + s3);
            count++;
        }
        if (s4>average){
            System.out.println("speed is "+ s4);
            count++;
        }
        if (s5>average){
            System.out.println("speed is" + s5);
            count++;
        }
        if (count==0){
            System.out.println("no racer qualified");
        }


    }
}
