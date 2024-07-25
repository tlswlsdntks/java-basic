package static2;

public class ValueDataMain {
    //정적 메서드는 정적 메서드만 호출 가능
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종숫자 = " + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++; //default
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}

class ValueData {
    int value;
}