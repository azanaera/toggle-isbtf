package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ValidationErrorsInputSet.Label;
import pcftest.ValidationErrorsInputSet.ValidationErrorIcon;
import pcftest.ValidationErrorsInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ValidationErrorsInputSet extends PCFElement {
  public final static String CHECKSUM = "e9da13ffc5ebaa529610a842987801bc";
  
  public ValidationErrorsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Label getLabel() {
    return getOrCreateProperty("Label", "Label", null, pcftest.ValidationErrorsInputSet.Label.class);
  }
  
  public ValidationErrorIcon getValidationErrorIcon() {
    return getOrCreateProperty("ValidationErrorIcon", "ValidationErrorIcon", null, pcftest.ValidationErrorsInputSet.ValidationErrorIcon.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ValidationErrorsInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Label extends ClickableActionElement {
    public Label(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorIcon extends ClickableActionElement {
    public ValidationErrorIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getValidationError() {
      return getOrCreateProperty("ValidationError", "ValidationError", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}