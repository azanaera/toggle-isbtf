package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.EditCheckWizard.Cancel;
import pcftest.EditCheckWizard.EditCheckWizard_UpLink;
import pcftest.EditCheckWizard.Finish;
import pcftest.EditCheckWizard.NewCheckInstructions;
import pcftest.EditCheckWizard.NewCheckPayees;
import pcftest.EditCheckWizard.NewCheckPayments;
import pcftest.EditCheckWizard.Next;
import pcftest.EditCheckWizard.Prev;
import pcftest.EditCheckWizard._Paging;
import pcftest.EditCheckWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditCheckWizard extends PCFLocation {
  public final static String CHECKSUM = "c58449ecddcbddc74bcdd9ff85571cfa";
  
  public EditCheckWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditCheckWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditCheckWizard.Cancel.class);
  }
  
  public EditCheckWizard_UpLink getEditCheckWizard_UpLink() {
    return getOrCreateProperty("EditCheckWizard_UpLink", "EditCheckWizard_UpLink", null, pcftest.EditCheckWizard.EditCheckWizard_UpLink.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.EditCheckWizard.Finish.class);
  }
  
  public NewCheckInstructions getNewCheckInstructions() {
    return getOrCreateProperty("NewCheckInstructions", "NewCheckInstructions", null, pcftest.EditCheckWizard.NewCheckInstructions.class);
  }
  
  public NewCheckPayees getNewCheckPayees() {
    return getOrCreateProperty("NewCheckPayees", "NewCheckPayees", null, pcftest.EditCheckWizard.NewCheckPayees.class);
  }
  
  public NewCheckPayments getNewCheckPayments() {
    return getOrCreateProperty("NewCheckPayments", "NewCheckPayments", null, pcftest.EditCheckWizard.NewCheckPayments.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.EditCheckWizard.Next.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.EditCheckWizard.Prev.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditCheckWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditCheckWizard.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditCheckWizard_UpLink extends ClickableActionElement {
    public EditCheckWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}