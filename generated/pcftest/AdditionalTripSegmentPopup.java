package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdditionalTripSegmentPopup.AdditionalTripSegmentPopup_UpLink;
import pcftest.AdditionalTripSegmentPopup.Cancel;
import pcftest.AdditionalTripSegmentPopup.Edit;
import pcftest.AdditionalTripSegmentPopup.Update;
import pcftest.AdditionalTripSegmentPopup._Paging;
import pcftest.AdditionalTripSegmentPopup.__crumb__;
import pcftest.AdditionalTripSegmentPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentPopup extends PCFLocation {
  public final static String CHECKSUM = "873d184e221dc0d3a56240cbb8485130";
  
  public AdditionalTripSegmentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AdditionalTripSegmentPopup"));
  }
  
  public AdditionalTripSegmentDetailDV getAdditionalTripSegmentDetailDV() {
    return getOrCreateProperty("AdditionalTripSegmentDetailDV", "AdditionalTripSegmentDetailDV", null, pcftest.AdditionalTripSegmentDetailDV.class);
  }
  
  public AdditionalTripSegmentPopup_UpLink getAdditionalTripSegmentPopup_UpLink() {
    return getOrCreateProperty("AdditionalTripSegmentPopup_UpLink", "AdditionalTripSegmentPopup_UpLink", null, pcftest.AdditionalTripSegmentPopup.AdditionalTripSegmentPopup_UpLink.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.AdditionalTripSegmentPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.AdditionalTripSegmentPopup.Edit.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.AdditionalTripSegmentPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AdditionalTripSegmentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AdditionalTripSegmentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AdditionalTripSegmentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripSegmentPopup_UpLink extends ClickableActionElement {
    public AdditionalTripSegmentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}