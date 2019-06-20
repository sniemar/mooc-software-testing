package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "{0}: {1} = {2}")
    @CsvSource({
            // I assume that a string has the letter g.
            // one unhappy g
            "'one unhappy g', 'giraffe', false", "'one unhappy g', 'aga', false", "'one unhappy g', 'bag', false",
            // two unhappy g
            "'two unhappy g', 'giraffeg', false", "'two unhappy g', 'gaga', false", "'two unhappy g', 'agag', false", "'two unhappy g', 'agagr', false",
            // two happy g
            "'two happy g', 'ggiraffe', true", "'two happy g', 'agga', true", "'two happy g', 'egg', true",
            // many happy g
            "'many happy g', 'ggiraffegg', true", "'many happy g', 'ggagga', true", "'many happy g', 'eggegg', true", "'many happy g', 'eggegge', true", "'many happy g', 'eggeggegg', true",
            // triple g
            "'triple g', 'gggiraffe', true", "'triple g', 'aggga', true", "'triple g', 'eggg', true",

    })
    public void tests (String partition, String s, boolean expected) {
        boolean result = (new GHappy()).gHappy(s);
        Assertions.assertEquals(expected, result);
    }
}
