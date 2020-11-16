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
import pcftest.CompensableInputSet.CompensableStatus;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV.CodeHeader;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV._ListPaging;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry.Code;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry._Select;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry._ViewDetail;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV_tb;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV_tb.Add;
import pcftest.CompensableInputSet.FullDenialReasonCodesLV_tb.Remove;
import typekey.CompensabilityDecision;
import typekey.FullDenialReason;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CompensableInputSet extends PCFElement {
  public final static String CHECKSUM = "5a721780a9412f86eb3b71caf961ae6c";
  
  public CompensableInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCompensabilityDecision_BenefitsDecisionReason() {
    return getOrCreateProperty("CompensabilityDecision_BenefitsDecisionReason", "CompensabilityDecision_BenefitsDecisionReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCompensabilityDecision_DecisionMadeDate() {
    return getOrCreateProperty("CompensabilityDecision_DecisionMadeDate", "CompensabilityDecision_DecisionMadeDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getCompensabilityDecision_DueDate() {
    return getOrCreateProperty("CompensabilityDecision_DueDate", "CompensabilityDecision_DueDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getCompensabilityDecision_FullDenialEffectiveDate() {
    return getOrCreateProperty("CompensabilityDecision_FullDenialEffectiveDate", "CompensabilityDecision_FullDenialEffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public CompensableStatus getCompensableStatus() {
    return getOrCreateProperty("CompensableStatus", "CompensableStatus", null, pcftest.CompensableInputSet.CompensableStatus.class);
  }
  
  public FullDenialReasonCodesLV getFullDenialReasonCodesLV() {
    return getOrCreateProperty("FullDenialReasonCodesLV", "FullDenialReasonCodesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CompensableInputSet.FullDenialReasonCodesLV.class);
  }
  
  public FullDenialReasonCodesLV_tb getFullDenialReasonCodesLV_tb() {
    return getOrCreateProperty("FullDenialReasonCodesLV_tb", "FullDenialReasonCodesLV_tb", null, pcftest.CompensableInputSet.FullDenialReasonCodesLV_tb.class);
  }
  
  public pcftest.CompensableInputSet.PartialDenialReason getPartialDenialReason() {
    return getOrCreateProperty("PartialDenialReason", "PartialDenialReason", null, pcftest.CompensableInputSet.PartialDenialReason.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensableStatus extends SelectElement {
    public CompensableStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CompensabilityDecision arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CompensabilityDecision getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CompensabilityDecision.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CompensabilityDecision arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FullDenialReasonCodesLV extends PCFElement {
    public FullDenialReasonCodesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CodeHeader getCodeHeader() {
      return getOrCreateProperty("CodeHeader", "CodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CompensableInputSet.FullDenialReasonCodesLV.CodeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CompensableInputSet.FullDenialReasonCodesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CodeHeader extends ValueElement {
      public CodeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Code getCode() {
        return getOrCreateProperty("Code", "Code", null, pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry.Code.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CompensableInputSet.FullDenialReasonCodesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Code extends SelectElement {
        public Code(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(FullDenialReason arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public FullDenialReason getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FullDenialReason.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(FullDenialReason arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FullDenialReasonCodesLV_tb extends PCFElement {
    public FullDenialReasonCodesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.CompensableInputSet.FullDenialReasonCodesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.CompensableInputSet.FullDenialReasonCodesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PartialDenialReason extends SelectElement {
    public PartialDenialReason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.PartialDenialReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.PartialDenialReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PartialDenialReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.PartialDenialReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}