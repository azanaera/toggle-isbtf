package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DatabaseParameters.DatabaseParametersLV_tb;
import pcftest.DatabaseParameters.DatabaseParameters_UpLink;
import pcftest.DatabaseParameters.DownloadParms;
import pcftest.DatabaseParameters.RefreshParametersButton;
import pcftest.DatabaseParameters.ScreenMsg;
import pcftest.DatabaseParameters._Paging;
import pcftest.DatabaseParameters.__crumb__;
import pcftest.DatabaseParameters._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseParameters extends PCFLocation {
  public final static String CHECKSUM = "c6b9666539ffc786470e5638cba9be30";
  
  public DatabaseParameters(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DatabaseParameters"));
  }
  
  public DatabaseParametersLV getDatabaseParametersLV() {
    return getOrCreateProperty("DatabaseParametersLV", "DatabaseParametersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DatabaseParametersLV.class);
  }
  
  public DatabaseParametersLV_tb getDatabaseParametersLV_tb() {
    return getOrCreateProperty("DatabaseParametersLV_tb", "DatabaseParametersLV_tb", null, pcftest.DatabaseParameters.DatabaseParametersLV_tb.class);
  }
  
  public DatabaseParameters_UpLink getDatabaseParameters_UpLink() {
    return getOrCreateProperty("DatabaseParameters_UpLink", "DatabaseParameters_UpLink", null, pcftest.DatabaseParameters.DatabaseParameters_UpLink.class);
  }
  
  public DownloadParms getDownloadParms() {
    return getOrCreateProperty("DownloadParms", "DownloadParms", null, pcftest.DatabaseParameters.DownloadParms.class);
  }
  
  public RefreshParametersButton getRefreshParametersButton() {
    return getOrCreateProperty("RefreshParametersButton", "RefreshParametersButton", null, pcftest.DatabaseParameters.RefreshParametersButton.class);
  }
  
  public ScreenMsg getScreenMsg() {
    return getOrCreateProperty("ScreenMsg", "ScreenMsg", null, pcftest.DatabaseParameters.ScreenMsg.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DatabaseParameters._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DatabaseParameters.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DatabaseParameters._msgs.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  public SelectElement getparamSetPicker() {
    return getOrCreateProperty("paramSetPicker", "paramSetPicker", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseParametersLV_tb extends PCFElement {
    public DatabaseParametersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseParameters_UpLink extends ClickableActionElement {
    public DatabaseParameters_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadParms extends ValueElement {
    public DownloadParms(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshParametersButton extends ValueElement {
    public RefreshParametersButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScreenMsg extends ValueElement {
    public ScreenMsg(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParameters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}