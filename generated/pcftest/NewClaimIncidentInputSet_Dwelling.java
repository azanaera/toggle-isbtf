package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimIncidentInputSet_Dwelling.Dwelling_Incident;
import pcftest.NewClaimIncidentInputSet_Dwelling.Dwelling_Incident.NewClaimDwellingDV_EditIncidentMenuItem;
import pcftest.NewClaimIncidentInputSet_Dwelling.Dwelling_Incident.NewClaimDwellingDV_NewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimIncidentInputSet_Dwelling extends NewClaimIncidentInputSet {
  public final static String CHECKSUM = "e19082e617be8b6e2e17d5d842f091b9";
  
  public NewClaimIncidentInputSet_Dwelling(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Dwelling_Incident getDwelling_Incident() {
    return getOrCreateProperty("Dwelling_Incident", "Dwelling_Incident", null, pcftest.NewClaimIncidentInputSet_Dwelling.Dwelling_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_Incident extends SelectElement {
    public Dwelling_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimDwellingDV_EditIncidentMenuItem getNewClaimDwellingDV_EditIncidentMenuItem() {
      return getOrCreateProperty("NewClaimDwellingDV_EditIncidentMenuItem", "NewClaimDwellingDV_EditIncidentMenuItem", null, pcftest.NewClaimIncidentInputSet_Dwelling.Dwelling_Incident.NewClaimDwellingDV_EditIncidentMenuItem.class);
    }
    
    public NewClaimDwellingDV_NewIncidentMenuItem getNewClaimDwellingDV_NewIncidentMenuItem() {
      return getOrCreateProperty("NewClaimDwellingDV_NewIncidentMenuItem", "NewClaimDwellingDV_NewIncidentMenuItem", null, pcftest.NewClaimIncidentInputSet_Dwelling.Dwelling_Incident.NewClaimDwellingDV_NewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimDwellingDV_EditIncidentMenuItem extends ClickableActionElement {
      public NewClaimDwellingDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditDwellingIncidentPopup click() {
        return clickThis(pcftest.EditDwellingIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimDwellingDV_NewIncidentMenuItem extends ClickableActionElement {
      public NewClaimDwellingDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewDwellingIncidentPopup click() {
        return clickThis(pcftest.NewDwellingIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}