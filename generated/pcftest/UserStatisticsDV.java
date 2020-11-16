package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserStatisticsDV extends DetailViewElement {
  public final static String CHECKSUM = "02d444ca9508721c5023003a3663f62c";
  
  public UserStatisticsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_ClosedClaims() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_ClosedClaims", "NVV_Admin_UserStatistics_Statistics_ClosedClaims", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_CompletedActivities() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_CompletedActivities", "NVV_Admin_UserStatistics_Statistics_CompletedActivities", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_NewClaims() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_NewClaims", "NVV_Admin_UserStatistics_Statistics_NewClaims", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_OpenActivities() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_OpenActivities", "NVV_Admin_UserStatistics_Statistics_OpenActivities", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_OpenClaims() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_OpenClaims", "NVV_Admin_UserStatistics_Statistics_OpenClaims", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_OverdueActivities() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_OverdueActivities", "NVV_Admin_UserStatistics_Statistics_OverdueActivities", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_Team_ClosedClaims() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_Team_ClosedClaims", "NVV_Admin_UserStatistics_Statistics_Team_ClosedClaims", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_Team_NewClaims() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_Team_NewClaims", "NVV_Admin_UserStatistics_Statistics_Team_NewClaims", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_Team_OpenClaims() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_Team_OpenClaims", "NVV_Admin_UserStatistics_Statistics_Team_OpenClaims", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Admin_UserStatistics_Statistics_Team_OverdueActivities() {
    return getOrCreateProperty("NVV_Admin_UserStatistics_Statistics_Team_OverdueActivities", "NVV_Admin_UserStatistics_Statistics_Team_OverdueActivities", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getTimestamp() {
    return getOrCreateProperty("Timestamp", "Timestamp", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  
}