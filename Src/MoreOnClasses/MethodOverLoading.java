package MoreOnClasses;

public class MethodOverLoading {
    class A {
        public void doSomething() {
            System.out.println("A");
        }
        public void doSomething(String str){
            System.out.println(str);
        }
    }
    static class B {
        public static void main(String[] args) {
        }
    }

}

