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
import pcftest.ClaimSnapshotPolicyEndorsements700LV.CommentsHeader;
import pcftest.ClaimSnapshotPolicyEndorsements700LV.DescriptionHeader;
import pcftest.ClaimSnapshotPolicyEndorsements700LV.EffectiveDateHeader;
import pcftest.ClaimSnapshotPolicyEndorsements700LV.ExpirationDateHeader;
import pcftest.ClaimSnapshotPolicyEndorsements700LV.FormNumberHeader;
import pcftest.ClaimSnapshotPolicyEndorsements700LV._ListPaging;
import pcftest.ClaimSnapshotPolicyEndorsements700LV.entry;
import pcftest.ClaimSnapshotPolicyEndorsements700LV.entry._Select;
import pcftest.ClaimSnapshotPolicyEndorsements700LV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyEndorsements700LV extends PCFElement {
  public final static String CHECKSUM = "ce5fa99f9fda15239c3f769ba078be5c";
  
  public ClaimSnapshotPolicyEndorsements700LV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyEndorsements700LV.CommentsHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyEndorsements700LV.DescriptionHeader.class);
  }
  
  public EffectiveDateHeader getEffectiveDateHeader() {
    return getOrCreateProperty("EffectiveDateHeader", "EffectiveDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyEndorsements700LV.EffectiveDateHeader.class);
  }
  
  public ExpirationDateHeader getExpirationDateHeader() {
    return getOrCreateProperty("ExpirationDateHeader", "ExpirationDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyEndorsements700LV.ExpirationDateHeader.class);
  }
  
  public FormNumberHeader getFormNumberHeader() {
    return getOrCreateProperty("FormNumberHeader", "FormNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyEndorsements700LV.FormNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyEndorsements700LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyEndorsements700LV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EffectiveDateHeader extends ValueElement {
    public EffectiveDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpirationDateHeader extends ValueElement {
    public ExpirationDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FormNumberHeader extends ValueElement {
    public FormNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEffectiveDate() {
      return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExpirationDate() {
      return getOrCreateProperty("ExpirationDate", "ExpirationDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getFormNumber() {
      return getOrCreateProperty("FormNumber", "FormNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyEndorsements700LV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyEndorsements700LV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyEndorsements700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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