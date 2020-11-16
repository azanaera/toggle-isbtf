package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BatchProcessInfo.BatchProcessInfo_UpLink;
import pcftest.BatchProcessInfo._Paging;
import pcftest.BatchProcessInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/BatchProcessInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BatchProcessInfo extends PCFLocation {
  public final static String CHECKSUM = "6113faaa2cd4f09e15c884e1fb7f0b39";
  
  public BatchProcessInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BatchProcessInfo"));
  }
  
  public BatchProcessInfo_UpLink getBatchProcessInfo_UpLink() {
    return getOrCreateProperty("BatchProcessInfo_UpLink", "BatchProcessInfo_UpLink", null, pcftest.BatchProcessInfo.BatchProcessInfo_UpLink.class);
  }
  
  public BatchProcessScreen getBatchProcessScreen() {
    return getOrCreateProperty("BatchProcessScreen", "BatchProcessScreen", null, pcftest.BatchProcessScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BatchProcessInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BatchProcessInfo.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessInfo_UpLink extends ClickableActionElement {
    public BatchProcessInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}