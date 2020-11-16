package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.AggregateLimitsLV.AggLimitCalcCriteriaHeader;
import pcftest.AggregateLimitsLV.AmountRemainingHeader;
import pcftest.AggregateLimitsLV.AmountUsedHeader;
import pcftest.AggregateLimitsLV.CoveragesHeader;
import pcftest.AggregateLimitsLV.LimitAmountHeader;
import pcftest.AggregateLimitsLV.PeriodTypeHeader;
import pcftest.AggregateLimitsLV.ValueTypeHeader;
import pcftest.AggregateLimitsLV._ListPaging;
import pcftest.AggregateLimitsLV.entry;
import pcftest.AggregateLimitsLV.entry.AmountUsed;
import pcftest.AggregateLimitsLV.entry.PeriodType;
import pcftest.AggregateLimitsLV.entry.ValueType;
import pcftest.AggregateLimitsLV.entry._Select;
import pcftest.AggregateLimitsLV.entry._ViewDetail;
import typekey.AggregateType;
import typekey.PolicyPeriodType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitsLV extends PCFElement {
  public final static String CHECKSUM = "29d4724858028fbc281a98158c387f95";
  
  public AggregateLimitsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AggLimitCalcCriteriaHeader getAggLimitCalcCriteriaHeader() {
    return getOrCreateProperty("AggLimitCalcCriteriaHeader", "AggLimitCalcCriteriaHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitsLV.AggLimitCalcCriteriaHeader.class);
  }
  
  public AmountRemainingHeader getAmountRemainingHeader() {
    return getOrCreateProperty("AmountRemainingHeader", "AmountRemainingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitsLV.AmountRemainingHeader.class);
  }
  
  public AmountUsedHeader getAmountUsedHeader() {
    return getOrCreateProperty("AmountUsedHeader", "AmountUsedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitsLV.AmountUsedHeader.class);
  }
  
  public CoveragesHeader getCoveragesHeader() {
    return getOrCreateProperty("CoveragesHeader", "CoveragesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitsLV.CoveragesHeader.class);
  }
  
  public LimitAmountHeader getLimitAmountHeader() {
    return getOrCreateProperty("LimitAmountHeader", "LimitAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitsLV.LimitAmountHeader.class);
  }
  
  public PeriodTypeHeader getPeriodTypeHeader() {
    return getOrCreateProperty("PeriodTypeHeader", "PeriodTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitsLV.PeriodTypeHeader.class);
  }
  
  public ValueTypeHeader getValueTypeHeader() {
    return getOrCreateProperty("ValueTypeHeader", "ValueTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitsLV.ValueTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AggregateLimitsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AggregateLimitsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggLimitCalcCriteriaHeader extends ValueElement {
    public AggLimitCalcCriteriaHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountRemainingHeader extends ValueElement {
    public AmountRemainingHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountUsedHeader extends ValueElement {
    public AmountUsedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoveragesHeader extends ValueElement {
    public CoveragesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LimitAmountHeader extends ValueElement {
    public LimitAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodTypeHeader extends ValueElement {
    public PeriodTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValueTypeHeader extends ValueElement {
    public ValueTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AggregateLimitsLV.entry.AggLimitCalcCriteria getAggLimitCalcCriteria() {
      return getOrCreateProperty("AggLimitCalcCriteria", "AggLimitCalcCriteria", null, pcftest.AggregateLimitsLV.entry.AggLimitCalcCriteria.class);
    }
    
    public ValueElement getAmountRemaining() {
      return getOrCreateProperty("AmountRemaining", "AmountRemaining", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public AmountUsed getAmountUsed() {
      return getOrCreateProperty("AmountUsed", "AmountUsed", null, pcftest.AggregateLimitsLV.entry.AmountUsed.class);
    }
    
    public ValueElement getCoverages() {
      return getOrCreateProperty("Coverages", "Coverages", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLimitAmount() {
      return getOrCreateProperty("LimitAmount", "LimitAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PeriodType getPeriodType() {
      return getOrCreateProperty("PeriodType", "PeriodType", null, pcftest.AggregateLimitsLV.entry.PeriodType.class);
    }
    
    public ValueType getValueType() {
      return getOrCreateProperty("ValueType", "ValueType", null, pcftest.AggregateLimitsLV.entry.ValueType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AggregateLimitsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AggregateLimitsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AggLimitCalcCriteria extends SelectElement {
      public AggLimitCalcCriteria(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.AggLimitCalcCriteria arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.AggLimitCalcCriteria getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AggLimitCalcCriteria.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.AggLimitCalcCriteria arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AmountUsed extends ValueElement {
      public AmountUsed(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AggregateLimitClaimsWorksheet click() {
        return clickThis(pcftest.AggregateLimitClaimsWorksheet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PeriodType extends SelectElement {
      public PeriodType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyAggregateLimitDetail click() {
        return clickThis(pcftest.ClaimPolicyAggregateLimitDetail.class);
      }
      
      public OptionElement getOptionByTypeKey(PolicyPeriodType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PolicyPeriodType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyPeriodType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PolicyPeriodType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ValueType extends SelectElement {
      public ValueType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(AggregateType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public AggregateType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AggregateType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(AggregateType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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