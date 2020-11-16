package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetail.ExposureDetail_UpLink;
import pcftest.ExposureDetail._Paging;
import pcftest.ExposureDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetail extends PCFLocation {
  public final static String CHECKSUM = "7c806f519b2337b782d2a08a272d3b67";
  
  public ExposureDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ExposureDetail"));
  }
  
  public ExposureDetailScreen getExposureDetailScreen() {
    return getOrCreateProperty("ExposureDetailScreen", "ExposureDetailScreen", null, pcftest.ExposureDetailScreen.class);
  }
  
  public ExposureDetail_UpLink getExposureDetail_UpLink() {
    return getOrCreateProperty("ExposureDetail_UpLink", "ExposureDetail_UpLink", null, pcftest.ExposureDetail.ExposureDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ExposureDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ExposureDetail.__crumb__.class);
  }
  
  public ClaimExposures get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimExposures.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetail_UpLink extends ClickableActionElement {
    public ExposureDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}