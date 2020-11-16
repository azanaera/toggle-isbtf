package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReopenClaimInfoDV.Reason;
import typekey.ClaimReopenedReason;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/ReopenClaimInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenClaimInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "fa22d2ed74da74dd0af4467bc22653f3";
  
  public ReopenClaimInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Reason getReason() {
    return getOrCreateProperty("Reason", "Reason", null, pcftest.ReopenClaimInfoDV.Reason.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ReopenClaimInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reason extends SelectElement {
    public Reason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimReopenedReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimReopenedReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimReopenedReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimReopenedReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}