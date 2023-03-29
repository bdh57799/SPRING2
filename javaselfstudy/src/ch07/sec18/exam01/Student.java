package ch07.sec18.exam01;

public class Student extends Person {
    //필드 선언
    public int studentNO;

    public Student(String name, int studentNO) {
        super(name); //name이라는 변수는 부모 클래스에서 상속받아서 사용하겠다.
        this.studentNO =studentNO; //studentNO는 여기서 입력받는 값으로 사용하겠다.
    }

    //메소드 선언
    public void study() {
        System.out.println("공부를 합니다.");
    }

}
