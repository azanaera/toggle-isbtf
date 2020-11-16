package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSummary.ClaimSummaryScreen;
import pcftest.ClaimSummary.ClaimSummaryScreen.BasicsLabel;
import pcftest.ClaimSummary.ClaimSummaryScreen.ClaimFinancialsPieChart;
import pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryActivitiesLV_tb;
import pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryAssociatedClaimsLV_tb;
import pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryExposuresLV_tb;
import pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryMattersLV_tb;
import pcftest.ClaimSummary.ClaimSummaryScreen.EmployeeThreePointContact;
import pcftest.ClaimSummary.ClaimSummaryScreen.EmployerThreePointContact;
import pcftest.ClaimSummary.ClaimSummaryScreen.MedicalProviderThreePointContact;
import pcftest.ClaimSummary.ClaimSummaryScreen.NotesLV_tb;
import pcftest.ClaimSummary.ClaimSummaryScreen.PeopleInvolvedLV_tb;
import pcftest.ClaimSummary.ClaimSummaryScreen.RiskIndicatorLabel;
import pcftest.ClaimSummary.ClaimSummaryScreen.RiskIndicatorNone;
import pcftest.ClaimSummary.ClaimSummaryScreen.ServiceRequestLV_tb;
import pcftest.ClaimSummary.ClaimSummaryScreen.ViewClaimOtherInstructions;
import pcftest.ClaimSummary.ClaimSummaryScreen.WC_RTW;
import pcftest.ClaimSummary.ClaimSummaryScreen._msgs;
import pcftest.ClaimSummary.ClaimSummaryScreen.entry;
import pcftest.ClaimSummary.ClaimSummaryScreen.entry.IndicatorIcon;
import pcftest.ClaimSummary.ClaimSummaryScreen.entry.IndicatorText;
import pcftest.ClaimSummary.ClaimSummary_UpLink;
import pcftest.ClaimSummary._Paging;
import pcftest.ClaimSummary.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummary extends PCFLocation {
  public final static String CHECKSUM = "0430832e630652683ef74041ea9cc6ec";
  
  public ClaimSummary(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummary"));
  }
  
  public ClaimSummaryScreen getClaimSummaryScreen() {
    return getOrCreateProperty("ClaimSummaryScreen", "ClaimSummaryScreen", null, pcftest.ClaimSummary.ClaimSummaryScreen.class);
  }
  
  public ClaimSummary_UpLink getClaimSummary_UpLink() {
    return getOrCreateProperty("ClaimSummary_UpLink", "ClaimSummary_UpLink", null, pcftest.ClaimSummary.ClaimSummary_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummary._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummary.__crumb__.class);
  }
  
  public ClaimSummaryGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSummaryGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryScreen extends PCFElement {
    public ClaimSummaryScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BasicsLabel getBasicsLabel() {
      return getOrCreateProperty("BasicsLabel", "BasicsLabel", null, pcftest.ClaimSummary.ClaimSummaryScreen.BasicsLabel.class);
    }
    
    public ValueElement getClaimClosedText() {
      return getOrCreateProperty("ClaimClosedText", "ClaimClosedText", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ClaimFinancialsPieChart getClaimFinancialsPieChart() {
      return getOrCreateProperty("ClaimFinancialsPieChart", "ClaimFinancialsPieChart", null, pcftest.ClaimSummary.ClaimSummaryScreen.ClaimFinancialsPieChart.class);
    }
    
    public ClaimSummaryActivitiesLV getClaimSummaryActivitiesLV() {
      return getOrCreateProperty("ClaimSummaryActivitiesLV", "ClaimSummaryActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryActivitiesLV.class);
    }
    
    public ClaimSummaryActivitiesLV_tb getClaimSummaryActivitiesLV_tb() {
      return getOrCreateProperty("ClaimSummaryActivitiesLV_tb", "ClaimSummaryActivitiesLV_tb", null, pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryActivitiesLV_tb.class);
    }
    
    public ClaimSummaryAssociatedClaimsLV getClaimSummaryAssociatedClaimsLV() {
      return getOrCreateProperty("ClaimSummaryAssociatedClaimsLV", "ClaimSummaryAssociatedClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryAssociatedClaimsLV.class);
    }
    
    public ClaimSummaryAssociatedClaimsLV_tb getClaimSummaryAssociatedClaimsLV_tb() {
      return getOrCreateProperty("ClaimSummaryAssociatedClaimsLV_tb", "ClaimSummaryAssociatedClaimsLV_tb", null, pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryAssociatedClaimsLV_tb.class);
    }
    
    public ClaimSummaryExposuresLV getClaimSummaryExposuresLV() {
      return getOrCreateProperty("ClaimSummaryExposuresLV", "ClaimSummaryExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryExposuresLV.class);
    }
    
    public ClaimSummaryExposuresLV_tb getClaimSummaryExposuresLV_tb() {
      return getOrCreateProperty("ClaimSummaryExposuresLV_tb", "ClaimSummaryExposuresLV_tb", null, pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryExposuresLV_tb.class);
    }
    
    public ClaimSummaryMattersLV getClaimSummaryMattersLV() {
      return getOrCreateProperty("ClaimSummaryMattersLV", "ClaimSummaryMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryMattersLV.class);
    }
    
    public ClaimSummaryMattersLV_tb getClaimSummaryMattersLV_tb() {
      return getOrCreateProperty("ClaimSummaryMattersLV_tb", "ClaimSummaryMattersLV_tb", null, pcftest.ClaimSummary.ClaimSummaryScreen.ClaimSummaryMattersLV_tb.class);
    }
    
    public ValueElement getDaysOpenProgressBar() {
      return getOrCreateProperty("DaysOpenProgressBar", "DaysOpenProgressBar", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDaysOpenText() {
      return getOrCreateProperty("DaysOpenText", "DaysOpenText", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EmployeeThreePointContact getEmployeeThreePointContact() {
      return getOrCreateProperty("EmployeeThreePointContact", "EmployeeThreePointContact", null, pcftest.ClaimSummary.ClaimSummaryScreen.EmployeeThreePointContact.class);
    }
    
    public EmployerThreePointContact getEmployerThreePointContact() {
      return getOrCreateProperty("EmployerThreePointContact", "EmployerThreePointContact", null, pcftest.ClaimSummary.ClaimSummaryScreen.EmployerThreePointContact.class);
    }
    
    public ValueElement getLocation() {
      return getOrCreateProperty("Location", "Location", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLossDate() {
      return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public MedicalProviderThreePointContact getMedicalProviderThreePointContact() {
      return getOrCreateProperty("MedicalProviderThreePointContact", "MedicalProviderThreePointContact", null, pcftest.ClaimSummary.ClaimSummaryScreen.MedicalProviderThreePointContact.class);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.ClaimSummary.ClaimSummaryScreen.NotesLV_tb.class);
    }
    
    public ValueElement getPaid() {
      return getOrCreateProperty("Paid", "Paid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PeopleInvolvedLV getPeopleInvolvedLV() {
      return getOrCreateProperty("PeopleInvolvedLV", "PeopleInvolvedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PeopleInvolvedLV.class);
    }
    
    public PeopleInvolvedLV_tb getPeopleInvolvedLV_tb() {
      return getOrCreateProperty("PeopleInvolvedLV_tb", "PeopleInvolvedLV_tb", null, pcftest.ClaimSummary.ClaimSummaryScreen.PeopleInvolvedLV_tb.class);
    }
    
    public ValueElement getRecovered() {
      return getOrCreateProperty("Recovered", "Recovered", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getReportDate() {
      return getOrCreateProperty("ReportDate", "ReportDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public RiskIndicatorLabel getRiskIndicatorLabel() {
      return getOrCreateProperty("RiskIndicatorLabel", "RiskIndicatorLabel", null, pcftest.ClaimSummary.ClaimSummaryScreen.RiskIndicatorLabel.class);
    }
    
    public RiskIndicatorNone getRiskIndicatorNone() {
      return getOrCreateProperty("RiskIndicatorNone", "RiskIndicatorNone", null, pcftest.ClaimSummary.ClaimSummaryScreen.RiskIndicatorNone.class);
    }
    
    public ServiceRequestLV getServiceRequestLV() {
      return getOrCreateProperty("ServiceRequestLV", "ServiceRequestLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ServiceRequestLV.class);
    }
    
    public ServiceRequestLV_tb getServiceRequestLV_tb() {
      return getOrCreateProperty("ServiceRequestLV_tb", "ServiceRequestLV_tb", null, pcftest.ClaimSummary.ClaimSummaryScreen.ServiceRequestLV_tb.class);
    }
    
    public ValueElement getTotalGrossIncurred() {
      return getOrCreateProperty("TotalGrossIncurred", "TotalGrossIncurred", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ViewClaimOtherInstructions getViewClaimOtherInstructions() {
      return getOrCreateProperty("ViewClaimOtherInstructions", "ViewClaimOtherInstructions", null, pcftest.ClaimSummary.ClaimSummaryScreen.ViewClaimOtherInstructions.class);
    }
    
    public ValueElement getWCInjuryWorkStatus() {
      return getOrCreateProperty("WCInjuryWorkStatus", "WCInjuryWorkStatus", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public WC_RTW getWC_RTW() {
      return getOrCreateProperty("WC_RTW", "WC_RTW", null, pcftest.ClaimSummary.ClaimSummaryScreen.WC_RTW.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.ClaimSummary.ClaimSummaryScreen.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummary.ClaimSummaryScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BasicsLabel extends ValueElement {
      public BasicsLabel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsPieChart extends PCFElement {
      public ClaimFinancialsPieChart(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryActivitiesLV_tb extends PCFElement {
      public ClaimSummaryActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryAssociatedClaimsLV_tb extends PCFElement {
      public ClaimSummaryAssociatedClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryExposuresLV_tb extends PCFElement {
      public ClaimSummaryExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryMattersLV_tb extends PCFElement {
      public ClaimSummaryMattersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EmployeeThreePointContact extends ClickableActionElement {
      public EmployeeThreePointContact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EmployerThreePointContact extends ClickableActionElement {
      public EmployerThreePointContact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalProviderThreePointContact extends ClickableActionElement {
      public MedicalProviderThreePointContact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PeopleInvolvedLV_tb extends PCFElement {
      public PeopleInvolvedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RiskIndicatorLabel extends ValueElement {
      public RiskIndicatorLabel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RiskIndicatorNone extends ValueElement {
      public RiskIndicatorNone(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestLV_tb extends PCFElement {
      public ServiceRequestLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewClaimOtherInstructions extends ClickableActionElement {
      public ViewClaimOtherInstructions(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimOtherInstructionWorksheet click() {
        return clickThis(pcftest.ClaimOtherInstructionWorksheet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WC_RTW extends PCFElement {
      public WC_RTW(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReturnToWorkInputSet_WC getReturnToWorkInputSet_WC() {
        return getOrCreateProperty("ReturnToWorkInputSet_WC", "ReturnToWorkInputSet", null, pcftest.ReturnToWorkInputSet_WC.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IndicatorIcon getIndicatorIcon() {
        return getOrCreateProperty("IndicatorIcon", "IndicatorIcon", null, pcftest.ClaimSummary.ClaimSummaryScreen.entry.IndicatorIcon.class);
      }
      
      public IndicatorText getIndicatorText() {
        return getOrCreateProperty("IndicatorText", "IndicatorText", null, pcftest.ClaimSummary.ClaimSummaryScreen.entry.IndicatorText.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IndicatorIcon extends ClickableActionElement {
        public IndicatorIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IndicatorText extends ClickableActionElement {
        public IndicatorText(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummary_UpLink extends ClickableActionElement {
    public ClaimSummary_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}