package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewScriptParameter.NewScriptParameter_UpLink;
import pcftest.NewScriptParameter._Paging;
import pcftest.NewScriptParameter.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/scriptparameters/NewScriptParameter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewScriptParameter extends PCFLocation {
  public final static String CHECKSUM = "4e61a6401308a608fa8e9903d3de9b4f";
  
  public NewScriptParameter(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewScriptParameter"));
  }
  
  public NewScriptParameter_UpLink getNewScriptParameter_UpLink() {
    return getOrCreateProperty("NewScriptParameter_UpLink", "NewScriptParameter_UpLink", null, pcftest.NewScriptParameter.NewScriptParameter_UpLink.class);
  }
  
  public ScriptParameterDetailScreen getScriptParameterDetailScreen() {
    return getOrCreateProperty("ScriptParameterDetailScreen", "ScriptParameterDetailScreen", null, pcftest.ScriptParameterDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewScriptParameter._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewScriptParameter.__crumb__.class);
  }
  
  public ScriptParametersPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.ScriptParametersPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/NewScriptParameter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewScriptParameter_UpLink extends ClickableActionElement {
    public NewScriptParameter_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/NewScriptParameter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/NewScriptParameter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}