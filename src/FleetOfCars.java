import java.util.ArrayList;

public class FleetOfCars extends Main{
    ArrayList<ICar> fleet;
    FleetOfCars(){
        fleet = new ArrayList<ICar>();
    }

    void addCar(ICar car){
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet(){
        int total = 0;
        for(ICar car : fleet){
            total += car.getRegistrationFee();
        }
        return total;
    }

    @Override
    public String toString() {
        System.out.println("-----Fleet Of Cars-----");
        for (ICar car : fleet) {
            System.out.println(car);
            System.out.println("______________________________");
        }
        return "______________________________\nTotal registration Fee: " + getTotalRegistrationFeeForFleet() + "kr\n______________________________";
    }
}
