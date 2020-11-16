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
import pcftest.LoadInsertSelectsLV._ListPaging;
import pcftest.LoadInsertSelectsLV.affectedrowcountHeader;
import pcftest.LoadInsertSelectsLV.entry;
import pcftest.LoadInsertSelectsLV.entry._Select;
import pcftest.LoadInsertSelectsLV.entry._ViewDetail;
import pcftest.LoadInsertSelectsLV.insertdurationHeader;
import pcftest.LoadInsertSelectsLV.insertendtimeHeader;
import pcftest.LoadInsertSelectsLV.insertexecuteorderHeader;
import pcftest.LoadInsertSelectsLV.insertqueryHeader;
import pcftest.LoadInsertSelectsLV.insertstagingtablenameHeader;
import pcftest.LoadInsertSelectsLV.insertstarttimeHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadInsertSelectsLV extends PCFElement {
  public final static String CHECKSUM = "090e5c10a2c76608603db679a1ebc79f";
  
  public LoadInsertSelectsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadInsertSelectsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadInsertSelectsLV._ListPaging.class);
  }
  
  public affectedrowcountHeader getaffectedrowcountHeader() {
    return getOrCreateProperty("affectedrowcountHeader", "affectedrowcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadInsertSelectsLV.affectedrowcountHeader.class);
  }
  
  public insertdurationHeader getinsertdurationHeader() {
    return getOrCreateProperty("insertdurationHeader", "insertdurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadInsertSelectsLV.insertdurationHeader.class);
  }
  
  public insertendtimeHeader getinsertendtimeHeader() {
    return getOrCreateProperty("insertendtimeHeader", "insertendtimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadInsertSelectsLV.insertendtimeHeader.class);
  }
  
  public insertexecuteorderHeader getinsertexecuteorderHeader() {
    return getOrCreateProperty("insertexecuteorderHeader", "insertexecuteorderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadInsertSelectsLV.insertexecuteorderHeader.class);
  }
  
  public insertqueryHeader getinsertqueryHeader() {
    return getOrCreateProperty("insertqueryHeader", "insertqueryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadInsertSelectsLV.insertqueryHeader.class);
  }
  
  public insertstagingtablenameHeader getinsertstagingtablenameHeader() {
    return getOrCreateProperty("insertstagingtablenameHeader", "insertstagingtablenameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadInsertSelectsLV.insertstagingtablenameHeader.class);
  }
  
  public insertstarttimeHeader getinsertstarttimeHeader() {
    return getOrCreateProperty("insertstarttimeHeader", "insertstarttimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadInsertSelectsLV.insertstarttimeHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class affectedrowcountHeader extends ValueElement {
    public affectedrowcountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadInsertSelectsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadInsertSelectsLV.entry._ViewDetail.class);
    }
    
    public ValueElement getaffectedrowcount() {
      return getOrCreateProperty("affectedrowcount", "affectedrowcount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinsertduration() {
      return getOrCreateProperty("insertduration", "insertduration", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinsertendtime() {
      return getOrCreateProperty("insertendtime", "insertendtime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinsertexecuteorder() {
      return getOrCreateProperty("insertexecuteorder", "insertexecuteorder", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinsertquery() {
      return getOrCreateProperty("insertquery", "insertquery", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinsertstagingtablename() {
      return getOrCreateProperty("insertstagingtablename", "insertstagingtablename", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinsertstarttime() {
      return getOrCreateProperty("insertstarttime", "insertstarttime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class insertdurationHeader extends ValueElement {
    public insertdurationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class insertendtimeHeader extends ValueElement {
    public insertendtimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class insertexecuteorderHeader extends ValueElement {
    public insertexecuteorderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class insertqueryHeader extends ValueElement {
    public insertqueryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class insertstagingtablenameHeader extends ValueElement {
    public insertstagingtablenameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class insertstarttimeHeader extends ValueElement {
    public insertstarttimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}