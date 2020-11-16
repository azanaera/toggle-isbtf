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
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV._ListPaging;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.descriptionHeader;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry._Select;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry._ViewDetail;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry.multi;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.multiHeader;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.queryHeader;
import pcftest.LoadIntegrityChecksByLoadErrorTypeLV.stagingtableHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksByLoadErrorTypeLV extends PCFElement {
  public final static String CHECKSUM = "8c2cf0a9c2e7d93794e9270f1e2f92f3";
  
  public LoadIntegrityChecksByLoadErrorTypeLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadIntegrityChecksByLoadErrorTypeLV._ListPaging.class);
  }
  
  public descriptionHeader getdescriptionHeader() {
    return getOrCreateProperty("descriptionHeader", "descriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.descriptionHeader.class);
  }
  
  public multiHeader getmultiHeader() {
    return getOrCreateProperty("multiHeader", "multiHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.multiHeader.class);
  }
  
  public queryHeader getqueryHeader() {
    return getOrCreateProperty("queryHeader", "queryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.queryHeader.class);
  }
  
  public stagingtableHeader getstagingtableHeader() {
    return getOrCreateProperty("stagingtableHeader", "stagingtableHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.stagingtableHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class descriptionHeader extends ValueElement {
    public descriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry._ViewDetail.class);
    }
    
    public ValueElement getdescription() {
      return getOrCreateProperty("description", "description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public multi getmulti() {
      return getOrCreateProperty("multi", "multi", null, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.entry.multi.class);
    }
    
    public ValueElement getquery() {
      return getOrCreateProperty("query", "query", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getstagingtable() {
      return getOrCreateProperty("stagingtable", "stagingtable", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class multi extends ValueElement {
      public multi(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LoadIntegrityChecksCompoundLVPopup click() {
        return clickThis(pcftest.LoadIntegrityChecksCompoundLVPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class multiHeader extends ValueElement {
    public multiHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class queryHeader extends ValueElement {
    public queryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class stagingtableHeader extends ValueElement {
    public stagingtableHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}