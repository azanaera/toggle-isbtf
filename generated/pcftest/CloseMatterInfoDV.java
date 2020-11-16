package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CloseMatterInfoDV.Resolution;
import typekey.ResolutionType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/CloseMatterInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseMatterInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "4acfc8fbb05ec7d528fa7680e8a3810f";
  
  public CloseMatterInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Resolution getResolution() {
    return getOrCreateProperty("Resolution", "Resolution", null, pcftest.CloseMatterInfoDV.Resolution.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Resolution extends SelectElement {
    public Resolution(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ResolutionType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ResolutionType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ResolutionType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ResolutionType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}