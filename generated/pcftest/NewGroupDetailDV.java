package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewGroupDetailDV.GroupUsersLV_tb;
import pcftest.NewGroupDetailDV.LocalizedValuesLV_tb;
import pcftest.NewGroupDetailDV.Parent;
import pcftest.NewGroupDetailDV.Parent.GroupPickerMenuIcon;
import pcftest.NewGroupDetailDV.Parent.GroupSearchMenuIcon;
import pcftest.NewGroupDetailDV.Supervisor;
import pcftest.NewGroupDetailDV.Supervisor.SupervisorUserSearchMenuItem;
import pcftest.NewGroupDetailDV.Supervisor.SupervisorUserSelectMenuItem;
import pcftest.NewGroupDetailDV.Type;
import typekey.GroupType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewGroupDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "f1953d23e0d579d25790de1500c44b9f";
  
  public NewGroupDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GroupUsersLV getGroupUsersLV() {
    return getOrCreateProperty("GroupUsersLV", "GroupUsersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupUsersLV.class);
  }
  
  public GroupUsersLV_tb getGroupUsersLV_tb() {
    return getOrCreateProperty("GroupUsersLV_tb", "GroupUsersLV_tb", null, pcftest.NewGroupDetailDV.GroupUsersLV_tb.class);
  }
  
  public ValueElement getLoadFactor() {
    return getOrCreateProperty("LoadFactor", "LoadFactor", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LocalizedValuesLV getLocalizedValuesLV() {
    return getOrCreateProperty("LocalizedValuesLV", "LocalizedValuesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LocalizedValuesLV.class);
  }
  
  public LocalizedValuesLV_tb getLocalizedValuesLV_tb() {
    return getOrCreateProperty("LocalizedValuesLV_tb", "LocalizedValuesLV_tb", null, pcftest.NewGroupDetailDV.LocalizedValuesLV_tb.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNameKanji() {
    return getOrCreateProperty("NameKanji", "NameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Parent getParent() {
    return getOrCreateProperty("Parent", "Parent", null, pcftest.NewGroupDetailDV.Parent.class);
  }
  
  public SelectElement getSecurityZone() {
    return getOrCreateProperty("SecurityZone", "SecurityZone", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Supervisor getSupervisor() {
    return getOrCreateProperty("Supervisor", "Supervisor", null, pcftest.NewGroupDetailDV.Supervisor.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.NewGroupDetailDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsersLV_tb extends PCFElement {
    public GroupUsersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewGroupDetailDV.GroupUsersLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewGroupDetailDV.GroupUsersLV_tb.Add.class);
    }
    
    public pcftest.NewGroupDetailDV.GroupUsersLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewGroupDetailDV.GroupUsersLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValuesLV_tb extends PCFElement {
    public LocalizedValuesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewGroupDetailDV.LocalizedValuesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewGroupDetailDV.LocalizedValuesLV_tb.Add.class);
    }
    
    public pcftest.NewGroupDetailDV.LocalizedValuesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewGroupDetailDV.LocalizedValuesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Parent extends SelectElement {
    public Parent(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.NewGroupDetailDV.Parent.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.NewGroupDetailDV.Parent.GroupSearchMenuIcon.class);
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
  public static class Supervisor extends SelectElement {
    public Supervisor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SupervisorUserSearchMenuItem getSupervisorUserSearchMenuItem() {
      return getOrCreateProperty("SupervisorUserSearchMenuItem", "SupervisorUserSearchMenuItem", null, pcftest.NewGroupDetailDV.Supervisor.SupervisorUserSearchMenuItem.class);
    }
    
    public SupervisorUserSelectMenuItem getSupervisorUserSelectMenuItem() {
      return getOrCreateProperty("SupervisorUserSelectMenuItem", "SupervisorUserSelectMenuItem", null, pcftest.NewGroupDetailDV.Supervisor.SupervisorUserSelectMenuItem.class);
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
  @Generated(comments = "config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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