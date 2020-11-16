package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonSectionLabelInputSet.SectionLabel;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonSectionLabelInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonSectionLabelInputSet extends PCFElement {
  public final static String CHECKSUM = "64263c1c441eaf233522166872b94041";
  
  public RuleComparisonSectionLabelInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SectionLabel getSectionLabel() {
    return getOrCreateProperty("SectionLabel", "SectionLabel", null, pcftest.RuleComparisonSectionLabelInputSet.SectionLabel.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonSectionLabelInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SectionLabel extends ValueElement {
    public SectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}