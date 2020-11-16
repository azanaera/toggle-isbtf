package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/RentalServiceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RentalServiceDV extends DetailViewElement {
  public final static String CHECKSUM = "9b0e14fa114812902fd5afd876aebb4f";
  
  public RentalServiceDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.RentalServiceDV.RentalServiceInputSet getRentalServiceInputSet() {
    return getOrCreateProperty("RentalServiceInputSet", "RentalServiceInputSet", null, pcftest.RentalServiceDV.RentalServiceInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/RentalServiceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RentalServiceInputSet extends PCFElement {
    public RentalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.RentalServiceInputSet getRentalServiceInputSet() {
      return getOrCreateProperty("RentalServiceInputSet", "RentalServiceInputSet", null, pcftest.RentalServiceInputSet.class);
    }
    
    
  }
  
  
}