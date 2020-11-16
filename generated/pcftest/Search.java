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
import pcftest.Search.MenuLinks;
import pcftest.Search.MenuLinks.Search_ActivitySearch;
import pcftest.Search.MenuLinks.Search_BulkInvoiceSearch;
import pcftest.Search.MenuLinks.Search_ClaimSearchesGroup;
import pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_CatastropheSearch;
import pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_ClaimSearch;
import pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_FreeTextClaimSearch;
import pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_SimpleClaimSearch;
import pcftest.Search.MenuLinks.Search_PaymentSearch;
import pcftest.Search.MenuLinks.Search_RecoverySearch;
import pcftest.Search.Search_UpLink;
import pcftest.Search._Paging;
import pcftest.Search.__crumb__;
import pcftest.Search._msgs;
import pcftest.Search.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Search extends PCFLocation {
  public final static String CHECKSUM = "11111cf5bd3cd9da7ad3ef02e760c30d";
  
  public Search(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Search"));
  }
  
  public ActivitySearch getActivitySearch() {
    return getOrCreateProperty("ActivitySearch", pcftest.ActivitySearch.class);
  }
  
  public BulkInvoiceSearch getBulkInvoiceSearch() {
    return getOrCreateProperty("BulkInvoiceSearch", pcftest.BulkInvoiceSearch.class);
  }
  
  public ClaimSearchesGroup getClaimSearchesGroup() {
    return getOrCreateProperty("ClaimSearchesGroup", pcftest.ClaimSearchesGroup.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Search.MenuLinks.class, null);
  }
  
  public PaymentSearch getPaymentSearch() {
    return getOrCreateProperty("PaymentSearch", pcftest.PaymentSearch.class);
  }
  
  public RecoverySearch getRecoverySearch() {
    return getOrCreateProperty("RecoverySearch", pcftest.RecoverySearch.class);
  }
  
  public SearchMenuActions getSearchMenuActions() {
    return getOrCreateProperty("SearchMenuActions", "SearchMenuActions", null, pcftest.SearchMenuActions.class);
  }
  
  public Search_UpLink getSearch_UpLink() {
    return getOrCreateProperty("Search_UpLink", "Search_UpLink", null, pcftest.Search.Search_UpLink.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Search._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Search.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Search._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Search.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Search_ActivitySearch getSearch_ActivitySearch() {
      return getOrCreateProperty("Search_ActivitySearch", "Search_ActivitySearch", null, pcftest.Search.MenuLinks.Search_ActivitySearch.class);
    }
    
    public Search_BulkInvoiceSearch getSearch_BulkInvoiceSearch() {
      return getOrCreateProperty("Search_BulkInvoiceSearch", "Search_BulkInvoiceSearch", null, pcftest.Search.MenuLinks.Search_BulkInvoiceSearch.class);
    }
    
    public Search_ClaimSearchesGroup getSearch_ClaimSearchesGroup() {
      return getOrCreateProperty("Search_ClaimSearchesGroup", "Search_ClaimSearchesGroup", null, pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.class);
    }
    
    public Search_PaymentSearch getSearch_PaymentSearch() {
      return getOrCreateProperty("Search_PaymentSearch", "Search_PaymentSearch", null, pcftest.Search.MenuLinks.Search_PaymentSearch.class);
    }
    
    public Search_RecoverySearch getSearch_RecoverySearch() {
      return getOrCreateProperty("Search_RecoverySearch", "Search_RecoverySearch", null, pcftest.Search.MenuLinks.Search_RecoverySearch.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_ActivitySearch extends ClickableActionElement {
      public Search_ActivitySearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActivitySearch click() {
        return clickThis(pcftest.ActivitySearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_BulkInvoiceSearch extends ClickableActionElement {
      public Search_BulkInvoiceSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BulkInvoiceSearch click() {
        return clickThis(pcftest.BulkInvoiceSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_ClaimSearchesGroup extends ClickableActionElement {
      public Search_ClaimSearchesGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimSearchesGroup_CatastropheSearch getClaimSearchesGroup_CatastropheSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_CatastropheSearch", "ClaimSearchesGroup_CatastropheSearch", null, pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_CatastropheSearch.class);
      }
      
      public ClaimSearchesGroup_ClaimSearch getClaimSearchesGroup_ClaimSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_ClaimSearch", "ClaimSearchesGroup_ClaimSearch", null, pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_ClaimSearch.class);
      }
      
      public ClaimSearchesGroup_FreeTextClaimSearch getClaimSearchesGroup_FreeTextClaimSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_FreeTextClaimSearch", "ClaimSearchesGroup_FreeTextClaimSearch", null, pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_FreeTextClaimSearch.class);
      }
      
      public ClaimSearchesGroup_SimpleClaimSearch getClaimSearchesGroup_SimpleClaimSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_SimpleClaimSearch", "ClaimSearchesGroup_SimpleClaimSearch", null, pcftest.Search.MenuLinks.Search_ClaimSearchesGroup.ClaimSearchesGroup_SimpleClaimSearch.class);
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
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_PaymentSearch extends ClickableActionElement {
      public Search_PaymentSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PaymentSearch click() {
        return clickThis(pcftest.PaymentSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_RecoverySearch extends ClickableActionElement {
      public Search_RecoverySearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RecoverySearch click() {
        return clickThis(pcftest.RecoverySearch.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Search_UpLink extends ClickableActionElement {
    public Search_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}