package Lab4ExceptionsIO.Ch2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("C:\\JetBrains\\GAD-JAVA2022\\src\\Lab4ExceptionsIO\\Ch2\\text")));
            while (s.hasNext()) {
                afisare(s.next());
            }
        } catch (IOException ex) {

        } finally {
            if (s != null)
                s.close();
        }
    }

    private static void afisare(String word) {
        for (char c : word.toCharArray())
            if (c >= 'A' && c <= 'Z') {
                if (c != 'X')
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
    }
}