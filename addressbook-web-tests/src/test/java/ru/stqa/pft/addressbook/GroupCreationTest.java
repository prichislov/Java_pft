package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupsPage();
        initGroupCreation();
        fillGroupForm(new GroupData("groupTest", "Test2", "Test2"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
