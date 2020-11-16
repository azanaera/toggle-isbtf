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
import pcftest.DuplicateClaimLossDetailsPopup.DuplicateClaimLossDetailsPopup_UpLink;
import pcftest.DuplicateClaimLossDetailsPopup.DuplicateClaimLossDetailsScreen;
import pcftest.DuplicateClaimLossDetailsPopup.DuplicateClaimLossDetailsScreen._msgs;
import pcftest.DuplicateClaimLossDetailsPopup._Paging;
import pcftest.DuplicateClaimLossDetailsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DuplicateClaimLossDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "bc0d043540d453f1540e3d62e3a753f8";
  
  public DuplicateClaimLossDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DuplicateClaimLossDetailsPopup"));
  }
  
  public DuplicateClaimLossDetailsPopup_UpLink getDuplicateClaimLossDetailsPopup_UpLink() {
    return getOrCreateProperty("DuplicateClaimLossDetailsPopup_UpLink", "DuplicateClaimLossDetailsPopup_UpLink", null, pcftest.DuplicateClaimLossDetailsPopup.DuplicateClaimLossDetailsPopup_UpLink.class);
  }
  
  public DuplicateClaimLossDetailsScreen getDuplicateClaimLossDetailsScreen() {
    return getOrCreateProperty("DuplicateClaimLossDetailsScreen", "DuplicateClaimLossDetailsScreen", null, pcftest.DuplicateClaimLossDetailsPopup.DuplicateClaimLossDetailsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DuplicateClaimLossDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DuplicateClaimLossDetailsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateClaimLossDetailsPopup_UpLink extends ClickableActionElement {
    public DuplicateClaimLossDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateClaimLossDetailsScreen extends PCFElement {
    public DuplicateClaimLossDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LossDetailsDV_Auto getLossDetailsDV_Auto() {
      return getOrCreateProperty("LossDetailsDV_Auto", "LossDetailsDV", null, pcftest.LossDetailsDV_Auto.class);
    }
    
    public LossDetailsDV_Gl getLossDetailsDV_Gl() {
      return getOrCreateProperty("LossDetailsDV_Gl", "LossDetailsDV", null, pcftest.LossDetailsDV_Gl.class);
    }
    
    public LossDetailsDV_Pr getLossDetailsDV_Pr() {
      return getOrCreateProperty("LossDetailsDV_Pr", "LossDetailsDV", null, pcftest.LossDetailsDV_Pr.class);
    }
    
    public LossDetailsDV_Trav getLossDetailsDV_Trav() {
      return getOrCreateProperty("LossDetailsDV_Trav", "LossDetailsDV", null, pcftest.LossDetailsDV_Trav.class);
    }
    
    public LossDetailsDV_Wc getLossDetailsDV_Wc() {
      return getOrCreateProperty("LossDetailsDV_Wc", "LossDetailsDV", null, pcftest.LossDetailsDV_Wc.class);
    }
    
    public LossDetailsDV_default getLossDetailsDV_default() {
      return getOrCreateProperty("LossDetailsDV_default", "LossDetailsDV", null, pcftest.LossDetailsDV_default.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DuplicateClaimLossDetailsPopup.DuplicateClaimLossDetailsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}