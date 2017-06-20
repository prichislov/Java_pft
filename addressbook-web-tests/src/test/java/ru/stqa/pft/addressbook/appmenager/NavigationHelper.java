package ru.stqa.pft.addressbook.appmenager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Roman on 20.06.2017.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
