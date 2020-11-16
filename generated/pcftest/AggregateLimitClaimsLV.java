package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.AggregateLimitClaimsLV.CClaimNumberHeader;
import pcftest.AggregateLimitClaimsLV.CLimitUsedHeader;
import pcftest.AggregateLimitClaimsLV.CNetIncurredContributionHeader;
import pcftest.AggregateLimitClaimsLV.CNetPaidContributionHeader;
import pcftest.AggregateLimitClaimsLV._ListPaging;
import pcftest.AggregateLimitClaimsLV.entry;
import pcftest.AggregateLimitClaimsLV.entry.CClaimNumber;
import pcftest.AggregateLimitClaimsLV.entry._Select;
import pcftest.AggregateLimitClaimsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitClaimsLV extends PCFElement {
  public final static String CHECKSUM = "dd372dc147880ae37607893be3740358";
  
  public AggregateLimitClaimsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCClaimNumberFooter() {
    return getOrCreateProperty("CClaimNumberFooter", "CClaimNumberFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CClaimNumberHeader getCClaimNumberHeader() {
    return getOrCreateProperty("CClaimNumberHeader", "CClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitClaimsLV.CClaimNumberHeader.class);
  }
  
  public ValueElement getCLimitUsedFooter() {
    return getOrCreateProperty("CLimitUsedFooter", "CLimitUsedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CLimitUsedHeader getCLimitUsedHeader() {
    return getOrCreateProperty("CLimitUsedHeader", "CLimitUsedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitClaimsLV.CLimitUsedHeader.class);
  }
  
  public ValueElement getCNetIncurredContributionFooter() {
    return getOrCreateProperty("CNetIncurredContributionFooter", "CNetIncurredContributionFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CNetIncurredContributionHeader getCNetIncurredContributionHeader() {
    return getOrCreateProperty("CNetIncurredContributionHeader", "CNetIncurredContributionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitClaimsLV.CNetIncurredContributionHeader.class);
  }
  
  public ValueElement getCNetPaidContributionFooter() {
    return getOrCreateProperty("CNetPaidContributionFooter", "CNetPaidContributionFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CNetPaidContributionHeader getCNetPaidContributionHeader() {
    return getOrCreateProperty("CNetPaidContributionHeader", "CNetPaidContributionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitClaimsLV.CNetPaidContributionHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AggregateLimitClaimsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AggregateLimitClaimsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CClaimNumberHeader extends ValueElement {
    public CClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CLimitUsedHeader extends ValueElement {
    public CLimitUsedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CNetIncurredContributionHeader extends ValueElement {
    public CNetIncurredContributionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CNetPaidContributionHeader extends ValueElement {
    public CNetPaidContributionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CClaimNumber getCClaimNumber() {
      return getOrCreateProperty("CClaimNumber", "CClaimNumber", null, pcftest.AggregateLimitClaimsLV.entry.CClaimNumber.class);
    }
    
    public ValueElement getCLimitUsed() {
      return getOrCreateProperty("CLimitUsed", "CLimitUsed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCNetIncurredContribution() {
      return getOrCreateProperty("CNetIncurredContribution", "CNetIncurredContribution", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCNetPaidContribution() {
      return getOrCreateProperty("CNetPaidContribution", "CNetPaidContribution", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AggregateLimitClaimsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AggregateLimitClaimsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CClaimNumber extends ValueElement {
      public CClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsSummary click() {
        return clickThis(pcftest.ClaimFinancialsSummary.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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