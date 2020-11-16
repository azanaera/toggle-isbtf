package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyRefreshWizard.Cancel;
import pcftest.PolicyRefreshWizard.Finish;
import pcftest.PolicyRefreshWizard.Next;
import pcftest.PolicyRefreshWizard.PolicyDiffStep;
import pcftest.PolicyRefreshWizard.PolicyRefreshWizard_UpLink;
import pcftest.PolicyRefreshWizard.Prev;
import pcftest.PolicyRefreshWizard.SelectPropertiesStep;
import pcftest.PolicyRefreshWizard.SelectVehiclesStep;
import pcftest.PolicyRefreshWizard._Paging;
import pcftest.PolicyRefreshWizard.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefreshWizard extends PCFLocation {
  public final static String CHECKSUM = "4c97eedee35a1535c2f46dabfcb92d77";
  
  public PolicyRefreshWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PolicyRefreshWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PolicyRefreshWizard.Cancel.class);
  }
  
  public ClaimInfoBar getClaimInfoBar() {
    return getOrCreateProperty("ClaimInfoBar", "ClaimInfoBar", null, pcftest.ClaimInfoBar.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.PolicyRefreshWizard.Finish.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.PolicyRefreshWizard.Next.class);
  }
  
  public PolicyDiffStep getPolicyDiffStep() {
    return getOrCreateProperty("PolicyDiffStep", "PolicyDiffStep", null, pcftest.PolicyRefreshWizard.PolicyDiffStep.class);
  }
  
  public PolicyRefreshWizard_UpLink getPolicyRefreshWizard_UpLink() {
    return getOrCreateProperty("PolicyRefreshWizard_UpLink", "PolicyRefreshWizard_UpLink", null, pcftest.PolicyRefreshWizard.PolicyRefreshWizard_UpLink.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.PolicyRefreshWizard.Prev.class);
  }
  
  public SelectPropertiesStep getSelectPropertiesStep() {
    return getOrCreateProperty("SelectPropertiesStep", "SelectPropertiesStep", null, pcftest.PolicyRefreshWizard.SelectPropertiesStep.class);
  }
  
  public SelectVehiclesStep getSelectVehiclesStep() {
    return getOrCreateProperty("SelectVehiclesStep", "SelectVehiclesStep", null, pcftest.PolicyRefreshWizard.SelectVehiclesStep.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PolicyRefreshWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PolicyRefreshWizard.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyDiffStep extends WizardMenuLinkElement {
    public PolicyDiffStep(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PolicyComparisonScreen click() {
      clickSelf();
return getPolicyComparisonScreen();
    }
    
    public PolicyComparisonScreen getPolicyComparisonScreen() {
      return getOrCreateWizardStepProperty("PolicyComparisonScreen", "PolicyComparisonScreen", null, pcftest.PolicyComparisonScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyRefreshWizard_UpLink extends ClickableActionElement {
    public PolicyRefreshWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SelectPropertiesStep extends WizardMenuLinkElement {
    public SelectPropertiesStep(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PolicyRefresh_PickPropertyRiskUnitsScreen click() {
      clickSelf();
return getPolicyRefresh_PickPropertyRiskUnitsScreen();
    }
    
    public PolicyRefresh_PickPropertyRiskUnitsScreen getPolicyRefresh_PickPropertyRiskUnitsScreen() {
      return getOrCreateWizardStepProperty("PolicyRefresh_PickPropertyRiskUnitsScreen", "PolicyRefresh_PickPropertyRiskUnitsScreen", null, pcftest.PolicyRefresh_PickPropertyRiskUnitsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SelectVehiclesStep extends WizardMenuLinkElement {
    public SelectVehiclesStep(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PolicyRefresh_PickVehicleRiskUnitsScreen click() {
      clickSelf();
return getPolicyRefresh_PickVehicleRiskUnitsScreen();
    }
    
    public PolicyRefresh_PickVehicleRiskUnitsScreen getPolicyRefresh_PickVehicleRiskUnitsScreen() {
      return getOrCreateWizardStepProperty("PolicyRefresh_PickVehicleRiskUnitsScreen", "PolicyRefresh_PickVehicleRiskUnitsScreen", null, pcftest.PolicyRefresh_PickVehicleRiskUnitsScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}