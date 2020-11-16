package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.CompensabilityCommentsHeader;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.CompensabilityDecisionDateHeader;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.CompensabilityDecisionHeader;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.DetailedBodyPartHeader;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.OrderingHeader;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.PrimaryBodyPartHeader;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.entry;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.entry._Select;
import pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncident700DV extends DetailViewElement {
  public final static String CHECKSUM = "c3d835efa16b946c541965f6e7233019";
  
  public ClaimSnapshotInjuryIncident700DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public InjuryIncidentInputSet getInjuryIncidentInputSet() {
    return getOrCreateProperty("InjuryIncidentInputSet", "InjuryIncidentInputSet", null, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentInputSet extends PCFElement {
    public InjuryIncidentInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CompensabilityCommentsHeader getCompensabilityCommentsHeader() {
      return getOrCreateProperty("CompensabilityCommentsHeader", "CompensabilityCommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.CompensabilityCommentsHeader.class);
    }
    
    public CompensabilityDecisionDateHeader getCompensabilityDecisionDateHeader() {
      return getOrCreateProperty("CompensabilityDecisionDateHeader", "CompensabilityDecisionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.CompensabilityDecisionDateHeader.class);
    }
    
    public CompensabilityDecisionHeader getCompensabilityDecisionHeader() {
      return getOrCreateProperty("CompensabilityDecisionHeader", "CompensabilityDecisionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.CompensabilityDecisionHeader.class);
    }
    
    public DetailedBodyPartHeader getDetailedBodyPartHeader() {
      return getOrCreateProperty("DetailedBodyPartHeader", "DetailedBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.DetailedBodyPartHeader.class);
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
      return getOrCreateProperty("OrderingHeader", "OrderingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.OrderingHeader.class);
    }
    
    public PrimaryBodyPartHeader getPrimaryBodyPartHeader() {
      return getOrCreateProperty("PrimaryBodyPartHeader", "PrimaryBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.PrimaryBodyPartHeader.class);
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
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityCommentsHeader extends ValueElement {
      public CompensabilityCommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityDecisionDateHeader extends ValueElement {
      public CompensabilityDecisionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityDecisionHeader extends ValueElement {
      public CompensabilityDecisionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedBodyPartHeader extends ValueElement {
      public DetailedBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrderingHeader extends ValueElement {
      public OrderingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryBodyPartHeader extends ValueElement {
      public PrimaryBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotInjuryIncident700DV.InjuryIncidentInputSet.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}