package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FreeTextClaimSearch.FreeTextClaimSearch_UpLink;
import pcftest.FreeTextClaimSearch._Paging;
import pcftest.FreeTextClaimSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearch extends PCFLocation {
  public final static String CHECKSUM = "b6e2af8a4f9e67e2d9346009c3a69a46";
  
  public FreeTextClaimSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FreeTextClaimSearch"));
  }
  
  public FreeTextClaimSearchScreen getFreeTextClaimSearchScreen() {
    return getOrCreateProperty("FreeTextClaimSearchScreen", "FreeTextClaimSearchScreen", null, pcftest.FreeTextClaimSearchScreen.class);
  }
  
  public FreeTextClaimSearch_UpLink getFreeTextClaimSearch_UpLink() {
    return getOrCreateProperty("FreeTextClaimSearch_UpLink", "FreeTextClaimSearch_UpLink", null, pcftest.FreeTextClaimSearch.FreeTextClaimSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FreeTextClaimSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FreeTextClaimSearch.__crumb__.class);
  }
  
  public ClaimSearchesGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSearchesGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearch_UpLink extends ClickableActionElement {
    public FreeTextClaimSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}