package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BaggageIncidentDetailDV.Baggage_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/BaggageIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentDetailDV extends PCFElement {
  public final static String CHECKSUM = "a201d4ee7be2c9f9d4b0f0407dbbf114";
  
  public BaggageIncidentDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BaggageIncidentDV getBaggageIncidentDV() {
    return getOrCreateProperty("BaggageIncidentDV", "BaggageIncidentDV", null, pcftest.BaggageIncidentDV.class);
  }
  
  public Baggage_DetailsCardTab getBaggage_DetailsCardTab() {
    return getOrCreateProperty("Baggage_DetailsCardTab", "Baggage_DetailsCardTab", null, pcftest.BaggageIncidentDetailDV.Baggage_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/BaggageIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Baggage_DetailsCardTab extends ClickableActionElement {
    public Baggage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}