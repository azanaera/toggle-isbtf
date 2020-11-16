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
import pcftest.EditableBaggageIncidentsLV.ApprovedContentTotalHeader;
import pcftest.EditableBaggageIncidentsLV.DescriptionHeader;
import pcftest.EditableBaggageIncidentsLV.PropertyDescHeader;
import pcftest.EditableBaggageIncidentsLV.ReviewContentTotalHeader;
import pcftest.EditableBaggageIncidentsLV._ListPaging;
import pcftest.EditableBaggageIncidentsLV.entry;
import pcftest.EditableBaggageIncidentsLV.entry.Description;
import pcftest.EditableBaggageIncidentsLV.entry.PropertyDesc;
import pcftest.EditableBaggageIncidentsLV.entry._Select;
import pcftest.EditableBaggageIncidentsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableBaggageIncidentsLV extends PCFElement {
  public final static String CHECKSUM = "01b03c8a40738003d320be7b0bb6f5b4";
  
  public EditableBaggageIncidentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovedContentTotalHeader getApprovedContentTotalHeader() {
    return getOrCreateProperty("ApprovedContentTotalHeader", "ApprovedContentTotalHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBaggageIncidentsLV.ApprovedContentTotalHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBaggageIncidentsLV.DescriptionHeader.class);
  }
  
  public PropertyDescHeader getPropertyDescHeader() {
    return getOrCreateProperty("PropertyDescHeader", "PropertyDescHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBaggageIncidentsLV.PropertyDescHeader.class);
  }
  
  public ReviewContentTotalHeader getReviewContentTotalHeader() {
    return getOrCreateProperty("ReviewContentTotalHeader", "ReviewContentTotalHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBaggageIncidentsLV.ReviewContentTotalHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableBaggageIncidentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableBaggageIncidentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovedContentTotalHeader extends ValueElement {
    public ApprovedContentTotalHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyDescHeader extends ValueElement {
    public PropertyDescHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewContentTotalHeader extends ValueElement {
    public ReviewContentTotalHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getApprovedContentTotal() {
      return getOrCreateProperty("ApprovedContentTotal", "ApprovedContentTotal", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Description getDescription() {
      return getOrCreateProperty("Description", "Description", null, pcftest.EditableBaggageIncidentsLV.entry.Description.class);
    }
    
    public PropertyDesc getPropertyDesc() {
      return getOrCreateProperty("PropertyDesc", "PropertyDesc", null, pcftest.EditableBaggageIncidentsLV.entry.PropertyDesc.class);
    }
    
    public ValueElement getReviewContentTotal() {
      return getOrCreateProperty("ReviewContentTotal", "ReviewContentTotal", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableBaggageIncidentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableBaggageIncidentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Description extends ValueElement {
      public Description(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentPopup click() {
        return clickThis(pcftest.BaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDesc extends ValueElement {
      public PropertyDesc(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentPopup click() {
        return clickThis(pcftest.BaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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