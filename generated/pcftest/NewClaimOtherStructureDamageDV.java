package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident;
import pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_EditIncidentMenuItem;
import pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_NewIncidentMenuItem;
import pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimOtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimOtherStructureDamageDV extends DetailViewElement {
  public final static String CHECKSUM = "89b7beffa562f678ef09b7458d91cb6a";
  
  public NewClaimOtherStructureDamageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ExposureDetailInputSet getExposureDetailInputSet() {
    return getOrCreateProperty("ExposureDetailInputSet", "ExposureDetailInputSet", null, pcftest.ExposureDetailInputSet.class);
  }
  
  public OtherCarrierInvolvementInputSet getOtherCarrierInvolvementInputSet() {
    return getOrCreateProperty("OtherCarrierInvolvementInputSet", "OtherCarrierInvolvementInputSet", null, pcftest.OtherCarrierInvolvementInputSet.class);
  }
  
  public Other_Structure_Incident getOther_Structure_Incident() {
    return getOrCreateProperty("Other_Structure_Incident", "Other_Structure_Incident", null, pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimOtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Other_Structure_Incident extends SelectElement {
    public Other_Structure_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OtherStructureDamageDV_EditIncidentMenuItem getOtherStructureDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("OtherStructureDamageDV_EditIncidentMenuItem", "OtherStructureDamageDV_EditIncidentMenuItem", null, pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_EditIncidentMenuItem.class);
    }
    
    public OtherStructureDamageDV_NewIncidentMenuItem getOtherStructureDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("OtherStructureDamageDV_NewIncidentMenuItem", "OtherStructureDamageDV_NewIncidentMenuItem", null, pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_NewIncidentMenuItem.class);
    }
    
    public OtherStructureDamageDV_ViewIncidentMenuItem getOtherStructureDamageDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("OtherStructureDamageDV_ViewIncidentMenuItem", "OtherStructureDamageDV_ViewIncidentMenuItem", null, pcftest.NewClaimOtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimOtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherStructureDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public OtherStructureDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditOtherStructureIncidentPopup click() {
        return clickThis(pcftest.EditOtherStructureIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimOtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherStructureDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public OtherStructureDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewOtherStructureIncidentPopup click() {
        return clickThis(pcftest.NewOtherStructureIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimOtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherStructureDamageDV_ViewIncidentMenuItem extends ClickableActionElement {
      public OtherStructureDamageDV_ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditOtherStructureIncidentPopup click() {
        return clickThis(pcftest.EditOtherStructureIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}