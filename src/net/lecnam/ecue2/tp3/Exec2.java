package net.lecnam.ecue2.tp3;

public class Exec2 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 6, 7, 8);

        Point p = new Point(5, 6);
        Rectangle r2 = new Rectangle(p, 7, 8);

        System.out.println(r1.retourneSurface());
        System.out.println(r2.retourneSurface());

        r2.translate(3, 2);

    }

}
