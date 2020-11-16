package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/WaterDamageQuestionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WaterDamageQuestionsPanelSet extends PCFElement {
  public final static String CHECKSUM = "e1a6e97817445f8f6deb1394b8633f65";
  
  public WaterDamageQuestionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getHasWaterBeenTurnedOff() {
    return getOrCreateProperty("HasWaterBeenTurnedOff", "HasWaterBeenTurnedOff", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getIsRoofCovered() {
    return getOrCreateProperty("IsRoofCovered", "IsRoofCovered", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.WaterDamageQuestionsPanelSet.WaterSource getWaterSource() {
    return getOrCreateProperty("WaterSource", "WaterSource", null, pcftest.WaterDamageQuestionsPanelSet.WaterSource.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/WaterDamageQuestionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaterSource extends SelectElement {
    public WaterSource(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.WaterSource arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.WaterSource getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WaterSource.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.WaterSource arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}