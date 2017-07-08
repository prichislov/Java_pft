package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Roman on 26.06.2017.
 */
public class ContactDeletingTest extends TestBase {

    @Test
    public void testContactDeleting (){

        app.getNavigationHelper().gotoHomePage();
        if (!app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("Tolik1", "Petruchini1", "097756575", "TEST"),true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectContact();
        app.getContactHelper().confirmDeletingContact();
        app.getNavigationHelper().gotoHomePage();
    }
}
