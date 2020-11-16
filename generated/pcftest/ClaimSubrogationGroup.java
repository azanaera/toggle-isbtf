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
import pcftest.ClaimSubrogationGroup.ClaimSubrogationGroup_UpLink;
import pcftest.ClaimSubrogationGroup.MenuLinks;
import pcftest.ClaimSubrogationGroup.MenuLinks.ClaimSubrogationGroup_SubrogationGeneral;
import pcftest.ClaimSubrogationGroup.MenuLinks.ClaimSubrogationGroup_SubrogationParties;
import pcftest.ClaimSubrogationGroup._Paging;
import pcftest.ClaimSubrogationGroup.__crumb__;
import pcftest.ClaimSubrogationGroup._msgs;
import pcftest.ClaimSubrogationGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSubrogationGroup extends PCFLocation {
  public final static String CHECKSUM = "e350622e9850f9e9d6bf030281482251";
  
  public ClaimSubrogationGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSubrogationGroup"));
  }
  
  public ClaimSubrogationGroup_UpLink getClaimSubrogationGroup_UpLink() {
    return getOrCreateProperty("ClaimSubrogationGroup_UpLink", "ClaimSubrogationGroup_UpLink", null, pcftest.ClaimSubrogationGroup.ClaimSubrogationGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimSubrogationGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimSubrogationGroup");
  }
  
  public SubrogationGeneral getSubrogationGeneral() {
    return getOrCreateProperty("SubrogationGeneral", pcftest.SubrogationGeneral.class);
  }
  
  public SubrogationParties getSubrogationParties() {
    return getOrCreateProperty("SubrogationParties", pcftest.SubrogationParties.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSubrogationGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSubrogationGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSubrogationGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimSubrogationGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSubrogationGroup_UpLink extends ClickableActionElement {
    public ClaimSubrogationGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSubrogationGroup_SubrogationGeneral getClaimSubrogationGroup_SubrogationGeneral() {
      return getOrCreateProperty("ClaimSubrogationGroup_SubrogationGeneral", "ClaimSubrogationGroup_SubrogationGeneral", null, pcftest.ClaimSubrogationGroup.MenuLinks.ClaimSubrogationGroup_SubrogationGeneral.class);
    }
    
    public ClaimSubrogationGroup_SubrogationParties getClaimSubrogationGroup_SubrogationParties() {
      return getOrCreateProperty("ClaimSubrogationGroup_SubrogationParties", "ClaimSubrogationGroup_SubrogationParties", null, pcftest.ClaimSubrogationGroup.MenuLinks.ClaimSubrogationGroup_SubrogationParties.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSubrogationGroup_SubrogationGeneral extends ClickableActionElement {
      public ClaimSubrogationGroup_SubrogationGeneral(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SubrogationGeneral click() {
        return clickThis(pcftest.SubrogationGeneral.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSubrogationGroup_SubrogationParties extends ClickableActionElement {
      public ClaimSubrogationGroup_SubrogationParties(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SubrogationParties click() {
        return clickThis(pcftest.SubrogationParties.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}