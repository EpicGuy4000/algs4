package exercise.tests;

import exercises.EuclideanAlgorithm;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class EuclideanAlgorithmTests {
    @Test
    @Parameters({
            "1, 1, 1",
            "3, 6, 3",
            "4, 2, 2",
            "7, 9, 1"
    })
    public void findGreatestCommonDivisor_validCases_expectedResultReturned(int firstNumber, int secondNumber, int expectedResult) {
        Assert.assertEquals(expectedResult, EuclideanAlgorithm.findGreatestCommonDivisor(firstNumber, secondNumber));
    }
}
