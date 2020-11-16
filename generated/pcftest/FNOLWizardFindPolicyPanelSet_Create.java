package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.EndorsementsCardTab;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimEndorsementsLV_tb;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimStatCodesLV_tb;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimVehiclesLV_tb;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationLDV_tb;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationsCardTab;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyTripLV_tb;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.StatCodeCardTab;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.TripsCardTab;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.Type;
import pcftest.FNOLWizardFindPolicyPanelSet_Create.VehiclesCardTab;
import typekey.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardFindPolicyPanelSet_Create extends FNOLWizardFindPolicyPanelSet {
  public final static String CHECKSUM = "ca6baa7a709c43d9243c8f945b060210";
  
  public FNOLWizardFindPolicyPanelSet_Create(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getClaimLossType() {
    return getOrCreateProperty("ClaimLossType", "ClaimLossType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getClaimNumber2() {
    return getOrCreateProperty("ClaimNumber2", "ClaimNumber2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getClaim_LossDate() {
    return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getClaim_lossTime() {
    return getOrCreateProperty("Claim_lossTime", "Claim_lossTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public EndorsementsCardTab getEndorsementsCardTab() {
    return getOrCreateProperty("EndorsementsCardTab", "EndorsementsCardTab", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.EndorsementsCardTab.class);
  }
  
  public NewClaimEndorsementsLV getNewClaimEndorsementsLV() {
    return getOrCreateProperty("NewClaimEndorsementsLV", "NewClaimEndorsementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimEndorsementsLV.class);
  }
  
  public NewClaimEndorsementsLV_tb getNewClaimEndorsementsLV_tb() {
    return getOrCreateProperty("NewClaimEndorsementsLV_tb", "NewClaimEndorsementsLV_tb", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimEndorsementsLV_tb.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Auto getNewClaimPolicyGeneralPanelSet_Auto() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Auto", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Auto.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Gl getNewClaimPolicyGeneralPanelSet_Gl() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Gl", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Gl.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Pr getNewClaimPolicyGeneralPanelSet_Pr() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Pr", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Pr.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Trav getNewClaimPolicyGeneralPanelSet_Trav() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Trav", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Trav.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Wc getNewClaimPolicyGeneralPanelSet_Wc() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Wc", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Wc.class);
  }
  
  public NewClaimStatCodesLV getNewClaimStatCodesLV() {
    return getOrCreateProperty("NewClaimStatCodesLV", "NewClaimStatCodesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimStatCodesLV.class);
  }
  
  public NewClaimStatCodesLV_tb getNewClaimStatCodesLV_tb() {
    return getOrCreateProperty("NewClaimStatCodesLV_tb", "NewClaimStatCodesLV_tb", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimStatCodesLV_tb.class);
  }
  
  public NewClaimVehiclesLV getNewClaimVehiclesLV() {
    return getOrCreateProperty("NewClaimVehiclesLV", "NewClaimVehiclesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimVehiclesLV.class);
  }
  
  public NewClaimVehiclesLV_tb getNewClaimVehiclesLV_tb() {
    return getOrCreateProperty("NewClaimVehiclesLV_tb", "NewClaimVehiclesLV_tb", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimVehiclesLV_tb.class);
  }
  
  public PolicyLocationLDV getPolicyLocationLDV() {
    return getOrCreateProperty("PolicyLocationLDV", "PolicyLocationLDV", null, pcftest.PolicyLocationLDV.class);
  }
  
  public PolicyLocationLDV_tb getPolicyLocationLDV_tb() {
    return getOrCreateProperty("PolicyLocationLDV_tb", "PolicyLocationLDV_tb", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationLDV_tb.class);
  }
  
  public PolicyLocationsCardTab getPolicyLocationsCardTab() {
    return getOrCreateProperty("PolicyLocationsCardTab", "PolicyLocationsCardTab", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationsCardTab.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PolicyTripLV getPolicyTripLV() {
    return getOrCreateProperty("PolicyTripLV", "PolicyTripLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyTripLV.class);
  }
  
  public PolicyTripLV_tb getPolicyTripLV_tb() {
    return getOrCreateProperty("PolicyTripLV_tb", "PolicyTripLV_tb", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyTripLV_tb.class);
  }
  
  public StatCodeCardTab getStatCodeCardTab() {
    return getOrCreateProperty("StatCodeCardTab", "StatCodeCardTab", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.StatCodeCardTab.class);
  }
  
  public TripsCardTab getTripsCardTab() {
    return getOrCreateProperty("TripsCardTab", "TripsCardTab", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.TripsCardTab.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.Type.class);
  }
  
  public VehiclesCardTab getVehiclesCardTab() {
    return getOrCreateProperty("VehiclesCardTab", "VehiclesCardTab", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.VehiclesCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndorsementsCardTab extends ClickableActionElement {
    public EndorsementsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimEndorsementsLV_tb extends PCFElement {
    public NewClaimEndorsementsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimEndorsementsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimEndorsementsLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimEndorsementsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimEndorsementsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimStatCodesLV_tb extends PCFElement {
    public NewClaimStatCodesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimStatCodesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimStatCodesLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimStatCodesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimStatCodesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimVehiclesLV_tb extends PCFElement {
    public NewClaimVehiclesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimVehiclesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimVehiclesLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimVehiclesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.NewClaimVehiclesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationLDV_tb extends PCFElement {
    public PolicyLocationLDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationLDV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationLDV_tb.Add.class);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationLDV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyLocationLDV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationsCardTab extends ClickableActionElement {
    public PolicyLocationsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTripLV_tb extends PCFElement {
    public PolicyTripLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyTripLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyTripLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyTripLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizardFindPolicyPanelSet_Create.PolicyTripLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatCodeCardTab extends ClickableActionElement {
    public StatCodeCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripsCardTab extends ClickableActionElement {
    public TripsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PolicyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PolicyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PolicyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehiclesCardTab extends ClickableActionElement {
    public VehiclesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}