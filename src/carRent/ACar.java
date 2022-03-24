package carRent;

abstract class ACar implements Car{
    String registrationNr;
    String make;
    String model;
    int amountOfDoors;

    public ACar(String registrationNr, String make, String model, int amountOfDoors) {
        this.registrationNr = registrationNr;
        this.make = make;
        this.model = model;
        this.amountOfDoors = amountOfDoors;
    }

    @Override
    public String getRegistrationsNumber() {
        return registrationNr;
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumbersOfDoors() {
        return 0;
    }

    @Override
    public String toString() {
        return "ACar{" +
                "registrationNr='" + registrationNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", amountOfDoors=" + amountOfDoors +
                '}';
    }
}
