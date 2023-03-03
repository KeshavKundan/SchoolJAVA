package edu.roboproworld;

import java.util.Scanner;

public class rpSystem {
    public String input(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.next();
        }
    }

    public char inputC(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.next().charAt(0);
        }
    }

    public String inputLine(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextLine();
        }
    }

    public byte inputB(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextByte();
        }
    }

    public short inputS(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextShort();
        }
    }

    public int inputI(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextInt();
        }
    }

    public long inputL(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextLong();
        }
    }

    public float inputF(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextFloat();
        }
    }

    public double inputD(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextDouble();
        }
    }

    public boolean inputBool(String x) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(x);
            return sc.nextBoolean();
        }
    }
}
