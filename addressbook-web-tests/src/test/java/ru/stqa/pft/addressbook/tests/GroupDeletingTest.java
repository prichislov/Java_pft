package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletingTest extends TestBase {
    

    @Test
    public void testGroupDeleting() {

        app.getNavigationHelper().gotoGroupsPage();
        if(!app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("TEST",null,null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
