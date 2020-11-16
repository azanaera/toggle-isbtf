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
import pcftest.InvalidCoverageForCauseLV.LOBCodeHeader;
import pcftest.InvalidCoverageForCauseLV.LossCauseHeader;
import pcftest.InvalidCoverageForCauseLV.LossTypeHeader;
import pcftest.InvalidCoverageForCauseLV.PolicyTypeHeader;
import pcftest.InvalidCoverageForCauseLV.PrimaryCoverageHeader;
import pcftest.InvalidCoverageForCauseLV._ListPaging;
import pcftest.InvalidCoverageForCauseLV.entry;
import pcftest.InvalidCoverageForCauseLV.entry.PrimaryCoverage;
import pcftest.InvalidCoverageForCauseLV.entry._Select;
import pcftest.InvalidCoverageForCauseLV.entry._ViewDetail;
import typekey.CoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InvalidCoverageForCauseLV extends PCFElement {
  public final static String CHECKSUM = "0f109b3e6e7d1bc117768a7870a44e56";
  
  public InvalidCoverageForCauseLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LOBCodeHeader getLOBCodeHeader() {
    return getOrCreateProperty("LOBCodeHeader", "LOBCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForCauseLV.LOBCodeHeader.class);
  }
  
  public LossCauseHeader getLossCauseHeader() {
    return getOrCreateProperty("LossCauseHeader", "LossCauseHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForCauseLV.LossCauseHeader.class);
  }
  
  public LossTypeHeader getLossTypeHeader() {
    return getOrCreateProperty("LossTypeHeader", "LossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForCauseLV.LossTypeHeader.class);
  }
  
  public PolicyTypeHeader getPolicyTypeHeader() {
    return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForCauseLV.PolicyTypeHeader.class);
  }
  
  public PrimaryCoverageHeader getPrimaryCoverageHeader() {
    return getOrCreateProperty("PrimaryCoverageHeader", "PrimaryCoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InvalidCoverageForCauseLV.PrimaryCoverageHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InvalidCoverageForCauseLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InvalidCoverageForCauseLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LOBCodeHeader extends ValueElement {
    public LOBCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossCauseHeader extends ValueElement {
    public LossCauseHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypeHeader extends ValueElement {
    public LossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeHeader extends ValueElement {
    public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryCoverageHeader extends ValueElement {
    public PrimaryCoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.InvalidCoverageForCauseLV.entry.LOBCode getLOBCode() {
      return getOrCreateProperty("LOBCode", "LOBCode", null, pcftest.InvalidCoverageForCauseLV.entry.LOBCode.class);
    }
    
    public pcftest.InvalidCoverageForCauseLV.entry.LossCause getLossCause() {
      return getOrCreateProperty("LossCause", "LossCause", null, pcftest.InvalidCoverageForCauseLV.entry.LossCause.class);
    }
    
    public pcftest.InvalidCoverageForCauseLV.entry.LossType getLossType() {
      return getOrCreateProperty("LossType", "LossType", null, pcftest.InvalidCoverageForCauseLV.entry.LossType.class);
    }
    
    public pcftest.InvalidCoverageForCauseLV.entry.PolicyType getPolicyType() {
      return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.InvalidCoverageForCauseLV.entry.PolicyType.class);
    }
    
    public PrimaryCoverage getPrimaryCoverage() {
      return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.InvalidCoverageForCauseLV.entry.PrimaryCoverage.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.InvalidCoverageForCauseLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InvalidCoverageForCauseLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LOBCode extends SelectElement {
      public LOBCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LOBCode arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LOBCode getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LOBCode arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossCause extends SelectElement {
      public LossCause(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LossCause arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LossCause getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LossCause arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossType extends SelectElement {
      public LossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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