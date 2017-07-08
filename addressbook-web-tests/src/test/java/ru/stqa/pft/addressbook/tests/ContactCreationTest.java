package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Roman on 26.06.2017.
 */
public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation () {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Tolik", "Petruchini", "097756575", "TEST"),true);
        app.getContactHelper().submitContactForm();
        app.getNavigationHelper().gotoHomePage();
    }
}
