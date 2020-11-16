package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewCatastrophe.NewCatastrophe_UpLink;
import pcftest.NewCatastrophe._Paging;
import pcftest.NewCatastrophe.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/NewCatastrophe.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCatastrophe extends PCFLocation {
  public final static String CHECKSUM = "3344e5e16351a63527c8b9d522dfa8c6";
  
  public NewCatastrophe(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewCatastrophe"));
  }
  
  public CatastropheDetailScreen getCatastropheDetailScreen() {
    return getOrCreateProperty("CatastropheDetailScreen", "CatastropheDetailScreen", null, pcftest.CatastropheDetailScreen.class);
  }
  
  public NewCatastrophe_UpLink getNewCatastrophe_UpLink() {
    return getOrCreateProperty("NewCatastrophe_UpLink", "NewCatastrophe_UpLink", null, pcftest.NewCatastrophe.NewCatastrophe_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewCatastrophe._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewCatastrophe.__crumb__.class);
  }
  
  public Catastrophes get_parent() {
    return getOrCreateProperty("_parent", pcftest.Catastrophes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/NewCatastrophe.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCatastrophe_UpLink extends ClickableActionElement {
    public NewCatastrophe_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/NewCatastrophe.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/NewCatastrophe.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}