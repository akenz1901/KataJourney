package plateNumberGenerator;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;

public class NigeriaNumberGenerator {
    private String num = "";
    private String letters;
    private SecureRandom random = new SecureRandom();
    private String state;
    private final String [] states;

    public NigeriaNumberGenerator(){
        states = new String[]{"Lagos", "Abia","Adamawa","Akwa Ibom","Anambra",
                "Bauchi","Bayelsa","Benue","Borno State","Cross River","Delta",
                "Ebonyi","Edo State","Ekiti","Enugu", "Gombe", "Imo",
                "Jigawa","Kaduna","Kano","Katsina", "Kebbi", "Kogi",
                "Kwara","Nasarawa", "Niger","Ogun", "Ondo","Osun",
                "Oyo","Plateau", "Rivers","Sokoto","Taraba",
                "Yobe","Zamfara"};
        letters = "ABCDEFGHIJKLMNOPQRSTWXYZ";
    }

    public boolean getStates() {
        int numberOfStates = states.length;
        return numberOfStates==36;
    }

    public void generateNumber() {
        for (int i = 0; i < 3; i++) {
            random.nextInt(9);
            num += String.format("%d", random.nextInt(9));
        }
    }

    public String getNum() {
        return num;
    }

    public void setDesiredState(String state) {
        for (String s : states) {
            if (s.equalsIgnoreCase(state)) {
                this.state = s;
                break;
            }
        }
    }
    public String getState(){
        return state;
    }

    public String generatePlateNumber() {
        String plateNumber = "";
        String[] newLetters = letters.split("");
        String prefix = "";
        String suffix = "";
        for (int i = 0; i < 5; i++) {
            if(i < 3)
                suffix += newLetters[random.nextInt(letters.length())];
            else
                prefix += newLetters[random.nextInt(letters.length())];
        }
        plateNumber =  suffix +"-" + num + prefix;
        return plateNumber;
    }

    @Override
    public String toString() {
        return String.format("%7s%n%s", state.toUpperCase(), generatePlateNumber());
    }
    public void displayPlateNumber(){
        System.out.println(toString());
    }
}
