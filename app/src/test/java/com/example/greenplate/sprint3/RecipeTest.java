package com.example.greenplate.sprint3;
import static org.junit.Assert.assertEquals;

import com.example.greenplate.models.Recipe;

import org.junit.Test;
import java.util.Arrays;

public class RecipeTest {
    // Rachit's Tests
    @Test
    public void testRecipeQuantityNonZero() {
        Recipe testRecipe = new Recipe("Pasta", Arrays.asList("Ginger, Garlic, Tomatoes"),"1");
        testRecipe.setQuantity("0");
        assertEquals("Quantity will not change","1",testRecipe.getQuantity());
    }

    @Test
    public void testRecipeQuantityNonNegative() {
        Recipe testRecipe = new Recipe("Pizza", Arrays.asList("Steak, Chicken, Pork"),"10");
        testRecipe.setQuantity("-4");
        assertEquals("Quantity will not change","10",testRecipe.getQuantity());
    }


}
