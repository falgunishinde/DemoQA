package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookStoreDataProvider extends BaseTests {
    @DataProvider(name = "TestSearchBooks")
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"Git Pocket Guide"},
                {"Learning JavaScript Design Patterns"},
                {"Designing Evolvable Web APIs with ASP.NET"},
                {"Speaking JavaScript"},
                {"You Don't Know JS"},
                {"Programming JavaScript Applications"},
                {"Eloquent JavaScript, Second Edition"},
                {"Understanding ECMAScript 6"},
        };
    }

    @Test(dataProvider = "TestSearchBooks")
    public void test(String title) {
        homePage.chooseHomePageMenu("Book Store");
        bookStorePage.chooseBookStoreMenu("Book Store");
        bookStorePage.openBookByTitle(title);
        waitTime();
        bookStorePage.clickBackToBookstore();
        bookStorePage.select("5");
        bookStorePage.numberOfPages("2");
        bookStorePage.clickNextPage();
        bookStorePage.clickPreviousPage();
        waitTime();
        bookStorePage.searchbox(title);
        bookStorePage.clickLoginButton();
    }
}
