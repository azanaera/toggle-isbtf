package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.PropertyContentsIncidentPanelSet.IncidentExposuresLV.IncidentExposuresLV_tb;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemAgeHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemAmountAfterLimitHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemCategoryHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemDepreciationPercentageHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemNameHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemNotesHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemOriginalCostHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemPurchaseDateHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemQuantityHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemReplacementValueHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemTotalACVHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry.LineItemCategory;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb.DesktopActivities_PrintButton;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.ScheduledItemDescriptionHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.ScheduledItemValueHeader;
import pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV_tb;
import typekey.ContentLineItemCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyContentsIncidentPanelSet extends PCFElement {
  public final static String CHECKSUM = "c5bf68f230dc5c6feb9622f24b903eed";
  
  public PropertyContentsIncidentPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.PropertyContentsIncidentPanelSet.IncidentExposuresLV getIncidentExposuresLV() {
    return getOrCreateProperty("IncidentExposuresLV", "IncidentExposuresLV", null, pcftest.PropertyContentsIncidentPanelSet.IncidentExposuresLV.class);
  }
  
  public OtherServicesLVInputSet getOtherServicesLVInputSet() {
    return getOrCreateProperty("OtherServicesLVInputSet", "OtherServicesLVInputSet", null, pcftest.OtherServicesLVInputSet.class);
  }
  
  public PropertyContentsLineItemsLV getPropertyContentsLineItemsLV() {
    return getOrCreateProperty("PropertyContentsLineItemsLV", "PropertyContentsLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.class);
  }
  
  public PropertyContentsLineItemsLV_tb getPropertyContentsLineItemsLV_tb() {
    return getOrCreateProperty("PropertyContentsLineItemsLV_tb", "PropertyContentsLineItemsLV_tb", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb.class);
  }
  
  public PropertyContentsScheduledItemsLV getPropertyContentsScheduledItemsLV() {
    return getOrCreateProperty("PropertyContentsScheduledItemsLV", "PropertyContentsScheduledItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.class);
  }
  
  public PropertyContentsScheduledItemsLV_tb getPropertyContentsScheduledItemsLV_tb() {
    return getOrCreateProperty("PropertyContentsScheduledItemsLV_tb", "PropertyContentsScheduledItemsLV_tb", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV_tb.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getStorageLocation() {
    return getOrCreateProperty("StorageLocation", "StorageLocation", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentExposuresLV extends PCFElement {
    public IncidentExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.IncidentExposuresLV getIncidentExposuresLV() {
      return getOrCreateProperty("IncidentExposuresLV", "IncidentExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentExposuresLV.class);
    }
    
    public IncidentExposuresLV_tb getIncidentExposuresLV_tb() {
      return getOrCreateProperty("IncidentExposuresLV_tb", "IncidentExposuresLV_tb", null, pcftest.PropertyContentsIncidentPanelSet.IncidentExposuresLV.IncidentExposuresLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentExposuresLV_tb extends PCFElement {
      public IncidentExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsLineItemsLV extends PCFElement {
    public PropertyContentsLineItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LineItemAgeHeader getLineItemAgeHeader() {
      return getOrCreateProperty("LineItemAgeHeader", "LineItemAgeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemAgeHeader.class);
    }
    
    public ValueElement getLineItemAmountAfterLimitFooter() {
      return getOrCreateProperty("LineItemAmountAfterLimitFooter", "LineItemAmountAfterLimitFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemAmountAfterLimitHeader getLineItemAmountAfterLimitHeader() {
      return getOrCreateProperty("LineItemAmountAfterLimitHeader", "LineItemAmountAfterLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemAmountAfterLimitHeader.class);
    }
    
    public LineItemCategoryHeader getLineItemCategoryHeader() {
      return getOrCreateProperty("LineItemCategoryHeader", "LineItemCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemCategoryHeader.class);
    }
    
    public LineItemDepreciationPercentageHeader getLineItemDepreciationPercentageHeader() {
      return getOrCreateProperty("LineItemDepreciationPercentageHeader", "LineItemDepreciationPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemDepreciationPercentageHeader.class);
    }
    
    public LineItemNameHeader getLineItemNameHeader() {
      return getOrCreateProperty("LineItemNameHeader", "LineItemNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemNameHeader.class);
    }
    
    public LineItemNotesHeader getLineItemNotesHeader() {
      return getOrCreateProperty("LineItemNotesHeader", "LineItemNotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemNotesHeader.class);
    }
    
    public LineItemOriginalCostHeader getLineItemOriginalCostHeader() {
      return getOrCreateProperty("LineItemOriginalCostHeader", "LineItemOriginalCostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemOriginalCostHeader.class);
    }
    
    public LineItemPurchaseDateHeader getLineItemPurchaseDateHeader() {
      return getOrCreateProperty("LineItemPurchaseDateHeader", "LineItemPurchaseDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemPurchaseDateHeader.class);
    }
    
    public ValueElement getLineItemQuantityFooter() {
      return getOrCreateProperty("LineItemQuantityFooter", "LineItemQuantityFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemQuantityHeader getLineItemQuantityHeader() {
      return getOrCreateProperty("LineItemQuantityHeader", "LineItemQuantityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemQuantityHeader.class);
    }
    
    public ValueElement getLineItemReplacementValueFooter() {
      return getOrCreateProperty("LineItemReplacementValueFooter", "LineItemReplacementValueFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemReplacementValueHeader getLineItemReplacementValueHeader() {
      return getOrCreateProperty("LineItemReplacementValueHeader", "LineItemReplacementValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemReplacementValueHeader.class);
    }
    
    public ValueElement getLineItemTotalACVFooter() {
      return getOrCreateProperty("LineItemTotalACVFooter", "LineItemTotalACVFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemTotalACVHeader getLineItemTotalACVHeader() {
      return getOrCreateProperty("LineItemTotalACVHeader", "LineItemTotalACVHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.LineItemTotalACVHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemAgeHeader extends ValueElement {
      public LineItemAgeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemAmountAfterLimitHeader extends ValueElement {
      public LineItemAmountAfterLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemCategoryHeader extends ValueElement {
      public LineItemCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemDepreciationPercentageHeader extends ValueElement {
      public LineItemDepreciationPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemNameHeader extends ValueElement {
      public LineItemNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemNotesHeader extends ValueElement {
      public LineItemNotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemOriginalCostHeader extends ValueElement {
      public LineItemOriginalCostHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemPurchaseDateHeader extends ValueElement {
      public LineItemPurchaseDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemQuantityHeader extends ValueElement {
      public LineItemQuantityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemReplacementValueHeader extends ValueElement {
      public LineItemReplacementValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemTotalACVHeader extends ValueElement {
      public LineItemTotalACVHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getLineItemAge() {
        return getOrCreateProperty("LineItemAge", "LineItemAge", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemAmountAfterLimit() {
        return getOrCreateProperty("LineItemAmountAfterLimit", "LineItemAmountAfterLimit", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public LineItemCategory getLineItemCategory() {
        return getOrCreateProperty("LineItemCategory", "LineItemCategory", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry.LineItemCategory.class);
      }
      
      public ValueElement getLineItemDepreciationPercentage() {
        return getOrCreateProperty("LineItemDepreciationPercentage", "LineItemDepreciationPercentage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemName() {
        return getOrCreateProperty("LineItemName", "LineItemName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemNotes() {
        return getOrCreateProperty("LineItemNotes", "LineItemNotes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemOriginalCost() {
        return getOrCreateProperty("LineItemOriginalCost", "LineItemOriginalCost", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getLineItemPurchaseDate() {
        return getOrCreateProperty("LineItemPurchaseDate", "LineItemPurchaseDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getLineItemQuantity() {
        return getOrCreateProperty("LineItemQuantity", "LineItemQuantity", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemReplacementValue() {
        return getOrCreateProperty("LineItemReplacementValue", "LineItemReplacementValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemTotalACV() {
        return getOrCreateProperty("LineItemTotalACV", "LineItemTotalACV", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry._Select.class);
      }
      
      public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LineItemCategory extends SelectElement {
        public LineItemCategory(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ContentLineItemCategory arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ContentLineItemCategory getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContentLineItemCategory.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ContentLineItemCategory arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsLineItemsLV_tb extends PCFElement {
    public PropertyContentsLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb.Add.class);
    }
    
    public DesktopActivities_PrintButton getDesktopActivities_PrintButton() {
      return getOrCreateProperty("DesktopActivities_PrintButton", "DesktopActivities_PrintButton", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb.DesktopActivities_PrintButton.class);
    }
    
    public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsLineItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_PrintButton extends ClickableActionElement {
      public DesktopActivities_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsScheduledItemsLV extends PCFElement {
    public PropertyContentsScheduledItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ScheduledItemDescriptionHeader getScheduledItemDescriptionHeader() {
      return getOrCreateProperty("ScheduledItemDescriptionHeader", "ScheduledItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.ScheduledItemDescriptionHeader.class);
    }
    
    public ValueElement getScheduledItemTotalFooter() {
      return getOrCreateProperty("ScheduledItemTotalFooter", "ScheduledItemTotalFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getScheduledItemTotalHeader() {
      return getOrCreateProperty("ScheduledItemTotalHeader", "ScheduledItemTotalHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getScheduledItemValueFooter() {
      return getOrCreateProperty("ScheduledItemValueFooter", "ScheduledItemValueFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ScheduledItemValueHeader getScheduledItemValueHeader() {
      return getOrCreateProperty("ScheduledItemValueHeader", "ScheduledItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.ScheduledItemValueHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScheduledItemDescriptionHeader extends ValueElement {
      public ScheduledItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScheduledItemValueHeader extends ValueElement {
      public ScheduledItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getScheduledItemDescription() {
        return getOrCreateProperty("ScheduledItemDescription", "ScheduledItemDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getScheduledItemTotal() {
        return getOrCreateProperty("ScheduledItemTotal", "ScheduledItemTotal", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getScheduledItemValue() {
        return getOrCreateProperty("ScheduledItemValue", "ScheduledItemValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.entry._Select.class);
      }
      
      public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsScheduledItemsLV_tb extends PCFElement {
    public PropertyContentsScheduledItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV_tb.Add.class);
    }
    
    public pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PropertyContentsIncidentPanelSet.PropertyContentsScheduledItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}