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
import pcftest.ClaimSummaryGroup.ClaimSummaryGroup_UpLink;
import pcftest.ClaimSummaryGroup.MenuLinks;
import pcftest.ClaimSummaryGroup.MenuLinks.ClaimSummaryGroup_ClaimStatus;
import pcftest.ClaimSummaryGroup.MenuLinks.ClaimSummaryGroup_ClaimSummary;
import pcftest.ClaimSummaryGroup._Paging;
import pcftest.ClaimSummaryGroup.__crumb__;
import pcftest.ClaimSummaryGroup._msgs;
import pcftest.ClaimSummaryGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryGroup extends PCFLocation {
  public final static String CHECKSUM = "f79169187723369ea9467395e528a576";
  
  public ClaimSummaryGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryGroup"));
  }
  
  public ClaimStatus getClaimStatus() {
    return getOrCreateProperty("ClaimStatus", pcftest.ClaimStatus.class);
  }
  
  public ClaimSummary getClaimSummary() {
    return getOrCreateProperty("ClaimSummary", pcftest.ClaimSummary.class);
  }
  
  public ClaimSummaryGroup_UpLink getClaimSummaryGroup_UpLink() {
    return getOrCreateProperty("ClaimSummaryGroup_UpLink", "ClaimSummaryGroup_UpLink", null, pcftest.ClaimSummaryGroup.ClaimSummaryGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimSummaryGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimSummaryGroup");
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimSummaryGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryGroup_UpLink extends ClickableActionElement {
    public ClaimSummaryGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSummaryGroup_ClaimStatus getClaimSummaryGroup_ClaimStatus() {
      return getOrCreateProperty("ClaimSummaryGroup_ClaimStatus", "ClaimSummaryGroup_ClaimStatus", null, pcftest.ClaimSummaryGroup.MenuLinks.ClaimSummaryGroup_ClaimStatus.class);
    }
    
    public ClaimSummaryGroup_ClaimSummary getClaimSummaryGroup_ClaimSummary() {
      return getOrCreateProperty("ClaimSummaryGroup_ClaimSummary", "ClaimSummaryGroup_ClaimSummary", null, pcftest.ClaimSummaryGroup.MenuLinks.ClaimSummaryGroup_ClaimSummary.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryGroup_ClaimStatus extends ClickableActionElement {
      public ClaimSummaryGroup_ClaimStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimStatus click() {
        return clickThis(pcftest.ClaimStatus.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryGroup_ClaimSummary extends ClickableActionElement {
      public ClaimSummaryGroup_ClaimSummary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSummary click() {
        return clickThis(pcftest.ClaimSummary.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}