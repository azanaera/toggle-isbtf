package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivitySearchRequiredInputSet.AssignedToGroup;
import pcftest.ActivitySearchRequiredInputSet.AssignedToGroup.GroupPickerMenuIcon;
import pcftest.ActivitySearchRequiredInputSet.AssignedToGroup.GroupSearchMenuIcon;
import pcftest.ActivitySearchRequiredInputSet.AssignedToUser;
import pcftest.ActivitySearchRequiredInputSet.AssignedToUser.AssignedToUserUserSearchMenuItem;
import pcftest.ActivitySearchRequiredInputSet.AssignedToUser.AssignedToUserUserSelectMenuItem;
import pcftest.ActivitySearchRequiredInputSet.CreatedBy;
import pcftest.ActivitySearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem;
import pcftest.ActivitySearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem;
import pcftest.ActivitySearchRequiredInputSet.ExternalOwner;
import pcftest.ActivitySearchRequiredInputSet.ExternalOwner.MenuItem_NoneSelected;
import pcftest.ActivitySearchRequiredInputSet.ExternalOwner.MenuItem_Search;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/activities/ActivitySearchRequiredInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySearchRequiredInputSet extends PCFElement {
  public final static String CHECKSUM = "28287aaebee691b853a280aab42a086a";
  
  public ActivitySearchRequiredInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedToGroup getAssignedToGroup() {
    return getOrCreateProperty("AssignedToGroup", "AssignedToGroup", null, pcftest.ActivitySearchRequiredInputSet.AssignedToGroup.class);
  }
  
  public AssignedToUser getAssignedToUser() {
    return getOrCreateProperty("AssignedToUser", "AssignedToUser", null, pcftest.ActivitySearchRequiredInputSet.AssignedToUser.class);
  }
  
  public ValueElement getClaims_ClaimNumber() {
    return getOrCreateProperty("Claims_ClaimNumber", "Claims_ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CreatedBy getCreatedBy() {
    return getOrCreateProperty("CreatedBy", "CreatedBy", null, pcftest.ActivitySearchRequiredInputSet.CreatedBy.class);
  }
  
  public ExternalOwner getExternalOwner() {
    return getOrCreateProperty("ExternalOwner", "ExternalOwner", null, pcftest.ActivitySearchRequiredInputSet.ExternalOwner.class);
  }
  
  public BooleanValueElement getIncludeSubGroups() {
    return getOrCreateProperty("IncludeSubGroups", "IncludeSubGroups", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedToGroup extends SelectElement {
    public AssignedToGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.ActivitySearchRequiredInputSet.AssignedToGroup.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.ActivitySearchRequiredInputSet.AssignedToGroup.GroupSearchMenuIcon.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupPickerMenuIcon extends ClickableActionElement {
      public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OrganizationGroupTreePopup click() {
        return clickThis(pcftest.OrganizationGroupTreePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupSearchMenuIcon extends ClickableActionElement {
      public GroupSearchMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupSearchPopup click() {
        return clickThis(pcftest.GroupSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedToUser extends SelectElement {
    public AssignedToUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignedToUserUserSearchMenuItem getAssignedToUserUserSearchMenuItem() {
      return getOrCreateProperty("AssignedToUserUserSearchMenuItem", "AssignedToUserUserSearchMenuItem", null, pcftest.ActivitySearchRequiredInputSet.AssignedToUser.AssignedToUserUserSearchMenuItem.class);
    }
    
    public AssignedToUserUserSelectMenuItem getAssignedToUserUserSelectMenuItem() {
      return getOrCreateProperty("AssignedToUserUserSelectMenuItem", "AssignedToUserUserSelectMenuItem", null, pcftest.ActivitySearchRequiredInputSet.AssignedToUser.AssignedToUserUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedToUserUserSearchMenuItem extends ClickableActionElement {
      public AssignedToUserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedToUserUserSelectMenuItem extends ClickableActionElement {
      public AssignedToUserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreatedBy extends SelectElement {
    public CreatedBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreatedByUserSearchMenuItem getCreatedByUserSearchMenuItem() {
      return getOrCreateProperty("CreatedByUserSearchMenuItem", "CreatedByUserSearchMenuItem", null, pcftest.ActivitySearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem.class);
    }
    
    public CreatedByUserSelectMenuItem getCreatedByUserSelectMenuItem() {
      return getOrCreateProperty("CreatedByUserSelectMenuItem", "CreatedByUserSelectMenuItem", null, pcftest.ActivitySearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedByUserSearchMenuItem extends ClickableActionElement {
      public CreatedByUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedByUserSelectMenuItem extends ClickableActionElement {
      public CreatedByUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternalOwner extends ValueElement {
    public ExternalOwner(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.ActivitySearchRequiredInputSet.ExternalOwner.MenuItem_NoneSelected.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ActivitySearchRequiredInputSet.ExternalOwner.MenuItem_Search.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_NoneSelected extends ClickableActionElement {
      public MenuItem_NoneSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    
  }
  
  
}