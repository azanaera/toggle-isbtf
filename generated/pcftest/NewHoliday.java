package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewHoliday.NewHoliday_UpLink;
import pcftest.NewHoliday._Paging;
import pcftest.NewHoliday.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/holidays/NewHoliday.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewHoliday extends PCFLocation {
  public final static String CHECKSUM = "50801acb08a2674f72b54808b60a5649";
  
  public NewHoliday(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewHoliday"));
  }
  
  public HolidayDetailScreen getHolidayDetailScreen() {
    return getOrCreateProperty("HolidayDetailScreen", "HolidayDetailScreen", null, pcftest.HolidayDetailScreen.class);
  }
  
  public NewHoliday_UpLink getNewHoliday_UpLink() {
    return getOrCreateProperty("NewHoliday_UpLink", "NewHoliday_UpLink", null, pcftest.NewHoliday.NewHoliday_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewHoliday._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewHoliday.__crumb__.class);
  }
  
  public HolidaysPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.HolidaysPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/NewHoliday.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewHoliday_UpLink extends ClickableActionElement {
    public NewHoliday_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/NewHoliday.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/NewHoliday.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}