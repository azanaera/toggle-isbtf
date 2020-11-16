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
import pcftest.ClaimCountByLossTypeLV_default.ByLossTypeHeader;
import pcftest.ClaimCountByLossTypeLV_default.ClaimCount_FlaggedHeader;
import pcftest.ClaimCountByLossTypeLV_default.ClaimCount_LitigatedHeader;
import pcftest.ClaimCountByLossTypeLV_default.ClaimCount_NoticeOnlyHeader;
import pcftest.ClaimCountByLossTypeLV_default.ClaimCount_OpenClaimsHeader;
import pcftest.ClaimCountByLossTypeLV_default.ClaimCount_OpenExposuresHeader;
import pcftest.ClaimCountByLossTypeLV_default.ClaimCount_OverIncurredLimitHeader;
import pcftest.ClaimCountByLossTypeLV_default._ListPaging;
import pcftest.ClaimCountByLossTypeLV_default.entry;
import pcftest.ClaimCountByLossTypeLV_default.entry.ByLossType;
import pcftest.ClaimCountByLossTypeLV_default.entry._Select;
import pcftest.ClaimCountByLossTypeLV_default.entry._ViewDetail;
import typekey.LossType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCountByLossTypeLV_default extends ClaimCountByLossTypeLV {
  public final static String CHECKSUM = "60e6d56d38d9bd51bca7548a158c906b";
  
  public ClaimCountByLossTypeLV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getByLossTypeFooter() {
    return getOrCreateProperty("ByLossTypeFooter", "ByLossTypeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ByLossTypeHeader getByLossTypeHeader() {
    return getOrCreateProperty("ByLossTypeHeader", "ByLossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLossTypeLV_default.ByLossTypeHeader.class);
  }
  
  public ValueElement getClaimCount_FlaggedFooter() {
    return getOrCreateProperty("ClaimCount_FlaggedFooter", "ClaimCount_FlaggedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_FlaggedHeader getClaimCount_FlaggedHeader() {
    return getOrCreateProperty("ClaimCount_FlaggedHeader", "ClaimCount_FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLossTypeLV_default.ClaimCount_FlaggedHeader.class);
  }
  
  public ValueElement getClaimCount_LitigatedFooter() {
    return getOrCreateProperty("ClaimCount_LitigatedFooter", "ClaimCount_LitigatedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_LitigatedHeader getClaimCount_LitigatedHeader() {
    return getOrCreateProperty("ClaimCount_LitigatedHeader", "ClaimCount_LitigatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLossTypeLV_default.ClaimCount_LitigatedHeader.class);
  }
  
  public ValueElement getClaimCount_NoticeOnlyFooter() {
    return getOrCreateProperty("ClaimCount_NoticeOnlyFooter", "ClaimCount_NoticeOnlyFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_NoticeOnlyHeader getClaimCount_NoticeOnlyHeader() {
    return getOrCreateProperty("ClaimCount_NoticeOnlyHeader", "ClaimCount_NoticeOnlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLossTypeLV_default.ClaimCount_NoticeOnlyHeader.class);
  }
  
  public ValueElement getClaimCount_OpenClaimsFooter() {
    return getOrCreateProperty("ClaimCount_OpenClaimsFooter", "ClaimCount_OpenClaimsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_OpenClaimsHeader getClaimCount_OpenClaimsHeader() {
    return getOrCreateProperty("ClaimCount_OpenClaimsHeader", "ClaimCount_OpenClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLossTypeLV_default.ClaimCount_OpenClaimsHeader.class);
  }
  
  public ValueElement getClaimCount_OpenExposuresFooter() {
    return getOrCreateProperty("ClaimCount_OpenExposuresFooter", "ClaimCount_OpenExposuresFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_OpenExposuresHeader getClaimCount_OpenExposuresHeader() {
    return getOrCreateProperty("ClaimCount_OpenExposuresHeader", "ClaimCount_OpenExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLossTypeLV_default.ClaimCount_OpenExposuresHeader.class);
  }
  
  public ValueElement getClaimCount_OverIncurredLimitFooter() {
    return getOrCreateProperty("ClaimCount_OverIncurredLimitFooter", "ClaimCount_OverIncurredLimitFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimCount_OverIncurredLimitHeader getClaimCount_OverIncurredLimitHeader() {
    return getOrCreateProperty("ClaimCount_OverIncurredLimitHeader", "ClaimCount_OverIncurredLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimCountByLossTypeLV_default.ClaimCount_OverIncurredLimitHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimCountByLossTypeLV_default.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimCountByLossTypeLV_default._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByLossTypeHeader extends ValueElement {
    public ByLossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_FlaggedHeader extends ValueElement {
    public ClaimCount_FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_LitigatedHeader extends ValueElement {
    public ClaimCount_LitigatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_NoticeOnlyHeader extends ValueElement {
    public ClaimCount_NoticeOnlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OpenClaimsHeader extends ValueElement {
    public ClaimCount_OpenClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OpenExposuresHeader extends ValueElement {
    public ClaimCount_OpenExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCount_OverIncurredLimitHeader extends ValueElement {
    public ClaimCount_OverIncurredLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ByLossType getByLossType() {
      return getOrCreateProperty("ByLossType", "ByLossType", null, pcftest.ClaimCountByLossTypeLV_default.entry.ByLossType.class);
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
    
    public ValueElement getClaimCount_OverIncurredLimit() {
      return getOrCreateProperty("ClaimCount_OverIncurredLimit", "ClaimCount_OverIncurredLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimCountByLossTypeLV_default.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimCountByLossTypeLV_default.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ByLossType extends SelectElement {
      public ByLossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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