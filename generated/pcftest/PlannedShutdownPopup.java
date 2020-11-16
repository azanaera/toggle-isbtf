package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PlannedShutdownPopup.CustomMessageChoice_Choice;
import pcftest.PlannedShutdownPopup.PlannedShutdownPopup_UpLink;
import pcftest.PlannedShutdownPopup.RollingUpgradeShutdownChoice_Choice;
import pcftest.PlannedShutdownPopup.ScaleInShutdownChoice_Choice;
import pcftest.PlannedShutdownPopup.ScheduleShutdown;
import pcftest.PlannedShutdownPopup._Paging;
import pcftest.PlannedShutdownPopup.__crumb__;
import pcftest.PlannedShutdownPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PlannedShutdownPopup extends PCFLocation {
  public final static String CHECKSUM = "649fad572e1de1603505d1677b0086f8";
  
  public PlannedShutdownPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PlannedShutdownPopup"));
  }
  
  public ValueElement getCustomMessage() {
    return getOrCreateProperty("CustomMessage", "CustomMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CustomMessageChoice_Choice getCustomMessageChoice_Choice() {
    return getOrCreateProperty("CustomMessageChoice_Choice", "CustomMessageChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PlannedShutdownPopup.CustomMessageChoice_Choice.class);
  }
  
  public ValueElement getCustomMessageText() {
    return getOrCreateProperty("CustomMessageText", "CustomMessageText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PlannedShutdownPopup_UpLink getPlannedShutdownPopup_UpLink() {
    return getOrCreateProperty("PlannedShutdownPopup_UpLink", "PlannedShutdownPopup_UpLink", null, pcftest.PlannedShutdownPopup.PlannedShutdownPopup_UpLink.class);
  }
  
  public ValueElement getRollingUpgradeShutdown() {
    return getOrCreateProperty("RollingUpgradeShutdown", "RollingUpgradeShutdown", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RollingUpgradeShutdownChoice_Choice getRollingUpgradeShutdownChoice_Choice() {
    return getOrCreateProperty("RollingUpgradeShutdownChoice_Choice", "RollingUpgradeShutdownChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PlannedShutdownPopup.RollingUpgradeShutdownChoice_Choice.class);
  }
  
  public ValueElement getScaleInShutdown() {
    return getOrCreateProperty("ScaleInShutdown", "ScaleInShutdown", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ScaleInShutdownChoice_Choice getScaleInShutdownChoice_Choice() {
    return getOrCreateProperty("ScaleInShutdownChoice_Choice", "ScaleInShutdownChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PlannedShutdownPopup.ScaleInShutdownChoice_Choice.class);
  }
  
  public ScheduleShutdown getScheduleShutdown() {
    return getOrCreateProperty("ScheduleShutdown", "ScheduleShutdown", null, pcftest.PlannedShutdownPopup.ScheduleShutdown.class);
  }
  
  public DateElement getShutdownTime() {
    return getOrCreateProperty("ShutdownTime", "ShutdownTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public CheckboxValueElement getTerminateBatchProcesses() {
    return getOrCreateProperty("TerminateBatchProcesses", "TerminateBatchProcesses", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PlannedShutdownPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PlannedShutdownPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PlannedShutdownPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomMessageChoice_Choice extends RadioButtonValueElement {
    public CustomMessageChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PlannedShutdownPopup_UpLink extends ClickableActionElement {
    public PlannedShutdownPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RollingUpgradeShutdownChoice_Choice extends RadioButtonValueElement {
    public RollingUpgradeShutdownChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScaleInShutdownChoice_Choice extends RadioButtonValueElement {
    public ScaleInShutdownChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScheduleShutdown extends ClickableActionElement {
    public ScheduleShutdown(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}