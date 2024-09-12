package org.example;

import java.util.Scanner;

import static java.lang.Math.*;

public class App
{
    public static void main( String[] args )
    {

        int a, b, c, d;

        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt())
        {
            a = scan.nextInt();
            if (a < 1 || a > 12)
            {
                System.out.println("ERROR");
            }
        }
        else
        {
            System.out.println("ERROR");
            return;
        }
        if(scan.hasNextInt())
        {
            b = scan.nextInt();
            if (b < 1 || b > 12)
            {
                System.out.println("ERROR");
            }
        }
        else
        {
            System.out.println("ERROR");
            return;
        }

        if(scan.hasNextInt())
        {
            c = scan.nextInt();
            if (c < 1 || c > 12)
            {
                System.out.println("ERROR");
            }
        }
        else
        {
            System.out.println("ERROR");
            return;
        }
        if(scan.hasNextInt())
        {
            d = scan.nextInt();
            if (d < 1 || d > 12)
            {
                System.out.println("ERROR");
            }
        }
        else
        {
            System.out.println("ERROR");
            return;
        }

        int p1 = max(a,b);
        int p2 = min(a,b);

        int p3 = max(c,d);
        int p4 = min(c,d);

        if (((p1 == p3 || p1 == p4) && (p2 == p3 || p2 == p4)) ||
                ((p1 == p3 || p1 == p4 || p2 == p3 || p2 == p4)) ||
                (p4 > p2 && p4 < p1) && (p3 > p1) ||
                ((p3>p2 && p3<p1 && p4<p2) || (p3>p2 && p3<p1 && p4>p2) || ((p1==p3) || (p1==p4) || (p2==p3) || (p2==p4))))

        {
            System.out.println("CROSS");
        }
        else
        {
            System.out.println("NO_CROSS");
        }
    }
}
