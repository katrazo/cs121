import javax.swing.JOptionPane;

public class SwitchActivity {
    public static void main(String[] args) {
        String planet = "";
        String orderFromSun = "";
        double dist = 0;
        int radius = 0;

        String userInput = JOptionPane.showInputDialog("Please pick a planet from the following list:\n- Mercury\n- Venus\n- Earth\n- Mars\n- Jupiter\n- Saturn\n- Uranus\n- Neptune\n- Pluto");
        userInput = userInput.toLowerCase();

        switch (userInput) {
            case "mercury" -> {
                planet = "Mercury";
                orderFromSun = "1st";
                dist = 0.39;
                radius = 2440;
            }
            case "venus" -> {
                planet = "Venus";
                orderFromSun = "2nd";
                dist = 0.72;
                radius = 6052;
            }
            case "earth" -> {
                planet = "Earth";
                orderFromSun = "3rd";
                dist = 1.00;
                radius = 6378;
            }
            case "mars" -> {
                planet = "Mars";
                orderFromSun = "4th";
                dist = 1.52;
                radius = 3396;
            }
            case "jupiter" -> {
                planet = "Jupiter";
                orderFromSun = "5th";
                dist = 5.20;
                radius = 71492;
            }
            case "saturn" -> {
                planet = "Saturn";
                orderFromSun = "6th";
                dist = 9.54;
                radius = 60268;
            }
            case "uranus" -> {
                planet = "Uranus";
                orderFromSun = "7th";
                dist = 19.22;
                radius = 25559;
            }
            case "neptune" -> {
                planet = "Neptune";
                orderFromSun = "8th";
                dist = 30.06;
                radius = 24764;
            }
            case "pluto" -> {
                planet = "Pluto";
                orderFromSun = "9th";
                dist = 39.5;
                radius = 1185;
            }
            default -> {
                JOptionPane.showMessageDialog(null, "The input you entered does not match.");
                System.exit(6);
            }
        }

        String toString = planet + " is the " + orderFromSun + " planet from the sun.\nIt is " + dist + " AU away from the sun.\nIt has a radius of " + radius + " kilometers (at the equator).";
        JOptionPane.showMessageDialog(null,toString);

    }
}
