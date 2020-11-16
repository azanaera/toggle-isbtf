package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimIndicatorInputSet_FatalityClaimIndicator.FatalityIcon;
import pcftest.ClaimIndicatorInputSet_FatalityClaimIndicator.FatalityText;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FatalityClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_FatalityClaimIndicator extends ClaimIndicatorInputSet {
  public final static String CHECKSUM = "a7946014ccd9d245dce924f9a18af9ca";
  
  public ClaimIndicatorInputSet_FatalityClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FatalityIcon getFatalityIcon() {
    return getOrCreateProperty("FatalityIcon", "FatalityIcon", null, pcftest.ClaimIndicatorInputSet_FatalityClaimIndicator.FatalityIcon.class);
  }
  
  public FatalityText getFatalityText() {
    return getOrCreateProperty("FatalityText", "FatalityText", null, pcftest.ClaimIndicatorInputSet_FatalityClaimIndicator.FatalityText.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FatalityClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FatalityIcon extends ClickableActionElement {
    public FatalityIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FatalityClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FatalityText extends ClickableActionElement {
    public FatalityText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}