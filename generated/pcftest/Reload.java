package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Reload.ReloadScreen;
import pcftest.Reload.ReloadScreen.ReloadDV;
import pcftest.Reload.ReloadScreen.ReloadDV.DisplayNames;
import pcftest.Reload.ReloadScreen.ReloadDV.GSTemplates;
import pcftest.Reload.ReloadScreen.ReloadDV.PCF;
import pcftest.Reload.ReloadScreen.ReloadDV.WorkflowEngine;
import pcftest.Reload.ReloadScreen.ReloadText;
import pcftest.Reload.ReloadScreen._msgs;
import pcftest.Reload.Reload_UpLink;
import pcftest.Reload._Paging;
import pcftest.Reload.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Reload extends PCFLocation {
  public final static String CHECKSUM = "3ccf8200d3257043d74c83b722a4e920";
  
  public Reload(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Reload"));
  }
  
  public ReloadScreen getReloadScreen() {
    return getOrCreateProperty("ReloadScreen", "ReloadScreen", null, pcftest.Reload.ReloadScreen.class);
  }
  
  public Reload_UpLink getReload_UpLink() {
    return getOrCreateProperty("Reload_UpLink", "Reload_UpLink", null, pcftest.Reload.Reload_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Reload._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Reload.__crumb__.class);
  }
  
  public UnsupportedTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.UnsupportedTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReloadScreen extends PCFElement {
    public ReloadScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ReloadDV getReloadDV() {
      return getOrCreateProperty("ReloadDV", "ReloadDV", null, pcftest.Reload.ReloadScreen.ReloadDV.class);
    }
    
    public ReloadText getReloadText() {
      return getOrCreateProperty("ReloadText", "ReloadText", null, pcftest.Reload.ReloadScreen.ReloadText.class);
    }
    
    public ServerToolsDisclaimerDV getServerToolsDisclaimerDV() {
      return getOrCreateProperty("ServerToolsDisclaimerDV", "ServerToolsDisclaimerDV", null, pcftest.ServerToolsDisclaimerDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Reload.ReloadScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReloadDV extends DetailViewElement {
      public ReloadDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DisplayNames getDisplayNames() {
        return getOrCreateProperty("DisplayNames", "DisplayNames", null, pcftest.Reload.ReloadScreen.ReloadDV.DisplayNames.class);
      }
      
      public GSTemplates getGSTemplates() {
        return getOrCreateProperty("GSTemplates", "GSTemplates", null, pcftest.Reload.ReloadScreen.ReloadDV.GSTemplates.class);
      }
      
      public PCF getPCF() {
        return getOrCreateProperty("PCF", "PCF", null, pcftest.Reload.ReloadScreen.ReloadDV.PCF.class);
      }
      
      public WorkflowEngine getWorkflowEngine() {
        return getOrCreateProperty("WorkflowEngine", "WorkflowEngine", null, pcftest.Reload.ReloadScreen.ReloadDV.WorkflowEngine.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DisplayNames extends ValueElement {
        public DisplayNames(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GSTemplates extends ValueElement {
        public GSTemplates(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PCF extends ValueElement {
        public PCF(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WorkflowEngine extends ValueElement {
        public WorkflowEngine(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReloadText extends ValueElement {
      public ReloadText(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reload_UpLink extends ClickableActionElement {
    public Reload_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/Reload.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}