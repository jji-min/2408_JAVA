package oop.exextends;

public class ExConstruct {
    public static void main(String[] args) {
        Whale2 whale2 = new Whale2();
        whale2.print();
    }
}

class Animal {
//    public Animal() {}
    public Animal(int a) {
        System.out.println("Animal");
    }
}

class Mammal2 extends Animal {
    protected String name = "Mammal";

    public Mammal2() {
        // super();
        super(1);
        System.out.println("Mammal2");
    }
}

class Whale2 extends Mammal2 {
    protected String name = "Whale2";

    public Whale2() {
        // super(); 가 생략되어 있다.
        System.out.println("Whale2");
    }

    public void print() {
        String name = "print";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}