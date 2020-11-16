package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MatterDetailForward.MatterDetailForward_UpLink;
import pcftest.MatterDetailForward._Paging;
import pcftest.MatterDetailForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/MatterDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MatterDetailForward extends PCFLocation {
  public final static String CHECKSUM = "eb122b87214e79d570c08fbd4d0d62e7";
  
  public MatterDetailForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MatterDetailForward"));
  }
  
  public MatterDetailForward_UpLink getMatterDetailForward_UpLink() {
    return getOrCreateProperty("MatterDetailForward_UpLink", "MatterDetailForward_UpLink", null, pcftest.MatterDetailForward.MatterDetailForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MatterDetailForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MatterDetailForward.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailForward_UpLink extends ClickableActionElement {
    public MatterDetailForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}