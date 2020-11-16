package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DefaultFailurePage.DefaultFailurePage_UpLink;
import pcftest.DefaultFailurePage._Paging;
import pcftest.DefaultFailurePage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/DefaultFailurePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DefaultFailurePage extends PCFLocation {
  public final static String CHECKSUM = "5ca6e8e056c578d5c78c4fce596d8e1d";
  
  public DefaultFailurePage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DefaultFailurePage"));
  }
  
  public BlankScreen getBlankScreen() {
    return getOrCreateProperty("BlankScreen", "BlankScreen", null, pcftest.BlankScreen.class);
  }
  
  public DefaultFailurePage_UpLink getDefaultFailurePage_UpLink() {
    return getOrCreateProperty("DefaultFailurePage_UpLink", "DefaultFailurePage_UpLink", null, pcftest.DefaultFailurePage.DefaultFailurePage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DefaultFailurePage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DefaultFailurePage.__crumb__.class);
  }
  
  public ErrorGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ErrorGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/DefaultFailurePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DefaultFailurePage_UpLink extends ClickableActionElement {
    public DefaultFailurePage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/DefaultFailurePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/DefaultFailurePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}