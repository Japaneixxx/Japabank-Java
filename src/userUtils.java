
import java.io.File;
import java.util.Scanner;

public class userUtils {

    public static String sanitize(String name){
        String newString = name;
        newString = newString.toLowerCase();
        newString = newString.replace(" ", "_");
        //System.out.println(newString);
        return newString;
    }


    public static String getPath(String name){
        return "..\\japabank\\contas\\" + sanitize(name) + ".japa";
    }
    public static boolean checkFileExists(String name){
        File fileObj = new File(getPath(name));
        if (fileObj.exists()) {
            return true;
        }else{
            return false;
        }
    }
    
    public static String getInput(String text){
        @SuppressWarnings("resource")
        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println(text);

        String inputText = scannerObj.nextLine();  // Read user input
        //scannerObj.close();
        return inputText;

    }
    public static int getIntInput(String text){
        @SuppressWarnings("resource")
        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println(text);

        String inputText = scannerObj.nextLine();  // Read user input
        //scannerObj.close();
        try {
            return Integer.parseInt(inputText);
        } catch (Exception e) {
            return 99999999;
        }

    }
}
