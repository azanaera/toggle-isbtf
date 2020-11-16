package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimExposureEntryPointForward.ClaimExposureEntryPointForward_UpLink;
import pcftest.ClaimExposureEntryPointForward._Paging;
import pcftest.ClaimExposureEntryPointForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/ClaimExposureEntryPointForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimExposureEntryPointForward extends PCFLocation {
  public final static String CHECKSUM = "b700ce13cc1f883d76690bcfe9b36351";
  
  public ClaimExposureEntryPointForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimExposureEntryPointForward"));
  }
  
  public ClaimExposureEntryPointForward_UpLink getClaimExposureEntryPointForward_UpLink() {
    return getOrCreateProperty("ClaimExposureEntryPointForward_UpLink", "ClaimExposureEntryPointForward_UpLink", null, pcftest.ClaimExposureEntryPointForward.ClaimExposureEntryPointForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimExposureEntryPointForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimExposureEntryPointForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimExposureEntryPointForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimExposureEntryPointForward_UpLink extends ClickableActionElement {
    public ClaimExposureEntryPointForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimExposureEntryPointForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimExposureEntryPointForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}