package ru.stqa.pft.addressbook.appmenager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public void fillContactForm(ContactData data){
        if (data.getFirstName() != null) {
            type(By.name("firstname"), data.getFirstName());
        }
        if (data.getLastName() != null) {
            type(By.name("lastname"), data.getLastName());
        }
        if (data.getCompany() != null) {
            type(By.name("company"), data.getCompany());
        }
        if (data.getTelephoneHome() != null) {
            type(By.name("home"), data.getTelephoneHome());
        }
        if (data.getTelephoneWork() != null) {
            type(By.name("work"), data.getTelephoneWork());
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
