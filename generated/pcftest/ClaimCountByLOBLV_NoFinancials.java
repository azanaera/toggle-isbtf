package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimCountByLOBLV_NoFinancials.ByLineOfBusinessHeader;
import pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_FlaggedHeader;
import pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_LitigatedHeader;
import pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_NoticeOnlyHeader;
import pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_OpenClaimsHeader;
import pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_OpenExposuresHeader;
import pcftest.ClaimCountByLOBLV_NoFinancials._ListPaging;
import pcftest.ClaimCountByLOBLV_NoFinancials.entry;
import pcftest.ClaimCountByLOBLV_NoFinancials.entry.ByLineOfBusiness;
import pcftest.ClaimCountByLOBLV_NoFinancials.entry._Select;
import pcftest.ClaimCountByLOBLV_NoFinancials.entry._ViewDetail;
import typekey.LOBCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCountByLOBLV_NoFinancials extends ClaimCountByLOBLV {
  public final static String CHECKSUM = "de82d99712770419672e71e2d69942f3";
  
  public ClaimCountByLOBLV_NoFinancials(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ByLineOfBusinessHeader getByLineOfBusinessHeader() {
    return getOrCreateProperty("ByLineOfBusinessHeader", "ByLineOfBusinessHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLOBLV_NoFinancials.ByLineOfBusinessHeader.class);
  }
  
  public ValueElement getClaimCount_FlaggedFooter() {
    return getOrCreateProperty("ClaimCount_FlaggedFooter", "ClaimCount_FlaggedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_FlaggedHeader getClaimCount_FlaggedHeader() {
    return getOrCreateProperty("ClaimCount_FlaggedHeader", "ClaimCount_FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_FlaggedHeader.class);
  }
  
  public ValueElement getClaimCount_LitigatedFooter() {
    return getOrCreateProperty("ClaimCount_LitigatedFooter", "ClaimCount_LitigatedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_LitigatedHeader getClaimCount_LitigatedHeader() {
    return getOrCreateProperty("ClaimCount_LitigatedHeader", "ClaimCount_LitigatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_LitigatedHeader.class);
  }
  
  public ValueElement getClaimCount_NoticeOnlyFooter() {
    return getOrCreateProperty("ClaimCount_NoticeOnlyFooter", "ClaimCount_NoticeOnlyFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_NoticeOnlyHeader getClaimCount_NoticeOnlyHeader() {
    return getOrCreateProperty("ClaimCount_NoticeOnlyHeader", "ClaimCount_NoticeOnlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_NoticeOnlyHeader.class);
  }
  
  public ValueElement getClaimCount_OpenClaimsFooter() {
    return getOrCreateProperty("ClaimCount_OpenClaimsFooter", "ClaimCount_OpenClaimsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_OpenClaimsHeader getClaimCount_OpenClaimsHeader() {
    return getOrCreateProperty("ClaimCount_OpenClaimsHeader", "ClaimCount_OpenClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_OpenClaimsHeader.class);
  }
  
  public ValueElement getClaimCount_OpenExposuresFooter() {
    return getOrCreateProperty("ClaimCount_OpenExposuresFooter", "ClaimCount_OpenExposuresFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_OpenExposuresHeader getClaimCount_OpenExposuresHeader() {
    return getOrCreateProperty("ClaimCount_OpenExposuresHeader", "ClaimCount_OpenExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLOBLV_NoFinancials.ClaimCount_OpenExposuresHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimCountByLOBLV_NoFinancials.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimCountByLOBLV_NoFinancials._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByLineOfBusinessHeader extends ValueElement {
    public ByLineOfBusinessHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_FlaggedHeader extends ValueElement {
    public ClaimCount_FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_LitigatedHeader extends ValueElement {
    public ClaimCount_LitigatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_NoticeOnlyHeader extends ValueElement {
    public ClaimCount_NoticeOnlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OpenClaimsHeader extends ValueElement {
    public ClaimCount_OpenClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OpenExposuresHeader extends ValueElement {
    public ClaimCount_OpenExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ByLineOfBusiness getByLineOfBusiness() {
      return getOrCreateProperty("ByLineOfBusiness", "ByLineOfBusiness", null, pcftest.ClaimCountByLOBLV_NoFinancials.entry.ByLineOfBusiness.class);
    }
    
    public ValueElement getClaimCount_Flagged() {
      return getOrCreateProperty("ClaimCount_Flagged", "ClaimCount_Flagged", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount_Litigated() {
      return getOrCreateProperty("ClaimCount_Litigated", "ClaimCount_Litigated", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount_NoticeOnly() {
      return getOrCreateProperty("ClaimCount_NoticeOnly", "ClaimCount_NoticeOnly", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount_OpenClaims() {
      return getOrCreateProperty("ClaimCount_OpenClaims", "ClaimCount_OpenClaims", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount_OpenExposures() {
      return getOrCreateProperty("ClaimCount_OpenExposures", "ClaimCount_OpenExposures", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimCountByLOBLV_NoFinancials.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimCountByLOBLV_NoFinancials.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ByLineOfBusiness extends SelectElement {
      public ByLineOfBusiness(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LOBCode arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LOBCode getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LOBCode arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLOBLV.NoFinancials.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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