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
import pcftest.DashboardCurrentFinancials.DashboardCurrentFinancialsScreen;
import pcftest.DashboardCurrentFinancials.DashboardCurrentFinancialsScreen.PrintButton;
import pcftest.DashboardCurrentFinancials.DashboardCurrentFinancialsScreen._msgs;
import pcftest.DashboardCurrentFinancials.DashboardCurrentFinancials_UpLink;
import pcftest.DashboardCurrentFinancials._Paging;
import pcftest.DashboardCurrentFinancials.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardCurrentFinancials extends PCFLocation {
  public final static String CHECKSUM = "bbd39895f8a84c6cf219ab0d89a13295";
  
  public DashboardCurrentFinancials(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DashboardCurrentFinancials"));
  }
  
  public DashboardCurrentFinancialsScreen getDashboardCurrentFinancialsScreen() {
    return getOrCreateProperty("DashboardCurrentFinancialsScreen", "DashboardCurrentFinancialsScreen", null, pcftest.DashboardCurrentFinancials.DashboardCurrentFinancialsScreen.class);
  }
  
  public DashboardCurrentFinancials_UpLink getDashboardCurrentFinancials_UpLink() {
    return getOrCreateProperty("DashboardCurrentFinancials_UpLink", "DashboardCurrentFinancials_UpLink", null, pcftest.DashboardCurrentFinancials.DashboardCurrentFinancials_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DashboardCurrentFinancials._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DashboardCurrentFinancials.__crumb__.class);
  }
  
  public DashboardSubGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.DashboardSubGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardCurrentFinancialsScreen extends PCFElement {
    public DashboardCurrentFinancialsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CurrentFinancialsByCoverageTypeLV getCurrentFinancialsByCoverageTypeLV() {
      return getOrCreateProperty("CurrentFinancialsByCoverageTypeLV", "CurrentFinancialsByCoverageTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CurrentFinancialsByCoverageTypeLV.class);
    }
    
    public CurrentFinancialsByLOBLV getCurrentFinancialsByLOBLV() {
      return getOrCreateProperty("CurrentFinancialsByLOBLV", "CurrentFinancialsByLOBLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CurrentFinancialsByLOBLV.class);
    }
    
    public CurrentFinancialsByLossTypeLV getCurrentFinancialsByLossTypeLV() {
      return getOrCreateProperty("CurrentFinancialsByLossTypeLV", "CurrentFinancialsByLossTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CurrentFinancialsByLossTypeLV.class);
    }
    
    public CurrentFinancialsByOrgLevelLV getCurrentFinancialsByOrgLevelLV() {
      return getOrCreateProperty("CurrentFinancialsByOrgLevelLV", "CurrentFinancialsByOrgLevelLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CurrentFinancialsByOrgLevelLV.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.DashboardCurrentFinancials.DashboardCurrentFinancialsScreen.PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DashboardCurrentFinancials.DashboardCurrentFinancialsScreen._msgs.class);
    }
    
    public ValueElement getdollarTip() {
      return getOrCreateProperty("dollarTip", "dollarTip", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getlabel() {
      return getOrCreateProperty("label", "label", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardCurrentFinancials_UpLink extends ClickableActionElement {
    public DashboardCurrentFinancials_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}