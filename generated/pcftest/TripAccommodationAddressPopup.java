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
import pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb;
import pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.Add;
import pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.AddnlAccommodationClearButton;
import pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.AddnlAccommodationDenyButton;
import pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.AddnlAccommodationReviewButton;
import pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.Remove;
import pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.SegmentApprovalButton;
import pcftest.TripAccommodationAddressPopup.AffectedTripAccommodationCardTab;
import pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV;
import pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb;
import pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb.Cancel;
import pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb.Edit;
import pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb.Update;
import pcftest.TripAccommodationAddressPopup.TripAccommodationAddressPopup_UpLink;
import pcftest.TripAccommodationAddressPopup._Paging;
import pcftest.TripAccommodationAddressPopup.__crumb__;
import pcftest.TripAccommodationAddressPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripAccommodationAddressPopup extends PCFLocation {
  public final static String CHECKSUM = "dbf00018763fd503a6aff007edfd772a";
  
  public TripAccommodationAddressPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TripAccommodationAddressPopup"));
  }
  
  public AdditionalTripAccommodationLV getAdditionalTripAccommodationLV() {
    return getOrCreateProperty("AdditionalTripAccommodationLV", "AdditionalTripAccommodationLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AdditionalTripAccommodationLV.class);
  }
  
  public AdditionalTripAccommodationLV_tb getAdditionalTripAccommodationLV_tb() {
    return getOrCreateProperty("AdditionalTripAccommodationLV_tb", "AdditionalTripAccommodationLV_tb", null, pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.class);
  }
  
  public AffectedTripAccommodationCardTab getAffectedTripAccommodationCardTab() {
    return getOrCreateProperty("AffectedTripAccommodationCardTab", "AffectedTripAccommodationCardTab", null, pcftest.TripAccommodationAddressPopup.AffectedTripAccommodationCardTab.class);
  }
  
  public ClaimPolicyTripAccommodationDetailDV getClaimPolicyTripAccommodationDetailDV() {
    return getOrCreateProperty("ClaimPolicyTripAccommodationDetailDV", "ClaimPolicyTripAccommodationDetailDV", null, pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.class);
  }
  
  public TripAccommodationAddressPopup_UpLink getTripAccommodationAddressPopup_UpLink() {
    return getOrCreateProperty("TripAccommodationAddressPopup_UpLink", "TripAccommodationAddressPopup_UpLink", null, pcftest.TripAccommodationAddressPopup.TripAccommodationAddressPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TripAccommodationAddressPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TripAccommodationAddressPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TripAccommodationAddressPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripAccommodationLV_tb extends PCFElement {
    public AdditionalTripAccommodationLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.Add.class);
    }
    
    public AddnlAccommodationClearButton getAddnlAccommodationClearButton() {
      return getOrCreateProperty("AddnlAccommodationClearButton", "AddnlAccommodationClearButton", null, pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.AddnlAccommodationClearButton.class);
    }
    
    public AddnlAccommodationDenyButton getAddnlAccommodationDenyButton() {
      return getOrCreateProperty("AddnlAccommodationDenyButton", "AddnlAccommodationDenyButton", null, pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.AddnlAccommodationDenyButton.class);
    }
    
    public AddnlAccommodationReviewButton getAddnlAccommodationReviewButton() {
      return getOrCreateProperty("AddnlAccommodationReviewButton", "AddnlAccommodationReviewButton", null, pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.AddnlAccommodationReviewButton.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.Remove.class);
    }
    
    public SegmentApprovalButton getSegmentApprovalButton() {
      return getOrCreateProperty("SegmentApprovalButton", "SegmentApprovalButton", null, pcftest.TripAccommodationAddressPopup.AdditionalTripAccommodationLV_tb.SegmentApprovalButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddnlAccommodationClearButton extends ClickableActionElement {
      public AddnlAccommodationClearButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddnlAccommodationDenyButton extends ClickableActionElement {
      public AddnlAccommodationDenyButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddnlAccommodationReviewButton extends ClickableActionElement {
      public AddnlAccommodationReviewButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentApprovalButton extends ClickableActionElement {
      public SegmentApprovalButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AffectedTripAccommodationCardTab extends ClickableActionElement {
    public AffectedTripAccommodationCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyTripAccommodationDetailDV extends PCFElement {
    public ClaimPolicyTripAccommodationDetailDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimTripAccommodationDetailDV getClaimTripAccommodationDetailDV() {
      return getOrCreateProperty("ClaimTripAccommodationDetailDV", "ClaimTripAccommodationDetailDV", null, pcftest.ClaimTripAccommodationDetailDV.class);
    }
    
    public ClaimTripAccommodationDetailDV_tb getClaimTripAccommodationDetailDV_tb() {
      return getOrCreateProperty("ClaimTripAccommodationDetailDV_tb", "ClaimTripAccommodationDetailDV_tb", null, pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimTripAccommodationDetailDV_tb extends PCFElement {
      public ClaimTripAccommodationDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.TripAccommodationAddressPopup.ClaimPolicyTripAccommodationDetailDV.ClaimTripAccommodationDetailDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripAccommodationAddressPopup_UpLink extends ClickableActionElement {
    public TripAccommodationAddressPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}