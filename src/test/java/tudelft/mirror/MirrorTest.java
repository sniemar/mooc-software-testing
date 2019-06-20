package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @ParameterizedTest(name = "{0}: {1} = {2}")
    @CsvSource({
            // no mirror
            "'no mirror', 'abcde', ''",
            // exactly one letter
            "'one letter', 'abcde', ''", "'one letter', 'abcdea', 'a'", "'one letter', 'abcdeaa', 'a'", "'one letter', 'aabcdea', 'a'",
            // more than one letter
            "'more than one', 'aabcdaa', 'aa'", "'more than one', 'laikal', 'la'", "'more than one', 'curricuruc', 'cur'",
            // whole word
            "'whole word', 'racecar', 'racecar'", "'whole word', 'arosasora', 'arosasora'", "'whole word', 'rainniar', 'rainniar'",
            // string with length 1
            "'length 1', 'r', 'r'",
            // empty string
            "'empty', '', ''",
    })
    public void tests (String partition, String s, String expected) {
        String result = (new Mirror()).mirrorEnds(s);
        Assertions.assertEquals(expected, result);
    }
}
