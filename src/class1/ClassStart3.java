package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;           // student 타입을 받을 수 있는 변수 선언
        student1 = new Student();   // student 객체(인스턴스) 생성
        student1.name = "학생1";     // Student 클래스는 String name, int age, int grade 멤버 변수가 있고, 메모리를 확보
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

    }
}
