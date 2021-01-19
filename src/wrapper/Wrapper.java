package wrapper;

import org.w3c.dom.ls.LSOutput;

public class Wrapper {
    public static void main(String[] args) {
        int x = 10;
        Integer y = new Integer(10);

        int z = x + y;

        int a = Integer.valueOf("10");
        int b = Integer.parseInt("10");
        float c = Long.valueOf("10");
//    Boolean.valueOf("true");

        Integer k = 10; // (boxing) chuyen tu tham tri thanh tham chieu;
        int e = new Integer(10);

        int h = 10;
        int f = 10;
        Integer g = 10;

        System.out.println(h == f);
        System.out.println(f == g);


        // ko the so sanh Obj la tham chieu;
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        int x3 = 10;

        System.out.println(x1 == x2);
        System.out.println(x1 == x3);

        System.out.println(x1.equals(x2));// day la cach de so sanh Obj tham chieu;

    }
}
// Autoboxing(unboxing) chuyen tu tham chieu sang tham tri;

// 3 cach de chuyen doi kieu du lieu (autoboxing);