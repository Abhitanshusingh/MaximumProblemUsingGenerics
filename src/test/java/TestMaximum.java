import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    Maximum value;

    @Test
    public void givenThreeInteger_WhenProper_ShouldReturnMaximum1() {
        value = new Maximum(10, 20, 30);
        Integer maxInteger = (Integer) value.maximumValue();
        Assert.assertEquals((Integer) 30, maxInteger);
    }

    @Test
    public void givenThreeInteger_WhenProper_ShouldReturnMaximum2() {
        value = new Maximum(40, 30, 20);
        Integer maxInteger = (Integer) value.maximumValue();
        Assert.assertEquals((Integer) 40, maxInteger);
    }

    @Test
    public void givenThreeInteger_WhenProper_ShouldReturnMaximum3() {
        value = new Maximum(20, 10, 50);
        Integer maxInteger = (Integer) value.maximumValue();
        Assert.assertEquals((Integer) 50, maxInteger);
    }

    @Test
    public void givenThreeFloat_WhenProper_ShouldReturnMaximum1() {
        value = new Maximum(40.0f, 5.0f, 30.f);
        Float maxFloat = (Float) value.maximumValue();
        Assert.assertEquals((Float) 40.0f, maxFloat);
    }

    @Test
    public void givenThreeFloat_WhenProper_ShouldReturnMaximum2() {
        value = new Maximum(5.0f, 40.0f, 30.f);
        Float maxFloat = (Float) value.maximumValue();
        Assert.assertEquals((Float) 40.0f, maxFloat);
    }

    @Test
    public void givenThreeFloat_WhenProper_ShouldReturnMaximum3() {
        value = new Maximum(30.0f, 5.0f, 40.f);
        Float maxFloat = (Float) value.maximumValue();
        Assert.assertEquals((Float) 40.0f, maxFloat);
    }

    @Test
    public void givenThreeString_WhenProper_ShouldReturnMaximum1() {
        value = new Maximum("modi", "trump", "zabhi");
        String maxString = (String) value.maximumValue();
        Assert.assertEquals("zabhi", maxString);
    }

    @Test
    public void givenThreeString_WhenProper_ShouldReturnMaximum2() {
        value = new Maximum("zmodi", "10", "trump");
        String maxString = (String) value.maximumValue();
        Assert.assertEquals("zmodi", maxString);
    }

    @Test
    public void givenThreeString_WhenProper_ShouldReturnMaximum3() {
        value = new Maximum("20.20", "zmodi", "trump");
        String maxString = (String) value.maximumValue();
        Assert.assertEquals("zmodi", maxString);
    }
}