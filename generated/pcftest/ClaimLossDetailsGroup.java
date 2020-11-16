package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimLossDetailsGroup.ClaimLossDetailsGroup_UpLink;
import pcftest.ClaimLossDetailsGroup.MenuLinks;
import pcftest.ClaimLossDetailsGroup.MenuLinks.ClaimLossDetailsGroup_ClaimAssociations;
import pcftest.ClaimLossDetailsGroup.MenuLinks.ClaimLossDetailsGroup_ClaimLossDetails;
import pcftest.ClaimLossDetailsGroup.MenuLinks.ClaimLossDetailsGroup_SIDetails;
import pcftest.ClaimLossDetailsGroup.MenuLinks.entry.ClaimLossDetailsGroup_LossDetailsExposureDetail;
import pcftest.ClaimLossDetailsGroup._Paging;
import pcftest.ClaimLossDetailsGroup.__crumb__;
import pcftest.ClaimLossDetailsGroup._msgs;
import pcftest.ClaimLossDetailsGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimLossDetailsGroup extends PCFLocation {
  public final static String CHECKSUM = "5bea3e2eb48fab3e6430d4d9ee76edc3";
  
  public ClaimLossDetailsGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimLossDetailsGroup"));
  }
  
  public ClaimAssociations getClaimAssociations() {
    return getOrCreateProperty("ClaimAssociations", pcftest.ClaimAssociations.class);
  }
  
  public ClaimLossDetails getClaimLossDetails() {
    return getOrCreateProperty("ClaimLossDetails", pcftest.ClaimLossDetails.class);
  }
  
  public ClaimLossDetailsGroup_UpLink getClaimLossDetailsGroup_UpLink() {
    return getOrCreateProperty("ClaimLossDetailsGroup_UpLink", "ClaimLossDetailsGroup_UpLink", null, pcftest.ClaimLossDetailsGroup.ClaimLossDetailsGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimLossDetailsGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimLossDetailsGroup");
  }
  
  public SIDetails getSIDetails() {
    return getOrCreateProperty("SIDetails", pcftest.SIDetails.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<pcftest.ClaimLossDetailsGroup.entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ClaimLossDetailsGroup.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimLossDetailsGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimLossDetailsGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimLossDetailsGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimLossDetailsGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossDetailsGroup_UpLink extends ClickableActionElement {
    public ClaimLossDetailsGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimLossDetailsGroup_ClaimAssociations getClaimLossDetailsGroup_ClaimAssociations() {
      return getOrCreateProperty("ClaimLossDetailsGroup_ClaimAssociations", "ClaimLossDetailsGroup_ClaimAssociations", null, pcftest.ClaimLossDetailsGroup.MenuLinks.ClaimLossDetailsGroup_ClaimAssociations.class);
    }
    
    public ClaimLossDetailsGroup_ClaimLossDetails getClaimLossDetailsGroup_ClaimLossDetails() {
      return getOrCreateProperty("ClaimLossDetailsGroup_ClaimLossDetails", "ClaimLossDetailsGroup_ClaimLossDetails", null, pcftest.ClaimLossDetailsGroup.MenuLinks.ClaimLossDetailsGroup_ClaimLossDetails.class);
    }
    
    public ClaimLossDetailsGroup_SIDetails getClaimLossDetailsGroup_SIDetails() {
      return getOrCreateProperty("ClaimLossDetailsGroup_SIDetails", "ClaimLossDetailsGroup_SIDetails", null, pcftest.ClaimLossDetailsGroup.MenuLinks.ClaimLossDetailsGroup_SIDetails.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.ClaimLossDetailsGroup.MenuLinks.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.ClaimLossDetailsGroup.MenuLinks.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimLossDetailsGroup_ClaimAssociations extends ClickableActionElement {
      public ClaimLossDetailsGroup_ClaimAssociations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimAssociations click() {
        return clickThis(pcftest.ClaimAssociations.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimLossDetailsGroup_ClaimLossDetails extends ClickableActionElement {
      public ClaimLossDetailsGroup_ClaimLossDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimLossDetails click() {
        return clickThis(pcftest.ClaimLossDetails.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimLossDetailsGroup_SIDetails extends ClickableActionElement {
      public ClaimLossDetailsGroup_SIDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SIDetails click() {
        return clickThis(pcftest.SIDetails.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimLossDetailsGroup_LossDetailsExposureDetail getClaimLossDetailsGroup_LossDetailsExposureDetail() {
        return getOrCreateProperty("ClaimLossDetailsGroup_LossDetailsExposureDetail", "ClaimLossDetailsGroup_LossDetailsExposureDetail", null, pcftest.ClaimLossDetailsGroup.MenuLinks.entry.ClaimLossDetailsGroup_LossDetailsExposureDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimLossDetailsGroup_LossDetailsExposureDetail extends ClickableActionElement {
        public ClaimLossDetailsGroup_LossDetailsExposureDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public LossDetailsExposureDetail click() {
          return clickThis(pcftest.LossDetailsExposureDetail.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LossDetailsExposureDetail getLossDetailsExposureDetail() {
      return getOrCreateProperty("LossDetailsExposureDetail", pcftest.LossDetailsExposureDetail.class);
    }
    
    
  }
  
  
}