package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Holidays.Holidays_UpLink;
import pcftest.Holidays._Paging;
import pcftest.Holidays.__crumb__;
import pcftest.Holidays._msgs;
import pcftest.Holidays.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/holidays/Holidays.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Holidays extends PCFLocation {
  public final static String CHECKSUM = "5dac7fb1da25e859e4a4835553f2a4a6";
  
  public Holidays(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Holidays"));
  }
  
  public BlankMenuLinks getBlankMenuLinks() {
    return getOrCreateMenuLinksProperty("BlankMenuLinks", "BlankMenuLinks", null, pcftest.BlankMenuLinks.class, null);
  }
  
  public HolidaysPage getHolidaysPage() {
    return getOrCreateProperty("HolidaysPage", pcftest.HolidaysPage.class);
  }
  
  public Holidays_UpLink getHolidays_UpLink() {
    return getOrCreateProperty("Holidays_UpLink", "Holidays_UpLink", null, pcftest.Holidays.Holidays_UpLink.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Holidays._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Holidays.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Holidays._msgs.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Holidays.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/Holidays.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Holidays_UpLink extends ClickableActionElement {
    public Holidays_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/Holidays.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/Holidays.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/Holidays.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/Holidays.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}