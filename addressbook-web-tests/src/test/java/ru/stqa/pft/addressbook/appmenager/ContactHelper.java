package ru.stqa.pft.addressbook.appmenager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Roman on 26.06.2017.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactForm(){
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData, boolean forCreation){
//        if (contactData.getFirstName() != null) {
            type(By.name("firstname"), contactData.getFirstName());
//        }
//        if (contactData.getLastName() != null) {
            type(By.name("lastname"), contactData.getLastName());
//        }
//        if (contactData.getCompany() != null) {
            type(By.name("company"), contactData.getCompany());
//        }
//        if (contactData.getTelephoneHome() != null) {
            type(By.name("home"), contactData.getTelephoneHome());
//        }
//        if (contactData.getTelephoneWork() != null) {
            type(By.name("work"), contactData.getTelephoneWork());
//        }
        if(forCreation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void selectContact() {
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            click(By.name("selected[]"));
        }
    }
    public void deleteSelectContact() {
        click(By.cssSelector("input[value ='Delete']"));
    }

    public void confirmDeletingContact() {
        WebDriverWait wait = new WebDriverWait(wd, 3000);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = wd.switchTo().alert();
        alert.accept();
    }

    public void initModificationContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));

    }

    public void updateContactForm() {
        click(By.name("update"));
    }
}
