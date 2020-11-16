package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CognosReport.CognosReport_UpLink;
import pcftest.CognosReport._Paging;
import pcftest.CognosReport.__crumb__;
import pcftest.CognosReport._msgs;
import pcftest.CognosReport.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/cognos/CognosReport.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CognosReport extends PCFLocation {
  public final static String CHECKSUM = "318346b9d1d92843a0b01bdd5692c885";
  
  public CognosReport(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CognosReport"));
  }
  
  public BlankMenuLinks getBlankMenuLinks() {
    return getOrCreateMenuLinksProperty("BlankMenuLinks", "BlankMenuLinks", null, pcftest.BlankMenuLinks.class, null);
  }
  
  public CognosReportPage getCognosReportPage() {
    return getOrCreateProperty("CognosReportPage", pcftest.CognosReportPage.class);
  }
  
  public CognosReport_UpLink getCognosReport_UpLink() {
    return getOrCreateProperty("CognosReport_UpLink", "CognosReport_UpLink", null, pcftest.CognosReport.CognosReport_UpLink.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CognosReport._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CognosReport.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CognosReport._msgs.class);
  }
  
  public Reports get_parent() {
    return getOrCreateProperty("_parent", pcftest.Reports.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.CognosReport.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReport.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CognosReport_UpLink extends ClickableActionElement {
    public CognosReport_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReport.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReport.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReport.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReport.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}