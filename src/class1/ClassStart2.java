package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrade[i]);
        }
    }

    /**
     * 지금처럼 학생의 이름, 나이, 성적을 각각 나누어서 관리하면 문제점이 많다.
     * 데이터를 신중이 관리해야하고 인덱스가 달라지면 에러가 나오는 등 문제점이 정말 많음
     *
     * 이럴 때, 학생이라는 개념을 하나로 묶어서 -> 각 학생 별로 그 학생의 이름, 나이, 성적 등의 필드를 관리할 수 있도록 고안된게 Class 이다.
     */
}
