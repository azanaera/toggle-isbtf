package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonColumnHeadingsInputSet.HeadingSpacer;
import pcftest.RuleComparisonColumnHeadingsInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonColumnHeadingsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonColumnHeadingsInputSet extends PCFElement {
  public final static String CHECKSUM = "19f4181d67fa1d1649d86d2fe2df1bb9";
  
  public RuleComparisonColumnHeadingsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public HeadingSpacer getHeadingSpacer() {
    return getOrCreateProperty("HeadingSpacer", "HeadingSpacer", null, pcftest.RuleComparisonColumnHeadingsInputSet.HeadingSpacer.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleComparisonColumnHeadingsInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonColumnHeadingsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HeadingSpacer extends ValueElement {
    public HeadingSpacer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonColumnHeadingsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getColumnRelativeStateHeadings() {
      return getOrCreateProperty("ColumnRelativeStateHeadings", "ColumnRelativeStateHeadings", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}