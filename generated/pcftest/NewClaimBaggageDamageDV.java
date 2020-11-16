package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimBaggageDamageDV.BaggageIncident;
import pcftest.NewClaimBaggageDamageDV.BaggageIncident.EditIncidentMenuItem;
import pcftest.NewClaimBaggageDamageDV.BaggageIncident.NewIncidentMenuItem;
import pcftest.NewClaimBaggageDamageDV.BaggageIncident.ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimBaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimBaggageDamageDV extends DetailViewElement {
  public final static String CHECKSUM = "62256e0b2aae1666fac0f6ea04f45ec7";
  
  public NewClaimBaggageDamageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BaggageIncident getBaggageIncident() {
    return getOrCreateProperty("BaggageIncident", "BaggageIncident", null, pcftest.NewClaimBaggageDamageDV.BaggageIncident.class);
  }
  
  public ExposureDetailInputSet getExposureDetailInputSet() {
    return getOrCreateProperty("ExposureDetailInputSet", "ExposureDetailInputSet", null, pcftest.ExposureDetailInputSet.class);
  }
  
  public ValueElement getIncidentDescription() {
    return getOrCreateProperty("IncidentDescription", "IncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OtherCarrierInvolvementInputSet getOtherCarrierInvolvementInputSet() {
    return getOrCreateProperty("OtherCarrierInvolvementInputSet", "OtherCarrierInvolvementInputSet", null, pcftest.OtherCarrierInvolvementInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimBaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncident extends SelectElement {
    public BaggageIncident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditIncidentMenuItem getEditIncidentMenuItem() {
      return getOrCreateProperty("EditIncidentMenuItem", "EditIncidentMenuItem", null, pcftest.NewClaimBaggageDamageDV.BaggageIncident.EditIncidentMenuItem.class);
    }
    
    public NewIncidentMenuItem getNewIncidentMenuItem() {
      return getOrCreateProperty("NewIncidentMenuItem", "NewIncidentMenuItem", null, pcftest.NewClaimBaggageDamageDV.BaggageIncident.NewIncidentMenuItem.class);
    }
    
    public ViewIncidentMenuItem getViewIncidentMenuItem() {
      return getOrCreateProperty("ViewIncidentMenuItem", "ViewIncidentMenuItem", null, pcftest.NewClaimBaggageDamageDV.BaggageIncident.ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimBaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditIncidentMenuItem extends ClickableActionElement {
      public EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentPopup click() {
        return clickThis(pcftest.BaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimBaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewIncidentMenuItem extends ClickableActionElement {
      public NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentPopup click() {
        return clickThis(pcftest.BaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimBaggageDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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