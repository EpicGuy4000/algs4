package tests;

import exercises.EuclideanAlgorithm;
import org.junit.Assert;
import org.junit.Test;

public class EuclideanAlgorithmTests {
    @Test
    public void findGreatestCommonDivisor_validCases_expectedResultReturned_case1() {
        findGreatestCommonDivisor_validCases_expectedResultReturned(1, 1, 1);
    }

    @Test
    public void findGreatestCommonDivisor_validCases_expectedResultReturned_case2() {
        findGreatestCommonDivisor_validCases_expectedResultReturned(3, 2, 1);
    }

    @Test
    public void findGreatestCommonDivisor_validCases_expectedResultReturned_case3() {
        findGreatestCommonDivisor_validCases_expectedResultReturned(10, 15, 5);
    }

    private void findGreatestCommonDivisor_validCases_expectedResultReturned(int firstNumber, int secondNumber, int expectedResult) {
        Assert.assertEquals(expectedResult, EuclideanAlgorithm.findGreatestCommonDivisor(firstNumber, secondNumber));
    }
}
