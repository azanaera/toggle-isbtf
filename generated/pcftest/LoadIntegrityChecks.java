package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.ToolbarDownloadButton0;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen._msgs;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.LoadIntegrityChecksByLoadErrorTypeLV_tb;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.LoadIntegrityChecksByStagingTableLV_tb;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.ViewByStagingTableCardTab;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.ViewbyLoadErrorTypeCardTab;
import pcftest.LoadIntegrityChecks.LoadIntegrityChecks_UpLink;
import pcftest.LoadIntegrityChecks._Paging;
import pcftest.LoadIntegrityChecks.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecks extends PCFLocation {
  public final static String CHECKSUM = "25e46eb40e8e3319c7a482badb02d469";
  
  public LoadIntegrityChecks(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadIntegrityChecks"));
  }
  
  public LoadIntegrityChecksScreen getLoadIntegrityChecksScreen() {
    return getOrCreateProperty("LoadIntegrityChecksScreen", "LoadIntegrityChecksScreen", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.class);
  }
  
  public LoadIntegrityChecks_UpLink getLoadIntegrityChecks_UpLink() {
    return getOrCreateProperty("LoadIntegrityChecks_UpLink", "LoadIntegrityChecks_UpLink", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecks_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadIntegrityChecks._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadIntegrityChecks.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadIntegrityChecksScreen extends PCFElement {
    public LoadIntegrityChecksScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ToolbarDownloadButton0 getToolbarDownloadButton0() {
      return getOrCreateProperty("ToolbarDownloadButton0", "ToolbarDownloadButton0", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.ToolbarDownloadButton0.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen._msgs.class);
    }
    
    public loadIntegrityChecksCV getloadIntegrityChecksCV() {
      return getOrCreateProperty("loadIntegrityChecksCV", "loadIntegrityChecksCV", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ToolbarDownloadButton0 extends ClickableActionElement {
      public ToolbarDownloadButton0(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class loadIntegrityChecksCV extends PCFElement {
      public loadIntegrityChecksCV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LoadIntegrityChecksByLoadErrorTypeLV getLoadIntegrityChecksByLoadErrorTypeLV() {
        return getOrCreateProperty("LoadIntegrityChecksByLoadErrorTypeLV", "LoadIntegrityChecksByLoadErrorTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadIntegrityChecksByLoadErrorTypeLV.class);
      }
      
      public LoadIntegrityChecksByLoadErrorTypeLV_tb getLoadIntegrityChecksByLoadErrorTypeLV_tb() {
        return getOrCreateProperty("LoadIntegrityChecksByLoadErrorTypeLV_tb", "LoadIntegrityChecksByLoadErrorTypeLV_tb", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.LoadIntegrityChecksByLoadErrorTypeLV_tb.class);
      }
      
      public LoadIntegrityChecksByStagingTableLV getLoadIntegrityChecksByStagingTableLV() {
        return getOrCreateProperty("LoadIntegrityChecksByStagingTableLV", "LoadIntegrityChecksByStagingTableLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadIntegrityChecksByStagingTableLV.class);
      }
      
      public LoadIntegrityChecksByStagingTableLV_tb getLoadIntegrityChecksByStagingTableLV_tb() {
        return getOrCreateProperty("LoadIntegrityChecksByStagingTableLV_tb", "LoadIntegrityChecksByStagingTableLV_tb", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.LoadIntegrityChecksByStagingTableLV_tb.class);
      }
      
      public ViewByStagingTableCardTab getViewByStagingTableCardTab() {
        return getOrCreateProperty("ViewByStagingTableCardTab", "ViewByStagingTableCardTab", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.ViewByStagingTableCardTab.class);
      }
      
      public ViewbyLoadErrorTypeCardTab getViewbyLoadErrorTypeCardTab() {
        return getOrCreateProperty("ViewbyLoadErrorTypeCardTab", "ViewbyLoadErrorTypeCardTab", null, pcftest.LoadIntegrityChecks.LoadIntegrityChecksScreen.loadIntegrityChecksCV.ViewbyLoadErrorTypeCardTab.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadIntegrityChecksByLoadErrorTypeLV_tb extends PCFElement {
        public LoadIntegrityChecksByLoadErrorTypeLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getrangeInputerrortype() {
          return getOrCreateProperty("rangeInputerrortype", "rangeInputerrortype", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public SelectElement getrangeInputerrortypeallowref() {
          return getOrCreateProperty("rangeInputerrortypeallowref", "rangeInputerrortypeallowref", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadIntegrityChecksByStagingTableLV_tb extends PCFElement {
        public LoadIntegrityChecksByStagingTableLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getrangeInputstagingtable() {
          return getOrCreateProperty("rangeInputstagingtable", "rangeInputstagingtable", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public SelectElement getrangeInputstagintableallowref() {
          return getOrCreateProperty("rangeInputstagintableallowref", "rangeInputstagintableallowref", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ViewByStagingTableCardTab extends ClickableActionElement {
        public ViewByStagingTableCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ViewbyLoadErrorTypeCardTab extends ClickableActionElement {
        public ViewbyLoadErrorTypeCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadIntegrityChecks_UpLink extends ClickableActionElement {
    public LoadIntegrityChecks_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}