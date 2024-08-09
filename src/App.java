public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println(RegisterUser.getUserReg());
        userUtils.sanitize("japa cama");
        while (true) { 
            int choice = userUtils.getIntInput("1 for login and 2 for register");
            if (choice == 1) {
                LoginUser.logUser();
            }else if (choice == 2){
            RegisterUser.createUserFile();
            }else{
                System.out.println("Thats not a valid choice");
            }
        }
    }
}
