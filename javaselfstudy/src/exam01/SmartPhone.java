package exam01;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color){
        super(model,color);
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    } // 외부에서 받아서 다양한 값으로 저장되게하기 위해서 생성자에 매개변수 추가
}
