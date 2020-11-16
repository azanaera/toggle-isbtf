package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DwellingIncidentCV.Dwelling_AssessmentCardTab;
import pcftest.DwellingIncidentCV.Dwelling_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/DwellingIncidentCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DwellingIncidentCV extends PCFElement {
  public final static String CHECKSUM = "35aaf736a1f84155e5caad94105b71d3";
  
  public DwellingIncidentCV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DwellingIncidentPanelSet getDwellingIncidentPanelSet() {
    return getOrCreateProperty("DwellingIncidentPanelSet", "DwellingIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.DwellingIncidentPanelSet.class);
  }
  
  public Dwelling_AssessmentCardTab getDwelling_AssessmentCardTab() {
    return getOrCreateProperty("Dwelling_AssessmentCardTab", "Dwelling_AssessmentCardTab", null, pcftest.DwellingIncidentCV.Dwelling_AssessmentCardTab.class);
  }
  
  public Dwelling_DetailsCardTab getDwelling_DetailsCardTab() {
    return getOrCreateProperty("Dwelling_DetailsCardTab", "Dwelling_DetailsCardTab", null, pcftest.DwellingIncidentCV.Dwelling_DetailsCardTab.class);
  }
  
  public IncidentAssessDV getIncidentAssessDV() {
    return getOrCreateProperty("IncidentAssessDV", "IncidentAssessDV", null, pcftest.IncidentAssessDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingIncidentCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_AssessmentCardTab extends ClickableActionElement {
    public Dwelling_AssessmentCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingIncidentCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_DetailsCardTab extends ClickableActionElement {
    public Dwelling_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}