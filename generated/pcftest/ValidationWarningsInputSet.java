package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ValidationWarningsInputSet.Label;
import pcftest.ValidationWarningsInputSet.ValidationWarningIcon;
import pcftest.ValidationWarningsInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ValidationWarningsInputSet extends PCFElement {
  public final static String CHECKSUM = "a35f08284ece13f72819c54190a576a7";
  
  public ValidationWarningsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Label getLabel() {
    return getOrCreateProperty("Label", "Label", null, pcftest.ValidationWarningsInputSet.Label.class);
  }
  
  public ValidationWarningIcon getValidationWarningIcon() {
    return getOrCreateProperty("ValidationWarningIcon", "ValidationWarningIcon", null, pcftest.ValidationWarningsInputSet.ValidationWarningIcon.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ValidationWarningsInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Label extends ClickableActionElement {
    public Label(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationWarningIcon extends ClickableActionElement {
    public ValidationWarningIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getValidationWarning() {
      return getOrCreateProperty("ValidationWarning", "ValidationWarning", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}