package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPartiesInvolvedDetail.ClaimPartiesInvolvedDetail_UpLink;
import pcftest.ClaimPartiesInvolvedDetail._Paging;
import pcftest.ClaimPartiesInvolvedDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesInvolvedDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPartiesInvolvedDetail extends PCFLocation {
  public final static String CHECKSUM = "96d6ee246f2fa802cc9d31840c8ee1d8";
  
  public ClaimPartiesInvolvedDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPartiesInvolvedDetail"));
  }
  
  public ClaimPartiesInvolvedDetail_UpLink getClaimPartiesInvolvedDetail_UpLink() {
    return getOrCreateProperty("ClaimPartiesInvolvedDetail_UpLink", "ClaimPartiesInvolvedDetail_UpLink", null, pcftest.ClaimPartiesInvolvedDetail.ClaimPartiesInvolvedDetail_UpLink.class);
  }
  
  public ContactDetailScreen getContactDetailScreen() {
    return getOrCreateProperty("ContactDetailScreen", "ContactDetailScreen", null, pcftest.ContactDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPartiesInvolvedDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPartiesInvolvedDetail.__crumb__.class);
  }
  
  public ClaimContacts get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimContacts.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesInvolvedDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPartiesInvolvedDetail_UpLink extends ClickableActionElement {
    public ClaimPartiesInvolvedDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesInvolvedDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimPartiesInvolvedDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}