package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GoogleSearch.GoogleSearch_UpLink;
import pcftest.GoogleSearch._Paging;
import pcftest.GoogleSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/GoogleSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GoogleSearch extends PCFLocation {
  public final static String CHECKSUM = "760873020cfde0baf08e542592bc829d";
  
  public GoogleSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GoogleSearch"));
  }
  
  public GoogleSearch_UpLink getGoogleSearch_UpLink() {
    return getOrCreateProperty("GoogleSearch_UpLink", "GoogleSearch_UpLink", null, pcftest.GoogleSearch.GoogleSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GoogleSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GoogleSearch.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GoogleSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GoogleSearch_UpLink extends ClickableActionElement {
    public GoogleSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GoogleSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GoogleSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}