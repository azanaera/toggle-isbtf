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
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.ClaimSnapshotPropertyContentsIncidentPopup_UpLink;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemAgeHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemAmountAfterLimitHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemCategoryHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemDepreciationPercentageHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemNameHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemNotesHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemOriginalCostHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemPurchaseDateHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemQuantityHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemReplacementValueHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemTotalACVHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV_tb;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.ScheduledItemDescriptionHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.ScheduledItemValueHeader;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV_tb;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup._Paging;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup.__crumb__;
import pcftest.ClaimSnapshotPropertyContentsIncidentPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPropertyContentsIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "0c8faba76c11a36573c97ec48b343651";
  
  public ClaimSnapshotPropertyContentsIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotPropertyContentsIncidentPopup"));
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_600 getClaimSnapshotIncidentRelatedExposuresPanelSet_600() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_600", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_600.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_700 getClaimSnapshotIncidentRelatedExposuresPanelSet_700() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_700", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_800 getClaimSnapshotIncidentRelatedExposuresPanelSet_800() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_800", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_800.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_default getClaimSnapshotIncidentRelatedExposuresPanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_default", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_default.class);
  }
  
  public ClaimSnapshotPropertyContentsIncidentPopup_UpLink getClaimSnapshotPropertyContentsIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotPropertyContentsIncidentPopup_UpLink", "ClaimSnapshotPropertyContentsIncidentPopup_UpLink", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.ClaimSnapshotPropertyContentsIncidentPopup_UpLink.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PropertyContentsLineItemsLV getPropertyContentsLineItemsLV() {
    return getOrCreateProperty("PropertyContentsLineItemsLV", "PropertyContentsLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.class);
  }
  
  public PropertyContentsLineItemsLV_tb getPropertyContentsLineItemsLV_tb() {
    return getOrCreateProperty("PropertyContentsLineItemsLV_tb", "PropertyContentsLineItemsLV_tb", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV_tb.class);
  }
  
  public PropertyContentsScheduledItemsLV getPropertyContentsScheduledItemsLV() {
    return getOrCreateProperty("PropertyContentsScheduledItemsLV", "PropertyContentsScheduledItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.class);
  }
  
  public PropertyContentsScheduledItemsLV_tb getPropertyContentsScheduledItemsLV_tb() {
    return getOrCreateProperty("PropertyContentsScheduledItemsLV_tb", "PropertyContentsScheduledItemsLV_tb", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV_tb.class);
  }
  
  public ValueElement getStorageLocation() {
    return getOrCreateProperty("StorageLocation", "StorageLocation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPropertyContentsIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotPropertyContentsIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsLineItemsLV extends PCFElement {
    public PropertyContentsLineItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LineItemAgeHeader getLineItemAgeHeader() {
      return getOrCreateProperty("LineItemAgeHeader", "LineItemAgeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemAgeHeader.class);
    }
    
    public ValueElement getLineItemAmountAfterLimitFooter() {
      return getOrCreateProperty("LineItemAmountAfterLimitFooter", "LineItemAmountAfterLimitFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemAmountAfterLimitHeader getLineItemAmountAfterLimitHeader() {
      return getOrCreateProperty("LineItemAmountAfterLimitHeader", "LineItemAmountAfterLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemAmountAfterLimitHeader.class);
    }
    
    public LineItemCategoryHeader getLineItemCategoryHeader() {
      return getOrCreateProperty("LineItemCategoryHeader", "LineItemCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemCategoryHeader.class);
    }
    
    public LineItemDepreciationPercentageHeader getLineItemDepreciationPercentageHeader() {
      return getOrCreateProperty("LineItemDepreciationPercentageHeader", "LineItemDepreciationPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemDepreciationPercentageHeader.class);
    }
    
    public LineItemNameHeader getLineItemNameHeader() {
      return getOrCreateProperty("LineItemNameHeader", "LineItemNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemNameHeader.class);
    }
    
    public LineItemNotesHeader getLineItemNotesHeader() {
      return getOrCreateProperty("LineItemNotesHeader", "LineItemNotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemNotesHeader.class);
    }
    
    public LineItemOriginalCostHeader getLineItemOriginalCostHeader() {
      return getOrCreateProperty("LineItemOriginalCostHeader", "LineItemOriginalCostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemOriginalCostHeader.class);
    }
    
    public LineItemPurchaseDateHeader getLineItemPurchaseDateHeader() {
      return getOrCreateProperty("LineItemPurchaseDateHeader", "LineItemPurchaseDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemPurchaseDateHeader.class);
    }
    
    public ValueElement getLineItemQuantityFooter() {
      return getOrCreateProperty("LineItemQuantityFooter", "LineItemQuantityFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemQuantityHeader getLineItemQuantityHeader() {
      return getOrCreateProperty("LineItemQuantityHeader", "LineItemQuantityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemQuantityHeader.class);
    }
    
    public ValueElement getLineItemReplacementValueFooter() {
      return getOrCreateProperty("LineItemReplacementValueFooter", "LineItemReplacementValueFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemReplacementValueHeader getLineItemReplacementValueHeader() {
      return getOrCreateProperty("LineItemReplacementValueHeader", "LineItemReplacementValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemReplacementValueHeader.class);
    }
    
    public ValueElement getLineItemTotalACVFooter() {
      return getOrCreateProperty("LineItemTotalACVFooter", "LineItemTotalACVFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemTotalACVHeader getLineItemTotalACVHeader() {
      return getOrCreateProperty("LineItemTotalACVHeader", "LineItemTotalACVHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.LineItemTotalACVHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemAgeHeader extends ValueElement {
      public LineItemAgeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemAmountAfterLimitHeader extends ValueElement {
      public LineItemAmountAfterLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemCategoryHeader extends ValueElement {
      public LineItemCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemDepreciationPercentageHeader extends ValueElement {
      public LineItemDepreciationPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemNameHeader extends ValueElement {
      public LineItemNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemNotesHeader extends ValueElement {
      public LineItemNotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemOriginalCostHeader extends ValueElement {
      public LineItemOriginalCostHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemPurchaseDateHeader extends ValueElement {
      public LineItemPurchaseDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemQuantityHeader extends ValueElement {
      public LineItemQuantityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemReplacementValueHeader extends ValueElement {
      public LineItemReplacementValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemTotalACVHeader extends ValueElement {
      public LineItemTotalACVHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public ValueElement getLineItemCategory() {
        return getOrCreateProperty("LineItemCategory", "LineItemCategory", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public ValueElement getLineItemPurchaseDate() {
        return getOrCreateProperty("LineItemPurchaseDate", "LineItemPurchaseDate", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsLineItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsLineItemsLV_tb extends PCFElement {
    public PropertyContentsLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsScheduledItemsLV extends PCFElement {
    public PropertyContentsScheduledItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ScheduledItemDescriptionHeader getScheduledItemDescriptionHeader() {
      return getOrCreateProperty("ScheduledItemDescriptionHeader", "ScheduledItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.ScheduledItemDescriptionHeader.class);
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
      return getOrCreateProperty("ScheduledItemValueHeader", "ScheduledItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.ScheduledItemValueHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScheduledItemDescriptionHeader extends ValueElement {
      public ScheduledItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScheduledItemValueHeader extends ValueElement {
      public ScheduledItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPropertyContentsIncidentPopup.PropertyContentsScheduledItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsScheduledItemsLV_tb extends PCFElement {
    public PropertyContentsScheduledItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}