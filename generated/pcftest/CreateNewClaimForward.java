package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CreateNewClaimForward.CreateNewClaimForward_UpLink;
import pcftest.CreateNewClaimForward._Paging;
import pcftest.CreateNewClaimForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/CreateNewClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateNewClaimForward extends PCFLocation {
  public final static String CHECKSUM = "2eaaf590498c44e0c3e6659f1e865764";
  
  public CreateNewClaimForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CreateNewClaimForward"));
  }
  
  public CreateNewClaimForward_UpLink getCreateNewClaimForward_UpLink() {
    return getOrCreateProperty("CreateNewClaimForward_UpLink", "CreateNewClaimForward_UpLink", null, pcftest.CreateNewClaimForward.CreateNewClaimForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CreateNewClaimForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CreateNewClaimForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CreateNewClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateNewClaimForward_UpLink extends ClickableActionElement {
    public CreateNewClaimForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CreateNewClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CreateNewClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}