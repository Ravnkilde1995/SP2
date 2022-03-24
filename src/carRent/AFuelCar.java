package carRent;

public abstract class AFuelCar extends ACar {

    int kmPerLitre;

    public AFuelCar(String registrationNr, String make, String model, int amountOfDoors, int kmPerLitre) {
        super(registrationNr, make, model, amountOfDoors);
        this.kmPerLitre=kmPerLitre;

    }

    //should return "Gasoline" or "Diesel"
    abstract String getFuelType();


    //should return how many kilometres the car can drive on 1 litre of fuel
    int kmPrLitre(){

        return kmPerLitre;
    }

}
