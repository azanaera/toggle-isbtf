package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSearch.ClaimSearch_UpLink;
import pcftest.ClaimSearch._Paging;
import pcftest.ClaimSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearch extends PCFLocation {
  public final static String CHECKSUM = "8a0dd1bedf4c7b5875fcad1f534115c0";
  
  public ClaimSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSearch"));
  }
  
  public ClaimSearchScreen getClaimSearchScreen() {
    return getOrCreateProperty("ClaimSearchScreen", "ClaimSearchScreen", null, pcftest.ClaimSearchScreen.class);
  }
  
  public ClaimSearch_UpLink getClaimSearch_UpLink() {
    return getOrCreateProperty("ClaimSearch_UpLink", "ClaimSearch_UpLink", null, pcftest.ClaimSearch.ClaimSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSearch.__crumb__.class);
  }
  
  public ClaimSearchesGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSearchesGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearch_UpLink extends ClickableActionElement {
    public ClaimSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}