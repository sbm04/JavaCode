package corejava.com.customExceptions.Qustion2;

public class CustomExceptionDemo  {
    public static void validate(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("You are older than 18 years old");
        }
        else{
            System.out.println("You are grater than 18 years old");
        }
    }
     public static void main(String[] args) {

        try{
           validate(16);
        }
        catch (Exception e){
          System.out.println( "Exception " + e.getMessage() );
         }

     }
}
