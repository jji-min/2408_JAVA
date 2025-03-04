import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        변수
//        int age = 20;
//
//        age = 30;
//        char gender = 'M';
//        String name = "John";
//        boolean married = false;
//        float avgAge = 52.1f;
//        double avgAge2 = 52.1;
//
//        byte max = 127;
//        byte min = -128;
//
//        byte sum = (byte) (max + 1);
//        System.out.println(sum);
//
//        double a = 0.1;
//        double b = 0.2;
//        System.out.println(a + b);
//
//        BigDecimal bd = new BigDecimal("0.1");
//        BigDecimal bd2 = new BigDecimal("0.2");
//        BigDecimal bsum = bd.add(bd2);
//        System.out.println(bsum);

//        String a = new String("Hello World");
//        String b = new String("Hello World");
//        System.out.println(a.equals(b));

//        for(int i = 1; i <= 5; i++) {
//            if(i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }

//        1 ~ 100까지 숫자 중 3과 7의 배수만 출력
//        int cnt = 0;
//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0){
//                System.out.println(i);
//            } else if(i % 7 == 0){
//                System.out.println(i);
//            }

//            if(i % 3 == 0 || i % 7 == 0){
//                System.out.println(i);
//                cnt += 1;
//            }
//        }
//            System.out.println(cnt + "개");

//        배열
//        int[] arrInt = new int[10]; // 10은 배열의 길이
        // int만 넣을 수 있는 방이 10개
        int[] arrInt = {1, 2, 3, 4, 5}; // length가 5
        String[] arrString = {"a", "b", "c"};
        // 초기화할 때 값 넣으려면 중괄호 사용

        int[] arrInt2 = Arrays.copyOf(arrInt, arrInt.length); // (복사하고 싶은 배열, 복사하고 싶은 길이), arrInt.length는 5

        arrInt2[0] = 100;

        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrInt2));
    }
}