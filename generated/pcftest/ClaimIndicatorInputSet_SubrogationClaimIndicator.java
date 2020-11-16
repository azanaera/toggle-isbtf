package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimIndicatorInputSet_SubrogationClaimIndicator.SubrogationStatusIcon;
import pcftest.ClaimIndicatorInputSet_SubrogationClaimIndicator.SubrogationStatusSetter;
import pcftest.ClaimIndicatorInputSet_SubrogationClaimIndicator.SubrogationStatusText;
import typekey.SubrogationStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_SubrogationClaimIndicator extends ClaimIndicatorInputSet {
  public final static String CHECKSUM = "b6e1892d96b872a77727e39ccc9ad332";
  
  public ClaimIndicatorInputSet_SubrogationClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SubrogationStatusIcon getSubrogationStatusIcon() {
    return getOrCreateProperty("SubrogationStatusIcon", "SubrogationStatusIcon", null, pcftest.ClaimIndicatorInputSet_SubrogationClaimIndicator.SubrogationStatusIcon.class);
  }
  
  public SubrogationStatusSetter getSubrogationStatusSetter() {
    return getOrCreateProperty("SubrogationStatusSetter", "SubrogationStatusSetter", null, pcftest.ClaimIndicatorInputSet_SubrogationClaimIndicator.SubrogationStatusSetter.class);
  }
  
  public SubrogationStatusText getSubrogationStatusText() {
    return getOrCreateProperty("SubrogationStatusText", "SubrogationStatusText", null, pcftest.ClaimIndicatorInputSet_SubrogationClaimIndicator.SubrogationStatusText.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationStatusIcon extends ClickableActionElement {
    public SubrogationStatusIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationStatusSetter extends SelectElement {
    public SubrogationStatusSetter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SubrogationStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SubrogationStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubrogationStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SubrogationStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationStatusText extends ClickableActionElement {
    public SubrogationStatusText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}