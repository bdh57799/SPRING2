package exam01;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Calulator 객체의 areaCircle() 실행");
        return Math.PI* r * r;
    }
}
