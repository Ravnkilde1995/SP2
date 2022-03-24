package carRent;

public interface Car {
    // the number on the number plate
    String getRegistrationsNumber();



    //make of the car e.g. Audi
    String getMake();


    // The model of the car e.g. A6
    String getModel();


    //number of doors
    int getNumbersOfDoors();

    //Caluclate the registrations fee for the car
    int getRegistrationFee();

}
