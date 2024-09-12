package interview;

public class check {
//    public static void main(String []args){
//
//        String s = "ABC";
//
//        String s2 = new String("ABC");
//
//        String s3 = "ABC";
//
//        System.out.println(s==s2);
//
//        System.out.println(s==s3);
//
//    }



//        public static void main(String[] args) {
//
//            printMessage("Hello, World!");
//
//        }
//
//        private static void printMessage(String message) {
//
//            System.out.println("Message: " + message);
//
//            //return message;
//
//        }

    public static void main(String[] args) {

        try {

            int i=9/0;

            System.out.println(i);

            return;

        } catch (Exception e) {

            System.out.println("exception caught");

            return;

        }
        finally {
            System.out.println("task completed");
        }

        //System.out.println("task completed");

    }




}



