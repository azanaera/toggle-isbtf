package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CatastropheDetailPage.CatastropheDetailPage_UpLink;
import pcftest.CatastropheDetailPage._Paging;
import pcftest.CatastropheDetailPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheDetailPage extends PCFLocation {
  public final static String CHECKSUM = "2bbec034b9c1d53f8fe0d13e1d93c0e1";
  
  public CatastropheDetailPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CatastropheDetailPage"));
  }
  
  public CatastropheDetailPage_UpLink getCatastropheDetailPage_UpLink() {
    return getOrCreateProperty("CatastropheDetailPage_UpLink", "CatastropheDetailPage_UpLink", null, pcftest.CatastropheDetailPage.CatastropheDetailPage_UpLink.class);
  }
  
  public CatastropheDetailScreen getCatastropheDetailScreen() {
    return getOrCreateProperty("CatastropheDetailScreen", "CatastropheDetailScreen", null, pcftest.CatastropheDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CatastropheDetailPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CatastropheDetailPage.__crumb__.class);
  }
  
  public Catastrophes get_parent() {
    return getOrCreateProperty("_parent", pcftest.Catastrophes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheDetailPage_UpLink extends ClickableActionElement {
    public CatastropheDetailPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}