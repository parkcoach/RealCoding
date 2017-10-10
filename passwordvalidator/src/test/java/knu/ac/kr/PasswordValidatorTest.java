package knu.ac.kr;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void minLength_large_test_ok(){
        String testPassword = "hello";
        passwordvalidator passwordvalidator = new passwordvalidator(5,10);
        boolean result = passwordvalidator.validator(testPassword);
        assertTrue(result);
    }

    @Test
    public void minLength_samll_test_fail(){
        String testPassword = "abcde";
        passwordvalidator passwordvalidator = new passwordvalidator(6,10);
        boolean result = passwordvalidator.validator(testPassword);
        assertFalse(result);
    }

    @Test
    public void maxLength_small_test_ok(){
        String testpassword = "abcdefghijklmnop";
        passwordvalidator passwordvalidator = new passwordvalidator(5,30);
        boolean result = passwordvalidator.validator(testpassword);
        assertTrue(result);
    }

    @Test
    public void maxLength_big_test_fail(){
        String testpassword = "abcdefghijklmnop";
        passwordvalidator passwordvalidator = new passwordvalidator(5,10);
        boolean result = passwordvalidator.validator(testpassword);
        assertFalse(result);
    }

    @Test
    public void password_null_test_fail(){
        String testpassword = null;
        assertNull(testpassword);
    }

    @Test
    public void password_empty_test_fail(){
        String testpassword = "";
        passwordvalidator passwordvalidator = new passwordvalidator(5,10);
        boolean result = passwordvalidator.validator(testpassword);
        assertFalse(result);
    }

    @Test
    public void password_admin_test_ok(){
        String testpassword = "Admin";
        passwordvalidator passwordvalidator = new passwordvalidator(6,10);
        boolean result = passwordvalidator.validator(testpassword);
        assertTrue(result);
    }
}
