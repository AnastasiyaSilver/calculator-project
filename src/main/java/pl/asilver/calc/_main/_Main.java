package pl.asilver.calc._main;

import pl.asilver.calc.util.Calculator;

import static pl.asilver.calc.service.ResultWriteService.writeResult;

public class _Main {
    public static void main(String[] args) {
        int sumResult = Calculator.findSum(211, 35);
        int difResult = Calculator.findDif(123, 321);
        int multiplResult = Calculator.findMultipl(40, 222);
        writeResult(211, 35, sumResult, "sum");
        writeResult(123, 321, difResult, "difference");
        writeResult(40, 222, multiplResult, "multiplication");
    }
}
