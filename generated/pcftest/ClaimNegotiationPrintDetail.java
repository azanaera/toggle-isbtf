package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNegotiationPrintDetail.ClaimNegotiationPrintDetail_UpLink;
import pcftest.ClaimNegotiationPrintDetail.NegotiationPrintDetailScreen;
import pcftest.ClaimNegotiationPrintDetail.NegotiationPrintDetailScreen._msgs;
import pcftest.ClaimNegotiationPrintDetail._Paging;
import pcftest.ClaimNegotiationPrintDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNegotiationPrintDetail extends PCFLocation {
  public final static String CHECKSUM = "f4e4d4911d98d1945d5992316a837b0d";
  
  public ClaimNegotiationPrintDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNegotiationPrintDetail"));
  }
  
  public ClaimNegotiationPrintDetail_UpLink getClaimNegotiationPrintDetail_UpLink() {
    return getOrCreateProperty("ClaimNegotiationPrintDetail_UpLink", "ClaimNegotiationPrintDetail_UpLink", null, pcftest.ClaimNegotiationPrintDetail.ClaimNegotiationPrintDetail_UpLink.class);
  }
  
  public NegotiationPrintDetailScreen getNegotiationPrintDetailScreen() {
    return getOrCreateProperty("NegotiationPrintDetailScreen", "NegotiationPrintDetailScreen", null, pcftest.ClaimNegotiationPrintDetail.NegotiationPrintDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNegotiationPrintDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNegotiationPrintDetail.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNegotiationPrintDetail_UpLink extends ClickableActionElement {
    public ClaimNegotiationPrintDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NegotiationPrintDetailScreen extends PCFElement {
    public NegotiationPrintDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimNegotiationDetailsDV getClaimNegotiationDetailsDV() {
      return getOrCreateProperty("ClaimNegotiationDetailsDV", "ClaimNegotiationDetailsDV", null, pcftest.ClaimNegotiationDetailsDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimNegotiationPrintDetail.NegotiationPrintDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}