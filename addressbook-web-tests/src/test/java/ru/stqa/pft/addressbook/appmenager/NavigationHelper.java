package ru.stqa.pft.addressbook.appmenager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Roman on 20.06.2017.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupsPage() {
        click(By.linkText("groups"));
    }

    public void gotoContactCreationPage() {
        click(By.linkText("add new"));

    }
}
