package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddLanguagesPage extends CommonMethods{

        @FindBy(id = "txtUsername")
        public WebElement usernameBox;

        @FindBy(id="menu_admin_viewAdminModule")
        public  WebElement adminOption;

       @FindBy(id="menu_admin_Qualifications")
       public WebElement qualificationOption;

       @FindBy(id="menu_admin_viewLanguages")
       public WebElement langList;

       @FindBy(id="btnAdd")
       public WebElement addBttn;

       @FindBy(id ="language_name")
       public WebElement langField;


       @FindBy(id="btnSave")
       public WebElement saveBtn;

       @FindBy(id="recordsListTable")
       public WebElement listTable;

        public AddLanguagesPage() {
            PageFactory.initElements(driver, this);

        }
    }

