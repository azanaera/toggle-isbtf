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
import pcftest.DashboardClaimCount.DashboardClaimCountScreen;
import pcftest.DashboardClaimCount.DashboardClaimCountScreen.PrintButton;
import pcftest.DashboardClaimCount.DashboardClaimCountScreen._msgs;
import pcftest.DashboardClaimCount.DashboardClaimCount_UpLink;
import pcftest.DashboardClaimCount._Paging;
import pcftest.DashboardClaimCount.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/DashboardClaimCount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardClaimCount extends PCFLocation {
  public final static String CHECKSUM = "10bb9f03252bbb3c9f1b22922ab4b8dc";
  
  public DashboardClaimCount(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DashboardClaimCount"));
  }
  
  public DashboardClaimCountScreen getDashboardClaimCountScreen() {
    return getOrCreateProperty("DashboardClaimCountScreen", "DashboardClaimCountScreen", null, pcftest.DashboardClaimCount.DashboardClaimCountScreen.class);
  }
  
  public DashboardClaimCount_UpLink getDashboardClaimCount_UpLink() {
    return getOrCreateProperty("DashboardClaimCount_UpLink", "DashboardClaimCount_UpLink", null, pcftest.DashboardClaimCount.DashboardClaimCount_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DashboardClaimCount._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DashboardClaimCount.__crumb__.class);
  }
  
  public DashboardSubGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.DashboardSubGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimCount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardClaimCountScreen extends PCFElement {
    public DashboardClaimCountScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimCountByLOBLV_NoFinancials getClaimCountByLOBLV_NoFinancials() {
      return getOrCreateProperty("ClaimCountByLOBLV_NoFinancials", "ClaimCountByLOBLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimCountByLOBLV_NoFinancials.class);
    }
    
    public ClaimCountByLOBLV_default getClaimCountByLOBLV_default() {
      return getOrCreateProperty("ClaimCountByLOBLV_default", "ClaimCountByLOBLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimCountByLOBLV_default.class);
    }
    
    public ClaimCountByLossTypeLV_NoFinancials getClaimCountByLossTypeLV_NoFinancials() {
      return getOrCreateProperty("ClaimCountByLossTypeLV_NoFinancials", "ClaimCountByLossTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimCountByLossTypeLV_NoFinancials.class);
    }
    
    public ClaimCountByLossTypeLV_default getClaimCountByLossTypeLV_default() {
      return getOrCreateProperty("ClaimCountByLossTypeLV_default", "ClaimCountByLossTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimCountByLossTypeLV_default.class);
    }
    
    public ClaimCountByOrgLevelLV_NoFinancials getClaimCountByOrgLevelLV_NoFinancials() {
      return getOrCreateProperty("ClaimCountByOrgLevelLV_NoFinancials", "ClaimCountByOrgLevelLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimCountByOrgLevelLV_NoFinancials.class);
    }
    
    public ClaimCountByOrgLevelLV_default getClaimCountByOrgLevelLV_default() {
      return getOrCreateProperty("ClaimCountByOrgLevelLV_default", "ClaimCountByOrgLevelLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimCountByOrgLevelLV_default.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.DashboardClaimCount.DashboardClaimCountScreen.PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DashboardClaimCount.DashboardClaimCountScreen._msgs.class);
    }
    
    public ValueElement getlabel() {
      return getOrCreateProperty("label", "label", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardClaimCount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardClaimCount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimCount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardClaimCount_UpLink extends ClickableActionElement {
    public DashboardClaimCount_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimCount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardClaimCount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}