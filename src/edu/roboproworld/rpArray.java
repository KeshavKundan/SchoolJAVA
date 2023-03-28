package edu.roboproworld;

public class rpArray {
    public static final String gnull = null;

    public int[] growSize(int arr[], int n) {
        if (n > arr.length) {
            int t[] = new int[n];
            for (int i = 0; i < arr.length; i++)
                t[i] = arr[i];
            return t;
        }
        return arr;
    }
}