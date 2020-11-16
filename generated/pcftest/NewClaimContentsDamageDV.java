package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimContentsDamageDV.Property_Contents_Incident;
import pcftest.NewClaimContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_EditIncidentMenuItem;
import pcftest.NewClaimContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_NewIncidentMenuItem;
import pcftest.NewClaimContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimContentsDamageDV extends DetailViewElement {
  public final static String CHECKSUM = "acacc240eb5cb265cf39c79f75339a79";
  
  public NewClaimContentsDamageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ExposureDetailInputSet getExposureDetailInputSet() {
    return getOrCreateProperty("ExposureDetailInputSet", "ExposureDetailInputSet", null, pcftest.ExposureDetailInputSet.class);
  }
  
  public OtherCarrierInvolvementInputSet getOtherCarrierInvolvementInputSet() {
    return getOrCreateProperty("OtherCarrierInvolvementInputSet", "OtherCarrierInvolvementInputSet", null, pcftest.OtherCarrierInvolvementInputSet.class);
  }
  
  public Property_Contents_Incident getProperty_Contents_Incident() {
    return getOrCreateProperty("Property_Contents_Incident", "Property_Contents_Incident", null, pcftest.NewClaimContentsDamageDV.Property_Contents_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Property_Contents_Incident extends SelectElement {
    public Property_Contents_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContentsDamageDV_EditIncidentMenuItem getContentsDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("ContentsDamageDV_EditIncidentMenuItem", "ContentsDamageDV_EditIncidentMenuItem", null, pcftest.NewClaimContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_EditIncidentMenuItem.class);
    }
    
    public ContentsDamageDV_NewIncidentMenuItem getContentsDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("ContentsDamageDV_NewIncidentMenuItem", "ContentsDamageDV_NewIncidentMenuItem", null, pcftest.NewClaimContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_NewIncidentMenuItem.class);
    }
    
    public ContentsDamageDV_ViewIncidentMenuItem getContentsDamageDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("ContentsDamageDV_ViewIncidentMenuItem", "ContentsDamageDV_ViewIncidentMenuItem", null, pcftest.NewClaimContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContentsDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public ContentsDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditPropertyContentsIncidentPopup click() {
        return clickThis(pcftest.EditPropertyContentsIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContentsDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public ContentsDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewPropertyContentsIncidentPopup click() {
        return clickThis(pcftest.NewPropertyContentsIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContentsDamageDV_ViewIncidentMenuItem extends ClickableActionElement {
      public ContentsDamageDV_ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditPropertyContentsIncidentPopup click() {
        return clickThis(pcftest.EditPropertyContentsIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}