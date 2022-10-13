package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        nama:Hanny maulana putri
//        NIM : 21000184
//        KELAS : J
        int jumlahData;
        Scanner scan=new Scanner(System.in);
        int z =0;
        do {
            System.out.print("=");
            z++;
        }
        while(z <=42);

        System.out.println("\n+       program data dealer mobil       +");
        System.out.println("===========================================");
        System.out.print("banyaknya mobil yang ada : ");
        jumlahData=scan.nextInt();

        String data[][]=new String[jumlahData][3];
        System.out.println("program data dealer mobil :");
        for (int a=0;a<jumlahData;a++)
        {
            System.out.println("");
            System.out.println("data mobil ke-"+(a+1));
            for (int b=0;b<3;b++)
            {
                if (b==0)
                {
                    System.out.print("merk mobil : ");
                }
                else if(b==1)
                {
                    System.out.print("tipe mobil : ");
                }
                else
                {
                    System.out.print("warna mobil : ");
                }
                data[a][b]=scan.next();
            }
        }


        System.out.println("----------------------");
        System.out.println("\nprogram data dealer mobil ");
        System.out.println("----------------------");
        System.out.println("merk \t\t tipe \t\t warna \t");

        for(int a=0;a<jumlahData;a++)
        {
            for (int b=0; b<3;b++)
            {
                System.out.print(data[a][b]+"\t\t");
            }
            System.out.println();
        }
    }
}
