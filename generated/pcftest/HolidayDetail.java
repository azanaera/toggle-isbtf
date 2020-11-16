package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.HolidayDetail.HolidayDetail_UpLink;
import pcftest.HolidayDetail._Paging;
import pcftest.HolidayDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/holidays/HolidayDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayDetail extends PCFLocation {
  public final static String CHECKSUM = "37587b00e5e475511547036cc3dc2337";
  
  public HolidayDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("HolidayDetail"));
  }
  
  public HolidayDetailScreen getHolidayDetailScreen() {
    return getOrCreateProperty("HolidayDetailScreen", "HolidayDetailScreen", null, pcftest.HolidayDetailScreen.class);
  }
  
  public HolidayDetail_UpLink getHolidayDetail_UpLink() {
    return getOrCreateProperty("HolidayDetail_UpLink", "HolidayDetail_UpLink", null, pcftest.HolidayDetail.HolidayDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.HolidayDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.HolidayDetail.__crumb__.class);
  }
  
  public HolidaysPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.HolidaysPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayDetail_UpLink extends ClickableActionElement {
    public HolidayDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}