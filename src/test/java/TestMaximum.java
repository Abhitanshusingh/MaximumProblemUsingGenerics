import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    Maximum value;

    @Test
    public void givenThreeInteger_WhenProper_ShouldReturnMaximum1() {
        value = new Maximum(10,20,30);
        Assert.assertEquals(30, value.maximumValue());
    }
    @Test
    public void givenThreeInteger_WhenProper_ShouldReturnMaximum2() {
        value = new Maximum(40,30,20);
        Assert.assertEquals(40, value.maximumValue());
    }
    @Test
    public void givenThreeInteger_WhenProper_ShouldReturnMaximum3() {
        value = new Maximum(20,10,30);
        Assert.assertEquals(30, value.maximumValue());
    }

    @Test
    public void givenThreeFloat_WhenProper_ShouldReturnMaximum1() {
        value = new Maximum(40.0f, 5.0f, 30.f);
        Assert.assertEquals(40.0f, value.maximumValue());
    }

    @Test
    public void givenThreeFloat_WhenProper_ShouldReturnMaximum2() {
        value = new Maximum(5.0f, 40.0f, 30.f);
        Assert.assertEquals(40.0f, value.maximumValue());
    }

    @Test
    public void givenThreeFloat_WhenProper_ShouldReturnMaximum3() {
        value = new Maximum(30.0f, 5.0f, 40.f);
        Assert.assertEquals(40.0f, value.maximumValue());
    }

    @Test
    public void givenThreeString_WhenProper_ShouldReturnMaximum1() {
        value = new Maximum( "modi", "trump", "zabhi");
        Assert.assertEquals("zabhi", value.maximumValue());
    }

    @Test
    public void givenThreeString_WhenProper_ShouldReturnMaximum2() {
        value = new Maximum( "zmodi", "10", "trump");
        Assert.assertEquals("zmodi", value.maximumValue());
    }

    @Test
    public void givenThreeString_WhenProper_ShouldReturnMaximum3() {
        value = new Maximum( "20.20", "zmodi", "trump");
        Assert.assertEquals("zmodi", value.maximumValue());
    }
}
