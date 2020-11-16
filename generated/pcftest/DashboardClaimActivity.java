package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DashboardClaimActivity.DashboardClaimActivityScreen;
import pcftest.DashboardClaimActivity.DashboardClaimActivityScreen.PrintButton;
import pcftest.DashboardClaimActivity.DashboardClaimActivityScreen._msgs;
import pcftest.DashboardClaimActivity.DashboardClaimActivity_UpLink;
import pcftest.DashboardClaimActivity._Paging;
import pcftest.DashboardClaimActivity.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/DashboardClaimActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardClaimActivity extends PCFLocation {
  public final static String CHECKSUM = "cf19e8e98ddda9a49917253d7f191715";
  
  public DashboardClaimActivity(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DashboardClaimActivity"));
  }
  
  public DashboardClaimActivityScreen getDashboardClaimActivityScreen() {
    return getOrCreateProperty("DashboardClaimActivityScreen", "DashboardClaimActivityScreen", null, pcftest.DashboardClaimActivity.DashboardClaimActivityScreen.class);
  }
  
  public DashboardClaimActivity_UpLink getDashboardClaimActivity_UpLink() {
    return getOrCreateProperty("DashboardClaimActivity_UpLink", "DashboardClaimActivity_UpLink", null, pcftest.DashboardClaimActivity.DashboardClaimActivity_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DashboardClaimActivity._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DashboardClaimActivity.__crumb__.class);
  }
  
  public DashboardSubGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.DashboardSubGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardClaimActivityScreen extends PCFElement {
    public DashboardClaimActivityScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimActivityByCoverageTypeLV getClaimActivityByCoverageTypeLV() {
      return getOrCreateProperty("ClaimActivityByCoverageTypeLV", "ClaimActivityByCoverageTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimActivityByCoverageTypeLV.class);
    }
    
    public ClaimActivityByLOBLV getClaimActivityByLOBLV() {
      return getOrCreateProperty("ClaimActivityByLOBLV", "ClaimActivityByLOBLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimActivityByLOBLV.class);
    }
    
    public ClaimActivityByLossTypeLV getClaimActivityByLossTypeLV() {
      return getOrCreateProperty("ClaimActivityByLossTypeLV", "ClaimActivityByLossTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimActivityByLossTypeLV.class);
    }
    
    public ClaimActivityByOrgLevelLV getClaimActivityByOrgLevelLV() {
      return getOrCreateProperty("ClaimActivityByOrgLevelLV", "ClaimActivityByOrgLevelLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimActivityByOrgLevelLV.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.DashboardClaimActivity.DashboardClaimActivityScreen.PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DashboardClaimActivity.DashboardClaimActivityScreen._msgs.class);
    }
    
    public ValueElement getlabel() {
      return getOrCreateProperty("label", "label", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardClaimActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardClaimActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardClaimActivity_UpLink extends ClickableActionElement {
    public DashboardClaimActivity_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}