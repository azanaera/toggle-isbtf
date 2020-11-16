package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchivedClaim.ArchivedClaim_UpLink;
import pcftest.ArchivedClaim._Paging;
import pcftest.ArchivedClaim.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/archive/ArchivedClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchivedClaim extends PCFLocation {
  public final static String CHECKSUM = "89dd421a552546196533ad329a31a01d";
  
  public ArchivedClaim(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ArchivedClaim"));
  }
  
  public ArchivedClaimDetailScreen getArchivedClaimDetailScreen() {
    return getOrCreateProperty("ArchivedClaimDetailScreen", "ArchivedClaimDetailScreen", null, pcftest.ArchivedClaimDetailScreen.class);
  }
  
  public ArchivedClaim_UpLink getArchivedClaim_UpLink() {
    return getOrCreateProperty("ArchivedClaim_UpLink", "ArchivedClaim_UpLink", null, pcftest.ArchivedClaim.ArchivedClaim_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ArchivedClaim._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ArchivedClaim.__crumb__.class);
  }
  
  public ClaimInfoGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimInfoGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/archive/ArchivedClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchivedClaim_UpLink extends ClickableActionElement {
    public ArchivedClaim_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/archive/ArchivedClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/archive/ArchivedClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}