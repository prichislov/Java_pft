package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Roman on 03.07.2017.
 */
public class ContactModificationTest extends TestBase {

    @Test
    public  void testContactModification(){
        app.getNavigationHelper().gotoHomePage();
        if (!app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("Tolik1", "Petruchini1", "097756575", "TEST"),true);
        }
        app.getContactHelper().initModificationContact();
        app.getContactHelper().fillContactForm(new ContactData("ModifyName","ModifyName","telephoneModify",""),false);
        app.getContactHelper().updateContactForm();
        app.getNavigationHelper().gotoHomePage();
    }
}
