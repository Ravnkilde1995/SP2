package carRent;

public class DieselCar extends AFuelCar{
    boolean particleFilter;

    public DieselCar(String registrationNr, String make, String model, int amountOfDoors, int kmPerLitre, boolean particleFilter) {
        super(registrationNr, make, model, amountOfDoors, kmPerLitre);
        this.particleFilter = particleFilter;
    }

    boolean hasParticleFilter(){
        return particleFilter;
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int particleCost = 1000;

        if(kmPerLitre >= 21){
            registrationFee=130;
        } else if(kmPerLitre>=15 && kmPerLitre <=20){
            registrationFee =1390;
        } else if(kmPerLitre>=10 && kmPerLitre <=14){
            registrationFee = 1850;
        } else if(kmPerLitre>=5 && kmPerLitre <=9){
            registrationFee = 2770;
        }else {
            registrationFee = 15260;
        }
        if(!particleFilter){
            registrationFee += particleCost;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "registrationNr='" + registrationNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", amountOfDoors=" + amountOfDoors +
                ", kmPerLitre=" + kmPerLitre +
                ", particleFilter=" + particleFilter +
                '}';
    }
}

