package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemAgeHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemAmountAfterLimitHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemCategoryHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemDepreciationPercentageHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemDescriptionHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemNotesHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemOriginalCostHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemProofOfOwnershipProvidedHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemPurchaseDateHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemQuantityHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemReplacementValueHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemTotalACVHeader;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV._ListPaging;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry.LineItemCategory;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry._Select;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry._ViewDetail;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb.Add;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb.DesktopActivities_PrintButton;
import pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb.Remove;
import pcftest.BaggageIncidentDV.EstimatedReceived;
import typekey.ContentLineItemCategory;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentDV extends DetailViewElement {
  public final static String CHECKSUM = "a487ac9b86bf632fc7db84ead2241237";
  
  public BaggageIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.BaggageIncidentDV.AppraisalServiceInputSet getAppraisalServiceInputSet() {
    return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.BaggageIncidentDV.AppraisalServiceInputSet.class);
  }
  
  public BaggageContentsLineItemsLV getBaggageContentsLineItemsLV() {
    return getOrCreateProperty("BaggageContentsLineItemsLV", "BaggageContentsLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.class);
  }
  
  public BaggageContentsLineItemsLV_tb getBaggageContentsLineItemsLV_tb() {
    return getOrCreateProperty("BaggageContentsLineItemsLV_tb", "BaggageContentsLineItemsLV_tb", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb.class);
  }
  
  public DateElement getBaggageMissingFrom() {
    return getOrCreateProperty("BaggageMissingFrom", "BaggageMissingFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getBaggageRecoveredOn() {
    return getOrCreateProperty("BaggageRecoveredOn", "BaggageRecoveredOn", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.BaggageIncidentDV.BaggageType getBaggageType() {
    return getOrCreateProperty("BaggageType", "BaggageType", null, pcftest.BaggageIncidentDV.BaggageType.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public BooleanValueElement getCarrierCompensated() {
    return getOrCreateProperty("CarrierCompensated", "CarrierCompensated", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCarrierCompensatedAmount() {
    return getOrCreateProperty("CarrierCompensatedAmount", "CarrierCompensatedAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getDelayOnly() {
    return getOrCreateProperty("DelayOnly", "DelayOnly", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateCost() {
    return getOrCreateProperty("EstimateCost", "EstimateCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateTime() {
    return getOrCreateProperty("EstimateTime", "EstimateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EstimatedReceived getEstimatedReceived() {
    return getOrCreateProperty("EstimatedReceived", "EstimatedReceived", null, pcftest.BaggageIncidentDV.EstimatedReceived.class);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  public ValueElement getPropertyDescription() {
    return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getRelatedToTrip() {
    return getOrCreateProperty("RelatedToTrip", "RelatedToTrip", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppraisalServiceInputSet extends PCFElement {
    public AppraisalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AppraisalServiceInputSet getAppraisalServiceInputSet() {
      return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.AppraisalServiceInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageContentsLineItemsLV extends PCFElement {
    public BaggageContentsLineItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LineItemAgeHeader getLineItemAgeHeader() {
      return getOrCreateProperty("LineItemAgeHeader", "LineItemAgeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemAgeHeader.class);
    }
    
    public ValueElement getLineItemAmountAfterLimitFooter() {
      return getOrCreateProperty("LineItemAmountAfterLimitFooter", "LineItemAmountAfterLimitFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemAmountAfterLimitHeader getLineItemAmountAfterLimitHeader() {
      return getOrCreateProperty("LineItemAmountAfterLimitHeader", "LineItemAmountAfterLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemAmountAfterLimitHeader.class);
    }
    
    public LineItemCategoryHeader getLineItemCategoryHeader() {
      return getOrCreateProperty("LineItemCategoryHeader", "LineItemCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemCategoryHeader.class);
    }
    
    public LineItemDepreciationPercentageHeader getLineItemDepreciationPercentageHeader() {
      return getOrCreateProperty("LineItemDepreciationPercentageHeader", "LineItemDepreciationPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemDepreciationPercentageHeader.class);
    }
    
    public LineItemDescriptionHeader getLineItemDescriptionHeader() {
      return getOrCreateProperty("LineItemDescriptionHeader", "LineItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemDescriptionHeader.class);
    }
    
    public LineItemNotesHeader getLineItemNotesHeader() {
      return getOrCreateProperty("LineItemNotesHeader", "LineItemNotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemNotesHeader.class);
    }
    
    public LineItemOriginalCostHeader getLineItemOriginalCostHeader() {
      return getOrCreateProperty("LineItemOriginalCostHeader", "LineItemOriginalCostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemOriginalCostHeader.class);
    }
    
    public LineItemProofOfOwnershipProvidedHeader getLineItemProofOfOwnershipProvidedHeader() {
      return getOrCreateProperty("LineItemProofOfOwnershipProvidedHeader", "LineItemProofOfOwnershipProvidedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemProofOfOwnershipProvidedHeader.class);
    }
    
    public LineItemPurchaseDateHeader getLineItemPurchaseDateHeader() {
      return getOrCreateProperty("LineItemPurchaseDateHeader", "LineItemPurchaseDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemPurchaseDateHeader.class);
    }
    
    public ValueElement getLineItemQuantityFooter() {
      return getOrCreateProperty("LineItemQuantityFooter", "LineItemQuantityFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemQuantityHeader getLineItemQuantityHeader() {
      return getOrCreateProperty("LineItemQuantityHeader", "LineItemQuantityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemQuantityHeader.class);
    }
    
    public ValueElement getLineItemReplacementValueFooter() {
      return getOrCreateProperty("LineItemReplacementValueFooter", "LineItemReplacementValueFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemReplacementValueHeader getLineItemReplacementValueHeader() {
      return getOrCreateProperty("LineItemReplacementValueHeader", "LineItemReplacementValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemReplacementValueHeader.class);
    }
    
    public ValueElement getLineItemTotalACVFooter() {
      return getOrCreateProperty("LineItemTotalACVFooter", "LineItemTotalACVFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineItemTotalACVHeader getLineItemTotalACVHeader() {
      return getOrCreateProperty("LineItemTotalACVHeader", "LineItemTotalACVHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.LineItemTotalACVHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemAgeHeader extends ValueElement {
      public LineItemAgeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemAmountAfterLimitHeader extends ValueElement {
      public LineItemAmountAfterLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemCategoryHeader extends ValueElement {
      public LineItemCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemDepreciationPercentageHeader extends ValueElement {
      public LineItemDepreciationPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemDescriptionHeader extends ValueElement {
      public LineItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemNotesHeader extends ValueElement {
      public LineItemNotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemOriginalCostHeader extends ValueElement {
      public LineItemOriginalCostHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemProofOfOwnershipProvidedHeader extends ValueElement {
      public LineItemProofOfOwnershipProvidedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemPurchaseDateHeader extends ValueElement {
      public LineItemPurchaseDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemQuantityHeader extends ValueElement {
      public LineItemQuantityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemReplacementValueHeader extends ValueElement {
      public LineItemReplacementValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineItemTotalACVHeader extends ValueElement {
      public LineItemTotalACVHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("LineItemCategory", "LineItemCategory", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry.LineItemCategory.class);
      }
      
      public ValueElement getLineItemDepreciationPercentage() {
        return getOrCreateProperty("LineItemDepreciationPercentage", "LineItemDepreciationPercentage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemDescription() {
        return getOrCreateProperty("LineItemDescription", "LineItemDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemNotes() {
        return getOrCreateProperty("LineItemNotes", "LineItemNotes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLineItemOriginalCost() {
        return getOrCreateProperty("LineItemOriginalCost", "LineItemOriginalCost", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public BooleanValueElement getLineItemProofOfOwnershipProvided() {
        return getOrCreateProperty("LineItemProofOfOwnershipProvided", "LineItemProofOfOwnershipProvided", null, gw.smoketest.platform.web.BooleanValueElement.class);
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
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageContentsLineItemsLV_tb extends PCFElement {
    public BaggageContentsLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb.Add.class);
    }
    
    public DesktopActivities_PrintButton getDesktopActivities_PrintButton() {
      return getOrCreateProperty("DesktopActivities_PrintButton", "DesktopActivities_PrintButton", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb.DesktopActivities_PrintButton.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.BaggageIncidentDV.BaggageContentsLineItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_PrintButton extends ClickableActionElement {
      public DesktopActivities_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageType extends SelectElement {
    public BaggageType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.BaggageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.BaggageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BaggageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.BaggageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EstimatedReceived extends SelectElement {
    public EstimatedReceived(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}