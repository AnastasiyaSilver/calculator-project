package pl.asilver.calc._main;

import pl.asilver.calc.util.Calculator;

import static pl.asilver.calc.service.ResultWriteService.writeResult;

public class Main {
    public static void main(String[] args) {
        int sumOperation = Calculator.findSum(211,35);
        int difOperation = Calculator.findDif(123,321);
        int multiplOperation = Calculator.findMultipl(40,222);

       writeResult(211, 35, sumOperation, "sum");

       writeResult(123, 321, difOperation,"difference");

       writeResult(40, 222, multiplOperation, "multiplication");
    }
}
