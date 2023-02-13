package ex03;

class Hello {
    static String name = "헬로우";
}

public class MemEx01 {

    static int num = 10; // static
    String name = "홍길동"; // heap
    
    public void gogo() {
        int value = 50; // 지역 변수
    }

    public static void main(String[] args) {
        int sum = 20;
        System.out.println(num);
        System.out.println(Hello.name);
        MemEx01 memEx01 = new MemEx01();  // static이 아닌 모든 것들이 heap에 뜬다.
        System.out.println(memEx01.name);
    }
}
