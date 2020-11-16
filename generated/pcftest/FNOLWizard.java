package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard.Cancel;
import pcftest.FNOLWizard.FNOLWizard_UpLink;
import pcftest.FNOLWizard.FindPolicy;
import pcftest.FNOLWizard.Finish;
import pcftest.FNOLWizard.FullWizardStepSet;
import pcftest.FNOLWizard.FullWizardStepSet.BasicInfo;
import pcftest.FNOLWizard.FullWizardStepSet.LossDetails;
import pcftest.FNOLWizard.FullWizardStepSet.Services;
import pcftest.FNOLWizard.FullWizardStepSet.Summary;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicAssign;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicDocuments;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicExposures;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicLossDetails;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicMainContacts;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicPartiesInvolved;
import pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicSummary;
import pcftest.FNOLWizard.IndependentWizardStepSet;
import pcftest.FNOLWizard.IndependentWizardStepSet.Documents;
import pcftest.FNOLWizard.IndependentWizardStepSet.Notes;
import pcftest.FNOLWizard.IndependentWizardStepSet.PartiesInvolved;
import pcftest.FNOLWizard.IndependentWizardStepSet.PolicyWizardStepGroup;
import pcftest.FNOLWizard.IndependentWizardStepSet.PolicyWizardStepGroup.PolicyDetails;
import pcftest.FNOLWizard.IndependentWizardStepSet.PolicyWizardStepGroup.PolicyGeneral;
import pcftest.FNOLWizard.Next;
import pcftest.FNOLWizard.Prev;
import pcftest.FNOLWizard.QuickClaimAutoFirstAndFinal;
import pcftest.FNOLWizard.QuickClaimGL;
import pcftest.FNOLWizard.QuickClaimPr;
import pcftest.FNOLWizard.QuickClaimTravelBaggageOnly;
import pcftest.FNOLWizard.QuickClaimTravelTripCancelOnly;
import pcftest.FNOLWizard.SelectRiskUnitsStep;
import pcftest.FNOLWizard._Paging;
import pcftest.FNOLWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard extends PCFLocation {
  public final static String CHECKSUM = "7777e42a5aed17fd07351c1186c5fb38";
  
  public FNOLWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FNOLWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.FNOLWizard.Cancel.class);
  }
  
  public ClaimInfoBar getClaimInfoBar() {
    return getOrCreateProperty("ClaimInfoBar", "ClaimInfoBar", null, pcftest.ClaimInfoBar.class);
  }
  
  public FNOLMenuActions getFNOLMenuActions() {
    return getOrCreateProperty("FNOLMenuActions", "FNOLMenuActions", null, pcftest.FNOLMenuActions.class);
  }
  
  public FNOLWizard_UpLink getFNOLWizard_UpLink() {
    return getOrCreateProperty("FNOLWizard_UpLink", "FNOLWizard_UpLink", null, pcftest.FNOLWizard.FNOLWizard_UpLink.class);
  }
  
  public FindPolicy getFindPolicy() {
    return getOrCreateProperty("FindPolicy", "FindPolicy", null, pcftest.FNOLWizard.FindPolicy.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.FNOLWizard.Finish.class);
  }
  
  public FullWizardStepSet getFullWizardStepSet() {
    return getOrCreateProperty("FullWizardStepSet", "FullWizardStepSet", null, pcftest.FNOLWizard.FullWizardStepSet.class);
  }
  
  public GeneralPropertyWizardStepSet getGeneralPropertyWizardStepSet() {
    return getOrCreateProperty("GeneralPropertyWizardStepSet", "GeneralPropertyWizardStepSet", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.class);
  }
  
  public IndependentWizardStepSet getIndependentWizardStepSet() {
    return getOrCreateProperty("IndependentWizardStepSet", "IndependentWizardStepSet", null, pcftest.FNOLWizard.IndependentWizardStepSet.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.FNOLWizard.Next.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.FNOLWizard.Prev.class);
  }
  
  public QuickClaimAutoFirstAndFinal getQuickClaimAutoFirstAndFinal() {
    return getOrCreateProperty("QuickClaimAutoFirstAndFinal", "QuickClaimAutoFirstAndFinal", null, pcftest.FNOLWizard.QuickClaimAutoFirstAndFinal.class);
  }
  
  public QuickClaimGL getQuickClaimGL() {
    return getOrCreateProperty("QuickClaimGL", "QuickClaimGL", null, pcftest.FNOLWizard.QuickClaimGL.class);
  }
  
  public QuickClaimPr getQuickClaimPr() {
    return getOrCreateProperty("QuickClaimPr", "QuickClaimPr", null, pcftest.FNOLWizard.QuickClaimPr.class);
  }
  
  public QuickClaimTravelBaggageOnly getQuickClaimTravelBaggageOnly() {
    return getOrCreateProperty("QuickClaimTravelBaggageOnly", "QuickClaimTravelBaggageOnly", null, pcftest.FNOLWizard.QuickClaimTravelBaggageOnly.class);
  }
  
  public QuickClaimTravelTripCancelOnly getQuickClaimTravelTripCancelOnly() {
    return getOrCreateProperty("QuickClaimTravelTripCancelOnly", "QuickClaimTravelTripCancelOnly", null, pcftest.FNOLWizard.QuickClaimTravelTripCancelOnly.class);
  }
  
  public SelectRiskUnitsStep getSelectRiskUnitsStep() {
    return getOrCreateProperty("SelectRiskUnitsStep", "SelectRiskUnitsStep", null, pcftest.FNOLWizard.SelectRiskUnitsStep.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FNOLWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FNOLWizard.__crumb__.class);
  }
  
  public ClaimTabForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimTabForward.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_UpLink extends ClickableActionElement {
    public FNOLWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FindPolicy extends WizardMenuLinkElement {
    public FindPolicy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_FindPolicyScreen click() {
      clickSelf();
return getFNOLWizard_FindPolicyScreen();
    }
    
    public FNOLWizard_FindPolicyScreen getFNOLWizard_FindPolicyScreen() {
      return getOrCreateWizardStepProperty("FNOLWizard_FindPolicyScreen", "FNOLWizard_FindPolicyScreen", null, pcftest.FNOLWizard_FindPolicyScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FullWizardStepSet extends PCFElement {
    public FullWizardStepSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BasicInfo getBasicInfo() {
      return getOrCreateProperty("BasicInfo", "BasicInfo", null, pcftest.FNOLWizard.FullWizardStepSet.BasicInfo.class);
    }
    
    public LossDetails getLossDetails() {
      return getOrCreateProperty("LossDetails", "LossDetails", null, pcftest.FNOLWizard.FullWizardStepSet.LossDetails.class);
    }
    
    public Services getServices() {
      return getOrCreateProperty("Services", "Services", null, pcftest.FNOLWizard.FullWizardStepSet.Services.class);
    }
    
    public Summary getSummary() {
      return getOrCreateProperty("Summary", "Summary", null, pcftest.FNOLWizard.FullWizardStepSet.Summary.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BasicInfo extends WizardMenuLinkElement {
      public BasicInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public void click() {
        clickSelf();
      }
      
      public FNOLWizard_BasicInfoScreen_WC getFNOLWizard_BasicInfoScreen_WC() {
        return getOrCreateWizardStepProperty("FNOLWizard_BasicInfoScreen_WC", "FNOLWizard_BasicInfoScreen", null, pcftest.FNOLWizard_BasicInfoScreen_WC.class);
      }
      
      public FNOLWizard_BasicInfoScreen_default getFNOLWizard_BasicInfoScreen_default() {
        return getOrCreateWizardStepProperty("FNOLWizard_BasicInfoScreen_default", "FNOLWizard_BasicInfoScreen", null, pcftest.FNOLWizard_BasicInfoScreen_default.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossDetails extends WizardMenuLinkElement {
      public LossDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public void click() {
        clickSelf();
      }
      
      public FNOLWizard_NewLossDetailsScreen_Gl getFNOLWizard_NewLossDetailsScreen_Gl() {
        return getOrCreateWizardStepProperty("FNOLWizard_NewLossDetailsScreen_Gl", "FNOLWizard_NewLossDetailsScreen", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.class);
      }
      
      public FNOLWizard_NewLossDetailsScreen_PR getFNOLWizard_NewLossDetailsScreen_PR() {
        return getOrCreateWizardStepProperty("FNOLWizard_NewLossDetailsScreen_PR", "FNOLWizard_NewLossDetailsScreen", null, pcftest.FNOLWizard_NewLossDetailsScreen_PR.class);
      }
      
      public FNOLWizard_NewLossDetailsScreen_Trav getFNOLWizard_NewLossDetailsScreen_Trav() {
        return getOrCreateWizardStepProperty("FNOLWizard_NewLossDetailsScreen_Trav", "FNOLWizard_NewLossDetailsScreen", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.class);
      }
      
      public FNOLWizard_NewLossDetailsScreen_WC getFNOLWizard_NewLossDetailsScreen_WC() {
        return getOrCreateWizardStepProperty("FNOLWizard_NewLossDetailsScreen_WC", "FNOLWizard_NewLossDetailsScreen", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.class);
      }
      
      public FNOLWizard_NewLossDetailsScreen_default getFNOLWizard_NewLossDetailsScreen_default() {
        return getOrCreateWizardStepProperty("FNOLWizard_NewLossDetailsScreen_default", "FNOLWizard_NewLossDetailsScreen", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Services extends WizardMenuLinkElement {
      public Services(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public void click() {
        clickSelf();
      }
      
      public FNOLWizard_ServicesScreen_Auto getFNOLWizard_ServicesScreen_Auto() {
        return getOrCreateWizardStepProperty("FNOLWizard_ServicesScreen_Auto", "FNOLWizard_ServicesScreen", null, pcftest.FNOLWizard_ServicesScreen_Auto.class);
      }
      
      public FNOLWizard_ServicesScreen_Pr getFNOLWizard_ServicesScreen_Pr() {
        return getOrCreateWizardStepProperty("FNOLWizard_ServicesScreen_Pr", "FNOLWizard_ServicesScreen", null, pcftest.FNOLWizard_ServicesScreen_Pr.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Summary extends WizardMenuLinkElement {
      public Summary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FNOLWizard_AssignSaveScreen click() {
        clickSelf();
return getFNOLWizard_AssignSaveScreen();
      }
      
      public FNOLWizard_AssignSaveScreen getFNOLWizard_AssignSaveScreen() {
        return getOrCreateWizardStepProperty("FNOLWizard_AssignSaveScreen", "FNOLWizard_AssignSaveScreen", null, pcftest.FNOLWizard_AssignSaveScreen.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GeneralPropertyWizardStepSet extends PCFElement {
    public GeneralPropertyWizardStepSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClassicAssign getClassicAssign() {
      return getOrCreateProperty("ClassicAssign", "ClassicAssign", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicAssign.class);
    }
    
    public ClassicDocuments getClassicDocuments() {
      return getOrCreateProperty("ClassicDocuments", "ClassicDocuments", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicDocuments.class);
    }
    
    public ClassicExposures getClassicExposures() {
      return getOrCreateProperty("ClassicExposures", "ClassicExposures", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicExposures.class);
    }
    
    public ClassicLossDetails getClassicLossDetails() {
      return getOrCreateProperty("ClassicLossDetails", "ClassicLossDetails", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicLossDetails.class);
    }
    
    public ClassicMainContacts getClassicMainContacts() {
      return getOrCreateProperty("ClassicMainContacts", "ClassicMainContacts", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicMainContacts.class);
    }
    
    public ClassicPartiesInvolved getClassicPartiesInvolved() {
      return getOrCreateProperty("ClassicPartiesInvolved", "ClassicPartiesInvolved", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicPartiesInvolved.class);
    }
    
    public ClassicSummary getClassicSummary() {
      return getOrCreateProperty("ClassicSummary", "ClassicSummary", null, pcftest.FNOLWizard.GeneralPropertyWizardStepSet.ClassicSummary.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassicAssign extends WizardMenuLinkElement {
      public ClassicAssign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_AssignScreen click() {
        clickSelf();
return getNewClaimWizard_AssignScreen();
      }
      
      public NewClaimWizard_AssignScreen getNewClaimWizard_AssignScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_AssignScreen", "NewClaimWizard_AssignScreen", null, pcftest.NewClaimWizard_AssignScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassicDocuments extends WizardMenuLinkElement {
      public ClassicDocuments(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_DocumentsScreen click() {
        clickSelf();
return getNewClaimWizard_DocumentsScreen();
      }
      
      public NewClaimWizard_DocumentsScreen getNewClaimWizard_DocumentsScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_DocumentsScreen", "NewClaimWizard_DocumentsScreen", null, pcftest.NewClaimWizard_DocumentsScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassicExposures extends WizardMenuLinkElement {
      public ClassicExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_ExposuresScreen click() {
        clickSelf();
return getNewClaimWizard_ExposuresScreen();
      }
      
      public NewClaimWizard_ExposuresScreen getNewClaimWizard_ExposuresScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_ExposuresScreen", "NewClaimWizard_ExposuresScreen", null, pcftest.NewClaimWizard_ExposuresScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassicLossDetails extends WizardMenuLinkElement {
      public ClassicLossDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_LossDetailsScreen click() {
        clickSelf();
return getNewClaimWizard_LossDetailsScreen();
      }
      
      public NewClaimWizard_LossDetailsScreen getNewClaimWizard_LossDetailsScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_LossDetailsScreen", "NewClaimWizard_LossDetailsScreen", null, pcftest.NewClaimWizard_LossDetailsScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassicMainContacts extends WizardMenuLinkElement {
      public ClassicMainContacts(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_MainContactsScreen click() {
        clickSelf();
return getNewClaimWizard_MainContactsScreen();
      }
      
      public NewClaimWizard_MainContactsScreen getNewClaimWizard_MainContactsScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_MainContactsScreen", "NewClaimWizard_MainContactsScreen", null, pcftest.NewClaimWizard_MainContactsScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassicPartiesInvolved extends WizardMenuLinkElement {
      public ClassicPartiesInvolved(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_PartiesInvolvedScreen click() {
        clickSelf();
return getNewClaimWizard_PartiesInvolvedScreen();
      }
      
      public NewClaimWizard_PartiesInvolvedScreen getNewClaimWizard_PartiesInvolvedScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_PartiesInvolvedScreen", "NewClaimWizard_PartiesInvolvedScreen", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassicSummary extends WizardMenuLinkElement {
      public ClassicSummary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_SummaryScreen click() {
        clickSelf();
return getNewClaimWizard_SummaryScreen();
      }
      
      public NewClaimWizard_SummaryScreen getNewClaimWizard_SummaryScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_SummaryScreen", "NewClaimWizard_SummaryScreen", null, pcftest.NewClaimWizard_SummaryScreen.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IndependentWizardStepSet extends PCFElement {
    public IndependentWizardStepSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Documents getDocuments() {
      return getOrCreateProperty("Documents", "Documents", null, pcftest.FNOLWizard.IndependentWizardStepSet.Documents.class);
    }
    
    public Notes getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, pcftest.FNOLWizard.IndependentWizardStepSet.Notes.class);
    }
    
    public PartiesInvolved getPartiesInvolved() {
      return getOrCreateProperty("PartiesInvolved", "PartiesInvolved", null, pcftest.FNOLWizard.IndependentWizardStepSet.PartiesInvolved.class);
    }
    
    public PolicyWizardStepGroup getPolicyWizardStepGroup() {
      return getOrCreateProperty("PolicyWizardStepGroup", "PolicyWizardStepGroup", null, pcftest.FNOLWizard.IndependentWizardStepSet.PolicyWizardStepGroup.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Documents extends WizardMenuLinkElement {
      public Documents(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FNOLWizard_DocumentsScreen click() {
        clickSelf();
return getFNOLWizard_DocumentsScreen();
      }
      
      public FNOLWizard_DocumentsScreen getFNOLWizard_DocumentsScreen() {
        return getOrCreateWizardStepProperty("FNOLWizard_DocumentsScreen", "FNOLWizard_DocumentsScreen", null, pcftest.FNOLWizard_DocumentsScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Notes extends WizardMenuLinkElement {
      public Notes(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FNOLWizard_NotesScreen click() {
        clickSelf();
return getFNOLWizard_NotesScreen();
      }
      
      public FNOLWizard_NotesScreen getFNOLWizard_NotesScreen() {
        return getOrCreateWizardStepProperty("FNOLWizard_NotesScreen", "FNOLWizard_NotesScreen", null, pcftest.FNOLWizard_NotesScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PartiesInvolved extends WizardMenuLinkElement {
      public PartiesInvolved(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_PartiesInvolvedScreen click() {
        clickSelf();
return getNewClaimWizard_PartiesInvolvedScreen();
      }
      
      public NewClaimWizard_PartiesInvolvedScreen getNewClaimWizard_PartiesInvolvedScreen() {
        return getOrCreateWizardStepProperty("NewClaimWizard_PartiesInvolvedScreen", "NewClaimWizard_PartiesInvolvedScreen", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyWizardStepGroup extends WizardMenuLinkElement {
      public PolicyWizardStepGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public void click() {
        clickSelf();
      }
      
      public PolicyDetails getPolicyDetails() {
        return getOrCreateProperty("PolicyDetails", "PolicyDetails", null, pcftest.FNOLWizard.IndependentWizardStepSet.PolicyWizardStepGroup.PolicyDetails.class);
      }
      
      public PolicyGeneral getPolicyGeneral() {
        return getOrCreateProperty("PolicyGeneral", "PolicyGeneral", null, pcftest.FNOLWizard.IndependentWizardStepSet.PolicyWizardStepGroup.PolicyGeneral.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PolicyDetails extends WizardMenuLinkElement {
        public PolicyDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_PolicyDetailsScreen click() {
          clickSelf();
return getNewClaimWizard_PolicyDetailsScreen();
        }
        
        public NewClaimWizard_PolicyDetailsScreen getNewClaimWizard_PolicyDetailsScreen() {
          return getOrCreateWizardStepProperty("NewClaimWizard_PolicyDetailsScreen", "NewClaimWizard_PolicyDetailsScreen", null, pcftest.NewClaimWizard_PolicyDetailsScreen.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PolicyGeneral extends WizardMenuLinkElement {
        public PolicyGeneral(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_PolicyGeneralScreen click() {
          clickSelf();
return getNewClaimWizard_PolicyGeneralScreen();
        }
        
        public NewClaimWizard_PolicyGeneralScreen getNewClaimWizard_PolicyGeneralScreen() {
          return getOrCreateWizardStepProperty("NewClaimWizard_PolicyGeneralScreen", "NewClaimWizard_PolicyGeneralScreen", null, pcftest.NewClaimWizard_PolicyGeneralScreen.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimAutoFirstAndFinal extends WizardMenuLinkElement {
    public QuickClaimAutoFirstAndFinal(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_AutoFirstAndFinalScreen click() {
      clickSelf();
return getFNOLWizard_AutoFirstAndFinalScreen();
    }
    
    public FNOLWizard_AutoFirstAndFinalScreen getFNOLWizard_AutoFirstAndFinalScreen() {
      return getOrCreateWizardStepProperty("FNOLWizard_AutoFirstAndFinalScreen", "FNOLWizard_AutoFirstAndFinalScreen", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimGL extends WizardMenuLinkElement {
    public QuickClaimGL(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimWizard_QuickClaimScreen click() {
      clickSelf();
return getNewClaimWizard_QuickClaimScreen();
    }
    
    public NewClaimWizard_QuickClaimScreen getNewClaimWizard_QuickClaimScreen() {
      return getOrCreateWizardStepProperty("NewClaimWizard_QuickClaimScreen", "NewClaimWizard_QuickClaimScreen", null, pcftest.NewClaimWizard_QuickClaimScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimPr extends WizardMenuLinkElement {
    public QuickClaimPr(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimWizard_QuickClaimScreen click() {
      clickSelf();
return getNewClaimWizard_QuickClaimScreen();
    }
    
    public NewClaimWizard_QuickClaimScreen getNewClaimWizard_QuickClaimScreen() {
      return getOrCreateWizardStepProperty("NewClaimWizard_QuickClaimScreen", "NewClaimWizard_QuickClaimScreen", null, pcftest.NewClaimWizard_QuickClaimScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimTravelBaggageOnly extends WizardMenuLinkElement {
    public QuickClaimTravelBaggageOnly(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_NewQuickClaimScreen click() {
      clickSelf();
return getFNOLWizard_NewQuickClaimScreen();
    }
    
    public FNOLWizard_NewQuickClaimScreen getFNOLWizard_NewQuickClaimScreen() {
      return getOrCreateWizardStepProperty("FNOLWizard_NewQuickClaimScreen", "FNOLWizard_NewQuickClaimScreen", null, pcftest.FNOLWizard_NewQuickClaimScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaimTravelTripCancelOnly extends WizardMenuLinkElement {
    public QuickClaimTravelTripCancelOnly(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_NewQuickClaimScreen click() {
      clickSelf();
return getFNOLWizard_NewQuickClaimScreen();
    }
    
    public FNOLWizard_NewQuickClaimScreen getFNOLWizard_NewQuickClaimScreen() {
      return getOrCreateWizardStepProperty("FNOLWizard_NewQuickClaimScreen", "FNOLWizard_NewQuickClaimScreen", null, pcftest.FNOLWizard_NewQuickClaimScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SelectRiskUnitsStep extends WizardMenuLinkElement {
    public SelectRiskUnitsStep(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_PickPolicyRiskUnitsScreen click() {
      clickSelf();
return getFNOLWizard_PickPolicyRiskUnitsScreen();
    }
    
    public FNOLWizard_PickPolicyRiskUnitsScreen getFNOLWizard_PickPolicyRiskUnitsScreen() {
      return getOrCreateWizardStepProperty("FNOLWizard_PickPolicyRiskUnitsScreen", "FNOLWizard_PickPolicyRiskUnitsScreen", null, pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}