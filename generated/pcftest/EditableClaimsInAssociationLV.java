package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.EditableClaimsInAssociationLV.ClaimHeader;
import pcftest.EditableClaimsInAssociationLV.IsPrimaryClaimHeader;
import pcftest.EditableClaimsInAssociationLV._ListPaging;
import pcftest.EditableClaimsInAssociationLV.entry;
import pcftest.EditableClaimsInAssociationLV.entry.Claim;
import pcftest.EditableClaimsInAssociationLV.entry.Claim.SelectClaim;
import pcftest.EditableClaimsInAssociationLV.entry._Select;
import pcftest.EditableClaimsInAssociationLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableClaimsInAssociationLV extends PCFElement {
  public final static String CHECKSUM = "9594c1694e96191a27f85709a6311705";
  
  public EditableClaimsInAssociationLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimHeader getClaimHeader() {
    return getOrCreateProperty("ClaimHeader", "ClaimHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableClaimsInAssociationLV.ClaimHeader.class);
  }
  
  public IsPrimaryClaimHeader getIsPrimaryClaimHeader() {
    return getOrCreateProperty("IsPrimaryClaimHeader", "IsPrimaryClaimHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableClaimsInAssociationLV.IsPrimaryClaimHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableClaimsInAssociationLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableClaimsInAssociationLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimHeader extends ValueElement {
    public ClaimHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IsPrimaryClaimHeader extends ValueElement {
    public IsPrimaryClaimHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Claim getClaim() {
      return getOrCreateProperty("Claim", "Claim", null, pcftest.EditableClaimsInAssociationLV.entry.Claim.class);
    }
    
    public BooleanValueElement getIsPrimaryClaim() {
      return getOrCreateProperty("IsPrimaryClaim", "IsPrimaryClaim", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableClaimsInAssociationLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableClaimsInAssociationLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim extends BasePickerValueElement {
      public Claim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SelectClaim getSelectClaim() {
        return getOrCreateProperty("SelectClaim", "SelectClaim", null, pcftest.EditableClaimsInAssociationLV.entry.Claim.SelectClaim.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SelectClaim extends ClickableActionElement {
        public SelectClaim(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSearchPopup click() {
          return clickThis(pcftest.ClaimSearchPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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