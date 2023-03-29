package ch08.sec02.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {

        RemoteControl rc = new Television(); // rc 인터페이스를 통해서 텔레비전을 사용하겠다.

        rc.turnOn();

        rc = new Audio();

        rc.turnOn();

    }
}
