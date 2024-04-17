package com.example.demo.moduls;

/**
 * @author mahaiyang
 * @date 2024/4/16 15:14
 */
public class Main {
    public static void main(String[] args) {
        String str = "  你,              好!  ";
        System.out.println(str.replaceAll("\\s+", ""));
    }
}
