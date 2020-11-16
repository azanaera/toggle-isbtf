package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BIDamageInputSet.Injury_Incident;
import pcftest.BIDamageInputSet.Injury_Incident.BodilyInjuryDamageDV_EditIncidentMenuItem;
import pcftest.BIDamageInputSet.Injury_Incident.BodilyInjuryDamageDV_NewIncidentMenuItem;
import pcftest.BIDamageInputSet.Injury_Incident.BodilyInjuryDamageDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/BIDamageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BIDamageInputSet extends PCFElement {
  public final static String CHECKSUM = "bebe9a9f061b8d641b4eb5a55f5b62cd";
  
  public BIDamageInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getIncident_Description() {
    return getOrCreateProperty("Incident_Description", "Incident_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getIncident_Injured() {
    return getOrCreateProperty("Incident_Injured", "Incident_Injured", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Injury_Incident getInjury_Incident() {
    return getOrCreateProperty("Injury_Incident", "Injury_Incident", null, pcftest.BIDamageInputSet.Injury_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/BIDamageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Injury_Incident extends SelectElement {
    public Injury_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BodilyInjuryDamageDV_EditIncidentMenuItem getBodilyInjuryDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("BodilyInjuryDamageDV_EditIncidentMenuItem", "BodilyInjuryDamageDV_EditIncidentMenuItem", null, pcftest.BIDamageInputSet.Injury_Incident.BodilyInjuryDamageDV_EditIncidentMenuItem.class);
    }
    
    public BodilyInjuryDamageDV_NewIncidentMenuItem getBodilyInjuryDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("BodilyInjuryDamageDV_NewIncidentMenuItem", "BodilyInjuryDamageDV_NewIncidentMenuItem", null, pcftest.BIDamageInputSet.Injury_Incident.BodilyInjuryDamageDV_NewIncidentMenuItem.class);
    }
    
    public BodilyInjuryDamageDV_ViewIncidentMenuItem getBodilyInjuryDamageDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("BodilyInjuryDamageDV_ViewIncidentMenuItem", "BodilyInjuryDamageDV_ViewIncidentMenuItem", null, pcftest.BIDamageInputSet.Injury_Incident.BodilyInjuryDamageDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/BIDamageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BodilyInjuryDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public BodilyInjuryDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditInjuryIncidentPopup click() {
        return clickThis(pcftest.EditInjuryIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/BIDamageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BodilyInjuryDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public BodilyInjuryDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewInjuryIncidentPopup click() {
        return clickThis(pcftest.NewInjuryIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/BIDamageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BodilyInjuryDamageDV_ViewIncidentMenuItem extends ClickableActionElement {
      public BodilyInjuryDamageDV_ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditInjuryIncidentPopup click() {
        return clickThis(pcftest.EditInjuryIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}