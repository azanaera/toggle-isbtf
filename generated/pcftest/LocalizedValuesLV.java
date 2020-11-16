package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LocalizedValuesLV.LanguageHeader;
import pcftest.LocalizedValuesLV.column0Header;
import pcftest.LocalizedValuesLV.column1Header;
import pcftest.LocalizedValuesLV.column2Header;
import pcftest.LocalizedValuesLV.entry;
import pcftest.LocalizedValuesLV.entry._Select;
import pcftest.LocalizedValuesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LocalizedValuesLV extends PCFElement {
  public final static String CHECKSUM = "0a3e4aeb859dd597ec87cc7e87bdc9cf";
  
  public LocalizedValuesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LanguageHeader getLanguageHeader() {
    return getOrCreateProperty("LanguageHeader", "LanguageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LocalizedValuesLV.LanguageHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LocalizedValuesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public column0Header getcolumn0Header() {
    return getOrCreateProperty("column0Header", "column0Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LocalizedValuesLV.column0Header.class);
  }
  
  public column1Header getcolumn1Header() {
    return getOrCreateProperty("column1Header", "column1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LocalizedValuesLV.column1Header.class);
  }
  
  public column2Header getcolumn2Header() {
    return getOrCreateProperty("column2Header", "column2Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LocalizedValuesLV.column2Header.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LanguageHeader extends ValueElement {
    public LanguageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class column0Header extends ValueElement {
    public column0Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class column1Header extends ValueElement {
    public column1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class column2Header extends ValueElement {
    public column2Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getLanguage() {
      return getOrCreateProperty("Language", "Language", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LocalizedValuesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LocalizedValuesLV.entry._ViewDetail.class);
    }
    
    public ValueElement getcolumn0() {
      return getOrCreateProperty("column0", "column0", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcolumn1() {
      return getOrCreateProperty("column1", "column1", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcolumn2() {
      return getOrCreateProperty("column2", "column2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/i18n/LocalizedValuesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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