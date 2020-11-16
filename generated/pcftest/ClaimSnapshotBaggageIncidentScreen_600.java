package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotBaggageIncidentScreen_600.Baggage_DetailsCardTab;
import pcftest.ClaimSnapshotBaggageIncidentScreen_600._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotBaggageIncidentScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncidentScreen_600 extends ClaimSnapshotBaggageIncidentScreen {
  public final static String CHECKSUM = "4e9c232fd83a5b55db43eead21aa5046";
  
  public ClaimSnapshotBaggageIncidentScreen_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Baggage_DetailsCardTab getBaggage_DetailsCardTab() {
    return getOrCreateProperty("Baggage_DetailsCardTab", "Baggage_DetailsCardTab", null, pcftest.ClaimSnapshotBaggageIncidentScreen_600.Baggage_DetailsCardTab.class);
  }
  
  public ClaimSnapshotBaggageIncident600DV getClaimSnapshotBaggageIncident600DV() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncident600DV", "ClaimSnapshotBaggageIncident600DV", null, pcftest.ClaimSnapshotBaggageIncident600DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotBaggageIncidentScreen_600._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotBaggageIncidentScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Baggage_DetailsCardTab extends ClickableActionElement {
    public Baggage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotBaggageIncidentScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}