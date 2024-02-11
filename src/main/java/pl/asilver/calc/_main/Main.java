package pl.asilver.calc._main;

import static pl.asilver.calc.service.ResultWriteService.writeResult;
import static pl.asilver.calc.util.Calculator.*;

public class Main {
    public static void main(String[] args) {
       findSum(211,35);
       findDif(123,321);
       findMultipl(40, 222);
       writeResult(211, 35, 246, "sum");
       writeResult(123, 321, (-198),"difference");
       writeResult(40, 222, 8880, "multiplication");
    }
}
