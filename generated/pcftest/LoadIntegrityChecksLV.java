package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadIntegrityChecksLV.ThreadNameIDHeader;
import pcftest.LoadIntegrityChecksLV._ListPaging;
import pcftest.LoadIntegrityChecksLV.entry;
import pcftest.LoadIntegrityChecksLV.entry._Select;
import pcftest.LoadIntegrityChecksLV.entry._ViewDetail;
import pcftest.LoadIntegrityChecksLV.icchekctestHeader;
import pcftest.LoadIntegrityChecksLV.icdescriptionHeader;
import pcftest.LoadIntegrityChecksLV.icdurationHeader;
import pcftest.LoadIntegrityChecksLV.icendtimeHeader;
import pcftest.LoadIntegrityChecksLV.icexecuteorderHeader;
import pcftest.LoadIntegrityChecksLV.icqueryHeader;
import pcftest.LoadIntegrityChecksLV.icstagingtablenameHeader;
import pcftest.LoadIntegrityChecksLV.icstarttimeHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksLV extends PCFElement {
  public final static String CHECKSUM = "8da3c1023c9981791eb7ec417def9bd3";
  
  public LoadIntegrityChecksLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ThreadNameIDHeader getThreadNameIDHeader() {
    return getOrCreateProperty("ThreadNameIDHeader", "ThreadNameIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.ThreadNameIDHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadIntegrityChecksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadIntegrityChecksLV._ListPaging.class);
  }
  
  public icchekctestHeader geticchekctestHeader() {
    return getOrCreateProperty("icchekctestHeader", "icchekctestHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icchekctestHeader.class);
  }
  
  public icdescriptionHeader geticdescriptionHeader() {
    return getOrCreateProperty("icdescriptionHeader", "icdescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icdescriptionHeader.class);
  }
  
  public icdurationHeader geticdurationHeader() {
    return getOrCreateProperty("icdurationHeader", "icdurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icdurationHeader.class);
  }
  
  public icendtimeHeader geticendtimeHeader() {
    return getOrCreateProperty("icendtimeHeader", "icendtimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icendtimeHeader.class);
  }
  
  public icexecuteorderHeader geticexecuteorderHeader() {
    return getOrCreateProperty("icexecuteorderHeader", "icexecuteorderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icexecuteorderHeader.class);
  }
  
  public icqueryHeader geticqueryHeader() {
    return getOrCreateProperty("icqueryHeader", "icqueryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icqueryHeader.class);
  }
  
  public icstagingtablenameHeader geticstagingtablenameHeader() {
    return getOrCreateProperty("icstagingtablenameHeader", "icstagingtablenameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icstagingtablenameHeader.class);
  }
  
  public icstarttimeHeader geticstarttimeHeader() {
    return getOrCreateProperty("icstarttimeHeader", "icstarttimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksLV.icstarttimeHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ThreadNameIDHeader extends ValueElement {
    public ThreadNameIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getThreadNameID() {
      return getOrCreateProperty("ThreadNameID", "ThreadNameID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadIntegrityChecksLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadIntegrityChecksLV.entry._ViewDetail.class);
    }
    
    public ValueElement geticchekctest() {
      return getOrCreateProperty("icchekctest", "icchekctest", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement geticdescription() {
      return getOrCreateProperty("icdescription", "icdescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement geticduration() {
      return getOrCreateProperty("icduration", "icduration", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement geticendtime() {
      return getOrCreateProperty("icendtime", "icendtime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement geticexecuteorder() {
      return getOrCreateProperty("icexecuteorder", "icexecuteorder", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement geticquery() {
      return getOrCreateProperty("icquery", "icquery", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement geticstagingtablename() {
      return getOrCreateProperty("icstagingtablename", "icstagingtablename", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement geticstarttime() {
      return getOrCreateProperty("icstarttime", "icstarttime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icchekctestHeader extends ValueElement {
    public icchekctestHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icdescriptionHeader extends ValueElement {
    public icdescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icdurationHeader extends ValueElement {
    public icdurationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icendtimeHeader extends ValueElement {
    public icendtimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icexecuteorderHeader extends ValueElement {
    public icexecuteorderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icqueryHeader extends ValueElement {
    public icqueryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icstagingtablenameHeader extends ValueElement {
    public icstagingtablenameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class icstarttimeHeader extends ValueElement {
    public icstarttimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}