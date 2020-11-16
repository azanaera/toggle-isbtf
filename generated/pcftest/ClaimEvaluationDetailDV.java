package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "97f0d8c1d49aa3e0e3b2b179368912dc";
  
  public ClaimEvaluationDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getEconomicDamages_ClmtOutOfPocket() {
    return getOrCreateProperty("EconomicDamages_ClmtOutOfPocket", "EconomicDamages_ClmtOutOfPocket", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_Diagnostic() {
    return getOrCreateProperty("EconomicDamages_Diagnostic", "EconomicDamages_Diagnostic", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_FutureMedical() {
    return getOrCreateProperty("EconomicDamages_FutureMedical", "EconomicDamages_FutureMedical", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_HospitalER() {
    return getOrCreateProperty("EconomicDamages_HospitalER", "EconomicDamages_HospitalER", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_MedicalEquipment() {
    return getOrCreateProperty("EconomicDamages_MedicalEquipment", "EconomicDamages_MedicalEquipment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_Other() {
    return getOrCreateProperty("EconomicDamages_Other", "EconomicDamages_Other", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_PhysicalTherapy() {
    return getOrCreateProperty("EconomicDamages_PhysicalTherapy", "EconomicDamages_PhysicalTherapy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_Total() {
    return getOrCreateProperty("EconomicDamages_Total", "EconomicDamages_Total", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEconomicDamages_TreatingPhysician() {
    return getOrCreateProperty("EconomicDamages_TreatingPhysician", "EconomicDamages_TreatingPhysician", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLiabilityDistribution_ClaimantLiability() {
    return getOrCreateProperty("LiabilityDistribution_ClaimantLiability", "LiabilityDistribution_ClaimantLiability", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLiabilityDistribution_InsuredLiability() {
    return getOrCreateProperty("LiabilityDistribution_InsuredLiability", "LiabilityDistribution_InsuredLiability", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLiabilityDistribution_OtherLiability() {
    return getOrCreateProperty("LiabilityDistribution_OtherLiability", "LiabilityDistribution_OtherLiability", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNonEconomicDamages_High() {
    return getOrCreateProperty("NonEconomicDamages_High", "NonEconomicDamages_High", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNonEconomicDamages_Likely() {
    return getOrCreateProperty("NonEconomicDamages_Likely", "NonEconomicDamages_Likely", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNonEconomicDamages_Low() {
    return getOrCreateProperty("NonEconomicDamages_Low", "NonEconomicDamages_Low", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getNote_RelatedTo() {
    return getOrCreateProperty("Note_RelatedTo", "Note_RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getTotalValue_Amount() {
    return getOrCreateProperty("TotalValue_Amount", "TotalValue_Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalValue_AvailableReserves() {
    return getOrCreateProperty("TotalValue_AvailableReserves", "TotalValue_AvailableReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalValue_High() {
    return getOrCreateProperty("TotalValue_High", "TotalValue_High", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalValue_Likely() {
    return getOrCreateProperty("TotalValue_Likely", "TotalValue_Likely", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalValue_Low() {
    return getOrCreateProperty("TotalValue_Low", "TotalValue_Low", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalValue_TotalIncurredNet() {
    return getOrCreateProperty("TotalValue_TotalIncurredNet", "TotalValue_TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}