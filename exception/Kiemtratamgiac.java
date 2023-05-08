package exception;

import java.util.Scanner;

public class Kiemtratamgiac {

    static void kiemTra(double a, double b, double c) {
        Scanner sc = new Scanner(System.in);

        try {
            if (a < 0) {
                throw new IllegalTriangleException("Nhap sai nhap lai");
            }
            if (b < 0) {
                throw new IllegalTriangleException("Nhap sai nhap lai");
            }
            if (c < 0) {
                throw new IllegalTriangleException("Nhap sai nhap lai");
            }
            if (a + b <= c || b + c <= a || c + a <= b) {
                throw new IllegalTriangleException("nhap sai nhap lai ");
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } catch (IllegalTriangleException e) {
            System.out.println("nhap vao canh a ");
            a = sc.nextDouble();
            System.out.println("Nhap vao  canh b ");
            b = sc.nextDouble();
            System.out.println("nhap vao canh c ");
            c = sc.nextDouble();
            kiemTra(a, b, c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("nhap vao canh a ");
        a = sc.nextDouble();
        System.out.println("Nhap vao  canh b ");
        b = sc.nextDouble();
        System.out.println("nhap vao canh c ");
        c = sc.nextDouble();
        kiemTra(a, b, c);

    }

}
