package utility;

import java.util.Locale;
import java.util.ResourceBundle;




public class Language {
    private static ResourceBundle msg;
   // private DomeinController dc;
    public Language(int t) {
        kiesTaal(t);

    }

    private void kiesTaal(int keuze) {
        //Scanner scan = new Scanner(System.in);
        String lang; 
        String country;
       // int keuze = 0;
        
//        do {
//        System.out.print("1 = Nederlands\n2 = English\n3 = Français"
//                + "\nKies taal/Choose language/Choisissez la langue: ");
//        keuze = scan.nextInt();
//        }while(keuze < 1 || keuze > 3);
        if(keuze == 1){
            lang = "nl";
            country = "BE";
        }
        else if(keuze == 2) {
            lang = "en";
            country = "UK";
        }
        
        else {
            lang = "nl";
            country = "BE";
        }
        
        Locale locale = new Locale(lang, country);
        msg = ResourceBundle.getBundle("resources.lang",locale);
        
        
        
    }
    
    public static String getString(String bericht) {
        return msg.getString(bericht);
    }
}