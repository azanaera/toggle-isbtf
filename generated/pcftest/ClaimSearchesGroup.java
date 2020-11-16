package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSearchesGroup.ClaimSearchesGroup_UpLink;
import pcftest.ClaimSearchesGroup.MenuLinks;
import pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_CatastropheSearch;
import pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_ClaimSearch;
import pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_FreeTextClaimSearch;
import pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_SimpleClaimSearch;
import pcftest.ClaimSearchesGroup._Paging;
import pcftest.ClaimSearchesGroup.__crumb__;
import pcftest.ClaimSearchesGroup._msgs;
import pcftest.ClaimSearchesGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchesGroup extends PCFLocation {
  public final static String CHECKSUM = "ca6f463415070bac3a0431339ce41ec1";
  
  public ClaimSearchesGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSearchesGroup"));
  }
  
  public CatastropheSearch getCatastropheSearch() {
    return getOrCreateProperty("CatastropheSearch", pcftest.CatastropheSearch.class);
  }
  
  public ClaimSearch getClaimSearch() {
    return getOrCreateProperty("ClaimSearch", pcftest.ClaimSearch.class);
  }
  
  public ClaimSearchesGroup_UpLink getClaimSearchesGroup_UpLink() {
    return getOrCreateProperty("ClaimSearchesGroup_UpLink", "ClaimSearchesGroup_UpLink", null, pcftest.ClaimSearchesGroup.ClaimSearchesGroup_UpLink.class);
  }
  
  public FreeTextClaimSearch getFreeTextClaimSearch() {
    return getOrCreateProperty("FreeTextClaimSearch", pcftest.FreeTextClaimSearch.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimSearchesGroup.MenuLinks.class, "Search-MenuLinks-Search_ClaimSearchesGroup");
  }
  
  public SimpleClaimSearch getSimpleClaimSearch() {
    return getOrCreateProperty("SimpleClaimSearch", pcftest.SimpleClaimSearch.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSearchesGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSearchesGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSearchesGroup._msgs.class);
  }
  
  public Search get_parent() {
    return getOrCreateProperty("_parent", pcftest.Search.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimSearchesGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchesGroup_UpLink extends ClickableActionElement {
    public ClaimSearchesGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSearchesGroup_CatastropheSearch getClaimSearchesGroup_CatastropheSearch() {
      return getOrCreateProperty("ClaimSearchesGroup_CatastropheSearch", "ClaimSearchesGroup_CatastropheSearch", null, pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_CatastropheSearch.class);
    }
    
    public ClaimSearchesGroup_ClaimSearch getClaimSearchesGroup_ClaimSearch() {
      return getOrCreateProperty("ClaimSearchesGroup_ClaimSearch", "ClaimSearchesGroup_ClaimSearch", null, pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_ClaimSearch.class);
    }
    
    public ClaimSearchesGroup_FreeTextClaimSearch getClaimSearchesGroup_FreeTextClaimSearch() {
      return getOrCreateProperty("ClaimSearchesGroup_FreeTextClaimSearch", "ClaimSearchesGroup_FreeTextClaimSearch", null, pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_FreeTextClaimSearch.class);
    }
    
    public ClaimSearchesGroup_SimpleClaimSearch getClaimSearchesGroup_SimpleClaimSearch() {
      return getOrCreateProperty("ClaimSearchesGroup_SimpleClaimSearch", "ClaimSearchesGroup_SimpleClaimSearch", null, pcftest.ClaimSearchesGroup.MenuLinks.ClaimSearchesGroup_SimpleClaimSearch.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchesGroup_CatastropheSearch extends ClickableActionElement {
      public ClaimSearchesGroup_CatastropheSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CatastropheSearch click() {
        return clickThis(pcftest.CatastropheSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchesGroup_ClaimSearch extends ClickableActionElement {
      public ClaimSearchesGroup_ClaimSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSearch click() {
        return clickThis(pcftest.ClaimSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchesGroup_FreeTextClaimSearch extends ClickableActionElement {
      public ClaimSearchesGroup_FreeTextClaimSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FreeTextClaimSearch click() {
        return clickThis(pcftest.FreeTextClaimSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchesGroup_SimpleClaimSearch extends ClickableActionElement {
      public ClaimSearchesGroup_SimpleClaimSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SimpleClaimSearch click() {
        return clickThis(pcftest.SimpleClaimSearch.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}