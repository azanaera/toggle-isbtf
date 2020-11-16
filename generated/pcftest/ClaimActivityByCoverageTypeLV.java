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
import pcftest.ClaimActivityByCoverageTypeLV.ByCoverageTypeHeader;
import pcftest.ClaimActivityByCoverageTypeLV.ClaimActivity_AvgCloseTimeHeader;
import pcftest.ClaimActivityByCoverageTypeLV.ClaimActivity_ClosedExposuresHeader;
import pcftest.ClaimActivityByCoverageTypeLV.ClaimActivity_NewExposuresHeader;
import pcftest.ClaimActivityByCoverageTypeLV._ListPaging;
import pcftest.ClaimActivityByCoverageTypeLV.entry;
import pcftest.ClaimActivityByCoverageTypeLV.entry.ByCoverageType;
import pcftest.ClaimActivityByCoverageTypeLV.entry._Select;
import pcftest.ClaimActivityByCoverageTypeLV.entry._ViewDetail;
import typekey.CoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimActivityByCoverageTypeLV extends PCFElement {
  public final static String CHECKSUM = "cbd433bc1a8f15105ce66a4b05f82cc1";
  
  public ClaimActivityByCoverageTypeLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getByCoverageTypeFooter() {
    return getOrCreateProperty("ByCoverageTypeFooter", "ByCoverageTypeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ByCoverageTypeHeader getByCoverageTypeHeader() {
    return getOrCreateProperty("ByCoverageTypeHeader", "ByCoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByCoverageTypeLV.ByCoverageTypeHeader.class);
  }
  
  public ClaimActivity_AvgCloseTimeHeader getClaimActivity_AvgCloseTimeHeader() {
    return getOrCreateProperty("ClaimActivity_AvgCloseTimeHeader", "ClaimActivity_AvgCloseTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByCoverageTypeLV.ClaimActivity_AvgCloseTimeHeader.class);
  }
  
  public ValueElement getClaimActivity_ClosedExposuresFooter() {
    return getOrCreateProperty("ClaimActivity_ClosedExposuresFooter", "ClaimActivity_ClosedExposuresFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_ClosedExposuresHeader getClaimActivity_ClosedExposuresHeader() {
    return getOrCreateProperty("ClaimActivity_ClosedExposuresHeader", "ClaimActivity_ClosedExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByCoverageTypeLV.ClaimActivity_ClosedExposuresHeader.class);
  }
  
  public ValueElement getClaimActivity_NewExposuresFooter() {
    return getOrCreateProperty("ClaimActivity_NewExposuresFooter", "ClaimActivity_NewExposuresFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_NewExposuresHeader getClaimActivity_NewExposuresHeader() {
    return getOrCreateProperty("ClaimActivity_NewExposuresHeader", "ClaimActivity_NewExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByCoverageTypeLV.ClaimActivity_NewExposuresHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimActivityByCoverageTypeLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimActivityByCoverageTypeLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByCoverageTypeHeader extends ValueElement {
    public ByCoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_AvgCloseTimeHeader extends ValueElement {
    public ClaimActivity_AvgCloseTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_ClosedExposuresHeader extends ValueElement {
    public ClaimActivity_ClosedExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewExposuresHeader extends ValueElement {
    public ClaimActivity_NewExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ByCoverageType getByCoverageType() {
      return getOrCreateProperty("ByCoverageType", "ByCoverageType", null, pcftest.ClaimActivityByCoverageTypeLV.entry.ByCoverageType.class);
    }
    
    public ValueElement getClaimActivity_AvgCloseTime() {
      return getOrCreateProperty("ClaimActivity_AvgCloseTime", "ClaimActivity_AvgCloseTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_ClosedExposures() {
      return getOrCreateProperty("ClaimActivity_ClosedExposures", "ClaimActivity_ClosedExposures", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_NewExposures() {
      return getOrCreateProperty("ClaimActivity_NewExposures", "ClaimActivity_NewExposures", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimActivityByCoverageTypeLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimActivityByCoverageTypeLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ByCoverageType extends SelectElement {
      public ByCoverageType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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