package carRent;

public class GasolineCar extends AFuelCar{
    int registrationFee;


    public GasolineCar(String registrationNr, String make, String model, int amountOfDoors, int kmPerLitre) {
        super(registrationNr, make, model, amountOfDoors, kmPerLitre);
    }



    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;

        if(kmPerLitre >= 21){
            registrationFee=330;

        } else if(kmPerLitre>=15 && kmPerLitre <=20){
            registrationFee =1050;

        } else if(kmPerLitre>=10 && kmPerLitre <=14){
            registrationFee = 2340;

        } else if(kmPerLitre>=5 && kmPerLitre <=9){
            registrationFee = 5500;

        }else {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "registrationNr='" + registrationNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", amountOfDoors=" + amountOfDoors +
                ", kmPerLitre=" + kmPerLitre +
                ", registrationFee=" + registrationFee +
                '}';
    }
}
