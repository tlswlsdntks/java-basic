package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 오버로딩
    public MemberConstruct(String name, int age) {
        //다른 생성자 호출 → this()
        //생성자 코드의 첫줄에만 작성이 가능하다.
        //System.out.println("다른 생성자 호출"); //call to this must be first statement in constructor
        this(name, age, 50);
    }

    //생성자 호출
    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출, name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
