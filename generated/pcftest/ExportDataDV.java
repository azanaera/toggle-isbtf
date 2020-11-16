package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.ExportDataDV.ExportDataSetLV;
import pcftest.ExportDataDV.ExportDataSetLV.DataSetHeader;
import pcftest.ExportDataDV.ExportDataSetLV._ListPaging;
import pcftest.ExportDataDV.ExportDataSetLV.entry;
import pcftest.ExportDataDV.ExportDataSetLV.entry._Select;
import pcftest.ExportDataDV.ExportDataSetLV.entry._ViewDetail;
import pcftest.ExportDataDV.ExportDataSetLV_tb;
import pcftest.ExportDataDV.ExportDataSetLV_tb.ExportButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExportDataDV extends DetailViewElement {
  public final static String CHECKSUM = "24fa005ba581c44d9a875f9a8c0c97b7";
  
  public ExportDataDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ExportDataSetLV getExportDataSetLV() {
    return getOrCreateProperty("ExportDataSetLV", "ExportDataSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ExportDataDV.ExportDataSetLV.class);
  }
  
  public ExportDataSetLV_tb getExportDataSetLV_tb() {
    return getOrCreateProperty("ExportDataSetLV_tb", "ExportDataSetLV_tb", null, pcftest.ExportDataDV.ExportDataSetLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportDataSetLV extends PCFElement {
    public ExportDataSetLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DataSetHeader getDataSetHeader() {
      return getOrCreateProperty("DataSetHeader", "DataSetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExportDataDV.ExportDataSetLV.DataSetHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ExportDataDV.ExportDataSetLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ExportDataDV.ExportDataSetLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DataSetHeader extends ValueElement {
      public DataSetHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDataSet() {
        return getOrCreateProperty("DataSet", "DataSet", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ExportDataDV.ExportDataSetLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ExportDataDV.ExportDataSetLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportDataSetLV_tb extends PCFElement {
    public ExportDataSetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExportButton getExportButton() {
      return getOrCreateProperty("ExportButton", "ExportButton", null, pcftest.ExportDataDV.ExportDataSetLV_tb.ExportButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ExportDataDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExportButton extends ClickableActionElement {
      public ExportButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}