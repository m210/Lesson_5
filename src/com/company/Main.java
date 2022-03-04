package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = { 1.57, 7.654, 9.986 };

        short[] arr3 = new short[] { 3333, 5555, 9999, 10000, 20000 };

        int i = 0;
        while(i < arr1.length) {
            System.out.print(arr1[i]);
            if(++i != arr1.length)
                System.out.print(", ");
        }
        System.out.println();

        i = 0;
        while(i < arr2.length) {
            System.out.print(arr2[i]);
            if(++i != arr2.length)
                System.out.print(", ");
        }
        System.out.println();

        i = 0;
        while(i < arr3.length) {
            System.out.print(arr3[i]);
            if(++i != arr3.length)
                System.out.print(", ");
        }
        System.out.println();


        i = arr1.length - 1;
        while(i >= 0) {
            System.out.print(arr1[i]);
            if(i-- != 0)
                System.out.print(", ");
        }
        System.out.println();

        i = arr2.length - 1;
        while(i >= 0) {
            System.out.print(arr2[i]);
            if(i-- != 0)
                System.out.print(", ");
        }
        System.out.println();

        i = arr3.length - 1;
        while(i >= 0) {
            System.out.print(arr3[i]);
            if(i-- != 0)
                System.out.print(", ");
        }
        System.out.println();


        i = 0;
        while(i < arr1.length) {
            if((arr1[i] % 2) != 0)
                arr1[i]++;
            System.out.print(arr1[i]);
            if(++i != arr1.length)
                System.out.print(", ");
        }
        System.out.println();
    }

}
