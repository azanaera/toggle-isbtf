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
import pcftest.HolidaysPage.HolidaysPage_UpLink;
import pcftest.HolidaysPage.HolidaysScreen;
import pcftest.HolidaysPage.HolidaysScreen.HolidaysLV_tb;
import pcftest.HolidaysPage.HolidaysScreen.HolidaysLV_tb.Holidays_AddHolidayButton;
import pcftest.HolidaysPage.HolidaysScreen.HolidaysLV_tb.Holidays_DeleteButton;
import pcftest.HolidaysPage.HolidaysScreen._msgs;
import pcftest.HolidaysPage._Paging;
import pcftest.HolidaysPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidaysPage extends PCFLocation {
  public final static String CHECKSUM = "e13979b4e359ddfd066ab0048fdd1da1";
  
  public HolidaysPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("HolidaysPage"));
  }
  
  public HolidaysPage_UpLink getHolidaysPage_UpLink() {
    return getOrCreateProperty("HolidaysPage_UpLink", "HolidaysPage_UpLink", null, pcftest.HolidaysPage.HolidaysPage_UpLink.class);
  }
  
  public HolidaysScreen getHolidaysScreen() {
    return getOrCreateProperty("HolidaysScreen", "HolidaysScreen", null, pcftest.HolidaysPage.HolidaysScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.HolidaysPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.HolidaysPage.__crumb__.class);
  }
  
  public Holidays get_parent() {
    return getOrCreateProperty("_parent", pcftest.Holidays.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidaysPage_UpLink extends ClickableActionElement {
    public HolidaysPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidaysScreen extends PCFElement {
    public HolidaysScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public HolidaysLV getHolidaysLV() {
      return getOrCreateProperty("HolidaysLV", "HolidaysLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.HolidaysLV.class);
    }
    
    public HolidaysLV_tb getHolidaysLV_tb() {
      return getOrCreateProperty("HolidaysLV_tb", "HolidaysLV_tb", null, pcftest.HolidaysPage.HolidaysScreen.HolidaysLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.HolidaysPage.HolidaysScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HolidaysLV_tb extends PCFElement {
      public HolidaysLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Holidays_AddHolidayButton getHolidays_AddHolidayButton() {
        return getOrCreateProperty("Holidays_AddHolidayButton", "Holidays_AddHolidayButton", null, pcftest.HolidaysPage.HolidaysScreen.HolidaysLV_tb.Holidays_AddHolidayButton.class);
      }
      
      public Holidays_DeleteButton getHolidays_DeleteButton() {
        return getOrCreateProperty("Holidays_DeleteButton", "Holidays_DeleteButton", null, pcftest.HolidaysPage.HolidaysScreen.HolidaysLV_tb.Holidays_DeleteButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Holidays_AddHolidayButton extends ClickableActionElement {
        public Holidays_AddHolidayButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewHoliday click() {
          return clickThis(pcftest.NewHoliday.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Holidays_DeleteButton extends ClickableActionElement {
        public Holidays_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidaysPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}