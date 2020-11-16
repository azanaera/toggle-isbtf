package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BusinessWeek.BusinessWeek_UpLink;
import pcftest.BusinessWeek._Paging;
import pcftest.BusinessWeek.__crumb__;
import pcftest.BusinessWeek._msgs;
import pcftest.BusinessWeek.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeek extends PCFLocation {
  public final static String CHECKSUM = "90dd9adbd2f7379549c84727be3fd3e1";
  
  public BusinessWeek(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BusinessWeek"));
  }
  
  public BlankMenuLinks getBlankMenuLinks() {
    return getOrCreateMenuLinksProperty("BlankMenuLinks", "BlankMenuLinks", null, pcftest.BlankMenuLinks.class, null);
  }
  
  public BusinessWeekPage getBusinessWeekPage() {
    return getOrCreateProperty("BusinessWeekPage", pcftest.BusinessWeekPage.class);
  }
  
  public BusinessWeek_UpLink getBusinessWeek_UpLink() {
    return getOrCreateProperty("BusinessWeek_UpLink", "BusinessWeek_UpLink", null, pcftest.BusinessWeek.BusinessWeek_UpLink.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BusinessWeek._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BusinessWeek.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BusinessWeek._msgs.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.BusinessWeek.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeek_UpLink extends ClickableActionElement {
    public BusinessWeek_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}