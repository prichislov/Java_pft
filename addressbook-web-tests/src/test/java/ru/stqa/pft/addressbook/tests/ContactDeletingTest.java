package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Roman on 26.06.2017.
 */
public class ContactDeletingTest extends TestBase {

    @Test
    public void testContactDeleting (){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectContact();
        app.getContactHelper().confirmDeletingContact();

    }
}
