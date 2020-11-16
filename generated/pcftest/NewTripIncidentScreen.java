package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel;
import pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb;
import pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationApprovalButton;
import pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationClearButton;
import pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationDenyButton;
import pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationReviewButton;
import pcftest.NewTripIncidentScreen.AdditionalTripSegmentCardTab;
import pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel;
import pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb;
import pcftest.NewTripIncidentScreen.AffectedTripAccommodationCardTab;
import pcftest.NewTripIncidentScreen.Cancel;
import pcftest.NewTripIncidentScreen.Edit;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationApprovalButton;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationClearButton;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationDenyButton;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationReviewButton;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV;
import pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb;
import pcftest.NewTripIncidentScreen.TripIncidentDV;
import pcftest.NewTripIncidentScreen.TripIncident_AccommodationCardTab;
import pcftest.NewTripIncidentScreen.TripIncident_TripCardTab;
import pcftest.NewTripIncidentScreen.Update;
import pcftest.NewTripIncidentScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewTripIncidentScreen extends PCFElement {
  public final static String CHECKSUM = "57b29f17d4283edcb7b7c300d20f9137";
  
  public NewTripIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAccommodationTotalIncurred() {
    return getOrCreateProperty("AccommodationTotalIncurred", "AccommodationTotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AdditionalTripAccommodationInputSet getAdditionalTripAccommodationInputSet() {
    return getOrCreateProperty("AdditionalTripAccommodationInputSet", "AdditionalTripAccommodationInputSet", null, pcftest.AdditionalTripAccommodationInputSet.class);
  }
  
  public AdditionalTripAccommodationLV_Panel getAdditionalTripAccommodationLV_Panel() {
    return getOrCreateProperty("AdditionalTripAccommodationLV_Panel", "AdditionalTripAccommodationLV_Panel", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.class);
  }
  
  public AdditionalTripSegmentCardTab getAdditionalTripSegmentCardTab() {
    return getOrCreateProperty("AdditionalTripSegmentCardTab", "AdditionalTripSegmentCardTab", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentCardTab.class);
  }
  
  public AdditionalTripSegmentInputSet getAdditionalTripSegmentInputSet() {
    return getOrCreateProperty("AdditionalTripSegmentInputSet", "AdditionalTripSegmentInputSet", null, pcftest.AdditionalTripSegmentInputSet.class);
  }
  
  public AdditionalTripSegmentLV_Panel getAdditionalTripSegmentLV_Panel() {
    return getOrCreateProperty("AdditionalTripSegmentLV_Panel", "AdditionalTripSegmentLV_Panel", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.class);
  }
  
  public AffectedTripAccommodationCardTab getAffectedTripAccommodationCardTab() {
    return getOrCreateProperty("AffectedTripAccommodationCardTab", "AffectedTripAccommodationCardTab", null, pcftest.NewTripIncidentScreen.AffectedTripAccommodationCardTab.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewTripIncidentScreen.Cancel.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.NewTripIncidentScreen.Edit.class);
  }
  
  public OtherServicesLVInputSet getOtherServicesLVInputSet() {
    return getOrCreateProperty("OtherServicesLVInputSet", "OtherServicesLVInputSet", null, pcftest.OtherServicesLVInputSet.class);
  }
  
  public ValueElement getSegmentTotalIncurred() {
    return getOrCreateProperty("SegmentTotalIncurred", "SegmentTotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TripIncidentAffectedAccommodationLV getTripIncidentAffectedAccommodationLV() {
    return getOrCreateProperty("TripIncidentAffectedAccommodationLV", "TripIncidentAffectedAccommodationLV", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.class);
  }
  
  public TripIncidentAffectedSegmentLV getTripIncidentAffectedSegmentLV() {
    return getOrCreateProperty("TripIncidentAffectedSegmentLV", "TripIncidentAffectedSegmentLV", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.class);
  }
  
  public TripIncidentDV getTripIncidentDV() {
    return getOrCreateProperty("TripIncidentDV", "TripIncidentDV", null, pcftest.NewTripIncidentScreen.TripIncidentDV.class);
  }
  
  public TripIncident_AccommodationCardTab getTripIncident_AccommodationCardTab() {
    return getOrCreateProperty("TripIncident_AccommodationCardTab", "TripIncident_AccommodationCardTab", null, pcftest.NewTripIncidentScreen.TripIncident_AccommodationCardTab.class);
  }
  
  public TripIncident_TripCardTab getTripIncident_TripCardTab() {
    return getOrCreateProperty("TripIncident_TripCardTab", "TripIncident_TripCardTab", null, pcftest.NewTripIncidentScreen.TripIncident_TripCardTab.class);
  }
  
  public ValueElement getTripTotalIncurred() {
    return getOrCreateProperty("TripTotalIncurred", "TripTotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.NewTripIncidentScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewTripIncidentScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripAccommodationLV_Panel extends PCFElement {
    public AdditionalTripAccommodationLV_Panel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AdditionalTripAccommodationLV getAdditionalTripAccommodationLV() {
      return getOrCreateProperty("AdditionalTripAccommodationLV", "AdditionalTripAccommodationLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AdditionalTripAccommodationLV.class);
    }
    
    public AdditionalTripAccommodationLV_tb getAdditionalTripAccommodationLV_tb() {
      return getOrCreateProperty("AdditionalTripAccommodationLV_tb", "AdditionalTripAccommodationLV_tb", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdditionalTripAccommodationLV_tb extends PCFElement {
      public AdditionalTripAccommodationLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.Add.class);
      }
      
      public AddnlAccommodationApprovalButton getAddnlAccommodationApprovalButton() {
        return getOrCreateProperty("AddnlAccommodationApprovalButton", "AddnlAccommodationApprovalButton", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationApprovalButton.class);
      }
      
      public AddnlAccommodationClearButton getAddnlAccommodationClearButton() {
        return getOrCreateProperty("AddnlAccommodationClearButton", "AddnlAccommodationClearButton", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationClearButton.class);
      }
      
      public AddnlAccommodationDenyButton getAddnlAccommodationDenyButton() {
        return getOrCreateProperty("AddnlAccommodationDenyButton", "AddnlAccommodationDenyButton", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationDenyButton.class);
      }
      
      public AddnlAccommodationReviewButton getAddnlAccommodationReviewButton() {
        return getOrCreateProperty("AddnlAccommodationReviewButton", "AddnlAccommodationReviewButton", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.AddnlAccommodationReviewButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewTripIncidentScreen.AdditionalTripAccommodationLV_Panel.AdditionalTripAccommodationLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddnlAccommodationApprovalButton extends ClickableActionElement {
        public AddnlAccommodationApprovalButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddnlAccommodationClearButton extends ClickableActionElement {
        public AddnlAccommodationClearButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddnlAccommodationDenyButton extends ClickableActionElement {
        public AddnlAccommodationDenyButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddnlAccommodationReviewButton extends ClickableActionElement {
        public AddnlAccommodationReviewButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripSegmentCardTab extends ClickableActionElement {
    public AdditionalTripSegmentCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripSegmentLV_Panel extends PCFElement {
    public AdditionalTripSegmentLV_Panel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AdditionalTripSegmentLV getAdditionalTripSegmentLV() {
      return getOrCreateProperty("AdditionalTripSegmentLV", "AdditionalTripSegmentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AdditionalTripSegmentLV.class);
    }
    
    public AdditionalTripSegmentLV_tb getAdditionalTripSegmentLV_tb() {
      return getOrCreateProperty("AdditionalTripSegmentLV_tb", "AdditionalTripSegmentLV_tb", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdditionalTripSegmentLV_tb extends PCFElement {
      public AdditionalTripSegmentLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.Add.class);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.Remove.class);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentApprovalButton getSegmentApprovalButton() {
        return getOrCreateProperty("SegmentApprovalButton", "SegmentApprovalButton", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentApprovalButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentClearButton getSegmentClearButton() {
        return getOrCreateProperty("SegmentClearButton", "SegmentClearButton", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentClearButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentDenyButton getSegmentDenyButton() {
        return getOrCreateProperty("SegmentDenyButton", "SegmentDenyButton", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentDenyButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentReviewButton getSegmentReviewButton() {
        return getOrCreateProperty("SegmentReviewButton", "SegmentReviewButton", null, pcftest.NewTripIncidentScreen.AdditionalTripSegmentLV_Panel.AdditionalTripSegmentLV_tb.SegmentReviewButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentApprovalButton extends ClickableActionElement {
        public SegmentApprovalButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentClearButton extends ClickableActionElement {
        public SegmentClearButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentDenyButton extends ClickableActionElement {
        public SegmentDenyButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentReviewButton extends ClickableActionElement {
        public SegmentReviewButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AffectedTripAccommodationCardTab extends ClickableActionElement {
    public AffectedTripAccommodationCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentAffectedAccommodationLV extends PCFElement {
    public TripIncidentAffectedAccommodationLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TripIncidentAccommodationsLV getTripIncidentAccommodationsLV() {
      return getOrCreateProperty("TripIncidentAccommodationsLV", "TripIncidentAccommodationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TripIncidentAccommodationsLV.class);
    }
    
    public TripIncidentAccommodationsLV_tb getTripIncidentAccommodationsLV_tb() {
      return getOrCreateProperty("TripIncidentAccommodationsLV_tb", "TripIncidentAccommodationsLV_tb", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TripIncidentAccommodationsLV_tb extends PCFElement {
      public TripIncidentAccommodationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AccommodationApprovalButton getAccommodationApprovalButton() {
        return getOrCreateProperty("AccommodationApprovalButton", "AccommodationApprovalButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationApprovalButton.class);
      }
      
      public AccommodationClearButton getAccommodationClearButton() {
        return getOrCreateProperty("AccommodationClearButton", "AccommodationClearButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationClearButton.class);
      }
      
      public AccommodationDenyButton getAccommodationDenyButton() {
        return getOrCreateProperty("AccommodationDenyButton", "AccommodationDenyButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationDenyButton.class);
      }
      
      public AccommodationReviewButton getAccommodationReviewButton() {
        return getOrCreateProperty("AccommodationReviewButton", "AccommodationReviewButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.AccommodationReviewButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.Add.class);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedAccommodationLV.TripIncidentAccommodationsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AccommodationApprovalButton extends ClickableActionElement {
        public AccommodationApprovalButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AccommodationClearButton extends ClickableActionElement {
        public AccommodationClearButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AccommodationDenyButton extends ClickableActionElement {
        public AccommodationDenyButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AccommodationReviewButton extends ClickableActionElement {
        public AccommodationReviewButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentAffectedSegmentLV extends PCFElement {
    public TripIncidentAffectedSegmentLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TripIncidentSegmentsLV getTripIncidentSegmentsLV() {
      return getOrCreateProperty("TripIncidentSegmentsLV", "TripIncidentSegmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TripIncidentSegmentsLV.class);
    }
    
    public TripIncidentSegmentsLV_tb getTripIncidentSegmentsLV_tb() {
      return getOrCreateProperty("TripIncidentSegmentsLV_tb", "TripIncidentSegmentsLV_tb", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TripIncidentSegmentsLV_tb extends PCFElement {
      public TripIncidentSegmentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.Add.class);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.Remove.class);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentApprovalButton getSegmentApprovalButton() {
        return getOrCreateProperty("SegmentApprovalButton", "SegmentApprovalButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentApprovalButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentClearButton getSegmentClearButton() {
        return getOrCreateProperty("SegmentClearButton", "SegmentClearButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentClearButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentDenyButton getSegmentDenyButton() {
        return getOrCreateProperty("SegmentDenyButton", "SegmentDenyButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentDenyButton.class);
      }
      
      public pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentReviewButton getSegmentReviewButton() {
        return getOrCreateProperty("SegmentReviewButton", "SegmentReviewButton", null, pcftest.NewTripIncidentScreen.TripIncidentAffectedSegmentLV.TripIncidentSegmentsLV_tb.SegmentReviewButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentApprovalButton extends ClickableActionElement {
        public SegmentApprovalButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentClearButton extends ClickableActionElement {
        public SegmentClearButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentDenyButton extends ClickableActionElement {
        public SegmentDenyButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SegmentReviewButton extends ClickableActionElement {
        public SegmentReviewButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentDV extends DetailViewElement {
    public TripIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getEndDate() {
      return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.NewTripIncidentScreen.TripIncidentDV.GeographicalRegion getGeographicalRegion() {
      return getOrCreateProperty("GeographicalRegion", "GeographicalRegion", null, pcftest.NewTripIncidentScreen.TripIncidentDV.GeographicalRegion.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public SelectElement getTripRU() {
      return getOrCreateProperty("TripRU", "TripRU", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GeographicalRegion extends SelectElement {
      public GeographicalRegion(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.GeographicalRegion arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.GeographicalRegion getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GeographicalRegion.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.GeographicalRegion arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncident_AccommodationCardTab extends ClickableActionElement {
    public TripIncident_AccommodationCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncident_TripCardTab extends ClickableActionElement {
    public TripIncident_TripCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/trip/NewTripIncidentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}