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
import pcftest.VacationExposures.VacationExposuresScreen;
import pcftest.VacationExposures.VacationExposuresScreen.VacationExposures_Assign;
import pcftest.VacationExposures.VacationExposuresScreen.VacationExposures_Print;
import pcftest.VacationExposures.VacationExposuresScreen._msgs;
import pcftest.VacationExposures.VacationExposures_UpLink;
import pcftest.VacationExposures._Paging;
import pcftest.VacationExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VacationExposures extends PCFLocation {
  public final static String CHECKSUM = "37531cdc8bc2e242173d581a2937eed6";
  
  public VacationExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VacationExposures"));
  }
  
  public VacationExposuresScreen getVacationExposuresScreen() {
    return getOrCreateProperty("VacationExposuresScreen", "VacationExposuresScreen", null, pcftest.VacationExposures.VacationExposuresScreen.class);
  }
  
  public VacationExposures_UpLink getVacationExposures_UpLink() {
    return getOrCreateProperty("VacationExposures_UpLink", "VacationExposures_UpLink", null, pcftest.VacationExposures.VacationExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VacationExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VacationExposures.__crumb__.class);
  }
  
  public Vacation get_parent() {
    return getOrCreateProperty("_parent", pcftest.Vacation.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationExposuresScreen extends PCFElement {
    public VacationExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MyVacationExposuresLV getMyVacationExposuresLV() {
      return getOrCreateProperty("MyVacationExposuresLV", "MyVacationExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MyVacationExposuresLV.class);
    }
    
    public VacationExposures_Assign getVacationExposures_Assign() {
      return getOrCreateProperty("VacationExposures_Assign", "VacationExposures_Assign", null, pcftest.VacationExposures.VacationExposuresScreen.VacationExposures_Assign.class);
    }
    
    public VacationExposures_Print getVacationExposures_Print() {
      return getOrCreateProperty("VacationExposures_Print", "VacationExposures_Print", null, pcftest.VacationExposures.VacationExposuresScreen.VacationExposures_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VacationExposures.VacationExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationExposures_Assign extends ClickableActionElement {
      public VacationExposures_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VacationExposures_Print extends ClickableActionElement {
      public VacationExposures_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationExposures_UpLink extends ClickableActionElement {
    public VacationExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}