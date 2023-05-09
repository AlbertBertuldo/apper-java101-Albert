package Flight;

public class Flight {
    //Below are fields inside a class
    int seats;
    int passengers;


    //This is a constructor. This will be called upon creating an object
    Flight() {

        passengers = 0;
        seats = 10;

    }

    //TODO validate if there are available seats left. If not, display "FULL"
    public void addPassengers(){

        if (passengers < seats) {
            passengers++;
        } else {
            System.out.println("seat is FULL");
        }
    }

    //TODO set new value of seat sa addPassenger is allowed again
    public void setNumberofSeats(int a){
        this.seats = a;
    }
    public int getnewseats(){
        return seats - passengers;

    }


}
