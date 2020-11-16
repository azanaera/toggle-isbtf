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
import pcftest.Admin.Admin_UpLink;
import pcftest.Admin.MenuLinks;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_ActivityPatterns;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_ActivityRules;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_CCRulesExportImportStatus;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_ExposureRules;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_ReserveRules;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessWeek;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_Catastrophes;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination.CoverageDetermination_IncompatibleNewExposure;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForCause;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForFault;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_Holidays;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_ICD;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_KeyMetrics;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_ReinsuranceThresholds;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_DenialPeriods;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_WCBenefitParameterSet;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_WCPDBenefits;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_WCPDWeeksAndLimits;
import pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WorkloadClassifications;
import pcftest.Admin.MenuLinks.Admin_Monitoring;
import pcftest.Admin.MenuLinks.Admin_Monitoring.Monitoring_MessagingDestinationControlList;
import pcftest.Admin.MenuLinks.Admin_Monitoring.Monitoring_WorkflowSearch;
import pcftest.Admin.MenuLinks.Admin_Monitoring.Monitoring_WorkflowStats;
import pcftest.Admin.MenuLinks.Admin_SpecialHandling;
import pcftest.Admin.MenuLinks.Admin_SpecialHandling.SpecialHandling_AccountAdmin;
import pcftest.Admin.MenuLinks.Admin_SpecialHandling.SpecialHandling_CustomerServiceTierAdmin;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_AdminGroupSearchPage;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_AdminUserSearchPage;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_Attributes;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_AuthorityLimitProfiles;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_Regions;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_Roles;
import pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_SecurityZones;
import pcftest.Admin.MenuLinks.Admin_Utilities;
import pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_DataChangePage;
import pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_ExportData;
import pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_ImportWizard;
import pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_InboundFileSearch;
import pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_OutboundFileSearch;
import pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_Properties;
import pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_ScriptParametersPage;
import pcftest.Admin._Paging;
import pcftest.Admin.__crumb__;
import pcftest.Admin._msgs;
import pcftest.Admin.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Admin extends PCFLocation {
  public final static String CHECKSUM = "4e609bbf29e13dcf716f14df79643ae7";
  
  public Admin(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Admin"));
  }
  
  public AdminMenuActions getAdminMenuActions() {
    return getOrCreateProperty("AdminMenuActions", "AdminMenuActions", null, pcftest.AdminMenuActions.class);
  }
  
  public AdminMenuTree getAdminMenuTree() {
    return getOrCreateProperty("AdminMenuTree", "AdminMenuTree", null, pcftest.AdminMenuTree.class);
  }
  
  public Admin_UpLink getAdmin_UpLink() {
    return getOrCreateProperty("Admin_UpLink", "Admin_UpLink", null, pcftest.Admin.Admin_UpLink.class);
  }
  
  public BusinessSettings getBusinessSettings() {
    return getOrCreateProperty("BusinessSettings", pcftest.BusinessSettings.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Admin.MenuLinks.class, null);
  }
  
  public Monitoring getMonitoring() {
    return getOrCreateProperty("Monitoring", pcftest.Monitoring.class);
  }
  
  public SpecialHandling getSpecialHandling() {
    return getOrCreateProperty("SpecialHandling", pcftest.SpecialHandling.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public UsersAndSecurity getUsersAndSecurity() {
    return getOrCreateProperty("UsersAndSecurity", pcftest.UsersAndSecurity.class);
  }
  
  public Utilities getUtilities() {
    return getOrCreateProperty("Utilities", pcftest.Utilities.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Admin._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Admin.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Admin._msgs.class);
  }
  
  public AdminWelcome get_parent() {
    return getOrCreateProperty("_parent", pcftest.AdminWelcome.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Admin.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Admin_UpLink extends ClickableActionElement {
    public Admin_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Admin_BusinessSettings getAdmin_BusinessSettings() {
      return getOrCreateProperty("Admin_BusinessSettings", "Admin_BusinessSettings", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.class);
    }
    
    public Admin_Monitoring getAdmin_Monitoring() {
      return getOrCreateProperty("Admin_Monitoring", "Admin_Monitoring", null, pcftest.Admin.MenuLinks.Admin_Monitoring.class);
    }
    
    public Admin_SpecialHandling getAdmin_SpecialHandling() {
      return getOrCreateProperty("Admin_SpecialHandling", "Admin_SpecialHandling", null, pcftest.Admin.MenuLinks.Admin_SpecialHandling.class);
    }
    
    public Admin_UsersAndSecurity getAdmin_UsersAndSecurity() {
      return getOrCreateProperty("Admin_UsersAndSecurity", "Admin_UsersAndSecurity", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.class);
    }
    
    public Admin_Utilities getAdmin_Utilities() {
      return getOrCreateProperty("Admin_Utilities", "Admin_Utilities", null, pcftest.Admin.MenuLinks.Admin_Utilities.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Admin_BusinessSettings extends ClickableActionElement {
      public Admin_BusinessSettings(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public BusinessSettings_ActivityPatterns getBusinessSettings_ActivityPatterns() {
        return getOrCreateProperty("BusinessSettings_ActivityPatterns", "BusinessSettings_ActivityPatterns", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_ActivityPatterns.class);
      }
      
      public BusinessSettings_BusinessRules getBusinessSettings_BusinessRules() {
        return getOrCreateProperty("BusinessSettings_BusinessRules", "BusinessSettings_BusinessRules", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.class);
      }
      
      public BusinessSettings_BusinessWeek getBusinessSettings_BusinessWeek() {
        return getOrCreateProperty("BusinessSettings_BusinessWeek", "BusinessSettings_BusinessWeek", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessWeek.class);
      }
      
      public BusinessSettings_Catastrophes getBusinessSettings_Catastrophes() {
        return getOrCreateProperty("BusinessSettings_Catastrophes", "BusinessSettings_Catastrophes", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_Catastrophes.class);
      }
      
      public BusinessSettings_CoverageDetermination getBusinessSettings_CoverageDetermination() {
        return getOrCreateProperty("BusinessSettings_CoverageDetermination", "BusinessSettings_CoverageDetermination", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination.class);
      }
      
      public BusinessSettings_Holidays getBusinessSettings_Holidays() {
        return getOrCreateProperty("BusinessSettings_Holidays", "BusinessSettings_Holidays", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_Holidays.class);
      }
      
      public BusinessSettings_ICD getBusinessSettings_ICD() {
        return getOrCreateProperty("BusinessSettings_ICD", "BusinessSettings_ICD", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_ICD.class);
      }
      
      public BusinessSettings_KeyMetrics getBusinessSettings_KeyMetrics() {
        return getOrCreateProperty("BusinessSettings_KeyMetrics", "BusinessSettings_KeyMetrics", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_KeyMetrics.class);
      }
      
      public BusinessSettings_ReinsuranceThresholds getBusinessSettings_ReinsuranceThresholds() {
        return getOrCreateProperty("BusinessSettings_ReinsuranceThresholds", "BusinessSettings_ReinsuranceThresholds", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_ReinsuranceThresholds.class);
      }
      
      public BusinessSettings_WCParms getBusinessSettings_WCParms() {
        return getOrCreateProperty("BusinessSettings_WCParms", "BusinessSettings_WCParms", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.class);
      }
      
      public BusinessSettings_WorkloadClassifications getBusinessSettings_WorkloadClassifications() {
        return getOrCreateProperty("BusinessSettings_WorkloadClassifications", "BusinessSettings_WorkloadClassifications", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WorkloadClassifications.class);
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
          return getOrCreateProperty("BusinessRules_ActivityRules", "BusinessRules_ActivityRules", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_ActivityRules.class);
        }
        
        public BusinessRules_CCRulesExportImportStatus getBusinessRules_CCRulesExportImportStatus() {
          return getOrCreateProperty("BusinessRules_CCRulesExportImportStatus", "BusinessRules_CCRulesExportImportStatus", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_CCRulesExportImportStatus.class);
        }
        
        public BusinessRules_ExposureRules getBusinessRules_ExposureRules() {
          return getOrCreateProperty("BusinessRules_ExposureRules", "BusinessRules_ExposureRules", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_ExposureRules.class);
        }
        
        public BusinessRules_ReserveRules getBusinessRules_ReserveRules() {
          return getOrCreateProperty("BusinessRules_ReserveRules", "BusinessRules_ReserveRules", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_BusinessRules.BusinessRules_ReserveRules.class);
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
          return getOrCreateProperty("CoverageDetermination_IncompatibleNewExposure", "CoverageDetermination_IncompatibleNewExposure", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination.CoverageDetermination_IncompatibleNewExposure.class);
        }
        
        public CoverageDetermination_InvalidCoverageForCause getCoverageDetermination_InvalidCoverageForCause() {
          return getOrCreateProperty("CoverageDetermination_InvalidCoverageForCause", "CoverageDetermination_InvalidCoverageForCause", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForCause.class);
        }
        
        public CoverageDetermination_InvalidCoverageForFault getCoverageDetermination_InvalidCoverageForFault() {
          return getOrCreateProperty("CoverageDetermination_InvalidCoverageForFault", "CoverageDetermination_InvalidCoverageForFault", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_CoverageDetermination.CoverageDetermination_InvalidCoverageForFault.class);
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
          return getOrCreateProperty("WCParms_DenialPeriods", "WCParms_DenialPeriods", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_DenialPeriods.class);
        }
        
        public WCParms_WCBenefitParameterSet getWCParms_WCBenefitParameterSet() {
          return getOrCreateProperty("WCParms_WCBenefitParameterSet", "WCParms_WCBenefitParameterSet", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_WCBenefitParameterSet.class);
        }
        
        public WCParms_WCPDBenefits getWCParms_WCPDBenefits() {
          return getOrCreateProperty("WCParms_WCPDBenefits", "WCParms_WCPDBenefits", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_WCPDBenefits.class);
        }
        
        public WCParms_WCPDWeeksAndLimits getWCParms_WCPDWeeksAndLimits() {
          return getOrCreateProperty("WCParms_WCPDWeeksAndLimits", "WCParms_WCPDWeeksAndLimits", null, pcftest.Admin.MenuLinks.Admin_BusinessSettings.BusinessSettings_WCParms.WCParms_WCPDWeeksAndLimits.class);
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
    @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Admin_Monitoring extends ClickableActionElement {
      public Admin_Monitoring(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public Monitoring_MessagingDestinationControlList getMonitoring_MessagingDestinationControlList() {
        return getOrCreateProperty("Monitoring_MessagingDestinationControlList", "Monitoring_MessagingDestinationControlList", null, pcftest.Admin.MenuLinks.Admin_Monitoring.Monitoring_MessagingDestinationControlList.class);
      }
      
      public Monitoring_WorkflowSearch getMonitoring_WorkflowSearch() {
        return getOrCreateProperty("Monitoring_WorkflowSearch", "Monitoring_WorkflowSearch", null, pcftest.Admin.MenuLinks.Admin_Monitoring.Monitoring_WorkflowSearch.class);
      }
      
      public Monitoring_WorkflowStats getMonitoring_WorkflowStats() {
        return getOrCreateProperty("Monitoring_WorkflowStats", "Monitoring_WorkflowStats", null, pcftest.Admin.MenuLinks.Admin_Monitoring.Monitoring_WorkflowStats.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Monitoring_MessagingDestinationControlList extends ClickableActionElement {
        public Monitoring_MessagingDestinationControlList(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public MessagingDestinationControlList click() {
          return clickThis(pcftest.MessagingDestinationControlList.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Monitoring_WorkflowSearch extends ClickableActionElement {
        public Monitoring_WorkflowSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public WorkflowSearch click() {
          return clickThis(pcftest.WorkflowSearch.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Monitoring_WorkflowStats extends ClickableActionElement {
        public Monitoring_WorkflowStats(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public WorkflowStats click() {
          return clickThis(pcftest.WorkflowStats.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Admin_SpecialHandling extends ClickableActionElement {
      public Admin_SpecialHandling(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public SpecialHandling_AccountAdmin getSpecialHandling_AccountAdmin() {
        return getOrCreateProperty("SpecialHandling_AccountAdmin", "SpecialHandling_AccountAdmin", null, pcftest.Admin.MenuLinks.Admin_SpecialHandling.SpecialHandling_AccountAdmin.class);
      }
      
      public SpecialHandling_CustomerServiceTierAdmin getSpecialHandling_CustomerServiceTierAdmin() {
        return getOrCreateProperty("SpecialHandling_CustomerServiceTierAdmin", "SpecialHandling_CustomerServiceTierAdmin", null, pcftest.Admin.MenuLinks.Admin_SpecialHandling.SpecialHandling_CustomerServiceTierAdmin.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialHandling_AccountAdmin extends ClickableActionElement {
        public SpecialHandling_AccountAdmin(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AccountAdmin click() {
          return clickThis(pcftest.AccountAdmin.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialHandling_CustomerServiceTierAdmin extends ClickableActionElement {
        public SpecialHandling_CustomerServiceTierAdmin(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CustomerServiceTierAdmin click() {
          return clickThis(pcftest.CustomerServiceTierAdmin.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Admin_UsersAndSecurity extends ClickableActionElement {
      public Admin_UsersAndSecurity(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public UsersAndSecurity_AdminGroupSearchPage getUsersAndSecurity_AdminGroupSearchPage() {
        return getOrCreateProperty("UsersAndSecurity_AdminGroupSearchPage", "UsersAndSecurity_AdminGroupSearchPage", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_AdminGroupSearchPage.class);
      }
      
      public UsersAndSecurity_AdminUserSearchPage getUsersAndSecurity_AdminUserSearchPage() {
        return getOrCreateProperty("UsersAndSecurity_AdminUserSearchPage", "UsersAndSecurity_AdminUserSearchPage", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_AdminUserSearchPage.class);
      }
      
      public UsersAndSecurity_Attributes getUsersAndSecurity_Attributes() {
        return getOrCreateProperty("UsersAndSecurity_Attributes", "UsersAndSecurity_Attributes", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_Attributes.class);
      }
      
      public UsersAndSecurity_AuthorityLimitProfiles getUsersAndSecurity_AuthorityLimitProfiles() {
        return getOrCreateProperty("UsersAndSecurity_AuthorityLimitProfiles", "UsersAndSecurity_AuthorityLimitProfiles", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_AuthorityLimitProfiles.class);
      }
      
      public UsersAndSecurity_Regions getUsersAndSecurity_Regions() {
        return getOrCreateProperty("UsersAndSecurity_Regions", "UsersAndSecurity_Regions", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_Regions.class);
      }
      
      public UsersAndSecurity_Roles getUsersAndSecurity_Roles() {
        return getOrCreateProperty("UsersAndSecurity_Roles", "UsersAndSecurity_Roles", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_Roles.class);
      }
      
      public UsersAndSecurity_SecurityZones getUsersAndSecurity_SecurityZones() {
        return getOrCreateProperty("UsersAndSecurity_SecurityZones", "UsersAndSecurity_SecurityZones", null, pcftest.Admin.MenuLinks.Admin_UsersAndSecurity.UsersAndSecurity_SecurityZones.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UsersAndSecurity_AdminGroupSearchPage extends ClickableActionElement {
        public UsersAndSecurity_AdminGroupSearchPage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AdminGroupSearchPage click() {
          return clickThis(pcftest.AdminGroupSearchPage.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UsersAndSecurity_AdminUserSearchPage extends ClickableActionElement {
        public UsersAndSecurity_AdminUserSearchPage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AdminUserSearchPage click() {
          return clickThis(pcftest.AdminUserSearchPage.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UsersAndSecurity_Attributes extends ClickableActionElement {
        public UsersAndSecurity_Attributes(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Attributes click() {
          return clickThis(pcftest.Attributes.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UsersAndSecurity_AuthorityLimitProfiles extends ClickableActionElement {
        public UsersAndSecurity_AuthorityLimitProfiles(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AuthorityLimitProfiles click() {
          return clickThis(pcftest.AuthorityLimitProfiles.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UsersAndSecurity_Regions extends ClickableActionElement {
        public UsersAndSecurity_Regions(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UsersAndSecurity_Roles extends ClickableActionElement {
        public UsersAndSecurity_Roles(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Roles click() {
          return clickThis(pcftest.Roles.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UsersAndSecurity_SecurityZones extends ClickableActionElement {
        public UsersAndSecurity_SecurityZones(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SecurityZones click() {
          return clickThis(pcftest.SecurityZones.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Admin_Utilities extends ClickableActionElement {
      public Admin_Utilities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public Utilities_DataChangePage getUtilities_DataChangePage() {
        return getOrCreateProperty("Utilities_DataChangePage", "Utilities_DataChangePage", null, pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_DataChangePage.class);
      }
      
      public Utilities_ExportData getUtilities_ExportData() {
        return getOrCreateProperty("Utilities_ExportData", "Utilities_ExportData", null, pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_ExportData.class);
      }
      
      public Utilities_ImportWizard getUtilities_ImportWizard() {
        return getOrCreateProperty("Utilities_ImportWizard", "Utilities_ImportWizard", null, pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_ImportWizard.class);
      }
      
      public Utilities_InboundFileSearch getUtilities_InboundFileSearch() {
        return getOrCreateProperty("Utilities_InboundFileSearch", "Utilities_InboundFileSearch", null, pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_InboundFileSearch.class);
      }
      
      public Utilities_OutboundFileSearch getUtilities_OutboundFileSearch() {
        return getOrCreateProperty("Utilities_OutboundFileSearch", "Utilities_OutboundFileSearch", null, pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_OutboundFileSearch.class);
      }
      
      public Utilities_Properties getUtilities_Properties() {
        return getOrCreateProperty("Utilities_Properties", "Utilities_Properties", null, pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_Properties.class);
      }
      
      public Utilities_ScriptParametersPage getUtilities_ScriptParametersPage() {
        return getOrCreateProperty("Utilities_ScriptParametersPage", "Utilities_ScriptParametersPage", null, pcftest.Admin.MenuLinks.Admin_Utilities.Utilities_ScriptParametersPage.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Utilities_DataChangePage extends ClickableActionElement {
        public Utilities_DataChangePage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DataChangePage click() {
          return clickThis(pcftest.DataChangePage.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Utilities_ExportData extends ClickableActionElement {
        public Utilities_ExportData(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ExportData click() {
          return clickThis(pcftest.ExportData.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Utilities_ImportWizard extends ClickableActionElement {
        public Utilities_ImportWizard(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ImportWizard click() {
          return clickThis(pcftest.ImportWizard.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Utilities_InboundFileSearch extends ClickableActionElement {
        public Utilities_InboundFileSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public InboundFileSearch click() {
          return clickThis(pcftest.InboundFileSearch.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Utilities_OutboundFileSearch extends ClickableActionElement {
        public Utilities_OutboundFileSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OutboundFileSearch click() {
          return clickThis(pcftest.OutboundFileSearch.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Utilities_Properties extends ClickableActionElement {
        public Utilities_Properties(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Properties click() {
          return clickThis(pcftest.Properties.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Utilities_ScriptParametersPage extends ClickableActionElement {
        public Utilities_ScriptParametersPage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ScriptParametersPage click() {
          return clickThis(pcftest.ScriptParametersPage.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Admin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}