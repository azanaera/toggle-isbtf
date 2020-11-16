package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPayScreen;
import pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPayScreen.CreatePayment;
import pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPayScreen._msgs;
import pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPay_UpLink;
import pcftest.NewCheckNoAbilityToPay._Paging;
import pcftest.NewCheckNoAbilityToPay.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckNoAbilityToPay extends PCFLocation {
  public final static String CHECKSUM = "edc735dadd16381b2661336ddb719f5e";
  
  public NewCheckNoAbilityToPay(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewCheckNoAbilityToPay"));
  }
  
  public NewCheckNoAbilityToPayScreen getNewCheckNoAbilityToPayScreen() {
    return getOrCreateProperty("NewCheckNoAbilityToPayScreen", "NewCheckNoAbilityToPayScreen", null, pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPayScreen.class);
  }
  
  public NewCheckNoAbilityToPay_UpLink getNewCheckNoAbilityToPay_UpLink() {
    return getOrCreateProperty("NewCheckNoAbilityToPay_UpLink", "NewCheckNoAbilityToPay_UpLink", null, pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPay_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewCheckNoAbilityToPay._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewCheckNoAbilityToPay.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckNoAbilityToPayScreen extends PCFElement {
    public NewCheckNoAbilityToPayScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreatePayment getCreatePayment() {
      return getOrCreateProperty("CreatePayment", "CreatePayment", null, pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPayScreen.CreatePayment.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewCheckNoAbilityToPay.NewCheckNoAbilityToPayScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatePayment extends ValueElement {
      public CreatePayment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSummary click() {
        return clickThis(pcftest.ClaimSummary.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckNoAbilityToPay_UpLink extends ClickableActionElement {
    public NewCheckNoAbilityToPay_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}