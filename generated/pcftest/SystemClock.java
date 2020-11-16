package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SystemClock.SystemClockScreen;
import pcftest.SystemClock.SystemClockScreen.AddDay;
import pcftest.SystemClock.SystemClockScreen.AddHour;
import pcftest.SystemClock.SystemClockScreen.AddMinute;
import pcftest.SystemClock.SystemClockScreen.AddMonth;
import pcftest.SystemClock.SystemClockScreen.AddWeek;
import pcftest.SystemClock.SystemClockScreen.AddYear;
import pcftest.SystemClock.SystemClockScreen.ChangeDate;
import pcftest.SystemClock.SystemClockScreen.CurrentTime;
import pcftest.SystemClock.SystemClockScreen.InClusterAlert;
import pcftest.SystemClock.SystemClockScreen.NotEnabledAlert;
import pcftest.SystemClock.SystemClockScreen.Progress;
import pcftest.SystemClock.SystemClockScreen._msgs;
import pcftest.SystemClock.SystemClock_UpLink;
import pcftest.SystemClock._Paging;
import pcftest.SystemClock.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SystemClock extends PCFLocation {
  public final static String CHECKSUM = "5bbf63723b7684d27f4be22f0bdc731f";
  
  public SystemClock(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SystemClock"));
  }
  
  public SystemClockScreen getSystemClockScreen() {
    return getOrCreateProperty("SystemClockScreen", "SystemClockScreen", null, pcftest.SystemClock.SystemClockScreen.class);
  }
  
  public SystemClock_UpLink getSystemClock_UpLink() {
    return getOrCreateProperty("SystemClock_UpLink", "SystemClock_UpLink", null, pcftest.SystemClock.SystemClock_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SystemClock._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SystemClock.__crumb__.class);
  }
  
  public UnsupportedTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.UnsupportedTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SystemClockScreen extends PCFElement {
    public SystemClockScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddDay getAddDay() {
      return getOrCreateProperty("AddDay", "AddDay", null, pcftest.SystemClock.SystemClockScreen.AddDay.class);
    }
    
    public AddHour getAddHour() {
      return getOrCreateProperty("AddHour", "AddHour", null, pcftest.SystemClock.SystemClockScreen.AddHour.class);
    }
    
    public AddMinute getAddMinute() {
      return getOrCreateProperty("AddMinute", "AddMinute", null, pcftest.SystemClock.SystemClockScreen.AddMinute.class);
    }
    
    public AddMonth getAddMonth() {
      return getOrCreateProperty("AddMonth", "AddMonth", null, pcftest.SystemClock.SystemClockScreen.AddMonth.class);
    }
    
    public AddWeek getAddWeek() {
      return getOrCreateProperty("AddWeek", "AddWeek", null, pcftest.SystemClock.SystemClockScreen.AddWeek.class);
    }
    
    public AddYear getAddYear() {
      return getOrCreateProperty("AddYear", "AddYear", null, pcftest.SystemClock.SystemClockScreen.AddYear.class);
    }
    
    public ChangeDate getChangeDate() {
      return getOrCreateProperty("ChangeDate", "ChangeDate", null, pcftest.SystemClock.SystemClockScreen.ChangeDate.class);
    }
    
    public CurrentTime getCurrentTime() {
      return getOrCreateProperty("CurrentTime", "CurrentTime", null, pcftest.SystemClock.SystemClockScreen.CurrentTime.class);
    }
    
    public DateElement getDate() {
      return getOrCreateProperty("Date", "Date", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public InClusterAlert getInClusterAlert() {
      return getOrCreateProperty("InClusterAlert", "InClusterAlert", null, pcftest.SystemClock.SystemClockScreen.InClusterAlert.class);
    }
    
    public NotEnabledAlert getNotEnabledAlert() {
      return getOrCreateProperty("NotEnabledAlert", "NotEnabledAlert", null, pcftest.SystemClock.SystemClockScreen.NotEnabledAlert.class);
    }
    
    public Progress getProgress() {
      return getOrCreateProperty("Progress", "Progress", null, pcftest.SystemClock.SystemClockScreen.Progress.class);
    }
    
    public UnsupportedToolsDisclaimerDV getUnsupportedToolsDisclaimerDV() {
      return getOrCreateProperty("UnsupportedToolsDisclaimerDV", "UnsupportedToolsDisclaimerDV", null, pcftest.UnsupportedToolsDisclaimerDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SystemClock.SystemClockScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddDay extends ClickableActionElement {
      public AddDay(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddHour extends ClickableActionElement {
      public AddHour(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddMinute extends ClickableActionElement {
      public AddMinute(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddMonth extends ClickableActionElement {
      public AddMonth(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddWeek extends ClickableActionElement {
      public AddWeek(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddYear extends ClickableActionElement {
      public AddYear(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChangeDate extends ValueElement {
      public ChangeDate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CurrentTime extends ValueElement {
      public CurrentTime(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InClusterAlert extends ClickableActionElement {
      public InClusterAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.SystemClock.SystemClockScreen.InClusterAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.SystemClock.SystemClockScreen.InClusterAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotEnabledAlert extends ClickableActionElement {
      public NotEnabledAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.SystemClock.SystemClockScreen.NotEnabledAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.SystemClock.SystemClockScreen.NotEnabledAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Progress extends ValueElement {
      public Progress(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SystemClock_UpLink extends ClickableActionElement {
    public SystemClock_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/internal/SystemClock.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}