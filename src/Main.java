import carRent.*;

public class Main {


    public static void main(String[] args) {
         FleetOfCar fleetOfCar = new FleetOfCar();

        DieselCar dieselCar1 = new DieselCar("AI42067", "Audi", "R8", 4, 10, false);
        ElectricCar electricCar1 = new ElectricCar("AB42867", "Tesla", "X", 4, 200, 100);
        GasolineCar gasolinecar1 = new GasolineCar("VO42067", "Volvo", "V10", 4, 16);

        fleetOfCar.addCar(dieselCar1);
        fleetOfCar.addCar(electricCar1);
        fleetOfCar.addCar(gasolinecar1);

        for (Car f : fleetOfCar.getFleet()) {
            System.out.println(f);
        }
        System.out.println("Total registration fee: "+fleetOfCar.getTotalRegistrationFeeForFleet());
    }
}
