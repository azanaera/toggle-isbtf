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
import pcftest.DriverCitationsLV.CitationsArray_CitationAuthorityHeader;
import pcftest.DriverCitationsLV.CitationsArray_CitationNumberHeader;
import pcftest.DriverCitationsLV.CitationsArray_CitationTypeHeader;
import pcftest.DriverCitationsLV._ListPaging;
import pcftest.DriverCitationsLV.entry;
import pcftest.DriverCitationsLV.entry.CitationsArray_CitationType;
import pcftest.DriverCitationsLV.entry._Select;
import pcftest.DriverCitationsLV.entry._ViewDetail;
import typekey.CitationType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DriverCitationsLV extends PCFElement {
  public final static String CHECKSUM = "726582d35d7f56782876b439e6443295";
  
  public DriverCitationsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CitationsArray_CitationAuthorityHeader getCitationsArray_CitationAuthorityHeader() {
    return getOrCreateProperty("CitationsArray_CitationAuthorityHeader", "CitationsArray_CitationAuthorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DriverCitationsLV.CitationsArray_CitationAuthorityHeader.class);
  }
  
  public CitationsArray_CitationNumberHeader getCitationsArray_CitationNumberHeader() {
    return getOrCreateProperty("CitationsArray_CitationNumberHeader", "CitationsArray_CitationNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DriverCitationsLV.CitationsArray_CitationNumberHeader.class);
  }
  
  public CitationsArray_CitationTypeHeader getCitationsArray_CitationTypeHeader() {
    return getOrCreateProperty("CitationsArray_CitationTypeHeader", "CitationsArray_CitationTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DriverCitationsLV.CitationsArray_CitationTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DriverCitationsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DriverCitationsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CitationsArray_CitationAuthorityHeader extends ValueElement {
    public CitationsArray_CitationAuthorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CitationsArray_CitationNumberHeader extends ValueElement {
    public CitationsArray_CitationNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CitationsArray_CitationTypeHeader extends ValueElement {
    public CitationsArray_CitationTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCitationsArray_CitationAuthority() {
      return getOrCreateProperty("CitationsArray_CitationAuthority", "CitationsArray_CitationAuthority", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCitationsArray_CitationNumber() {
      return getOrCreateProperty("CitationsArray_CitationNumber", "CitationsArray_CitationNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CitationsArray_CitationType getCitationsArray_CitationType() {
      return getOrCreateProperty("CitationsArray_CitationType", "CitationsArray_CitationType", null, pcftest.DriverCitationsLV.entry.CitationsArray_CitationType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DriverCitationsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DriverCitationsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CitationsArray_CitationType extends SelectElement {
      public CitationsArray_CitationType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CitationType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CitationType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CitationType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CitationType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/DriverCitationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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