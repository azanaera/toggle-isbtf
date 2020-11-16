package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident;
import pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident.PropertyDamageDV_EditIncidentMenuItem;
import pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident.PropertyDamageDV_NewIncidentMenuItem;
import pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident.PropertyDamageDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyIncidentInputSet_Dwelling extends PropertyIncidentInputSet {
  public final static String CHECKSUM = "c449b36bd08e536b02e5bbf68caca271";
  
  public PropertyIncidentInputSet_Dwelling(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Dwelling_Incident getDwelling_Incident() {
    return getOrCreateProperty("Dwelling_Incident", "Dwelling_Incident", null, pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_Incident extends SelectElement {
    public Dwelling_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PropertyDamageDV_EditIncidentMenuItem getPropertyDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("PropertyDamageDV_EditIncidentMenuItem", "PropertyDamageDV_EditIncidentMenuItem", null, pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident.PropertyDamageDV_EditIncidentMenuItem.class);
    }
    
    public PropertyDamageDV_NewIncidentMenuItem getPropertyDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("PropertyDamageDV_NewIncidentMenuItem", "PropertyDamageDV_NewIncidentMenuItem", null, pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident.PropertyDamageDV_NewIncidentMenuItem.class);
    }
    
    public PropertyDamageDV_ViewIncidentMenuItem getPropertyDamageDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("PropertyDamageDV_ViewIncidentMenuItem", "PropertyDamageDV_ViewIncidentMenuItem", null, pcftest.PropertyIncidentInputSet_Dwelling.Dwelling_Incident.PropertyDamageDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public PropertyDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditDwellingIncidentPopup click() {
        return clickThis(pcftest.EditDwellingIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public PropertyDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewDwellingIncidentPopup click() {
        return clickThis(pcftest.NewDwellingIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDamageDV_ViewIncidentMenuItem extends ClickableActionElement {
      public PropertyDamageDV_ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditDwellingIncidentPopup click() {
        return clickThis(pcftest.EditDwellingIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}