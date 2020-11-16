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
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.ClaimSnapshotInjuredInjuryIncidentPopup_UpLink;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.Injury;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.CompensabilityCommentsHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.CompensabilityDecisionDateHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.CompensabilityDecisionHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.DetailedBodyPartHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.OrderingHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.PrimaryBodyPartHeader;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.entry;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.entry._Select;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.entry._ViewDetail;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup._Paging;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.__crumb__;
import pcftest.ClaimSnapshotInjuredInjuryIncidentPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuredInjuryIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "65c704c26e047439f5259a765acee960";
  
  public ClaimSnapshotInjuredInjuryIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotInjuredInjuryIncidentPopup"));
  }
  
  public ClaimSnapshotInjuredInjuryIncidentPopup_UpLink getClaimSnapshotInjuredInjuryIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotInjuredInjuryIncidentPopup_UpLink", "ClaimSnapshotInjuredInjuryIncidentPopup_UpLink", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.ClaimSnapshotInjuredInjuryIncidentPopup_UpLink.class);
  }
  
  public ValueElement getContact() {
    return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmail2() {
    return getOrCreateProperty("Email2", "Email2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Injury getInjury() {
    return getOrCreateProperty("Injury", "Injury", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.Injury.class);
  }
  
  public InjuryIncidentInputSet getInjuryIncidentInputSet() {
    return getOrCreateProperty("InjuryIncidentInputSet", "InjuryIncidentInputSet", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup._msgs.class);
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuredInjuryIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotInjuredInjuryIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Injury extends ValueElement {
    public Injury(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentInputSet extends PCFElement {
    public InjuryIncidentInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CompensabilityCommentsHeader getCompensabilityCommentsHeader() {
      return getOrCreateProperty("CompensabilityCommentsHeader", "CompensabilityCommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.CompensabilityCommentsHeader.class);
    }
    
    public CompensabilityDecisionDateHeader getCompensabilityDecisionDateHeader() {
      return getOrCreateProperty("CompensabilityDecisionDateHeader", "CompensabilityDecisionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.CompensabilityDecisionDateHeader.class);
    }
    
    public CompensabilityDecisionHeader getCompensabilityDecisionHeader() {
      return getOrCreateProperty("CompensabilityDecisionHeader", "CompensabilityDecisionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.CompensabilityDecisionHeader.class);
    }
    
    public DetailedBodyPartHeader getDetailedBodyPartHeader() {
      return getOrCreateProperty("DetailedBodyPartHeader", "DetailedBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.DetailedBodyPartHeader.class);
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
      return getOrCreateProperty("OrderingHeader", "OrderingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.OrderingHeader.class);
    }
    
    public PrimaryBodyPartHeader getPrimaryBodyPartHeader() {
      return getOrCreateProperty("PrimaryBodyPartHeader", "PrimaryBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.PrimaryBodyPartHeader.class);
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
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityCommentsHeader extends ValueElement {
      public CompensabilityCommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityDecisionDateHeader extends ValueElement {
      public CompensabilityDecisionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityDecisionHeader extends ValueElement {
      public CompensabilityDecisionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedBodyPartHeader extends ValueElement {
      public DetailedBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrderingHeader extends ValueElement {
      public OrderingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryBodyPartHeader extends ValueElement {
      public PrimaryBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotInjuredInjuryIncidentPopup.InjuryIncidentInputSet.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}