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
import pcftest.BusinessSettings.BusinessSettings_UpLink;
import pcftest.BusinessSettings.MenuLinks;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_ActivityPatterns;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_ActivityRules;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_CCRulesExportImportStatus;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_ExposureRules;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_ReserveRules;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessWeek;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_Catastrophes;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination.CoverageDetermination_IncompatibleNewExposure;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForCause;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForFault;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_Holidays;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_ICD;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_KeyMetrics;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_ReinsuranceThresholds;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_DenialPeriods;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_WCBenefitParameterSet;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_WCPDBenefits;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_WCPDWeeksAndLimits;
import pcftest.BusinessSettings.MenuLinks.BusinessSettings_WorkloadClassifications;
import pcftest.BusinessSettings._Paging;
import pcftest.BusinessSettings.__crumb__;
import pcftest.BusinessSettings._msgs;
import pcftest.BusinessSettings.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessSettings extends PCFLocation {
  public final static String CHECKSUM = "9fbd4acdb4372ef4f8826d9bd5b0b123";
  
  public BusinessSettings(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BusinessSettings"));
  }
  
  public ActivityPatterns getActivityPatterns() {
    return getOrCreateProperty("ActivityPatterns", pcftest.ActivityPatterns.class);
  }
  
  public BusinessRules getBusinessRules() {
    return getOrCreateProperty("BusinessRules", pcftest.BusinessRules.class);
  }
  
  public BusinessSettings_UpLink getBusinessSettings_UpLink() {
    return getOrCreateProperty("BusinessSettings_UpLink", "BusinessSettings_UpLink", null, pcftest.BusinessSettings.BusinessSettings_UpLink.class);
  }
  
  public BusinessWeek getBusinessWeek() {
    return getOrCreateProperty("BusinessWeek", pcftest.BusinessWeek.class);
  }
  
  public Catastrophes getCatastrophes() {
    return getOrCreateProperty("Catastrophes", pcftest.Catastrophes.class);
  }
  
  public CoverageDetermination getCoverageDetermination() {
    return getOrCreateProperty("CoverageDetermination", pcftest.CoverageDetermination.class);
  }
  
  public Holidays getHolidays() {
    return getOrCreateProperty("Holidays", pcftest.Holidays.class);
  }
  
  public ICD getICD() {
    return getOrCreateProperty("ICD", pcftest.ICD.class);
  }
  
  public KeyMetrics getKeyMetrics() {
    return getOrCreateProperty("KeyMetrics", pcftest.KeyMetrics.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.BusinessSettings.MenuLinks.class, "Admin-MenuLinks-Admin_BusinessSettings");
  }
  
  public ReinsuranceThresholds getReinsuranceThresholds() {
    return getOrCreateProperty("ReinsuranceThresholds", pcftest.ReinsuranceThresholds.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public WCParms getWCParms() {
    return getOrCreateProperty("WCParms", pcftest.WCParms.class);
  }
  
  public WorkloadClassifications getWorkloadClassifications() {
    return getOrCreateProperty("WorkloadClassifications", pcftest.WorkloadClassifications.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BusinessSettings._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BusinessSettings.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BusinessSettings._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.BusinessSettings.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessSettings_UpLink extends ClickableActionElement {
    public BusinessSettings_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BusinessSettings_ActivityPatterns getBusinessSettings_ActivityPatterns() {
      return getOrCreateProperty("BusinessSettings_ActivityPatterns", "BusinessSettings_ActivityPatterns", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_ActivityPatterns.class);
    }
    
    public BusinessSettings_BusinessRules getBusinessSettings_BusinessRules() {
      return getOrCreateProperty("BusinessSettings_BusinessRules", "BusinessSettings_BusinessRules", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.class);
    }
    
    public BusinessSettings_BusinessWeek getBusinessSettings_BusinessWeek() {
      return getOrCreateProperty("BusinessSettings_BusinessWeek", "BusinessSettings_BusinessWeek", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessWeek.class);
    }
    
    public BusinessSettings_Catastrophes getBusinessSettings_Catastrophes() {
      return getOrCreateProperty("BusinessSettings_Catastrophes", "BusinessSettings_Catastrophes", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_Catastrophes.class);
    }
    
    public BusinessSettings_CoverageDetermination getBusinessSettings_CoverageDetermination() {
      return getOrCreateProperty("BusinessSettings_CoverageDetermination", "BusinessSettings_CoverageDetermination", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination.class);
    }
    
    public BusinessSettings_Holidays getBusinessSettings_Holidays() {
      return getOrCreateProperty("BusinessSettings_Holidays", "BusinessSettings_Holidays", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_Holidays.class);
    }
    
    public BusinessSettings_ICD getBusinessSettings_ICD() {
      return getOrCreateProperty("BusinessSettings_ICD", "BusinessSettings_ICD", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_ICD.class);
    }
    
    public BusinessSettings_KeyMetrics getBusinessSettings_KeyMetrics() {
      return getOrCreateProperty("BusinessSettings_KeyMetrics", "BusinessSettings_KeyMetrics", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_KeyMetrics.class);
    }
    
    public BusinessSettings_ReinsuranceThresholds getBusinessSettings_ReinsuranceThresholds() {
      return getOrCreateProperty("BusinessSettings_ReinsuranceThresholds", "BusinessSettings_ReinsuranceThresholds", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_ReinsuranceThresholds.class);
    }
    
    public BusinessSettings_WCParms getBusinessSettings_WCParms() {
      return getOrCreateProperty("BusinessSettings_WCParms", "BusinessSettings_WCParms", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.class);
    }
    
    public BusinessSettings_WorkloadClassifications getBusinessSettings_WorkloadClassifications() {
      return getOrCreateProperty("BusinessSettings_WorkloadClassifications", "BusinessSettings_WorkloadClassifications", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_WorkloadClassifications.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_ActivityPatterns extends ClickableActionElement {
      public BusinessSettings_ActivityPatterns(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActivityPatterns click() {
        return clickThis(pcftest.ActivityPatterns.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_BusinessRules extends ClickableActionElement {
      public BusinessSettings_BusinessRules(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public BusinessRules_ActivityRules getBusinessRules_ActivityRules() {
        return getOrCreateProperty("BusinessRules_ActivityRules", "BusinessRules_ActivityRules", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_ActivityRules.class);
      }
      
      public BusinessRules_CCRulesExportImportStatus getBusinessRules_CCRulesExportImportStatus() {
        return getOrCreateProperty("BusinessRules_CCRulesExportImportStatus", "BusinessRules_CCRulesExportImportStatus", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_CCRulesExportImportStatus.class);
      }
      
      public BusinessRules_ExposureRules getBusinessRules_ExposureRules() {
        return getOrCreateProperty("BusinessRules_ExposureRules", "BusinessRules_ExposureRules", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_ExposureRules.class);
      }
      
      public BusinessRules_ReserveRules getBusinessRules_ReserveRules() {
        return getOrCreateProperty("BusinessRules_ReserveRules", "BusinessRules_ReserveRules", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_BusinessRules.BusinessRules_ReserveRules.class);
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
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_BusinessWeek extends ClickableActionElement {
      public BusinessSettings_BusinessWeek(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_Catastrophes extends ClickableActionElement {
      public BusinessSettings_Catastrophes(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Catastrophes click() {
        return clickThis(pcftest.Catastrophes.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_CoverageDetermination extends ClickableActionElement {
      public BusinessSettings_CoverageDetermination(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public CoverageDetermination_IncompatibleNewExposure getCoverageDetermination_IncompatibleNewExposure() {
        return getOrCreateProperty("CoverageDetermination_IncompatibleNewExposure", "CoverageDetermination_IncompatibleNewExposure", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination.CoverageDetermination_IncompatibleNewExposure.class);
      }
      
      public CoverageDetermination_InvalidCoverageForCause getCoverageDetermination_InvalidCoverageForCause() {
        return getOrCreateProperty("CoverageDetermination_InvalidCoverageForCause", "CoverageDetermination_InvalidCoverageForCause", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForCause.class);
      }
      
      public CoverageDetermination_InvalidCoverageForFault getCoverageDetermination_InvalidCoverageForFault() {
        return getOrCreateProperty("CoverageDetermination_InvalidCoverageForFault", "CoverageDetermination_InvalidCoverageForFault", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForFault.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageDetermination_IncompatibleNewExposure extends ClickableActionElement {
        public CoverageDetermination_IncompatibleNewExposure(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IncompatibleNewExposure click() {
          return clickThis(pcftest.IncompatibleNewExposure.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageDetermination_InvalidCoverageForCause extends ClickableActionElement {
        public CoverageDetermination_InvalidCoverageForCause(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public InvalidCoverageForCause click() {
          return clickThis(pcftest.InvalidCoverageForCause.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageDetermination_InvalidCoverageForFault extends ClickableActionElement {
        public CoverageDetermination_InvalidCoverageForFault(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public InvalidCoverageForFault click() {
          return clickThis(pcftest.InvalidCoverageForFault.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_Holidays extends ClickableActionElement {
      public BusinessSettings_Holidays(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_ICD extends ClickableActionElement {
      public BusinessSettings_ICD(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ICD click() {
        return clickThis(pcftest.ICD.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_KeyMetrics extends ClickableActionElement {
      public BusinessSettings_KeyMetrics(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public KeyMetrics click() {
        return clickThis(pcftest.KeyMetrics.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_ReinsuranceThresholds extends ClickableActionElement {
      public BusinessSettings_ReinsuranceThresholds(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReinsuranceThresholds click() {
        return clickThis(pcftest.ReinsuranceThresholds.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_WCParms extends ClickableActionElement {
      public BusinessSettings_WCParms(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public WCParms_DenialPeriods getWCParms_DenialPeriods() {
        return getOrCreateProperty("WCParms_DenialPeriods", "WCParms_DenialPeriods", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_DenialPeriods.class);
      }
      
      public WCParms_WCBenefitParameterSet getWCParms_WCBenefitParameterSet() {
        return getOrCreateProperty("WCParms_WCBenefitParameterSet", "WCParms_WCBenefitParameterSet", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_WCBenefitParameterSet.class);
      }
      
      public WCParms_WCPDBenefits getWCParms_WCPDBenefits() {
        return getOrCreateProperty("WCParms_WCPDBenefits", "WCParms_WCPDBenefits", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_WCPDBenefits.class);
      }
      
      public WCParms_WCPDWeeksAndLimits getWCParms_WCPDWeeksAndLimits() {
        return getOrCreateProperty("WCParms_WCPDWeeksAndLimits", "WCParms_WCPDWeeksAndLimits", null, pcftest.BusinessSettings.MenuLinks.BusinessSettings_WCParms.WCParms_WCPDWeeksAndLimits.class);
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
    @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessSettings_WorkloadClassifications extends ClickableActionElement {
      public BusinessSettings_WorkloadClassifications(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkloadClassifications click() {
        return clickThis(pcftest.WorkloadClassifications.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/BusinessSettings.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}