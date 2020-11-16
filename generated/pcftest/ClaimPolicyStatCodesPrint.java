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
import pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrintScreen;
import pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrintScreen.StatCodesLV_tb;
import pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrintScreen._msgs;
import pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrint_UpLink;
import pcftest.ClaimPolicyStatCodesPrint._Paging;
import pcftest.ClaimPolicyStatCodesPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyStatCodesPrint extends PCFLocation {
  public final static String CHECKSUM = "e338687af1b078805db63ce315325fbd";
  
  public ClaimPolicyStatCodesPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyStatCodesPrint"));
  }
  
  public ClaimPolicyStatCodesPrintScreen getClaimPolicyStatCodesPrintScreen() {
    return getOrCreateProperty("ClaimPolicyStatCodesPrintScreen", "ClaimPolicyStatCodesPrintScreen", null, pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrintScreen.class);
  }
  
  public ClaimPolicyStatCodesPrint_UpLink getClaimPolicyStatCodesPrint_UpLink() {
    return getOrCreateProperty("ClaimPolicyStatCodesPrint_UpLink", "ClaimPolicyStatCodesPrint_UpLink", null, pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyStatCodesPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyStatCodesPrint.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodesPrintScreen extends PCFElement {
    public ClaimPolicyStatCodesPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StatCodesLV getStatCodesLV() {
      return getOrCreateProperty("StatCodesLV", "StatCodesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatCodesLV.class);
    }
    
    public StatCodesLV_tb getStatCodesLV_tb() {
      return getOrCreateProperty("StatCodesLV_tb", "StatCodesLV_tb", null, pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrintScreen.StatCodesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyStatCodesPrint.ClaimPolicyStatCodesPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatCodesLV_tb extends PCFElement {
      public StatCodesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodesPrint_UpLink extends ClickableActionElement {
    public ClaimPolicyStatCodesPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}