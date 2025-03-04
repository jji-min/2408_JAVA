package oop.pet;

public class Whale {
//    int age; // 같은 패키지에 소속된 클래스에서 접근 가능
//    public static String name; // 클래스 변수
    private int age; // 인스턴스 변수
    private String name; // 인스턴스 변수, instance가 사라지면 같이 사라짐

    public void swimming() { // return 할 것이 없으면 void, return 타입 반드시 작성
        String test = "test"; // 지역 변수
        System.out.println("Swimming");
    }
    // 생성자
    public Whale() {
        this(10);
    }
    public Whale(int age){
        this(age, "John");
//        this.age = age;
//        this.name = "Whale";
    }
    public Whale(int age, String name){
        this.age = age;
        this.name = name;
    }

    // ---------- 메소드 ----------
    public int mySum(int a) {
        return a + 1;
    }

    public int mySum(int a, int b) {
        return a + b;
    }

    public long mySum(long a, long b) {
        return a + b;
    }
}