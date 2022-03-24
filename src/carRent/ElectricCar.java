package carRent;

public  class ElectricCar extends ACar{
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNr, String make, String model, int amountOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNr, make, model, amountOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

    }

    // returns the battery capacity in kilowatt hours
    public int getBatteryCapacityKWh(){

    return batteryCapacity;
    }

    // returns the maximum range in kilometres
    public int getMaxRangeKm(){

        return maxRange;
    }

    // returns the power consumption in watt hours per driven kilometre.
    public int getWhPrKm(){

        return (batteryCapacity / maxRange)*1000;

    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int kmPrWh = 100/(getWhPrKm() / 91);

        if(kmPrWh >= 21){
            registrationFee=330;

        } else if(kmPrWh>=15 && kmPrWh <=20){
            registrationFee =1050;

        } else if(kmPrWh>=10 && kmPrWh <=14){
            registrationFee = 2340;

        } else if(kmPrWh>=5 && kmPrWh <=9){
            registrationFee = 5500;

        }else {
            registrationFee = 10470;
        }

        return registrationFee;

    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getNumbersOfDoors() {
        return super.getNumbersOfDoors();
    }


    @Override
    public String toString() {
        return "ElectricCar{" +
                "registrationNr='" + registrationNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", amountOfDoors=" + amountOfDoors +
                ", batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                '}';
    }
}
