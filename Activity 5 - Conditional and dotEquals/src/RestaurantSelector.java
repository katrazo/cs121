import javax.swing.JOptionPane;

public class RestaurantSelector {
    public static void main(String[] args) {
        int vegetarian, vegan, glutenFree; // 0 = yes, 1 = no;

        String[] options = {"Yes", "No"};

        vegetarian = JOptionPane.showOptionDialog(null, "Is anyone in your party vegetarian?", "Restaurant Picker", 2,3,null,options,0);
        vegan = JOptionPane.showOptionDialog(null, "Is anyone in your party vegan?", "Restaurant Picker", 2,3,null,options,0);
        glutenFree = JOptionPane.showOptionDialog(null, "Is anyone in your party gluten-free?", "Restaurant Picker", 2,3,null,options,0);

        String listOfChoices = "";
        // all vegan places are also gluten-free, but one gluten-free place isn't vegan
        if (vegetarian == 0) { // vegetarian options - yes ? ?
            if (glutenFree == 0) // yes ? yes
                listOfChoices = "\nCorner Cafe\nThe Chef's Kitchen";
            // yes no yes has the same options as yes yes yes
            else if (vegan == 1) // yes no no
                listOfChoices = "\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Kitchen";
        }
        else if (glutenFree == 0) { // no ? yes
            if (vegan == 1) // no no yes
                listOfChoices = "\nMain Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen";
            else // no yes yes
                listOfChoices = "\nCorner Cafe\nThe Chef's Kitchen";
        }
        else if (vegan == 0) // no yes no
            listOfChoices = "\nCorner Cafe\nThe Chef's Kitchen";
        else // no no no
            listOfChoices = "\nJoe's Gourmet Burgers\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Kitchen";


        JOptionPane.showMessageDialog(null,"Your options are: " + listOfChoices);
    }
}
