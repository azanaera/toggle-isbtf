package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReopenExposureInfoDV.Reason;
import typekey.ExposureReopenedReason;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ReopenExposureInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenExposureInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "813b215fccb894015ab1630029493f17";
  
  public ReopenExposureInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Reason getReason() {
    return getOrCreateProperty("Reason", "Reason", null, pcftest.ReopenExposureInfoDV.Reason.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposureInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reason extends SelectElement {
    public Reason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureReopenedReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureReopenedReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureReopenedReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureReopenedReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}