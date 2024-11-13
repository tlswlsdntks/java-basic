package static2;

//import static
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); //staticValue = 1

        System.out.println("2. 인스턴스 호출1");
        DecoData decoData = new DecoData();
        decoData.instanceCall(); //instanceValue = 1, staticValue = 2

        System.out.println("3. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall(); //instanceValue = 1, staticValue = 3
        DecoData.staticCall(decoData2); //instanceValue = 2
        staticCall(); //staticValue = 4
        staticCall(); //staticValue = 5
        staticCall(); //staticValue = 6
    }
}
