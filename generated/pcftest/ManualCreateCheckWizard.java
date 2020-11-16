package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ManualCreateCheckWizard.Cancel;
import pcftest.ManualCreateCheckWizard.Finish;
import pcftest.ManualCreateCheckWizard.ManualCreateCheckWizard_UpLink;
import pcftest.ManualCreateCheckWizard.NewCheckInstructions;
import pcftest.ManualCreateCheckWizard.NewCheckPayees;
import pcftest.ManualCreateCheckWizard.NewCheckPayments;
import pcftest.ManualCreateCheckWizard.Next;
import pcftest.ManualCreateCheckWizard.Prev;
import pcftest.ManualCreateCheckWizard._Paging;
import pcftest.ManualCreateCheckWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCreateCheckWizard extends PCFLocation {
  public final static String CHECKSUM = "1878e130667293385d031af38fdde877";
  
  public ManualCreateCheckWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ManualCreateCheckWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ManualCreateCheckWizard.Cancel.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.ManualCreateCheckWizard.Finish.class);
  }
  
  public ManualCreateCheckWizard_UpLink getManualCreateCheckWizard_UpLink() {
    return getOrCreateProperty("ManualCreateCheckWizard_UpLink", "ManualCreateCheckWizard_UpLink", null, pcftest.ManualCreateCheckWizard.ManualCreateCheckWizard_UpLink.class);
  }
  
  public NewCheckInstructions getNewCheckInstructions() {
    return getOrCreateProperty("NewCheckInstructions", "NewCheckInstructions", null, pcftest.ManualCreateCheckWizard.NewCheckInstructions.class);
  }
  
  public NewCheckPayees getNewCheckPayees() {
    return getOrCreateProperty("NewCheckPayees", "NewCheckPayees", null, pcftest.ManualCreateCheckWizard.NewCheckPayees.class);
  }
  
  public NewCheckPayments getNewCheckPayments() {
    return getOrCreateProperty("NewCheckPayments", "NewCheckPayments", null, pcftest.ManualCreateCheckWizard.NewCheckPayments.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.ManualCreateCheckWizard.Next.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.ManualCreateCheckWizard.Prev.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ManualCreateCheckWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ManualCreateCheckWizard.__crumb__.class);
  }
  
  public ManualCreateCheckWizardForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.ManualCreateCheckWizardForward.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManualCreateCheckWizard_UpLink extends ClickableActionElement {
    public ManualCreateCheckWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckInstructions extends WizardMenuLinkElement {
    public NewCheckInstructions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ManualCheckWizard_CheckInstructionsScreen click() {
      clickSelf();
return getManualCheckWizard_CheckInstructionsScreen();
    }
    
    public ManualCheckWizard_CheckInstructionsScreen getManualCheckWizard_CheckInstructionsScreen() {
      return getOrCreateWizardStepProperty("ManualCheckWizard_CheckInstructionsScreen", "ManualCheckWizard_CheckInstructionsScreen", null, pcftest.ManualCheckWizard_CheckInstructionsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayees extends WizardMenuLinkElement {
    public NewCheckPayees(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ManualCheckWizard_CheckPayeesScreen click() {
      clickSelf();
return getManualCheckWizard_CheckPayeesScreen();
    }
    
    public ManualCheckWizard_CheckPayeesScreen getManualCheckWizard_CheckPayeesScreen() {
      return getOrCreateWizardStepProperty("ManualCheckWizard_CheckPayeesScreen", "ManualCheckWizard_CheckPayeesScreen", null, pcftest.ManualCheckWizard_CheckPayeesScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayments extends WizardMenuLinkElement {
    public NewCheckPayments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ManualCheckWizard_CheckPaymentsScreen click() {
      clickSelf();
return getManualCheckWizard_CheckPaymentsScreen();
    }
    
    public ManualCheckWizard_CheckPaymentsScreen getManualCheckWizard_CheckPaymentsScreen() {
      return getOrCreateWizardStepProperty("ManualCheckWizard_CheckPaymentsScreen", "ManualCheckWizard_CheckPaymentsScreen", null, pcftest.ManualCheckWizard_CheckPaymentsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}