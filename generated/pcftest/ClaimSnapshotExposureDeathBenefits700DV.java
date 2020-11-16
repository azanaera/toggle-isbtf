package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposureDeathBenefits700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureDeathBenefits700DV extends DetailViewElement {
  public final static String CHECKSUM = "5e277eccbb8f2df0e3cbdd1a62b7656c";
  
  public ClaimSnapshotExposureDeathBenefits700DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getLostWagesBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsBeginDate", "LostWagesBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_BenefitsEndDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsEndDate", "LostWagesBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_Description() {
    return getOrCreateProperty("LostWagesBenefits_Description", "LostWagesBenefits_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_MaxBurialRate() {
    return getOrCreateProperty("LostWagesBenefits_MaxBurialRate", "LostWagesBenefits_MaxBurialRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_PaymentFrequency() {
    return getOrCreateProperty("LostWagesBenefits_PaymentFrequency", "LostWagesBenefits_PaymentFrequency", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_WeeklyCompRate() {
    return getOrCreateProperty("LostWagesBenefits_WeeklyCompRate", "LostWagesBenefits_WeeklyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}