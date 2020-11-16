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
import pcftest.NoClaim.NoClaimScreen;
import pcftest.NoClaim.NoClaimScreen._msgs;
import pcftest.NoClaim.NoClaim_UpLink;
import pcftest.NoClaim._Paging;
import pcftest.NoClaim.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/NoClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NoClaim extends PCFLocation {
  public final static String CHECKSUM = "51b0e346366914aa69b90074a6b8f507";
  
  public NoClaim(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NoClaim"));
  }
  
  public NoClaimScreen getNoClaimScreen() {
    return getOrCreateProperty("NoClaimScreen", "NoClaimScreen", null, pcftest.NoClaim.NoClaimScreen.class);
  }
  
  public NoClaim_UpLink getNoClaim_UpLink() {
    return getOrCreateProperty("NoClaim_UpLink", "NoClaim_UpLink", null, pcftest.NoClaim.NoClaim_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NoClaim._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NoClaim.__crumb__.class);
  }
  
  public ClaimMessage get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimMessage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/NoClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoClaimScreen extends PCFElement {
    public NoClaimScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NoClaimDV getNoClaimDV() {
      return getOrCreateProperty("NoClaimDV", "NoClaimDV", null, pcftest.NoClaimDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NoClaim.NoClaimScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/NoClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/NoClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoClaim_UpLink extends ClickableActionElement {
    public NoClaim_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/NoClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/NoClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}