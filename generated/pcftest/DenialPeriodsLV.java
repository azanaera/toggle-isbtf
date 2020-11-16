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
import pcftest.DenialPeriodsLV.BenefitPaymentAcceptanceHeader;
import pcftest.DenialPeriodsLV.DueDateFormulaHeader;
import pcftest.DenialPeriodsLV.EffectiveDateHeader;
import pcftest.DenialPeriodsLV.ExpiryDateHeader;
import pcftest.DenialPeriodsLV.JurisdictionStateHeader;
import pcftest.DenialPeriodsLV.TargetDaysFromLossHeader;
import pcftest.DenialPeriodsLV.TargetDaysFromNoticeHeader;
import pcftest.DenialPeriodsLV.TargetIncludeDaysHeader;
import pcftest.DenialPeriodsLV._ListPaging;
import pcftest.DenialPeriodsLV.entry;
import pcftest.DenialPeriodsLV.entry.DueDateFormula;
import pcftest.DenialPeriodsLV.entry.JurisdictionState;
import pcftest.DenialPeriodsLV.entry.TargetIncludeDays;
import pcftest.DenialPeriodsLV.entry._Select;
import pcftest.DenialPeriodsLV.entry._ViewDetail;
import typekey.IncludeDaysType;
import typekey.Jurisdiction;
import typekey.JurisdictionalFormula;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DenialPeriodsLV extends PCFElement {
  public final static String CHECKSUM = "986204a422bef82adf11e17d353f0893";
  
  public DenialPeriodsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BenefitPaymentAcceptanceHeader getBenefitPaymentAcceptanceHeader() {
    return getOrCreateProperty("BenefitPaymentAcceptanceHeader", "BenefitPaymentAcceptanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.BenefitPaymentAcceptanceHeader.class);
  }
  
  public DueDateFormulaHeader getDueDateFormulaHeader() {
    return getOrCreateProperty("DueDateFormulaHeader", "DueDateFormulaHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.DueDateFormulaHeader.class);
  }
  
  public EffectiveDateHeader getEffectiveDateHeader() {
    return getOrCreateProperty("EffectiveDateHeader", "EffectiveDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.EffectiveDateHeader.class);
  }
  
  public ExpiryDateHeader getExpiryDateHeader() {
    return getOrCreateProperty("ExpiryDateHeader", "ExpiryDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.ExpiryDateHeader.class);
  }
  
  public JurisdictionStateHeader getJurisdictionStateHeader() {
    return getOrCreateProperty("JurisdictionStateHeader", "JurisdictionStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.JurisdictionStateHeader.class);
  }
  
  public TargetDaysFromLossHeader getTargetDaysFromLossHeader() {
    return getOrCreateProperty("TargetDaysFromLossHeader", "TargetDaysFromLossHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.TargetDaysFromLossHeader.class);
  }
  
  public TargetDaysFromNoticeHeader getTargetDaysFromNoticeHeader() {
    return getOrCreateProperty("TargetDaysFromNoticeHeader", "TargetDaysFromNoticeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.TargetDaysFromNoticeHeader.class);
  }
  
  public TargetIncludeDaysHeader getTargetIncludeDaysHeader() {
    return getOrCreateProperty("TargetIncludeDaysHeader", "TargetIncludeDaysHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DenialPeriodsLV.TargetIncludeDaysHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DenialPeriodsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DenialPeriodsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitPaymentAcceptanceHeader extends ValueElement {
    public BenefitPaymentAcceptanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateFormulaHeader extends ValueElement {
    public DueDateFormulaHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EffectiveDateHeader extends ValueElement {
    public EffectiveDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpiryDateHeader extends ValueElement {
    public ExpiryDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionStateHeader extends ValueElement {
    public JurisdictionStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetDaysFromLossHeader extends ValueElement {
    public TargetDaysFromLossHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetDaysFromNoticeHeader extends ValueElement {
    public TargetDaysFromNoticeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetIncludeDaysHeader extends ValueElement {
    public TargetIncludeDaysHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getBenefitPaymentAcceptance() {
      return getOrCreateProperty("BenefitPaymentAcceptance", "BenefitPaymentAcceptance", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DueDateFormula getDueDateFormula() {
      return getOrCreateProperty("DueDateFormula", "DueDateFormula", null, pcftest.DenialPeriodsLV.entry.DueDateFormula.class);
    }
    
    public DateElement getEffectiveDate() {
      return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getExpiryDate() {
      return getOrCreateProperty("ExpiryDate", "ExpiryDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public JurisdictionState getJurisdictionState() {
      return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.DenialPeriodsLV.entry.JurisdictionState.class);
    }
    
    public ValueElement getTargetDaysFromLoss() {
      return getOrCreateProperty("TargetDaysFromLoss", "TargetDaysFromLoss", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTargetDaysFromNotice() {
      return getOrCreateProperty("TargetDaysFromNotice", "TargetDaysFromNotice", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TargetIncludeDays getTargetIncludeDays() {
      return getOrCreateProperty("TargetIncludeDays", "TargetIncludeDays", null, pcftest.DenialPeriodsLV.entry.TargetIncludeDays.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DenialPeriodsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DenialPeriodsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DueDateFormula extends SelectElement {
      public DueDateFormula(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(JurisdictionalFormula arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public JurisdictionalFormula getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.JurisdictionalFormula.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(JurisdictionalFormula arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JurisdictionState extends SelectElement {
      public JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DenialPeriodPopup click() {
        return clickThis(pcftest.DenialPeriodPopup.class);
      }
      
      public OptionElement getOptionByTypeKey(Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TargetIncludeDays extends SelectElement {
      public TargetIncludeDays(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(IncludeDaysType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public IncludeDaysType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.IncludeDaysType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(IncludeDaysType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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