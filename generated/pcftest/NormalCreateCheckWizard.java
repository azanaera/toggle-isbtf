package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NormalCreateCheckWizard.Cancel;
import pcftest.NormalCreateCheckWizard.Finish;
import pcftest.NormalCreateCheckWizard.NewCheckInstructions;
import pcftest.NormalCreateCheckWizard.NewCheckPayees;
import pcftest.NormalCreateCheckWizard.NewCheckPayments;
import pcftest.NormalCreateCheckWizard.Next;
import pcftest.NormalCreateCheckWizard.NormalCreateCheckWizard_UpLink;
import pcftest.NormalCreateCheckWizard.Prev;
import pcftest.NormalCreateCheckWizard._Paging;
import pcftest.NormalCreateCheckWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NormalCreateCheckWizard extends PCFLocation {
  public final static String CHECKSUM = "fc568396721c6db23dfa4593d9a265f0";
  
  public NormalCreateCheckWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NormalCreateCheckWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NormalCreateCheckWizard.Cancel.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.NormalCreateCheckWizard.Finish.class);
  }
  
  public NewCheckInstructions getNewCheckInstructions() {
    return getOrCreateProperty("NewCheckInstructions", "NewCheckInstructions", null, pcftest.NormalCreateCheckWizard.NewCheckInstructions.class);
  }
  
  public NewCheckPayees getNewCheckPayees() {
    return getOrCreateProperty("NewCheckPayees", "NewCheckPayees", null, pcftest.NormalCreateCheckWizard.NewCheckPayees.class);
  }
  
  public NewCheckPayments getNewCheckPayments() {
    return getOrCreateProperty("NewCheckPayments", "NewCheckPayments", null, pcftest.NormalCreateCheckWizard.NewCheckPayments.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.NormalCreateCheckWizard.Next.class);
  }
  
  public NormalCreateCheckWizard_UpLink getNormalCreateCheckWizard_UpLink() {
    return getOrCreateProperty("NormalCreateCheckWizard_UpLink", "NormalCreateCheckWizard_UpLink", null, pcftest.NormalCreateCheckWizard.NormalCreateCheckWizard_UpLink.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.NormalCreateCheckWizard.Prev.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NormalCreateCheckWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NormalCreateCheckWizard.__crumb__.class);
  }
  
  public NormalCreateCheckWizardForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.NormalCreateCheckWizardForward.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckInstructions extends WizardMenuLinkElement {
    public NewCheckInstructions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckWizard_CheckInstructionsScreen click() {
      clickSelf();
return getCheckWizard_CheckInstructionsScreen();
    }
    
    public CheckWizard_CheckInstructionsScreen getCheckWizard_CheckInstructionsScreen() {
      return getOrCreateWizardStepProperty("CheckWizard_CheckInstructionsScreen", "CheckWizard_CheckInstructionsScreen", null, pcftest.CheckWizard_CheckInstructionsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayees extends WizardMenuLinkElement {
    public NewCheckPayees(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckWizard_CheckPayeesScreen click() {
      clickSelf();
return getCheckWizard_CheckPayeesScreen();
    }
    
    public CheckWizard_CheckPayeesScreen getCheckWizard_CheckPayeesScreen() {
      return getOrCreateWizardStepProperty("CheckWizard_CheckPayeesScreen", "CheckWizard_CheckPayeesScreen", null, pcftest.CheckWizard_CheckPayeesScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayments extends WizardMenuLinkElement {
    public NewCheckPayments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckWizard_CheckPaymentsScreen click() {
      clickSelf();
return getCheckWizard_CheckPaymentsScreen();
    }
    
    public CheckWizard_CheckPaymentsScreen getCheckWizard_CheckPaymentsScreen() {
      return getOrCreateWizardStepProperty("CheckWizard_CheckPaymentsScreen", "CheckWizard_CheckPaymentsScreen", null, pcftest.CheckWizard_CheckPaymentsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NormalCreateCheckWizard_UpLink extends ClickableActionElement {
    public NormalCreateCheckWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}