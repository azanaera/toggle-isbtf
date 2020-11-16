package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkloadClassificationDetailPopup.WorkloadClassificationDetailPopup_UpLink;
import pcftest.WorkloadClassificationDetailPopup._Paging;
import pcftest.WorkloadClassificationDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "ee239501ca90cd570ffb4bc9bc47044a";
  
  public WorkloadClassificationDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkloadClassificationDetailPopup"));
  }
  
  public WorkloadClassificationDetailPopup_UpLink getWorkloadClassificationDetailPopup_UpLink() {
    return getOrCreateProperty("WorkloadClassificationDetailPopup_UpLink", "WorkloadClassificationDetailPopup_UpLink", null, pcftest.WorkloadClassificationDetailPopup.WorkloadClassificationDetailPopup_UpLink.class);
  }
  
  public WorkloadClassificationDetailScreen getWorkloadClassificationDetailScreen() {
    return getOrCreateProperty("WorkloadClassificationDetailScreen", "WorkloadClassificationDetailScreen", null, pcftest.WorkloadClassificationDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkloadClassificationDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkloadClassificationDetailPopup.__crumb__.class);
  }
  
  public WorkloadClassifications get_parent() {
    return getOrCreateProperty("_parent", pcftest.WorkloadClassifications.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadClassificationDetailPopup_UpLink extends ClickableActionElement {
    public WorkloadClassificationDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}