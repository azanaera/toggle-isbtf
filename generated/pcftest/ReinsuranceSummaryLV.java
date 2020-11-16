package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReinsuranceSummaryLV._ListPaging;
import pcftest.ReinsuranceSummaryLV.entry;
import pcftest.ReinsuranceSummaryLV.entry.entry2;
import pcftest.ReinsuranceSummaryLV.entry.entry2.Agreement;
import pcftest.ReinsuranceSummaryLV.entry.entry2.EditAdjustments;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceSummaryLV extends PCFElement {
  public final static String CHECKSUM = "03056d8a0ad65d323d3ca2e4e79c7830";
  
  public ReinsuranceSummaryLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAgreementHeaderRow2() {
    return getOrCreateProperty("AgreementHeaderRow2", "AgreementHeaderRow2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCededReservesFooter() {
    return getOrCreateProperty("CededReservesFooter", "CededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCededReservesHeaderRow2() {
    return getOrCreateProperty("CededReservesHeaderRow2", "CededReservesHeaderRow2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEditAdjustmentsHeaderRow2() {
    return getOrCreateProperty("EditAdjustmentsHeaderRow2", "EditAdjustmentsHeaderRow2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEditButtonColumnFooter() {
    return getOrCreateProperty("EditButtonColumnFooter", "EditButtonColumnFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExceedsNotThreshFooter() {
    return getOrCreateProperty("ExceedsNotThreshFooter", "ExceedsNotThreshFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExceedsNotThresholdHeaderRow2() {
    return getOrCreateProperty("ExceedsNotThresholdHeaderRow2", "ExceedsNotThresholdHeaderRow2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLabelFooter() {
    return getOrCreateProperty("LabelFooter", "LabelFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPaymentRecovFooter() {
    return getOrCreateProperty("PaymentRecovFooter", "PaymentRecovFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPaymentRecoverableHeaderRow2() {
    return getOrCreateProperty("PaymentRecoverableHeaderRow2", "PaymentRecoverableHeaderRow2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropShareFooter() {
    return getOrCreateProperty("PropShareFooter", "PropShareFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getShareHeaderRow2() {
    return getOrCreateProperty("ShareHeaderRow2", "ShareHeaderRow2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceSummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ReinsuranceSummaryLV._ListPaging.class);
  }
  
  public pcftest.ReinsuranceSummaryLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceSummaryLV._Select.class);
  }
  
  public pcftest.ReinsuranceSummaryLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceSummaryLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCededReservesHeader() {
      return getOrCreateProperty("CededReservesHeader", "CededReservesHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEditAdjustmentsHeaderRow() {
      return getOrCreateProperty("EditAdjustmentsHeaderRow", "EditAdjustmentsHeaderRow", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExceedsNotThreshHeader() {
      return getOrCreateProperty("ExceedsNotThreshHeader", "ExceedsNotThreshHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getGroupDescription() {
      return getOrCreateProperty("GroupDescription", "GroupDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLabel() {
      return getOrCreateProperty("Label", "Label", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPaymentRecovHeader() {
      return getOrCreateProperty("PaymentRecovHeader", "PaymentRecovHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPropShareHeader() {
      return getOrCreateProperty("PropShareHeader", "PropShareHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry2> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceSummaryLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public pcftest.ReinsuranceSummaryLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceSummaryLV.entry._Select.class);
    }
    
    public pcftest.ReinsuranceSummaryLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceSummaryLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry2 extends RowElement {
      public entry2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Agreement getAgreement() {
        return getOrCreateProperty("Agreement", "Agreement", null, pcftest.ReinsuranceSummaryLV.entry.entry2.Agreement.class);
      }
      
      public ValueElement getAgreementDesc() {
        return getOrCreateProperty("AgreementDesc", "AgreementDesc", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCededReserves() {
        return getOrCreateProperty("CededReserves", "CededReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public EditAdjustments getEditAdjustments() {
        return getOrCreateProperty("EditAdjustments", "EditAdjustments", null, pcftest.ReinsuranceSummaryLV.entry.entry2.EditAdjustments.class);
      }
      
      public BooleanValueElement getExceedsNotificationThreshold() {
        return getOrCreateProperty("ExceedsNotificationThreshold", "ExceedsNotificationThreshold", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public ValueElement getPaymentRecoverable() {
        return getOrCreateProperty("PaymentRecoverable", "PaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getProportionalShare() {
        return getOrCreateProperty("ProportionalShare", "ProportionalShare", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ReinsuranceSummaryLV.entry.entry2._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceSummaryLV.entry.entry2._Select.class);
      }
      
      public pcftest.ReinsuranceSummaryLV.entry.entry2._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceSummaryLV.entry.entry2._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Agreement extends ClickableActionElement {
        public Agreement(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ReinsuranceAgreementDetails click() {
          return clickThis(pcftest.ReinsuranceAgreementDetails.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditAdjustments extends ValueElement {
        public EditAdjustments(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AdjustRIRecoverablesPopup click() {
          return clickThis(pcftest.AdjustRIRecoverablesPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}