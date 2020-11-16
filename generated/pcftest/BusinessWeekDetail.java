package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BusinessWeekDetail.BusinessWeekDetail_UpLink;
import pcftest.BusinessWeekDetail._Paging;
import pcftest.BusinessWeekDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekDetail extends PCFLocation {
  public final static String CHECKSUM = "efd76779a87bdc938ea70b8183d74a8f";
  
  public BusinessWeekDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BusinessWeekDetail"));
  }
  
  public BusinessWeekDetailScreen getBusinessWeekDetailScreen() {
    return getOrCreateProperty("BusinessWeekDetailScreen", "BusinessWeekDetailScreen", null, pcftest.BusinessWeekDetailScreen.class);
  }
  
  public BusinessWeekDetail_UpLink getBusinessWeekDetail_UpLink() {
    return getOrCreateProperty("BusinessWeekDetail_UpLink", "BusinessWeekDetail_UpLink", null, pcftest.BusinessWeekDetail.BusinessWeekDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BusinessWeekDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BusinessWeekDetail.__crumb__.class);
  }
  
  public BusinessWeekPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessWeekPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekDetail_UpLink extends ClickableActionElement {
    public BusinessWeekDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}