
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoginUser extends userUtils{

    private static String getFileLine(String name, int number) {
        if(checkFileExists(sanitize(name))){
            //File fileObj = new File("..\\japabank\\contas\\" + name + ".japa");
            String line;
            try {
                line = Files.readAllLines(Paths.get(getPath(sanitize(name)))).get(number);
                //System.out.println(line);
                return line;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
            //System.out.println(line);
        }else{
            return null;
        }
    }

    public static void logUser() throws IOException{
        //System.out.println(getFileLine(name, 0));
        String name = getInput("Input your username").toLowerCase();
        if (sanitize(name) == null ? getFileLine(sanitize(name), 0) == null : sanitize(name).equals(getFileLine(sanitize(name), 0))) {
            
        }
        if(getInput("Input your password").equals(getFileLine(sanitize(name), 1))){
            System.out.println("success");
            
        }else{
            System.out.println("Your name or password is incorrect");
        }
    }
}
