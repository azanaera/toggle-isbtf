package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotBaggageIncidentScreen_700.Baggage_DetailsCardTab;
import pcftest.ClaimSnapshotBaggageIncidentScreen_700._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotBaggageIncidentScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncidentScreen_700 extends ClaimSnapshotBaggageIncidentScreen {
  public final static String CHECKSUM = "a574189679456f70124600de19c1b05e";
  
  public ClaimSnapshotBaggageIncidentScreen_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Baggage_DetailsCardTab getBaggage_DetailsCardTab() {
    return getOrCreateProperty("Baggage_DetailsCardTab", "Baggage_DetailsCardTab", null, pcftest.ClaimSnapshotBaggageIncidentScreen_700.Baggage_DetailsCardTab.class);
  }
  
  public ClaimSnapshotBaggageIncident700DV getClaimSnapshotBaggageIncident700DV() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncident700DV", "ClaimSnapshotBaggageIncident700DV", null, pcftest.ClaimSnapshotBaggageIncident700DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotBaggageIncidentScreen_700._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotBaggageIncidentScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Baggage_DetailsCardTab extends ClickableActionElement {
    public Baggage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotBaggageIncidentScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}