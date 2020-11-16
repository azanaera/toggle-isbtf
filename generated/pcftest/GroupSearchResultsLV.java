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
import pcftest.GroupSearchResultsLV.NameHeader;
import pcftest.GroupSearchResultsLV.ParentGroupHeader;
import pcftest.GroupSearchResultsLV.TypeHeader;
import pcftest.GroupSearchResultsLV._ListPaging;
import pcftest.GroupSearchResultsLV.entry;
import pcftest.GroupSearchResultsLV.entry.Name;
import pcftest.GroupSearchResultsLV.entry.ParentGroup;
import pcftest.GroupSearchResultsLV.entry.Type;
import pcftest.GroupSearchResultsLV.entry._Select;
import pcftest.GroupSearchResultsLV.entry._ViewDetail;
import typekey.GroupType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchResultsLV extends PCFElement {
  public final static String CHECKSUM = "42baad4314e7540c2f2381ae218254ef";
  
  public GroupSearchResultsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupSearchResultsLV.NameHeader.class);
  }
  
  public ParentGroupHeader getParentGroupHeader() {
    return getOrCreateProperty("ParentGroupHeader", "ParentGroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupSearchResultsLV.ParentGroupHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupSearchResultsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.GroupSearchResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.GroupSearchResultsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ParentGroupHeader extends ValueElement {
    public ParentGroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.GroupSearchResultsLV.entry.Name.class);
    }
    
    public ParentGroup getParentGroup() {
      return getOrCreateProperty("ParentGroup", "ParentGroup", null, pcftest.GroupSearchResultsLV.entry.ParentGroup.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.GroupSearchResultsLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupSearchResultsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupSearchResultsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends SelectElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupDetailPage click() {
        return clickThis(pcftest.GroupDetailPage.class);
      }
      
      public pcftest.GroupSearchResultsLV.entry.Name.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupSearchResultsLV.entry.Name.GroupPickerMenuIcon.class);
      }
      
      public pcftest.GroupSearchResultsLV.entry.Name.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupSearchResultsLV.entry.Name.GroupSearchMenuIcon.class);
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
      
      public pcftest.GroupSearchResultsLV.entry.ParentGroup.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.GroupSearchResultsLV.entry.ParentGroup.GroupPickerMenuIcon.class);
      }
      
      public pcftest.GroupSearchResultsLV.entry.ParentGroup.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.GroupSearchResultsLV.entry.ParentGroup.GroupSearchMenuIcon.class);
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
    @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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