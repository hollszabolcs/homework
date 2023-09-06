import org.junit.Assert;
import org.junit.Test;
public class StringSmallExercisesTest{
    @Test
    public void testStringSmallExercises(){
        Assert.assertEquals(1,StringSmallExercises.getBCharacterCount("Beka"));
        Assert.assertEquals(2, StringSmallExercises.getBCharacterCount("sdsdBdsdsb12B"));
        Assert.assertEquals(0,StringSmallExercises.getHelloCount("Hello"));
        Assert.assertEquals(1,StringSmallExercises.getHelloCount("hello"));
        Assert.assertEquals(2,StringSmallExercises.getHelloCount("asdhelloasHasdhello"));
    }

}


