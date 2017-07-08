package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Roman on 25.06.2017.
 */
public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){

        app.getNavigationHelper().gotoGroupsPage();
        if(!app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("TEST", null, null));
        }
            app.getGroupHelper().selectGroup();
        app.getGroupHelper().initModificationGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("groupTest", "TEST1","Test2"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
