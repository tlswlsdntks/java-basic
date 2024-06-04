package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        //참조 대상은 변경 불가능
        final Data data = new Data();
        //data = new Data(); //cannot assign a value to final variable data

        //참조 대상의 값은 변경 가능
        /**
         * final이 붙으면 참조 대상 자체를 다른 대상으로 변경하지 못하는 것이지
         * 참조하는 대상의 값은 변경할 수 있다.
         */
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
