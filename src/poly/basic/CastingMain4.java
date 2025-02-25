package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        //다운 캐스팅을 자동으로 하지 않는 이유
        Parent parent1 = new Child(); //인스턴스에 Parent/Child가 존재
        Child child1 = (Child) parent1;
        child1.childMethod(); //이상 없음

        Parent parent2 = new Parent(); //인스턴스에 Child가 존재하지 않음
        Child child2 = (Child) parent2; //RuntimeException: Exception in thread "main" java.lang.ClassCastException
        //실행 불가
        child2.childMethod(); //class poly.basic.Parent cannot be cast to class poly.basic.Child (poly.basic.Parent and poly.basic.Child are in unnamed module of loader 'app')

    }
}
