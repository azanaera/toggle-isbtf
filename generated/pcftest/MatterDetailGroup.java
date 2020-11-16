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
import pcftest.MatterDetailGroup.MatterDetailGroup_UpLink;
import pcftest.MatterDetailGroup.MenuLinks;
import pcftest.MatterDetailGroup.MenuLinks.MatterDetailGroup_MatterDetailPage;
import pcftest.MatterDetailGroup._Paging;
import pcftest.MatterDetailGroup.__crumb__;
import pcftest.MatterDetailGroup._msgs;
import pcftest.MatterDetailGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MatterDetailGroup extends PCFLocation {
  public final static String CHECKSUM = "f473684786b3996e5ada236fb406e8fa";
  
  public MatterDetailGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MatterDetailGroup"));
  }
  
  public MatterDetailGroup_UpLink getMatterDetailGroup_UpLink() {
    return getOrCreateProperty("MatterDetailGroup_UpLink", "MatterDetailGroup_UpLink", null, pcftest.MatterDetailGroup.MatterDetailGroup_UpLink.class);
  }
  
  public MatterDetailPage getMatterDetailPage() {
    return getOrCreateProperty("MatterDetailPage", pcftest.MatterDetailPage.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.MatterDetailGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MatterDetailGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MatterDetailGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MatterDetailGroup._msgs.class);
  }
  
  public ClaimMatters get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimMatters.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.MatterDetailGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailGroup_UpLink extends ClickableActionElement {
    public MatterDetailGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MatterDetailGroup_MatterDetailPage getMatterDetailGroup_MatterDetailPage() {
      return getOrCreateProperty("MatterDetailGroup_MatterDetailPage", "MatterDetailGroup_MatterDetailPage", null, pcftest.MatterDetailGroup.MenuLinks.MatterDetailGroup_MatterDetailPage.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterDetailGroup_MatterDetailPage extends ClickableActionElement {
      public MatterDetailGroup_MatterDetailPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MatterDetailPage click() {
        return clickThis(pcftest.MatterDetailPage.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}