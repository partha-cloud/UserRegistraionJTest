package UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import UserRegistration.UserValidationProcess;

    public class UserRegistrationTest {
        UserValidationProcess userValidationProcess = new UserValidationProcess();

        //for firstName Validation
        @Test
        public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True()
        {
            try
            {
                boolean result = userValidationProcess.validateFirstName("Prajakta");
                Assertions.assertTrue(result);
            }
            catch(UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
            }

        }

        @Test
        public void givenFirstName_WhenFirstNameInLowerCase_ShouldReturn_false()
        {
            try
            {
                boolean result = userValidationProcess.validateFirstName("prajakta");
                Assertions.assertFalse(result);
            }
            catch(UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
            }
        }
        @Test
        public void givenFirstName_WhenFirstNameStartHaveMinThreeLetters_ShouldReturn_True()
        {
            try
            {
                boolean result = userValidationProcess.validateFirstName("Pra");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
            }
        }
        @Test
        public void givenFirstName_WhenFirstNameStartWithLessThanThreeLetters_ShouldReturn_False()
        {
            try
            {
                boolean result = userValidationProcess.validateFirstName("Pr");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
            }

        }

        //For lastName Validation
        @Test
        public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True()
        {
            try
            {
                boolean result = userValidationProcess.validateLastName("Bramhe");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
            }
        }

        @Test
        public void givenLastName_WhenLastNameInLowerCase_ShouldReturn_false()

        {
            try
            {
                boolean result = userValidationProcess.validateLastName("bramhe");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
            }
        }

        @Test
        public void givenLastName_WhenLastNameStartHaveMinThreeLetters_ShouldReturn_True()
        {
            try
            {
                boolean result = userValidationProcess.validateLastName("Pra");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
            }
        }

        @Test
        public void givenLastName_WhenLastNameStartWithLessThanThreeLetters_ShouldReturn_False()
        {
            try
            {
                boolean result = userValidationProcess.validateLastName("Br");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
            }
        }


        //For Email Validation
        @Test
        public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True()
        {
            try
            {
                boolean result = userValidationProcess.validateEmail("abc@gmail.co");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
            }
        }
        @Test
        public void givenEmail_WhenEmailContainOnlyOneLetterAfterDot_ShouldReturn_False()
        {
            try
            {
                boolean result = userValidationProcess.validateEmail("abc@gmail.c");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
            }
        }
        @Test
        public void givenEmail_WhenEmailStartsWithCapitalLetter_ShouldReturn_True()
        {
            try
            {
                boolean result = userValidationProcess.validateEmail("Prajakta@gmail.com");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
            }
        }

        //for Mobile Number Validation

        @Test
        public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True()
        {
            try
            {
                boolean result = userValidationProcess.validateMobileNumber("91 8149240833");
                Assertions.assertTrue( result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
            }
        }
        @Test
        public void givenPhoneNumber_WhenPhoneNumberIsNOtFollowedByCountryCode_False()
        {
            try
            {
                boolean result = userValidationProcess.validateMobileNumber("8149240833");
                Assertions.assertFalse( result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
            }
        }
        @Test
        public void givenPhoneNumber_WhenPhoneNumberIsNOTTenDigit_False()
        {
            try
            {
                boolean result = userValidationProcess.validateMobileNumber("91 14924");
                Assertions.assertFalse( result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
            }
        }
        @Test
        public void givenPhoneNumber_WhenPhoneNumberNOTFollowedSpaceBetweenCountryCode_False()
        {
            try
            {
                boolean result = userValidationProcess.validateMobileNumber("918149240833");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
            }
        }

        //for Password Validation with minimum 8 character
        @Test
        public void givenPassword_WhenPasswordHaveMinimum8Characters_ShouldReturn_true()
        {
            try
            {
                boolean result = userValidationProcess.validatePassword("Prajakta14");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        @Test
        public void givenPassword_WhenPasswordHaveLessThan8Characters_ShouldReturn_false()
        {
            try
            {
                boolean result = userValidationProcess.validatePassword("gfbn");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        //for Password Validation with At least one uppercase
        @Test
        public void givenPassword_WhenPasswordHaveAtleast1UpperCase_ShouldReturn_true()
        {
            try
            {
                boolean result = userValidationProcess.passwordAtLeastOneUpperCase("Prajakta141996");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        @Test
        public void givenPassword_WhenPasswordDoNotHaveAtleast1UpperCase_ShouldReturn_false()
        {
            try
            {
                boolean result = userValidationProcess.passwordAtLeastOneUpperCase("prajakta141996");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        @Test
        public void givenPassword_WhenPasswordHaveAtleast1Digit_ShouldReturn_true()
        {
            try
            {
                boolean result = userValidationProcess.validateAlteastOneNumber("P14raju1996");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        @Test
        public void givenPassword_WhenPasswordDoNotHaveAnyDigit_ShouldReturn_false()
        {
            try
            {
                boolean result = userValidationProcess.validateAlteastOneNumber("Prajakta@");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        @Test
        public void givenPassword_WhenPasswordHaveAtleast1SpecialCharacter_ShouldReturn_true()
        {
            try
            {
                boolean result = userValidationProcess.validateSpecialCharacter("P1@raju12");
                Assertions.assertTrue(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        @Test
        public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturn_false()
        {
            try
            {
                boolean result = userValidationProcess.validateSpecialCharacter("Praju1412");
                Assertions.assertFalse(result);
            }
            catch (UserValidationException e)
            {
                System.out.println(e.getMessage());
                Assertions.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
            }
        }
        @Test
        public  void givenMessage_WhenNotSad_ShouldReturnHappy()
        {

            String mood = userValidationProcess.analyseMood("This is a Happy Message");
            Assertions.assertEquals("Happy", mood);

        }
    }

}