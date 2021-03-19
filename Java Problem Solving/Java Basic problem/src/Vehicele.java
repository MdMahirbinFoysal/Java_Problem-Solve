class Mycar {
    String model;
    String enginepower;
    double speed;


    public Mycar(String model, String enginepower, double speed) {
        this.model = model;
        this.enginepower = enginepower;
        this.speed = speed;
    }


    void start() {
        speed = 10;
    }

    void accelaretor() {
        speed += 5;
    }

    void stop() {
        speed = 0;
    }

    void Display() {
        System.out.println(model + " " + enginepower + " " + speed);
    }



}


public class Vehicele {
    public static void main(String[] args){
        Mycar car = new Mycar("BMW7 ","400hp ",0.0f);
        car.Display();
        car.start();
        System.out.println(car.speed);
        car.accelaretor();
        System.out.println(car.speed);
//        car.stop();
//        System.out.println(car.speed);
        car.Display();

    }


}
