package activities.activity1;

public class Activity1 {

    public static void main(String[] args) {
        // Creating object for car class

        Car honda = new Car(" Black "," Manual ", 2014);

        honda.displayCharacteristics();
        honda.accelerate();
        honda.brake();

    }

}
