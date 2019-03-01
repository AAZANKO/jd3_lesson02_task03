package by.htp.zanko;

import org.junit.Assert;
import org.junit.Test;

public class DominantElementTest {

    @Test
    public void checkGetDominantElement(){

        int[] array1 = {1, 9, 1, 9, 3, 9, 1, 9, 1, 5, 6, 7, 8, 9};

        int result;

        DominantElement dominantElement = new DominantElement();

        result = dominantElement.getDominantElement(array1);

        Assert.assertNotNull(result);
    }
}