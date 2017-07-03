package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletingTest extends TestBase {
    

    @Test
    public void testGroupDeliting() {

        app.getNavigationHelper().gotoGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
