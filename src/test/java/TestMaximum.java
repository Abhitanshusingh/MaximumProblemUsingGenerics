import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    Maximum value;

    @Test
    public void givenThreeInteger_WhenProper_ShouldReturnMaximum() {
        value = new Maximum();
        Integer intArray[] = {10, 20, 30};
        Assert.assertEquals(intArray[2],Maximum.findMaximumNumber(intArray));
    }
}
