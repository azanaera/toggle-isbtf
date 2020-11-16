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
import pcftest.IMEPerformedLV.IMEPerformed_IMEDateHeader;
import pcftest.IMEPerformedLV.IMEPerformed_IMETypeHeader;
import pcftest.IMEPerformedLV._ListPaging;
import pcftest.IMEPerformedLV.entry;
import pcftest.IMEPerformedLV.entry.IMEPerformed_IMEType;
import pcftest.IMEPerformedLV.entry._Select;
import pcftest.IMEPerformedLV.entry._ViewDetail;
import typekey.IMEType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class IMEPerformedLV extends PCFElement {
  public final static String CHECKSUM = "d6645df33785c7d220c3bfcc9b5acfd7";
  
  public IMEPerformedLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IMEPerformed_IMEDateHeader getIMEPerformed_IMEDateHeader() {
    return getOrCreateProperty("IMEPerformed_IMEDateHeader", "IMEPerformed_IMEDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IMEPerformedLV.IMEPerformed_IMEDateHeader.class);
  }
  
  public IMEPerformed_IMETypeHeader getIMEPerformed_IMETypeHeader() {
    return getOrCreateProperty("IMEPerformed_IMETypeHeader", "IMEPerformed_IMETypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IMEPerformedLV.IMEPerformed_IMETypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.IMEPerformedLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.IMEPerformedLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IMEPerformed_IMEDateHeader extends ValueElement {
    public IMEPerformed_IMEDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IMEPerformed_IMETypeHeader extends ValueElement {
    public IMEPerformed_IMETypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getIMEPerformed_IMEDate() {
      return getOrCreateProperty("IMEPerformed_IMEDate", "IMEPerformed_IMEDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IMEPerformed_IMEType getIMEPerformed_IMEType() {
      return getOrCreateProperty("IMEPerformed_IMEType", "IMEPerformed_IMEType", null, pcftest.IMEPerformedLV.entry.IMEPerformed_IMEType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.IMEPerformedLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.IMEPerformedLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IMEPerformed_IMEType extends SelectElement {
      public IMEPerformed_IMEType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(IMEType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public IMEType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.IMEType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(IMEType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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