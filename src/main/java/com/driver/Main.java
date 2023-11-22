package com.driver;


public class Main {
    public static class A{
        public void meth(){
            System.out.println("Invoking method from class A");
        }
    }
    public static class B extends A{
        
        public String meth() {
            System.out.println("Method is overridden in Extendend class B");
        }
    }
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());

        B b1 = new B();
        System.out.println(b.meth());
    }
}
