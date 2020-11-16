package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPrintout.ClaimPrintoutScreen;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrint;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.AllClaimPagesWithDetailsChoice_Choice;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.AllClaimPagesWithoutDetailsChoice_Choice;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Associations3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Checks3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimLossEmployerLiabilitySectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimLossIndemityTimeLoss3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimLossMedicalDetail3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimSnapshot3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.CurrentClaimFilePagePrintChoice_Choice;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.CurrentClaimFilePagePrintWithDetailsChoice_Choice;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.CustomChoice_Choice;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Documents3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Evaluations3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Exposures3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.FinancialsSummary3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.FinancialsTransactionSectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.History3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.HomeownerPropertyIncident3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.InjuryIncident3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Litigation3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.LossDetails3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Negotiations3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Notes3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.PartiesInvolved3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Policy3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.PropertyIncident3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.SpecialInvestigations3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Subrogation3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Summary3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.TravelIncident3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.VehicleIncident3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Workplan3SectionCheckBox;
import pcftest.ClaimPrintout.ClaimPrintoutScreen._msgs;
import pcftest.ClaimPrintout.ClaimPrintout_UpLink;
import pcftest.ClaimPrintout._Paging;
import pcftest.ClaimPrintout.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPrintout extends PCFLocation {
  public final static String CHECKSUM = "9539fe4bc8382af1b29bdb7a1ab43522";
  
  public ClaimPrintout(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPrintout"));
  }
  
  public ClaimPrintoutScreen getClaimPrintoutScreen() {
    return getOrCreateProperty("ClaimPrintoutScreen", "ClaimPrintoutScreen", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.class);
  }
  
  public ClaimPrintout_UpLink getClaimPrintout_UpLink() {
    return getOrCreateProperty("ClaimPrintout_UpLink", "ClaimPrintout_UpLink", null, pcftest.ClaimPrintout.ClaimPrintout_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPrintout._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPrintout.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPrintoutScreen extends PCFElement {
    public ClaimPrintoutScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPrint getClaimPrint() {
      return getOrCreateProperty("ClaimPrint", "ClaimPrint", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrint.class);
    }
    
    public ClaimPrintoutPrintoutDV getClaimPrintoutPrintoutDV() {
      return getOrCreateProperty("ClaimPrintoutPrintoutDV", "ClaimPrintoutPrintoutDV", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPrintout.ClaimPrintoutScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPrint extends ClickableActionElement {
      public ClaimPrint(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPrintoutPrintoutDV extends DetailViewElement {
      public ClaimPrintoutPrintoutDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActivityDetailPrint getActivityDetailPrint() {
        return getOrCreateProperty("ActivityDetailPrint", pcftest.ActivityDetailPrint.class);
      }
      
      public AllClaimPagesWithDetailsChoice_Choice getAllClaimPagesWithDetailsChoice_Choice() {
        return getOrCreateProperty("AllClaimPagesWithDetailsChoice_Choice", "AllClaimPagesWithDetailsChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.AllClaimPagesWithDetailsChoice_Choice.class);
      }
      
      public ValueElement getAllClaimPagesWithDetailsLabel() {
        return getOrCreateProperty("AllClaimPagesWithDetailsLabel", "AllClaimPagesWithDetailsLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public AllClaimPagesWithoutDetailsChoice_Choice getAllClaimPagesWithoutDetailsChoice_Choice() {
        return getOrCreateProperty("AllClaimPagesWithoutDetailsChoice_Choice", "AllClaimPagesWithoutDetailsChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.AllClaimPagesWithoutDetailsChoice_Choice.class);
      }
      
      public ValueElement getAllClaimPagesWithoutDetailsLabel() {
        return getOrCreateProperty("AllClaimPagesWithoutDetailsLabel", "AllClaimPagesWithoutDetailsLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Associations3SectionCheckBox getAssociations3SectionCheckBox() {
        return getOrCreateProperty("Associations3SectionCheckBox", "Associations3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Associations3SectionCheckBox.class);
      }
      
      public BaggageIncidentDetailPrint getBaggageIncidentDetailPrint() {
        return getOrCreateProperty("BaggageIncidentDetailPrint", pcftest.BaggageIncidentDetailPrint.class);
      }
      
      public Checks3SectionCheckBox getChecks3SectionCheckBox() {
        return getOrCreateProperty("Checks3SectionCheckBox", "Checks3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Checks3SectionCheckBox.class);
      }
      
      public ClaimAssociationDetail getClaimAssociationDetail() {
        return getOrCreateProperty("ClaimAssociationDetail", pcftest.ClaimAssociationDetail.class);
      }
      
      public ClaimContactPrintDetails getClaimContactPrintDetails() {
        return getOrCreateProperty("ClaimContactPrintDetails", pcftest.ClaimContactPrintDetails.class);
      }
      
      public ClaimEvaluationPrintDetail getClaimEvaluationPrintDetail() {
        return getOrCreateProperty("ClaimEvaluationPrintDetail", pcftest.ClaimEvaluationPrintDetail.class);
      }
      
      public ClaimFinancialsChecksDetailPrint getClaimFinancialsChecksDetailPrint() {
        return getOrCreateProperty("ClaimFinancialsChecksDetailPrint", pcftest.ClaimFinancialsChecksDetailPrint.class);
      }
      
      public ClaimLossEmployerLiabilitySectionCheckBox getClaimLossEmployerLiabilitySectionCheckBox() {
        return getOrCreateProperty("ClaimLossEmployerLiabilitySectionCheckBox", "ClaimLossEmployerLiabilitySectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimLossEmployerLiabilitySectionCheckBox.class);
      }
      
      public ClaimLossIndemityTimeLoss3SectionCheckBox getClaimLossIndemityTimeLoss3SectionCheckBox() {
        return getOrCreateProperty("ClaimLossIndemityTimeLoss3SectionCheckBox", "ClaimLossIndemityTimeLoss3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimLossIndemityTimeLoss3SectionCheckBox.class);
      }
      
      public ClaimLossMedicalDetail3SectionCheckBox getClaimLossMedicalDetail3SectionCheckBox() {
        return getOrCreateProperty("ClaimLossMedicalDetail3SectionCheckBox", "ClaimLossMedicalDetail3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimLossMedicalDetail3SectionCheckBox.class);
      }
      
      public ClaimNegotiationPrintDetail getClaimNegotiationPrintDetail() {
        return getOrCreateProperty("ClaimNegotiationPrintDetail", pcftest.ClaimNegotiationPrintDetail.class);
      }
      
      public ClaimPolicyAggregateLimitDetail getClaimPolicyAggregateLimitDetail() {
        return getOrCreateProperty("ClaimPolicyAggregateLimitDetail", pcftest.ClaimPolicyAggregateLimitDetail.class);
      }
      
      public ClaimPolicyEndorsementDetail getClaimPolicyEndorsementDetail() {
        return getOrCreateProperty("ClaimPolicyEndorsementDetail", pcftest.ClaimPolicyEndorsementDetail.class);
      }
      
      public ClaimPolicyStatCodeDetail getClaimPolicyStatCodeDetail() {
        return getOrCreateProperty("ClaimPolicyStatCodeDetail", pcftest.ClaimPolicyStatCodeDetail.class);
      }
      
      public ClaimPolicyVehicleDetail getClaimPolicyVehicleDetail() {
        return getOrCreateProperty("ClaimPolicyVehicleDetail", pcftest.ClaimPolicyVehicleDetail.class);
      }
      
      public ClaimSnapshot3SectionCheckBox getClaimSnapshot3SectionCheckBox() {
        return getOrCreateProperty("ClaimSnapshot3SectionCheckBox", "ClaimSnapshot3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.ClaimSnapshot3SectionCheckBox.class);
      }
      
      public ClaimUserPrintDetails getClaimUserPrintDetails() {
        return getOrCreateProperty("ClaimUserPrintDetails", pcftest.ClaimUserPrintDetails.class);
      }
      
      public CurrentClaimFilePagePrintChoice_Choice getCurrentClaimFilePagePrintChoice_Choice() {
        return getOrCreateProperty("CurrentClaimFilePagePrintChoice_Choice", "CurrentClaimFilePagePrintChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.CurrentClaimFilePagePrintChoice_Choice.class);
      }
      
      public ValueElement getCurrentClaimFilePagePrintLabel() {
        return getOrCreateProperty("CurrentClaimFilePagePrintLabel", "CurrentClaimFilePagePrintLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CurrentClaimFilePagePrintWithDetailsChoice_Choice getCurrentClaimFilePagePrintWithDetailsChoice_Choice() {
        return getOrCreateProperty("CurrentClaimFilePagePrintWithDetailsChoice_Choice", "CurrentClaimFilePagePrintWithDetailsChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.CurrentClaimFilePagePrintWithDetailsChoice_Choice.class);
      }
      
      public ValueElement getCurrentClaimFilePagePrintWithDetailsLabel() {
        return getOrCreateProperty("CurrentClaimFilePagePrintWithDetailsLabel", "CurrentClaimFilePagePrintWithDetailsLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CustomChoice_Choice getCustomChoice_Choice() {
        return getOrCreateProperty("CustomChoice_Choice", "CustomChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.CustomChoice_Choice.class);
      }
      
      public ValueElement getCustomLabel() {
        return getOrCreateProperty("CustomLabel", "CustomLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DocumentDetailsPrint getDocumentDetailsPrint() {
        return getOrCreateProperty("DocumentDetailsPrint", pcftest.DocumentDetailsPrint.class);
      }
      
      public Documents3SectionCheckBox getDocuments3SectionCheckBox() {
        return getOrCreateProperty("Documents3SectionCheckBox", "Documents3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Documents3SectionCheckBox.class);
      }
      
      public Evaluations3SectionCheckBox getEvaluations3SectionCheckBox() {
        return getOrCreateProperty("Evaluations3SectionCheckBox", "Evaluations3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Evaluations3SectionCheckBox.class);
      }
      
      public ExposureDetail getExposureDetail() {
        return getOrCreateProperty("ExposureDetail", pcftest.ExposureDetail.class);
      }
      
      public Exposures3SectionCheckBox getExposures3SectionCheckBox() {
        return getOrCreateProperty("Exposures3SectionCheckBox", "Exposures3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Exposures3SectionCheckBox.class);
      }
      
      public FinancialsSummary3SectionCheckBox getFinancialsSummary3SectionCheckBox() {
        return getOrCreateProperty("FinancialsSummary3SectionCheckBox", "FinancialsSummary3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.FinancialsSummary3SectionCheckBox.class);
      }
      
      public FinancialsTransactionSectionCheckBox getFinancialsTransactionSectionCheckBox() {
        return getOrCreateProperty("FinancialsTransactionSectionCheckBox", "FinancialsTransactionSectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.FinancialsTransactionSectionCheckBox.class);
      }
      
      public FixedPropertyIncidentDetailPrint getFixedPropertyIncidentDetailPrint() {
        return getOrCreateProperty("FixedPropertyIncidentDetailPrint", pcftest.FixedPropertyIncidentDetailPrint.class);
      }
      
      public History3SectionCheckBox getHistory3SectionCheckBox() {
        return getOrCreateProperty("History3SectionCheckBox", "History3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.History3SectionCheckBox.class);
      }
      
      public HomeownerPropertyIncident3SectionCheckBox getHomeownerPropertyIncident3SectionCheckBox() {
        return getOrCreateProperty("HomeownerPropertyIncident3SectionCheckBox", "HomeownerPropertyIncident3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.HomeownerPropertyIncident3SectionCheckBox.class);
      }
      
      public InjuryIncident3SectionCheckBox getInjuryIncident3SectionCheckBox() {
        return getOrCreateProperty("InjuryIncident3SectionCheckBox", "InjuryIncident3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.InjuryIncident3SectionCheckBox.class);
      }
      
      public InjuryIncidentDetailPrint getInjuryIncidentDetailPrint() {
        return getOrCreateProperty("InjuryIncidentDetailPrint", pcftest.InjuryIncidentDetailPrint.class);
      }
      
      public Litigation3SectionCheckBox getLitigation3SectionCheckBox() {
        return getOrCreateProperty("Litigation3SectionCheckBox", "Litigation3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Litigation3SectionCheckBox.class);
      }
      
      public LossDetails3SectionCheckBox getLossDetails3SectionCheckBox() {
        return getOrCreateProperty("LossDetails3SectionCheckBox", "LossDetails3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.LossDetails3SectionCheckBox.class);
      }
      
      public MatterDetailPage getMatterDetailPage() {
        return getOrCreateProperty("MatterDetailPage", pcftest.MatterDetailPage.class);
      }
      
      public Negotiations3SectionCheckBox getNegotiations3SectionCheckBox() {
        return getOrCreateProperty("Negotiations3SectionCheckBox", "Negotiations3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Negotiations3SectionCheckBox.class);
      }
      
      public Notes3SectionCheckBox getNotes3SectionCheckBox() {
        return getOrCreateProperty("Notes3SectionCheckBox", "Notes3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Notes3SectionCheckBox.class);
      }
      
      public PartiesInvolved3SectionCheckBox getPartiesInvolved3SectionCheckBox() {
        return getOrCreateProperty("PartiesInvolved3SectionCheckBox", "PartiesInvolved3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.PartiesInvolved3SectionCheckBox.class);
      }
      
      public Policy3SectionCheckBox getPolicy3SectionCheckBox() {
        return getOrCreateProperty("Policy3SectionCheckBox", "Policy3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Policy3SectionCheckBox.class);
      }
      
      public PolicyLocationPrint getPolicyLocationPrint() {
        return getOrCreateProperty("PolicyLocationPrint", pcftest.PolicyLocationPrint.class);
      }
      
      public PropertyIncident3SectionCheckBox getPropertyIncident3SectionCheckBox() {
        return getOrCreateProperty("PropertyIncident3SectionCheckBox", "PropertyIncident3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.PropertyIncident3SectionCheckBox.class);
      }
      
      public SpecialInvestigations3SectionCheckBox getSpecialInvestigations3SectionCheckBox() {
        return getOrCreateProperty("SpecialInvestigations3SectionCheckBox", "SpecialInvestigations3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.SpecialInvestigations3SectionCheckBox.class);
      }
      
      public Subrogation3SectionCheckBox getSubrogation3SectionCheckBox() {
        return getOrCreateProperty("Subrogation3SectionCheckBox", "Subrogation3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Subrogation3SectionCheckBox.class);
      }
      
      public Summary3SectionCheckBox getSummary3SectionCheckBox() {
        return getOrCreateProperty("Summary3SectionCheckBox", "Summary3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Summary3SectionCheckBox.class);
      }
      
      public TransactionDetailPrint getTransactionDetailPrint() {
        return getOrCreateProperty("TransactionDetailPrint", pcftest.TransactionDetailPrint.class);
      }
      
      public TravelIncident3SectionCheckBox getTravelIncident3SectionCheckBox() {
        return getOrCreateProperty("TravelIncident3SectionCheckBox", "TravelIncident3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.TravelIncident3SectionCheckBox.class);
      }
      
      public TripIncidentDetailPrint getTripIncidentDetailPrint() {
        return getOrCreateProperty("TripIncidentDetailPrint", pcftest.TripIncidentDetailPrint.class);
      }
      
      public TripRUPrint getTripRUPrint() {
        return getOrCreateProperty("TripRUPrint", pcftest.TripRUPrint.class);
      }
      
      public VehicleIncident3SectionCheckBox getVehicleIncident3SectionCheckBox() {
        return getOrCreateProperty("VehicleIncident3SectionCheckBox", "VehicleIncident3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.VehicleIncident3SectionCheckBox.class);
      }
      
      public VehicleIncidentDetailPrint getVehicleIncidentDetailPrint() {
        return getOrCreateProperty("VehicleIncidentDetailPrint", pcftest.VehicleIncidentDetailPrint.class);
      }
      
      public Workplan3SectionCheckBox getWorkplan3SectionCheckBox() {
        return getOrCreateProperty("Workplan3SectionCheckBox", "Workplan3SectionCheckBox", null, pcftest.ClaimPrintout.ClaimPrintoutScreen.ClaimPrintoutPrintoutDV.Workplan3SectionCheckBox.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AllClaimPagesWithDetailsChoice_Choice extends RadioButtonValueElement {
        public AllClaimPagesWithDetailsChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AllClaimPagesWithoutDetailsChoice_Choice extends RadioButtonValueElement {
        public AllClaimPagesWithoutDetailsChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Associations3SectionCheckBox extends PCFElement {
        public Associations3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getAssociations3SectionOptions() {
          return getOrCreateProperty("Associations3SectionOptions", "Associations3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Checks3SectionCheckBox extends PCFElement {
        public Checks3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getChecks3SectionOptions() {
          return getOrCreateProperty("Checks3SectionOptions", "Checks3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimLossEmployerLiabilitySectionCheckBox extends PCFElement {
        public ClaimLossEmployerLiabilitySectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getClaimLossEmployerLiabilitySectionOptions() {
          return getOrCreateProperty("ClaimLossEmployerLiabilitySectionOptions", "ClaimLossEmployerLiabilitySectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimLossIndemityTimeLoss3SectionCheckBox extends PCFElement {
        public ClaimLossIndemityTimeLoss3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getClaimLossIndemityTimeLoss3SectionOptions() {
          return getOrCreateProperty("ClaimLossIndemityTimeLoss3SectionOptions", "ClaimLossIndemityTimeLoss3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimLossMedicalDetail3SectionCheckBox extends PCFElement {
        public ClaimLossMedicalDetail3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getClaimLossMedicalDetail3SectionOptions() {
          return getOrCreateProperty("ClaimLossMedicalDetail3SectionOptions", "ClaimLossMedicalDetail3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSnapshot3SectionCheckBox extends PCFElement {
        public ClaimSnapshot3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getClaimSnapshot3SectionOptions() {
          return getOrCreateProperty("ClaimSnapshot3SectionOptions", "ClaimSnapshot3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CurrentClaimFilePagePrintChoice_Choice extends RadioButtonValueElement {
        public CurrentClaimFilePagePrintChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CurrentClaimFilePagePrintWithDetailsChoice_Choice extends RadioButtonValueElement {
        public CurrentClaimFilePagePrintWithDetailsChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CustomChoice_Choice extends RadioButtonValueElement {
        public CustomChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Documents3SectionCheckBox extends PCFElement {
        public Documents3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getDocuments3SectionOptions() {
          return getOrCreateProperty("Documents3SectionOptions", "Documents3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Evaluations3SectionCheckBox extends PCFElement {
        public Evaluations3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getEvaluations3SectionOptions() {
          return getOrCreateProperty("Evaluations3SectionOptions", "Evaluations3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Exposures3SectionCheckBox extends PCFElement {
        public Exposures3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getExposures3SectionOptions() {
          return getOrCreateProperty("Exposures3SectionOptions", "Exposures3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FinancialsSummary3SectionCheckBox extends PCFElement {
        public FinancialsSummary3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getFinancialsSummary3SectionOptions() {
          return getOrCreateProperty("FinancialsSummary3SectionOptions", "FinancialsSummary3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FinancialsTransactionSectionCheckBox extends PCFElement {
        public FinancialsTransactionSectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getFinancialsTransactionSectionOptions() {
          return getOrCreateProperty("FinancialsTransactionSectionOptions", "FinancialsTransactionSectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class History3SectionCheckBox extends PCFElement {
        public History3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getHistory3SectionOptions() {
          return getOrCreateProperty("History3SectionOptions", "History3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class HomeownerPropertyIncident3SectionCheckBox extends PCFElement {
        public HomeownerPropertyIncident3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getHomeownerPropertyIncident3SectionOptions() {
          return getOrCreateProperty("HomeownerPropertyIncident3SectionOptions", "HomeownerPropertyIncident3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InjuryIncident3SectionCheckBox extends PCFElement {
        public InjuryIncident3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getInjuryIncident3SectionOptions() {
          return getOrCreateProperty("InjuryIncident3SectionOptions", "InjuryIncident3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Litigation3SectionCheckBox extends PCFElement {
        public Litigation3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getLitigation3SectionOptions() {
          return getOrCreateProperty("Litigation3SectionOptions", "Litigation3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LossDetails3SectionCheckBox extends PCFElement {
        public LossDetails3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getLossDetails3SectionOptions() {
          return getOrCreateProperty("LossDetails3SectionOptions", "LossDetails3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Negotiations3SectionCheckBox extends PCFElement {
        public Negotiations3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getNegotiations3SectionOptions() {
          return getOrCreateProperty("Negotiations3SectionOptions", "Negotiations3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Notes3SectionCheckBox extends PCFElement {
        public Notes3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getNotes3SectionOptions() {
          return getOrCreateProperty("Notes3SectionOptions", "Notes3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PartiesInvolved3SectionCheckBox extends PCFElement {
        public PartiesInvolved3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getPartiesInvolved3SectionOptions() {
          return getOrCreateProperty("PartiesInvolved3SectionOptions", "PartiesInvolved3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Policy3SectionCheckBox extends PCFElement {
        public Policy3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getPolicy3SectionOptions() {
          return getOrCreateProperty("Policy3SectionOptions", "Policy3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertyIncident3SectionCheckBox extends PCFElement {
        public PropertyIncident3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getPropertyIncident3SectionOptions() {
          return getOrCreateProperty("PropertyIncident3SectionOptions", "PropertyIncident3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialInvestigations3SectionCheckBox extends PCFElement {
        public SpecialInvestigations3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getSpecialInvestigations3SectionOptions() {
          return getOrCreateProperty("SpecialInvestigations3SectionOptions", "SpecialInvestigations3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Subrogation3SectionCheckBox extends PCFElement {
        public Subrogation3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getSubrogation3SectionOptions() {
          return getOrCreateProperty("Subrogation3SectionOptions", "Subrogation3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Summary3SectionCheckBox extends PCFElement {
        public Summary3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getSummary3SectionOptions() {
          return getOrCreateProperty("Summary3SectionOptions", "Summary3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TravelIncident3SectionCheckBox extends PCFElement {
        public TravelIncident3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getTravelIncident3SectionOptions() {
          return getOrCreateProperty("TravelIncident3SectionOptions", "TravelIncident3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class VehicleIncident3SectionCheckBox extends PCFElement {
        public VehicleIncident3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getVehicleIncident3SectionOptions() {
          return getOrCreateProperty("VehicleIncident3SectionOptions", "VehicleIncident3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Workplan3SectionCheckBox extends PCFElement {
        public Workplan3SectionCheckBox(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getWorkplan3SectionOptions() {
          return getOrCreateProperty("Workplan3SectionOptions", "Workplan3SectionOptions", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPrintout_UpLink extends ClickableActionElement {
    public ClaimPrintout_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPrintout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}