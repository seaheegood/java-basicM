package class1;

public class ClassStart4 {
    // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1; //x001
        students[1] = student2; //x002

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

//        students[0].name // 배열 접근 시작
//        x005[0].name     // [0]을 사용해서  x005 배열의 0번 요소에 접근
//        x001.name        // .(dot)을 사용해서 참조값으로 객체에 접근
//        "학생1"
    }
}
