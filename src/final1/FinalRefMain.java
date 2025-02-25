package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        //참조 대상은 변경 불가능
        final Data data = new Data();
        //data = new Data(); //cannot assign a value to final variable data

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
