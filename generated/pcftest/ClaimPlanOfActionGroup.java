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
import pcftest.ClaimPlanOfActionGroup.ClaimPlanOfActionGroup_UpLink;
import pcftest.ClaimPlanOfActionGroup.MenuLinks;
import pcftest.ClaimPlanOfActionGroup.MenuLinks.ClaimPlanOfActionGroup_ClaimEvaluations;
import pcftest.ClaimPlanOfActionGroup.MenuLinks.ClaimPlanOfActionGroup_ClaimNegotiations;
import pcftest.ClaimPlanOfActionGroup._Paging;
import pcftest.ClaimPlanOfActionGroup.__crumb__;
import pcftest.ClaimPlanOfActionGroup._msgs;
import pcftest.ClaimPlanOfActionGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPlanOfActionGroup extends PCFLocation {
  public final static String CHECKSUM = "e0f1f25ddbb84b72fe1327add61133f8";
  
  public ClaimPlanOfActionGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPlanOfActionGroup"));
  }
  
  public ClaimEvaluations getClaimEvaluations() {
    return getOrCreateProperty("ClaimEvaluations", pcftest.ClaimEvaluations.class);
  }
  
  public ClaimNegotiations getClaimNegotiations() {
    return getOrCreateProperty("ClaimNegotiations", pcftest.ClaimNegotiations.class);
  }
  
  public ClaimPlanOfActionGroup_UpLink getClaimPlanOfActionGroup_UpLink() {
    return getOrCreateProperty("ClaimPlanOfActionGroup_UpLink", "ClaimPlanOfActionGroup_UpLink", null, pcftest.ClaimPlanOfActionGroup.ClaimPlanOfActionGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimPlanOfActionGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimPlanOfActionGroup");
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPlanOfActionGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPlanOfActionGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPlanOfActionGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimPlanOfActionGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPlanOfActionGroup_UpLink extends ClickableActionElement {
    public ClaimPlanOfActionGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPlanOfActionGroup_ClaimEvaluations getClaimPlanOfActionGroup_ClaimEvaluations() {
      return getOrCreateProperty("ClaimPlanOfActionGroup_ClaimEvaluations", "ClaimPlanOfActionGroup_ClaimEvaluations", null, pcftest.ClaimPlanOfActionGroup.MenuLinks.ClaimPlanOfActionGroup_ClaimEvaluations.class);
    }
    
    public ClaimPlanOfActionGroup_ClaimNegotiations getClaimPlanOfActionGroup_ClaimNegotiations() {
      return getOrCreateProperty("ClaimPlanOfActionGroup_ClaimNegotiations", "ClaimPlanOfActionGroup_ClaimNegotiations", null, pcftest.ClaimPlanOfActionGroup.MenuLinks.ClaimPlanOfActionGroup_ClaimNegotiations.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPlanOfActionGroup_ClaimEvaluations extends ClickableActionElement {
      public ClaimPlanOfActionGroup_ClaimEvaluations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimEvaluations click() {
        return clickThis(pcftest.ClaimEvaluations.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPlanOfActionGroup_ClaimNegotiations extends ClickableActionElement {
      public ClaimPlanOfActionGroup_ClaimNegotiations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimNegotiations click() {
        return clickThis(pcftest.ClaimNegotiations.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}