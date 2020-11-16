package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimCountByOrgLevelLV_default.ByOrgLevelHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_AvgPendingHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_FlaggedHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_HandlersHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_LitigatedHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_NoticeOnlyHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_OpenClaimsHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_OpenExposuresHeader;
import pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_OverIncurredLimitHeader;
import pcftest.ClaimCountByOrgLevelLV_default._ListPaging;
import pcftest.ClaimCountByOrgLevelLV_default.entry;
import pcftest.ClaimCountByOrgLevelLV_default.entry._Select;
import pcftest.ClaimCountByOrgLevelLV_default.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCountByOrgLevelLV_default extends ClaimCountByOrgLevelLV {
  public final static String CHECKSUM = "35af3aac0f8cd0c629271580eacb26f4";
  
  public ClaimCountByOrgLevelLV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ByOrgLevelHeader getByOrgLevelHeader() {
    return getOrCreateProperty("ByOrgLevelHeader", "ByOrgLevelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ByOrgLevelHeader.class);
  }
  
  public ClaimCount_AvgPendingHeader getClaimCount_AvgPendingHeader() {
    return getOrCreateProperty("ClaimCount_AvgPendingHeader", "ClaimCount_AvgPendingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_AvgPendingHeader.class);
  }
  
  public ClaimCount_FlaggedHeader getClaimCount_FlaggedHeader() {
    return getOrCreateProperty("ClaimCount_FlaggedHeader", "ClaimCount_FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_FlaggedHeader.class);
  }
  
  public ClaimCount_HandlersHeader getClaimCount_HandlersHeader() {
    return getOrCreateProperty("ClaimCount_HandlersHeader", "ClaimCount_HandlersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_HandlersHeader.class);
  }
  
  public ClaimCount_LitigatedHeader getClaimCount_LitigatedHeader() {
    return getOrCreateProperty("ClaimCount_LitigatedHeader", "ClaimCount_LitigatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_LitigatedHeader.class);
  }
  
  public ClaimCount_NoticeOnlyHeader getClaimCount_NoticeOnlyHeader() {
    return getOrCreateProperty("ClaimCount_NoticeOnlyHeader", "ClaimCount_NoticeOnlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_NoticeOnlyHeader.class);
  }
  
  public ClaimCount_OpenClaimsHeader getClaimCount_OpenClaimsHeader() {
    return getOrCreateProperty("ClaimCount_OpenClaimsHeader", "ClaimCount_OpenClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_OpenClaimsHeader.class);
  }
  
  public ClaimCount_OpenExposuresHeader getClaimCount_OpenExposuresHeader() {
    return getOrCreateProperty("ClaimCount_OpenExposuresHeader", "ClaimCount_OpenExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_OpenExposuresHeader.class);
  }
  
  public ClaimCount_OverIncurredLimitHeader getClaimCount_OverIncurredLimitHeader() {
    return getOrCreateProperty("ClaimCount_OverIncurredLimitHeader", "ClaimCount_OverIncurredLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByOrgLevelLV_default.ClaimCount_OverIncurredLimitHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimCountByOrgLevelLV_default.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimCountByOrgLevelLV_default._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByOrgLevelHeader extends ValueElement {
    public ByOrgLevelHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_AvgPendingHeader extends ValueElement {
    public ClaimCount_AvgPendingHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_FlaggedHeader extends ValueElement {
    public ClaimCount_FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_HandlersHeader extends ValueElement {
    public ClaimCount_HandlersHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_LitigatedHeader extends ValueElement {
    public ClaimCount_LitigatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_NoticeOnlyHeader extends ValueElement {
    public ClaimCount_NoticeOnlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OpenClaimsHeader extends ValueElement {
    public ClaimCount_OpenClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OpenExposuresHeader extends ValueElement {
    public ClaimCount_OpenExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OverIncurredLimitHeader extends ValueElement {
    public ClaimCount_OverIncurredLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getByOrgLevel() {
      return getOrCreateProperty("ByOrgLevel", "ByOrgLevel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount_AvgPending() {
      return getOrCreateProperty("ClaimCount_AvgPending", "ClaimCount_AvgPending", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount_Flagged() {
      return getOrCreateProperty("ClaimCount_Flagged", "ClaimCount_Flagged", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount_Handlers() {
      return getOrCreateProperty("ClaimCount_Handlers", "ClaimCount_Handlers", null, gw.smoketest.platform.web.ValueElement.class);
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
    
    public ValueElement getClaimCount_OverIncurredLimit() {
      return getOrCreateProperty("ClaimCount_OverIncurredLimit", "ClaimCount_OverIncurredLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimCountByOrgLevelLV_default.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimCountByOrgLevelLV_default.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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