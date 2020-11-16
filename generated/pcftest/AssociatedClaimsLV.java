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
import pcftest.AssociatedClaimsLV.AssociationHeader;
import pcftest.AssociatedClaimsLV.ClaimHeader;
import pcftest.AssociatedClaimsLV.TypeHeader;
import pcftest.AssociatedClaimsLV._ListPaging;
import pcftest.AssociatedClaimsLV.entry;
import pcftest.AssociatedClaimsLV.entry.Association;
import pcftest.AssociatedClaimsLV.entry.Type;
import pcftest.AssociatedClaimsLV.entry._Select;
import pcftest.AssociatedClaimsLV.entry._ViewDetail;
import pcftest.AssociatedClaimsLV.entry.entry2;
import pcftest.AssociatedClaimsLV.entry.entry2.AssociationsSeparator;
import pcftest.AssociatedClaimsLV.entry.entry2.ClaimAssociationClaimNumber;
import typekey.ClaimAssocType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssociatedClaimsLV extends PCFElement {
  public final static String CHECKSUM = "88c965c8528d1ae4f7d434b3a4cb1c6a";
  
  public AssociatedClaimsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssociationHeader getAssociationHeader() {
    return getOrCreateProperty("AssociationHeader", "AssociationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssociatedClaimsLV.AssociationHeader.class);
  }
  
  public ClaimHeader getClaimHeader() {
    return getOrCreateProperty("ClaimHeader", "ClaimHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssociatedClaimsLV.ClaimHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssociatedClaimsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AssociatedClaimsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AssociatedClaimsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssociationHeader extends ValueElement {
    public AssociationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimHeader extends ValueElement {
    public ClaimHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Association getAssociation() {
      return getOrCreateProperty("Association", "Association", null, pcftest.AssociatedClaimsLV.entry.Association.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.AssociatedClaimsLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry2> get_Entries() {
      return getOrCreateEntries(null, pcftest.AssociatedClaimsLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AssociatedClaimsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AssociatedClaimsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Association extends ValueElement {
      public Association(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimAssociationDetail click() {
        return clickThis(pcftest.ClaimAssociationDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry2 extends PCFElement {
      public entry2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssociationsSeparator getAssociationsSeparator() {
        return getOrCreateProperty("AssociationsSeparator", "AssociationsSeparator", null, pcftest.AssociatedClaimsLV.entry.entry2.AssociationsSeparator.class);
      }
      
      public ClaimAssociationClaimNumber getClaimAssociationClaimNumber() {
        return getOrCreateProperty("ClaimAssociationClaimNumber", "ClaimAssociationClaimNumber", null, pcftest.AssociatedClaimsLV.entry.entry2.ClaimAssociationClaimNumber.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AssociationsSeparator extends ClickableActionElement {
        public AssociationsSeparator(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/associations/AssociatedClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimAssociationClaimNumber extends ClickableActionElement {
        public ClaimAssociationClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}