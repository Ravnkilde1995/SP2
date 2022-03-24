package carRent;

import java.util.ArrayList;

public class FleetOfCar {
    ArrayList<Car> fleet = new ArrayList<>();


    public void addCar(Car car){
        fleet.add(car);
    }

    public ArrayList<Car> getFleet() {
        return fleet;
    }

    public int getTotalRegistrationFeeForFleet(){
        int TotalRegistrationFee = 0;
        for (Car f : fleet) {
            TotalRegistrationFee+=f.getRegistrationFee();
        }

        return TotalRegistrationFee;
    }

    @Override
    public String toString() {
        return "FleetOfCar{" +
                "fleet=" + fleet +
                '}';
    }
}
