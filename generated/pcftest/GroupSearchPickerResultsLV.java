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
import pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_NameHeader;
import pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_ParentGroupHeader;
import pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_RelationshipHeader;
import pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_TypeHeader;
import pcftest.GroupSearchPickerResultsLV._ListPaging;
import pcftest.GroupSearchPickerResultsLV.entry;
import pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Name;
import pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_ParentGroup;
import pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Type;
import pcftest.GroupSearchPickerResultsLV.entry._Select;
import pcftest.GroupSearchPickerResultsLV.entry._ViewDetail;
import typekey.GroupType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchPickerResultsLV extends PCFElement {
  public final static String CHECKSUM = "f1ea11ed6b0b2cf6d17a38adb5e2beb4";
  
  public GroupSearchPickerResultsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Web_GroupSearchResults_NameHeader getWeb_GroupSearchResults_NameHeader() {
    return getOrCreateProperty("Web_GroupSearchResults_NameHeader", "Web_GroupSearchResults_NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_NameHeader.class);
  }
  
  public Web_GroupSearchResults_ParentGroupHeader getWeb_GroupSearchResults_ParentGroupHeader() {
    return getOrCreateProperty("Web_GroupSearchResults_ParentGroupHeader", "Web_GroupSearchResults_ParentGroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_ParentGroupHeader.class);
  }
  
  public Web_GroupSearchResults_RelationshipHeader getWeb_GroupSearchResults_RelationshipHeader() {
    return getOrCreateProperty("Web_GroupSearchResults_RelationshipHeader", "Web_GroupSearchResults_RelationshipHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_RelationshipHeader.class);
  }
  
  public Web_GroupSearchResults_TypeHeader getWeb_GroupSearchResults_TypeHeader() {
    return getOrCreateProperty("Web_GroupSearchResults_TypeHeader", "Web_GroupSearchResults_TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupSearchPickerResultsLV.Web_GroupSearchResults_TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.GroupSearchPickerResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.GroupSearchPickerResultsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Web_GroupSearchResults_NameHeader extends ValueElement {
    public Web_GroupSearchResults_NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Web_GroupSearchResults_ParentGroupHeader extends ValueElement {
    public Web_GroupSearchResults_ParentGroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Web_GroupSearchResults_RelationshipHeader extends ValueElement {
    public Web_GroupSearchResults_RelationshipHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Web_GroupSearchResults_TypeHeader extends ValueElement {
    public Web_GroupSearchResults_TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Web_GroupSearchResults_Name getWeb_GroupSearchResults_Name() {
      return getOrCreateProperty("Web_GroupSearchResults_Name", "Web_GroupSearchResults_Name", null, pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Name.class);
    }
    
    public Web_GroupSearchResults_ParentGroup getWeb_GroupSearchResults_ParentGroup() {
      return getOrCreateProperty("Web_GroupSearchResults_ParentGroup", "Web_GroupSearchResults_ParentGroup", null, pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_ParentGroup.class);
    }
    
    public ValueElement getWeb_GroupSearchResults_Relationship() {
      return getOrCreateProperty("Web_GroupSearchResults_Relationship", "Web_GroupSearchResults_Relationship", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Web_GroupSearchResults_Type getWeb_GroupSearchResults_Type() {
      return getOrCreateProperty("Web_GroupSearchResults_Type", "Web_GroupSearchResults_Type", null, pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupSearchPickerResultsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupSearchPickerResultsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Web_GroupSearchResults_Name extends SelectElement {
      public Web_GroupSearchResults_Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Name.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Name.GroupPickerMenuIcon.class);
      }
      
      public pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Name.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_Name.GroupSearchMenuIcon.class);
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
    public static class Web_GroupSearchResults_ParentGroup extends SelectElement {
      public Web_GroupSearchResults_ParentGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_ParentGroup.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_ParentGroup.GroupPickerMenuIcon.class);
      }
      
      public pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_ParentGroup.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupSearchPickerResultsLV.entry.Web_GroupSearchResults_ParentGroup.GroupSearchMenuIcon.class);
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
    @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Web_GroupSearchResults_Type extends SelectElement {
      public Web_GroupSearchResults_Type(ISmokeTest helper, PCFElementId componentId)  {
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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