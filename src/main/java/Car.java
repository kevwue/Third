public class Car {

    private int ps;
    private String color;



    public Car(int ps, String color) {
        this.ps = ps;
        this.color = color;
    }


    public void drive(int angle){
        int speed=0;
        if(angle<=20) {
            speed = ps / angle;
        }
        System.out.println(speed);
    }


    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
