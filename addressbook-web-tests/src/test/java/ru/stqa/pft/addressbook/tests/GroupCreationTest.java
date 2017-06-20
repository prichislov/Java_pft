package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.gotoGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("groupTest", "Test2", "Test2"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
