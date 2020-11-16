package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimTripCancellationDV.TripIncident;
import pcftest.NewClaimTripCancellationDV.TripIncident.EditIncidentMenuItem;
import pcftest.NewClaimTripCancellationDV.TripIncident.NewIncidentMenuItem;
import pcftest.NewClaimTripCancellationDV.TripIncident.ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimTripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimTripCancellationDV extends DetailViewElement {
  public final static String CHECKSUM = "471508d27f28f4c55d71e755414558df";
  
  public NewClaimTripCancellationDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
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
  
  public TripIncident getTripIncident() {
    return getOrCreateProperty("TripIncident", "TripIncident", null, pcftest.NewClaimTripCancellationDV.TripIncident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimTripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncident extends SelectElement {
    public TripIncident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditIncidentMenuItem getEditIncidentMenuItem() {
      return getOrCreateProperty("EditIncidentMenuItem", "EditIncidentMenuItem", null, pcftest.NewClaimTripCancellationDV.TripIncident.EditIncidentMenuItem.class);
    }
    
    public NewIncidentMenuItem getNewIncidentMenuItem() {
      return getOrCreateProperty("NewIncidentMenuItem", "NewIncidentMenuItem", null, pcftest.NewClaimTripCancellationDV.TripIncident.NewIncidentMenuItem.class);
    }
    
    public ViewIncidentMenuItem getViewIncidentMenuItem() {
      return getOrCreateProperty("ViewIncidentMenuItem", "ViewIncidentMenuItem", null, pcftest.NewClaimTripCancellationDV.TripIncident.ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimTripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditIncidentMenuItem extends ClickableActionElement {
      public EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripIncidentPopup click() {
        return clickThis(pcftest.TripIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimTripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewIncidentMenuItem extends ClickableActionElement {
      public NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripIncidentPopup click() {
        return clickThis(pcftest.TripIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimTripCancellationDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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