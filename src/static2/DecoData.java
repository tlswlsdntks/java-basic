package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; //인스턴스 변수 접근 → Non-static field 'instanceValue' cannot be referenced from a static context
//        instanceMethod(); //인스턴스 메서드 접근 → Non-static method 'instanceMethod()' cannot be referenced from a static context
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
