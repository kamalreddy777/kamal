public class shift {
    public static void main(String[] args) {
        int a=-4,x;
        //left shift
       x= a<<3;
        System.out.println(x);
        //right shift
        x=a>>2;
        System.out.println(x);
        //unsigned right shift
        x=a>>>2;
        System.out.println(x);
        //not
        x=~a;
        System.out.println(x);
        //bit merging
        int c=2,b=4;
        c=c|b;
        System.out.println(c);
        //bit masking
        int d=5,e=1;
        d=d&e;
        System.out.println(d);
        /*swaping numbers using bit operations
          condition : q>p,then only possible
         */
        int p=3,q=5;
        //step 1
        p=p^q;
        //step 2
        q=p^q;
        //step 3
        p=p^q;
     System.out.println("the value of p is" + p);
     System.out.println("the value of q is" + q);
     //storing two values in a varible
     byte y=9,z=12,g;
     g=(byte)(y<<4);
     g=(byte) (g|z);
     System.out.println((g&0b11110000)>>4);//left value
     System.out.println((g&0b00001111));//right value




    }
}
