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
import pcftest.ClaimPartiesGroup.ClaimPartiesGroup_UpLink;
import pcftest.ClaimPartiesGroup.MenuLinks;
import pcftest.ClaimPartiesGroup.MenuLinks.ClaimPartiesGroup_ClaimContacts;
import pcftest.ClaimPartiesGroup.MenuLinks.ClaimPartiesGroup_ClaimUsers;
import pcftest.ClaimPartiesGroup._Paging;
import pcftest.ClaimPartiesGroup.__crumb__;
import pcftest.ClaimPartiesGroup._msgs;
import pcftest.ClaimPartiesGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPartiesGroup extends PCFLocation {
  public final static String CHECKSUM = "075d2d9f208e0decd9bdfde8d262e780";
  
  public ClaimPartiesGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPartiesGroup"));
  }
  
  public ClaimContacts getClaimContacts() {
    return getOrCreateProperty("ClaimContacts", pcftest.ClaimContacts.class);
  }
  
  public ClaimPartiesGroup_UpLink getClaimPartiesGroup_UpLink() {
    return getOrCreateProperty("ClaimPartiesGroup_UpLink", "ClaimPartiesGroup_UpLink", null, pcftest.ClaimPartiesGroup.ClaimPartiesGroup_UpLink.class);
  }
  
  public ClaimUsers getClaimUsers() {
    return getOrCreateProperty("ClaimUsers", pcftest.ClaimUsers.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimPartiesGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimPartiesGroup");
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPartiesGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPartiesGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPartiesGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimPartiesGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPartiesGroup_UpLink extends ClickableActionElement {
    public ClaimPartiesGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPartiesGroup_ClaimContacts getClaimPartiesGroup_ClaimContacts() {
      return getOrCreateProperty("ClaimPartiesGroup_ClaimContacts", "ClaimPartiesGroup_ClaimContacts", null, pcftest.ClaimPartiesGroup.MenuLinks.ClaimPartiesGroup_ClaimContacts.class);
    }
    
    public ClaimPartiesGroup_ClaimUsers getClaimPartiesGroup_ClaimUsers() {
      return getOrCreateProperty("ClaimPartiesGroup_ClaimUsers", "ClaimPartiesGroup_ClaimUsers", null, pcftest.ClaimPartiesGroup.MenuLinks.ClaimPartiesGroup_ClaimUsers.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPartiesGroup_ClaimContacts extends ClickableActionElement {
      public ClaimPartiesGroup_ClaimContacts(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContacts click() {
        return clickThis(pcftest.ClaimContacts.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPartiesGroup_ClaimUsers extends ClickableActionElement {
      public ClaimPartiesGroup_ClaimUsers(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimUsers click() {
        return clickThis(pcftest.ClaimUsers.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}