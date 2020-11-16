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
import pcftest.LoadCallbacksLV._ListPaging;
import pcftest.LoadCallbacksLV.callbackdescriptionHeader;
import pcftest.LoadCallbacksLV.callbackdurationHeader;
import pcftest.LoadCallbacksLV.callbackendtimeHeader;
import pcftest.LoadCallbacksLV.callbackexecuteorderHeader;
import pcftest.LoadCallbacksLV.callbacknameHeader;
import pcftest.LoadCallbacksLV.callbackstarttimeHeader;
import pcftest.LoadCallbacksLV.callbacktimetypeHeader;
import pcftest.LoadCallbacksLV.entry;
import pcftest.LoadCallbacksLV.entry._Select;
import pcftest.LoadCallbacksLV.entry._ViewDetail;
import pcftest.LoadCallbacksLV.entry.callbackname;
import pcftest.LoadCallbacksLV.entry.callbacktimetype;
import pcftest.LoadCallbacksLV.loadresultscountHeader;
import typekey.LoaderCallbackTimeType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadCallbacksLV extends PCFElement {
  public final static String CHECKSUM = "ff4cd5b56063df83722c14b31acd23ed";
  
  public LoadCallbacksLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadCallbacksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadCallbacksLV._ListPaging.class);
  }
  
  public callbackdescriptionHeader getcallbackdescriptionHeader() {
    return getOrCreateProperty("callbackdescriptionHeader", "callbackdescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.callbackdescriptionHeader.class);
  }
  
  public callbackdurationHeader getcallbackdurationHeader() {
    return getOrCreateProperty("callbackdurationHeader", "callbackdurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.callbackdurationHeader.class);
  }
  
  public callbackendtimeHeader getcallbackendtimeHeader() {
    return getOrCreateProperty("callbackendtimeHeader", "callbackendtimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.callbackendtimeHeader.class);
  }
  
  public callbackexecuteorderHeader getcallbackexecuteorderHeader() {
    return getOrCreateProperty("callbackexecuteorderHeader", "callbackexecuteorderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.callbackexecuteorderHeader.class);
  }
  
  public callbacknameHeader getcallbacknameHeader() {
    return getOrCreateProperty("callbacknameHeader", "callbacknameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.callbacknameHeader.class);
  }
  
  public callbackstarttimeHeader getcallbackstarttimeHeader() {
    return getOrCreateProperty("callbackstarttimeHeader", "callbackstarttimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.callbackstarttimeHeader.class);
  }
  
  public callbacktimetypeHeader getcallbacktimetypeHeader() {
    return getOrCreateProperty("callbacktimetypeHeader", "callbacktimetypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.callbacktimetypeHeader.class);
  }
  
  public loadresultscountHeader getloadresultscountHeader() {
    return getOrCreateProperty("loadresultscountHeader", "loadresultscountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbacksLV.loadresultscountHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class callbackdescriptionHeader extends ValueElement {
    public callbackdescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class callbackdurationHeader extends ValueElement {
    public callbackdurationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class callbackendtimeHeader extends ValueElement {
    public callbackendtimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class callbackexecuteorderHeader extends ValueElement {
    public callbackexecuteorderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class callbacknameHeader extends ValueElement {
    public callbacknameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class callbackstarttimeHeader extends ValueElement {
    public callbackstarttimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class callbacktimetypeHeader extends ValueElement {
    public callbacktimetypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadCallbacksLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadCallbacksLV.entry._ViewDetail.class);
    }
    
    public ValueElement getcallbackdescription() {
      return getOrCreateProperty("callbackdescription", "callbackdescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcallbackduration() {
      return getOrCreateProperty("callbackduration", "callbackduration", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcallbackendtime() {
      return getOrCreateProperty("callbackendtime", "callbackendtime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcallbackexecuteorder() {
      return getOrCreateProperty("callbackexecuteorder", "callbackexecuteorder", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public callbackname getcallbackname() {
      return getOrCreateProperty("callbackname", "callbackname", null, pcftest.LoadCallbacksLV.entry.callbackname.class);
    }
    
    public ValueElement getcallbackstarttime() {
      return getOrCreateProperty("callbackstarttime", "callbackstarttime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public callbacktimetype getcallbacktimetype() {
      return getOrCreateProperty("callbacktimetype", "callbacktimetype", null, pcftest.LoadCallbacksLV.entry.callbacktimetype.class);
    }
    
    public ValueElement getloadresultscount() {
      return getOrCreateProperty("loadresultscount", "loadresultscount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class callbackname extends ValueElement {
      public callbackname(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LoadCallbackResultsDetail click() {
        return clickThis(pcftest.LoadCallbackResultsDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class callbacktimetype extends SelectElement {
      public callbacktimetype(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LoaderCallbackTimeType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LoaderCallbackTimeType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LoaderCallbackTimeType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LoaderCallbackTimeType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class loadresultscountHeader extends ValueElement {
    public loadresultscountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}