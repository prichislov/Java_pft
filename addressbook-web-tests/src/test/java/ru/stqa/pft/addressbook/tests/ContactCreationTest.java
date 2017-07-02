package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Roman on 26.06.2017.
 */
public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation () {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getNavigationHelper().gotoContactCreationPage();
        app.getContactHelper().fillContactForm(new ContactData("Tolik", "Petruchini", "097756575"));
        app.getContactHelper().submitContactForm();
    }
}
