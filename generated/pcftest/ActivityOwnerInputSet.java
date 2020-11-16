package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityOwnerInputSet.AssignedGroup;
import pcftest.ActivityOwnerInputSet.AssignedGroup.GroupPickerMenuIcon;
import pcftest.ActivityOwnerInputSet.AssignedGroup.GroupSearchMenuIcon;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityOwnerInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityOwnerInputSet extends PCFElement {
  public final static String CHECKSUM = "58f2059d56fa7a5f5a567dda84648cb1";
  
  public ActivityOwnerInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getAssignDate() {
    return getOrCreateProperty("AssignDate", "AssignDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getAssignedBy() {
    return getOrCreateProperty("AssignedBy", "AssignedBy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AssignedGroup getAssignedGroup() {
    return getOrCreateProperty("AssignedGroup", "AssignedGroup", null, pcftest.ActivityOwnerInputSet.AssignedGroup.class);
  }
  
  public ValueElement getInternalOwner() {
    return getOrCreateProperty("InternalOwner", "InternalOwner", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedGroup extends SelectElement {
    public AssignedGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.ActivityOwnerInputSet.AssignedGroup.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.ActivityOwnerInputSet.AssignedGroup.GroupSearchMenuIcon.class);
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
  
  
}