package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.EditableBodyPartDetailsLV.CompensabilityCommentsHeader;
import pcftest.EditableBodyPartDetailsLV.CompensabilityDecisionDateHeader;
import pcftest.EditableBodyPartDetailsLV.CompensabilityDecisionHeader;
import pcftest.EditableBodyPartDetailsLV.DetailedBodyPartDescriptionHeader;
import pcftest.EditableBodyPartDetailsLV.DetailedBodyPartHeader;
import pcftest.EditableBodyPartDetailsLV.DetailedBodyPartSideHeader;
import pcftest.EditableBodyPartDetailsLV.OrderingHeader;
import pcftest.EditableBodyPartDetailsLV.PermamentImpairmentPercentageHeader;
import pcftest.EditableBodyPartDetailsLV.PrimaryBodyPartHeader;
import pcftest.EditableBodyPartDetailsLV.entry;
import pcftest.EditableBodyPartDetailsLV.entry.DetailedBodyPart;
import pcftest.EditableBodyPartDetailsLV.entry.DetailedBodyPartDescription;
import pcftest.EditableBodyPartDetailsLV.entry.DetailedBodyPartSide;
import pcftest.EditableBodyPartDetailsLV.entry.PrimaryBodyPart;
import pcftest.EditableBodyPartDetailsLV.entry._Select;
import pcftest.EditableBodyPartDetailsLV.entry._ViewDetail;
import typekey.BodyPartType;
import typekey.DetailedBodyPartDesc;
import typekey.DetailedBodyPartType;
import typekey.SideOfBody;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableBodyPartDetailsLV extends PCFElement {
  public final static String CHECKSUM = "b29217fb8dbddb343baa98f473ec91fc";
  
  public EditableBodyPartDetailsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CompensabilityCommentsHeader getCompensabilityCommentsHeader() {
    return getOrCreateProperty("CompensabilityCommentsHeader", "CompensabilityCommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.CompensabilityCommentsHeader.class);
  }
  
  public CompensabilityDecisionDateHeader getCompensabilityDecisionDateHeader() {
    return getOrCreateProperty("CompensabilityDecisionDateHeader", "CompensabilityDecisionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.CompensabilityDecisionDateHeader.class);
  }
  
  public CompensabilityDecisionHeader getCompensabilityDecisionHeader() {
    return getOrCreateProperty("CompensabilityDecisionHeader", "CompensabilityDecisionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.CompensabilityDecisionHeader.class);
  }
  
  public DetailedBodyPartDescriptionHeader getDetailedBodyPartDescriptionHeader() {
    return getOrCreateProperty("DetailedBodyPartDescriptionHeader", "DetailedBodyPartDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.DetailedBodyPartDescriptionHeader.class);
  }
  
  public DetailedBodyPartHeader getDetailedBodyPartHeader() {
    return getOrCreateProperty("DetailedBodyPartHeader", "DetailedBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.DetailedBodyPartHeader.class);
  }
  
  public DetailedBodyPartSideHeader getDetailedBodyPartSideHeader() {
    return getOrCreateProperty("DetailedBodyPartSideHeader", "DetailedBodyPartSideHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.DetailedBodyPartSideHeader.class);
  }
  
  public OrderingHeader getOrderingHeader() {
    return getOrCreateProperty("OrderingHeader", "OrderingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.OrderingHeader.class);
  }
  
  public PermamentImpairmentPercentageHeader getPermamentImpairmentPercentageHeader() {
    return getOrCreateProperty("PermamentImpairmentPercentageHeader", "PermamentImpairmentPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.PermamentImpairmentPercentageHeader.class);
  }
  
  public PrimaryBodyPartHeader getPrimaryBodyPartHeader() {
    return getOrCreateProperty("PrimaryBodyPartHeader", "PrimaryBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBodyPartDetailsLV.PrimaryBodyPartHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableBodyPartDetailsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensabilityCommentsHeader extends ValueElement {
    public CompensabilityCommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensabilityDecisionDateHeader extends ValueElement {
    public CompensabilityDecisionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensabilityDecisionHeader extends ValueElement {
    public CompensabilityDecisionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailedBodyPartDescriptionHeader extends ValueElement {
    public DetailedBodyPartDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailedBodyPartHeader extends ValueElement {
    public DetailedBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailedBodyPartSideHeader extends ValueElement {
    public DetailedBodyPartSideHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrderingHeader extends ValueElement {
    public OrderingHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PermamentImpairmentPercentageHeader extends ValueElement {
    public PermamentImpairmentPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryBodyPartHeader extends ValueElement {
    public PrimaryBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCompensabilityComments() {
      return getOrCreateProperty("CompensabilityComments", "CompensabilityComments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.EditableBodyPartDetailsLV.entry.CompensabilityDecision getCompensabilityDecision() {
      return getOrCreateProperty("CompensabilityDecision", "CompensabilityDecision", null, pcftest.EditableBodyPartDetailsLV.entry.CompensabilityDecision.class);
    }
    
    public DateElement getCompensabilityDecisionDate() {
      return getOrCreateProperty("CompensabilityDecisionDate", "CompensabilityDecisionDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DetailedBodyPart getDetailedBodyPart() {
      return getOrCreateProperty("DetailedBodyPart", "DetailedBodyPart", null, pcftest.EditableBodyPartDetailsLV.entry.DetailedBodyPart.class);
    }
    
    public DetailedBodyPartDescription getDetailedBodyPartDescription() {
      return getOrCreateProperty("DetailedBodyPartDescription", "DetailedBodyPartDescription", null, pcftest.EditableBodyPartDetailsLV.entry.DetailedBodyPartDescription.class);
    }
    
    public DetailedBodyPartSide getDetailedBodyPartSide() {
      return getOrCreateProperty("DetailedBodyPartSide", "DetailedBodyPartSide", null, pcftest.EditableBodyPartDetailsLV.entry.DetailedBodyPartSide.class);
    }
    
    public ValueElement getOrdering() {
      return getOrCreateProperty("Ordering", "Ordering", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPermamentImpairmentPercentage() {
      return getOrCreateProperty("PermamentImpairmentPercentage", "PermamentImpairmentPercentage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PrimaryBodyPart getPrimaryBodyPart() {
      return getOrCreateProperty("PrimaryBodyPart", "PrimaryBodyPart", null, pcftest.EditableBodyPartDetailsLV.entry.PrimaryBodyPart.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableBodyPartDetailsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableBodyPartDetailsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityDecision extends SelectElement {
      public CompensabilityDecision(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CompensabilityDecision arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CompensabilityDecision getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CompensabilityDecision.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CompensabilityDecision arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedBodyPart extends SelectElement {
      public DetailedBodyPart(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DetailedBodyPartType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DetailedBodyPartType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DetailedBodyPartType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DetailedBodyPartType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedBodyPartDescription extends SelectElement {
      public DetailedBodyPartDescription(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DetailedBodyPartDesc arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DetailedBodyPartDesc getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DetailedBodyPartDesc.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DetailedBodyPartDesc arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedBodyPartSide extends SelectElement {
      public DetailedBodyPartSide(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(SideOfBody arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public SideOfBody getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SideOfBody.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(SideOfBody arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryBodyPart extends SelectElement {
      public PrimaryBodyPart(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(BodyPartType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public BodyPartType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BodyPartType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(BodyPartType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableBodyPartDetailsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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