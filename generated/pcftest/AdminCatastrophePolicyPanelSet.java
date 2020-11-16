package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdminCatastrophePolicyPanelSet.SetCatastropheZone;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastrophePolicyPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminCatastrophePolicyPanelSet extends PCFElement {
  public final static String CHECKSUM = "1602bb8905b05b0abad399b26d527e88";
  
  public AdminCatastrophePolicyPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CatastropheHeatMapFilterPanelSet getCatastropheHeatMapFilterPanelSet() {
    return getOrCreateProperty("CatastropheHeatMapFilterPanelSet", "CatastropheHeatMapFilterPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.CatastropheHeatMapFilterPanelSet.class);
  }
  
  public DateElement getPolicyEffectiveDate() {
    return getOrCreateProperty("PolicyEffectiveDate", "PolicyEffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getPolicyRetrievalCompletionTime() {
    return getOrCreateProperty("PolicyRetrievalCompletionTime", "PolicyRetrievalCompletionTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPolicyRetrievalCompletionTimeNever() {
    return getOrCreateProperty("PolicyRetrievalCompletionTimeNever", "PolicyRetrievalCompletionTimeNever", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SetCatastropheZone getSetCatastropheZone() {
    return getOrCreateProperty("SetCatastropheZone", "SetCatastropheZone", null, pcftest.AdminCatastrophePolicyPanelSet.SetCatastropheZone.class);
  }
  
  public ValueElement getStatus() {
    return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement gethowToSelect() {
    return getOrCreateProperty("howToSelect", "howToSelect", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastrophePolicyPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SetCatastropheZone extends ValueElement {
    public SetCatastropheZone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}