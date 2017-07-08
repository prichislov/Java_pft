package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Roman on 26.06.2017.
 */
public class ContactDeletingTest extends TestBase {

    @Test
    public void testContactDeleting (){

        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectContact();
        app.getContactHelper().confirmDeletingContact();
        app.getNavigationHelper().gotoHomePage();
    }
}
