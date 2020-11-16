package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TripRUScreen.Cancel;
import pcftest.TripRUScreen.Edit;
import pcftest.TripRUScreen.PolicyTripCoverageLDVPanel;
import pcftest.TripRUScreen.Update;
import pcftest.TripRUScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/TripRUScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripRUScreen extends PCFElement {
  public final static String CHECKSUM = "6833fb91fc9701ba1887d26399313d03";
  
  public TripRUScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.TripRUScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.TripRUScreen.Edit.class);
  }
  
  public DateElement getEndDate() {
    return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.TripRUScreen.GeographicalRegion getGeographicalRegion() {
    return getOrCreateProperty("GeographicalRegion", "GeographicalRegion", null, pcftest.TripRUScreen.GeographicalRegion.class);
  }
  
  public PolicyTripCoverageLDVPanel getPolicyTripCoverageLDVPanel() {
    return getOrCreateProperty("PolicyTripCoverageLDVPanel", "PolicyTripCoverageLDVPanel", null, pcftest.TripRUScreen.PolicyTripCoverageLDVPanel.class);
  }
  
  public ValueElement getRUNumber() {
    return getOrCreateProperty("RUNumber", "RUNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getStartDate() {
    return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getTripDescription() {
    return getOrCreateProperty("TripDescription", "TripDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.TripRUScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TripRUScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GeographicalRegion extends SelectElement {
    public GeographicalRegion(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.GeographicalRegion arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.GeographicalRegion getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GeographicalRegion.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.GeographicalRegion arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTripCoverageLDVPanel extends PCFElement {
    public PolicyTripCoverageLDVPanel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PolicyTripCoverageLDV getPolicyTripCoverageLDV() {
      return getOrCreateProperty("PolicyTripCoverageLDV", "PolicyTripCoverageLDV", null, pcftest.PolicyTripCoverageLDV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}