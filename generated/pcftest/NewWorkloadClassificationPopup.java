package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewWorkloadClassificationPopup.NewWorkloadClassificationPopup_UpLink;
import pcftest.NewWorkloadClassificationPopup._Paging;
import pcftest.NewWorkloadClassificationPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/NewWorkloadClassificationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewWorkloadClassificationPopup extends PCFLocation {
  public final static String CHECKSUM = "2fb1352b5ddc4e8a79716b509d19a1c6";
  
  public NewWorkloadClassificationPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewWorkloadClassificationPopup"));
  }
  
  public NewWorkloadClassificationPopup_UpLink getNewWorkloadClassificationPopup_UpLink() {
    return getOrCreateProperty("NewWorkloadClassificationPopup_UpLink", "NewWorkloadClassificationPopup_UpLink", null, pcftest.NewWorkloadClassificationPopup.NewWorkloadClassificationPopup_UpLink.class);
  }
  
  public WorkloadClassificationDetailScreen getWorkloadClassificationDetailScreen() {
    return getOrCreateProperty("WorkloadClassificationDetailScreen", "WorkloadClassificationDetailScreen", null, pcftest.WorkloadClassificationDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewWorkloadClassificationPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewWorkloadClassificationPopup.__crumb__.class);
  }
  
  public WorkloadClassifications get_parent() {
    return getOrCreateProperty("_parent", pcftest.WorkloadClassifications.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/NewWorkloadClassificationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewWorkloadClassificationPopup_UpLink extends ClickableActionElement {
    public NewWorkloadClassificationPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/NewWorkloadClassificationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/NewWorkloadClassificationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}