package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserVacationDV.BackupUser;
import pcftest.UserVacationDV.BackupUser.BackupUserUserSearchMenuItem;
import pcftest.UserVacationDV.BackupUser.BackupUserUserSelectMenuItem;
import pcftest.UserVacationDV.VacationStatus;
import typekey.VacationStatusType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/vacationstatus/UserVacationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserVacationDV extends DetailViewElement {
  public final static String CHECKSUM = "cac87316f5c138536300d613a40c028f";
  
  public UserVacationDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BackupUser getBackupUser() {
    return getOrCreateProperty("BackupUser", "BackupUser", null, pcftest.UserVacationDV.BackupUser.class);
  }
  
  public VacationStatus getVacationStatus() {
    return getOrCreateProperty("VacationStatus", "VacationStatus", null, pcftest.UserVacationDV.VacationStatus.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BackupUser extends SelectElement {
    public BackupUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BackupUserUserSearchMenuItem getBackupUserUserSearchMenuItem() {
      return getOrCreateProperty("BackupUserUserSearchMenuItem", "BackupUserUserSearchMenuItem", null, pcftest.UserVacationDV.BackupUser.BackupUserUserSearchMenuItem.class);
    }
    
    public BackupUserUserSelectMenuItem getBackupUserUserSelectMenuItem() {
      return getOrCreateProperty("BackupUserUserSelectMenuItem", "BackupUserUserSelectMenuItem", null, pcftest.UserVacationDV.BackupUser.BackupUserUserSelectMenuItem.class);
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
  @Generated(comments = "config/web/pcf/workspace/vacationstatus/UserVacationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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