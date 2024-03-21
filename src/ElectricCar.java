public class ElectricCar extends ACar {

    private int batteryCapacityKWh;
    private int maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public int getBatteryCapacityKWh(){
        return this.batteryCapacityKWh;
    }

    public int getMaxRangeKm(){
        return this.maxRangeKm;
    }

    public int getWhPrKm(){
        return 1000 * this.batteryCapacityKWh / this.maxRangeKm;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        double kmPrLitre = 100*91.25/getWhPrKm();

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
    public String toString(){
        return super.toString() +  super.formatString(3)  + getWhPrKm() + " Wh/Km\n" + super.formatString(5) + getBatteryCapacityKWh() + " kWh\n" + super.formatString(6) + getMaxRangeKm() + " km";
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
