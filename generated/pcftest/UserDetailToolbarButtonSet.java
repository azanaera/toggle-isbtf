package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserDetailToolbarButtonSet.Cancel;
import pcftest.UserDetailToolbarButtonSet.Edit;
import pcftest.UserDetailToolbarButtonSet.Update;
import pcftest.UserDetailToolbarButtonSet.UserDetailToolbarButtons_DeleteUserButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserDetailToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "286f0320f30cb9c4e038c565029333b7";
  
  public UserDetailToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.UserDetailToolbarButtonSet.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.UserDetailToolbarButtonSet.Edit.class);
  }
  
  public LinkContactToolbarButtonSet getLinkContactToolbarButtonSet() {
    return getOrCreateProperty("LinkContactToolbarButtonSet", "LinkContactToolbarButtonSet", null, pcftest.LinkContactToolbarButtonSet.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.UserDetailToolbarButtonSet.Update.class);
  }
  
  public UserDetailToolbarButtons_DeleteUserButton getUserDetailToolbarButtons_DeleteUserButton() {
    return getOrCreateProperty("UserDetailToolbarButtons_DeleteUserButton", "UserDetailToolbarButtons_DeleteUserButton", null, pcftest.UserDetailToolbarButtonSet.UserDetailToolbarButtons_DeleteUserButton.class);
  }
  
  public ViewAddressBookToolbarButtonSet getViewAddressBookToolbarButtonSet() {
    return getOrCreateProperty("ViewAddressBookToolbarButtonSet", "ViewAddressBookToolbarButtonSet", null, pcftest.ViewAddressBookToolbarButtonSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserDetailToolbarButtons_DeleteUserButton extends ClickableActionElement {
    public UserDetailToolbarButtons_DeleteUserButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}