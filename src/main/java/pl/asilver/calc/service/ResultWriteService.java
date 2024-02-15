package pl.asilver.calc.service;

public class ResultWriteService {
    public static void writeResult (int num1, int num2, int result, String operationName){
        System.out.println("The provided numbers are: " + num1 + ", " + num2 + ". " +
                "The operation performed: " + operationName + ". " +
                "The result of the operation: " + result + ".");
    }
}
