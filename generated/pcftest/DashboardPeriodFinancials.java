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
import pcftest.DashboardPeriodFinancials.DashboardPeriodFinancialsScreen;
import pcftest.DashboardPeriodFinancials.DashboardPeriodFinancialsScreen.PrintButton;
import pcftest.DashboardPeriodFinancials.DashboardPeriodFinancialsScreen._msgs;
import pcftest.DashboardPeriodFinancials.DashboardPeriodFinancials_UpLink;
import pcftest.DashboardPeriodFinancials._Paging;
import pcftest.DashboardPeriodFinancials.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardPeriodFinancials extends PCFLocation {
  public final static String CHECKSUM = "6616e812c95b04cea6997939afe8b1fe";
  
  public DashboardPeriodFinancials(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DashboardPeriodFinancials"));
  }
  
  public DashboardPeriodFinancialsScreen getDashboardPeriodFinancialsScreen() {
    return getOrCreateProperty("DashboardPeriodFinancialsScreen", "DashboardPeriodFinancialsScreen", null, pcftest.DashboardPeriodFinancials.DashboardPeriodFinancialsScreen.class);
  }
  
  public DashboardPeriodFinancials_UpLink getDashboardPeriodFinancials_UpLink() {
    return getOrCreateProperty("DashboardPeriodFinancials_UpLink", "DashboardPeriodFinancials_UpLink", null, pcftest.DashboardPeriodFinancials.DashboardPeriodFinancials_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DashboardPeriodFinancials._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DashboardPeriodFinancials.__crumb__.class);
  }
  
  public DashboardSubGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.DashboardSubGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardPeriodFinancialsScreen extends PCFElement {
    public DashboardPeriodFinancialsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PeriodFinancialsByCoverageTypeLV getPeriodFinancialsByCoverageTypeLV() {
      return getOrCreateProperty("PeriodFinancialsByCoverageTypeLV", "PeriodFinancialsByCoverageTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PeriodFinancialsByCoverageTypeLV.class);
    }
    
    public PeriodFinancialsByLOBLV getPeriodFinancialsByLOBLV() {
      return getOrCreateProperty("PeriodFinancialsByLOBLV", "PeriodFinancialsByLOBLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PeriodFinancialsByLOBLV.class);
    }
    
    public PeriodFinancialsByLossTypeLV getPeriodFinancialsByLossTypeLV() {
      return getOrCreateProperty("PeriodFinancialsByLossTypeLV", "PeriodFinancialsByLossTypeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PeriodFinancialsByLossTypeLV.class);
    }
    
    public PeriodFinancialsByOrgLevelLV getPeriodFinancialsByOrgLevelLV() {
      return getOrCreateProperty("PeriodFinancialsByOrgLevelLV", "PeriodFinancialsByOrgLevelLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PeriodFinancialsByOrgLevelLV.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.DashboardPeriodFinancials.DashboardPeriodFinancialsScreen.PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DashboardPeriodFinancials.DashboardPeriodFinancialsScreen._msgs.class);
    }
    
    public ValueElement getdollarTip() {
      return getOrCreateProperty("dollarTip", "dollarTip", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getlabel() {
      return getOrCreateProperty("label", "label", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardPeriodFinancials_UpLink extends ClickableActionElement {
    public DashboardPeriodFinancials_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}