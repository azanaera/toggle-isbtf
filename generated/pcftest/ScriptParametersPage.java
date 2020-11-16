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
import pcftest.ScriptParametersPage.ScriptParametersPage_UpLink;
import pcftest.ScriptParametersPage.ScriptParametersScreen;
import pcftest.ScriptParametersPage.ScriptParametersScreen._msgs;
import pcftest.ScriptParametersPage._Paging;
import pcftest.ScriptParametersPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ScriptParametersPage extends PCFLocation {
  public final static String CHECKSUM = "be8c8c730ab685ef040466db6cd86d96";
  
  public ScriptParametersPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ScriptParametersPage"));
  }
  
  public ScriptParametersPage_UpLink getScriptParametersPage_UpLink() {
    return getOrCreateProperty("ScriptParametersPage_UpLink", "ScriptParametersPage_UpLink", null, pcftest.ScriptParametersPage.ScriptParametersPage_UpLink.class);
  }
  
  public ScriptParametersScreen getScriptParametersScreen() {
    return getOrCreateProperty("ScriptParametersScreen", "ScriptParametersScreen", null, pcftest.ScriptParametersPage.ScriptParametersScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ScriptParametersPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ScriptParametersPage.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScriptParametersPage_UpLink extends ClickableActionElement {
    public ScriptParametersPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScriptParametersScreen extends PCFElement {
    public ScriptParametersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ScriptParametersLV getScriptParametersLV() {
      return getOrCreateProperty("ScriptParametersLV", "ScriptParametersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ScriptParametersLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ScriptParametersPage.ScriptParametersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}