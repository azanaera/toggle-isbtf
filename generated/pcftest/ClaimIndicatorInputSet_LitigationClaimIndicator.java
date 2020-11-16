package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimIndicatorInputSet_LitigationClaimIndicator.LitigationStatusEdit;
import typekey.LitigationStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LitigationClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_LitigationClaimIndicator extends ClaimIndicatorInputSet {
  public final static String CHECKSUM = "f971762ddbe729e8fa1a43c02215fd0b";
  
  public ClaimIndicatorInputSet_LitigationClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDaysAfterFNOL() {
    return getOrCreateProperty("DaysAfterFNOL", "DaysAfterFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getFirstNoticeSuit() {
    return getOrCreateProperty("FirstNoticeSuit", "FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getLitigationIdentified() {
    return getOrCreateProperty("LitigationIdentified", "LitigationIdentified", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public LitigationStatusEdit getLitigationStatusEdit() {
    return getOrCreateProperty("LitigationStatusEdit", "LitigationStatusEdit", null, pcftest.ClaimIndicatorInputSet_LitigationClaimIndicator.LitigationStatusEdit.class);
  }
  
  public SelectElement getLitigationStatusView() {
    return getOrCreateProperty("LitigationStatusView", "LitigationStatusView", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DateElement getNextTrialDate() {
    return getOrCreateProperty("NextTrialDate", "NextTrialDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LitigationClaimIndicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LitigationStatusEdit extends SelectElement {
    public LitigationStatusEdit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LitigationStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LitigationStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LitigationStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LitigationStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}