package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.EditableOtherBenefitsLV.AmountHeader;
import pcftest.EditableOtherBenefitsLV.CommentHeader;
import pcftest.EditableOtherBenefitsLV.EndDateHeader;
import pcftest.EditableOtherBenefitsLV.InitialContactHeader;
import pcftest.EditableOtherBenefitsLV.ReferenceNumberHeader;
import pcftest.EditableOtherBenefitsLV.StartDateHeader;
import pcftest.EditableOtherBenefitsLV._ListPaging;
import pcftest.EditableOtherBenefitsLV.entry;
import pcftest.EditableOtherBenefitsLV.entry._Select;
import pcftest.EditableOtherBenefitsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableOtherBenefitsLV extends PCFElement {
  public final static String CHECKSUM = "d71a6fd309295d5f09c83971010a457c";
  
  public EditableOtherBenefitsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AmountHeader getAmountHeader() {
    return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableOtherBenefitsLV.AmountHeader.class);
  }
  
  public CommentHeader getCommentHeader() {
    return getOrCreateProperty("CommentHeader", "CommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableOtherBenefitsLV.CommentHeader.class);
  }
  
  public EndDateHeader getEndDateHeader() {
    return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableOtherBenefitsLV.EndDateHeader.class);
  }
  
  public InitialContactHeader getInitialContactHeader() {
    return getOrCreateProperty("InitialContactHeader", "InitialContactHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableOtherBenefitsLV.InitialContactHeader.class);
  }
  
  public ReferenceNumberHeader getReferenceNumberHeader() {
    return getOrCreateProperty("ReferenceNumberHeader", "ReferenceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableOtherBenefitsLV.ReferenceNumberHeader.class);
  }
  
  public StartDateHeader getStartDateHeader() {
    return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableOtherBenefitsLV.StartDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableOtherBenefitsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableOtherBenefitsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountHeader extends ValueElement {
    public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentHeader extends ValueElement {
    public CommentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndDateHeader extends ValueElement {
    public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InitialContactHeader extends ValueElement {
    public InitialContactHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReferenceNumberHeader extends ValueElement {
    public ReferenceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartDateHeader extends ValueElement {
    public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAmount() {
      return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getComment() {
      return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getEndDate() {
      return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getInitialContact() {
      return getOrCreateProperty("InitialContact", "InitialContact", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReferenceNumber() {
      return getOrCreateProperty("ReferenceNumber", "ReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableOtherBenefitsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableOtherBenefitsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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