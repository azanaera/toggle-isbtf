package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen;
import pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen._msgs;
import pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.download;
import pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.orasptb;
import pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.orasptb.TogglePaging;
import pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.orasptb.ToolbarButton;
import pcftest.OracleAWRUnusedIndexesInfo.OracleAWRUnusedIndexesInfo_UpLink;
import pcftest.OracleAWRUnusedIndexesInfo._Paging;
import pcftest.OracleAWRUnusedIndexesInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleAWRUnusedIndexesInfo extends PCFLocation {
  public final static String CHECKSUM = "ed3406b4fe2587f50582012bb1d4e6f5";
  
  public OracleAWRUnusedIndexesInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OracleAWRUnusedIndexesInfo"));
  }
  
  public OracleAWRInfoScreen getOracleAWRInfoScreen() {
    return getOrCreateProperty("OracleAWRInfoScreen", "OracleAWRInfoScreen", null, pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.class);
  }
  
  public OracleAWRUnusedIndexesInfo_UpLink getOracleAWRUnusedIndexesInfo_UpLink() {
    return getOrCreateProperty("OracleAWRUnusedIndexesInfo_UpLink", "OracleAWRUnusedIndexesInfo_UpLink", null, pcftest.OracleAWRUnusedIndexesInfo.OracleAWRUnusedIndexesInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OracleAWRUnusedIndexesInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OracleAWRUnusedIndexesInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRInfoScreen extends PCFElement {
    public OracleAWRInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckboxValueElement getIncludeInstrumentationTables() {
      return getOrCreateProperty("IncludeInstrumentationTables", "IncludeInstrumentationTables", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getIncludeStagingTables() {
      return getOrCreateProperty("IncludeStagingTables", "IncludeStagingTables", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getIncludeTempTables() {
      return getOrCreateProperty("IncludeTempTables", "IncludeTempTables", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getIncludeTypelistTables() {
      return getOrCreateProperty("IncludeTypelistTables", "IncludeTypelistTables", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public OracleAWRLV_nopaging getOracleAWRLV_nopaging() {
      return getOrCreateProperty("OracleAWRLV_nopaging", "OracleAWRLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleAWRLV_nopaging.class);
    }
    
    public OracleAWRLV_paging getOracleAWRLV_paging() {
      return getOrCreateProperty("OracleAWRLV_paging", "OracleAWRLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleAWRLV_paging.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen._msgs.class);
    }
    
    public download getdownload() {
      return getOrCreateProperty("download", "download", null, pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.download.class);
    }
    
    public orasptb getorasptb() {
      return getOrCreateProperty("orasptb", "orasptb", null, pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.orasptb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class download extends ValueElement {
      public download(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class orasptb extends PCFElement {
      public orasptb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TogglePaging getTogglePaging() {
        return getOrCreateProperty("TogglePaging", "TogglePaging", null, pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.orasptb.TogglePaging.class);
      }
      
      public ToolbarButton getToolbarButton() {
        return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.OracleAWRUnusedIndexesInfo.OracleAWRInfoScreen.orasptb.ToolbarButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TogglePaging extends ClickableActionElement {
        public TogglePaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ToolbarButton extends ClickableActionElement {
        public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRUnusedIndexesInfo_UpLink extends ClickableActionElement {
    public OracleAWRUnusedIndexesInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}