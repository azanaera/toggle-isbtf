package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.ClaimSnapshotInjuredInjuryIncident700Popup_UpLink;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.Injury;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.CompensabilityCommentsHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.CompensabilityDecisionDateHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.CompensabilityDecisionHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.DetailedBodyPartHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.OrderingHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.PrimaryBodyPartHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.entry;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.entry._Select;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.entry._ViewDetail;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup._Paging;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.__crumb__;
import pcftest.ClaimSnapshotInjuredInjuryIncident700Popup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuredInjuryIncident700Popup extends PCFLocation {
  public final static String CHECKSUM = "65c9ed53048486cf5f8945e796166842";
  
  public ClaimSnapshotInjuredInjuryIncident700Popup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotInjuredInjuryIncident700Popup"));
  }
  
  public ClaimSnapshotInjuredInjuryIncident700Popup_UpLink getClaimSnapshotInjuredInjuryIncident700Popup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotInjuredInjuryIncident700Popup_UpLink", "ClaimSnapshotInjuredInjuryIncident700Popup_UpLink", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.ClaimSnapshotInjuredInjuryIncident700Popup_UpLink.class);
  }
  
  public ValueElement getEmail2() {
    return getOrCreateProperty("Email2", "Email2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFirstName() {
    return getOrCreateProperty("FirstName", "FirstName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Injury getInjury() {
    return getOrCreateProperty("Injury", "Injury", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.Injury.class);
  }
  
  public InjuryIncidentInputSet getInjuryIncidentInputSet() {
    return getOrCreateProperty("InjuryIncidentInputSet", "InjuryIncidentInputSet", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.class);
  }
  
  public ValueElement getLastName() {
    return getOrCreateProperty("LastName", "LastName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup._msgs.class);
  }
  
  public ValueElement getreporter_Address() {
    return getOrCreateProperty("reporter_Address", "reporter_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getreporter_businessphone() {
    return getOrCreateProperty("reporter_businessphone", "reporter_businessphone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getreporter_email() {
    return getOrCreateProperty("reporter_email", "reporter_email", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getreporter_homephone() {
    return getOrCreateProperty("reporter_homephone", "reporter_homephone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getreporter_mobile() {
    return getOrCreateProperty("reporter_mobile", "reporter_mobile", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getreporter_primarytype() {
    return getOrCreateProperty("reporter_primarytype", "reporter_primarytype", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuredInjuryIncident700Popup_UpLink extends ClickableActionElement {
    public ClaimSnapshotInjuredInjuryIncident700Popup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Injury extends ValueElement {
    public Injury(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentInputSet extends PCFElement {
    public InjuryIncidentInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CompensabilityCommentsHeader getCompensabilityCommentsHeader() {
      return getOrCreateProperty("CompensabilityCommentsHeader", "CompensabilityCommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.CompensabilityCommentsHeader.class);
    }
    
    public CompensabilityDecisionDateHeader getCompensabilityDecisionDateHeader() {
      return getOrCreateProperty("CompensabilityDecisionDateHeader", "CompensabilityDecisionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.CompensabilityDecisionDateHeader.class);
    }
    
    public CompensabilityDecisionHeader getCompensabilityDecisionHeader() {
      return getOrCreateProperty("CompensabilityDecisionHeader", "CompensabilityDecisionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.CompensabilityDecisionHeader.class);
    }
    
    public DetailedBodyPartHeader getDetailedBodyPartHeader() {
      return getOrCreateProperty("DetailedBodyPartHeader", "DetailedBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.DetailedBodyPartHeader.class);
    }
    
    public ValueElement getDetailedInjuryType() {
      return getOrCreateProperty("DetailedInjuryType", "DetailedInjuryType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInjuryDescription() {
      return getOrCreateProperty("InjuryDescription", "InjuryDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLostWages() {
      return getOrCreateProperty("LostWages", "LostWages", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public OrderingHeader getOrderingHeader() {
      return getOrCreateProperty("OrderingHeader", "OrderingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.OrderingHeader.class);
    }
    
    public PrimaryBodyPartHeader getPrimaryBodyPartHeader() {
      return getOrCreateProperty("PrimaryBodyPartHeader", "PrimaryBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.PrimaryBodyPartHeader.class);
    }
    
    public ValueElement getPrimaryDoctor() {
      return getOrCreateProperty("PrimaryDoctor", "PrimaryDoctor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryInjuryType() {
      return getOrCreateProperty("PrimaryInjuryType", "PrimaryInjuryType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getReceivedTreatment() {
      return getOrCreateProperty("ReceivedTreatment", "ReceivedTreatment", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getSeverity() {
      return getOrCreateProperty("Severity", "Severity", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTreatmentType() {
      return getOrCreateProperty("TreatmentType", "TreatmentType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityCommentsHeader extends ValueElement {
      public CompensabilityCommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityDecisionDateHeader extends ValueElement {
      public CompensabilityDecisionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityDecisionHeader extends ValueElement {
      public CompensabilityDecisionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedBodyPartHeader extends ValueElement {
      public DetailedBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrderingHeader extends ValueElement {
      public OrderingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryBodyPartHeader extends ValueElement {
      public PrimaryBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCompensabilityComments() {
        return getOrCreateProperty("CompensabilityComments", "CompensabilityComments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCompensabilityDecision() {
        return getOrCreateProperty("CompensabilityDecision", "CompensabilityDecision", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCompensabilityDecisionDate() {
        return getOrCreateProperty("CompensabilityDecisionDate", "CompensabilityDecisionDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDetailedBodyPart() {
        return getOrCreateProperty("DetailedBodyPart", "DetailedBodyPart", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOrdering() {
        return getOrCreateProperty("Ordering", "Ordering", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPrimaryBodyPart() {
        return getOrCreateProperty("PrimaryBodyPart", "PrimaryBodyPart", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotInjuredInjuryIncident700Popup.InjuryIncidentInputSet.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}