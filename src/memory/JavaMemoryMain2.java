package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); //new Data(10) → heap 영역 → 가비지 컬렉션 대상
        method2(data1);
        System.out.println("method1 end");
    }
    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.getValue() = " + data2.getValue());
        System.out.println("method2 end");
    }
}
