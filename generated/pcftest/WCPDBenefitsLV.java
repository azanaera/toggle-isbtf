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
import pcftest.WCPDBenefitsLV.JurisdictionStateHeader;
import pcftest.WCPDBenefitsLV.Max_DisabilityPercentHeader;
import pcftest.WCPDBenefitsLV.Min_DisabilityPercentHeader;
import pcftest.WCPDBenefitsLV.PD_BenefitEndDateHeader;
import pcftest.WCPDBenefitsLV.PD_BenefitStartDateHeader;
import pcftest.WCPDBenefitsLV.PD_MaxBenefitHeader;
import pcftest.WCPDBenefitsLV.PD_MinBenefitHeader;
import pcftest.WCPDBenefitsLV._ListPaging;
import pcftest.WCPDBenefitsLV.entry;
import pcftest.WCPDBenefitsLV.entry.JurisdictionState;
import pcftest.WCPDBenefitsLV.entry._Select;
import pcftest.WCPDBenefitsLV.entry._ViewDetail;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCPDBenefitsLV extends PCFElement {
  public final static String CHECKSUM = "cff0f7be4df4267b51143e26defac727";
  
  public WCPDBenefitsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public JurisdictionStateHeader getJurisdictionStateHeader() {
    return getOrCreateProperty("JurisdictionStateHeader", "JurisdictionStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDBenefitsLV.JurisdictionStateHeader.class);
  }
  
  public Max_DisabilityPercentHeader getMax_DisabilityPercentHeader() {
    return getOrCreateProperty("Max_DisabilityPercentHeader", "Max_DisabilityPercentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDBenefitsLV.Max_DisabilityPercentHeader.class);
  }
  
  public Min_DisabilityPercentHeader getMin_DisabilityPercentHeader() {
    return getOrCreateProperty("Min_DisabilityPercentHeader", "Min_DisabilityPercentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDBenefitsLV.Min_DisabilityPercentHeader.class);
  }
  
  public PD_BenefitEndDateHeader getPD_BenefitEndDateHeader() {
    return getOrCreateProperty("PD_BenefitEndDateHeader", "PD_BenefitEndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDBenefitsLV.PD_BenefitEndDateHeader.class);
  }
  
  public PD_BenefitStartDateHeader getPD_BenefitStartDateHeader() {
    return getOrCreateProperty("PD_BenefitStartDateHeader", "PD_BenefitStartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDBenefitsLV.PD_BenefitStartDateHeader.class);
  }
  
  public PD_MaxBenefitHeader getPD_MaxBenefitHeader() {
    return getOrCreateProperty("PD_MaxBenefitHeader", "PD_MaxBenefitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDBenefitsLV.PD_MaxBenefitHeader.class);
  }
  
  public PD_MinBenefitHeader getPD_MinBenefitHeader() {
    return getOrCreateProperty("PD_MinBenefitHeader", "PD_MinBenefitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCPDBenefitsLV.PD_MinBenefitHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WCPDBenefitsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WCPDBenefitsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionStateHeader extends ValueElement {
    public JurisdictionStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Max_DisabilityPercentHeader extends ValueElement {
    public Max_DisabilityPercentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Min_DisabilityPercentHeader extends ValueElement {
    public Min_DisabilityPercentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PD_BenefitEndDateHeader extends ValueElement {
    public PD_BenefitEndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PD_BenefitStartDateHeader extends ValueElement {
    public PD_BenefitStartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PD_MaxBenefitHeader extends ValueElement {
    public PD_MaxBenefitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PD_MinBenefitHeader extends ValueElement {
    public PD_MinBenefitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public JurisdictionState getJurisdictionState() {
      return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.WCPDBenefitsLV.entry.JurisdictionState.class);
    }
    
    public ValueElement getMax_DisabilityPercent() {
      return getOrCreateProperty("Max_DisabilityPercent", "Max_DisabilityPercent", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMin_DisabilityPercent() {
      return getOrCreateProperty("Min_DisabilityPercent", "Min_DisabilityPercent", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getPD_BenefitEndDate() {
      return getOrCreateProperty("PD_BenefitEndDate", "PD_BenefitEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getPD_BenefitStartDate() {
      return getOrCreateProperty("PD_BenefitStartDate", "PD_BenefitStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPD_MaxBenefit() {
      return getOrCreateProperty("PD_MaxBenefit", "PD_MaxBenefit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPD_MinBenefit() {
      return getOrCreateProperty("PD_MinBenefit", "PD_MinBenefit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WCPDBenefitsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WCPDBenefitsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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