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
import pcftest.BusinessRules.BusinessRules_UpLink;
import pcftest.BusinessRules.MenuLinks;
import pcftest.BusinessRules.MenuLinks.BusinessRules_ActivityRules;
import pcftest.BusinessRules.MenuLinks.BusinessRules_CCRulesExportImportStatus;
import pcftest.BusinessRules.MenuLinks.BusinessRules_ExposureRules;
import pcftest.BusinessRules.MenuLinks.BusinessRules_ReserveRules;
import pcftest.BusinessRules._Paging;
import pcftest.BusinessRules.__crumb__;
import pcftest.BusinessRules._msgs;
import pcftest.BusinessRules.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessRules extends PCFLocation {
  public final static String CHECKSUM = "66ed70d341037cf8c035ad6e37e3cec9";
  
  public BusinessRules(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BusinessRules"));
  }
  
  public ActivityRules getActivityRules() {
    return getOrCreateProperty("ActivityRules", pcftest.ActivityRules.class);
  }
  
  public BusinessRules_UpLink getBusinessRules_UpLink() {
    return getOrCreateProperty("BusinessRules_UpLink", "BusinessRules_UpLink", null, pcftest.BusinessRules.BusinessRules_UpLink.class);
  }
  
  public CCRulesExportImportStatus getCCRulesExportImportStatus() {
    return getOrCreateProperty("CCRulesExportImportStatus", pcftest.CCRulesExportImportStatus.class);
  }
  
  public ExposureRules getExposureRules() {
    return getOrCreateProperty("ExposureRules", pcftest.ExposureRules.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.BusinessRules.MenuLinks.class, "Admin-MenuLinks-Admin_BusinessSettings-BusinessSettings_BusinessRules");
  }
  
  public ReserveRules getReserveRules() {
    return getOrCreateProperty("ReserveRules", pcftest.ReserveRules.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BusinessRules._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BusinessRules.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BusinessRules._msgs.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.BusinessRules.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessRules_UpLink extends ClickableActionElement {
    public BusinessRules_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BusinessRules_ActivityRules getBusinessRules_ActivityRules() {
      return getOrCreateProperty("BusinessRules_ActivityRules", "BusinessRules_ActivityRules", null, pcftest.BusinessRules.MenuLinks.BusinessRules_ActivityRules.class);
    }
    
    public BusinessRules_CCRulesExportImportStatus getBusinessRules_CCRulesExportImportStatus() {
      return getOrCreateProperty("BusinessRules_CCRulesExportImportStatus", "BusinessRules_CCRulesExportImportStatus", null, pcftest.BusinessRules.MenuLinks.BusinessRules_CCRulesExportImportStatus.class);
    }
    
    public BusinessRules_ExposureRules getBusinessRules_ExposureRules() {
      return getOrCreateProperty("BusinessRules_ExposureRules", "BusinessRules_ExposureRules", null, pcftest.BusinessRules.MenuLinks.BusinessRules_ExposureRules.class);
    }
    
    public BusinessRules_ReserveRules getBusinessRules_ReserveRules() {
      return getOrCreateProperty("BusinessRules_ReserveRules", "BusinessRules_ReserveRules", null, pcftest.BusinessRules.MenuLinks.BusinessRules_ReserveRules.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessRules_ActivityRules extends ClickableActionElement {
      public BusinessRules_ActivityRules(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActivityRules click() {
        return clickThis(pcftest.ActivityRules.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessRules_CCRulesExportImportStatus extends ClickableActionElement {
      public BusinessRules_CCRulesExportImportStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CCRulesExportImportStatus click() {
        return clickThis(pcftest.CCRulesExportImportStatus.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessRules_ExposureRules extends ClickableActionElement {
      public BusinessRules_ExposureRules(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExposureRules click() {
        return clickThis(pcftest.ExposureRules.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessRules_ReserveRules extends ClickableActionElement {
      public BusinessRules_ReserveRules(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReserveRules click() {
        return clickThis(pcftest.ReserveRules.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/BusinessRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}