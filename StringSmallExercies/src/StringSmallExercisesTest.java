import org.junit.Assert;
import org.junit.Test;
public class StringSmallExercisesTest{
    @Test
    public void testStringSmallExercises(){
        Assert.assertEquals(1,StringSmallExercises.getBLetters("Beka"));
        Assert.assertEquals(3, StringSmallExercises.getBLetters("sdsdBdsdsb12b"));
        Assert.assertEquals(1,StringSmallExercises.getHellos("Hello"));
        Assert.assertEquals(1,StringSmallExercises.getHellos("hello"));
        Assert.assertEquals(2,StringSmallExercises.getHellos("asdhelloasHasdHello"));
    }

}


