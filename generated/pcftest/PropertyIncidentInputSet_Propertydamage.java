package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident;
import pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident.PropertyDamageDV_EditIncidentMenuItem;
import pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident.PropertyDamageDV_NewIncidentMenuItem;
import pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident.PropertyDamageDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyIncidentInputSet_Propertydamage extends PropertyIncidentInputSet {
  public final static String CHECKSUM = "042b5e96dd78099daf35b4dadbaee857";
  
  public PropertyIncidentInputSet_Propertydamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Property_Incident getProperty_Incident() {
    return getOrCreateProperty("Property_Incident", "Property_Incident", null, pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Property_Incident extends SelectElement {
    public Property_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PropertyDamageDV_EditIncidentMenuItem getPropertyDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("PropertyDamageDV_EditIncidentMenuItem", "PropertyDamageDV_EditIncidentMenuItem", null, pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident.PropertyDamageDV_EditIncidentMenuItem.class);
    }
    
    public PropertyDamageDV_NewIncidentMenuItem getPropertyDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("PropertyDamageDV_NewIncidentMenuItem", "PropertyDamageDV_NewIncidentMenuItem", null, pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident.PropertyDamageDV_NewIncidentMenuItem.class);
    }
    
    public PropertyDamageDV_ViewIncidentMenuItem getPropertyDamageDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("PropertyDamageDV_ViewIncidentMenuItem", "PropertyDamageDV_ViewIncidentMenuItem", null, pcftest.PropertyIncidentInputSet_Propertydamage.Property_Incident.PropertyDamageDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public PropertyDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditFixedPropertyIncidentPopup click() {
        return clickThis(pcftest.EditFixedPropertyIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public PropertyDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewFixedPropertyIncidentPopup click() {
        return clickThis(pcftest.NewFixedPropertyIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PropertyIncidentInputSet.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDamageDV_ViewIncidentMenuItem extends ClickableActionElement {
      public PropertyDamageDV_ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditFixedPropertyIncidentPopup click() {
        return clickThis(pcftest.EditFixedPropertyIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}