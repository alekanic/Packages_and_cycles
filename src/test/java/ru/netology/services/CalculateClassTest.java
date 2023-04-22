package ru.netology.services;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateClassTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/calculate.csv")
    public void testWithFirstExample(int income, int expenses, int threshold) {

        CalculateClass service = new CalculateClass();
        int monthOfRest = service.calculate(income, expenses, threshold);

        System.out.println(monthOfRest);
    }

}
