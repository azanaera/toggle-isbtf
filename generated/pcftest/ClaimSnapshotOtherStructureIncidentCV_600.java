package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotOtherStructureIncidentCV_600.Dwelling_AssessmentCardTab;
import pcftest.ClaimSnapshotOtherStructureIncidentCV_600.OtherIncident_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherStructureIncidentCV_600 extends ClaimSnapshotOtherStructureIncidentCV {
  public final static String CHECKSUM = "0bd828a22242688671386bcc7069030a";
  
  public ClaimSnapshotOtherStructureIncidentCV_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAlreadyRepaired() {
    return getOrCreateProperty("AlreadyRepaired", "AlreadyRepaired", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_600 getClaimSnapshotIncidentAssessDV_600() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_600", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_600.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_700 getClaimSnapshotIncidentAssessDV_700() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_700", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_700.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_800 getClaimSnapshotIncidentAssessDV_800() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_800", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_800.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_default getClaimSnapshotIncidentAssessDV_default() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_default", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_default.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_600 getClaimSnapshotIncidentRelatedExposuresPanelSet_600() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_600", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_600.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_700 getClaimSnapshotIncidentRelatedExposuresPanelSet_700() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_700", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_800 getClaimSnapshotIncidentRelatedExposuresPanelSet_800() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_800", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_800.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_default getClaimSnapshotIncidentRelatedExposuresPanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_default", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_default.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Dwelling_AssessmentCardTab getDwelling_AssessmentCardTab() {
    return getOrCreateProperty("Dwelling_AssessmentCardTab", "Dwelling_AssessmentCardTab", null, pcftest.ClaimSnapshotOtherStructureIncidentCV_600.Dwelling_AssessmentCardTab.class);
  }
  
  public ValueElement getEstimateCost() {
    return getOrCreateProperty("EstimateCost", "EstimateCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateTime() {
    return getOrCreateProperty("EstimateTime", "EstimateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimatesReceived() {
    return getOrCreateProperty("EstimatesReceived", "EstimatesReceived", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFencesDamaged() {
    return getOrCreateProperty("FencesDamaged", "FencesDamaged", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OtherIncident_DetailsCardTab getOtherIncident_DetailsCardTab() {
    return getOrCreateProperty("OtherIncident_DetailsCardTab", "OtherIncident_DetailsCardTab", null, pcftest.ClaimSnapshotOtherStructureIncidentCV_600.OtherIncident_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_AssessmentCardTab extends ClickableActionElement {
    public Dwelling_AssessmentCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherIncident_DetailsCardTab extends ClickableActionElement {
    public OtherIncident_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}