public class Main {
    public static void main(String[] args){

        FleetOfCars fleet = new FleetOfCars();
        ElectricCar ella_ellert = new ElectricCar("DN21121", "Volvo - Bucher", "CityFlex C40e", 2,200, 250);
        DieselCar miniTøf = new DieselCar("AH71411", "Citroen", "C1 1.4", 5,23, true);
        GasolinCar saab = new GasolinCar("YA51273","Saab", "9-3 2.0T Estate Hirsch 195hp",5,12);

        fleet.addCar(ella_ellert);
        fleet.addCar(miniTøf);
        fleet.addCar(saab);

        System.out.println("\n" + fleet);
    }
}
