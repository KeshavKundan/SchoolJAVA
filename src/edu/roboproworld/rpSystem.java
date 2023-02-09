package edu.roboproworld;

import java.util.Scanner;

public class rpSystem {
    public void print(String x) {
        System.out.print(x);
    }
    public void print(Object obj) {
        System.out.print(obj);
    }
    public void print(Character c) {
        System.out.print(c);
    }
    public void print(Integer i) {
        System.out.print(i);
    }
    public void print(Long l) {
        System.out.print(l);
    }
    public void print(Float f) {
        System.out.print(f);
    }
    public void print(Double d) {
        System.out.print(d);
    }
    public void print(Boolean b) {
        System.out.print(b);
    }
    public void println(String x) {
        System.out.println(x);
    }
    public void println(Object obj) {
        System.out.println(obj);
    }
    public void println(Character c) {
        System.out.println(c);
    }
    public void println(Integer i) {
        System.out.println(i);
    }
    public void println(Long l) {
        System.out.println(l);
    }
    public void println(Float f) {
        System.out.println(f);
    }
    public void println(Double d) {
        System.out.println(d);
    }
    public void println(Boolean b) {
        System.out.println(b);
    }
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
    }public int letters(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i))) c++;
        return c;
    }
    public int upperCases(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i))) c++;
        return c;
    }
    public int lowerCases(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLowerCase(str.charAt(i))) c++;
        return c;
    }
    public int digits(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i))) c++;
        return c;
    }
    public int vowels(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i))) c++;
        return c;
    }
}
