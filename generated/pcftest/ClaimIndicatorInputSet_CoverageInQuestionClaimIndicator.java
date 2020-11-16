package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator.CoverageInQuestionIcon;
import pcftest.ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator.CoverageInQuestionText;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator extends ClaimIndicatorInputSet {
  public final static String CHECKSUM = "bfa18c00d2a8559577b3595ceea4790d";
  
  public ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getCoverageInQuestion() {
    return getOrCreateProperty("CoverageInQuestion", "CoverageInQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CoverageInQuestionIcon getCoverageInQuestionIcon() {
    return getOrCreateProperty("CoverageInQuestionIcon", "CoverageInQuestionIcon", null, pcftest.ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator.CoverageInQuestionIcon.class);
  }
  
  public ValueElement getCoverageInQuestionReasons() {
    return getOrCreateProperty("CoverageInQuestionReasons", "CoverageInQuestionReasons", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CoverageInQuestionText getCoverageInQuestionText() {
    return getOrCreateProperty("CoverageInQuestionText", "CoverageInQuestionText", null, pcftest.ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator.CoverageInQuestionText.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageInQuestionIcon extends ClickableActionElement {
    public CoverageInQuestionIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageInQuestionText extends ClickableActionElement {
    public CoverageInQuestionText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}