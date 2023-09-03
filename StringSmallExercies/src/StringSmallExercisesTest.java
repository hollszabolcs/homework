import org.junit.Assert;
import org.junit.Test;
public class StringSmallExercisesTest{
    @Test
    public void testStringSmallExercises(){
        Assert.assertEquals(1,StringSmallExercises.getBCharacter("Beka"));
        Assert.assertEquals(2, StringSmallExercises.getBCharacter("sdsdBdsdsb12B"));
        Assert.assertEquals(0,StringSmallExercises.getHellos("Hello"));
        Assert.assertEquals(1,StringSmallExercises.getHellos("hello"));
        Assert.assertEquals(2,StringSmallExercises.getHellos("asdhelloasHasdhello"));
    }

}


