package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }

    // initMember 메서드를 통해서 반복되는 부분을 제거
    // Member 객체의 맴버 변수를 사용한다.
    // 이러한 경우 속성과 기능을 한 곳에 두는 것이 더 나은 방법이다.
    // -> Member 가 자기 자신 데이터를 변경하는 기능(메서드)을 제공하는 것이 좋다.
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
