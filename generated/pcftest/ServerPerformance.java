package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ServerPerformance.ServerPerformanceScreen;
import pcftest.ServerPerformance.ServerPerformanceScreen.ClearResultsButton;
import pcftest.ServerPerformance.ServerPerformanceScreen.DisableButton;
import pcftest.ServerPerformance.ServerPerformanceScreen.EnableButton;
import pcftest.ServerPerformance.ServerPerformanceScreen.RawDataExportButton;
import pcftest.ServerPerformance.ServerPerformanceScreen.RefreshButton;
import pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV;
import pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV.entry;
import pcftest.ServerPerformance.ServerPerformanceScreen.SummaryExportButton;
import pcftest.ServerPerformance.ServerPerformanceScreen._msgs;
import pcftest.ServerPerformance.ServerPerformance_UpLink;
import pcftest.ServerPerformance._Paging;
import pcftest.ServerPerformance.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServerPerformance extends PCFLocation {
  public final static String CHECKSUM = "06b8174757a683b1243832710aa8947e";
  
  public ServerPerformance(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ServerPerformance"));
  }
  
  public ServerPerformanceScreen getServerPerformanceScreen() {
    return getOrCreateProperty("ServerPerformanceScreen", "ServerPerformanceScreen", null, pcftest.ServerPerformance.ServerPerformanceScreen.class);
  }
  
  public ServerPerformance_UpLink getServerPerformance_UpLink() {
    return getOrCreateProperty("ServerPerformance_UpLink", "ServerPerformance_UpLink", null, pcftest.ServerPerformance.ServerPerformance_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ServerPerformance._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ServerPerformance.__crumb__.class);
  }
  
  public UnsupportedTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.UnsupportedTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServerPerformanceScreen extends PCFElement {
    public ServerPerformanceScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClearResultsButton getClearResultsButton() {
      return getOrCreateProperty("ClearResultsButton", "ClearResultsButton", null, pcftest.ServerPerformance.ServerPerformanceScreen.ClearResultsButton.class);
    }
    
    public DisableButton getDisableButton() {
      return getOrCreateProperty("DisableButton", "DisableButton", null, pcftest.ServerPerformance.ServerPerformanceScreen.DisableButton.class);
    }
    
    public EnableButton getEnableButton() {
      return getOrCreateProperty("EnableButton", "EnableButton", null, pcftest.ServerPerformance.ServerPerformanceScreen.EnableButton.class);
    }
    
    public RawDataExportButton getRawDataExportButton() {
      return getOrCreateProperty("RawDataExportButton", "RawDataExportButton", null, pcftest.ServerPerformance.ServerPerformanceScreen.RawDataExportButton.class);
    }
    
    public RefreshButton getRefreshButton() {
      return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.ServerPerformance.ServerPerformanceScreen.RefreshButton.class);
    }
    
    public ServerPerformanceLV getServerPerformanceLV() {
      return getOrCreateProperty("ServerPerformanceLV", "ServerPerformanceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV.class);
    }
    
    public ServerToolsDisclaimerDV getServerToolsDisclaimerDV() {
      return getOrCreateProperty("ServerToolsDisclaimerDV", "ServerToolsDisclaimerDV", null, pcftest.ServerToolsDisclaimerDV.class);
    }
    
    public SummaryExportButton getSummaryExportButton() {
      return getOrCreateProperty("SummaryExportButton", "SummaryExportButton", null, pcftest.ServerPerformance.ServerPerformanceScreen.SummaryExportButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ServerPerformance.ServerPerformanceScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClearResultsButton extends ClickableActionElement {
      public ClearResultsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DisableButton extends ClickableActionElement {
      public DisableButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableButton extends ClickableActionElement {
      public EnableButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RawDataExportButton extends ClickableActionElement {
      public RawDataExportButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshButton extends ClickableActionElement {
      public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerPerformanceLV extends PCFElement {
      public ServerPerformanceLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV._Select.class);
      }
      
      public pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV._ViewDetail.class);
      }
      
      public ValueElement getclientOverallH() {
        return getOrCreateProperty("clientOverallH", "clientOverallH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getclientRequestH() {
        return getOrCreateProperty("clientRequestH", "clientRequestH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getclientResponseH() {
        return getOrCreateProperty("clientResponseH", "clientResponseH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getclientTotalH() {
        return getOrCreateProperty("clientTotalH", "clientTotalH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getendToEndOverallH() {
        return getOrCreateProperty("endToEndOverallH", "endToEndOverallH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getendToEndTotalH() {
        return getOrCreateProperty("endToEndTotalH", "endToEndTotalH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getpageNameH() {
        return getOrCreateProperty("pageNameH", "pageNameH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getpageOverallH() {
        return getOrCreateProperty("pageOverallH", "pageOverallH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getrequestsH() {
        return getOrCreateProperty("requestsH", "requestsH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getserverOnClientH() {
        return getOrCreateProperty("serverOnClientH", "serverOnClientH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getserverOnServerH() {
        return getOrCreateProperty("serverOnServerH", "serverOnServerH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getserverOverallH() {
        return getOrCreateProperty("serverOverallH", "serverOverallH", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV.entry._Select.class);
        }
        
        public pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ServerPerformance.ServerPerformanceScreen.ServerPerformanceLV.entry._ViewDetail.class);
        }
        
        public ValueElement getclientrequestavg() {
          return getOrCreateProperty("clientrequestavg", "clientrequestavg", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getclientresponseavg() {
          return getOrCreateProperty("clientresponseavg", "clientresponseavg", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getclienttotalavg() {
          return getOrCreateProperty("clienttotalavg", "clienttotalavg", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getendtoendavg() {
          return getOrCreateProperty("endtoendavg", "endtoendavg", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getname() {
          return getOrCreateProperty("name", "name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getserveonserverravg() {
          return getOrCreateProperty("serveonserverravg", "serveonserverravg", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getserverRequests() {
          return getOrCreateProperty("serverRequests", "serverRequests", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getserveronclientavg() {
          return getOrCreateProperty("serveronclientavg", "serveronclientavg", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SummaryExportButton extends ClickableActionElement {
      public SummaryExportButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServerPerformance_UpLink extends ClickableActionElement {
    public ServerPerformance_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ServerPerformance.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}