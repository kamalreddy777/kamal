import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        int length,breadth,height,volume,area;
        System.out.println("enter the values of length ,breadth,height");
        Scanner sc = new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        volume=length*breadth*height;
        area= 2*(length*breadth+breadth*height+height*length);
        System.out.println("VOLUME OF CUBOOID IS" + volume);
        System.out.println("AREA OF CUBOID IS " + area);
    }
}
