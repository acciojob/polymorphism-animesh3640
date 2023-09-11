package com.driver;

public class Main {
    public static void main(str[] args){
        Product p = new Product();
        int ans = p.product(10,20);
        int ans2 = p.product(10,20,30);
        double ans3 = p.product(10,20);
    }
    public class Product{
        public static int product(int x, int y) {
            return x*y;
        }
        public static int product(int x, int y, int z) {
            return x*y*z;
        }
        public static double product(double x, double y) {
            return x*y;
        }
    }
}