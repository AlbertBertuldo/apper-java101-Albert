package Flight;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight();
//        System.out.println("Hello");
        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();

        manilaToBoracay.addPassengers();

        manilaToBoracay.setNumberofSeats(20);
//        System.out.println(manilaToBoracay.seats);

        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();

        System.out.println("Current # of available seats: " + manilaToBoracay.seats);
        System.out.println("Current # of available seats: " + manilaToBoracay.passengers);
    }
}
