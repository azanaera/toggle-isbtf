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
import pcftest.ClaimPolicyGroup.ClaimPolicyGroup_UpLink;
import pcftest.ClaimPolicyGroup.MenuLinks;
import pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyAggregateLimits;
import pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyEndorsements;
import pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyGeneral;
import pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyLocations;
import pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyStatCodes;
import pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyTrips;
import pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyVehicles;
import pcftest.ClaimPolicyGroup._Paging;
import pcftest.ClaimPolicyGroup.__crumb__;
import pcftest.ClaimPolicyGroup._msgs;
import pcftest.ClaimPolicyGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyGroup extends PCFLocation {
  public final static String CHECKSUM = "817119d889ec491dd6279602647d4c55";
  
  public ClaimPolicyGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyGroup"));
  }
  
  public ClaimPolicyAggregateLimits getClaimPolicyAggregateLimits() {
    return getOrCreateProperty("ClaimPolicyAggregateLimits", pcftest.ClaimPolicyAggregateLimits.class);
  }
  
  public ClaimPolicyEndorsements getClaimPolicyEndorsements() {
    return getOrCreateProperty("ClaimPolicyEndorsements", pcftest.ClaimPolicyEndorsements.class);
  }
  
  public ClaimPolicyGeneral getClaimPolicyGeneral() {
    return getOrCreateProperty("ClaimPolicyGeneral", pcftest.ClaimPolicyGeneral.class);
  }
  
  public ClaimPolicyGroup_UpLink getClaimPolicyGroup_UpLink() {
    return getOrCreateProperty("ClaimPolicyGroup_UpLink", "ClaimPolicyGroup_UpLink", null, pcftest.ClaimPolicyGroup.ClaimPolicyGroup_UpLink.class);
  }
  
  public ClaimPolicyLocations getClaimPolicyLocations() {
    return getOrCreateProperty("ClaimPolicyLocations", pcftest.ClaimPolicyLocations.class);
  }
  
  public ClaimPolicyStatCodes getClaimPolicyStatCodes() {
    return getOrCreateProperty("ClaimPolicyStatCodes", pcftest.ClaimPolicyStatCodes.class);
  }
  
  public ClaimPolicyTrips getClaimPolicyTrips() {
    return getOrCreateProperty("ClaimPolicyTrips", pcftest.ClaimPolicyTrips.class);
  }
  
  public ClaimPolicyVehicles getClaimPolicyVehicles() {
    return getOrCreateProperty("ClaimPolicyVehicles", pcftest.ClaimPolicyVehicles.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimPolicyGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimPolicyGroup");
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimPolicyGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyGroup_UpLink extends ClickableActionElement {
    public ClaimPolicyGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyGroup_ClaimPolicyAggregateLimits getClaimPolicyGroup_ClaimPolicyAggregateLimits() {
      return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyAggregateLimits", "ClaimPolicyGroup_ClaimPolicyAggregateLimits", null, pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyAggregateLimits.class);
    }
    
    public ClaimPolicyGroup_ClaimPolicyEndorsements getClaimPolicyGroup_ClaimPolicyEndorsements() {
      return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyEndorsements", "ClaimPolicyGroup_ClaimPolicyEndorsements", null, pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyEndorsements.class);
    }
    
    public ClaimPolicyGroup_ClaimPolicyGeneral getClaimPolicyGroup_ClaimPolicyGeneral() {
      return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyGeneral", "ClaimPolicyGroup_ClaimPolicyGeneral", null, pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyGeneral.class);
    }
    
    public ClaimPolicyGroup_ClaimPolicyLocations getClaimPolicyGroup_ClaimPolicyLocations() {
      return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyLocations", "ClaimPolicyGroup_ClaimPolicyLocations", null, pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyLocations.class);
    }
    
    public ClaimPolicyGroup_ClaimPolicyStatCodes getClaimPolicyGroup_ClaimPolicyStatCodes() {
      return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyStatCodes", "ClaimPolicyGroup_ClaimPolicyStatCodes", null, pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyStatCodes.class);
    }
    
    public ClaimPolicyGroup_ClaimPolicyTrips getClaimPolicyGroup_ClaimPolicyTrips() {
      return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyTrips", "ClaimPolicyGroup_ClaimPolicyTrips", null, pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyTrips.class);
    }
    
    public ClaimPolicyGroup_ClaimPolicyVehicles getClaimPolicyGroup_ClaimPolicyVehicles() {
      return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyVehicles", "ClaimPolicyGroup_ClaimPolicyVehicles", null, pcftest.ClaimPolicyGroup.MenuLinks.ClaimPolicyGroup_ClaimPolicyVehicles.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGroup_ClaimPolicyAggregateLimits extends ClickableActionElement {
      public ClaimPolicyGroup_ClaimPolicyAggregateLimits(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyAggregateLimits click() {
        return clickThis(pcftest.ClaimPolicyAggregateLimits.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGroup_ClaimPolicyEndorsements extends ClickableActionElement {
      public ClaimPolicyGroup_ClaimPolicyEndorsements(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyEndorsements click() {
        return clickThis(pcftest.ClaimPolicyEndorsements.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGroup_ClaimPolicyGeneral extends ClickableActionElement {
      public ClaimPolicyGroup_ClaimPolicyGeneral(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyGeneral click() {
        return clickThis(pcftest.ClaimPolicyGeneral.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGroup_ClaimPolicyLocations extends ClickableActionElement {
      public ClaimPolicyGroup_ClaimPolicyLocations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyLocations click() {
        return clickThis(pcftest.ClaimPolicyLocations.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGroup_ClaimPolicyStatCodes extends ClickableActionElement {
      public ClaimPolicyGroup_ClaimPolicyStatCodes(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyStatCodes click() {
        return clickThis(pcftest.ClaimPolicyStatCodes.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGroup_ClaimPolicyTrips extends ClickableActionElement {
      public ClaimPolicyGroup_ClaimPolicyTrips(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyTrips click() {
        return clickThis(pcftest.ClaimPolicyTrips.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGroup_ClaimPolicyVehicles extends ClickableActionElement {
      public ClaimPolicyGroup_ClaimPolicyVehicles(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyVehicles click() {
        return clickThis(pcftest.ClaimPolicyVehicles.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}