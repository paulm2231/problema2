 import java.io;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 import java.util.ArrayList;
 import java.util.Random;
 import java.util.Scanner;




 public class prob2 {
     private String text;
     public Vers(String text) {
         this.text = text;
     }

     public int numarCuvinte() {
         String[] cuvinte = text.split("\\s+");
         return cuvinte.length;
     }

     public int numarVocale() {
         int numarVocale = 0;
         for (int i = 0; i < text.length(); i++) {
             char c = Character.toLowerCase(text.charAt(i));
             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                 numarVocale++;
             }
         }
         return numarVocale;
     }

     public boolean seIncheieCu(String grupare) {
         return text.endsWith(grupare);
     }

     public String getText() {
         return text;
     }



    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("cantec_in.txt");
        Scanner scanner = new Scanner(input);


        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();

        }

        scanner.close();
        Random random = new Random();
        File output = new File("cantec_out.txt");
        PrintWriter writer = new PrintWriter(output);

    }
}
