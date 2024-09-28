package lld.lld1.ExceptionHandling;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {

//        try {
//            Student.doSomething(4);
//        }catch (ClassNotFoundException e) {
//
//        }catch (SQLException e) {
//
//        }catch (RandomException e) {
//
//        }catch (ArithmeticException e) {
//
//        }catch (Exception e) {
//
//        }

//        try {
//            Student.doSomething(2);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (RandomException e) {
//            throw new RuntimeException(e);
//        }


//        try {
//            Student.doSomething(4);
//        }catch (Exception e) {
//            System.out.println("Inside Catch");
//        }

        try {
            Student.doSomething(4 );
//            return;
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }catch (SQLException e) {
            System.out.println("SQL Exception");
        }catch (RandomException e) {
            System.out.println("Random Exception");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }catch (Exception e) {
            System.out.println("Exception");
        }finally {
            // finally blocks irrespective of try and catch
            System.out.println("Finally Executed");
            return;
        }
        //System.out.println(Student.doSomething(4));
        //test(5);

        //        Error
//        try {
//            throw new StackOverflowError();
//        }catch (Error e){
//            System.out.println(e.getMessage());
//        }
//        Error
    }
}
