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
import pcftest.Vacation.MenuLinks;
import pcftest.Vacation.MenuLinks.Vacation_VacationActivities;
import pcftest.Vacation.MenuLinks.Vacation_VacationClaims;
import pcftest.Vacation.MenuLinks.Vacation_VacationExposures;
import pcftest.Vacation.Vacation_UpLink;
import pcftest.Vacation._Paging;
import pcftest.Vacation.__crumb__;
import pcftest.Vacation._msgs;
import pcftest.Vacation.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Vacation extends PCFLocation {
  public final static String CHECKSUM = "79513f998aab148a37f2242d8ac4f6d4";
  
  public Vacation(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Vacation"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Vacation.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public VacationActivities getVacationActivities() {
    return getOrCreateProperty("VacationActivities", pcftest.VacationActivities.class);
  }
  
  public VacationClaims getVacationClaims() {
    return getOrCreateProperty("VacationClaims", pcftest.VacationClaims.class);
  }
  
  public VacationExposures getVacationExposures() {
    return getOrCreateProperty("VacationExposures", pcftest.VacationExposures.class);
  }
  
  public VacationMenuActions getVacationMenuActions() {
    return getOrCreateProperty("VacationMenuActions", "VacationMenuActions", null, pcftest.VacationMenuActions.class);
  }
  
  public Vacation_UpLink getVacation_UpLink() {
    return getOrCreateProperty("Vacation_UpLink", "Vacation_UpLink", null, pcftest.Vacation.Vacation_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Vacation._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Vacation.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Vacation._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Vacation.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Vacation_VacationActivities getVacation_VacationActivities() {
      return getOrCreateProperty("Vacation_VacationActivities", "Vacation_VacationActivities", null, pcftest.Vacation.MenuLinks.Vacation_VacationActivities.class);
    }
    
    public Vacation_VacationClaims getVacation_VacationClaims() {
      return getOrCreateProperty("Vacation_VacationClaims", "Vacation_VacationClaims", null, pcftest.Vacation.MenuLinks.Vacation_VacationClaims.class);
    }
    
    public Vacation_VacationExposures getVacation_VacationExposures() {
      return getOrCreateProperty("Vacation_VacationExposures", "Vacation_VacationExposures", null, pcftest.Vacation.MenuLinks.Vacation_VacationExposures.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Vacation_VacationActivities extends ClickableActionElement {
      public Vacation_VacationActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VacationActivities click() {
        return clickThis(pcftest.VacationActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Vacation_VacationClaims extends ClickableActionElement {
      public Vacation_VacationClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VacationClaims click() {
        return clickThis(pcftest.VacationClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Vacation_VacationExposures extends ClickableActionElement {
      public Vacation_VacationExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VacationExposures click() {
        return clickThis(pcftest.VacationExposures.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vacation_UpLink extends ClickableActionElement {
    public Vacation_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}