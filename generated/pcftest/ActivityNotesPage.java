package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityNotesPage.ActivityNotesPage_UpLink;
import pcftest.ActivityNotesPage._Paging;
import pcftest.ActivityNotesPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/notes/ActivityNotesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityNotesPage extends PCFLocation {
  public final static String CHECKSUM = "1ae232ae6b10919fde7963c19aed7c76";
  
  public ActivityNotesPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityNotesPage"));
  }
  
  public ActivityNotesPage_UpLink getActivityNotesPage_UpLink() {
    return getOrCreateProperty("ActivityNotesPage_UpLink", "ActivityNotesPage_UpLink", null, pcftest.ActivityNotesPage.ActivityNotesPage_UpLink.class);
  }
  
  public NotesSearchScreen getNotesSearchScreen() {
    return getOrCreateProperty("NotesSearchScreen", "NotesSearchScreen", null, pcftest.NotesSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityNotesPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityNotesPage.__crumb__.class);
  }
  
  public ClaimWorkplan get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimWorkplan.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/ActivityNotesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityNotesPage_UpLink extends ClickableActionElement {
    public ActivityNotesPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/ActivityNotesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/ActivityNotesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}