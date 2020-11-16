package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherStructureIncidentCV.OtherStructure_AssessmentCardTab;
import pcftest.OtherStructureIncidentCV.OtherStructure_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/OtherStructureIncidentCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherStructureIncidentCV extends PCFElement {
  public final static String CHECKSUM = "d1a45ec767390be0ce229f3f8e1bc7d8";
  
  public OtherStructureIncidentCV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IncidentAssessDV getIncidentAssessDV() {
    return getOrCreateProperty("IncidentAssessDV", "IncidentAssessDV", null, pcftest.IncidentAssessDV.class);
  }
  
  public OtherStructureIncidentPanelSet getOtherStructureIncidentPanelSet() {
    return getOrCreateProperty("OtherStructureIncidentPanelSet", "OtherStructureIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.OtherStructureIncidentPanelSet.class);
  }
  
  public OtherStructure_AssessmentCardTab getOtherStructure_AssessmentCardTab() {
    return getOrCreateProperty("OtherStructure_AssessmentCardTab", "OtherStructure_AssessmentCardTab", null, pcftest.OtherStructureIncidentCV.OtherStructure_AssessmentCardTab.class);
  }
  
  public OtherStructure_DetailsCardTab getOtherStructure_DetailsCardTab() {
    return getOrCreateProperty("OtherStructure_DetailsCardTab", "OtherStructure_DetailsCardTab", null, pcftest.OtherStructureIncidentCV.OtherStructure_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/OtherStructureIncidentCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructure_AssessmentCardTab extends ClickableActionElement {
    public OtherStructure_AssessmentCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/OtherStructureIncidentCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructure_DetailsCardTab extends ClickableActionElement {
    public OtherStructure_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}