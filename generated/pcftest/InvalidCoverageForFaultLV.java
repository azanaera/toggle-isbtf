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
import pcftest.InvalidCoverageForFaultLV.FaultHeader;
import pcftest.InvalidCoverageForFaultLV.PolicyTypeHeader;
import pcftest.InvalidCoverageForFaultLV.PrimaryCoverageHeader;
import pcftest.InvalidCoverageForFaultLV._ListPaging;
import pcftest.InvalidCoverageForFaultLV.entry;
import pcftest.InvalidCoverageForFaultLV.entry.Fault;
import pcftest.InvalidCoverageForFaultLV.entry.PrimaryCoverage;
import pcftest.InvalidCoverageForFaultLV.entry._Select;
import pcftest.InvalidCoverageForFaultLV.entry._ViewDetail;
import typekey.CoverageType;
import typekey.FaultRating;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InvalidCoverageForFaultLV extends PCFElement {
  public final static String CHECKSUM = "e20394baa32beebbc8be6311700730b8";
  
  public InvalidCoverageForFaultLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FaultHeader getFaultHeader() {
    return getOrCreateProperty("FaultHeader", "FaultHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForFaultLV.FaultHeader.class);
  }
  
  public PolicyTypeHeader getPolicyTypeHeader() {
    return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForFaultLV.PolicyTypeHeader.class);
  }
  
  public PrimaryCoverageHeader getPrimaryCoverageHeader() {
    return getOrCreateProperty("PrimaryCoverageHeader", "PrimaryCoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForFaultLV.PrimaryCoverageHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InvalidCoverageForFaultLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InvalidCoverageForFaultLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FaultHeader extends ValueElement {
    public FaultHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeHeader extends ValueElement {
    public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryCoverageHeader extends ValueElement {
    public PrimaryCoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Fault getFault() {
      return getOrCreateProperty("Fault", "Fault", null, pcftest.InvalidCoverageForFaultLV.entry.Fault.class);
    }
    
    public pcftest.InvalidCoverageForFaultLV.entry.PolicyType getPolicyType() {
      return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.InvalidCoverageForFaultLV.entry.PolicyType.class);
    }
    
    public PrimaryCoverage getPrimaryCoverage() {
      return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.InvalidCoverageForFaultLV.entry.PrimaryCoverage.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.InvalidCoverageForFaultLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InvalidCoverageForFaultLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Fault extends SelectElement {
      public Fault(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(FaultRating arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public FaultRating getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FaultRating.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(FaultRating arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryCoverage extends SelectElement {
      public PrimaryCoverage(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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