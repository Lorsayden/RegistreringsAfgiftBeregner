public class DieselCar extends AFuelCar {

    private boolean particleFilter;
    private int kmPrLitre;
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.kmPrLitre = kmPrLitre;
        this.particleFilter = particleFilter;
    }


    public boolean hasParticleFilter(){
        return particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        if(!particleFilter){
            registrationFee = 1000;
        }
        if(kmPrLitre > 20 && kmPrLitre < 50){
            return registrationFee += 130;
        }else if (kmPrLitre > 15 && kmPrLitre <= 20){
            return registrationFee += 1390;
        }else if (kmPrLitre > 10 && kmPrLitre <= 15){
            return registrationFee += 1850;
        }else if (kmPrLitre > 5 && kmPrLitre <= 10){
            return registrationFee += 2770;
        }else if (kmPrLitre > 0 && kmPrLitre <= 5){
            return registrationFee += 15260;
        }
        return registrationFee;
    }

    @Override
    public String getFuelType(){
        return "Diesel";
    }

    @Override
    public String toString(){
        return super.toString();
    }
    //-----------Interface Methods-----------

    @Override
    public String getRegistrationNumber(){
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