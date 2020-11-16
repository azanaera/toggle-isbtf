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
import pcftest.ClaimFinancialsGroup.ClaimFinancialsGroup_UpLink;
import pcftest.ClaimFinancialsGroup.MenuLinks;
import pcftest.ClaimFinancialsGroup.MenuLinks.ClaimFinancialsGroup_ClaimFinancialsChecks;
import pcftest.ClaimFinancialsGroup.MenuLinks.ClaimFinancialsGroup_ClaimFinancialsSummary;
import pcftest.ClaimFinancialsGroup.MenuLinks.ClaimFinancialsGroup_ClaimFinancialsTransactions;
import pcftest.ClaimFinancialsGroup._Paging;
import pcftest.ClaimFinancialsGroup.__crumb__;
import pcftest.ClaimFinancialsGroup._msgs;
import pcftest.ClaimFinancialsGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsGroup extends PCFLocation {
  public final static String CHECKSUM = "23ca292dc7749e7c7f0131ad5f36ddd6";
  
  public ClaimFinancialsGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsGroup"));
  }
  
  public ClaimFinancialsChecks getClaimFinancialsChecks() {
    return getOrCreateProperty("ClaimFinancialsChecks", pcftest.ClaimFinancialsChecks.class);
  }
  
  public ClaimFinancialsGroup_UpLink getClaimFinancialsGroup_UpLink() {
    return getOrCreateProperty("ClaimFinancialsGroup_UpLink", "ClaimFinancialsGroup_UpLink", null, pcftest.ClaimFinancialsGroup.ClaimFinancialsGroup_UpLink.class);
  }
  
  public ClaimFinancialsSummary getClaimFinancialsSummary() {
    return getOrCreateProperty("ClaimFinancialsSummary", pcftest.ClaimFinancialsSummary.class);
  }
  
  public ClaimFinancialsTransactions getClaimFinancialsTransactions() {
    return getOrCreateProperty("ClaimFinancialsTransactions", pcftest.ClaimFinancialsTransactions.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimFinancialsGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimFinancialsGroup");
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimFinancialsGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsGroup_UpLink extends ClickableActionElement {
    public ClaimFinancialsGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimFinancialsGroup_ClaimFinancialsChecks getClaimFinancialsGroup_ClaimFinancialsChecks() {
      return getOrCreateProperty("ClaimFinancialsGroup_ClaimFinancialsChecks", "ClaimFinancialsGroup_ClaimFinancialsChecks", null, pcftest.ClaimFinancialsGroup.MenuLinks.ClaimFinancialsGroup_ClaimFinancialsChecks.class);
    }
    
    public ClaimFinancialsGroup_ClaimFinancialsSummary getClaimFinancialsGroup_ClaimFinancialsSummary() {
      return getOrCreateProperty("ClaimFinancialsGroup_ClaimFinancialsSummary", "ClaimFinancialsGroup_ClaimFinancialsSummary", null, pcftest.ClaimFinancialsGroup.MenuLinks.ClaimFinancialsGroup_ClaimFinancialsSummary.class);
    }
    
    public ClaimFinancialsGroup_ClaimFinancialsTransactions getClaimFinancialsGroup_ClaimFinancialsTransactions() {
      return getOrCreateProperty("ClaimFinancialsGroup_ClaimFinancialsTransactions", "ClaimFinancialsGroup_ClaimFinancialsTransactions", null, pcftest.ClaimFinancialsGroup.MenuLinks.ClaimFinancialsGroup_ClaimFinancialsTransactions.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsGroup_ClaimFinancialsChecks extends ClickableActionElement {
      public ClaimFinancialsGroup_ClaimFinancialsChecks(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsChecks click() {
        return clickThis(pcftest.ClaimFinancialsChecks.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsGroup_ClaimFinancialsSummary extends ClickableActionElement {
      public ClaimFinancialsGroup_ClaimFinancialsSummary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsSummary click() {
        return clickThis(pcftest.ClaimFinancialsSummary.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsGroup_ClaimFinancialsTransactions extends ClickableActionElement {
      public ClaimFinancialsGroup_ClaimFinancialsTransactions(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsTransactions click() {
        return clickThis(pcftest.ClaimFinancialsTransactions.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}