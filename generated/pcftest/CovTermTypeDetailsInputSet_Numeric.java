package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CovTermTypeDetailsInputSet_Numeric.Units;
import typekey.CovTermModelVal;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Numeric.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermTypeDetailsInputSet_Numeric extends CovTermTypeDetailsInputSet {
  public final static String CHECKSUM = "28b1dcc7ea5859700628e419a6b4637d";
  
  public CovTermTypeDetailsInputSet_Numeric(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNumericValue() {
    return getOrCreateProperty("NumericValue", "NumericValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Units getUnits() {
    return getOrCreateProperty("Units", "Units", null, pcftest.CovTermTypeDetailsInputSet_Numeric.Units.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Numeric.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Units extends SelectElement {
    public Units(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CovTermModelVal arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CovTermModelVal getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CovTermModelVal.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CovTermModelVal arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}