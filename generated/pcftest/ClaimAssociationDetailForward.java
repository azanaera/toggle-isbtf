package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimAssociationDetailForward.ClaimAssociationDetailForward_UpLink;
import pcftest.ClaimAssociationDetailForward._Paging;
import pcftest.ClaimAssociationDetailForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/associations/ClaimAssociationDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociationDetailForward extends PCFLocation {
  public final static String CHECKSUM = "ebc8258de78e5c1e0ebd8ce1dfbc11f2";
  
  public ClaimAssociationDetailForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimAssociationDetailForward"));
  }
  
  public ClaimAssociationDetailForward_UpLink getClaimAssociationDetailForward_UpLink() {
    return getOrCreateProperty("ClaimAssociationDetailForward_UpLink", "ClaimAssociationDetailForward_UpLink", null, pcftest.ClaimAssociationDetailForward.ClaimAssociationDetailForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimAssociationDetailForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimAssociationDetailForward.__crumb__.class);
  }
  
  public ClaimAssociations get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimAssociations.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/associations/ClaimAssociationDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationDetailForward_UpLink extends ClickableActionElement {
    public ClaimAssociationDetailForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/associations/ClaimAssociationDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/associations/ClaimAssociationDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}