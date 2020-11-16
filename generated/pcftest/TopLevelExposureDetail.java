package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TopLevelExposureDetail.TopLevelExposureDetail_UpLink;
import pcftest.TopLevelExposureDetail._Paging;
import pcftest.TopLevelExposureDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/TopLevelExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TopLevelExposureDetail extends PCFLocation {
  public final static String CHECKSUM = "37c8591f562968d66b286fd6747bae1a";
  
  public TopLevelExposureDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TopLevelExposureDetail"));
  }
  
  public ExposureDetailScreen getExposureDetailScreen() {
    return getOrCreateProperty("ExposureDetailScreen", "ExposureDetailScreen", null, pcftest.ExposureDetailScreen.class);
  }
  
  public TopLevelExposureDetail_UpLink getTopLevelExposureDetail_UpLink() {
    return getOrCreateProperty("TopLevelExposureDetail_UpLink", "TopLevelExposureDetail_UpLink", null, pcftest.TopLevelExposureDetail.TopLevelExposureDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TopLevelExposureDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TopLevelExposureDetail.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TopLevelExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TopLevelExposureDetail_UpLink extends ClickableActionElement {
    public TopLevelExposureDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TopLevelExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TopLevelExposureDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}