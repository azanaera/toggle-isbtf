package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimIncidentInputSet_Propertydamage.Property_Incident;
import pcftest.NewClaimIncidentInputSet_Propertydamage.Property_Incident.NewClaimPropertyDamageDV_EditIncidentMenuItem;
import pcftest.NewClaimIncidentInputSet_Propertydamage.Property_Incident.NewClaimPropertyDamageDV_NewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimIncidentInputSet_Propertydamage extends NewClaimIncidentInputSet {
  public final static String CHECKSUM = "650b94a6176d3dd6046fa18da89b1226";
  
  public NewClaimIncidentInputSet_Propertydamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Property_Incident getProperty_Incident() {
    return getOrCreateProperty("Property_Incident", "Property_Incident", null, pcftest.NewClaimIncidentInputSet_Propertydamage.Property_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Property_Incident extends SelectElement {
    public Property_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimPropertyDamageDV_EditIncidentMenuItem getNewClaimPropertyDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("NewClaimPropertyDamageDV_EditIncidentMenuItem", "NewClaimPropertyDamageDV_EditIncidentMenuItem", null, pcftest.NewClaimIncidentInputSet_Propertydamage.Property_Incident.NewClaimPropertyDamageDV_EditIncidentMenuItem.class);
    }
    
    public NewClaimPropertyDamageDV_NewIncidentMenuItem getNewClaimPropertyDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("NewClaimPropertyDamageDV_NewIncidentMenuItem", "NewClaimPropertyDamageDV_NewIncidentMenuItem", null, pcftest.NewClaimIncidentInputSet_Propertydamage.Property_Incident.NewClaimPropertyDamageDV_NewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimPropertyDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public NewClaimPropertyDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditFixedPropertyIncidentPopup click() {
        return clickThis(pcftest.EditFixedPropertyIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimPropertyDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public NewClaimPropertyDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewFixedPropertyIncidentPopup click() {
        return clickThis(pcftest.NewFixedPropertyIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}