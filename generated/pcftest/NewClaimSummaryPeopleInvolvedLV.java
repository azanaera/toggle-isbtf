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
import pcftest.NewClaimSummaryPeopleInvolvedLV.PeopleInvolved_NameHeader;
import pcftest.NewClaimSummaryPeopleInvolvedLV.PeopleInvolved_PhoneHeader;
import pcftest.NewClaimSummaryPeopleInvolvedLV.PeopleInvolved_RolesHeader;
import pcftest.NewClaimSummaryPeopleInvolvedLV._ListPaging;
import pcftest.NewClaimSummaryPeopleInvolvedLV.entry;
import pcftest.NewClaimSummaryPeopleInvolvedLV.entry.PeopleInvolved_Name;
import pcftest.NewClaimSummaryPeopleInvolvedLV.entry._Select;
import pcftest.NewClaimSummaryPeopleInvolvedLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimSummaryPeopleInvolvedLV extends PCFElement {
  public final static String CHECKSUM = "576180a8a66b9327c2b725d92f648e0d";
  
  public NewClaimSummaryPeopleInvolvedLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PeopleInvolved_NameHeader getPeopleInvolved_NameHeader() {
    return getOrCreateProperty("PeopleInvolved_NameHeader", "PeopleInvolved_NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryPeopleInvolvedLV.PeopleInvolved_NameHeader.class);
  }
  
  public PeopleInvolved_PhoneHeader getPeopleInvolved_PhoneHeader() {
    return getOrCreateProperty("PeopleInvolved_PhoneHeader", "PeopleInvolved_PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryPeopleInvolvedLV.PeopleInvolved_PhoneHeader.class);
  }
  
  public PeopleInvolved_RolesHeader getPeopleInvolved_RolesHeader() {
    return getOrCreateProperty("PeopleInvolved_RolesHeader", "PeopleInvolved_RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryPeopleInvolvedLV.PeopleInvolved_RolesHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimSummaryPeopleInvolvedLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimSummaryPeopleInvolvedLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeopleInvolved_NameHeader extends ValueElement {
    public PeopleInvolved_NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeopleInvolved_PhoneHeader extends ValueElement {
    public PeopleInvolved_PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeopleInvolved_RolesHeader extends ValueElement {
    public PeopleInvolved_RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PeopleInvolved_Name getPeopleInvolved_Name() {
      return getOrCreateProperty("PeopleInvolved_Name", "PeopleInvolved_Name", null, pcftest.NewClaimSummaryPeopleInvolvedLV.entry.PeopleInvolved_Name.class);
    }
    
    public ValueElement getPeopleInvolved_Phone() {
      return getOrCreateProperty("PeopleInvolved_Phone", "PeopleInvolved_Phone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeopleInvolved_Roles() {
      return getOrCreateProperty("PeopleInvolved_Roles", "PeopleInvolved_Roles", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimSummaryPeopleInvolvedLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimSummaryPeopleInvolvedLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PeopleInvolved_Name extends ValueElement {
      public PeopleInvolved_Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_PartyInvolvedPopup click() {
        return clickThis(pcftest.NewClaimWizard_PartyInvolvedPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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