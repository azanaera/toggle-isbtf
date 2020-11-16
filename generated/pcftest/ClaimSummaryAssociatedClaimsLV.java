package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.ClaimSummaryAssociatedClaimsLV.AssociationHeader;
import pcftest.ClaimSummaryAssociatedClaimsLV.ClaimHeader;
import pcftest.ClaimSummaryAssociatedClaimsLV.TypeHeader;
import pcftest.ClaimSummaryAssociatedClaimsLV._ListPaging;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry.Association;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry.Type;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry._Select;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry._ViewDetail;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry.entry2;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry.entry2.associationsSeparator;
import pcftest.ClaimSummaryAssociatedClaimsLV.entry.entry2.claimAssociationClaimNumber;
import typekey.ClaimAssocType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryAssociatedClaimsLV extends PCFElement {
  public final static String CHECKSUM = "369a26dd2ee29035b010200373e12795";
  
  public ClaimSummaryAssociatedClaimsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssociationHeader getAssociationHeader() {
    return getOrCreateProperty("AssociationHeader", "AssociationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSummaryAssociatedClaimsLV.AssociationHeader.class);
  }
  
  public ClaimHeader getClaimHeader() {
    return getOrCreateProperty("ClaimHeader", "ClaimHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSummaryAssociatedClaimsLV.ClaimHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSummaryAssociatedClaimsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSummaryAssociatedClaimsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSummaryAssociatedClaimsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssociationHeader extends ValueElement {
    public AssociationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimHeader extends ValueElement {
    public ClaimHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Association getAssociation() {
      return getOrCreateProperty("Association", "Association", null, pcftest.ClaimSummaryAssociatedClaimsLV.entry.Association.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.ClaimSummaryAssociatedClaimsLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry2> get_Entries() {
      return getOrCreateEntries(null, pcftest.ClaimSummaryAssociatedClaimsLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSummaryAssociatedClaimsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSummaryAssociatedClaimsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Association extends ValueElement {
      public Association(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimAssociationDetail click() {
        return clickThis(pcftest.ClaimAssociationDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ClaimAssocType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ClaimAssocType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimAssocType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ClaimAssocType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry2 extends PCFElement {
      public entry2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public associationsSeparator getassociationsSeparator() {
        return getOrCreateProperty("associationsSeparator", "associationsSeparator", null, pcftest.ClaimSummaryAssociatedClaimsLV.entry.entry2.associationsSeparator.class);
      }
      
      public claimAssociationClaimNumber getclaimAssociationClaimNumber() {
        return getOrCreateProperty("claimAssociationClaimNumber", "claimAssociationClaimNumber", null, pcftest.ClaimSummaryAssociatedClaimsLV.entry.entry2.claimAssociationClaimNumber.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class associationsSeparator extends ClickableActionElement {
        public associationsSeparator(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryAssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class claimAssociationClaimNumber extends ClickableActionElement {
        public claimAssociationClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}