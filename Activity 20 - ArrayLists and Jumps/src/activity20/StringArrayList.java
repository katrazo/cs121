package activity20;

import java.util.ArrayList;

public class StringArrayList {
    // I'm not sure if this is supposed to be an object class or a static class.....
    // I'll just make it an Object class until I hear otherwise.

    private ArrayList<String> strArray = new ArrayList<>();

    public void addString(String str) {
        strArray.add(str);
    }

    public void removeString (String str) {
        strArray.remove(str);
    }

    public int getSize() {
        return strArray.size();
    }

    public String getStringAtIndex(int index) {
        return strArray.get(index);
    }

    public void displayFor() {
        for (int i = 0; i < strArray.size(); i++) {
            System.out.print(strArray.get(i) + " ");
        }
        System.out.println();
    }
    public void displayForEach() {
        for (String checker : strArray) {
            System.out.print(checker + " ");
        }
        System.out.println();
    }
}
