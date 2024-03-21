public class GasolinCar extends AFuelCar {

    private int kmPrLitre;
    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.kmPrLitre = kmPrLitre;
    }

    public int getRegistrationFee(){
        int registrationFee = 0;

        if(kmPrLitre > 20 && kmPrLitre < 50){
            registrationFee = 330;
        }else if (kmPrLitre > 15 && kmPrLitre <= 20){
            registrationFee = 1050;
        }else if (kmPrLitre > 10 && kmPrLitre <= 15){
            registrationFee = 2340;
        }else if (kmPrLitre > 5 && kmPrLitre <= 10){
            registrationFee = 5500;
        }else if (kmPrLitre > 0 && kmPrLitre <= 5){
            registrationFee = 10470;
        }
        return registrationFee;
    }

    @Override
    public String getFuelType(){
        return "Gasoline";
    }

    @Override
    public String toString(){
        return super.toString();
    }

    //-----------Interface Methods-----------
    @Override
    public String getRegistrationNumber() {
        return super.getRegistrationNumber();
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
    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }
}
