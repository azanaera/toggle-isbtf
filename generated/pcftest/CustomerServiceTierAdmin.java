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
import pcftest.CustomerServiceTierAdmin.CustomerServiceTierAdmin_UpLink;
import pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen;
import pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen.CustomerServiceTierToolbar;
import pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen.CustomerServiceTierToolbar.AddServiceTierButton;
import pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen.CustomerServiceTierToolbar.DeleteServiceTierButton;
import pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen._msgs;
import pcftest.CustomerServiceTierAdmin._Paging;
import pcftest.CustomerServiceTierAdmin.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomerServiceTierAdmin extends PCFLocation {
  public final static String CHECKSUM = "146866c8fa3d8c07b9c5a4a78ac27942";
  
  public CustomerServiceTierAdmin(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CustomerServiceTierAdmin"));
  }
  
  public CustomerServiceTierAdmin_UpLink getCustomerServiceTierAdmin_UpLink() {
    return getOrCreateProperty("CustomerServiceTierAdmin_UpLink", "CustomerServiceTierAdmin_UpLink", null, pcftest.CustomerServiceTierAdmin.CustomerServiceTierAdmin_UpLink.class);
  }
  
  public CustomerServiceTierScreen getCustomerServiceTierScreen() {
    return getOrCreateProperty("CustomerServiceTierScreen", "CustomerServiceTierScreen", null, pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CustomerServiceTierAdmin._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CustomerServiceTierAdmin.__crumb__.class);
  }
  
  public SpecialHandling get_parent() {
    return getOrCreateProperty("_parent", pcftest.SpecialHandling.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierAdmin_UpLink extends ClickableActionElement {
    public CustomerServiceTierAdmin_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierScreen extends PCFElement {
    public CustomerServiceTierScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CustomerServiceTierToolbar getCustomerServiceTierToolbar() {
      return getOrCreateProperty("CustomerServiceTierToolbar", "CustomerServiceTierToolbar", null, pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen.CustomerServiceTierToolbar.class);
    }
    
    public CustomerServiceTiersLV getCustomerServiceTiersLV() {
      return getOrCreateProperty("CustomerServiceTiersLV", "CustomerServiceTiersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CustomerServiceTiersLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomerServiceTierToolbar extends PCFElement {
      public CustomerServiceTierToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddServiceTierButton getAddServiceTierButton() {
        return getOrCreateProperty("AddServiceTierButton", "AddServiceTierButton", null, pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen.CustomerServiceTierToolbar.AddServiceTierButton.class);
      }
      
      public DeleteServiceTierButton getDeleteServiceTierButton() {
        return getOrCreateProperty("DeleteServiceTierButton", "DeleteServiceTierButton", null, pcftest.CustomerServiceTierAdmin.CustomerServiceTierScreen.CustomerServiceTierToolbar.DeleteServiceTierButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddServiceTierButton extends ClickableActionElement {
        public AddServiceTierButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewCustomerServiceTier click() {
          return clickThis(pcftest.NewCustomerServiceTier.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeleteServiceTierButton extends ClickableActionElement {
        public DeleteServiceTierButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}