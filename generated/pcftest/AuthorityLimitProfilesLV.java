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
import pcftest.AuthorityLimitProfilesLV.DescriptionHeader;
import pcftest.AuthorityLimitProfilesLV.NameHeader;
import pcftest.AuthorityLimitProfilesLV._ListPaging;
import pcftest.AuthorityLimitProfilesLV.entry;
import pcftest.AuthorityLimitProfilesLV.entry.Name;
import pcftest.AuthorityLimitProfilesLV.entry._Select;
import pcftest.AuthorityLimitProfilesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AuthorityLimitProfilesLV extends PCFElement {
  public final static String CHECKSUM = "e9b5fd8b70c4f59204326d1b29c1282d";
  
  public AuthorityLimitProfilesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AuthorityLimitProfilesLV.DescriptionHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AuthorityLimitProfilesLV.NameHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AuthorityLimitProfilesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AuthorityLimitProfilesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.AuthorityLimitProfilesLV.entry.Name.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AuthorityLimitProfilesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AuthorityLimitProfilesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ValueElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AuthorityLimitProfileDetailPage click() {
        return clickThis(pcftest.AuthorityLimitProfileDetailPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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