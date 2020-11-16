package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReopenMatterInfoDV.Reason;
import typekey.MatterReopenedReason;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenMatterInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "e04f7ceaabd88a0350ef7ae548f2b386";
  
  public ReopenMatterInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Reason getReason() {
    return getOrCreateProperty("Reason", "Reason", null, pcftest.ReopenMatterInfoDV.Reason.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reason extends SelectElement {
    public Reason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MatterReopenedReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MatterReopenedReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MatterReopenedReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MatterReopenedReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}