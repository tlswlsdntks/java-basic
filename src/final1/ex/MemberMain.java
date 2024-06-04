package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2", "seo"); //ID 변경 불가능 → 컴파일 에러
        member.print();
    }
}
