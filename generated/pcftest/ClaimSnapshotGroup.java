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
import pcftest.ClaimSnapshotGroup.ClaimSnapshotGroup_UpLink;
import pcftest.ClaimSnapshotGroup.MenuLinks;
import pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotDocuments;
import pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotExposures;
import pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotExtraFields;
import pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotLossDetails;
import pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotNotes;
import pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved;
import pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotPolicy;
import pcftest.ClaimSnapshotGroup._Paging;
import pcftest.ClaimSnapshotGroup.__crumb__;
import pcftest.ClaimSnapshotGroup._msgs;
import pcftest.ClaimSnapshotGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGroup extends PCFLocation {
  public final static String CHECKSUM = "bfdc740ffc1990616d4ca3856bbcf9ce";
  
  public ClaimSnapshotGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotGroup"));
  }
  
  public ClaimSnapshotDocuments getClaimSnapshotDocuments() {
    return getOrCreateProperty("ClaimSnapshotDocuments", pcftest.ClaimSnapshotDocuments.class);
  }
  
  public ClaimSnapshotExposures getClaimSnapshotExposures() {
    return getOrCreateProperty("ClaimSnapshotExposures", pcftest.ClaimSnapshotExposures.class);
  }
  
  public ClaimSnapshotExtraFields getClaimSnapshotExtraFields() {
    return getOrCreateProperty("ClaimSnapshotExtraFields", pcftest.ClaimSnapshotExtraFields.class);
  }
  
  public ClaimSnapshotGroup_UpLink getClaimSnapshotGroup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotGroup_UpLink", "ClaimSnapshotGroup_UpLink", null, pcftest.ClaimSnapshotGroup.ClaimSnapshotGroup_UpLink.class);
  }
  
  public ClaimSnapshotLossDetails getClaimSnapshotLossDetails() {
    return getOrCreateProperty("ClaimSnapshotLossDetails", pcftest.ClaimSnapshotLossDetails.class);
  }
  
  public ClaimSnapshotNotes getClaimSnapshotNotes() {
    return getOrCreateProperty("ClaimSnapshotNotes", pcftest.ClaimSnapshotNotes.class);
  }
  
  public ClaimSnapshotPartiesInvolved getClaimSnapshotPartiesInvolved() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolved", pcftest.ClaimSnapshotPartiesInvolved.class);
  }
  
  public ClaimSnapshotPolicy getClaimSnapshotPolicy() {
    return getOrCreateProperty("ClaimSnapshotPolicy", pcftest.ClaimSnapshotPolicy.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimSnapshotGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimSnapshotGroup");
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimSnapshotGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGroup_UpLink extends ClickableActionElement {
    public ClaimSnapshotGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSnapshotGroup_ClaimSnapshotDocuments getClaimSnapshotGroup_ClaimSnapshotDocuments() {
      return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotDocuments", "ClaimSnapshotGroup_ClaimSnapshotDocuments", null, pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotDocuments.class);
    }
    
    public ClaimSnapshotGroup_ClaimSnapshotExposures getClaimSnapshotGroup_ClaimSnapshotExposures() {
      return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotExposures", "ClaimSnapshotGroup_ClaimSnapshotExposures", null, pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotExposures.class);
    }
    
    public ClaimSnapshotGroup_ClaimSnapshotExtraFields getClaimSnapshotGroup_ClaimSnapshotExtraFields() {
      return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotExtraFields", "ClaimSnapshotGroup_ClaimSnapshotExtraFields", null, pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotExtraFields.class);
    }
    
    public ClaimSnapshotGroup_ClaimSnapshotLossDetails getClaimSnapshotGroup_ClaimSnapshotLossDetails() {
      return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotLossDetails", "ClaimSnapshotGroup_ClaimSnapshotLossDetails", null, pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotLossDetails.class);
    }
    
    public ClaimSnapshotGroup_ClaimSnapshotNotes getClaimSnapshotGroup_ClaimSnapshotNotes() {
      return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotNotes", "ClaimSnapshotGroup_ClaimSnapshotNotes", null, pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotNotes.class);
    }
    
    public ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved getClaimSnapshotGroup_ClaimSnapshotPartiesInvolved() {
      return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved", "ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved", null, pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved.class);
    }
    
    public ClaimSnapshotGroup_ClaimSnapshotPolicy getClaimSnapshotGroup_ClaimSnapshotPolicy() {
      return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotPolicy", "ClaimSnapshotGroup_ClaimSnapshotPolicy", null, pcftest.ClaimSnapshotGroup.MenuLinks.ClaimSnapshotGroup_ClaimSnapshotPolicy.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSnapshotGroup_ClaimSnapshotDocuments extends ClickableActionElement {
      public ClaimSnapshotGroup_ClaimSnapshotDocuments(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotDocuments click() {
        return clickThis(pcftest.ClaimSnapshotDocuments.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSnapshotGroup_ClaimSnapshotExposures extends ClickableActionElement {
      public ClaimSnapshotGroup_ClaimSnapshotExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotExposures click() {
        return clickThis(pcftest.ClaimSnapshotExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSnapshotGroup_ClaimSnapshotExtraFields extends ClickableActionElement {
      public ClaimSnapshotGroup_ClaimSnapshotExtraFields(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotExtraFields click() {
        return clickThis(pcftest.ClaimSnapshotExtraFields.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSnapshotGroup_ClaimSnapshotLossDetails extends ClickableActionElement {
      public ClaimSnapshotGroup_ClaimSnapshotLossDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotLossDetails click() {
        return clickThis(pcftest.ClaimSnapshotLossDetails.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSnapshotGroup_ClaimSnapshotNotes extends ClickableActionElement {
      public ClaimSnapshotGroup_ClaimSnapshotNotes(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotNotes click() {
        return clickThis(pcftest.ClaimSnapshotNotes.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved extends ClickableActionElement {
      public ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotPartiesInvolved click() {
        return clickThis(pcftest.ClaimSnapshotPartiesInvolved.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSnapshotGroup_ClaimSnapshotPolicy extends ClickableActionElement {
      public ClaimSnapshotGroup_ClaimSnapshotPolicy(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotPolicy click() {
        return clickThis(pcftest.ClaimSnapshotPolicy.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}