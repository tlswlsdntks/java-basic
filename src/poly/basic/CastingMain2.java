package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조
        System.out.println("Parent → Child");
        //부모는 자식을 담을 수 있다.
        //단, 자식의 기능은 호출할 수 없다.
        Parent poly = new Child();
//        poly.childMethod(); //cannot find symbol

        //일시적 다운 캐스팅: 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
