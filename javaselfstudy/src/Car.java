public class Car {
    //필드 선언

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed <0){
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) {
            this.speed = 0;
        }
    }

    private boolean stop;


}
