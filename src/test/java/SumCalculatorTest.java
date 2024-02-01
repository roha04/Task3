import com.calculator.SumCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class SumCalculatorTest {

    private SumCalculator sumCalc;
    @BeforeEach
    public void beforeEach() {
        sumCalc = new SumCalculator();
    }
    @Test
    void testThatSumWorksCorrect0(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int actual = sumCalc.sum(0);
        });
    }
    @Test
    void testThatSumWorksCorrect1() {
        //When
        int actual = sumCalc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
     @Test
     void testThatSumWorksCorrect3() {
         //When
         int actual = sumCalc.sum(3);

         //Then
         int expected = 6;
         Assertions.assertEquals(expected, actual);
     }
}
