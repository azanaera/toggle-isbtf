package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckWizard_CheckPayeesScreen.Add;
import pcftest.CheckWizard_CheckPayeesScreen.DetailsCardTab;
import pcftest.CheckWizard_CheckPayeesScreen.NewCheckAdditionalPayeeDV_tb;
import pcftest.CheckWizard_CheckPayeesScreen.NewCheckPayeeDV_tb;
import pcftest.CheckWizard_CheckPayeesScreen.Remove;
import pcftest.CheckWizard_CheckPayeesScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizard_CheckPayeesScreen extends PCFElement {
  public final static String CHECKSUM = "5f53bfc7cee3d0c8cdc85d0cba03aed6";
  
  public CheckWizard_CheckPayeesScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.CheckWizard_CheckPayeesScreen.Add.class);
  }
  
  public DetailsCardTab getDetailsCardTab() {
    return getOrCreateProperty("DetailsCardTab", "DetailsCardTab", null, pcftest.CheckWizard_CheckPayeesScreen.DetailsCardTab.class);
  }
  
  public NewCheckAdditionalPayeeDV getNewCheckAdditionalPayeeDV() {
    return getOrCreateProperty("NewCheckAdditionalPayeeDV", "NewCheckAdditionalPayeeDV", null, pcftest.NewCheckAdditionalPayeeDV.class);
  }
  
  public NewCheckAdditionalPayeeDV_tb getNewCheckAdditionalPayeeDV_tb() {
    return getOrCreateProperty("NewCheckAdditionalPayeeDV_tb", "NewCheckAdditionalPayeeDV_tb", null, pcftest.CheckWizard_CheckPayeesScreen.NewCheckAdditionalPayeeDV_tb.class);
  }
  
  public NewCheckPayeeDV getNewCheckPayeeDV() {
    return getOrCreateProperty("NewCheckPayeeDV", "NewCheckPayeeDV", null, pcftest.NewCheckPayeeDV.class);
  }
  
  public NewCheckPayeeDV_tb getNewCheckPayeeDV_tb() {
    return getOrCreateProperty("NewCheckPayeeDV_tb", "NewCheckPayeeDV_tb", null, pcftest.CheckWizard_CheckPayeesScreen.NewCheckPayeeDV_tb.class);
  }
  
  public NewCheckPayeesLV getNewCheckPayeesLV() {
    return getOrCreateProperty("NewCheckPayeesLV", "NewCheckPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewCheckPayeesLV.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.CheckWizard_CheckPayeesScreen.Remove.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CheckWizard_CheckPayeesScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailsCardTab extends ClickableActionElement {
    public DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckAdditionalPayeeDV_tb extends PCFElement {
    public NewCheckAdditionalPayeeDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDV_tb extends PCFElement {
    public NewCheckPayeeDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}