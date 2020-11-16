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
import pcftest.ClaimInfoGroup.ClaimInfoGroup_UpLink;
import pcftest.ClaimInfoGroup.MenuLinks;
import pcftest.ClaimInfoGroup.MenuLinks.ClaimInfoGroup_ArchivedClaim;
import pcftest.ClaimInfoGroup._Paging;
import pcftest.ClaimInfoGroup.__crumb__;
import pcftest.ClaimInfoGroup._msgs;
import pcftest.ClaimInfoGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimInfoGroup extends PCFLocation {
  public final static String CHECKSUM = "3ce8fa9c665f4a7ac86dd9fee8840705";
  
  public ClaimInfoGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimInfoGroup"));
  }
  
  public ArchivedClaim getArchivedClaim() {
    return getOrCreateProperty("ArchivedClaim", pcftest.ArchivedClaim.class);
  }
  
  public ClaimInfoGroup_UpLink getClaimInfoGroup_UpLink() {
    return getOrCreateProperty("ClaimInfoGroup_UpLink", "ClaimInfoGroup_UpLink", null, pcftest.ClaimInfoGroup.ClaimInfoGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimInfoGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimInfoGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimInfoGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimInfoGroup._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimInfoGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimInfoGroup_UpLink extends ClickableActionElement {
    public ClaimInfoGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimInfoGroup_ArchivedClaim getClaimInfoGroup_ArchivedClaim() {
      return getOrCreateProperty("ClaimInfoGroup_ArchivedClaim", "ClaimInfoGroup_ArchivedClaim", null, pcftest.ClaimInfoGroup.MenuLinks.ClaimInfoGroup_ArchivedClaim.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimInfoGroup_ArchivedClaim extends ClickableActionElement {
      public ClaimInfoGroup_ArchivedClaim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ArchivedClaim click() {
        return clickThis(pcftest.ArchivedClaim.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimInfoGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}