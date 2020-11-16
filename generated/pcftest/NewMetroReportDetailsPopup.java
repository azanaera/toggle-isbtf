package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewMetroReportDetailsPopup.NewMetroReportDetailsPopup_UpLink;
import pcftest.NewMetroReportDetailsPopup._Paging;
import pcftest.NewMetroReportDetailsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/metro/NewMetroReportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewMetroReportDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "f0913fabbfea49aee9979f3802748ce8";
  
  public NewMetroReportDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewMetroReportDetailsPopup"));
  }
  
  public MetroReportDetailsScreen getMetroReportDetailsScreen() {
    return getOrCreateProperty("MetroReportDetailsScreen", "MetroReportDetailsScreen", null, pcftest.MetroReportDetailsScreen.class);
  }
  
  public NewMetroReportDetailsPopup_UpLink getNewMetroReportDetailsPopup_UpLink() {
    return getOrCreateProperty("NewMetroReportDetailsPopup_UpLink", "NewMetroReportDetailsPopup_UpLink", null, pcftest.NewMetroReportDetailsPopup.NewMetroReportDetailsPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewMetroReportDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewMetroReportDetailsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/NewMetroReportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewMetroReportDetailsPopup_UpLink extends ClickableActionElement {
    public NewMetroReportDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/NewMetroReportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/NewMetroReportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}