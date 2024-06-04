package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        //nameField → this.생략
        nameField = nameParameter;
    }
}
