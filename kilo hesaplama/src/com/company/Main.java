package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kilo degerini giriniz: ");
        double kilo = scan.nextDouble();
        System.out.println("boy degerini giriniz: ");
        double boy = scan.nextDouble();
        double vucutkutleindeksi= kilo / ((boy/100)*(boy/100));

        if(vucutkutleindeksi<=15)
        {
            System.out.println("cok ciddi derecede düsük kilolu");
        }
        else if(vucutkutleindeksi<=16 && vucutkutleindeksi>15)
        {
            System.out.println("ciddi derecede düsük kilolu");
        }
        else if(vucutkutleindeksi<=18.5 && vucutkutleindeksi>16)
        {
            System.out.println("düsük kilolu");
        }
        else if(vucutkutleindeksi>18.5 && vucutkutleindeksi<=25)
        {
            System.out.println("normal kilolu");
        }
        else if(vucutkutleindeksi>25 && vucutkutleindeksi<=30)
        {
            System.out.println("fazla kilolu");
        }
        else if(vucutkutleindeksi>30 && vucutkutleindeksi<=35)
        {
            System.out.println("hafif obez");
        }
        else if(vucutkutleindeksi>35 && vucutkutleindeksi<=40)
        {
            System.out.println("ciddi obez");
        }
        else if(vucutkutleindeksi>40)
        {
            System.out.println("cok ciddi obez");
        }


    }
}
