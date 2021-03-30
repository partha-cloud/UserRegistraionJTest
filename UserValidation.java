
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;







public class UserValidation {


    public static final String firstNamePattern =  "^[A-Z][a-zA-Z]{3,3}";
    public static final String lastNamePattern =  "^[A-Z][a-zA-Z]{3,3}";
    public static final String emailPattern =  "^([^\\.][a-zA-Z]+[\\.+_-]{0,1}[0-9][^\\.]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.][a-z^la]*)$";
    public static final String mobilePattern =  "^(91\\s*[7-9][0-9]{9})$";
    public static final String passwordPattern =  "^(?=.[A-Z])(?=.[0-9])(?=.*[!@#&()-[{}]:;',?/~$^+=<>]).{8,8}$";

    public static boolean validatePattern(String argument, String regExp) throws Exception {

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(argument);
        if(matcher.matches()) {
            return true;
        }else {

            throw new Exception("please enter valid input which is not null");
        }
    }
    public static <UserValidationException> void ifValidOuput(String regExpString, String[] testSamples) {
        Arrays.stream(testSamples).forEach( testString -> {
                    try {
                        if (validatePattern(testString, regExpString)) {
                            System.out.println(" Valid : ");
                        }else
                            System.out.println(" Invalid : ");
                    } catch (Exception  e) {
                        System.out.println(e.getMessage());
                    }
                }
        );
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration system to ensure all Validations");
        System.out.println("Enter your first name");
        String[] firstName = {"Partha", "Pa", "Partha"};
        ifValidOuput(firstNamePattern, firstName);

        System.out.println("Enter your last name");
        String[] lastName = {"Dey", "dey", "de"};
        ifValidOuput(lastNamePattern, lastName);

        System.out.println("Enter your email");
        String[] email = {"partha11dey@gmail.com", "partha-100@gmail.com", "partha@yahoo.com"};
        ifValidOuput(emailPattern, email);

        System.out.println("Enter your mobile format");
        String[] mobileFormat = {"8105405386", "8105405387", "8105405388"};
        ifValidOuput(mobilePattern, mobileFormat);

        System.out.println("Enter your password rules");
        String[] passwordRules = {"Partha@1234", "Partha", "Partha12"};
        ifValidOuput(passwordPattern, passwordRules);



    }

}
