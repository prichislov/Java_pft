package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletingTest extends TestBase {
    

    @Test
    public void testGroupDeliting() {

        app.gotoGroupsPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}
