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
import pcftest.LoadIntegrityChecksByStagingTableLV._ListPaging;
import pcftest.LoadIntegrityChecksByStagingTableLV.descriptionHeader;
import pcftest.LoadIntegrityChecksByStagingTableLV.entry;
import pcftest.LoadIntegrityChecksByStagingTableLV.entry._Select;
import pcftest.LoadIntegrityChecksByStagingTableLV.entry._ViewDetail;
import pcftest.LoadIntegrityChecksByStagingTableLV.entry.errortype;
import pcftest.LoadIntegrityChecksByStagingTableLV.entry.multi;
import pcftest.LoadIntegrityChecksByStagingTableLV.errortypeHeader;
import pcftest.LoadIntegrityChecksByStagingTableLV.multiHeader;
import pcftest.LoadIntegrityChecksByStagingTableLV.queryHeader;
import typekey.LoadErrorType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksByStagingTableLV extends PCFElement {
  public final static String CHECKSUM = "4720c5ea70bf175b92c72ebcc462c073";
  
  public LoadIntegrityChecksByStagingTableLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadIntegrityChecksByStagingTableLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadIntegrityChecksByStagingTableLV._ListPaging.class);
  }
  
  public descriptionHeader getdescriptionHeader() {
    return getOrCreateProperty("descriptionHeader", "descriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByStagingTableLV.descriptionHeader.class);
  }
  
  public errortypeHeader geterrortypeHeader() {
    return getOrCreateProperty("errortypeHeader", "errortypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByStagingTableLV.errortypeHeader.class);
  }
  
  public multiHeader getmultiHeader() {
    return getOrCreateProperty("multiHeader", "multiHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByStagingTableLV.multiHeader.class);
  }
  
  public queryHeader getqueryHeader() {
    return getOrCreateProperty("queryHeader", "queryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksByStagingTableLV.queryHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class descriptionHeader extends ValueElement {
    public descriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadIntegrityChecksByStagingTableLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadIntegrityChecksByStagingTableLV.entry._ViewDetail.class);
    }
    
    public ValueElement getdescription() {
      return getOrCreateProperty("description", "description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public errortype geterrortype() {
      return getOrCreateProperty("errortype", "errortype", null, pcftest.LoadIntegrityChecksByStagingTableLV.entry.errortype.class);
    }
    
    public multi getmulti() {
      return getOrCreateProperty("multi", "multi", null, pcftest.LoadIntegrityChecksByStagingTableLV.entry.multi.class);
    }
    
    public ValueElement getquery() {
      return getOrCreateProperty("query", "query", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class errortype extends SelectElement {
      public errortype(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LoadErrorType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LoadErrorType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LoadErrorType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LoadErrorType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class errortypeHeader extends ValueElement {
    public errortypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class multiHeader extends ValueElement {
    public multiHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksByStagingTableLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class queryHeader extends ValueElement {
    public queryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}