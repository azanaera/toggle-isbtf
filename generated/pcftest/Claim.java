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
import pcftest.Claim.Claim_UpLink;
import pcftest.Claim.MenuLinks;
import pcftest.Claim.MenuLinks.Claim_ClaimCalendarGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimCalendarGroup.ClaimCalendarGroup_ClaimCalendar;
import pcftest.Claim.MenuLinks.Claim_ClaimCalendarGroup.ClaimCalendarGroup_SupervisorClaimCalendar;
import pcftest.Claim.MenuLinks.Claim_ClaimDocuments;
import pcftest.Claim.MenuLinks.Claim_ClaimExposures;
import pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup.ClaimFinancialsGroup_ClaimFinancialsChecks;
import pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup.ClaimFinancialsGroup_ClaimFinancialsSummary;
import pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup.ClaimFinancialsGroup_ClaimFinancialsTransactions;
import pcftest.Claim.MenuLinks.Claim_ClaimHistory;
import pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.ClaimLossDetailsGroup_ClaimAssociations;
import pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.ClaimLossDetailsGroup_ClaimLossDetails;
import pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.ClaimLossDetailsGroup_SIDetails;
import pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.entry.ClaimLossDetailsGroup_LossDetailsExposureDetail;
import pcftest.Claim.MenuLinks.Claim_ClaimMatters;
import pcftest.Claim.MenuLinks.Claim_ClaimNotes;
import pcftest.Claim.MenuLinks.Claim_ClaimPartiesGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimPartiesGroup.ClaimPartiesGroup_ClaimContacts;
import pcftest.Claim.MenuLinks.Claim_ClaimPartiesGroup.ClaimPartiesGroup_ClaimUsers;
import pcftest.Claim.MenuLinks.Claim_ClaimPlanOfActionGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimPlanOfActionGroup.ClaimPlanOfActionGroup_ClaimEvaluations;
import pcftest.Claim.MenuLinks.Claim_ClaimPlanOfActionGroup.ClaimPlanOfActionGroup_ClaimNegotiations;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyAggregateLimits;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyEndorsements;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyGeneral;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyLocations;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyStatCodes;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyTrips;
import pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyVehicles;
import pcftest.Claim.MenuLinks.Claim_ClaimServiceRequests;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotDocuments;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotExposures;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotExtraFields;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotLossDetails;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotNotes;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved;
import pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotPolicy;
import pcftest.Claim.MenuLinks.Claim_ClaimSubrogationGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimSubrogationGroup.ClaimSubrogationGroup_SubrogationGeneral;
import pcftest.Claim.MenuLinks.Claim_ClaimSubrogationGroup.ClaimSubrogationGroup_SubrogationParties;
import pcftest.Claim.MenuLinks.Claim_ClaimSummaryGroup;
import pcftest.Claim.MenuLinks.Claim_ClaimSummaryGroup.ClaimSummaryGroup_ClaimStatus;
import pcftest.Claim.MenuLinks.Claim_ClaimSummaryGroup.ClaimSummaryGroup_ClaimSummary;
import pcftest.Claim.MenuLinks.Claim_ClaimWorkplan;
import pcftest.Claim.MenuLinks.Claim_ReinsuranceSummary;
import pcftest.Claim.MenuLinks.entry.Claim_TopLevelExposureDetail;
import pcftest.Claim._Paging;
import pcftest.Claim.__crumb__;
import pcftest.Claim._msgs;
import pcftest.Claim.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Claim extends PCFLocation {
  public final static String CHECKSUM = "aa581ac480d9100f277391d0435656bc";
  
  public Claim(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Claim"));
  }
  
  public ClaimCalendarGroup getClaimCalendarGroup() {
    return getOrCreateProperty("ClaimCalendarGroup", pcftest.ClaimCalendarGroup.class);
  }
  
  public ClaimDocuments getClaimDocuments() {
    return getOrCreateProperty("ClaimDocuments", pcftest.ClaimDocuments.class);
  }
  
  public ClaimExposures getClaimExposures() {
    return getOrCreateProperty("ClaimExposures", pcftest.ClaimExposures.class);
  }
  
  public ClaimFinancialsGroup getClaimFinancialsGroup() {
    return getOrCreateProperty("ClaimFinancialsGroup", pcftest.ClaimFinancialsGroup.class);
  }
  
  public ClaimHistory getClaimHistory() {
    return getOrCreateProperty("ClaimHistory", pcftest.ClaimHistory.class);
  }
  
  public ClaimInfoBar getClaimInfoBar() {
    return getOrCreateProperty("ClaimInfoBar", "ClaimInfoBar", null, pcftest.ClaimInfoBar.class);
  }
  
  public ClaimLossDetailsGroup getClaimLossDetailsGroup() {
    return getOrCreateProperty("ClaimLossDetailsGroup", pcftest.ClaimLossDetailsGroup.class);
  }
  
  public ClaimMatters getClaimMatters() {
    return getOrCreateProperty("ClaimMatters", pcftest.ClaimMatters.class);
  }
  
  public ClaimMenuActions getClaimMenuActions() {
    return getOrCreateProperty("ClaimMenuActions", "ClaimMenuActions", null, pcftest.ClaimMenuActions.class);
  }
  
  public ClaimNotes getClaimNotes() {
    return getOrCreateProperty("ClaimNotes", pcftest.ClaimNotes.class);
  }
  
  public ClaimPartiesGroup getClaimPartiesGroup() {
    return getOrCreateProperty("ClaimPartiesGroup", pcftest.ClaimPartiesGroup.class);
  }
  
  public ClaimPlanOfActionGroup getClaimPlanOfActionGroup() {
    return getOrCreateProperty("ClaimPlanOfActionGroup", pcftest.ClaimPlanOfActionGroup.class);
  }
  
  public ClaimPolicyGroup getClaimPolicyGroup() {
    return getOrCreateProperty("ClaimPolicyGroup", pcftest.ClaimPolicyGroup.class);
  }
  
  public ClaimServiceRequests getClaimServiceRequests() {
    return getOrCreateProperty("ClaimServiceRequests", pcftest.ClaimServiceRequests.class);
  }
  
  public ClaimSnapshotGroup getClaimSnapshotGroup() {
    return getOrCreateProperty("ClaimSnapshotGroup", pcftest.ClaimSnapshotGroup.class);
  }
  
  public ClaimSubrogationGroup getClaimSubrogationGroup() {
    return getOrCreateProperty("ClaimSubrogationGroup", pcftest.ClaimSubrogationGroup.class);
  }
  
  public ClaimSummaryGroup getClaimSummaryGroup() {
    return getOrCreateProperty("ClaimSummaryGroup", pcftest.ClaimSummaryGroup.class);
  }
  
  public ClaimWorkplan getClaimWorkplan() {
    return getOrCreateProperty("ClaimWorkplan", pcftest.ClaimWorkplan.class);
  }
  
  public Claim_UpLink getClaim_UpLink() {
    return getOrCreateProperty("Claim_UpLink", "Claim_UpLink", null, pcftest.Claim.Claim_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Claim.MenuLinks.class, null);
  }
  
  public ReinsuranceSummary getReinsuranceSummary() {
    return getOrCreateProperty("ReinsuranceSummary", pcftest.ReinsuranceSummary.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<pcftest.Claim.entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.Claim.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Claim._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Claim.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Claim._msgs.class);
  }
  
  public ClaimForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimForward.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Claim.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_UpLink extends ClickableActionElement {
    public Claim_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Claim_ClaimCalendarGroup getClaim_ClaimCalendarGroup() {
      return getOrCreateProperty("Claim_ClaimCalendarGroup", "Claim_ClaimCalendarGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimCalendarGroup.class);
    }
    
    public Claim_ClaimDocuments getClaim_ClaimDocuments() {
      return getOrCreateProperty("Claim_ClaimDocuments", "Claim_ClaimDocuments", null, pcftest.Claim.MenuLinks.Claim_ClaimDocuments.class);
    }
    
    public Claim_ClaimExposures getClaim_ClaimExposures() {
      return getOrCreateProperty("Claim_ClaimExposures", "Claim_ClaimExposures", null, pcftest.Claim.MenuLinks.Claim_ClaimExposures.class);
    }
    
    public Claim_ClaimFinancialsGroup getClaim_ClaimFinancialsGroup() {
      return getOrCreateProperty("Claim_ClaimFinancialsGroup", "Claim_ClaimFinancialsGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup.class);
    }
    
    public Claim_ClaimHistory getClaim_ClaimHistory() {
      return getOrCreateProperty("Claim_ClaimHistory", "Claim_ClaimHistory", null, pcftest.Claim.MenuLinks.Claim_ClaimHistory.class);
    }
    
    public Claim_ClaimLossDetailsGroup getClaim_ClaimLossDetailsGroup() {
      return getOrCreateProperty("Claim_ClaimLossDetailsGroup", "Claim_ClaimLossDetailsGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.class);
    }
    
    public Claim_ClaimMatters getClaim_ClaimMatters() {
      return getOrCreateProperty("Claim_ClaimMatters", "Claim_ClaimMatters", null, pcftest.Claim.MenuLinks.Claim_ClaimMatters.class);
    }
    
    public Claim_ClaimNotes getClaim_ClaimNotes() {
      return getOrCreateProperty("Claim_ClaimNotes", "Claim_ClaimNotes", null, pcftest.Claim.MenuLinks.Claim_ClaimNotes.class);
    }
    
    public Claim_ClaimPartiesGroup getClaim_ClaimPartiesGroup() {
      return getOrCreateProperty("Claim_ClaimPartiesGroup", "Claim_ClaimPartiesGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimPartiesGroup.class);
    }
    
    public Claim_ClaimPlanOfActionGroup getClaim_ClaimPlanOfActionGroup() {
      return getOrCreateProperty("Claim_ClaimPlanOfActionGroup", "Claim_ClaimPlanOfActionGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimPlanOfActionGroup.class);
    }
    
    public Claim_ClaimPolicyGroup getClaim_ClaimPolicyGroup() {
      return getOrCreateProperty("Claim_ClaimPolicyGroup", "Claim_ClaimPolicyGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.class);
    }
    
    public Claim_ClaimServiceRequests getClaim_ClaimServiceRequests() {
      return getOrCreateProperty("Claim_ClaimServiceRequests", "Claim_ClaimServiceRequests", null, pcftest.Claim.MenuLinks.Claim_ClaimServiceRequests.class);
    }
    
    public Claim_ClaimSnapshotGroup getClaim_ClaimSnapshotGroup() {
      return getOrCreateProperty("Claim_ClaimSnapshotGroup", "Claim_ClaimSnapshotGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.class);
    }
    
    public Claim_ClaimSubrogationGroup getClaim_ClaimSubrogationGroup() {
      return getOrCreateProperty("Claim_ClaimSubrogationGroup", "Claim_ClaimSubrogationGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimSubrogationGroup.class);
    }
    
    public Claim_ClaimSummaryGroup getClaim_ClaimSummaryGroup() {
      return getOrCreateProperty("Claim_ClaimSummaryGroup", "Claim_ClaimSummaryGroup", null, pcftest.Claim.MenuLinks.Claim_ClaimSummaryGroup.class);
    }
    
    public Claim_ClaimWorkplan getClaim_ClaimWorkplan() {
      return getOrCreateProperty("Claim_ClaimWorkplan", "Claim_ClaimWorkplan", null, pcftest.Claim.MenuLinks.Claim_ClaimWorkplan.class);
    }
    
    public Claim_ReinsuranceSummary getClaim_ReinsuranceSummary() {
      return getOrCreateProperty("Claim_ReinsuranceSummary", "Claim_ReinsuranceSummary", null, pcftest.Claim.MenuLinks.Claim_ReinsuranceSummary.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.Claim.MenuLinks.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.Claim.MenuLinks.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimCalendarGroup extends ClickableActionElement {
      public Claim_ClaimCalendarGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimCalendarGroup_ClaimCalendar getClaimCalendarGroup_ClaimCalendar() {
        return getOrCreateProperty("ClaimCalendarGroup_ClaimCalendar", "ClaimCalendarGroup_ClaimCalendar", null, pcftest.Claim.MenuLinks.Claim_ClaimCalendarGroup.ClaimCalendarGroup_ClaimCalendar.class);
      }
      
      public ClaimCalendarGroup_SupervisorClaimCalendar getClaimCalendarGroup_SupervisorClaimCalendar() {
        return getOrCreateProperty("ClaimCalendarGroup_SupervisorClaimCalendar", "ClaimCalendarGroup_SupervisorClaimCalendar", null, pcftest.Claim.MenuLinks.Claim_ClaimCalendarGroup.ClaimCalendarGroup_SupervisorClaimCalendar.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimCalendarGroup_ClaimCalendar extends ClickableActionElement {
        public ClaimCalendarGroup_ClaimCalendar(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimCalendar click() {
          return clickThis(pcftest.ClaimCalendar.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimCalendarGroup_SupervisorClaimCalendar extends ClickableActionElement {
        public ClaimCalendarGroup_SupervisorClaimCalendar(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SupervisorClaimCalendar click() {
          return clickThis(pcftest.SupervisorClaimCalendar.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimDocuments extends ClickableActionElement {
      public Claim_ClaimDocuments(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimDocuments click() {
        return clickThis(pcftest.ClaimDocuments.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimExposures extends ClickableActionElement {
      public Claim_ClaimExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimExposures click() {
        return clickThis(pcftest.ClaimExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimFinancialsGroup extends ClickableActionElement {
      public Claim_ClaimFinancialsGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimFinancialsGroup_ClaimFinancialsChecks getClaimFinancialsGroup_ClaimFinancialsChecks() {
        return getOrCreateProperty("ClaimFinancialsGroup_ClaimFinancialsChecks", "ClaimFinancialsGroup_ClaimFinancialsChecks", null, pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup.ClaimFinancialsGroup_ClaimFinancialsChecks.class);
      }
      
      public ClaimFinancialsGroup_ClaimFinancialsSummary getClaimFinancialsGroup_ClaimFinancialsSummary() {
        return getOrCreateProperty("ClaimFinancialsGroup_ClaimFinancialsSummary", "ClaimFinancialsGroup_ClaimFinancialsSummary", null, pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup.ClaimFinancialsGroup_ClaimFinancialsSummary.class);
      }
      
      public ClaimFinancialsGroup_ClaimFinancialsTransactions getClaimFinancialsGroup_ClaimFinancialsTransactions() {
        return getOrCreateProperty("ClaimFinancialsGroup_ClaimFinancialsTransactions", "ClaimFinancialsGroup_ClaimFinancialsTransactions", null, pcftest.Claim.MenuLinks.Claim_ClaimFinancialsGroup.ClaimFinancialsGroup_ClaimFinancialsTransactions.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimFinancialsGroup_ClaimFinancialsChecks extends ClickableActionElement {
        public ClaimFinancialsGroup_ClaimFinancialsChecks(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimFinancialsChecks click() {
          return clickThis(pcftest.ClaimFinancialsChecks.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimFinancialsGroup_ClaimFinancialsSummary extends ClickableActionElement {
        public ClaimFinancialsGroup_ClaimFinancialsSummary(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimFinancialsSummary click() {
          return clickThis(pcftest.ClaimFinancialsSummary.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/ClaimFinancialsGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimFinancialsGroup_ClaimFinancialsTransactions extends ClickableActionElement {
        public ClaimFinancialsGroup_ClaimFinancialsTransactions(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimFinancialsTransactions click() {
          return clickThis(pcftest.ClaimFinancialsTransactions.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimHistory extends ClickableActionElement {
      public Claim_ClaimHistory(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimHistory click() {
        return clickThis(pcftest.ClaimHistory.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimLossDetailsGroup extends ClickableActionElement {
      public Claim_ClaimLossDetailsGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimLossDetailsGroup_ClaimAssociations getClaimLossDetailsGroup_ClaimAssociations() {
        return getOrCreateProperty("ClaimLossDetailsGroup_ClaimAssociations", "ClaimLossDetailsGroup_ClaimAssociations", null, pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.ClaimLossDetailsGroup_ClaimAssociations.class);
      }
      
      public ClaimLossDetailsGroup_ClaimLossDetails getClaimLossDetailsGroup_ClaimLossDetails() {
        return getOrCreateProperty("ClaimLossDetailsGroup_ClaimLossDetails", "ClaimLossDetailsGroup_ClaimLossDetails", null, pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.ClaimLossDetailsGroup_ClaimLossDetails.class);
      }
      
      public ClaimLossDetailsGroup_SIDetails getClaimLossDetailsGroup_SIDetails() {
        return getOrCreateProperty("ClaimLossDetailsGroup_SIDetails", "ClaimLossDetailsGroup_SIDetails", null, pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.ClaimLossDetailsGroup_SIDetails.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
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
      @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimLossDetailsGroup_LossDetailsExposureDetail getClaimLossDetailsGroup_LossDetailsExposureDetail() {
          return getOrCreateProperty("ClaimLossDetailsGroup_LossDetailsExposureDetail", "ClaimLossDetailsGroup_LossDetailsExposureDetail", null, pcftest.Claim.MenuLinks.Claim_ClaimLossDetailsGroup.entry.ClaimLossDetailsGroup_LossDetailsExposureDetail.class);
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
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimMatters extends ClickableActionElement {
      public Claim_ClaimMatters(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimMatters click() {
        return clickThis(pcftest.ClaimMatters.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimNotes extends ClickableActionElement {
      public Claim_ClaimNotes(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimNotes click() {
        return clickThis(pcftest.ClaimNotes.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimPartiesGroup extends ClickableActionElement {
      public Claim_ClaimPartiesGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimPartiesGroup_ClaimContacts getClaimPartiesGroup_ClaimContacts() {
        return getOrCreateProperty("ClaimPartiesGroup_ClaimContacts", "ClaimPartiesGroup_ClaimContacts", null, pcftest.Claim.MenuLinks.Claim_ClaimPartiesGroup.ClaimPartiesGroup_ClaimContacts.class);
      }
      
      public ClaimPartiesGroup_ClaimUsers getClaimPartiesGroup_ClaimUsers() {
        return getOrCreateProperty("ClaimPartiesGroup_ClaimUsers", "ClaimPartiesGroup_ClaimUsers", null, pcftest.Claim.MenuLinks.Claim_ClaimPartiesGroup.ClaimPartiesGroup_ClaimUsers.class);
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
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimPlanOfActionGroup extends ClickableActionElement {
      public Claim_ClaimPlanOfActionGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimPlanOfActionGroup_ClaimEvaluations getClaimPlanOfActionGroup_ClaimEvaluations() {
        return getOrCreateProperty("ClaimPlanOfActionGroup_ClaimEvaluations", "ClaimPlanOfActionGroup_ClaimEvaluations", null, pcftest.Claim.MenuLinks.Claim_ClaimPlanOfActionGroup.ClaimPlanOfActionGroup_ClaimEvaluations.class);
      }
      
      public ClaimPlanOfActionGroup_ClaimNegotiations getClaimPlanOfActionGroup_ClaimNegotiations() {
        return getOrCreateProperty("ClaimPlanOfActionGroup_ClaimNegotiations", "ClaimPlanOfActionGroup_ClaimNegotiations", null, pcftest.Claim.MenuLinks.Claim_ClaimPlanOfActionGroup.ClaimPlanOfActionGroup_ClaimNegotiations.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPlanOfActionGroup_ClaimEvaluations extends ClickableActionElement {
        public ClaimPlanOfActionGroup_ClaimEvaluations(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimEvaluations click() {
          return clickThis(pcftest.ClaimEvaluations.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimPlanOfActionGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPlanOfActionGroup_ClaimNegotiations extends ClickableActionElement {
        public ClaimPlanOfActionGroup_ClaimNegotiations(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimNegotiations click() {
          return clickThis(pcftest.ClaimNegotiations.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimPolicyGroup extends ClickableActionElement {
      public Claim_ClaimPolicyGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimPolicyGroup_ClaimPolicyAggregateLimits getClaimPolicyGroup_ClaimPolicyAggregateLimits() {
        return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyAggregateLimits", "ClaimPolicyGroup_ClaimPolicyAggregateLimits", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyAggregateLimits.class);
      }
      
      public ClaimPolicyGroup_ClaimPolicyEndorsements getClaimPolicyGroup_ClaimPolicyEndorsements() {
        return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyEndorsements", "ClaimPolicyGroup_ClaimPolicyEndorsements", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyEndorsements.class);
      }
      
      public ClaimPolicyGroup_ClaimPolicyGeneral getClaimPolicyGroup_ClaimPolicyGeneral() {
        return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyGeneral", "ClaimPolicyGroup_ClaimPolicyGeneral", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyGeneral.class);
      }
      
      public ClaimPolicyGroup_ClaimPolicyLocations getClaimPolicyGroup_ClaimPolicyLocations() {
        return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyLocations", "ClaimPolicyGroup_ClaimPolicyLocations", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyLocations.class);
      }
      
      public ClaimPolicyGroup_ClaimPolicyStatCodes getClaimPolicyGroup_ClaimPolicyStatCodes() {
        return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyStatCodes", "ClaimPolicyGroup_ClaimPolicyStatCodes", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyStatCodes.class);
      }
      
      public ClaimPolicyGroup_ClaimPolicyTrips getClaimPolicyGroup_ClaimPolicyTrips() {
        return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyTrips", "ClaimPolicyGroup_ClaimPolicyTrips", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyTrips.class);
      }
      
      public ClaimPolicyGroup_ClaimPolicyVehicles getClaimPolicyGroup_ClaimPolicyVehicles() {
        return getOrCreateProperty("ClaimPolicyGroup_ClaimPolicyVehicles", "ClaimPolicyGroup_ClaimPolicyVehicles", null, pcftest.Claim.MenuLinks.Claim_ClaimPolicyGroup.ClaimPolicyGroup_ClaimPolicyVehicles.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyGroup_ClaimPolicyAggregateLimits extends ClickableActionElement {
        public ClaimPolicyGroup_ClaimPolicyAggregateLimits(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyAggregateLimits click() {
          return clickThis(pcftest.ClaimPolicyAggregateLimits.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyGroup_ClaimPolicyEndorsements extends ClickableActionElement {
        public ClaimPolicyGroup_ClaimPolicyEndorsements(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyEndorsements click() {
          return clickThis(pcftest.ClaimPolicyEndorsements.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyGroup_ClaimPolicyGeneral extends ClickableActionElement {
        public ClaimPolicyGroup_ClaimPolicyGeneral(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyGeneral click() {
          return clickThis(pcftest.ClaimPolicyGeneral.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyGroup_ClaimPolicyLocations extends ClickableActionElement {
        public ClaimPolicyGroup_ClaimPolicyLocations(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyLocations click() {
          return clickThis(pcftest.ClaimPolicyLocations.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyGroup_ClaimPolicyStatCodes extends ClickableActionElement {
        public ClaimPolicyGroup_ClaimPolicyStatCodes(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyStatCodes click() {
          return clickThis(pcftest.ClaimPolicyStatCodes.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyGroup_ClaimPolicyTrips extends ClickableActionElement {
        public ClaimPolicyGroup_ClaimPolicyTrips(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyTrips click() {
          return clickThis(pcftest.ClaimPolicyTrips.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyGroup_ClaimPolicyVehicles extends ClickableActionElement {
        public ClaimPolicyGroup_ClaimPolicyVehicles(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyVehicles click() {
          return clickThis(pcftest.ClaimPolicyVehicles.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimServiceRequests extends ClickableActionElement {
      public Claim_ClaimServiceRequests(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimServiceRequests click() {
        return clickThis(pcftest.ClaimServiceRequests.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimSnapshotGroup extends ClickableActionElement {
      public Claim_ClaimSnapshotGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimSnapshotGroup_ClaimSnapshotDocuments getClaimSnapshotGroup_ClaimSnapshotDocuments() {
        return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotDocuments", "ClaimSnapshotGroup_ClaimSnapshotDocuments", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotDocuments.class);
      }
      
      public ClaimSnapshotGroup_ClaimSnapshotExposures getClaimSnapshotGroup_ClaimSnapshotExposures() {
        return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotExposures", "ClaimSnapshotGroup_ClaimSnapshotExposures", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotExposures.class);
      }
      
      public ClaimSnapshotGroup_ClaimSnapshotExtraFields getClaimSnapshotGroup_ClaimSnapshotExtraFields() {
        return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotExtraFields", "ClaimSnapshotGroup_ClaimSnapshotExtraFields", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotExtraFields.class);
      }
      
      public ClaimSnapshotGroup_ClaimSnapshotLossDetails getClaimSnapshotGroup_ClaimSnapshotLossDetails() {
        return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotLossDetails", "ClaimSnapshotGroup_ClaimSnapshotLossDetails", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotLossDetails.class);
      }
      
      public ClaimSnapshotGroup_ClaimSnapshotNotes getClaimSnapshotGroup_ClaimSnapshotNotes() {
        return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotNotes", "ClaimSnapshotGroup_ClaimSnapshotNotes", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotNotes.class);
      }
      
      public ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved getClaimSnapshotGroup_ClaimSnapshotPartiesInvolved() {
        return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved", "ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved.class);
      }
      
      public ClaimSnapshotGroup_ClaimSnapshotPolicy getClaimSnapshotGroup_ClaimSnapshotPolicy() {
        return getOrCreateProperty("ClaimSnapshotGroup_ClaimSnapshotPolicy", "ClaimSnapshotGroup_ClaimSnapshotPolicy", null, pcftest.Claim.MenuLinks.Claim_ClaimSnapshotGroup.ClaimSnapshotGroup_ClaimSnapshotPolicy.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshotGroup_ClaimSnapshotDocuments extends ClickableActionElement {
        public ClaimSnapshotGroup_ClaimSnapshotDocuments(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotDocuments click() {
          return clickThis(pcftest.ClaimSnapshotDocuments.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshotGroup_ClaimSnapshotExposures extends ClickableActionElement {
        public ClaimSnapshotGroup_ClaimSnapshotExposures(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotExposures click() {
          return clickThis(pcftest.ClaimSnapshotExposures.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshotGroup_ClaimSnapshotExtraFields extends ClickableActionElement {
        public ClaimSnapshotGroup_ClaimSnapshotExtraFields(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotExtraFields click() {
          return clickThis(pcftest.ClaimSnapshotExtraFields.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshotGroup_ClaimSnapshotLossDetails extends ClickableActionElement {
        public ClaimSnapshotGroup_ClaimSnapshotLossDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotLossDetails click() {
          return clickThis(pcftest.ClaimSnapshotLossDetails.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshotGroup_ClaimSnapshotNotes extends ClickableActionElement {
        public ClaimSnapshotGroup_ClaimSnapshotNotes(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotNotes click() {
          return clickThis(pcftest.ClaimSnapshotNotes.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved extends ClickableActionElement {
        public ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotPartiesInvolved click() {
          return clickThis(pcftest.ClaimSnapshotPartiesInvolved.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshotGroup_ClaimSnapshotPolicy extends ClickableActionElement {
        public ClaimSnapshotGroup_ClaimSnapshotPolicy(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotPolicy click() {
          return clickThis(pcftest.ClaimSnapshotPolicy.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimSubrogationGroup extends ClickableActionElement {
      public Claim_ClaimSubrogationGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimSubrogationGroup_SubrogationGeneral getClaimSubrogationGroup_SubrogationGeneral() {
        return getOrCreateProperty("ClaimSubrogationGroup_SubrogationGeneral", "ClaimSubrogationGroup_SubrogationGeneral", null, pcftest.Claim.MenuLinks.Claim_ClaimSubrogationGroup.ClaimSubrogationGroup_SubrogationGeneral.class);
      }
      
      public ClaimSubrogationGroup_SubrogationParties getClaimSubrogationGroup_SubrogationParties() {
        return getOrCreateProperty("ClaimSubrogationGroup_SubrogationParties", "ClaimSubrogationGroup_SubrogationParties", null, pcftest.Claim.MenuLinks.Claim_ClaimSubrogationGroup.ClaimSubrogationGroup_SubrogationParties.class);
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
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimSummaryGroup extends ClickableActionElement {
      public Claim_ClaimSummaryGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimSummaryGroup_ClaimStatus getClaimSummaryGroup_ClaimStatus() {
        return getOrCreateProperty("ClaimSummaryGroup_ClaimStatus", "ClaimSummaryGroup_ClaimStatus", null, pcftest.Claim.MenuLinks.Claim_ClaimSummaryGroup.ClaimSummaryGroup_ClaimStatus.class);
      }
      
      public ClaimSummaryGroup_ClaimSummary getClaimSummaryGroup_ClaimSummary() {
        return getOrCreateProperty("ClaimSummaryGroup_ClaimSummary", "ClaimSummaryGroup_ClaimSummary", null, pcftest.Claim.MenuLinks.Claim_ClaimSummaryGroup.ClaimSummaryGroup_ClaimSummary.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSummaryGroup_ClaimStatus extends ClickableActionElement {
        public ClaimSummaryGroup_ClaimStatus(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimStatus click() {
          return clickThis(pcftest.ClaimStatus.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSummaryGroup_ClaimSummary extends ClickableActionElement {
        public ClaimSummaryGroup_ClaimSummary(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSummary click() {
          return clickThis(pcftest.ClaimSummary.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ClaimWorkplan extends ClickableActionElement {
      public Claim_ClaimWorkplan(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimWorkplan click() {
        return clickThis(pcftest.ClaimWorkplan.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ReinsuranceSummary extends ClickableActionElement {
      public Claim_ReinsuranceSummary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReinsuranceSummary click() {
        return clickThis(pcftest.ReinsuranceSummary.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Claim_TopLevelExposureDetail getClaim_TopLevelExposureDetail() {
        return getOrCreateProperty("Claim_TopLevelExposureDetail", "Claim_TopLevelExposureDetail", null, pcftest.Claim.MenuLinks.entry.Claim_TopLevelExposureDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Claim_TopLevelExposureDetail extends ClickableActionElement {
        public Claim_TopLevelExposureDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public TopLevelExposureDetail click() {
          return clickThis(pcftest.TopLevelExposureDetail.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/Claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TopLevelExposureDetail getTopLevelExposureDetail() {
      return getOrCreateProperty("TopLevelExposureDetail", pcftest.TopLevelExposureDetail.class);
    }
    
    
  }
  
  
}