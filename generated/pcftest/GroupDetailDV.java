package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupDetailDV.NameReadOnly;
import pcftest.GroupDetailDV.Parent;
import pcftest.GroupDetailDV.SecurityZone;
import pcftest.GroupDetailDV.Supervisor;
import pcftest.GroupDetailDV.Supervisor.SupervisorUserSearchMenuItem;
import pcftest.GroupDetailDV.Supervisor.SupervisorUserSelectMenuItem;
import pcftest.GroupDetailDV.Type;
import typekey.GroupType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/GroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "2cf3f77d31139fdf48c9133fd0c195d9";
  
  public GroupDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNameKanji() {
    return getOrCreateProperty("NameKanji", "NameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameReadOnly getNameReadOnly() {
    return getOrCreateProperty("NameReadOnly", "NameReadOnly", null, pcftest.GroupDetailDV.NameReadOnly.class);
  }
  
  public Parent getParent() {
    return getOrCreateProperty("Parent", "Parent", null, pcftest.GroupDetailDV.Parent.class);
  }
  
  public SecurityZone getSecurityZone() {
    return getOrCreateProperty("SecurityZone", "SecurityZone", null, pcftest.GroupDetailDV.SecurityZone.class);
  }
  
  public Supervisor getSupervisor() {
    return getOrCreateProperty("Supervisor", "Supervisor", null, pcftest.GroupDetailDV.Supervisor.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.GroupDetailDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameReadOnly extends SelectElement {
    public NameReadOnly(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.GroupDetailDV.NameReadOnly.GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupDetailDV.NameReadOnly.GroupPickerMenuIcon.class);
    }
    
    public pcftest.GroupDetailDV.NameReadOnly.GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupDetailDV.NameReadOnly.GroupSearchMenuIcon.class);
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
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Parent extends SelectElement {
    public Parent(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupDetailPage click() {
      return clickThis(pcftest.GroupDetailPage.class);
    }
    
    public pcftest.GroupDetailDV.Parent.GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupDetailDV.Parent.GroupPickerMenuIcon.class);
    }
    
    public pcftest.GroupDetailDV.Parent.GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupDetailDV.Parent.GroupSearchMenuIcon.class);
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
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZone extends SelectElement {
    public SecurityZone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SecurityZoneDetail click() {
      return clickThis(pcftest.SecurityZoneDetail.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Supervisor extends SelectElement {
    public Supervisor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserDetailPage click() {
      return clickThis(pcftest.UserDetailPage.class);
    }
    
    public SupervisorUserSearchMenuItem getSupervisorUserSearchMenuItem() {
      return getOrCreateProperty("SupervisorUserSearchMenuItem", "SupervisorUserSearchMenuItem", null, pcftest.GroupDetailDV.Supervisor.SupervisorUserSearchMenuItem.class);
    }
    
    public SupervisorUserSelectMenuItem getSupervisorUserSelectMenuItem() {
      return getOrCreateProperty("SupervisorUserSelectMenuItem", "SupervisorUserSelectMenuItem", null, pcftest.GroupDetailDV.Supervisor.SupervisorUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SupervisorUserSearchMenuItem extends ClickableActionElement {
      public SupervisorUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SupervisorUserSelectMenuItem extends ClickableActionElement {
      public SupervisorUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(GroupType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public GroupType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GroupType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(GroupType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}