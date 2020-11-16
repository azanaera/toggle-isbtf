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
import pcftest.CentipedeCacheInfoLG.CentipedeCacheInfoLG_UpLink;
import pcftest.CentipedeCacheInfoLG.MenuLinks;
import pcftest.CentipedeCacheInfoLG.MenuLinks.CentipedeCacheInfoLG_CentipedeCacheInfo;
import pcftest.CentipedeCacheInfoLG.MenuLinks.CentipedeCacheInfoLG_CentipedeCacheInfoDetails;
import pcftest.CentipedeCacheInfoLG.MenuLinks.CentipedeCacheInfoLG_CentipedeCacheInfoHistory;
import pcftest.CentipedeCacheInfoLG._Paging;
import pcftest.CentipedeCacheInfoLG.__crumb__;
import pcftest.CentipedeCacheInfoLG._msgs;
import pcftest.CentipedeCacheInfoLG.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CentipedeCacheInfoLG extends PCFLocation {
  public final static String CHECKSUM = "26000afe22a0d90994b287f6f81813ba";
  
  public CentipedeCacheInfoLG(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CentipedeCacheInfoLG"));
  }
  
  public CentipedeCacheInfo getCentipedeCacheInfo() {
    return getOrCreateProperty("CentipedeCacheInfo", pcftest.CentipedeCacheInfo.class);
  }
  
  public CentipedeCacheInfoDetails getCentipedeCacheInfoDetails() {
    return getOrCreateProperty("CentipedeCacheInfoDetails", pcftest.CentipedeCacheInfoDetails.class);
  }
  
  public CentipedeCacheInfoHistory getCentipedeCacheInfoHistory() {
    return getOrCreateProperty("CentipedeCacheInfoHistory", pcftest.CentipedeCacheInfoHistory.class);
  }
  
  public CentipedeCacheInfoLG_UpLink getCentipedeCacheInfoLG_UpLink() {
    return getOrCreateProperty("CentipedeCacheInfoLG_UpLink", "CentipedeCacheInfoLG_UpLink", null, pcftest.CentipedeCacheInfoLG.CentipedeCacheInfoLG_UpLink.class);
  }
  
  public InternalToolsTabBar getInternalToolsTabBar() {
    return getOrCreateProperty("InternalToolsTabBar", pcftest.InternalToolsTabBar.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.CentipedeCacheInfoLG.MenuLinks.class, "ServerTools-MenuLinks-ServerTools_CentipedeCacheInfoLG");
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CentipedeCacheInfoLG._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CentipedeCacheInfoLG.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CentipedeCacheInfoLG._msgs.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.CentipedeCacheInfoLG.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfoLG_UpLink extends ClickableActionElement {
    public CentipedeCacheInfoLG_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CentipedeCacheInfoLG_CentipedeCacheInfo getCentipedeCacheInfoLG_CentipedeCacheInfo() {
      return getOrCreateProperty("CentipedeCacheInfoLG_CentipedeCacheInfo", "CentipedeCacheInfoLG_CentipedeCacheInfo", null, pcftest.CentipedeCacheInfoLG.MenuLinks.CentipedeCacheInfoLG_CentipedeCacheInfo.class);
    }
    
    public CentipedeCacheInfoLG_CentipedeCacheInfoDetails getCentipedeCacheInfoLG_CentipedeCacheInfoDetails() {
      return getOrCreateProperty("CentipedeCacheInfoLG_CentipedeCacheInfoDetails", "CentipedeCacheInfoLG_CentipedeCacheInfoDetails", null, pcftest.CentipedeCacheInfoLG.MenuLinks.CentipedeCacheInfoLG_CentipedeCacheInfoDetails.class);
    }
    
    public CentipedeCacheInfoLG_CentipedeCacheInfoHistory getCentipedeCacheInfoLG_CentipedeCacheInfoHistory() {
      return getOrCreateProperty("CentipedeCacheInfoLG_CentipedeCacheInfoHistory", "CentipedeCacheInfoLG_CentipedeCacheInfoHistory", null, pcftest.CentipedeCacheInfoLG.MenuLinks.CentipedeCacheInfoLG_CentipedeCacheInfoHistory.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CentipedeCacheInfoLG_CentipedeCacheInfo extends ClickableActionElement {
      public CentipedeCacheInfoLG_CentipedeCacheInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CentipedeCacheInfo click() {
        return clickThis(pcftest.CentipedeCacheInfo.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CentipedeCacheInfoLG_CentipedeCacheInfoDetails extends ClickableActionElement {
      public CentipedeCacheInfoLG_CentipedeCacheInfoDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CentipedeCacheInfoDetails click() {
        return clickThis(pcftest.CentipedeCacheInfoDetails.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CentipedeCacheInfoLG_CentipedeCacheInfoHistory extends ClickableActionElement {
      public CentipedeCacheInfoLG_CentipedeCacheInfoHistory(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CentipedeCacheInfoHistory click() {
        return clickThis(pcftest.CentipedeCacheInfoHistory.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}