package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/VendorW9InfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VendorW9InfoInputSet extends PCFElement {
  public final static String CHECKSUM = "31ed74deb81ac86ffa47f826bbef6a1e";
  
  public VendorW9InfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.VendorW9InfoInputSet.TaxStatus getTaxStatus() {
    return getOrCreateProperty("TaxStatus", "TaxStatus", null, pcftest.VendorW9InfoInputSet.TaxStatus.class);
  }
  
  public DateElement getW9ValidFrom() {
    return getOrCreateProperty("W9ValidFrom", "W9ValidFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getW9ValidTo() {
    return getOrCreateProperty("W9ValidTo", "W9ValidTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getW9received() {
    return getOrCreateProperty("W9received", "W9received", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getW9receivedDate() {
    return getOrCreateProperty("W9receivedDate", "W9receivedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/VendorW9InfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TaxStatus extends SelectElement {
    public TaxStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.TaxStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.TaxStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TaxStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.TaxStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}