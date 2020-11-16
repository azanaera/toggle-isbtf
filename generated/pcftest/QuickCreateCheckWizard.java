package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuickCreateCheckWizard.Cancel;
import pcftest.QuickCreateCheckWizard.Finish;
import pcftest.QuickCreateCheckWizard.Next;
import pcftest.QuickCreateCheckWizard.Prev;
import pcftest.QuickCreateCheckWizard.QuickCheckBasics;
import pcftest.QuickCreateCheckWizard.QuickCheckDetails;
import pcftest.QuickCreateCheckWizard.QuickCreateCheckWizard_UpLink;
import pcftest.QuickCreateCheckWizard._Paging;
import pcftest.QuickCreateCheckWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCreateCheckWizard extends PCFLocation {
  public final static String CHECKSUM = "d3d8e04d0c086a8f623263252a3a3700";
  
  public QuickCreateCheckWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("QuickCreateCheckWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.QuickCreateCheckWizard.Cancel.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.QuickCreateCheckWizard.Finish.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.QuickCreateCheckWizard.Next.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.QuickCreateCheckWizard.Prev.class);
  }
  
  public QuickCheckBasics getQuickCheckBasics() {
    return getOrCreateProperty("QuickCheckBasics", "QuickCheckBasics", null, pcftest.QuickCreateCheckWizard.QuickCheckBasics.class);
  }
  
  public QuickCheckDetails getQuickCheckDetails() {
    return getOrCreateProperty("QuickCheckDetails", "QuickCheckDetails", null, pcftest.QuickCreateCheckWizard.QuickCheckDetails.class);
  }
  
  public QuickCreateCheckWizard_UpLink getQuickCreateCheckWizard_UpLink() {
    return getOrCreateProperty("QuickCreateCheckWizard_UpLink", "QuickCreateCheckWizard_UpLink", null, pcftest.QuickCreateCheckWizard.QuickCreateCheckWizard_UpLink.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.QuickCreateCheckWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.QuickCreateCheckWizard.__crumb__.class);
  }
  
  public QuickCreateCheckWizardForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.QuickCreateCheckWizardForward.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCheckBasics extends WizardMenuLinkElement {
    public QuickCheckBasics(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public QuickCheckWizard_QuickCheckBasicsScreen click() {
      clickSelf();
return getQuickCheckWizard_QuickCheckBasicsScreen();
    }
    
    public QuickCheckWizard_QuickCheckBasicsScreen getQuickCheckWizard_QuickCheckBasicsScreen() {
      return getOrCreateWizardStepProperty("QuickCheckWizard_QuickCheckBasicsScreen", "QuickCheckWizard_QuickCheckBasicsScreen", null, pcftest.QuickCheckWizard_QuickCheckBasicsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCheckDetails extends WizardMenuLinkElement {
    public QuickCheckDetails(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCreateCheckWizard_UpLink extends ClickableActionElement {
    public QuickCreateCheckWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}