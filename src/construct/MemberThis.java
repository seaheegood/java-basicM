package construct;

public class MemberThis {
    String nameField;

    // this 생략 가능
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }

    // 멤버 변수 앞에 항상 this 를 적어주는 코딩 스타일도 있다.
    // 하지만 최근에는 IDE 가 많이 발전하면서 멤버 변수와 지역 변수(매개변수)를 색상으로 구분해준다.
}
