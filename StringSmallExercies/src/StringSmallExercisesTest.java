import org.junit.Assert;
import org.junit.Test;
public class StringSmallExercisesTest{
    @Test
    public void testStringSmallExercises(){
        Assert.assertEquals(1,StringSmallExercises.getAmountOfB("Beka"));
        Assert.assertEquals(2, StringSmallExercises.getAmountOfB("sdsdBdsdsb12B"));
        Assert.assertEquals(0,StringSmallExercises.getHellos("Hello"));
        Assert.assertEquals(1,StringSmallExercises.getHellos("hello"));
        Assert.assertEquals(2,StringSmallExercises.getHellos("asdhelloasHasdhello"));
    }

}


