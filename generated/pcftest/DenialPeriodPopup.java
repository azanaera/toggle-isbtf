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
import pcftest.DenialPeriodPopup.DenialPeriodDV_tb;
import pcftest.DenialPeriodPopup.DenialPeriodDV_tb.Cancel;
import pcftest.DenialPeriodPopup.DenialPeriodDV_tb.Edit;
import pcftest.DenialPeriodPopup.DenialPeriodDV_tb.Update;
import pcftest.DenialPeriodPopup.DenialPeriodPopup_UpLink;
import pcftest.DenialPeriodPopup._Paging;
import pcftest.DenialPeriodPopup.__crumb__;
import pcftest.DenialPeriodPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DenialPeriodPopup extends PCFLocation {
  public final static String CHECKSUM = "110bbf30403a0d030b151952ff4dc83f";
  
  public DenialPeriodPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DenialPeriodPopup"));
  }
  
  public DenialPeriodDV getDenialPeriodDV() {
    return getOrCreateProperty("DenialPeriodDV", "DenialPeriodDV", null, pcftest.DenialPeriodDV.class);
  }
  
  public DenialPeriodDV_tb getDenialPeriodDV_tb() {
    return getOrCreateProperty("DenialPeriodDV_tb", "DenialPeriodDV_tb", null, pcftest.DenialPeriodPopup.DenialPeriodDV_tb.class);
  }
  
  public DenialPeriodPopup_UpLink getDenialPeriodPopup_UpLink() {
    return getOrCreateProperty("DenialPeriodPopup_UpLink", "DenialPeriodPopup_UpLink", null, pcftest.DenialPeriodPopup.DenialPeriodPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DenialPeriodPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DenialPeriodPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DenialPeriodPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriodDV_tb extends PCFElement {
    public DenialPeriodDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.DenialPeriodPopup.DenialPeriodDV_tb.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.DenialPeriodPopup.DenialPeriodDV_tb.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.DenialPeriodPopup.DenialPeriodDV_tb.Update.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriodPopup_UpLink extends ClickableActionElement {
    public DenialPeriodPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}