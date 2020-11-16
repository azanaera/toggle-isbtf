package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CatastropheSearch.CatastropheSearch_UpLink;
import pcftest.CatastropheSearch._Paging;
import pcftest.CatastropheSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/CatastropheSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheSearch extends PCFLocation {
  public final static String CHECKSUM = "e025c7bbe583171cc53f8a592536893d";
  
  public CatastropheSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CatastropheSearch"));
  }
  
  public CatastropheSearchScreen getCatastropheSearchScreen() {
    return getOrCreateProperty("CatastropheSearchScreen", "CatastropheSearchScreen", null, pcftest.CatastropheSearchScreen.class);
  }
  
  public CatastropheSearch_UpLink getCatastropheSearch_UpLink() {
    return getOrCreateProperty("CatastropheSearch_UpLink", "CatastropheSearch_UpLink", null, pcftest.CatastropheSearch.CatastropheSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CatastropheSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CatastropheSearch.__crumb__.class);
  }
  
  public ClaimSearchesGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSearchesGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheSearch_UpLink extends ClickableActionElement {
    public CatastropheSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}