package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewCustomerServiceTier.NewCustomerServiceTier_UpLink;
import pcftest.NewCustomerServiceTier._Paging;
import pcftest.NewCustomerServiceTier.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/customerservicetiers/NewCustomerServiceTier.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCustomerServiceTier extends PCFLocation {
  public final static String CHECKSUM = "7fe185ca4cacfef305094afa6efc0f96";
  
  public NewCustomerServiceTier(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewCustomerServiceTier"));
  }
  
  public CustomerServiceTierDetailScreen getCustomerServiceTierDetailScreen() {
    return getOrCreateProperty("CustomerServiceTierDetailScreen", "CustomerServiceTierDetailScreen", null, pcftest.CustomerServiceTierDetailScreen.class);
  }
  
  public NewCustomerServiceTier_UpLink getNewCustomerServiceTier_UpLink() {
    return getOrCreateProperty("NewCustomerServiceTier_UpLink", "NewCustomerServiceTier_UpLink", null, pcftest.NewCustomerServiceTier.NewCustomerServiceTier_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewCustomerServiceTier._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewCustomerServiceTier.__crumb__.class);
  }
  
  public CustomerServiceTierAdmin get_parent() {
    return getOrCreateProperty("_parent", pcftest.CustomerServiceTierAdmin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/NewCustomerServiceTier.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCustomerServiceTier_UpLink extends ClickableActionElement {
    public NewCustomerServiceTier_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/NewCustomerServiceTier.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/NewCustomerServiceTier.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}