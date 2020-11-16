package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FixPropIncidentDetailDV.FixPropIncidentAssessDV_tb;
import pcftest.FixPropIncidentDetailDV.FixPropIncidentAssessDV_tb.Add;
import pcftest.FixPropIncidentDetailDV.FixPropIncidentAssessDV_tb.Remove;
import pcftest.FixPropIncidentDetailDV.Incident_AssessmentTab;
import pcftest.FixPropIncidentDetailDV.Vehicle_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropIncidentDetailDV extends PCFElement {
  public final static String CHECKSUM = "4d2c0ad37aa245479a76a0c20aa373d3";
  
  public FixPropIncidentDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FixPropIncidentAssessDV getFixPropIncidentAssessDV() {
    return getOrCreateProperty("FixPropIncidentAssessDV", "FixPropIncidentAssessDV", null, pcftest.FixPropIncidentAssessDV.class);
  }
  
  public FixPropIncidentAssessDV_tb getFixPropIncidentAssessDV_tb() {
    return getOrCreateProperty("FixPropIncidentAssessDV_tb", "FixPropIncidentAssessDV_tb", null, pcftest.FixPropIncidentDetailDV.FixPropIncidentAssessDV_tb.class);
  }
  
  public FixedPropertyIncidentDV getFixedPropertyIncidentDV() {
    return getOrCreateProperty("FixedPropertyIncidentDV", "FixedPropertyIncidentDV", null, pcftest.FixedPropertyIncidentDV.class);
  }
  
  public Incident_AssessmentTab getIncident_AssessmentTab() {
    return getOrCreateProperty("Incident_AssessmentTab", "Incident_AssessmentTab", null, pcftest.FixPropIncidentDetailDV.Incident_AssessmentTab.class);
  }
  
  public Vehicle_DetailsCardTab getVehicle_DetailsCardTab() {
    return getOrCreateProperty("Vehicle_DetailsCardTab", "Vehicle_DetailsCardTab", null, pcftest.FixPropIncidentDetailDV.Vehicle_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropIncidentAssessDV_tb extends PCFElement {
    public FixPropIncidentAssessDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FixPropIncidentDetailDV.FixPropIncidentAssessDV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FixPropIncidentDetailDV.FixPropIncidentAssessDV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Incident_AssessmentTab extends ClickableActionElement {
    public Incident_AssessmentTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_DetailsCardTab extends ClickableActionElement {
    public Vehicle_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}