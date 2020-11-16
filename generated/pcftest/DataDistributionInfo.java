package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistSubmitDV;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.LVDelete;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.LVGetCombinedZip;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.LVGetSummaryZip;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.RefreshButton;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.SubmitBatch;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen._msgs;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV_tb;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV;
import pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV_tb;
import pcftest.DataDistributionInfo.DataDistributionInfo_UpLink;
import pcftest.DataDistributionInfo._Paging;
import pcftest.DataDistributionInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DataDistributionInfo extends PCFLocation {
  public final static String CHECKSUM = "70f8730c797caec0f6f932186a56bba4";
  
  public DataDistributionInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DataDistributionInfo"));
  }
  
  public DataDistributionInfoScreen getDataDistributionInfoScreen() {
    return getOrCreateProperty("DataDistributionInfoScreen", "DataDistributionInfoScreen", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.class);
  }
  
  public DataDistributionInfo_UpLink getDataDistributionInfo_UpLink() {
    return getOrCreateProperty("DataDistributionInfo_UpLink", "DataDistributionInfo_UpLink", null, pcftest.DataDistributionInfo.DataDistributionInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DataDistributionInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DataDistributionInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataDistributionInfoScreen extends PCFElement {
    public DataDistributionInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckboxValueElement getABDDists() {
      return getOrCreateProperty("ABDDists", "ABDDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getAFKDists() {
      return getOrCreateProperty("AFKDists", "AFKDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getArrDists() {
      return getOrCreateProperty("ArrDists", "ArrDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getBeanVerDists() {
      return getOrCreateProperty("BeanVerDists", "BeanVerDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getBlobColDists() {
      return getOrCreateProperty("BlobColDists", "BlobColDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getBooleanDists() {
      return getOrCreateProperty("BooleanDists", "BooleanDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getClobColDists() {
      return getOrCreateProperty("ClobColDists", "ClobColDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public DataDistSubmitDV getDataDistSubmitDV() {
      return getOrCreateProperty("DataDistSubmitDV", "DataDistSubmitDV", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistSubmitDV.class);
    }
    
    public DataDistsLV getDataDistsLV() {
      return getOrCreateProperty("DataDistsLV", "DataDistsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DataDistsLV.class);
    }
    
    public DataDistsLV_tb getDataDistsLV_tb() {
      return getOrCreateProperty("DataDistsLV_tb", "DataDistsLV_tb", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.class);
    }
    
    public CheckboxValueElement getDateAnalysisDists() {
      return getOrCreateProperty("DateAnalysisDists", "DateAnalysisDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getFKDists() {
      return getOrCreateProperty("FKDists", "FKDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getGenericGroupDists() {
      return getOrCreateProperty("GenericGroupDists", "GenericGroupDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getMinAndMaxDateDists() {
      return getOrCreateProperty("MinAndMaxDateDists", "MinAndMaxDateDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getNullableColumnDists() {
      return getOrCreateProperty("NullableColumnDists", "NullableColumnDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getSTDists() {
      return getOrCreateProperty("STDists", "STDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public SubmitBatch getSubmitBatch() {
      return getOrCreateProperty("SubmitBatch", "SubmitBatch", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.SubmitBatch.class);
    }
    
    public CheckboxValueElement getTKDists() {
      return getOrCreateProperty("TKDists", "TKDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen._msgs.class);
    }
    
    public ValueElement getbatchProgress() {
      return getOrCreateProperty("batchProgress", "batchProgress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getdescription() {
      return getOrCreateProperty("description", "description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public tableAllLV gettableAllLV() {
      return getOrCreateProperty("tableAllLV", "tableAllLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.class);
    }
    
    public tableAllLV_tb gettableAllLV_tb() {
      return getOrCreateProperty("tableAllLV_tb", "tableAllLV_tb", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV_tb.class);
    }
    
    public tableSelectionLV gettableSelectionLV() {
      return getOrCreateProperty("tableSelectionLV", "tableSelectionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.class);
    }
    
    public tableSelectionLV_tb gettableSelectionLV_tb() {
      return getOrCreateProperty("tableSelectionLV_tb", "tableSelectionLV_tb", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DataDistSubmitDV extends DetailViewElement {
      public DataDistSubmitDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CheckboxValueElement getASDists() {
        return getOrCreateProperty("ASDists", "ASDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      public CheckboxValueElement getAdHocDists() {
        return getOrCreateProperty("AdHocDists", "AdHocDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      public BooleanValueElement getAnalyzeAllTables() {
        return getOrCreateProperty("AnalyzeAllTables", "AnalyzeAllTables", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public ValueElement getNumThreads() {
        return getOrCreateProperty("NumThreads", "NumThreads", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CheckboxValueElement getTLDists() {
        return getOrCreateProperty("TLDists", "TLDists", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DataDistsLV_tb extends PCFElement {
      public DataDistsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LVDelete getLVDelete() {
        return getOrCreateProperty("LVDelete", "LVDelete", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.LVDelete.class);
      }
      
      public LVGetCombinedZip getLVGetCombinedZip() {
        return getOrCreateProperty("LVGetCombinedZip", "LVGetCombinedZip", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.LVGetCombinedZip.class);
      }
      
      public LVGetSummaryZip getLVGetSummaryZip() {
        return getOrCreateProperty("LVGetSummaryZip", "LVGetSummaryZip", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.LVGetSummaryZip.class);
      }
      
      public RefreshButton getRefreshButton() {
        return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.DataDistsLV_tb.RefreshButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LVDelete extends ClickableActionElement {
        public LVDelete(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LVGetCombinedZip extends ClickableActionElement {
        public LVGetCombinedZip(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LVGetSummaryZip extends ClickableActionElement {
        public LVGetSummaryZip(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RefreshButton extends ClickableActionElement {
        public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmitBatch extends ValueElement {
      public SubmitBatch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableAllLV extends PCFElement {
      public tableAllLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV._ListPaging.class);
      }
      
      public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.entry._Select.class);
        }
        
        public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV.entry._ViewDetail.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class rowHeader extends ValueElement {
        public rowHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableAllLV_tb extends PCFElement {
      public tableAllLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getsearchStringTextBox() {
        return getOrCreateProperty("searchStringTextBox", "searchStringTextBox", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV_tb.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableAllLV_tb.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableSelectionLV extends PCFElement {
      public tableSelectionLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV._ListPaging.class);
      }
      
      public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.entry._Select.class);
        }
        
        public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV.entry._ViewDetail.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class rowHeader extends ValueElement {
        public rowHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableSelectionLV_tb extends PCFElement {
      public tableSelectionLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV_tb.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.DataDistributionInfo.DataDistributionInfoScreen.tableSelectionLV_tb.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataDistributionInfo_UpLink extends ClickableActionElement {
    public DataDistributionInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistributionInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}