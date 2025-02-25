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
        System.out.println("fieldInit1.value = " + fieldInit1.value); //heap 영역(10)
        System.out.println("fieldInit2.value = " + fieldInit2.value); //heap 영역(10)

        /**
         * 메모리 낭비를 줄일 수 있다.
         */
        //상수
        System.out.println("상수");
        System.out.println("FieldInit.CONST_VALUE = " + FieldInit.CONST_VALUE); //method 영역(10)

        System.out.println("Constant.PI = " + Constant.PI);
        System.out.println("Constant.HOURS_IN_DAY = " + Constant.HOURS_IN_DAY);
        System.out.println("Constant.MINUTES_IN_HOUR = " + Constant.MINUTES_IN_HOUR);
        System.out.println("Constant.SECONDS_IN_MINUTE = " + Constant.SECONDS_IN_MINUTE);
        System.out.println("Constant.MAX_USERS = " + Constant.MAX_USERS);

    }

}
