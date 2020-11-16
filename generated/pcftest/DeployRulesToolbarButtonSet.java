package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DeployRulesToolbarButtonSet.DeployButton;
import pcftest.DeployRulesToolbarButtonSet.DeployButton.DeployAll;
import pcftest.DeployRulesToolbarButtonSet.DeployButton.DeploySelected;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/DeployRulesToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DeployRulesToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "8467dda14d6a057763f925dd09da280c";
  
  public DeployRulesToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeployButton getDeployButton() {
    return getOrCreateProperty("DeployButton", "DeployButton", null, pcftest.DeployRulesToolbarButtonSet.DeployButton.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployRulesToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeployButton extends ClickableActionElement {
    public DeployButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DeployAll getDeployAll() {
      return getOrCreateProperty("DeployAll", "DeployAll", null, pcftest.DeployRulesToolbarButtonSet.DeployButton.DeployAll.class);
    }
    
    public DeploySelected getDeploySelected() {
      return getOrCreateProperty("DeploySelected", "DeploySelected", null, pcftest.DeployRulesToolbarButtonSet.DeployButton.DeploySelected.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployRulesToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeployAll extends ClickableActionElement {
      public DeployAll(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployRulesToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeploySelected extends ClickableActionElement {
      public DeploySelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}