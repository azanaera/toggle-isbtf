package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.InitiateBackoutPopup.InitiateBackoutPopup_UpLink;
import pcftest.InitiateBackoutPopup.StartBackoutScreen;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.Cancel;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV._ListPaging;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.columnHeader;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.countHeader;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.emptyHeader;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry.No;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry.Yes;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry._Select;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry._ViewDetail;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.tableNameHeader;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.typelistHeader;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV_tb;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV_tb.RunAgain;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV_tb.StartBackout;
import pcftest.InitiateBackoutPopup.StartBackoutScreen.VerifyTypekeys;
import pcftest.InitiateBackoutPopup.StartBackoutScreen._msgs;
import pcftest.InitiateBackoutPopup._Paging;
import pcftest.InitiateBackoutPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InitiateBackoutPopup extends PCFLocation {
  public final static String CHECKSUM = "93b1ad2790b70e8f8ddf66d6a92bd48a";
  
  public InitiateBackoutPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InitiateBackoutPopup"));
  }
  
  public InitiateBackoutPopup_UpLink getInitiateBackoutPopup_UpLink() {
    return getOrCreateProperty("InitiateBackoutPopup_UpLink", "InitiateBackoutPopup_UpLink", null, pcftest.InitiateBackoutPopup.InitiateBackoutPopup_UpLink.class);
  }
  
  public StartBackoutScreen getStartBackoutScreen() {
    return getOrCreateProperty("StartBackoutScreen", "StartBackoutScreen", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InitiateBackoutPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InitiateBackoutPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InitiateBackoutPopup_UpLink extends ClickableActionElement {
    public InitiateBackoutPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartBackoutScreen extends PCFElement {
    public StartBackoutScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.Cancel.class);
    }
    
    public ReportDV getReportDV() {
      return getOrCreateProperty("ReportDV", "ReportDV", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.class);
    }
    
    public VerifyTypekeys getVerifyTypekeys() {
      return getOrCreateProperty("VerifyTypekeys", "VerifyTypekeys", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.VerifyTypekeys.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InitiateBackoutPopup.StartBackoutScreen._msgs.class);
    }
    
    public ValueElement getnoBatchRoleInCluster() {
      return getOrCreateProperty("noBatchRoleInCluster", "noBatchRoleInCluster", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement gettoBackout() {
      return getOrCreateProperty("toBackout", "toBackout", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportDV extends DetailViewElement {
      public ReportDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReportLV getReportLV() {
        return getOrCreateProperty("ReportLV", "ReportLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.class);
      }
      
      public ReportLV_tb getReportLV_tb() {
        return getOrCreateProperty("ReportLV_tb", "ReportLV_tb", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV_tb.class);
      }
      
      public ValueElement getVerifyProgress() {
        return getOrCreateProperty("VerifyProgress", "VerifyProgress", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReportLV extends PCFElement {
        public ReportLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntriesWithPaging<entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
        }
        
        public _ListPaging get_ListPaging() {
          return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV._ListPaging.class);
        }
        
        public columnHeader getcolumnHeader() {
          return getOrCreateProperty("columnHeader", "columnHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.columnHeader.class);
        }
        
        public countHeader getcountHeader() {
          return getOrCreateProperty("countHeader", "countHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.countHeader.class);
        }
        
        public emptyHeader getemptyHeader() {
          return getOrCreateProperty("emptyHeader", "emptyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.emptyHeader.class);
        }
        
        public tableNameHeader gettableNameHeader() {
          return getOrCreateProperty("tableNameHeader", "tableNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.tableNameHeader.class);
        }
        
        public typelistHeader gettypelistHeader() {
          return getOrCreateProperty("typelistHeader", "typelistHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.typelistHeader.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ListPaging extends PagingElement {
          public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class columnHeader extends ValueElement {
          public columnHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class countHeader extends ValueElement {
          public countHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class emptyHeader extends ValueElement {
          public emptyHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public No getNo() {
            return getOrCreateProperty("No", "No", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry.No.class);
          }
          
          public Yes getYes() {
            return getOrCreateProperty("Yes", "Yes", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry.Yes.class);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public _Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry._Select.class);
          }
          
          public _ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV.entry._ViewDetail.class);
          }
          
          public ValueElement getcolumn() {
            return getOrCreateProperty("column", "column", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getcount() {
            return getOrCreateProperty("count", "count", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getempty() {
            return getOrCreateProperty("empty", "empty", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement gettableName() {
            return getOrCreateProperty("tableName", "tableName", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement gettypelist() {
            return getOrCreateProperty("typelist", "typelist", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class No extends ClickableActionElement {
            public No(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class Yes extends ClickableActionElement {
            public Yes(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class tableNameHeader extends ValueElement {
          public tableNameHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class typelistHeader extends ValueElement {
          public typelistHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReportLV_tb extends PCFElement {
        public ReportLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getNumFixed() {
          return getOrCreateProperty("NumFixed", "NumFixed", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public RunAgain getRunAgain() {
          return getOrCreateProperty("RunAgain", "RunAgain", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV_tb.RunAgain.class);
        }
        
        public StartBackout getStartBackout() {
          return getOrCreateProperty("StartBackout", "StartBackout", null, pcftest.InitiateBackoutPopup.StartBackoutScreen.ReportDV.ReportLV_tb.StartBackout.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RunAgain extends ClickableActionElement {
          public RunAgain(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class StartBackout extends ClickableActionElement {
          public StartBackout(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VerifyTypekeys extends ClickableActionElement {
      public VerifyTypekeys(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}