package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CustomerServiceTierDetail.CustomerServiceTierDetail_UpLink;
import pcftest.CustomerServiceTierDetail._Paging;
import pcftest.CustomerServiceTierDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomerServiceTierDetail extends PCFLocation {
  public final static String CHECKSUM = "595a283226664276e55c64b7685affa3";
  
  public CustomerServiceTierDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CustomerServiceTierDetail"));
  }
  
  public CustomerServiceTierDetailScreen getCustomerServiceTierDetailScreen() {
    return getOrCreateProperty("CustomerServiceTierDetailScreen", "CustomerServiceTierDetailScreen", null, pcftest.CustomerServiceTierDetailScreen.class);
  }
  
  public CustomerServiceTierDetail_UpLink getCustomerServiceTierDetail_UpLink() {
    return getOrCreateProperty("CustomerServiceTierDetail_UpLink", "CustomerServiceTierDetail_UpLink", null, pcftest.CustomerServiceTierDetail.CustomerServiceTierDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CustomerServiceTierDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CustomerServiceTierDetail.__crumb__.class);
  }
  
  public CustomerServiceTierAdmin get_parent() {
    return getOrCreateProperty("_parent", pcftest.CustomerServiceTierAdmin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierDetail_UpLink extends ClickableActionElement {
    public CustomerServiceTierDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}