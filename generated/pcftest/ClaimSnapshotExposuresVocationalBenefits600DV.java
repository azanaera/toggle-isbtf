package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresVocationalBenefits600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresVocationalBenefits600DV extends DetailViewElement {
  public final static String CHECKSUM = "5f5af85468d24db75f5f075ec3603255";
  
  public ClaimSnapshotExposuresVocationalBenefits600DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCaseManagementCompany_PrimaryAddress() {
    return getOrCreateProperty("CaseManagementCompany_PrimaryAddress", "CaseManagementCompany_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCaseManagementCompany_PrimaryPhone() {
    return getOrCreateProperty("CaseManagementCompany_PrimaryPhone", "CaseManagementCompany_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCaseMgr_PrimaryPhone() {
    return getOrCreateProperty("CaseMgr_PrimaryPhone", "CaseMgr_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getLostWagesBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsBeginDate", "LostWagesBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getLostWagesBenefits_BenefitsEndDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsEndDate", "LostWagesBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getLostWagesBenefits_CaseManagementCompany() {
    return getOrCreateProperty("LostWagesBenefits_CaseManagementCompany", "LostWagesBenefits_CaseManagementCompany", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_CaseManager() {
    return getOrCreateProperty("LostWagesBenefits_CaseManager", "LostWagesBenefits_CaseManager", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_Description() {
    return getOrCreateProperty("LostWagesBenefits_Description", "LostWagesBenefits_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}