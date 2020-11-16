package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CloneCheckWizard.Cancel;
import pcftest.CloneCheckWizard.CloneCheckWizard_UpLink;
import pcftest.CloneCheckWizard.Finish;
import pcftest.CloneCheckWizard.NewCheckInstructions;
import pcftest.CloneCheckWizard.NewCheckPayees;
import pcftest.CloneCheckWizard.NewCheckPayments;
import pcftest.CloneCheckWizard.Next;
import pcftest.CloneCheckWizard.Prev;
import pcftest.CloneCheckWizard._Paging;
import pcftest.CloneCheckWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CloneCheckWizard extends PCFLocation {
  public final static String CHECKSUM = "db8419db38fb0f14bdaddb7e39565d80";
  
  public CloneCheckWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CloneCheckWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CloneCheckWizard.Cancel.class);
  }
  
  public CloneCheckWizard_UpLink getCloneCheckWizard_UpLink() {
    return getOrCreateProperty("CloneCheckWizard_UpLink", "CloneCheckWizard_UpLink", null, pcftest.CloneCheckWizard.CloneCheckWizard_UpLink.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.CloneCheckWizard.Finish.class);
  }
  
  public NewCheckInstructions getNewCheckInstructions() {
    return getOrCreateProperty("NewCheckInstructions", "NewCheckInstructions", null, pcftest.CloneCheckWizard.NewCheckInstructions.class);
  }
  
  public NewCheckPayees getNewCheckPayees() {
    return getOrCreateProperty("NewCheckPayees", "NewCheckPayees", null, pcftest.CloneCheckWizard.NewCheckPayees.class);
  }
  
  public NewCheckPayments getNewCheckPayments() {
    return getOrCreateProperty("NewCheckPayments", "NewCheckPayments", null, pcftest.CloneCheckWizard.NewCheckPayments.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.CloneCheckWizard.Next.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.CloneCheckWizard.Prev.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CloneCheckWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CloneCheckWizard.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloneCheckWizard_UpLink extends ClickableActionElement {
    public CloneCheckWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}