package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); //생성자 호출
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
//        MemberConstruct member2 = new MemberConstruct(); //no suitable constructor found for MemberConstruct(no arguments)

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}
