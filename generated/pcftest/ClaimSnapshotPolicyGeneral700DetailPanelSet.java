package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV_tb;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV_tb;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyGeneral700DetailPanelSet extends PCFElement {
  public final static String CHECKSUM = "d053abd999507b4de44a9a0b8f7716bd";
  
  public ClaimSnapshotPolicyGeneral700DetailPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyGeneral700DV getClaimSnapshotPolicyGeneral700DV() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral700DV", "ClaimSnapshotPolicyGeneral700DV", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.class);
  }
  
  public ClaimSnapshotPolicyGeneral700LDP getClaimSnapshotPolicyGeneral700LDP() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral700LDP", "ClaimSnapshotPolicyGeneral700LDP", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral700DV extends DetailViewElement {
    public ClaimSnapshotPolicyGeneral700DV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAccount() {
      return getOrCreateProperty("Account", "Account", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public AdditionalInsuredLV getAdditionalInsuredLV() {
      return getOrCreateProperty("AdditionalInsuredLV", "AdditionalInsuredLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.class);
    }
    
    public AdditionalInsuredLV_tb getAdditionalInsuredLV_tb() {
      return getOrCreateProperty("AdditionalInsuredLV_tb", "AdditionalInsuredLV_tb", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV_tb.class);
    }
    
    public ValueElement getAddress() {
      return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getAgent() {
      return getOrCreateProperty("Agent", "Agent", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCancellationDate() {
      return getOrCreateProperty("CancellationDate", "CancellationDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurrency() {
      return getOrCreateProperty("Currency", "Currency", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEffectiveDate() {
      return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ExcludedPartiesLV getExcludedPartiesLV() {
      return getOrCreateProperty("ExcludedPartiesLV", "ExcludedPartiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.class);
    }
    
    public ExcludedPartiesLV_tb getExcludedPartiesLV_tb() {
      return getOrCreateProperty("ExcludedPartiesLV_tb", "ExcludedPartiesLV_tb", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV_tb.class);
    }
    
    public ValueElement getExpirationDate() {
      return getOrCreateProperty("ExpirationDate", "ExpirationDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getFinancialInterests() {
      return getOrCreateProperty("FinancialInterests", "FinancialInterests", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getForeignCoverage() {
      return getOrCreateProperty("ForeignCoverage", "ForeignCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInsuredSICCode() {
      return getOrCreateProperty("InsuredSICCode", "InsuredSICCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOrigEffectiveDate() {
      return getOrCreateProperty("OrigEffectiveDate", "OrigEffectiveDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPolicyRatingPlan() {
      return getOrCreateProperty("PolicyRatingPlan", "PolicyRatingPlan", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPolicyType() {
      return getOrCreateProperty("PolicyType", "PolicyType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getProducerCode() {
      return getOrCreateProperty("ProducerCode", "ProducerCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getStatus() {
      return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUnderwriter() {
      return getOrCreateProperty("Underwriter", "Underwriter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUnderwritingCo() {
      return getOrCreateProperty("UnderwritingCo", "UnderwritingCo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUnderwritingGroup() {
      return getOrCreateProperty("UnderwritingGroup", "UnderwritingGroup", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getVerified() {
      return getOrCreateProperty("Verified", "Verified", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getWCOtherStates() {
      return getOrCreateProperty("WCOtherStates", "WCOtherStates", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getWCStates() {
      return getOrCreateProperty("WCStates", "WCStates", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdditionalInsuredLV extends PCFElement {
      public AdditionalInsuredLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.NameHeader.class);
      }
      
      public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.TypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getType() {
          return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.AdditionalInsuredLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdditionalInsuredLV_tb extends PCFElement {
      public AdditionalInsuredLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExcludedPartiesLV extends PCFElement {
      public ExcludedPartiesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.NameHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700DV.ExcludedPartiesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExcludedPartiesLV_tb extends PCFElement {
      public ExcludedPartiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral700LDP extends PCFElement {
    public ClaimSnapshotPolicyGeneral700LDP(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSnapshotPolicyCovTermsCV_700 getClaimSnapshotPolicyCovTermsCV_700() {
      return getOrCreateProperty("ClaimSnapshotPolicyCovTermsCV_700", "ClaimSnapshotPolicyCovTermsCV", null, pcftest.ClaimSnapshotPolicyCovTermsCV_700.class);
    }
    
    public ClaimSnapshotPolicyCovTermsCV_800 getClaimSnapshotPolicyCovTermsCV_800() {
      return getOrCreateProperty("ClaimSnapshotPolicyCovTermsCV_800", "ClaimSnapshotPolicyCovTermsCV", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.class);
    }
    
    public ClaimSnapshotPolicyCovTermsCV_default getClaimSnapshotPolicyCovTermsCV_default() {
      return getOrCreateProperty("ClaimSnapshotPolicyCovTermsCV_default", "ClaimSnapshotPolicyCovTermsCV", null, pcftest.ClaimSnapshotPolicyCovTermsCV_default.class);
    }
    
    public PolicyCoveragesLV getPolicyCoveragesLV() {
      return getOrCreateProperty("PolicyCoveragesLV", "PolicyCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.class);
    }
    
    public PolicyCoveragesLV_tb getPolicyCoveragesLV_tb() {
      return getOrCreateProperty("PolicyCoveragesLV_tb", "PolicyCoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyCoveragesLV extends PCFElement {
      public PolicyCoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.IncidentLimitHeader.class);
      }
      
      public NotesHeader getNotesHeader() {
        return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.NotesHeader.class);
      }
      
      public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.TypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotesHeader extends ValueElement {
        public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDeductible() {
          return getOrCreateProperty("Deductible", "Deductible", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getExposureLimit() {
          return getOrCreateProperty("ExposureLimit", "ExposureLimit", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIncidentLimit() {
          return getOrCreateProperty("IncidentLimit", "IncidentLimit", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getNotes() {
          return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getType() {
          return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.ClaimSnapshotPolicyGeneral700LDP.PolicyCoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyCoveragesLV_tb extends PCFElement {
      public PolicyCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}