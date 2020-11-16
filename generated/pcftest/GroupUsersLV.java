package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.GroupUsersLV.BackupUserHeader;
import pcftest.GroupUsersLV.GroupUsers_ActiveHeader;
import pcftest.GroupUsersLV.GroupUsers_LoadFactorTypeHeader;
import pcftest.GroupUsersLV.GroupUsers_ManagerHeader;
import pcftest.GroupUsersLV.GroupUsers_MemberHeader;
import pcftest.GroupUsersLV.GroupUsers_UserHeader;
import pcftest.GroupUsersLV.LoadFactorHeader;
import pcftest.GroupUsersLV.ProximitySearchStatusHeader;
import pcftest.GroupUsersLV.VacationStatusHeader;
import pcftest.GroupUsersLV.WeightedWorkloadHeader;
import pcftest.GroupUsersLV._ListPaging;
import pcftest.GroupUsersLV.entry;
import pcftest.GroupUsersLV.entry.BackupUser;
import pcftest.GroupUsersLV.entry.BackupUser.BackupUserUserSearchMenuItem;
import pcftest.GroupUsersLV.entry.BackupUser.BackupUserUserSelectMenuItem;
import pcftest.GroupUsersLV.entry.GroupUsers_LoadFactorType;
import pcftest.GroupUsersLV.entry.GroupUsers_User;
import pcftest.GroupUsersLV.entry.GroupUsers_User.GroupUsers_UserUserSearchMenuItem;
import pcftest.GroupUsersLV.entry.GroupUsers_User.GroupUsers_UserUserSelectMenuItem;
import pcftest.GroupUsersLV.entry.VacationStatus;
import pcftest.GroupUsersLV.entry._Select;
import pcftest.GroupUsersLV.entry._ViewDetail;
import typekey.LoadFactorType;
import typekey.VacationStatusType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupUsersLV extends PCFElement {
  public final static String CHECKSUM = "9a82b2476f17e6415707561ae8e02941";
  
  public GroupUsersLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BackupUserHeader getBackupUserHeader() {
    return getOrCreateProperty("BackupUserHeader", "BackupUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.BackupUserHeader.class);
  }
  
  public GroupUsers_ActiveHeader getGroupUsers_ActiveHeader() {
    return getOrCreateProperty("GroupUsers_ActiveHeader", "GroupUsers_ActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.GroupUsers_ActiveHeader.class);
  }
  
  public GroupUsers_LoadFactorTypeHeader getGroupUsers_LoadFactorTypeHeader() {
    return getOrCreateProperty("GroupUsers_LoadFactorTypeHeader", "GroupUsers_LoadFactorTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.GroupUsers_LoadFactorTypeHeader.class);
  }
  
  public GroupUsers_ManagerHeader getGroupUsers_ManagerHeader() {
    return getOrCreateProperty("GroupUsers_ManagerHeader", "GroupUsers_ManagerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.GroupUsers_ManagerHeader.class);
  }
  
  public GroupUsers_MemberHeader getGroupUsers_MemberHeader() {
    return getOrCreateProperty("GroupUsers_MemberHeader", "GroupUsers_MemberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.GroupUsers_MemberHeader.class);
  }
  
  public GroupUsers_UserHeader getGroupUsers_UserHeader() {
    return getOrCreateProperty("GroupUsers_UserHeader", "GroupUsers_UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.GroupUsers_UserHeader.class);
  }
  
  public LoadFactorHeader getLoadFactorHeader() {
    return getOrCreateProperty("LoadFactorHeader", "LoadFactorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.LoadFactorHeader.class);
  }
  
  public ProximitySearchStatusHeader getProximitySearchStatusHeader() {
    return getOrCreateProperty("ProximitySearchStatusHeader", "ProximitySearchStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.ProximitySearchStatusHeader.class);
  }
  
  public VacationStatusHeader getVacationStatusHeader() {
    return getOrCreateProperty("VacationStatusHeader", "VacationStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.VacationStatusHeader.class);
  }
  
  public WeightedWorkloadHeader getWeightedWorkloadHeader() {
    return getOrCreateProperty("WeightedWorkloadHeader", "WeightedWorkloadHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUsersLV.WeightedWorkloadHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.GroupUsersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.GroupUsersLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BackupUserHeader extends ValueElement {
    public BackupUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsers_ActiveHeader extends ValueElement {
    public GroupUsers_ActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsers_LoadFactorTypeHeader extends ValueElement {
    public GroupUsers_LoadFactorTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsers_ManagerHeader extends ValueElement {
    public GroupUsers_ManagerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsers_MemberHeader extends ValueElement {
    public GroupUsers_MemberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsers_UserHeader extends ValueElement {
    public GroupUsers_UserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorHeader extends ValueElement {
    public LoadFactorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProximitySearchStatusHeader extends ValueElement {
    public ProximitySearchStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationStatusHeader extends ValueElement {
    public VacationStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WeightedWorkloadHeader extends ValueElement {
    public WeightedWorkloadHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BackupUser getBackupUser() {
      return getOrCreateProperty("BackupUser", "BackupUser", null, pcftest.GroupUsersLV.entry.BackupUser.class);
    }
    
    public CheckboxValueElement getGroupUsers_Active() {
      return getOrCreateProperty("GroupUsers_Active", "GroupUsers_Active", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public GroupUsers_LoadFactorType getGroupUsers_LoadFactorType() {
      return getOrCreateProperty("GroupUsers_LoadFactorType", "GroupUsers_LoadFactorType", null, pcftest.GroupUsersLV.entry.GroupUsers_LoadFactorType.class);
    }
    
    public CheckboxValueElement getGroupUsers_Manager() {
      return getOrCreateProperty("GroupUsers_Manager", "GroupUsers_Manager", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getGroupUsers_Member() {
      return getOrCreateProperty("GroupUsers_Member", "GroupUsers_Member", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public GroupUsers_User getGroupUsers_User() {
      return getOrCreateProperty("GroupUsers_User", "GroupUsers_User", null, pcftest.GroupUsersLV.entry.GroupUsers_User.class);
    }
    
    public ValueElement getLoadFactor() {
      return getOrCreateProperty("LoadFactor", "LoadFactor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.GroupUsersLV.entry.ProximitySearchStatus getProximitySearchStatus() {
      return getOrCreateProperty("ProximitySearchStatus", "ProximitySearchStatus", null, pcftest.GroupUsersLV.entry.ProximitySearchStatus.class);
    }
    
    public VacationStatus getVacationStatus() {
      return getOrCreateProperty("VacationStatus", "VacationStatus", null, pcftest.GroupUsersLV.entry.VacationStatus.class);
    }
    
    public ValueElement getWeightedWorkload() {
      return getOrCreateProperty("WeightedWorkload", "WeightedWorkload", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupUsersLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupUsersLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BackupUser extends SelectElement {
      public BackupUser(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BackupUserUserSearchMenuItem getBackupUserUserSearchMenuItem() {
        return getOrCreateProperty("BackupUserUserSearchMenuItem", "BackupUserUserSearchMenuItem", null, pcftest.GroupUsersLV.entry.BackupUser.BackupUserUserSearchMenuItem.class);
      }
      
      public BackupUserUserSelectMenuItem getBackupUserUserSelectMenuItem() {
        return getOrCreateProperty("BackupUserUserSelectMenuItem", "BackupUserUserSelectMenuItem", null, pcftest.GroupUsersLV.entry.BackupUser.BackupUserUserSelectMenuItem.class);
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
    @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupUsers_LoadFactorType extends SelectElement {
      public GroupUsers_LoadFactorType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LoadFactorType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LoadFactorType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LoadFactorType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LoadFactorType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupUsers_User extends SelectElement {
      public GroupUsers_User(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserDetailPage click() {
        return clickThis(pcftest.UserDetailPage.class);
      }
      
      public GroupUsers_UserUserSearchMenuItem getGroupUsers_UserUserSearchMenuItem() {
        return getOrCreateProperty("GroupUsers_UserUserSearchMenuItem", "GroupUsers_UserUserSearchMenuItem", null, pcftest.GroupUsersLV.entry.GroupUsers_User.GroupUsers_UserUserSearchMenuItem.class);
      }
      
      public GroupUsers_UserUserSelectMenuItem getGroupUsers_UserUserSelectMenuItem() {
        return getOrCreateProperty("GroupUsers_UserUserSelectMenuItem", "GroupUsers_UserUserSelectMenuItem", null, pcftest.GroupUsersLV.entry.GroupUsers_User.GroupUsers_UserUserSelectMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupUsers_UserUserSearchMenuItem extends ClickableActionElement {
        public GroupUsers_UserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSearchPopup click() {
          return clickThis(pcftest.UserSearchPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupUsers_UserUserSelectMenuItem extends ClickableActionElement {
        public GroupUsers_UserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSelectPopup click() {
          return clickThis(pcftest.UserSelectPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProximitySearchStatus extends SelectElement {
      public ProximitySearchStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.ProximitySearchStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.ProximitySearchStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ProximitySearchStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.ProximitySearchStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/GroupUsersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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