package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.EditableLoadFactorsLV.BackupUserHeader;
import pcftest.EditableLoadFactorsLV.LoadFactorHeader;
import pcftest.EditableLoadFactorsLV.LoadFactor_UserHeader;
import pcftest.EditableLoadFactorsLV.VacationStatusHeader;
import pcftest.EditableLoadFactorsLV._ListPaging;
import pcftest.EditableLoadFactorsLV.entry;
import pcftest.EditableLoadFactorsLV.entry.BackupUser;
import pcftest.EditableLoadFactorsLV.entry.BackupUser.BackupUserUserSearchMenuItem;
import pcftest.EditableLoadFactorsLV.entry.BackupUser.BackupUserUserSelectMenuItem;
import pcftest.EditableLoadFactorsLV.entry.LoadFactor_User;
import pcftest.EditableLoadFactorsLV.entry.LoadFactor_User.LoadFactor_UserUserSearchMenuItem;
import pcftest.EditableLoadFactorsLV.entry.LoadFactor_User.LoadFactor_UserUserSelectMenuItem;
import pcftest.EditableLoadFactorsLV.entry.VacationStatus;
import pcftest.EditableLoadFactorsLV.entry._Select;
import pcftest.EditableLoadFactorsLV.entry._ViewDetail;
import typekey.VacationStatusType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableLoadFactorsLV extends PCFElement {
  public final static String CHECKSUM = "447c845f242bccb176b8671d987781b7";
  
  public EditableLoadFactorsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BackupUserHeader getBackupUserHeader() {
    return getOrCreateProperty("BackupUserHeader", "BackupUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableLoadFactorsLV.BackupUserHeader.class);
  }
  
  public LoadFactorHeader getLoadFactorHeader() {
    return getOrCreateProperty("LoadFactorHeader", "LoadFactorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableLoadFactorsLV.LoadFactorHeader.class);
  }
  
  public LoadFactor_UserHeader getLoadFactor_UserHeader() {
    return getOrCreateProperty("LoadFactor_UserHeader", "LoadFactor_UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableLoadFactorsLV.LoadFactor_UserHeader.class);
  }
  
  public VacationStatusHeader getVacationStatusHeader() {
    return getOrCreateProperty("VacationStatusHeader", "VacationStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableLoadFactorsLV.VacationStatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableLoadFactorsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableLoadFactorsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BackupUserHeader extends ValueElement {
    public BackupUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorHeader extends ValueElement {
    public LoadFactorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactor_UserHeader extends ValueElement {
    public LoadFactor_UserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationStatusHeader extends ValueElement {
    public VacationStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BackupUser getBackupUser() {
      return getOrCreateProperty("BackupUser", "BackupUser", null, pcftest.EditableLoadFactorsLV.entry.BackupUser.class);
    }
    
    public ValueElement getLoadFactor() {
      return getOrCreateProperty("LoadFactor", "LoadFactor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LoadFactor_User getLoadFactor_User() {
      return getOrCreateProperty("LoadFactor_User", "LoadFactor_User", null, pcftest.EditableLoadFactorsLV.entry.LoadFactor_User.class);
    }
    
    public VacationStatus getVacationStatus() {
      return getOrCreateProperty("VacationStatus", "VacationStatus", null, pcftest.EditableLoadFactorsLV.entry.VacationStatus.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableLoadFactorsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableLoadFactorsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BackupUser extends SelectElement {
      public BackupUser(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BackupUserUserSearchMenuItem getBackupUserUserSearchMenuItem() {
        return getOrCreateProperty("BackupUserUserSearchMenuItem", "BackupUserUserSearchMenuItem", null, pcftest.EditableLoadFactorsLV.entry.BackupUser.BackupUserUserSearchMenuItem.class);
      }
      
      public BackupUserUserSelectMenuItem getBackupUserUserSelectMenuItem() {
        return getOrCreateProperty("BackupUserUserSelectMenuItem", "BackupUserUserSelectMenuItem", null, pcftest.EditableLoadFactorsLV.entry.BackupUser.BackupUserUserSelectMenuItem.class);
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
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadFactor_User extends SelectElement {
      public LoadFactor_User(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LoadFactor_UserUserSearchMenuItem getLoadFactor_UserUserSearchMenuItem() {
        return getOrCreateProperty("LoadFactor_UserUserSearchMenuItem", "LoadFactor_UserUserSearchMenuItem", null, pcftest.EditableLoadFactorsLV.entry.LoadFactor_User.LoadFactor_UserUserSearchMenuItem.class);
      }
      
      public LoadFactor_UserUserSelectMenuItem getLoadFactor_UserUserSelectMenuItem() {
        return getOrCreateProperty("LoadFactor_UserUserSelectMenuItem", "LoadFactor_UserUserSelectMenuItem", null, pcftest.EditableLoadFactorsLV.entry.LoadFactor_User.LoadFactor_UserUserSelectMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadFactor_UserUserSearchMenuItem extends ClickableActionElement {
        public LoadFactor_UserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSearchPopup click() {
          return clickThis(pcftest.UserSearchPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadFactor_UserUserSelectMenuItem extends ClickableActionElement {
        public LoadFactor_UserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSelectPopup click() {
          return clickThis(pcftest.UserSelectPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}