import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterUser extends userUtils{

    //public static String regUser;





    private static void createFile(String name){
        try {
            File fileObj = new File(getPath(sanitize(name)));
            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
                System.out.println("File created: " + fileObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private static void writeFile(String name,String text){
        try{
            FileWriter myWriter = new FileWriter(getPath(sanitize(name)), true);
            myWriter.write(text+"\n");
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createUserFile(){
        String Username = getInput("Enter username");

        if (!checkFileExists(sanitize(Username))){
        String senha = getInput("Enter password");
        String ID = getInput("Enter ID");
        String registro = getInput("Enter register number");
        
        //boolean exists = ;
        createFile(sanitize(Username));
        writeFile(sanitize(Username), sanitize(Username));
        writeFile(sanitize(Username), senha);
        writeFile(sanitize(Username), ID);
        writeFile(sanitize(Username), registro);
        System.err.println("User created successfully");
        }else{
            System.err.println("This user already exists");
        }
    }
}
    



