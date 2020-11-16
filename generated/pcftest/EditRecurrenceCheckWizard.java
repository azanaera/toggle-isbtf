package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.EditRecurrenceCheckWizard.Cancel;
import pcftest.EditRecurrenceCheckWizard.EditRecurrenceCheckWizard_UpLink;
import pcftest.EditRecurrenceCheckWizard.Finish;
import pcftest.EditRecurrenceCheckWizard.NewCheckInstructions;
import pcftest.EditRecurrenceCheckWizard.NewCheckPayees;
import pcftest.EditRecurrenceCheckWizard.NewCheckPayments;
import pcftest.EditRecurrenceCheckWizard.Next;
import pcftest.EditRecurrenceCheckWizard.Prev;
import pcftest.EditRecurrenceCheckWizard._Paging;
import pcftest.EditRecurrenceCheckWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditRecurrenceCheckWizard extends PCFLocation {
  public final static String CHECKSUM = "c7c62b46a28300a6161c375a4469570d";
  
  public EditRecurrenceCheckWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditRecurrenceCheckWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditRecurrenceCheckWizard.Cancel.class);
  }
  
  public EditRecurrenceCheckWizard_UpLink getEditRecurrenceCheckWizard_UpLink() {
    return getOrCreateProperty("EditRecurrenceCheckWizard_UpLink", "EditRecurrenceCheckWizard_UpLink", null, pcftest.EditRecurrenceCheckWizard.EditRecurrenceCheckWizard_UpLink.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.EditRecurrenceCheckWizard.Finish.class);
  }
  
  public NewCheckInstructions getNewCheckInstructions() {
    return getOrCreateProperty("NewCheckInstructions", "NewCheckInstructions", null, pcftest.EditRecurrenceCheckWizard.NewCheckInstructions.class);
  }
  
  public NewCheckPayees getNewCheckPayees() {
    return getOrCreateProperty("NewCheckPayees", "NewCheckPayees", null, pcftest.EditRecurrenceCheckWizard.NewCheckPayees.class);
  }
  
  public NewCheckPayments getNewCheckPayments() {
    return getOrCreateProperty("NewCheckPayments", "NewCheckPayments", null, pcftest.EditRecurrenceCheckWizard.NewCheckPayments.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.EditRecurrenceCheckWizard.Next.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.EditRecurrenceCheckWizard.Prev.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditRecurrenceCheckWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditRecurrenceCheckWizard.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditRecurrenceCheckWizard_UpLink extends ClickableActionElement {
    public EditRecurrenceCheckWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditRecurrenceCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}