import java.util.ArrayList;
import java.util.Arrays;

public abstract class ACar implements ICar {
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;
    private static final ArrayList<String> carInfoLabels = new ArrayList<>(Arrays.asList("RegistrationNumber", "Make", "Model", "Efficiency" , "Registration Fee", "Battery Capacity", "Range"));
    private static final int longestString;

    public ACar (String registrationNumber, String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    static {
        String longest = carInfoLabels.get(0);
        for (String str : carInfoLabels) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        longestString = longest.length();
    }

    //extra formatting because I am lazy ;) formatting is based on the index value passed from the sub-car classes
    //The length of the longest string is used to find out how many dots should be printed
    public String formatString(int index){
        int extraDots = 5;
        String str = String.valueOf(carInfoLabels.get(index));
        str += ":";
        int dotAmount = longestString - str.length() + extraDots;
        for(int i = 0; i < dotAmount; i++){
            str += ".";
        }
        return str;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "\t\t" + getRegistrationNumber() + "\n" + formatString(1) + getMake() + "\n" + formatString(2) + getModel() + "\n" + formatString(4) + getRegistrationFee() + " kr\n";
    }

}
