package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TripCancellationDV.TripIncident;
import pcftest.TripCancellationDV.TripIncident.EditIncidentMenuItem;
import pcftest.TripCancellationDV.TripIncident.NewIncidentMenuItem;
import pcftest.TripCancellationDV.TripIncident.ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/TripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripCancellationDV extends DetailViewElement {
  public final static String CHECKSUM = "ac281c52964ef17cccd56bc172610cd0";
  
  public TripCancellationDV(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public ValueElement getIncidentDescription() {
    return getOrCreateProperty("IncidentDescription", "IncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OtherCarrierInvolvementInputSet getOtherCarrierInvolvementInputSet() {
    return getOrCreateProperty("OtherCarrierInvolvementInputSet", "OtherCarrierInvolvementInputSet", null, pcftest.OtherCarrierInvolvementInputSet.class);
  }
  
  public TripIncident getTripIncident() {
    return getOrCreateProperty("TripIncident", "TripIncident", null, pcftest.TripCancellationDV.TripIncident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncident extends SelectElement {
    public TripIncident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditIncidentMenuItem getEditIncidentMenuItem() {
      return getOrCreateProperty("EditIncidentMenuItem", "EditIncidentMenuItem", null, pcftest.TripCancellationDV.TripIncident.EditIncidentMenuItem.class);
    }
    
    public NewIncidentMenuItem getNewIncidentMenuItem() {
      return getOrCreateProperty("NewIncidentMenuItem", "NewIncidentMenuItem", null, pcftest.TripCancellationDV.TripIncident.NewIncidentMenuItem.class);
    }
    
    public ViewIncidentMenuItem getViewIncidentMenuItem() {
      return getOrCreateProperty("ViewIncidentMenuItem", "ViewIncidentMenuItem", null, pcftest.TripCancellationDV.TripIncident.ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditIncidentMenuItem extends ClickableActionElement {
      public EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripIncidentPopup click() {
        return clickThis(pcftest.TripIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewIncidentMenuItem extends ClickableActionElement {
      public NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripIncidentPopup click() {
        return clickThis(pcftest.TripIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewIncidentMenuItem extends ClickableActionElement {
      public ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripIncidentPopup click() {
        return clickThis(pcftest.TripIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}