package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ManualCheckWizard_CheckPayeesScreen.Add;
import pcftest.ManualCheckWizard_CheckPayeesScreen.DetailsCardTab;
import pcftest.ManualCheckWizard_CheckPayeesScreen.NewManualCheckAdditionalPayeeDV_tb;
import pcftest.ManualCheckWizard_CheckPayeesScreen.NewManualCheckPayeeDV_tb;
import pcftest.ManualCheckWizard_CheckPayeesScreen.Remove;
import pcftest.ManualCheckWizard_CheckPayeesScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCheckWizard_CheckPayeesScreen extends PCFElement {
  public final static String CHECKSUM = "6442f506743c7028f58fa65345f583f5";
  
  public ManualCheckWizard_CheckPayeesScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.ManualCheckWizard_CheckPayeesScreen.Add.class);
  }
  
  public DetailsCardTab getDetailsCardTab() {
    return getOrCreateProperty("DetailsCardTab", "DetailsCardTab", null, pcftest.ManualCheckWizard_CheckPayeesScreen.DetailsCardTab.class);
  }
  
  public NewCheckPayeesLV getNewCheckPayeesLV() {
    return getOrCreateProperty("NewCheckPayeesLV", "NewCheckPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewCheckPayeesLV.class);
  }
  
  public NewManualCheckAdditionalPayeeDV getNewManualCheckAdditionalPayeeDV() {
    return getOrCreateProperty("NewManualCheckAdditionalPayeeDV", "NewManualCheckAdditionalPayeeDV", null, pcftest.NewManualCheckAdditionalPayeeDV.class);
  }
  
  public NewManualCheckAdditionalPayeeDV_tb getNewManualCheckAdditionalPayeeDV_tb() {
    return getOrCreateProperty("NewManualCheckAdditionalPayeeDV_tb", "NewManualCheckAdditionalPayeeDV_tb", null, pcftest.ManualCheckWizard_CheckPayeesScreen.NewManualCheckAdditionalPayeeDV_tb.class);
  }
  
  public NewManualCheckPayeeDV getNewManualCheckPayeeDV() {
    return getOrCreateProperty("NewManualCheckPayeeDV", "NewManualCheckPayeeDV", null, pcftest.NewManualCheckPayeeDV.class);
  }
  
  public NewManualCheckPayeeDV_tb getNewManualCheckPayeeDV_tb() {
    return getOrCreateProperty("NewManualCheckPayeeDV_tb", "NewManualCheckPayeeDV_tb", null, pcftest.ManualCheckWizard_CheckPayeesScreen.NewManualCheckPayeeDV_tb.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.ManualCheckWizard_CheckPayeesScreen.Remove.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ManualCheckWizard_CheckPayeesScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailsCardTab extends ClickableActionElement {
    public DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewManualCheckAdditionalPayeeDV_tb extends PCFElement {
    public NewManualCheckAdditionalPayeeDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewManualCheckPayeeDV_tb extends PCFElement {
    public NewManualCheckPayeeDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}