package steps;

import pages.AddLanguagesPage;
import pages.LoginPage;


public class PageInitializers {

    public static AddLanguagesPage addLanguagesPage;
    public static LoginPage loginPage;


    public static void intializePageObjects(){

        addLanguagesPage=new AddLanguagesPage();
        loginPage=new LoginPage();

    }

}

