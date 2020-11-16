package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ChoosePropertyContentsScheduledItemPopup.AddCheckedItems;
import pcftest.ChoosePropertyContentsScheduledItemPopup.ChoosePropertyContentsScheduledItemPopup_UpLink;
import pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV;
import pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.ItemDescriptionHeader;
import pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.ItemValueHeader;
import pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV._ListPaging;
import pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.entry;
import pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.entry._Select;
import pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.entry._ViewDetail;
import pcftest.ChoosePropertyContentsScheduledItemPopup.ToolbarButton;
import pcftest.ChoosePropertyContentsScheduledItemPopup._Paging;
import pcftest.ChoosePropertyContentsScheduledItemPopup.__crumb__;
import pcftest.ChoosePropertyContentsScheduledItemPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ChoosePropertyContentsScheduledItemPopup extends PCFLocation {
  public final static String CHECKSUM = "01fbfb36ed3599f4c088947a87bb861f";
  
  public ChoosePropertyContentsScheduledItemPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ChoosePropertyContentsScheduledItemPopup"));
  }
  
  public AddCheckedItems getAddCheckedItems() {
    return getOrCreateProperty("AddCheckedItems", "AddCheckedItems", null, pcftest.ChoosePropertyContentsScheduledItemPopup.AddCheckedItems.class);
  }
  
  public ChoosePropertyContentsScheduledItemPopup_UpLink getChoosePropertyContentsScheduledItemPopup_UpLink() {
    return getOrCreateProperty("ChoosePropertyContentsScheduledItemPopup_UpLink", "ChoosePropertyContentsScheduledItemPopup_UpLink", null, pcftest.ChoosePropertyContentsScheduledItemPopup.ChoosePropertyContentsScheduledItemPopup_UpLink.class);
  }
  
  public PropertyItemsLV getPropertyItemsLV() {
    return getOrCreateProperty("PropertyItemsLV", "PropertyItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.class);
  }
  
  public ToolbarButton getToolbarButton() {
    return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.ChoosePropertyContentsScheduledItemPopup.ToolbarButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ChoosePropertyContentsScheduledItemPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ChoosePropertyContentsScheduledItemPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ChoosePropertyContentsScheduledItemPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddCheckedItems extends ClickableActionElement {
    public AddCheckedItems(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChoosePropertyContentsScheduledItemPopup_UpLink extends ClickableActionElement {
    public ChoosePropertyContentsScheduledItemPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyItemsLV extends PCFElement {
    public PropertyItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ItemDescriptionHeader getItemDescriptionHeader() {
      return getOrCreateProperty("ItemDescriptionHeader", "ItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.ItemDescriptionHeader.class);
    }
    
    public ItemValueHeader getItemValueHeader() {
      return getOrCreateProperty("ItemValueHeader", "ItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.ItemValueHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ItemDescriptionHeader extends ValueElement {
      public ItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ItemValueHeader extends ValueElement {
      public ItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getItemDescription() {
        return getOrCreateProperty("ItemDescription", "ItemDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getItemValue() {
        return getOrCreateProperty("ItemValue", "ItemValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ChoosePropertyContentsScheduledItemPopup.PropertyItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ToolbarButton extends ClickableActionElement {
    public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}