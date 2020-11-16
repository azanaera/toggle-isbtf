package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherStructureDamageDV.Other_Structure_Incident;
import pcftest.OtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_EditIncidentMenuItem;
import pcftest.OtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_NewIncidentMenuItem;
import pcftest.OtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/OtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherStructureDamageDV extends DetailViewElement {
  public final static String CHECKSUM = "2593fc9b29d0dd5f6765b07318764203";
  
  public OtherStructureDamageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeductibleInfoInputSet getDeductibleInfoInputSet() {
    return getOrCreateProperty("DeductibleInfoInputSet", "DeductibleInfoInputSet", null, pcftest.DeductibleInfoInputSet.class);
  }
  
  public ExposureCodingFinancialsInputSet getExposureCodingFinancialsInputSet() {
    return getOrCreateProperty("ExposureCodingFinancialsInputSet", "ExposureCodingFinancialsInputSet", null, pcftest.ExposureCodingFinancialsInputSet.class);
  }
  
  public ExposureDetailInputSet getExposureDetailInputSet() {
    return getOrCreateProperty("ExposureDetailInputSet", "ExposureDetailInputSet", null, pcftest.ExposureDetailInputSet.class);
  }
  
  public ExposureWorkloadInputSet getExposureWorkloadInputSet() {
    return getOrCreateProperty("ExposureWorkloadInputSet", "ExposureWorkloadInputSet", null, pcftest.ExposureWorkloadInputSet.class);
  }
  
  public OtherCarrierInvolvementInputSet getOtherCarrierInvolvementInputSet() {
    return getOrCreateProperty("OtherCarrierInvolvementInputSet", "OtherCarrierInvolvementInputSet", null, pcftest.OtherCarrierInvolvementInputSet.class);
  }
  
  public Other_Structure_Incident getOther_Structure_Incident() {
    return getOrCreateProperty("Other_Structure_Incident", "Other_Structure_Incident", null, pcftest.OtherStructureDamageDV.Other_Structure_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/OtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Other_Structure_Incident extends SelectElement {
    public Other_Structure_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OtherStructureDamageDV_EditIncidentMenuItem getOtherStructureDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("OtherStructureDamageDV_EditIncidentMenuItem", "OtherStructureDamageDV_EditIncidentMenuItem", null, pcftest.OtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_EditIncidentMenuItem.class);
    }
    
    public OtherStructureDamageDV_NewIncidentMenuItem getOtherStructureDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("OtherStructureDamageDV_NewIncidentMenuItem", "OtherStructureDamageDV_NewIncidentMenuItem", null, pcftest.OtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_NewIncidentMenuItem.class);
    }
    
    public OtherStructureDamageDV_ViewIncidentMenuItem getOtherStructureDamageDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("OtherStructureDamageDV_ViewIncidentMenuItem", "OtherStructureDamageDV_ViewIncidentMenuItem", null, pcftest.OtherStructureDamageDV.Other_Structure_Incident.OtherStructureDamageDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/OtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherStructureDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public OtherStructureDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditOtherStructureIncidentPopup click() {
        return clickThis(pcftest.EditOtherStructureIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/OtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherStructureDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public OtherStructureDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewOtherStructureIncidentPopup click() {
        return clickThis(pcftest.NewOtherStructureIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/OtherStructureDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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