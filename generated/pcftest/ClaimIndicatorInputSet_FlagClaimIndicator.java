package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimIndicatorInputSet_FlagClaimIndicator.FlagIndicatorIcon;
import pcftest.ClaimIndicatorInputSet_FlagClaimIndicator.FlagIndicatorText;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FlagClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_FlagClaimIndicator extends ClaimIndicatorInputSet {
  public final static String CHECKSUM = "28b785afff978eb9f47f35aad5f708d1";
  
  public ClaimIndicatorInputSet_FlagClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FlagIndicatorIcon getFlagIndicatorIcon() {
    return getOrCreateProperty("FlagIndicatorIcon", "FlagIndicatorIcon", null, pcftest.ClaimIndicatorInputSet_FlagClaimIndicator.FlagIndicatorIcon.class);
  }
  
  public FlagIndicatorText getFlagIndicatorText() {
    return getOrCreateProperty("FlagIndicatorText", "FlagIndicatorText", null, pcftest.ClaimIndicatorInputSet_FlagClaimIndicator.FlagIndicatorText.class);
  }
  
  public DateElement getFlaggedDate() {
    return getOrCreateProperty("FlaggedDate", "FlaggedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getFlaggedReason() {
    return getOrCreateProperty("FlaggedReason", "FlaggedReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FlagClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FlagIndicatorIcon extends ClickableActionElement {
    public FlagIndicatorIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FlagClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FlagIndicatorText extends ClickableActionElement {
    public FlagIndicatorText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}