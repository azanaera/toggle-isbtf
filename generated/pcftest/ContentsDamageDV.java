package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContentsDamageDV.Property_Contents_Incident;
import pcftest.ContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_EditIncidentMenuItem;
import pcftest.ContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_NewIncidentMenuItem;
import pcftest.ContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContentsDamageDV extends DetailViewElement {
  public final static String CHECKSUM = "391136c71d56c1f67cf2eab1828cdc01";
  
  public ContentsDamageDV(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public Property_Contents_Incident getProperty_Contents_Incident() {
    return getOrCreateProperty("Property_Contents_Incident", "Property_Contents_Incident", null, pcftest.ContentsDamageDV.Property_Contents_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Property_Contents_Incident extends SelectElement {
    public Property_Contents_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContentsDamageDV_EditIncidentMenuItem getContentsDamageDV_EditIncidentMenuItem() {
      return getOrCreateProperty("ContentsDamageDV_EditIncidentMenuItem", "ContentsDamageDV_EditIncidentMenuItem", null, pcftest.ContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_EditIncidentMenuItem.class);
    }
    
    public ContentsDamageDV_NewIncidentMenuItem getContentsDamageDV_NewIncidentMenuItem() {
      return getOrCreateProperty("ContentsDamageDV_NewIncidentMenuItem", "ContentsDamageDV_NewIncidentMenuItem", null, pcftest.ContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_NewIncidentMenuItem.class);
    }
    
    public ContentsDamageDV_ViewIncidentMenuItem getContentsDamageDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("ContentsDamageDV_ViewIncidentMenuItem", "ContentsDamageDV_ViewIncidentMenuItem", null, pcftest.ContentsDamageDV.Property_Contents_Incident.ContentsDamageDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContentsDamageDV_EditIncidentMenuItem extends ClickableActionElement {
      public ContentsDamageDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditPropertyContentsIncidentPopup click() {
        return clickThis(pcftest.EditPropertyContentsIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContentsDamageDV_NewIncidentMenuItem extends ClickableActionElement {
      public ContentsDamageDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewPropertyContentsIncidentPopup click() {
        return clickThis(pcftest.NewPropertyContentsIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ContentsDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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