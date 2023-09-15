package com.jukarpenz.cert.prep.ocpjs17d.c7;

public class NestedClasses {

}

class Home {

    private String greeting = "Hi";

    sealed interface SeaView {
        void showSea();
    }

    //    abstract protected non-sealed class Room implements SeaView{
    protected non-sealed class Room implements SeaView {

        public void showSea() {
            System.out.println("Showing the sea");
        }

        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++)
                greet(greeting);
        }

        private static void greet(String g) {
            System.out.println(g);
        }
    }

    public void enterRoom() {
        var room = new Room();
        room.enter();
    }

    public static void main(String[] args) {
        new Home().new Room().greet("Suuuuuuuu");
        var h = new Home();
//        h.enterRoom();
        h.new Room().enter();
        h.new Room().greet("Hola siiuuuuuuuuuuuuu");
    }
}

class A {
    private String id = "A";

    class D {
        public static void someIds() {

        }

        public void noIds() {
            new B();
        }
    }


    private class B {
        private String id = "B";

        class C {
            private String id = "C";


            void allIds() {
                System.out.println(id);
                System.out.println(this.id);//C
                System.out.println(B.this.id);//B
                System.out.println(A.B.this.id);//B
                System.out.println(B.C.this.id);//C
                System.out.println(A.this.id);//A
            }
        }
    }

    public static void main(String[] args) {
        A.B.C cc = new A().new B().new C();
//        c.allIds();
        A a = new A();
        A.B b = a.new B();
        B bb = a.new B();
        B.C bc = b.new C();
//        bc.allIds();
        A.B.C c = b.new C();
        c.allIds();
    }
}

class Fox {
    private class Den {
    }

    public static void visitFriend() {
        Den fd = new Fox().new Den();
    }

}

class Squirrel {
    public void visitFox() {
//        new Fox.Den();
    }
}


class Park {

    void clean() {
        class Cleaner {
        }


    }

    static class Ride {

        private int price = 4;
        int time = 40;
        String game;
    }

    public static void main(String[] args) {
        Ride r = new Ride();
        Park p = new Park();
        p.clean();
//        r.
    }

}

class PrintNumbers {

    private int length;

    public void calculate() {
        final int width;
        width = 20;
        class Calculator {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        length = 2;
        Calculator cal = new Calculator();
        cal.multiply();
    }

    public static void main(String[] args) {
        new PrintNumbers().calculate();
    }

}


//anonymouse class


class ZooGiftShop {

    interface ZooInt {
        void walk();
    }

    abstract class SaleTodayOnly {
        abstract int dollarsOff(int extraOff);
    }


    ZooInt zi = new ZooInt() {
        public void walk() {
            System.out.println("Zoo walking");
        }
    };
//  ZooInt zi = new ZooInt() {
//        @Override
//        public void walk() {
//
//        }
//    }

    public int admission(int basePrice, int extraOff) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff(int extraOff) {
                return extraOff + 3;
            }
        };

        return basePrice - sale.dollarsOff(extraOff);
    }

    public static void main(String[] args) {
        ZooGiftShop z = new ZooGiftShop();
        z.zi.walk();
        System.out.println(z.admission(19, 2));
    }

}

class ResumenClasses{

    protected abstract class InnerClass{

    }

    int x;

    void nothing(int a){
        x=4;
        x=6;
//        a=3;
        class StaticNested{
//            int y = x;
        }
        interface LocalInterface {}

        class LocalClass extends StaticNested implements LocalInterface{
            int y = x+a;
        }


        StaticNested sn = new LocalClass();
        LocalInterface li = new LocalClass();

//        a=3;
        x=6;

    }

     static class StaticClass{}

}