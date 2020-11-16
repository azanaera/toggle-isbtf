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
import pcftest.WorkloadClassifications.WeightedAssignmentScreen;
import pcftest.WorkloadClassifications.WeightedAssignmentScreen.AddClassificationButton;
import pcftest.WorkloadClassifications.WeightedAssignmentScreen.AddClassificationButton.NewClaimMenuItem;
import pcftest.WorkloadClassifications.WeightedAssignmentScreen.AddClassificationButton.NewExposureMenuItem;
import pcftest.WorkloadClassifications.WeightedAssignmentScreen.DisableClassificationsButton;
import pcftest.WorkloadClassifications.WeightedAssignmentScreen.EnableClassificationsButton;
import pcftest.WorkloadClassifications.WeightedAssignmentScreen.RemoveClassificationsButton;
import pcftest.WorkloadClassifications.WeightedAssignmentScreen._msgs;
import pcftest.WorkloadClassifications.WorkloadClassifications_UpLink;
import pcftest.WorkloadClassifications._Paging;
import pcftest.WorkloadClassifications.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassifications extends PCFLocation {
  public final static String CHECKSUM = "90ffc7724c521c345f952c5f9e1a5e0a";
  
  public WorkloadClassifications(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkloadClassifications"));
  }
  
  public WeightedAssignmentScreen getWeightedAssignmentScreen() {
    return getOrCreateProperty("WeightedAssignmentScreen", "WeightedAssignmentScreen", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen.class);
  }
  
  public WorkloadClassifications_UpLink getWorkloadClassifications_UpLink() {
    return getOrCreateProperty("WorkloadClassifications_UpLink", "WorkloadClassifications_UpLink", null, pcftest.WorkloadClassifications.WorkloadClassifications_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkloadClassifications._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkloadClassifications.__crumb__.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WeightedAssignmentScreen extends PCFElement {
    public WeightedAssignmentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddClassificationButton getAddClassificationButton() {
      return getOrCreateProperty("AddClassificationButton", "AddClassificationButton", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen.AddClassificationButton.class);
    }
    
    public DisableClassificationsButton getDisableClassificationsButton() {
      return getOrCreateProperty("DisableClassificationsButton", "DisableClassificationsButton", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen.DisableClassificationsButton.class);
    }
    
    public EnableClassificationsButton getEnableClassificationsButton() {
      return getOrCreateProperty("EnableClassificationsButton", "EnableClassificationsButton", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen.EnableClassificationsButton.class);
    }
    
    public RemoveClassificationsButton getRemoveClassificationsButton() {
      return getOrCreateProperty("RemoveClassificationsButton", "RemoveClassificationsButton", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen.RemoveClassificationsButton.class);
    }
    
    public WorkloadClassificationLV getWorkloadClassificationLV() {
      return getOrCreateProperty("WorkloadClassificationLV", "WorkloadClassificationLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkloadClassificationLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddClassificationButton extends ClickableActionElement {
      public AddClassificationButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimMenuItem getNewClaimMenuItem() {
        return getOrCreateProperty("NewClaimMenuItem", "NewClaimMenuItem", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen.AddClassificationButton.NewClaimMenuItem.class);
      }
      
      public NewExposureMenuItem getNewExposureMenuItem() {
        return getOrCreateProperty("NewExposureMenuItem", "NewExposureMenuItem", null, pcftest.WorkloadClassifications.WeightedAssignmentScreen.AddClassificationButton.NewExposureMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewClaimMenuItem extends ClickableActionElement {
        public NewClaimMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewWorkloadClassificationPopup click() {
          return clickThis(pcftest.NewWorkloadClassificationPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewExposureMenuItem extends ClickableActionElement {
        public NewExposureMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewWorkloadClassificationPopup click() {
          return clickThis(pcftest.NewWorkloadClassificationPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DisableClassificationsButton extends ClickableActionElement {
      public DisableClassificationsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableClassificationsButton extends ClickableActionElement {
      public EnableClassificationsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RemoveClassificationsButton extends ClickableActionElement {
      public RemoveClassificationsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadClassifications_UpLink extends ClickableActionElement {
    public WorkloadClassifications_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassifications.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}