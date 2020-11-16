package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RoleDetailScreen.Cancel;
import pcftest.RoleDetailScreen.Edit;
import pcftest.RoleDetailScreen.RoleDetail_RolesCardTab;
import pcftest.RoleDetailScreen.RoleDetail_UserCardTab;
import pcftest.RoleDetailScreen.RoleUsersLV_tb;
import pcftest.RoleDetailScreen.RoleUsersLV_tb.Add;
import pcftest.RoleDetailScreen.RoleUsersLV_tb.Remove;
import pcftest.RoleDetailScreen.Update;
import pcftest.RoleDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RoleDetailScreen extends PCFElement {
  public final static String CHECKSUM = "39af12be3693cebb218f4df52de7ee33";
  
  public RoleDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RoleDetailScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.RoleDetailScreen.Edit.class);
  }
  
  public LocalizedValuesDV getLocalizedValuesDV() {
    return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
  }
  
  public RoleDetailDV getRoleDetailDV() {
    return getOrCreateProperty("RoleDetailDV", "RoleDetailDV", null, pcftest.RoleDetailDV.class);
  }
  
  public RoleDetail_RolesCardTab getRoleDetail_RolesCardTab() {
    return getOrCreateProperty("RoleDetail_RolesCardTab", "RoleDetail_RolesCardTab", null, pcftest.RoleDetailScreen.RoleDetail_RolesCardTab.class);
  }
  
  public RoleDetail_UserCardTab getRoleDetail_UserCardTab() {
    return getOrCreateProperty("RoleDetail_UserCardTab", "RoleDetail_UserCardTab", null, pcftest.RoleDetailScreen.RoleDetail_UserCardTab.class);
  }
  
  public RoleUsersLV getRoleUsersLV() {
    return getOrCreateProperty("RoleUsersLV", "RoleUsersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RoleUsersLV.class);
  }
  
  public RoleUsersLV_tb getRoleUsersLV_tb() {
    return getOrCreateProperty("RoleUsersLV_tb", "RoleUsersLV_tb", null, pcftest.RoleDetailScreen.RoleUsersLV_tb.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.RoleDetailScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RoleDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoleDetail_RolesCardTab extends ClickableActionElement {
    public RoleDetail_RolesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoleDetail_UserCardTab extends ClickableActionElement {
    public RoleDetail_UserCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoleUsersLV_tb extends PCFElement {
    public RoleUsersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RoleDetailScreen.RoleUsersLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RoleDetailScreen.RoleUsersLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}