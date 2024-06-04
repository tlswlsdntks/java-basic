package construct;

public class MemberDefault {
    String name;

    //생성자가 하나라도 없는 경우 → 자동 기본 생성자 생성
    public MemberDefault() {
        System.out.println("기본 생성자");
    }
}
