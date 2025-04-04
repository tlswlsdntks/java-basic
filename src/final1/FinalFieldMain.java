package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println("constructInit1.value = " + constructInit1.value);
        System.out.println("constructInit2.value = " + constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        System.out.println("fieldInit1.value = " + fieldInit1.value);
        System.out.println("fieldInit2.value = " + fieldInit2.value);

        /**
         * FieldInit 과 같이 final 필드를 필드에서 초기화 하는 경우, 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다.
         * 또 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자 입장에서 명확한 중복이다.
         * 이럴때 사용하면 좋은 것이 바로 static 이다.
         */
        //상수
        System.out.println("상수");
        System.out.println("FieldInit.CONST_VALUE = " + FieldInit.CONST_VALUE);

        System.out.println("Constant.PI = " + Constant.PI);
        System.out.println("Constant.HOURS_IN_DAY = " + Constant.HOURS_IN_DAY);
        System.out.println("Constant.MINUTES_IN_HOUR = " + Constant.MINUTES_IN_HOUR);
        System.out.println("Constant.SECONDS_IN_MINUTE = " + Constant.SECONDS_IN_MINUTE);
        System.out.println("Constant.MAX_USERS = " + Constant.MAX_USERS);

    }

}
