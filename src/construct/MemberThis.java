package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this.nameField = nameParameter; -> this를 생략할 수도 있지만 가시성을 위해 사용하는 경우도 있음
        nameField = nameParameter;
    }
}
