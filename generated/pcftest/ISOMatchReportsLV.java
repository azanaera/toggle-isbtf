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
import pcftest.ISOMatchReportsLV.ClaimNumberHeader;
import pcftest.ISOMatchReportsLV.InsurerHeader;
import pcftest.ISOMatchReportsLV.InsurerPhoneHeader;
import pcftest.ISOMatchReportsLV.LossDateHeader;
import pcftest.ISOMatchReportsLV.PolicyNumberHeader;
import pcftest.ISOMatchReportsLV.ReceivedDateHeader;
import pcftest.ISOMatchReportsLV._ListPaging;
import pcftest.ISOMatchReportsLV.entry;
import pcftest.ISOMatchReportsLV.entry.ClaimNumber;
import pcftest.ISOMatchReportsLV.entry.Insurer;
import pcftest.ISOMatchReportsLV.entry._Select;
import pcftest.ISOMatchReportsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOMatchReportsLV extends PCFElement {
  public final static String CHECKSUM = "879ac8caef3bb4550cb95f8753e7cfcf";
  
  public ISOMatchReportsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimNumberHeader getClaimNumberHeader() {
    return getOrCreateProperty("ClaimNumberHeader", "ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ISOMatchReportsLV.ClaimNumberHeader.class);
  }
  
  public InsurerHeader getInsurerHeader() {
    return getOrCreateProperty("InsurerHeader", "InsurerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ISOMatchReportsLV.InsurerHeader.class);
  }
  
  public InsurerPhoneHeader getInsurerPhoneHeader() {
    return getOrCreateProperty("InsurerPhoneHeader", "InsurerPhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ISOMatchReportsLV.InsurerPhoneHeader.class);
  }
  
  public LossDateHeader getLossDateHeader() {
    return getOrCreateProperty("LossDateHeader", "LossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ISOMatchReportsLV.LossDateHeader.class);
  }
  
  public PolicyNumberHeader getPolicyNumberHeader() {
    return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ISOMatchReportsLV.PolicyNumberHeader.class);
  }
  
  public ReceivedDateHeader getReceivedDateHeader() {
    return getOrCreateProperty("ReceivedDateHeader", "ReceivedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ISOMatchReportsLV.ReceivedDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ISOMatchReportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ISOMatchReportsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNumberHeader extends ValueElement {
    public ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsurerHeader extends ValueElement {
    public InsurerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsurerPhoneHeader extends ValueElement {
    public InsurerPhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDateHeader extends ValueElement {
    public LossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyNumberHeader extends ValueElement {
    public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReceivedDateHeader extends ValueElement {
    public ReceivedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimNumber getClaimNumber() {
      return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, pcftest.ISOMatchReportsLV.entry.ClaimNumber.class);
    }
    
    public Insurer getInsurer() {
      return getOrCreateProperty("Insurer", "Insurer", null, pcftest.ISOMatchReportsLV.entry.Insurer.class);
    }
    
    public ValueElement getInsurerPhone() {
      return getOrCreateProperty("InsurerPhone", "InsurerPhone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLossDate() {
      return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getReceivedDate() {
      return getOrCreateProperty("ReceivedDate", "ReceivedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ISOMatchReportsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ISOMatchReportsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimNumber extends ValueElement {
      public ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ISOMatchReportDetailPopup click() {
        return clickThis(pcftest.ISOMatchReportDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Insurer extends ValueElement {
      public Insurer(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ISOMatchReportDetailPopup click() {
        return clickThis(pcftest.ISOMatchReportDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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