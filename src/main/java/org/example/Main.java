package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        int[] ab=input(2);
        System.out.println(summ( ab[0], ab[1]));
        System.out.println(printSumm( ab[0], ab[1]));
        System.out.println(greaterThan(ab[0]));
    }
    public static int[] input(int amount){
        boolean ok=false;
        int ab[]=new int[amount];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<ab.length;i++){
            System.out.print("Enter a valid Integer value : ");
            if(scan.hasNextInt()){
                ab[i] = scan.nextInt();
            }else{
                scan.nextLine();
                System.out.println("Enter a valid Integer value");
            }
            if(i==(ab.length-1)){
                ok=true;
            }
        }
        return ab;
    }

    public static boolean greaterThan(int a){
        return a>100;
    }
    public static int summ(int a, int b){
        return a+b;
    }

    public static String printSumm(int a, int b){
        System.out.println("Summ: "+(a+b));
        return ""+(a+b);
    }

}
