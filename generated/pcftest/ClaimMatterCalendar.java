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
import pcftest.ClaimMatterCalendar.ClaimMatterCalendar_UpLink;
import pcftest.ClaimMatterCalendar.MyClaimMatterCalendarScreen;
import pcftest.ClaimMatterCalendar.MyClaimMatterCalendarScreen._msgs;
import pcftest.ClaimMatterCalendar._Paging;
import pcftest.ClaimMatterCalendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimMatterCalendar extends PCFLocation {
  public final static String CHECKSUM = "02c9489631ebdc122c331aed524ab3a8";
  
  public ClaimMatterCalendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimMatterCalendar"));
  }
  
  public ClaimMatterCalendar_UpLink getClaimMatterCalendar_UpLink() {
    return getOrCreateProperty("ClaimMatterCalendar_UpLink", "ClaimMatterCalendar_UpLink", null, pcftest.ClaimMatterCalendar.ClaimMatterCalendar_UpLink.class);
  }
  
  public MyClaimMatterCalendarScreen getMyClaimMatterCalendarScreen() {
    return getOrCreateProperty("MyClaimMatterCalendarScreen", "MyClaimMatterCalendarScreen", null, pcftest.ClaimMatterCalendar.MyClaimMatterCalendarScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimMatterCalendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimMatterCalendar.__crumb__.class);
  }
  
  public MatterDetailPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.MatterDetailPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMatterCalendar_UpLink extends ClickableActionElement {
    public ClaimMatterCalendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MyClaimMatterCalendarScreen extends PCFElement {
    public MyClaimMatterCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimMatterCalendar.MyClaimMatterCalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}