package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); //참조값(주소)
        System.out.println("dataA = " + dataA); //ref.Data@2f4d3709
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value); //10
        changeReference(dataA);
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value); //20
    }

    public static void changeReference(Data dataX) { //같은 참조값(주소)
        System.out.println("dataX = " + dataX); //ref.Data@2f4d3709
        dataX.value = 20;
    }
}
