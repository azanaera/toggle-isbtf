package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RelatedToInputSet.ValidationErrorsRelatedTo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RelatedToInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RelatedToInputSet extends PCFElement {
  public final static String CHECKSUM = "a21fbe50165953a11703c9c0a3c4259d";
  
  public RelatedToInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getRelatedToInput() {
    return getOrCreateProperty("RelatedToInput", "RelatedToInput", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValidationErrorsRelatedTo getValidationErrorsRelatedTo() {
    return getOrCreateProperty("ValidationErrorsRelatedTo", "ValidationErrorsRelatedTo", null, pcftest.RelatedToInputSet.ValidationErrorsRelatedTo.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RelatedToInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorsRelatedTo extends PCFElement {
    public ValidationErrorsRelatedTo(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  
}