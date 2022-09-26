/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class kpkfpb {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");
        System.out.println(" *Masukkan bilangan bulat pertama* ");
        System.out.println(" ********************************* ");

        int a = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan bilangan bulat kedua* ");
        System.out.println(" ******************************* ");

        int b = sc.nextInt();

        System.out.println(" ************************* ");
        System.out.println(" *KPK dari " + a + " dan " + b + " adalah* ");
        System.out.println(" ************************* ");

        int c = 0;

        for (int x = 1; x <= b; x++) {

            c = (c + a);

            if (c % b == 0) {

                System.out.println(c);

                break;

            }
        }

        System.out.println(" ************************* ");
        System.out.println(" *FPB dari " + a + " dan " + b + " adalah* ");
        System.out.println(" ************************* ");

        int d;

        d = a % b;

        while (d != 0) {

            a = b;

            b = d;

            d = a % b;
        }

        System.out.println(b);

    }

}
