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
import pcftest.VacationActivities.VacationActivitiesScreen;
import pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Approve;
import pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Assign;
import pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Complete;
import pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Print;
import pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Reject;
import pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Skip;
import pcftest.VacationActivities.VacationActivitiesScreen._msgs;
import pcftest.VacationActivities.VacationActivities_UpLink;
import pcftest.VacationActivities._Paging;
import pcftest.VacationActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VacationActivities extends PCFLocation {
  public final static String CHECKSUM = "43aeab033a21374560ce5a4f326df135";
  
  public VacationActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VacationActivities"));
  }
  
  public VacationActivitiesScreen getVacationActivitiesScreen() {
    return getOrCreateProperty("VacationActivitiesScreen", "VacationActivitiesScreen", null, pcftest.VacationActivities.VacationActivitiesScreen.class);
  }
  
  public VacationActivities_UpLink getVacationActivities_UpLink() {
    return getOrCreateProperty("VacationActivities_UpLink", "VacationActivities_UpLink", null, pcftest.VacationActivities.VacationActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VacationActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VacationActivities.__crumb__.class);
  }
  
  public Vacation get_parent() {
    return getOrCreateProperty("_parent", pcftest.Vacation.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationActivitiesScreen extends PCFElement {
    public VacationActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public VacationActivitiesLV getVacationActivitiesLV() {
      return getOrCreateProperty("VacationActivitiesLV", "VacationActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VacationActivitiesLV.class);
    }
    
    public VacationActivities_Approve getVacationActivities_Approve() {
      return getOrCreateProperty("VacationActivities_Approve", "VacationActivities_Approve", null, pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Approve.class);
    }
    
    public VacationActivities_Assign getVacationActivities_Assign() {
      return getOrCreateProperty("VacationActivities_Assign", "VacationActivities_Assign", null, pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Assign.class);
    }
    
    public VacationActivities_Complete getVacationActivities_Complete() {
      return getOrCreateProperty("VacationActivities_Complete", "VacationActivities_Complete", null, pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Complete.class);
    }
    
    public VacationActivities_Print getVacationActivities_Print() {
      return getOrCreateProperty("VacationActivities_Print", "VacationActivities_Print", null, pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Print.class);
    }
    
    public VacationActivities_Reject getVacationActivities_Reject() {
      return getOrCreateProperty("VacationActivities_Reject", "VacationActivities_Reject", null, pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Reject.class);
    }
    
    public VacationActivities_Skip getVacationActivities_Skip() {
      return getOrCreateProperty("VacationActivities_Skip", "VacationActivities_Skip", null, pcftest.VacationActivities.VacationActivitiesScreen.VacationActivities_Skip.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VacationActivities.VacationActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationActivities_Approve extends ClickableActionElement {
      public VacationActivities_Approve(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationActivities_Assign extends ClickableActionElement {
      public VacationActivities_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationActivities_Complete extends ClickableActionElement {
      public VacationActivities_Complete(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationActivities_Print extends ClickableActionElement {
      public VacationActivities_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationActivities_Reject extends ClickableActionElement {
      public VacationActivities_Reject(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationActivities_Skip extends ClickableActionElement {
      public VacationActivities_Skip(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationActivities_UpLink extends ClickableActionElement {
    public VacationActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}