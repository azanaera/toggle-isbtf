package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimActivityByLOBLV.ByLineOfBusinessHeader;
import pcftest.ClaimActivityByLOBLV.ClaimActivity_AvgCloseTimeHeader;
import pcftest.ClaimActivityByLOBLV.ClaimActivity_ClosedClaimsHeader;
import pcftest.ClaimActivityByLOBLV.ClaimActivity_NewClaimsHeader;
import pcftest.ClaimActivityByLOBLV.ClaimActivity_NewExposuresHeader;
import pcftest.ClaimActivityByLOBLV.ClaimActivity_NewLitigationHeader;
import pcftest.ClaimActivityByLOBLV.ClaimActivity_NewNoticeOnlyHeader;
import pcftest.ClaimActivityByLOBLV.ClaimActivity_ReopenedClaimsHeader;
import pcftest.ClaimActivityByLOBLV._ListPaging;
import pcftest.ClaimActivityByLOBLV.entry;
import pcftest.ClaimActivityByLOBLV.entry.ByLineOfBusiness;
import pcftest.ClaimActivityByLOBLV.entry._Select;
import pcftest.ClaimActivityByLOBLV.entry._ViewDetail;
import typekey.LOBCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimActivityByLOBLV extends PCFElement {
  public final static String CHECKSUM = "80b6cb3e49b4c1c664921ce28dc72f02";
  
  public ClaimActivityByLOBLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getByLineOfBusinessFooter() {
    return getOrCreateProperty("ByLineOfBusinessFooter", "ByLineOfBusinessFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ByLineOfBusinessHeader getByLineOfBusinessHeader() {
    return getOrCreateProperty("ByLineOfBusinessHeader", "ByLineOfBusinessHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ByLineOfBusinessHeader.class);
  }
  
  public ClaimActivity_AvgCloseTimeHeader getClaimActivity_AvgCloseTimeHeader() {
    return getOrCreateProperty("ClaimActivity_AvgCloseTimeHeader", "ClaimActivity_AvgCloseTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ClaimActivity_AvgCloseTimeHeader.class);
  }
  
  public ValueElement getClaimActivity_ClosedClaimsFooter() {
    return getOrCreateProperty("ClaimActivity_ClosedClaimsFooter", "ClaimActivity_ClosedClaimsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_ClosedClaimsHeader getClaimActivity_ClosedClaimsHeader() {
    return getOrCreateProperty("ClaimActivity_ClosedClaimsHeader", "ClaimActivity_ClosedClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ClaimActivity_ClosedClaimsHeader.class);
  }
  
  public ValueElement getClaimActivity_NewClaimsFooter() {
    return getOrCreateProperty("ClaimActivity_NewClaimsFooter", "ClaimActivity_NewClaimsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_NewClaimsHeader getClaimActivity_NewClaimsHeader() {
    return getOrCreateProperty("ClaimActivity_NewClaimsHeader", "ClaimActivity_NewClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ClaimActivity_NewClaimsHeader.class);
  }
  
  public ValueElement getClaimActivity_NewExposuresFooter() {
    return getOrCreateProperty("ClaimActivity_NewExposuresFooter", "ClaimActivity_NewExposuresFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_NewExposuresHeader getClaimActivity_NewExposuresHeader() {
    return getOrCreateProperty("ClaimActivity_NewExposuresHeader", "ClaimActivity_NewExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ClaimActivity_NewExposuresHeader.class);
  }
  
  public ValueElement getClaimActivity_NewLitigationFooter() {
    return getOrCreateProperty("ClaimActivity_NewLitigationFooter", "ClaimActivity_NewLitigationFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_NewLitigationHeader getClaimActivity_NewLitigationHeader() {
    return getOrCreateProperty("ClaimActivity_NewLitigationHeader", "ClaimActivity_NewLitigationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ClaimActivity_NewLitigationHeader.class);
  }
  
  public ValueElement getClaimActivity_NewNoticeOnlyFooter() {
    return getOrCreateProperty("ClaimActivity_NewNoticeOnlyFooter", "ClaimActivity_NewNoticeOnlyFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_NewNoticeOnlyHeader getClaimActivity_NewNoticeOnlyHeader() {
    return getOrCreateProperty("ClaimActivity_NewNoticeOnlyHeader", "ClaimActivity_NewNoticeOnlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ClaimActivity_NewNoticeOnlyHeader.class);
  }
  
  public ValueElement getClaimActivity_ReopenedClaimsFooter() {
    return getOrCreateProperty("ClaimActivity_ReopenedClaimsFooter", "ClaimActivity_ReopenedClaimsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimActivity_ReopenedClaimsHeader getClaimActivity_ReopenedClaimsHeader() {
    return getOrCreateProperty("ClaimActivity_ReopenedClaimsHeader", "ClaimActivity_ReopenedClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByLOBLV.ClaimActivity_ReopenedClaimsHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimActivityByLOBLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimActivityByLOBLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByLineOfBusinessHeader extends ValueElement {
    public ByLineOfBusinessHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_AvgCloseTimeHeader extends ValueElement {
    public ClaimActivity_AvgCloseTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_ClosedClaimsHeader extends ValueElement {
    public ClaimActivity_ClosedClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewClaimsHeader extends ValueElement {
    public ClaimActivity_NewClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewExposuresHeader extends ValueElement {
    public ClaimActivity_NewExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewLitigationHeader extends ValueElement {
    public ClaimActivity_NewLitigationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewNoticeOnlyHeader extends ValueElement {
    public ClaimActivity_NewNoticeOnlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_ReopenedClaimsHeader extends ValueElement {
    public ClaimActivity_ReopenedClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ByLineOfBusiness getByLineOfBusiness() {
      return getOrCreateProperty("ByLineOfBusiness", "ByLineOfBusiness", null, pcftest.ClaimActivityByLOBLV.entry.ByLineOfBusiness.class);
    }
    
    public ValueElement getClaimActivity_AvgCloseTime() {
      return getOrCreateProperty("ClaimActivity_AvgCloseTime", "ClaimActivity_AvgCloseTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_ClosedClaims() {
      return getOrCreateProperty("ClaimActivity_ClosedClaims", "ClaimActivity_ClosedClaims", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_NewClaims() {
      return getOrCreateProperty("ClaimActivity_NewClaims", "ClaimActivity_NewClaims", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_NewExposures() {
      return getOrCreateProperty("ClaimActivity_NewExposures", "ClaimActivity_NewExposures", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_NewLitigation() {
      return getOrCreateProperty("ClaimActivity_NewLitigation", "ClaimActivity_NewLitigation", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_NewNoticeOnly() {
      return getOrCreateProperty("ClaimActivity_NewNoticeOnly", "ClaimActivity_NewNoticeOnly", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimActivity_ReopenedClaims() {
      return getOrCreateProperty("ClaimActivity_ReopenedClaims", "ClaimActivity_ReopenedClaims", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimActivityByLOBLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimActivityByLOBLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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