package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimIndicatorInputSet_LargeLossClaimIndicator.LargeLossIcon;
import pcftest.ClaimIndicatorInputSet_LargeLossClaimIndicator.LargeLossText;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_LargeLossClaimIndicator extends ClaimIndicatorInputSet {
  public final static String CHECKSUM = "dd8c33389e4828d2dbe4489d9b28422f";
  
  public ClaimIndicatorInputSet_LargeLossClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LargeLossIcon getLargeLossIcon() {
    return getOrCreateProperty("LargeLossIcon", "LargeLossIcon", null, pcftest.ClaimIndicatorInputSet_LargeLossClaimIndicator.LargeLossIcon.class);
  }
  
  public LargeLossText getLargeLossText() {
    return getOrCreateProperty("LargeLossText", "LargeLossText", null, pcftest.ClaimIndicatorInputSet_LargeLossClaimIndicator.LargeLossText.class);
  }
  
  public ValueElement getNetTotalIncurred() {
    return getOrCreateProperty("NetTotalIncurred", "NetTotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LargeLossIcon extends ClickableActionElement {
    public LargeLossIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LargeLossText extends ClickableActionElement {
    public LargeLossText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}