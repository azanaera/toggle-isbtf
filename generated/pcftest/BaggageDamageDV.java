package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BaggageDamageDV.BaggageIncident;
import pcftest.BaggageDamageDV.BaggageIncident.EditIncidentMenuItem;
import pcftest.BaggageDamageDV.BaggageIncident.NewIncidentMenuItem;
import pcftest.BaggageDamageDV.BaggageIncident.ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/BaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageDamageDV extends DetailViewElement {
  public final static String CHECKSUM = "a451f488d74657311016f608e026f42d";
  
  public BaggageDamageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BaggageIncident getBaggageIncident() {
    return getOrCreateProperty("BaggageIncident", "BaggageIncident", null, pcftest.BaggageDamageDV.BaggageIncident.class);
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
  
  public ValueElement getIncidentDescription() {
    return getOrCreateProperty("IncidentDescription", "IncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OtherCarrierInvolvementInputSet getOtherCarrierInvolvementInputSet() {
    return getOrCreateProperty("OtherCarrierInvolvementInputSet", "OtherCarrierInvolvementInputSet", null, pcftest.OtherCarrierInvolvementInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/BaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncident extends SelectElement {
    public BaggageIncident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditIncidentMenuItem getEditIncidentMenuItem() {
      return getOrCreateProperty("EditIncidentMenuItem", "EditIncidentMenuItem", null, pcftest.BaggageDamageDV.BaggageIncident.EditIncidentMenuItem.class);
    }
    
    public NewIncidentMenuItem getNewIncidentMenuItem() {
      return getOrCreateProperty("NewIncidentMenuItem", "NewIncidentMenuItem", null, pcftest.BaggageDamageDV.BaggageIncident.NewIncidentMenuItem.class);
    }
    
    public ViewIncidentMenuItem getViewIncidentMenuItem() {
      return getOrCreateProperty("ViewIncidentMenuItem", "ViewIncidentMenuItem", null, pcftest.BaggageDamageDV.BaggageIncident.ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/BaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditIncidentMenuItem extends ClickableActionElement {
      public EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentPopup click() {
        return clickThis(pcftest.BaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/BaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewIncidentMenuItem extends ClickableActionElement {
      public NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentPopup click() {
        return clickThis(pcftest.BaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/BaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewIncidentMenuItem extends ClickableActionElement {
      public ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentPopup click() {
        return clickThis(pcftest.BaggageIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}