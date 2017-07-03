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
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initModificationGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("edit", "editHeader", "editFooter"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
