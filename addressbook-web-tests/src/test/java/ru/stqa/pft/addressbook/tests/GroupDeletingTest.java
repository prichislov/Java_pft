package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletingTest extends TestBase {
    

    @Test
    public void testGroupDeliting() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getNavigationHelper().gotoGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
