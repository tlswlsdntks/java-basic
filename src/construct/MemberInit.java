package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //기본 생성자

    //함수
    void initMember(String name, int age, int grade) {
        //this.name → 멤버변수
        //name → 매개변수
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
