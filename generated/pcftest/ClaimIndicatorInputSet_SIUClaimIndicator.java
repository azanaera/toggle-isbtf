package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimIndicatorInputSet_SIUClaimIndicator.SIURefer;
import pcftest.ClaimIndicatorInputSet_SIUClaimIndicator.SIUStatusIcon;
import pcftest.ClaimIndicatorInputSet_SIUClaimIndicator.SIUStatusText;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SIUClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_SIUClaimIndicator extends ClaimIndicatorInputSet {
  public final static String CHECKSUM = "bb2995aab12d9678372ad84fcf132599";
  
  public ClaimIndicatorInputSet_SIUClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SIURefer getSIURefer() {
    return getOrCreateProperty("SIURefer", "SIURefer", null, pcftest.ClaimIndicatorInputSet_SIUClaimIndicator.SIURefer.class);
  }
  
  public SIUStatusIcon getSIUStatusIcon() {
    return getOrCreateProperty("SIUStatusIcon", "SIUStatusIcon", null, pcftest.ClaimIndicatorInputSet_SIUClaimIndicator.SIUStatusIcon.class);
  }
  
  public SIUStatusText getSIUStatusText() {
    return getOrCreateProperty("SIUStatusText", "SIUStatusText", null, pcftest.ClaimIndicatorInputSet_SIUClaimIndicator.SIUStatusText.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SIUClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIURefer extends SelectElement {
    public SIURefer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SIUClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIUStatusIcon extends ClickableActionElement {
    public SIUStatusIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SIUClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIUStatusText extends ClickableActionElement {
    public SIUStatusText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}