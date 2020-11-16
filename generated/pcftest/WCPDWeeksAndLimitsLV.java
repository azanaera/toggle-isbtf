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
import pcftest.WCPDWeeksAndLimitsLV.DisabilityPercentHeader;
import pcftest.WCPDWeeksAndLimitsLV.JurisdictionStateHeader;
import pcftest.WCPDWeeksAndLimitsLV.PD_BenefitEndDateHeader;
import pcftest.WCPDWeeksAndLimitsLV.PD_BenefitStartDateHeader;
import pcftest.WCPDWeeksAndLimitsLV.PD_NumWeeksHeader;
import pcftest.WCPDWeeksAndLimitsLV._ListPaging;
import pcftest.WCPDWeeksAndLimitsLV.entry;
import pcftest.WCPDWeeksAndLimitsLV.entry.JurisdictionState;
import pcftest.WCPDWeeksAndLimitsLV.entry._Select;
import pcftest.WCPDWeeksAndLimitsLV.entry._ViewDetail;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCPDWeeksAndLimitsLV extends PCFElement {
  public final static String CHECKSUM = "8727ce02cb87c6ac39b9feae94df6504";
  
  public WCPDWeeksAndLimitsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DisabilityPercentHeader getDisabilityPercentHeader() {
    return getOrCreateProperty("DisabilityPercentHeader", "DisabilityPercentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDWeeksAndLimitsLV.DisabilityPercentHeader.class);
  }
  
  public JurisdictionStateHeader getJurisdictionStateHeader() {
    return getOrCreateProperty("JurisdictionStateHeader", "JurisdictionStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDWeeksAndLimitsLV.JurisdictionStateHeader.class);
  }
  
  public PD_BenefitEndDateHeader getPD_BenefitEndDateHeader() {
    return getOrCreateProperty("PD_BenefitEndDateHeader", "PD_BenefitEndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDWeeksAndLimitsLV.PD_BenefitEndDateHeader.class);
  }
  
  public PD_BenefitStartDateHeader getPD_BenefitStartDateHeader() {
    return getOrCreateProperty("PD_BenefitStartDateHeader", "PD_BenefitStartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDWeeksAndLimitsLV.PD_BenefitStartDateHeader.class);
  }
  
  public PD_NumWeeksHeader getPD_NumWeeksHeader() {
    return getOrCreateProperty("PD_NumWeeksHeader", "PD_NumWeeksHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDWeeksAndLimitsLV.PD_NumWeeksHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WCPDWeeksAndLimitsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WCPDWeeksAndLimitsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisabilityPercentHeader extends ValueElement {
    public DisabilityPercentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionStateHeader extends ValueElement {
    public JurisdictionStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PD_BenefitEndDateHeader extends ValueElement {
    public PD_BenefitEndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PD_BenefitStartDateHeader extends ValueElement {
    public PD_BenefitStartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PD_NumWeeksHeader extends ValueElement {
    public PD_NumWeeksHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDisabilityPercent() {
      return getOrCreateProperty("DisabilityPercent", "DisabilityPercent", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public JurisdictionState getJurisdictionState() {
      return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.WCPDWeeksAndLimitsLV.entry.JurisdictionState.class);
    }
    
    public DateElement getPD_BenefitEndDate() {
      return getOrCreateProperty("PD_BenefitEndDate", "PD_BenefitEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getPD_BenefitStartDate() {
      return getOrCreateProperty("PD_BenefitStartDate", "PD_BenefitStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPD_NumWeeks() {
      return getOrCreateProperty("PD_NumWeeks", "PD_NumWeeks", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WCPDWeeksAndLimitsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WCPDWeeksAndLimitsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JurisdictionState extends SelectElement {
      public JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
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
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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