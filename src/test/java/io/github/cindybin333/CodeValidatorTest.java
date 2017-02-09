package io.github.cindybin333;

import org.junit.Test;

import static io.github.cindybin333.CodeValidator.isValidCode;
import static junit.framework.TestCase.assertEquals;

public class CodeValidatorTest {
    @Test
    public void isValidCode_returnsTrue_ifEmptyString() {
        assertEquals(isValidCode(""), true);
    }

    @Test
    public void isValidCode_returnsTrue_ifBracesAreValid() {
        assertEquals(isValidCode("{ { } }"), true);
    }

    @Test
    public void isValidCode_returnsFalse_ifBracesAreInvalid() {
        assertEquals(isValidCode("{"), false);
    }

    @Test
    public void isValidCode_returnsTrue_ifBracketsAreValid() {
        assertEquals(isValidCode("[[]][][]"), true);
    }

    @Test
    public void isValidCode_returnsFalse_ifBracketsAreInvalid() {
        assertEquals(isValidCode("[[[[asdf]"), false);
    }

    @Test
    public void isValidCode_returnsTrue_ifParensAreValid() {
        assertEquals(isValidCode("(((s)))"), true);
    }

    @Test
    public void isValidCode_returnsFalse_ifParensAreInvalid() {
        assertEquals(isValidCode("())"), false);
    }

    @Test
    public void isValidCode_returnsFalse_ifCombinationIsInvalid() {
        assertEquals(isValidCode("{([)]}"), false);
    }
}