package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserDetailInputSet.BackupUser;
import pcftest.UserDetailInputSet.BackupUser.BackupUserUserSearchMenuItem;
import pcftest.UserDetailInputSet.BackupUser.BackupUserUserSelectMenuItem;
import pcftest.UserDetailInputSet.Name;
import pcftest.UserDetailInputSet.VacationStatus;
import typekey.VacationStatusType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/preferences/UserDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserDetailInputSet extends PCFElement {
  public final static String CHECKSUM = "44b8284991d8c63015363b553cebcbfd";
  
  public UserDetailInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAccountLocked() {
    return getOrCreateProperty("AccountLocked", "AccountLocked", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getActive() {
    return getOrCreateProperty("Active", "Active", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BackupUser getBackupUser() {
    return getOrCreateProperty("BackupUser", "BackupUser", null, pcftest.UserDetailInputSet.BackupUser.class);
  }
  
  public ValueElement getConfirmInputWidget() {
    return getOrCreateProperty("ConfirmInputWidget", "ConfirmInputWidget", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Name getName() {
    return getOrCreateProperty("Name", "Name", null, pcftest.UserDetailInputSet.Name.class);
  }
  
  public ValueElement getOldPasswordInputWidget() {
    return getOrCreateProperty("OldPasswordInputWidget", "OldPasswordInputWidget", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPasswordInputWidget() {
    return getOrCreateProperty("PasswordInputWidget", "PasswordInputWidget", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSessionTimeout() {
    return getOrCreateProperty("SessionTimeout", "SessionTimeout", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getUsername() {
    return getOrCreateProperty("Username", "Username", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public VacationStatus getVacationStatus() {
    return getOrCreateProperty("VacationStatus", "VacationStatus", null, pcftest.UserDetailInputSet.VacationStatus.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BackupUser extends SelectElement {
    public BackupUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BackupUserUserSearchMenuItem getBackupUserUserSearchMenuItem() {
      return getOrCreateProperty("BackupUserUserSearchMenuItem", "BackupUserUserSearchMenuItem", null, pcftest.UserDetailInputSet.BackupUser.BackupUserUserSearchMenuItem.class);
    }
    
    public BackupUserUserSelectMenuItem getBackupUserUserSelectMenuItem() {
      return getOrCreateProperty("BackupUserUserSelectMenuItem", "BackupUserUserSelectMenuItem", null, pcftest.UserDetailInputSet.BackupUser.BackupUserUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BackupUserUserSearchMenuItem extends ClickableActionElement {
      public BackupUserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BackupUserUserSelectMenuItem extends ClickableActionElement {
      public BackupUserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Name extends PCFElement {
    public Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
      return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
    }
    
    public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
      return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationStatus extends SelectElement {
    public VacationStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(VacationStatusType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public VacationStatusType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VacationStatusType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(VacationStatusType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}