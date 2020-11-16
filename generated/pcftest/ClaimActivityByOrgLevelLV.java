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
import pcftest.ClaimActivityByOrgLevelLV.ByOrgLevelHeader;
import pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_AvgCloseTimeHeader;
import pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_ClosedClaimsHeader;
import pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewClaimsHeader;
import pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewExposuresHeader;
import pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewLitigationHeader;
import pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewNoticeOnlyHeader;
import pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_ReopenedClaimsHeader;
import pcftest.ClaimActivityByOrgLevelLV._ListPaging;
import pcftest.ClaimActivityByOrgLevelLV.entry;
import pcftest.ClaimActivityByOrgLevelLV.entry._Select;
import pcftest.ClaimActivityByOrgLevelLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimActivityByOrgLevelLV extends PCFElement {
  public final static String CHECKSUM = "59773b6e70689320918894f45afd4548";
  
  public ClaimActivityByOrgLevelLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ByOrgLevelHeader getByOrgLevelHeader() {
    return getOrCreateProperty("ByOrgLevelHeader", "ByOrgLevelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ByOrgLevelHeader.class);
  }
  
  public ClaimActivity_AvgCloseTimeHeader getClaimActivity_AvgCloseTimeHeader() {
    return getOrCreateProperty("ClaimActivity_AvgCloseTimeHeader", "ClaimActivity_AvgCloseTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_AvgCloseTimeHeader.class);
  }
  
  public ClaimActivity_ClosedClaimsHeader getClaimActivity_ClosedClaimsHeader() {
    return getOrCreateProperty("ClaimActivity_ClosedClaimsHeader", "ClaimActivity_ClosedClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_ClosedClaimsHeader.class);
  }
  
  public ClaimActivity_NewClaimsHeader getClaimActivity_NewClaimsHeader() {
    return getOrCreateProperty("ClaimActivity_NewClaimsHeader", "ClaimActivity_NewClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewClaimsHeader.class);
  }
  
  public ClaimActivity_NewExposuresHeader getClaimActivity_NewExposuresHeader() {
    return getOrCreateProperty("ClaimActivity_NewExposuresHeader", "ClaimActivity_NewExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewExposuresHeader.class);
  }
  
  public ClaimActivity_NewLitigationHeader getClaimActivity_NewLitigationHeader() {
    return getOrCreateProperty("ClaimActivity_NewLitigationHeader", "ClaimActivity_NewLitigationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewLitigationHeader.class);
  }
  
  public ClaimActivity_NewNoticeOnlyHeader getClaimActivity_NewNoticeOnlyHeader() {
    return getOrCreateProperty("ClaimActivity_NewNoticeOnlyHeader", "ClaimActivity_NewNoticeOnlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_NewNoticeOnlyHeader.class);
  }
  
  public ClaimActivity_ReopenedClaimsHeader getClaimActivity_ReopenedClaimsHeader() {
    return getOrCreateProperty("ClaimActivity_ReopenedClaimsHeader", "ClaimActivity_ReopenedClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimActivityByOrgLevelLV.ClaimActivity_ReopenedClaimsHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimActivityByOrgLevelLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimActivityByOrgLevelLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByOrgLevelHeader extends ValueElement {
    public ByOrgLevelHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_AvgCloseTimeHeader extends ValueElement {
    public ClaimActivity_AvgCloseTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_ClosedClaimsHeader extends ValueElement {
    public ClaimActivity_ClosedClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewClaimsHeader extends ValueElement {
    public ClaimActivity_NewClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewExposuresHeader extends ValueElement {
    public ClaimActivity_NewExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewLitigationHeader extends ValueElement {
    public ClaimActivity_NewLitigationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_NewNoticeOnlyHeader extends ValueElement {
    public ClaimActivity_NewNoticeOnlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivity_ReopenedClaimsHeader extends ValueElement {
    public ClaimActivity_ReopenedClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getByOrgLevel() {
      return getOrCreateProperty("ByOrgLevel", "ByOrgLevel", null, gw.smoketest.platform.web.ValueElement.class);
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
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimActivityByOrgLevelLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimActivityByOrgLevelLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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