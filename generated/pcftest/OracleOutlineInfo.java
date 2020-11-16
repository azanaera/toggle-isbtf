package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OracleOutlineInfo.OracleOutlineInfoScreen;
import pcftest.OracleOutlineInfo.OracleOutlineInfoScreen.Download;
import pcftest.OracleOutlineInfo.OracleOutlineInfoScreen._msgs;
import pcftest.OracleOutlineInfo.OracleOutlineInfoScreen.oraotb;
import pcftest.OracleOutlineInfo.OracleOutlineInfo_UpLink;
import pcftest.OracleOutlineInfo._Paging;
import pcftest.OracleOutlineInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleOutlineInfo extends PCFLocation {
  public final static String CHECKSUM = "9413b71da1c9f50738de9a1b52c06173";
  
  public OracleOutlineInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OracleOutlineInfo"));
  }
  
  public OracleOutlineInfoScreen getOracleOutlineInfoScreen() {
    return getOrCreateProperty("OracleOutlineInfoScreen", "OracleOutlineInfoScreen", null, pcftest.OracleOutlineInfo.OracleOutlineInfoScreen.class);
  }
  
  public OracleOutlineInfo_UpLink getOracleOutlineInfo_UpLink() {
    return getOrCreateProperty("OracleOutlineInfo_UpLink", "OracleOutlineInfo_UpLink", null, pcftest.OracleOutlineInfo.OracleOutlineInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OracleOutlineInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OracleOutlineInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleOutlineInfoScreen extends PCFElement {
    public OracleOutlineInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Download getDownload() {
      return getOrCreateProperty("Download", "Download", null, pcftest.OracleOutlineInfo.OracleOutlineInfoScreen.Download.class);
    }
    
    public OracleOutlineLV getOracleOutlineLV() {
      return getOrCreateProperty("OracleOutlineLV", "OracleOutlineLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleOutlineLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OracleOutlineInfo.OracleOutlineInfoScreen._msgs.class);
    }
    
    public oraotb getoraotb() {
      return getOrCreateProperty("oraotb", "oraotb", null, pcftest.OracleOutlineInfo.OracleOutlineInfoScreen.oraotb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Download extends ValueElement {
      public Download(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class oraotb extends PCFElement {
      public oraotb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleOutlineInfo_UpLink extends ClickableActionElement {
    public OracleOutlineInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}