package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.HistoryForward.HistoryForward_UpLink;
import pcftest.HistoryForward._Paging;
import pcftest.HistoryForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/history/HistoryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HistoryForward extends PCFLocation {
  public final static String CHECKSUM = "2998cca3933cce9521dbc840836b4a74";
  
  public HistoryForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("HistoryForward"));
  }
  
  public HistoryForward_UpLink getHistoryForward_UpLink() {
    return getOrCreateProperty("HistoryForward_UpLink", "HistoryForward_UpLink", null, pcftest.HistoryForward.HistoryForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.HistoryForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.HistoryForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/history/HistoryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HistoryForward_UpLink extends ClickableActionElement {
    public HistoryForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/history/HistoryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/history/HistoryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}