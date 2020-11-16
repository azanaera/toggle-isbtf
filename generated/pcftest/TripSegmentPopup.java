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
import pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb;
import pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.Add;
import pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.Remove;
import pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentApprovalButton;
import pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentClearButton;
import pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentDenyButton;
import pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentReviewlButton;
import pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb;
import pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb.Cancel;
import pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb.Edit;
import pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb.Update;
import pcftest.TripSegmentPopup.RebookedTransportationCardTab;
import pcftest.TripSegmentPopup.TripSegmentPopup_UpLink;
import pcftest.TripSegmentPopup._Paging;
import pcftest.TripSegmentPopup.__crumb__;
import pcftest.TripSegmentPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripSegmentPopup extends PCFLocation {
  public final static String CHECKSUM = "5178dfad75229bac3f79832076254593";
  
  public TripSegmentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TripSegmentPopup"));
  }
  
  public AdditionalTripSegmentLV getAdditionalTripSegmentLV() {
    return getOrCreateProperty("AdditionalTripSegmentLV", "AdditionalTripSegmentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AdditionalTripSegmentLV.class);
  }
  
  public AdditionalTripSegmentLV_tb getAdditionalTripSegmentLV_tb() {
    return getOrCreateProperty("AdditionalTripSegmentLV_tb", "AdditionalTripSegmentLV_tb", null, pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.class);
  }
  
  public pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV getClaimTripSegmentDetailDV() {
    return getOrCreateProperty("ClaimTripSegmentDetailDV", "ClaimTripSegmentDetailDV", null, pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.class);
  }
  
  public RebookedTransportationCardTab getRebookedTransportationCardTab() {
    return getOrCreateProperty("RebookedTransportationCardTab", "RebookedTransportationCardTab", null, pcftest.TripSegmentPopup.RebookedTransportationCardTab.class);
  }
  
  public TripSegmentPopup_UpLink getTripSegmentPopup_UpLink() {
    return getOrCreateProperty("TripSegmentPopup_UpLink", "TripSegmentPopup_UpLink", null, pcftest.TripSegmentPopup.TripSegmentPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TripSegmentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TripSegmentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TripSegmentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripSegmentLV_tb extends PCFElement {
    public AdditionalTripSegmentLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.Remove.class);
    }
    
    public SegmentApprovalButton getSegmentApprovalButton() {
      return getOrCreateProperty("SegmentApprovalButton", "SegmentApprovalButton", null, pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentApprovalButton.class);
    }
    
    public SegmentClearButton getSegmentClearButton() {
      return getOrCreateProperty("SegmentClearButton", "SegmentClearButton", null, pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentClearButton.class);
    }
    
    public SegmentDenyButton getSegmentDenyButton() {
      return getOrCreateProperty("SegmentDenyButton", "SegmentDenyButton", null, pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentDenyButton.class);
    }
    
    public SegmentReviewlButton getSegmentReviewlButton() {
      return getOrCreateProperty("SegmentReviewlButton", "SegmentReviewlButton", null, pcftest.TripSegmentPopup.AdditionalTripSegmentLV_tb.SegmentReviewlButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentApprovalButton extends ClickableActionElement {
      public SegmentApprovalButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentClearButton extends ClickableActionElement {
      public SegmentClearButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentDenyButton extends ClickableActionElement {
      public SegmentDenyButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentReviewlButton extends ClickableActionElement {
      public SegmentReviewlButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTripSegmentDetailDV extends PCFElement {
    public ClaimTripSegmentDetailDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimTripSegmentDetailDV getClaimTripSegmentDetailDV() {
      return getOrCreateProperty("ClaimTripSegmentDetailDV", "ClaimTripSegmentDetailDV", null, pcftest.ClaimTripSegmentDetailDV.class);
    }
    
    public ClaimTripSegmentDetailDV_tb getClaimTripSegmentDetailDV_tb() {
      return getOrCreateProperty("ClaimTripSegmentDetailDV_tb", "ClaimTripSegmentDetailDV_tb", null, pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimTripSegmentDetailDV_tb extends PCFElement {
      public ClaimTripSegmentDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.TripSegmentPopup.ClaimTripSegmentDetailDV.ClaimTripSegmentDetailDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RebookedTransportationCardTab extends ClickableActionElement {
    public RebookedTransportationCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripSegmentPopup_UpLink extends ClickableActionElement {
    public TripSegmentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}