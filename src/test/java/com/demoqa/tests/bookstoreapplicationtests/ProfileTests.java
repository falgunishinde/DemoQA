package com.demoqa.tests.bookstoreapplicationtests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTests {
    @Test
    public void profilePageTests(){
        homePage.chooseHomePageMenu("Book Store");
        bookStorePage.chooseBookStoreMenu("Profile");

        /*  profilePage.chooseLoginOrRegistration("register");
        loginPage.enterFirstName("AbcD");
        loginPage.enterLastName("Xyz");
        loginPage.enterUsername("Abc123");
        loginPage.enterPassword("12345Aa!");
        loginPage.clickRegisterButton();*/

        profilePage.chooseLoginOrRegistration("login");
        loginPage.enterUsername("Abc25");
        loginPage.enterPassword("12345Aa!");
        bookStorePage.clickLoginButton();
        waitTime();
        //Assert.assertEquals(profilePage.getUsernameText(),);
        profilePage.clickGoToBookStoreButton();
        bookStorePage.openBookByTitle("Git Pocket Guide");
        profilePage.addBook();
        waitTime();//backtobookstore
        bookStorePage.clickBackToBookstore();
        bookStorePage.openBookByTitle("Learning JavaScript Design Patterns");
        profilePage.addBook();
        waitTime();
        bookStorePage.chooseBookStoreMenu("Profile");
        profilePage.writeBookToSearch("Learning JavaScript Design Patterns");
        profilePage.deleteChosenBook(1);
        methods.acceptAlert();
        waitTime();
        methods.acceptAlert();
        waitTime();
        profilePage.chooseActionToTake("Delete All Books");
        waitTime();
      //  profilePage.chooseActionToTake("Delete Account");


    }
}
