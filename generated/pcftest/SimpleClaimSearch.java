package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SimpleClaimSearch.SimpleClaimSearch_UpLink;
import pcftest.SimpleClaimSearch._Paging;
import pcftest.SimpleClaimSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SimpleClaimSearch extends PCFLocation {
  public final static String CHECKSUM = "c73912ec8a1d4967e5eaf6b582276d6f";
  
  public SimpleClaimSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SimpleClaimSearch"));
  }
  
  public SimpleClaimSearchScreen getSimpleClaimSearchScreen() {
    return getOrCreateProperty("SimpleClaimSearchScreen", "SimpleClaimSearchScreen", null, pcftest.SimpleClaimSearchScreen.class);
  }
  
  public SimpleClaimSearch_UpLink getSimpleClaimSearch_UpLink() {
    return getOrCreateProperty("SimpleClaimSearch_UpLink", "SimpleClaimSearch_UpLink", null, pcftest.SimpleClaimSearch.SimpleClaimSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SimpleClaimSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SimpleClaimSearch.__crumb__.class);
  }
  
  public ClaimSearchesGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSearchesGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearch_UpLink extends ClickableActionElement {
    public SimpleClaimSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}