package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // Student 타입을 받을 수 있는 변수를 선언
        student1 = new Student(); // Student 인스턴스 생성
        // 객체를 사용하려면 먼저 설계도인 클래스를 기반으로 객체(인스턴스)를 생성해야한다.
        // new Student() 의 결과로 참조값이 반환된다.
        // 이 실제 객체에 접근하기 위해서 참조값을 필요로한다. Student student1 면수에 참조값을 저장해두어 실제 메모리에 존재하는 객체 접근이 가능하다.

        student1.name = "학생1"; // student1 변수가 가지고 있는 참조값을 통해 .(dot) 사용하여 객체에 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); //@30f39991 참조값
        System.out.println(student2); //@452b3a41

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }

    /**
     * 타입 = 데이터의 종류나 형태
     * 클래스 = 사용자가 직접 정의하는 사용자 정의 타입을 만드는 설계도.
     * 설계도인 클래스를 통해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스 라고 한다.
     * 클래스를 통해서 사용자가 원하 종류의 데이터 타입을 마음껏 정의가 가능하다.
     */

    /**
     * 객체 vs 인스턴스
     * student1은 Student 의 인스턴스이다. -> 특정 클래스와의 관계를 명확히 할 때
     * 모든 인스턴스는 객체이지만, 우리가 인스턴스라고 부르는 순간은 특정 클래스로부터 그 객체가 생성되었음을 강조하고 싶을 때 사용한다.
     */
}
