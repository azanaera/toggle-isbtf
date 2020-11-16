package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CloseExposureInfoDV.Outcome;
import typekey.ExposureClosedOutcomeType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/CloseExposureInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseExposureInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "ad3ff4509fb0262c9b4604f8acc0cdf7";
  
  public CloseExposureInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Outcome getOutcome() {
    return getOrCreateProperty("Outcome", "Outcome", null, pcftest.CloseExposureInfoDV.Outcome.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/CloseExposureInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Outcome extends SelectElement {
    public Outcome(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureClosedOutcomeType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureClosedOutcomeType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureClosedOutcomeType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureClosedOutcomeType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}