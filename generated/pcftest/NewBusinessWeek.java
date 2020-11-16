package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewBusinessWeek.NewBusinessWeek_UpLink;
import pcftest.NewBusinessWeek._Paging;
import pcftest.NewBusinessWeek.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businessweek/NewBusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewBusinessWeek extends PCFLocation {
  public final static String CHECKSUM = "5104984661d3dab3a0796131f61282ca";
  
  public NewBusinessWeek(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewBusinessWeek"));
  }
  
  public BusinessWeekDetailScreen getBusinessWeekDetailScreen() {
    return getOrCreateProperty("BusinessWeekDetailScreen", "BusinessWeekDetailScreen", null, pcftest.BusinessWeekDetailScreen.class);
  }
  
  public NewBusinessWeek_UpLink getNewBusinessWeek_UpLink() {
    return getOrCreateProperty("NewBusinessWeek_UpLink", "NewBusinessWeek_UpLink", null, pcftest.NewBusinessWeek.NewBusinessWeek_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewBusinessWeek._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewBusinessWeek.__crumb__.class);
  }
  
  public BusinessWeekPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessWeekPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/NewBusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewBusinessWeek_UpLink extends ClickableActionElement {
    public NewBusinessWeek_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/NewBusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/NewBusinessWeek.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}