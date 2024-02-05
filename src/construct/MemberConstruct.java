package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age){
//        System.out.println("hello!");

        // this()는 생성자 코드의 첫줄에만 작성할 수 있다.
        this(name, age, 50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age +",grade=" + grade);
        this.name = name;
        this. age = age;
        this. grade = grade;
    }
}
