package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.EditableBenefitPeriodsLV.BenefitTypeHeader;
import pcftest.EditableBenefitPeriodsLV.BenefitsBeginDateHeader;
import pcftest.EditableBenefitPeriodsLV.BenefitsEndDateHeader;
import pcftest.EditableBenefitPeriodsLV.MonthlyCompRateHeader;
import pcftest.EditableBenefitPeriodsLV.NumPaymentWeeksHeader;
import pcftest.EditableBenefitPeriodsLV.PostInjryWklyWgsHeader;
import pcftest.EditableBenefitPeriodsLV.WeeklyCompRateHeader;
import pcftest.EditableBenefitPeriodsLV._ListPaging;
import pcftest.EditableBenefitPeriodsLV.entry;
import pcftest.EditableBenefitPeriodsLV.entry.BenefitType;
import pcftest.EditableBenefitPeriodsLV.entry._Select;
import pcftest.EditableBenefitPeriodsLV.entry._ViewDetail;
import typekey.LostWagesBenefitType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableBenefitPeriodsLV extends PCFElement {
  public final static String CHECKSUM = "a72a2cbe576945ffd3a946c3809d9032";
  
  public EditableBenefitPeriodsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BenefitTypeHeader getBenefitTypeHeader() {
    return getOrCreateProperty("BenefitTypeHeader", "BenefitTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBenefitPeriodsLV.BenefitTypeHeader.class);
  }
  
  public BenefitsBeginDateHeader getBenefitsBeginDateHeader() {
    return getOrCreateProperty("BenefitsBeginDateHeader", "BenefitsBeginDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBenefitPeriodsLV.BenefitsBeginDateHeader.class);
  }
  
  public BenefitsEndDateHeader getBenefitsEndDateHeader() {
    return getOrCreateProperty("BenefitsEndDateHeader", "BenefitsEndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBenefitPeriodsLV.BenefitsEndDateHeader.class);
  }
  
  public MonthlyCompRateHeader getMonthlyCompRateHeader() {
    return getOrCreateProperty("MonthlyCompRateHeader", "MonthlyCompRateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBenefitPeriodsLV.MonthlyCompRateHeader.class);
  }
  
  public NumPaymentWeeksHeader getNumPaymentWeeksHeader() {
    return getOrCreateProperty("NumPaymentWeeksHeader", "NumPaymentWeeksHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBenefitPeriodsLV.NumPaymentWeeksHeader.class);
  }
  
  public PostInjryWklyWgsHeader getPostInjryWklyWgsHeader() {
    return getOrCreateProperty("PostInjryWklyWgsHeader", "PostInjryWklyWgsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBenefitPeriodsLV.PostInjryWklyWgsHeader.class);
  }
  
  public WeeklyCompRateHeader getWeeklyCompRateHeader() {
    return getOrCreateProperty("WeeklyCompRateHeader", "WeeklyCompRateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBenefitPeriodsLV.WeeklyCompRateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableBenefitPeriodsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableBenefitPeriodsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitTypeHeader extends ValueElement {
    public BenefitTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitsBeginDateHeader extends ValueElement {
    public BenefitsBeginDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitsEndDateHeader extends ValueElement {
    public BenefitsEndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MonthlyCompRateHeader extends ValueElement {
    public MonthlyCompRateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NumPaymentWeeksHeader extends ValueElement {
    public NumPaymentWeeksHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostInjryWklyWgsHeader extends ValueElement {
    public PostInjryWklyWgsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WeeklyCompRateHeader extends ValueElement {
    public WeeklyCompRateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BenefitType getBenefitType() {
      return getOrCreateProperty("BenefitType", "BenefitType", null, pcftest.EditableBenefitPeriodsLV.entry.BenefitType.class);
    }
    
    public DateElement getBenefitsBeginDate() {
      return getOrCreateProperty("BenefitsBeginDate", "BenefitsBeginDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getBenefitsEndDate() {
      return getOrCreateProperty("BenefitsEndDate", "BenefitsEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getMonthlyCompRate() {
      return getOrCreateProperty("MonthlyCompRate", "MonthlyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNumPaymentWeeks() {
      return getOrCreateProperty("NumPaymentWeeks", "NumPaymentWeeks", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPostInjryWklyWgs() {
      return getOrCreateProperty("PostInjryWklyWgs", "PostInjryWklyWgs", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getWeeklyCompRate() {
      return getOrCreateProperty("WeeklyCompRate", "WeeklyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableBenefitPeriodsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableBenefitPeriodsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BenefitType extends SelectElement {
      public BenefitType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LostWagesBenefitType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LostWagesBenefitType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LostWagesBenefitType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LostWagesBenefitType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBenefitPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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