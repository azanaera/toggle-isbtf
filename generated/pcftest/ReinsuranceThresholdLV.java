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
import pcftest.ReinsuranceThresholdLV.EndDateHeader;
import pcftest.ReinsuranceThresholdLV.PolicyTypeHeader;
import pcftest.ReinsuranceThresholdLV.ReportingThresholdHeader;
import pcftest.ReinsuranceThresholdLV.StartDateHeader;
import pcftest.ReinsuranceThresholdLV.ThresholdValueHeader;
import pcftest.ReinsuranceThresholdLV.TreatyTypeHeader;
import pcftest.ReinsuranceThresholdLV._ListPaging;
import pcftest.ReinsuranceThresholdLV.entry;
import pcftest.ReinsuranceThresholdLV.entry.TreatyType;
import pcftest.ReinsuranceThresholdLV.entry._Select;
import pcftest.ReinsuranceThresholdLV.entry._ViewDetail;
import typekey.ReinsuranceTreatyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceThresholdLV extends PCFElement {
  public final static String CHECKSUM = "da73c43cba695c5e06c01bfda39f0cf5";
  
  public ReinsuranceThresholdLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EndDateHeader getEndDateHeader() {
    return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceThresholdLV.EndDateHeader.class);
  }
  
  public PolicyTypeHeader getPolicyTypeHeader() {
    return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceThresholdLV.PolicyTypeHeader.class);
  }
  
  public ReportingThresholdHeader getReportingThresholdHeader() {
    return getOrCreateProperty("ReportingThresholdHeader", "ReportingThresholdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceThresholdLV.ReportingThresholdHeader.class);
  }
  
  public StartDateHeader getStartDateHeader() {
    return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceThresholdLV.StartDateHeader.class);
  }
  
  public ThresholdValueHeader getThresholdValueHeader() {
    return getOrCreateProperty("ThresholdValueHeader", "ThresholdValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceThresholdLV.ThresholdValueHeader.class);
  }
  
  public TreatyTypeHeader getTreatyTypeHeader() {
    return getOrCreateProperty("TreatyTypeHeader", "TreatyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceThresholdLV.TreatyTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceThresholdLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ReinsuranceThresholdLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndDateHeader extends ValueElement {
    public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeHeader extends ValueElement {
    public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportingThresholdHeader extends ValueElement {
    public ReportingThresholdHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartDateHeader extends ValueElement {
    public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ThresholdValueHeader extends ValueElement {
    public ThresholdValueHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TreatyTypeHeader extends ValueElement {
    public TreatyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getEndDate() {
      return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.ReinsuranceThresholdLV.entry.PolicyType getPolicyType() {
      return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.ReinsuranceThresholdLV.entry.PolicyType.class);
    }
    
    public ValueElement getReportingThreshold() {
      return getOrCreateProperty("ReportingThreshold", "ReportingThreshold", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getThresholdValue() {
      return getOrCreateProperty("ThresholdValue", "ThresholdValue", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TreatyType getTreatyType() {
      return getOrCreateProperty("TreatyType", "TreatyType", null, pcftest.ReinsuranceThresholdLV.entry.TreatyType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceThresholdLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceThresholdLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyType extends SelectElement {
      public PolicyType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.PolicyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.PolicyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.PolicyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TreatyType extends SelectElement {
      public TreatyType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ReinsuranceTreatyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ReinsuranceTreatyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReinsuranceTreatyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ReinsuranceTreatyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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