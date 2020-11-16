package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CloseClaimInfoDV.Outcome;
import typekey.ClaimClosedOutcomeType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/CloseClaimInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseClaimInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "fdbe5ad42a7a52de87dd7824200e6b14";
  
  public CloseClaimInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Outcome getOutcome() {
    return getOrCreateProperty("Outcome", "Outcome", null, pcftest.CloseClaimInfoDV.Outcome.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CloseClaimInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Outcome extends SelectElement {
    public Outcome(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimClosedOutcomeType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimClosedOutcomeType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimClosedOutcomeType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimClosedOutcomeType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}