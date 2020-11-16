package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleExportAllConfirmationPopup.Cancel;
import pcftest.RuleExportAllConfirmationPopup.Continue;
import pcftest.RuleExportAllConfirmationPopup.DraftsWithDeploymentUncertainty;
import pcftest.RuleExportAllConfirmationPopup.NoDeployedDrafts;
import pcftest.RuleExportAllConfirmationPopup.PreviouslyDeployedDrafts;
import pcftest.RuleExportAllConfirmationPopup.RuleExportAllConfirmationPopup_UpLink;
import pcftest.RuleExportAllConfirmationPopup._Paging;
import pcftest.RuleExportAllConfirmationPopup.__crumb__;
import pcftest.RuleExportAllConfirmationPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExportAllConfirmationPopup extends PCFLocation {
  public final static String CHECKSUM = "a448df2d50d627a941df9e0c674a22ea";
  
  public RuleExportAllConfirmationPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RuleExportAllConfirmationPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RuleExportAllConfirmationPopup.Cancel.class);
  }
  
  public Continue getContinue() {
    return getOrCreateProperty("Continue", "Continue", null, pcftest.RuleExportAllConfirmationPopup.Continue.class);
  }
  
  public DraftsWithDeploymentUncertainty getDraftsWithDeploymentUncertainty() {
    return getOrCreateProperty("DraftsWithDeploymentUncertainty", "DraftsWithDeploymentUncertainty", null, pcftest.RuleExportAllConfirmationPopup.DraftsWithDeploymentUncertainty.class);
  }
  
  public NoDeployedDrafts getNoDeployedDrafts() {
    return getOrCreateProperty("NoDeployedDrafts", "NoDeployedDrafts", null, pcftest.RuleExportAllConfirmationPopup.NoDeployedDrafts.class);
  }
  
  public PreviouslyDeployedDrafts getPreviouslyDeployedDrafts() {
    return getOrCreateProperty("PreviouslyDeployedDrafts", "PreviouslyDeployedDrafts", null, pcftest.RuleExportAllConfirmationPopup.PreviouslyDeployedDrafts.class);
  }
  
  public RuleExportAllConfirmationPopup_UpLink getRuleExportAllConfirmationPopup_UpLink() {
    return getOrCreateProperty("RuleExportAllConfirmationPopup_UpLink", "RuleExportAllConfirmationPopup_UpLink", null, pcftest.RuleExportAllConfirmationPopup.RuleExportAllConfirmationPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RuleExportAllConfirmationPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RuleExportAllConfirmationPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RuleExportAllConfirmationPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Continue extends ClickableActionElement {
    public Continue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DraftsWithDeploymentUncertainty extends PCFElement {
    public DraftsWithDeploymentUncertainty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExportExclusionsPanelSet getExportExclusionsPanelSet() {
      return getOrCreateProperty("ExportExclusionsPanelSet", "ExportExclusionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ExportExclusionsPanelSet.class);
    }
    
    public pcftest.RuleExportAllConfirmationPopup.DraftsWithDeploymentUncertainty.ExportExclusionsPanelSet_tb getExportExclusionsPanelSet_tb() {
      return getOrCreateProperty("ExportExclusionsPanelSet_tb", "ExportExclusionsPanelSet_tb", null, pcftest.RuleExportAllConfirmationPopup.DraftsWithDeploymentUncertainty.ExportExclusionsPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExportExclusionsPanelSet_tb extends PCFElement {
      public ExportExclusionsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoDeployedDrafts extends PCFElement {
    public NoDeployedDrafts(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExportExclusionsPanelSet getExportExclusionsPanelSet() {
      return getOrCreateProperty("ExportExclusionsPanelSet", "ExportExclusionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ExportExclusionsPanelSet.class);
    }
    
    public pcftest.RuleExportAllConfirmationPopup.NoDeployedDrafts.ExportExclusionsPanelSet_tb getExportExclusionsPanelSet_tb() {
      return getOrCreateProperty("ExportExclusionsPanelSet_tb", "ExportExclusionsPanelSet_tb", null, pcftest.RuleExportAllConfirmationPopup.NoDeployedDrafts.ExportExclusionsPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExportExclusionsPanelSet_tb extends PCFElement {
      public ExportExclusionsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PreviouslyDeployedDrafts extends PCFElement {
    public PreviouslyDeployedDrafts(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExportExclusionsPanelSet getExportExclusionsPanelSet() {
      return getOrCreateProperty("ExportExclusionsPanelSet", "ExportExclusionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ExportExclusionsPanelSet.class);
    }
    
    public pcftest.RuleExportAllConfirmationPopup.PreviouslyDeployedDrafts.ExportExclusionsPanelSet_tb getExportExclusionsPanelSet_tb() {
      return getOrCreateProperty("ExportExclusionsPanelSet_tb", "ExportExclusionsPanelSet_tb", null, pcftest.RuleExportAllConfirmationPopup.PreviouslyDeployedDrafts.ExportExclusionsPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExportExclusionsPanelSet_tb extends PCFElement {
      public ExportExclusionsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExportAllConfirmationPopup_UpLink extends ClickableActionElement {
    public RuleExportAllConfirmationPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}