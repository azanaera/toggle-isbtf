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
import pcftest.OracleStatspackInfo.OracleStatspackInfoScreen;
import pcftest.OracleStatspackInfo.OracleStatspackInfoScreen._msgs;
import pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb;
import pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb.TogglePaging;
import pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb.download;
import pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb.refresh;
import pcftest.OracleStatspackInfo.OracleStatspackInfo_UpLink;
import pcftest.OracleStatspackInfo._Paging;
import pcftest.OracleStatspackInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleStatspackInfo extends PCFLocation {
  public final static String CHECKSUM = "c9313ebeb0ef662df75d0f185be4edb0";
  
  public OracleStatspackInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OracleStatspackInfo"));
  }
  
  public OracleStatspackInfoScreen getOracleStatspackInfoScreen() {
    return getOrCreateProperty("OracleStatspackInfoScreen", "OracleStatspackInfoScreen", null, pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.class);
  }
  
  public OracleStatspackInfo_UpLink getOracleStatspackInfo_UpLink() {
    return getOrCreateProperty("OracleStatspackInfo_UpLink", "OracleStatspackInfo_UpLink", null, pcftest.OracleStatspackInfo.OracleStatspackInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OracleStatspackInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OracleStatspackInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleStatspackInfoScreen extends PCFElement {
    public OracleStatspackInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OracleStatspackLV_nopaging getOracleStatspackLV_nopaging() {
      return getOrCreateProperty("OracleStatspackLV_nopaging", "OracleStatspackLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleStatspackLV_nopaging.class);
    }
    
    public OracleStatspackLV_paging getOracleStatspackLV_paging() {
      return getOrCreateProperty("OracleStatspackLV_paging", "OracleStatspackLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleStatspackLV_paging.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OracleStatspackInfo.OracleStatspackInfoScreen._msgs.class);
    }
    
    public orasptb getorasptb() {
      return getOrCreateProperty("orasptb", "orasptb", null, pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class orasptb extends PCFElement {
      public orasptb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TogglePaging getTogglePaging() {
        return getOrCreateProperty("TogglePaging", "TogglePaging", null, pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb.TogglePaging.class);
      }
      
      public download getdownload() {
        return getOrCreateProperty("download", "download", null, pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb.download.class);
      }
      
      public refresh getrefresh() {
        return getOrCreateProperty("refresh", "refresh", null, pcftest.OracleStatspackInfo.OracleStatspackInfoScreen.orasptb.refresh.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TogglePaging extends ClickableActionElement {
        public TogglePaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class download extends ClickableActionElement {
        public download(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class refresh extends ClickableActionElement {
        public refresh(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleStatspackInfo_UpLink extends ClickableActionElement {
    public OracleStatspackInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}