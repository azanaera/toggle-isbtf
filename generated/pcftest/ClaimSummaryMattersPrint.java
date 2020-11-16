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
import pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrintScreen;
import pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrintScreen.ClaimSummaryMattersLV_tb;
import pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrintScreen._msgs;
import pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrint_UpLink;
import pcftest.ClaimSummaryMattersPrint._Paging;
import pcftest.ClaimSummaryMattersPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryMattersPrint extends PCFLocation {
  public final static String CHECKSUM = "affa90cdb8b3173b784e83e3163be735";
  
  public ClaimSummaryMattersPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryMattersPrint"));
  }
  
  public ClaimSummaryMattersPrintScreen getClaimSummaryMattersPrintScreen() {
    return getOrCreateProperty("ClaimSummaryMattersPrintScreen", "ClaimSummaryMattersPrintScreen", null, pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrintScreen.class);
  }
  
  public ClaimSummaryMattersPrint_UpLink getClaimSummaryMattersPrint_UpLink() {
    return getOrCreateProperty("ClaimSummaryMattersPrint_UpLink", "ClaimSummaryMattersPrint_UpLink", null, pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryMattersPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryMattersPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryMattersPrintScreen extends PCFElement {
    public ClaimSummaryMattersPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSummaryMattersLV getClaimSummaryMattersLV() {
      return getOrCreateProperty("ClaimSummaryMattersLV", "ClaimSummaryMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryMattersLV.class);
    }
    
    public ClaimSummaryMattersLV_tb getClaimSummaryMattersLV_tb() {
      return getOrCreateProperty("ClaimSummaryMattersLV_tb", "ClaimSummaryMattersLV_tb", null, pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrintScreen.ClaimSummaryMattersLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryMattersPrint.ClaimSummaryMattersPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryMattersLV_tb extends PCFElement {
      public ClaimSummaryMattersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryMattersPrint_UpLink extends ClickableActionElement {
    public ClaimSummaryMattersPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}