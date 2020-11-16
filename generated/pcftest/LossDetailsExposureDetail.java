package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LossDetailsExposureDetail.LossDetailsExposureDetail_UpLink;
import pcftest.LossDetailsExposureDetail._Paging;
import pcftest.LossDetailsExposureDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsExposureDetail extends PCFLocation {
  public final static String CHECKSUM = "866d9df4daf9ca2d46a18868e17f43df";
  
  public LossDetailsExposureDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LossDetailsExposureDetail"));
  }
  
  public ExposureDetailScreen getExposureDetailScreen() {
    return getOrCreateProperty("ExposureDetailScreen", "ExposureDetailScreen", null, pcftest.ExposureDetailScreen.class);
  }
  
  public LossDetailsExposureDetail_UpLink getLossDetailsExposureDetail_UpLink() {
    return getOrCreateProperty("LossDetailsExposureDetail_UpLink", "LossDetailsExposureDetail_UpLink", null, pcftest.LossDetailsExposureDetail.LossDetailsExposureDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LossDetailsExposureDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LossDetailsExposureDetail.__crumb__.class);
  }
  
  public ClaimLossDetailsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetailsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsExposureDetail_UpLink extends ClickableActionElement {
    public LossDetailsExposureDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}