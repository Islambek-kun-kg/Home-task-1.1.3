package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double min = 0;
        int min_i = 0;
        double temp = 0;
        int i;
        int l = 0;
        double j = 0;
        double d = 0;
        double[] arr = new double[15];
        for (i = 0; i < arr.length; i++) {
            arr[i] = rand();
        }
        System.out.println(Arrays.toString(arr));
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                break;
            }
        }
        for (l = i; l < arr.length; l++) {
            if (arr[l] < 0) {
                continue;
            }
            j += arr[l];
            d++;
        }
        System.out.println(j / d);
        System.out.println("--------------------------------");
        for (i = 0; i < arr.length; i++) {
            min = arr[i];
            min_i = i;
            for (l = i + 1; l < arr.length; l++) {
                if (arr[l] < min) {
                    min = arr[l];
                    min_i = l;
                }
            }
            if (i != min_i) {
                temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static double rand() {
        Random rand = new Random();
        double a = Math.random() * 30 - 10;
        a = Math.floor(a);
        return a;
    }
}
