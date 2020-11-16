package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresVocationalBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresVocationalBenefitsDV extends DetailViewElement {
  public final static String CHECKSUM = "055058a4b2f52e45a475d8bb46384bc3";
  
  public ClaimSnapshotExposuresVocationalBenefitsDV(ISmokeTest helper, PCFElementId componentId)  {
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