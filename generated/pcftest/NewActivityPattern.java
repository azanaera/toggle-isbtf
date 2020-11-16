package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewActivityPattern.NewActivityPattern_UpLink;
import pcftest.NewActivityPattern._Paging;
import pcftest.NewActivityPattern.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/activitypatterns/NewActivityPattern.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewActivityPattern extends PCFLocation {
  public final static String CHECKSUM = "a868ed44b33fc250cf05fec959760f4d";
  
  public NewActivityPattern(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewActivityPattern"));
  }
  
  public ActivityPatternDetailScreen getActivityPatternDetailScreen() {
    return getOrCreateProperty("ActivityPatternDetailScreen", "ActivityPatternDetailScreen", null, pcftest.ActivityPatternDetailScreen.class);
  }
  
  public NewActivityPattern_UpLink getNewActivityPattern_UpLink() {
    return getOrCreateProperty("NewActivityPattern_UpLink", "NewActivityPattern_UpLink", null, pcftest.NewActivityPattern.NewActivityPattern_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewActivityPattern._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewActivityPattern.__crumb__.class);
  }
  
  public ActivityPatterns get_parent() {
    return getOrCreateProperty("_parent", pcftest.ActivityPatterns.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/NewActivityPattern.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityPattern_UpLink extends ClickableActionElement {
    public NewActivityPattern_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/NewActivityPattern.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/NewActivityPattern.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}