package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PrintOptionDV.CustomCsvColumnsLV;
import pcftest.PrintOptionDV.CustomCsvColumnsLV.NameHeader;
import pcftest.PrintOptionDV.CustomCsvColumnsLV.entry;
import pcftest.PrintOptionDV.CustomCsvColumnsLV.entry._Select;
import pcftest.PrintOptionDV.CustomCsvColumnsLV.entry._ViewDetail;
import pcftest.PrintOptionDV.CustomCsvColumnsLV_tb;
import pcftest.PrintOptionDV.CustomExportChoice_Choice;
import pcftest.PrintOptionDV.ExportChoice_Choice;
import pcftest.PrintOptionDV.PrintChoice_Choice;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PrintOptionDV extends DetailViewElement {
  public final static String CHECKSUM = "7760954de27a551679ea33d751fa7b1f";
  
  public PrintOptionDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CustomCsvColumnsLV getCustomCsvColumnsLV() {
    return getOrCreateProperty("CustomCsvColumnsLV", "CustomCsvColumnsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PrintOptionDV.CustomCsvColumnsLV.class);
  }
  
  public CustomCsvColumnsLV_tb getCustomCsvColumnsLV_tb() {
    return getOrCreateProperty("CustomCsvColumnsLV_tb", "CustomCsvColumnsLV_tb", null, pcftest.PrintOptionDV.CustomCsvColumnsLV_tb.class);
  }
  
  public ValueElement getCustomExport() {
    return getOrCreateProperty("CustomExport", "CustomExport", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CustomExportChoice_Choice getCustomExportChoice_Choice() {
    return getOrCreateProperty("CustomExportChoice_Choice", "CustomExportChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PrintOptionDV.CustomExportChoice_Choice.class);
  }
  
  public ValueElement getDoPrint() {
    return getOrCreateProperty("DoPrint", "DoPrint", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExport() {
    return getOrCreateProperty("Export", "Export", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExportChoice_Choice getExportChoice_Choice() {
    return getOrCreateProperty("ExportChoice_Choice", "ExportChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PrintOptionDV.ExportChoice_Choice.class);
  }
  
  public PrintChoice_Choice getPrintChoice_Choice() {
    return getOrCreateProperty("PrintChoice_Choice", "PrintChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PrintOptionDV.PrintChoice_Choice.class);
  }
  
  public SelectElement getcharsetRI() {
    return getOrCreateProperty("charsetRI", "charsetRI", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomCsvColumnsLV extends PCFElement {
    public CustomCsvColumnsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PrintOptionDV.CustomCsvColumnsLV.NameHeader.class);
    }
    
    public ValueElement getSelectHeader() {
      return getOrCreateProperty("SelectHeader", "SelectHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PrintOptionDV.CustomCsvColumnsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CheckboxValueElement getSelect() {
        return getOrCreateProperty("Select", "Select", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.PrintOptionDV.CustomCsvColumnsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PrintOptionDV.CustomCsvColumnsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomCsvColumnsLV_tb extends PCFElement {
    public CustomCsvColumnsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomExportChoice_Choice extends RadioButtonValueElement {
    public CustomExportChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportChoice_Choice extends RadioButtonValueElement {
    public ExportChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/PrintOptionDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrintChoice_Choice extends RadioButtonValueElement {
    public PrintChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}