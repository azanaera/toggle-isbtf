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
import pcftest.DenialPeriods.DenialPeriodsScreen;
import pcftest.DenialPeriods.DenialPeriodsScreen.Add;
import pcftest.DenialPeriods.DenialPeriodsScreen.CustomAdd;
import pcftest.DenialPeriods.DenialPeriodsScreen.Remove;
import pcftest.DenialPeriods.DenialPeriodsScreen._msgs;
import pcftest.DenialPeriods.DenialPeriods_UpLink;
import pcftest.DenialPeriods._Paging;
import pcftest.DenialPeriods.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DenialPeriods extends PCFLocation {
  public final static String CHECKSUM = "335c05e480d159b45565a609a8150803";
  
  public DenialPeriods(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DenialPeriods"));
  }
  
  public DenialPeriodsScreen getDenialPeriodsScreen() {
    return getOrCreateProperty("DenialPeriodsScreen", "DenialPeriodsScreen", null, pcftest.DenialPeriods.DenialPeriodsScreen.class);
  }
  
  public DenialPeriods_UpLink getDenialPeriods_UpLink() {
    return getOrCreateProperty("DenialPeriods_UpLink", "DenialPeriods_UpLink", null, pcftest.DenialPeriods.DenialPeriods_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DenialPeriods._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DenialPeriods.__crumb__.class);
  }
  
  public WCParms get_parent() {
    return getOrCreateProperty("_parent", pcftest.WCParms.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriodsScreen extends PCFElement {
    public DenialPeriodsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.DenialPeriods.DenialPeriodsScreen.Add.class);
    }
    
    public CustomAdd getCustomAdd() {
      return getOrCreateProperty("CustomAdd", "CustomAdd", null, pcftest.DenialPeriods.DenialPeriodsScreen.CustomAdd.class);
    }
    
    public DenialPeriodsLV getDenialPeriodsLV() {
      return getOrCreateProperty("DenialPeriodsLV", "DenialPeriodsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DenialPeriodsLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.DenialPeriods.DenialPeriodsScreen.Remove.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DenialPeriods.DenialPeriodsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomAdd extends ClickableActionElement {
      public CustomAdd(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DenialPeriodPopup click() {
        return clickThis(pcftest.DenialPeriodPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriods_UpLink extends ClickableActionElement {
    public DenialPeriods_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriods.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}