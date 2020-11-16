package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleValidationInfoCell_default.Invalid;
import pcftest.RuleValidationInfoCell_default.Unknown;
import pcftest.RuleValidationInfoCell_default.Valid;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleValidationInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleValidationInfoCell_default extends RuleValidationInfoCell {
  public final static String CHECKSUM = "cf466a4e9b843ab596f081722d2cf111";
  
  public RuleValidationInfoCell_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Invalid getInvalid() {
    return getOrCreateProperty("Invalid", "Invalid", null, pcftest.RuleValidationInfoCell_default.Invalid.class);
  }
  
  public Unknown getUnknown() {
    return getOrCreateProperty("Unknown", "Unknown", null, pcftest.RuleValidationInfoCell_default.Unknown.class);
  }
  
  public Valid getValid() {
    return getOrCreateProperty("Valid", "Valid", null, pcftest.RuleValidationInfoCell_default.Valid.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleValidationInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Invalid extends ClickableActionElement {
    public Invalid(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleValidationInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Unknown extends ClickableActionElement {
    public Unknown(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleValidationInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Valid extends ClickableActionElement {
    public Valid(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}