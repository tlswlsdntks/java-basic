package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); //생성자 호출
        MemberConstruct member2 = new MemberConstruct("user2", 16); //생성자 오버로딩

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}
