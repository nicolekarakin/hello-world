package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        int[] ab=input(2);
        System.out.println(summ( ab[0], ab[1]));
        System.out.println(printSumm( ab[0], ab[1]));
        System.out.println(greaterThanX(ab[0],100));
    }
    public static int[] input(int amount){
        boolean ok=false;
        int ab[]=new int[amount];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<ab.length && !ok;ok=(i==ab.length)){
            System.out.print("Enter a valid Integer value : ");
            if(scan.hasNextInt()){
                ab[i] = scan.nextInt();
                i++;
            }else{
                scan.nextLine();
                System.out.println("Enter a valid Integer value");
            }

        }
        return ab;
    }

    public static boolean greaterThanX(int a, int x){
        return a>x;
    }
    public static int summ(int a, int b){
        return a+b;
    }

    public static String printSumm(int a, int b){
        System.out.println("Summ: "+(a+b));
        return ""+(a+b);
    }

}
