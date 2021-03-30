package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistrationgradle.UserRegistrationGradle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();

    //Starts First Name Test Cases
    @Test
    public void givenFirstName_whenValid_ReturnHappy() throws Exception {
        String validationResult = userRegistrationGradle.validateFirstName("Partha");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenFirstName_whenLessThanThreeLetters_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validateFirstName("Pa");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid User First Name", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_whenFirstLetterNotCaps_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validateFirstName("partha");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid User First Name", e.getMessage());
        }
    }

    //Starts Last Name Use Cases
    @Test
    public void givenLastName_whenValid_ReturnHappy() throws Exception {
        String validationResult = userRegistrationGradle.validateLastName("Dey");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenLastName_whenLessThanThreeLetters_ReturnSad() throws Exception {
        try {
            String validationResult = userRegistrationGradle.validateLastName("de");
        }catch (Exception e){
            Assertions.assertEquals("Invalid User Last Name", e.getMessage());
        }
    }

    @Test
    public void givenLastName_whenFirstLetterNotCaps_ReturnSad() throws Exception {
        try {
            String validationResult = userRegistrationGradle.validateLastName("DEY");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid User Last Name", e.getMessage());
        }
    }

    //Starts Email Test Cases
    @Test
    public void givenEmail_whenValid_ReturnHappy() throws Exception {
        String validationResult = userRegistrationGradle.validateEmail("PARTHA11DEY@GMAIL.COM");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenEmail_whenStartsWithSpecialChar_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validateEmail("-partha11dey@gmail.com");
        }catch (Exception e){
            Assertions.assertEquals("Invalid User Email", e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenAtTheRateIsNotGiven_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validateEmail("partha11dey@gmail.com");
        }catch (Exception e){
            Assertions.assertEquals("Invalid User Email", e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenTLDIsNotGiven_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validateEmail("partha11dey@gmail.com");
        }catch (Exception e){
            Assertions.assertEquals("Invalid User Email", e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenTwoSpecialCharsAreUsedConsecutively_ReturnSad() throws Exception{
        try{
            String validationResult = userRegistrationGradle.validateEmail("partha-.dey@gmail.com");
        }catch (Exception e){
            Assertions.assertEquals("Invalid User Email", e.getMessage());
        }
    }

    //Starts Phone Number Test Cases
    @Test
    public void givenPhoneNumber_whenValid_ReturnHappy() throws Exception{
        String validationResult = userRegistrationGradle.validateMobNum("91 8105405386");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenPhoneNumber_whenSpaceAfterCountryNotGiven_ReturnSad() throws Exception{
        try{
            String validationResult = userRegistrationGradle.validateMobNum("8105405387");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Mobile Number", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_whenPhoneNumberLengthIsMoreThanTen_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validateMobNum("91 8105405388");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Mobile Number", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_whenCountryCodeIsNotGiven_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validateMobNum(" 8105405389");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Mobile Number", e.getMessage());
        }
    }

    //Starts Password Test Cases
    @Test
    public void givenPassword_whenValid_ReturnHappy() throws Exception{
        String validationResult = userRegistrationGradle.validatePassword("Partha@1234");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenPassword_whenNoNumberIsGiven_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validatePassword("Partha");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Password", e.getMessage());
        }
    }

    @Test
    public void givenPassword_whenNoSpecialCharIsGiven_ReturnSad() throws Exception{
        try{
            String validationResult = userRegistrationGradle.validatePassword("aKashSaxena16");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Password", e.getMessage());
        }
    }

    @Test
    public void givenPassword_whenNoCapitalCharIsGiven_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validatePassword("partha@1234");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Password", e.getMessage());
        }
    }

    @Test
    public void givenPassword_whenLengthIsLessThanEight_ReturnSad() throws Exception{
        try {
            String validationResult = userRegistrationGradle.validatePassword("Part");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Password", e.getMessage());
        }
    }
