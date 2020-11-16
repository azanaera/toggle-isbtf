package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadHistoryInfo.LoadHistoryInfoScreen;
import pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb;
import pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.Cancel;
import pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.Edit;
import pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.LoadHistoryInfo_RefreshButton;
import pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.Update;
import pcftest.LoadHistoryInfo.LoadHistoryInfoScreen._msgs;
import pcftest.LoadHistoryInfo.LoadHistoryInfo_UpLink;
import pcftest.LoadHistoryInfo._Paging;
import pcftest.LoadHistoryInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadHistoryInfo extends PCFLocation {
  public final static String CHECKSUM = "0b4478f998b0c18913be6c8542d6f876";
  
  public LoadHistoryInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadHistoryInfo"));
  }
  
  public LoadHistoryInfoScreen getLoadHistoryInfoScreen() {
    return getOrCreateProperty("LoadHistoryInfoScreen", "LoadHistoryInfoScreen", null, pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.class);
  }
  
  public LoadHistoryInfo_UpLink getLoadHistoryInfo_UpLink() {
    return getOrCreateProperty("LoadHistoryInfo_UpLink", "LoadHistoryInfo_UpLink", null, pcftest.LoadHistoryInfo.LoadHistoryInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadHistoryInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadHistoryInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryInfoScreen extends PCFElement {
    public LoadHistoryInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LoadHistoryLV getLoadHistoryLV() {
      return getOrCreateProperty("LoadHistoryLV", "LoadHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryLV.class);
    }
    
    public LoadHistoryLV_tb getLoadHistoryLV_tb() {
      return getOrCreateProperty("LoadHistoryLV_tb", "LoadHistoryLV_tb", null, pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadHistoryInfo.LoadHistoryInfoScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadHistoryLV_tb extends PCFElement {
      public LoadHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.Edit.class);
      }
      
      public LoadHistoryInfo_RefreshButton getLoadHistoryInfo_RefreshButton() {
        return getOrCreateProperty("LoadHistoryInfo_RefreshButton", "LoadHistoryInfo_RefreshButton", null, pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.LoadHistoryInfo_RefreshButton.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.LoadHistoryInfo.LoadHistoryInfoScreen.LoadHistoryLV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadHistoryInfo_RefreshButton extends ClickableActionElement {
        public LoadHistoryInfo_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryInfo_UpLink extends ClickableActionElement {
    public LoadHistoryInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}