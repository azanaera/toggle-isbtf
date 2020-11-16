package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
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
import pcftest.GroupUserLV.GroupHeader;
import pcftest.GroupUserLV.ParentGroupHeader;
import pcftest.GroupUserLV.UserHeader;
import pcftest.GroupUserLV._ListPaging;
import pcftest.GroupUserLV.entry;
import pcftest.GroupUserLV.entry.Group;
import pcftest.GroupUserLV.entry.ParentGroup;
import pcftest.GroupUserLV.entry._Select;
import pcftest.GroupUserLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupUserLV extends PCFElement {
  public final static String CHECKSUM = "347ef16867691c8d9423205edc1ef1a5";
  
  public GroupUserLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GroupHeader getGroupHeader() {
    return getOrCreateProperty("GroupHeader", "GroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUserLV.GroupHeader.class);
  }
  
  public ParentGroupHeader getParentGroupHeader() {
    return getOrCreateProperty("ParentGroupHeader", "ParentGroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUserLV.ParentGroupHeader.class);
  }
  
  public UserHeader getUserHeader() {
    return getOrCreateProperty("UserHeader", "UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupUserLV.UserHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.GroupUserLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.GroupUserLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupHeader extends ValueElement {
    public GroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ParentGroupHeader extends ValueElement {
    public ParentGroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserHeader extends ValueElement {
    public UserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Group getGroup() {
      return getOrCreateProperty("Group", "Group", null, pcftest.GroupUserLV.entry.Group.class);
    }
    
    public ParentGroup getParentGroup() {
      return getOrCreateProperty("ParentGroup", "ParentGroup", null, pcftest.GroupUserLV.entry.ParentGroup.class);
    }
    
    public ValueElement getUser() {
      return getOrCreateProperty("User", "User", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupUserLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupUserLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Group extends SelectElement {
      public Group(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.GroupUserLV.entry.Group.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupUserLV.entry.Group.GroupPickerMenuIcon.class);
      }
      
      public pcftest.GroupUserLV.entry.Group.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupUserLV.entry.Group.GroupSearchMenuIcon.class);
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
    public static class ParentGroup extends SelectElement {
      public ParentGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.GroupUserLV.entry.ParentGroup.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupUserLV.entry.ParentGroup.GroupPickerMenuIcon.class);
      }
      
      public pcftest.GroupUserLV.entry.ParentGroup.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupUserLV.entry.ParentGroup.GroupSearchMenuIcon.class);
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
    @Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/GroupUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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