package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ScriptParameterDetail.ScriptParameterDetail_UpLink;
import pcftest.ScriptParameterDetail._Paging;
import pcftest.ScriptParameterDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParameterDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ScriptParameterDetail extends PCFLocation {
  public final static String CHECKSUM = "76798c159f5655b5043a1e2bcfcfe41a";
  
  public ScriptParameterDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ScriptParameterDetail"));
  }
  
  public ScriptParameterDetailScreen getScriptParameterDetailScreen() {
    return getOrCreateProperty("ScriptParameterDetailScreen", "ScriptParameterDetailScreen", null, pcftest.ScriptParameterDetailScreen.class);
  }
  
  public ScriptParameterDetail_UpLink getScriptParameterDetail_UpLink() {
    return getOrCreateProperty("ScriptParameterDetail_UpLink", "ScriptParameterDetail_UpLink", null, pcftest.ScriptParameterDetail.ScriptParameterDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ScriptParameterDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ScriptParameterDetail.__crumb__.class);
  }
  
  public ScriptParametersPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.ScriptParametersPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParameterDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScriptParameterDetail_UpLink extends ClickableActionElement {
    public ScriptParameterDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParameterDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParameterDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}