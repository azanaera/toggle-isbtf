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
import pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb;
import pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb.Cancel;
import pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb.Edit;
import pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb.Update;
import pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetPopup_UpLink;
import pcftest.WCBenefitParameterSetPopup._Paging;
import pcftest.WCBenefitParameterSetPopup.__crumb__;
import pcftest.WCBenefitParameterSetPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitParameterSetPopup extends PCFLocation {
  public final static String CHECKSUM = "53477cb3a34b0c7b8fba3b56ef35a66d";
  
  public WCBenefitParameterSetPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WCBenefitParameterSetPopup"));
  }
  
  public WCBenefitParameterSetDV getWCBenefitParameterSetDV() {
    return getOrCreateProperty("WCBenefitParameterSetDV", "WCBenefitParameterSetDV", null, pcftest.WCBenefitParameterSetDV.class);
  }
  
  public WCBenefitParameterSetDV_tb getWCBenefitParameterSetDV_tb() {
    return getOrCreateProperty("WCBenefitParameterSetDV_tb", "WCBenefitParameterSetDV_tb", null, pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb.class);
  }
  
  public WCBenefitParameterSetPopup_UpLink getWCBenefitParameterSetPopup_UpLink() {
    return getOrCreateProperty("WCBenefitParameterSetPopup_UpLink", "WCBenefitParameterSetPopup_UpLink", null, pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WCBenefitParameterSetPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WCBenefitParameterSetPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WCBenefitParameterSetPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSetDV_tb extends PCFElement {
    public WCBenefitParameterSetDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.WCBenefitParameterSetPopup.WCBenefitParameterSetDV_tb.Update.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSetPopup_UpLink extends ClickableActionElement {
    public WCBenefitParameterSetPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}