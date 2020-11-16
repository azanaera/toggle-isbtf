package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.ICDLV.Body_SystemHeader;
import pcftest.ICDLV.ChronicHeader;
import pcftest.ICDLV.Date_AvailableHeader;
import pcftest.ICDLV.Expiry_DateHeader;
import pcftest.ICDLV.ICDDescHeader;
import pcftest.ICDLV.ICDFullCodeHeader;
import pcftest.ICDLV._ListPaging;
import pcftest.ICDLV.entry;
import pcftest.ICDLV.entry.Body_System;
import pcftest.ICDLV.entry.ICDFullCode;
import pcftest.ICDLV.entry._Select;
import pcftest.ICDLV.entry._ViewDetail;
import typekey.ICDBodySystem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ICDLV extends PCFElement {
  public final static String CHECKSUM = "73364fcfabd310ed3204f7aae3563cb6";
  
  public ICDLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Body_SystemHeader getBody_SystemHeader() {
    return getOrCreateProperty("Body_SystemHeader", "Body_SystemHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDLV.Body_SystemHeader.class);
  }
  
  public ChronicHeader getChronicHeader() {
    return getOrCreateProperty("ChronicHeader", "ChronicHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDLV.ChronicHeader.class);
  }
  
  public Date_AvailableHeader getDate_AvailableHeader() {
    return getOrCreateProperty("Date_AvailableHeader", "Date_AvailableHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDLV.Date_AvailableHeader.class);
  }
  
  public Expiry_DateHeader getExpiry_DateHeader() {
    return getOrCreateProperty("Expiry_DateHeader", "Expiry_DateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDLV.Expiry_DateHeader.class);
  }
  
  public ICDDescHeader getICDDescHeader() {
    return getOrCreateProperty("ICDDescHeader", "ICDDescHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDLV.ICDDescHeader.class);
  }
  
  public ICDFullCodeHeader getICDFullCodeHeader() {
    return getOrCreateProperty("ICDFullCodeHeader", "ICDFullCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDLV.ICDFullCodeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ICDLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ICDLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Body_SystemHeader extends ValueElement {
    public Body_SystemHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChronicHeader extends ValueElement {
    public ChronicHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Date_AvailableHeader extends ValueElement {
    public Date_AvailableHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Expiry_DateHeader extends ValueElement {
    public Expiry_DateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDDescHeader extends ValueElement {
    public ICDDescHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDFullCodeHeader extends ValueElement {
    public ICDFullCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Body_System getBody_System() {
      return getOrCreateProperty("Body_System", "Body_System", null, pcftest.ICDLV.entry.Body_System.class);
    }
    
    public CheckboxValueElement getChronic() {
      return getOrCreateProperty("Chronic", "Chronic", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public DateElement getDate_Available() {
      return getOrCreateProperty("Date_Available", "Date_Available", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getExpiry_Date() {
      return getOrCreateProperty("Expiry_Date", "Expiry_Date", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getICDDesc() {
      return getOrCreateProperty("ICDDesc", "ICDDesc", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ICDFullCode getICDFullCode() {
      return getOrCreateProperty("ICDFullCode", "ICDFullCode", null, pcftest.ICDLV.entry.ICDFullCode.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ICDLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ICDLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Body_System extends SelectElement {
      public Body_System(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ICDBodySystem arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ICDBodySystem getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ICDBodySystem.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ICDBodySystem arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ICDFullCode extends ValueElement {
      public ICDFullCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ICDPopup click() {
        return clickThis(pcftest.ICDPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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