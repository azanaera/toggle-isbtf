package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotBaggageIncidentScreen_default.Baggage_DetailsCardTab;
import pcftest.ClaimSnapshotBaggageIncidentScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotBaggageIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncidentScreen_default extends ClaimSnapshotBaggageIncidentScreen {
  public final static String CHECKSUM = "9374e870df7c99043bb6c2448565d47a";
  
  public ClaimSnapshotBaggageIncidentScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Baggage_DetailsCardTab getBaggage_DetailsCardTab() {
    return getOrCreateProperty("Baggage_DetailsCardTab", "Baggage_DetailsCardTab", null, pcftest.ClaimSnapshotBaggageIncidentScreen_default.Baggage_DetailsCardTab.class);
  }
  
  public ClaimSnapshotBaggageIncidentDV getClaimSnapshotBaggageIncidentDV() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncidentDV", "ClaimSnapshotBaggageIncidentDV", null, pcftest.ClaimSnapshotBaggageIncidentDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotBaggageIncidentScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotBaggageIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Baggage_DetailsCardTab extends ClickableActionElement {
    public Baggage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotBaggageIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}