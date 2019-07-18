package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "{0}: {1}, {2} = {3}")
    @CsvSource({
            "'l', 'abc', 3, 'def'",
            "'2', 'zef', 3, 'chi'",
    })

    public void tests (String partition, String str, int shift, String expected) {
        String result = (new CaesarShiftCipher()).CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expected, result);
    }
}
