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
import pcftest.UserGroupsLV.GroupHeader;
import pcftest.UserGroupsLV.GroupUserWeightedWorkloadHeader;
import pcftest.UserGroupsLV.LoadFactorHeader;
import pcftest.UserGroupsLV.LoadFactorTypeHeader;
import pcftest.UserGroupsLV.ManagerHeader;
import pcftest.UserGroupsLV.MemberHeader;
import pcftest.UserGroupsLV._ListPaging;
import pcftest.UserGroupsLV.entry;
import pcftest.UserGroupsLV.entry.Group;
import pcftest.UserGroupsLV.entry.Group.GroupPickerMenuIcon;
import pcftest.UserGroupsLV.entry.Group.GroupSearchMenuIcon;
import pcftest.UserGroupsLV.entry._Select;
import pcftest.UserGroupsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserGroupsLV extends PCFElement {
  public final static String CHECKSUM = "bfa428f797c950825a296f69717b978d";
  
  public UserGroupsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GroupHeader getGroupHeader() {
    return getOrCreateProperty("GroupHeader", "GroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserGroupsLV.GroupHeader.class);
  }
  
  public GroupUserWeightedWorkloadHeader getGroupUserWeightedWorkloadHeader() {
    return getOrCreateProperty("GroupUserWeightedWorkloadHeader", "GroupUserWeightedWorkloadHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserGroupsLV.GroupUserWeightedWorkloadHeader.class);
  }
  
  public LoadFactorHeader getLoadFactorHeader() {
    return getOrCreateProperty("LoadFactorHeader", "LoadFactorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserGroupsLV.LoadFactorHeader.class);
  }
  
  public LoadFactorTypeHeader getLoadFactorTypeHeader() {
    return getOrCreateProperty("LoadFactorTypeHeader", "LoadFactorTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserGroupsLV.LoadFactorTypeHeader.class);
  }
  
  public ManagerHeader getManagerHeader() {
    return getOrCreateProperty("ManagerHeader", "ManagerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserGroupsLV.ManagerHeader.class);
  }
  
  public MemberHeader getMemberHeader() {
    return getOrCreateProperty("MemberHeader", "MemberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserGroupsLV.MemberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.UserGroupsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.UserGroupsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupHeader extends ValueElement {
    public GroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUserWeightedWorkloadHeader extends ValueElement {
    public GroupUserWeightedWorkloadHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorHeader extends ValueElement {
    public LoadFactorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorTypeHeader extends ValueElement {
    public LoadFactorTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManagerHeader extends ValueElement {
    public ManagerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MemberHeader extends ValueElement {
    public MemberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Group getGroup() {
      return getOrCreateProperty("Group", "Group", null, pcftest.UserGroupsLV.entry.Group.class);
    }
    
    public ValueElement getGroupUserWeightedWorkload() {
      return getOrCreateProperty("GroupUserWeightedWorkload", "GroupUserWeightedWorkload", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLoadFactor() {
      return getOrCreateProperty("LoadFactor", "LoadFactor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.UserGroupsLV.entry.LoadFactorType getLoadFactorType() {
      return getOrCreateProperty("LoadFactorType", "LoadFactorType", null, pcftest.UserGroupsLV.entry.LoadFactorType.class);
    }
    
    public BooleanValueElement getManager() {
      return getOrCreateProperty("Manager", "Manager", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getMember() {
      return getOrCreateProperty("Member", "Member", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.UserGroupsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UserGroupsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Group extends SelectElement {
      public Group(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.UserGroupsLV.entry.Group.GroupPickerMenuIcon.class);
      }
      
      public GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.UserGroupsLV.entry.Group.GroupSearchMenuIcon.class);
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
    @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadFactorType extends SelectElement {
      public LoadFactorType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LoadFactorType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LoadFactorType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LoadFactorType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LoadFactorType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserGroupsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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