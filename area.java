import java.util.Scanner;
import java.lang.*;

public class area {
    public static void main(String[] args) {
        float base,height,a,b,c,s;
        double area;
        System.out.println("Enter the values of base,height : ");
        Scanner sc= new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=(base*height)/2;
        System.out.println("The area of a triangle is " + area );
/* Area of triangle using herons formula
     s=(a+b+c)/2
     Area=math.sqrt(s*(s-a)*(s-b)*(s-c))
 */
        System.out.println("Area using heron's formula");
        System.out.println("Enter the values of a,b,c : ");
        a= sc.nextFloat();
        b=sc.nextFloat();
        c= sc.nextFloat();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is " + area);
    }
}
