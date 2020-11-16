package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotBaggageIncidentScreen_800.Baggage_DetailsCardTab;
import pcftest.ClaimSnapshotBaggageIncidentScreen_800._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotBaggageIncidentScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncidentScreen_800 extends ClaimSnapshotBaggageIncidentScreen {
  public final static String CHECKSUM = "186e86d4fe7296aed1b20cf6562545a7";
  
  public ClaimSnapshotBaggageIncidentScreen_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Baggage_DetailsCardTab getBaggage_DetailsCardTab() {
    return getOrCreateProperty("Baggage_DetailsCardTab", "Baggage_DetailsCardTab", null, pcftest.ClaimSnapshotBaggageIncidentScreen_800.Baggage_DetailsCardTab.class);
  }
  
  public ClaimSnapshotBaggageIncident800DV getClaimSnapshotBaggageIncident800DV() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncident800DV", "ClaimSnapshotBaggageIncident800DV", null, pcftest.ClaimSnapshotBaggageIncident800DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotBaggageIncidentScreen_800._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotBaggageIncidentScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Baggage_DetailsCardTab extends ClickableActionElement {
    public Baggage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotBaggageIncidentScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}