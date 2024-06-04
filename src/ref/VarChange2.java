package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //같은 참조값(주소)

        System.out.println("dataA 참조값 = " + dataA); //ref.Data@2f4d3709
        System.out.println("dataB 참조값 = " + dataB); //ref.Data@2f4d3709
        System.out.println("dataA.value = " + dataA.value); //10
        System.out.println("dataB.value = " + dataB.value); //10

        dataA.value = 20;
        System.out.println("dataA.value = " + dataA.value); //20
        System.out.println("dataB.value = " + dataB.value); //20

        dataB.value = 30;
        System.out.println("dataA.value = " + dataA.value); //30
        System.out.println("dataB.value = " + dataB.value); //30
    }
}
