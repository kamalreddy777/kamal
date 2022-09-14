public class incdec {
    public static void main(String[] args) {
        //example 1
        int i=11;
        int j=--i+ ++i - i--;
        System.out.println(j);//10
        // example 2
        int x=4,y=4,z;
        z=++x + --y - x++ + y-- + x -y + --y;//11
        System.out.println(z);
        //example 3
        float p=2.2f,q=1.2f,r;
        r=++p- --q+ q++ + --p + q--;
        System.out.println(r);
        //ex4
        char c='A',d;
        d=++c;
        System.out.println(d);
        //boolean donot support inc/dec operators

    }
}
