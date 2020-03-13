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
    @Test
    public void givenThreeFloat_WhenProper_ShouldReturnMaximum() {
        value = new Maximum();
        Float intArray[] = {40.0f, 5.0f, 30.f};
        Assert.assertEquals(intArray[0],Maximum.MaximumFloatValue(intArray));
    }
}
