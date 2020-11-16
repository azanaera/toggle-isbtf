package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "8d28c9311933d2614a2817f782336a1e";
  
  public AdditionalTripSegmentDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AdditionalTripSegmentInputSet getAdditionalTripSegmentInputSet() {
    return getOrCreateProperty("AdditionalTripSegmentInputSet", "AdditionalTripSegmentInputSet", null, pcftest.AdditionalTripSegmentInputSet.class);
  }
  
  
}