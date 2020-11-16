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
import pcftest.ActivityPatterns.ActivityPatternsScreen;
import pcftest.ActivityPatterns.ActivityPatternsScreen.ActivityPatterns_DeleteButton;
import pcftest.ActivityPatterns.ActivityPatternsScreen.ActivityPatterns_NewActivityPatternButton;
import pcftest.ActivityPatterns.ActivityPatternsScreen._msgs;
import pcftest.ActivityPatterns.ActivityPatterns_UpLink;
import pcftest.ActivityPatterns._Paging;
import pcftest.ActivityPatterns.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityPatterns extends PCFLocation {
  public final static String CHECKSUM = "53f5db1fba4c64b76bf02a3c9a6434b8";
  
  public ActivityPatterns(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityPatterns"));
  }
  
  public ActivityPatternsScreen getActivityPatternsScreen() {
    return getOrCreateProperty("ActivityPatternsScreen", "ActivityPatternsScreen", null, pcftest.ActivityPatterns.ActivityPatternsScreen.class);
  }
  
  public ActivityPatterns_UpLink getActivityPatterns_UpLink() {
    return getOrCreateProperty("ActivityPatterns_UpLink", "ActivityPatterns_UpLink", null, pcftest.ActivityPatterns.ActivityPatterns_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityPatterns._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityPatterns.__crumb__.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternsScreen extends PCFElement {
    public ActivityPatternsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActivityPatternsLV getActivityPatternsLV() {
      return getOrCreateProperty("ActivityPatternsLV", "ActivityPatternsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ActivityPatternsLV.class);
    }
    
    public ActivityPatterns_DeleteButton getActivityPatterns_DeleteButton() {
      return getOrCreateProperty("ActivityPatterns_DeleteButton", "ActivityPatterns_DeleteButton", null, pcftest.ActivityPatterns.ActivityPatternsScreen.ActivityPatterns_DeleteButton.class);
    }
    
    public ActivityPatterns_NewActivityPatternButton getActivityPatterns_NewActivityPatternButton() {
      return getOrCreateProperty("ActivityPatterns_NewActivityPatternButton", "ActivityPatterns_NewActivityPatternButton", null, pcftest.ActivityPatterns.ActivityPatternsScreen.ActivityPatterns_NewActivityPatternButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ActivityPatterns.ActivityPatternsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActivityPatterns_DeleteButton extends ClickableActionElement {
      public ActivityPatterns_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActivityPatterns_NewActivityPatternButton extends ClickableActionElement {
      public ActivityPatterns_NewActivityPatternButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewActivityPattern click() {
        return clickThis(pcftest.NewActivityPattern.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatterns_UpLink extends ClickableActionElement {
    public ActivityPatterns_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}