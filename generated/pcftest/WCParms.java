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
import pcftest.WCParms.MenuLinks;
import pcftest.WCParms.MenuLinks.WCParms_DenialPeriods;
import pcftest.WCParms.MenuLinks.WCParms_WCBenefitParameterSet;
import pcftest.WCParms.MenuLinks.WCParms_WCPDBenefits;
import pcftest.WCParms.MenuLinks.WCParms_WCPDWeeksAndLimits;
import pcftest.WCParms.WCParms_UpLink;
import pcftest.WCParms._Paging;
import pcftest.WCParms.__crumb__;
import pcftest.WCParms._msgs;
import pcftest.WCParms.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCParms extends PCFLocation {
  public final static String CHECKSUM = "a26c90f2069f13cb4f9acbd2ae540686";
  
  public WCParms(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WCParms"));
  }
  
  public DenialPeriods getDenialPeriods() {
    return getOrCreateProperty("DenialPeriods", pcftest.DenialPeriods.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.WCParms.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public WCBenefitParameterSet getWCBenefitParameterSet() {
    return getOrCreateProperty("WCBenefitParameterSet", pcftest.WCBenefitParameterSet.class);
  }
  
  public WCPDBenefits getWCPDBenefits() {
    return getOrCreateProperty("WCPDBenefits", pcftest.WCPDBenefits.class);
  }
  
  public WCPDWeeksAndLimits getWCPDWeeksAndLimits() {
    return getOrCreateProperty("WCPDWeeksAndLimits", pcftest.WCPDWeeksAndLimits.class);
  }
  
  public WCParms_UpLink getWCParms_UpLink() {
    return getOrCreateProperty("WCParms_UpLink", "WCParms_UpLink", null, pcftest.WCParms.WCParms_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WCParms._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WCParms.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WCParms._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.WCParms.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCParms_DenialPeriods getWCParms_DenialPeriods() {
      return getOrCreateProperty("WCParms_DenialPeriods", "WCParms_DenialPeriods", null, pcftest.WCParms.MenuLinks.WCParms_DenialPeriods.class);
    }
    
    public WCParms_WCBenefitParameterSet getWCParms_WCBenefitParameterSet() {
      return getOrCreateProperty("WCParms_WCBenefitParameterSet", "WCParms_WCBenefitParameterSet", null, pcftest.WCParms.MenuLinks.WCParms_WCBenefitParameterSet.class);
    }
    
    public WCParms_WCPDBenefits getWCParms_WCPDBenefits() {
      return getOrCreateProperty("WCParms_WCPDBenefits", "WCParms_WCPDBenefits", null, pcftest.WCParms.MenuLinks.WCParms_WCPDBenefits.class);
    }
    
    public WCParms_WCPDWeeksAndLimits getWCParms_WCPDWeeksAndLimits() {
      return getOrCreateProperty("WCParms_WCPDWeeksAndLimits", "WCParms_WCPDWeeksAndLimits", null, pcftest.WCParms.MenuLinks.WCParms_WCPDWeeksAndLimits.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WCParms_DenialPeriods extends ClickableActionElement {
      public WCParms_DenialPeriods(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DenialPeriods click() {
        return clickThis(pcftest.DenialPeriods.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WCParms_WCBenefitParameterSet extends ClickableActionElement {
      public WCParms_WCBenefitParameterSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WCBenefitParameterSet click() {
        return clickThis(pcftest.WCBenefitParameterSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WCParms_WCPDBenefits extends ClickableActionElement {
      public WCParms_WCPDBenefits(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WCPDBenefits click() {
        return clickThis(pcftest.WCPDBenefits.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WCParms_WCPDWeeksAndLimits extends ClickableActionElement {
      public WCParms_WCPDWeeksAndLimits(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WCPDWeeksAndLimits click() {
        return clickThis(pcftest.WCPDWeeksAndLimits.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCParms_UpLink extends ClickableActionElement {
    public WCParms_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCParms.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}