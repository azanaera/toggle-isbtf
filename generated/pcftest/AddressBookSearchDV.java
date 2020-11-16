package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.AddressBookSearchDV.AttorneySpecialty;
import pcftest.AddressBookSearchDV.DoctorSpecialty;
import pcftest.AddressBookSearchDV.LawFirmSpecialty;
import pcftest.AddressBookSearchDV.MedicalSpecialty;
import pcftest.AddressBookSearchDV.SearchType;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.ServiceType0Header;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.ServiceType1Header;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.ServiceType2Header;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV._ListPaging;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.entry;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.entry._Select;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.entry._ViewDetail;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV_tb;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV_tb.AddSpecialistService;
import pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV_tb.RemoveSpecialService;
import typekey.ContactSearchType;
import typekey.LegalSpecialty;
import typekey.SpecialtyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "5a80cc4db6ac7fcf0ba7082736078edd";
  
  public AddressBookSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AddressBookSearchDV.AdjudicativeDomain getAdjudicativeDomain() {
    return getOrCreateProperty("AdjudicativeDomain", "AdjudicativeDomain", null, pcftest.AddressBookSearchDV.AdjudicativeDomain.class);
  }
  
  public AttorneySpecialty getAttorneySpecialty() {
    return getOrCreateProperty("AttorneySpecialty", "AttorneySpecialty", null, pcftest.AddressBookSearchDV.AttorneySpecialty.class);
  }
  
  public CCAddressBookSearchLocationInputSet getCCAddressBookSearchLocationInputSet() {
    return getOrCreateProperty("CCAddressBookSearchLocationInputSet", "CCAddressBookSearchLocationInputSet", null, pcftest.CCAddressBookSearchLocationInputSet.class);
  }
  
  public CCAddressBookSearchProximityAddressInputSet getCCAddressBookSearchProximityAddressInputSet() {
    return getOrCreateProperty("CCAddressBookSearchProximityAddressInputSet", "CCAddressBookSearchProximityAddressInputSet", null, pcftest.CCAddressBookSearchProximityAddressInputSet.class);
  }
  
  public SelectElement getContactSubtype() {
    return getOrCreateProperty("ContactSubtype", "ContactSubtype", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DoctorSpecialty getDoctorSpecialty() {
    return getOrCreateProperty("DoctorSpecialty", "DoctorSpecialty", null, pcftest.AddressBookSearchDV.DoctorSpecialty.class);
  }
  
  public CheckboxValueElement getIncludePendingContacts() {
    return getOrCreateProperty("IncludePendingContacts", "IncludePendingContacts", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getIncludeSpecialistService() {
    return getOrCreateProperty("IncludeSpecialistService", "IncludeSpecialistService", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public LawFirmSpecialty getLawFirmSpecialty() {
    return getOrCreateProperty("LawFirmSpecialty", "LawFirmSpecialty", null, pcftest.AddressBookSearchDV.LawFirmSpecialty.class);
  }
  
  public MedicalSpecialty getMedicalSpecialty() {
    return getOrCreateProperty("MedicalSpecialty", "MedicalSpecialty", null, pcftest.AddressBookSearchDV.MedicalSpecialty.class);
  }
  
  public SelectElement getMinimumScore() {
    return getOrCreateProperty("MinimumScore", "MinimumScore", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public NameInputSet_Contact getNameInputSet_Contact() {
    return getOrCreateProperty("NameInputSet_Contact", "NameInputSet", null, pcftest.NameInputSet_Contact.class);
  }
  
  public NameInputSet_Person getNameInputSet_Person() {
    return getOrCreateProperty("NameInputSet_Person", "NameInputSet", null, pcftest.NameInputSet_Person.class);
  }
  
  public BooleanValueElement getPreferredVendors() {
    return getOrCreateProperty("PreferredVendors", "PreferredVendors", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public SearchType getSearchType() {
    return getOrCreateProperty("SearchType", "SearchType", null, pcftest.AddressBookSearchDV.SearchType.class);
  }
  
  public SpecialistServicesInputSet getSpecialistServicesInputSet() {
    return getOrCreateProperty("SpecialistServicesInputSet", "SpecialistServicesInputSet", null, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjudicativeDomain extends SelectElement {
    public AdjudicativeDomain(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.AdjudicativeDomain arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.AdjudicativeDomain getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AdjudicativeDomain.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.AdjudicativeDomain arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttorneySpecialty extends SelectElement {
    public AttorneySpecialty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LegalSpecialty arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LegalSpecialty getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LegalSpecialty.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LegalSpecialty arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DoctorSpecialty extends SelectElement {
    public DoctorSpecialty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SpecialtyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SpecialtyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SpecialtyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SpecialtyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LawFirmSpecialty extends SelectElement {
    public LawFirmSpecialty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LegalSpecialty arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LegalSpecialty getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LegalSpecialty.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LegalSpecialty arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalSpecialty extends SelectElement {
    public MedicalSpecialty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SpecialtyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SpecialtyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SpecialtyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SpecialtyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchType extends SelectElement {
    public SearchType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ContactSearchType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ContactSearchType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContactSearchType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ContactSearchType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistServicesInputSet extends PCFElement {
    public SpecialistServicesInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SpecialistServicesLV getSpecialistServicesLV() {
      return getOrCreateProperty("SpecialistServicesLV", "SpecialistServicesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.class);
    }
    
    public SpecialistServicesLV_tb getSpecialistServicesLV_tb() {
      return getOrCreateProperty("SpecialistServicesLV_tb", "SpecialistServicesLV_tb", null, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SpecialistServicesLV extends PCFElement {
      public SpecialistServicesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ServiceType0Header getServiceType0Header() {
        return getOrCreateProperty("ServiceType0Header", "ServiceType0Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.ServiceType0Header.class);
      }
      
      public ServiceType1Header getServiceType1Header() {
        return getOrCreateProperty("ServiceType1Header", "ServiceType1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.ServiceType1Header.class);
      }
      
      public ServiceType2Header getServiceType2Header() {
        return getOrCreateProperty("ServiceType2Header", "ServiceType2Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.ServiceType2Header.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServiceType0Header extends ValueElement {
        public ServiceType0Header(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServiceType1Header extends ValueElement {
        public ServiceType1Header(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServiceType2Header extends ValueElement {
        public ServiceType2Header(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getServiceType0() {
          return getOrCreateProperty("ServiceType0", "ServiceType0", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getServiceType1() {
          return getOrCreateProperty("ServiceType1", "ServiceType1", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getServiceType2() {
          return getOrCreateProperty("ServiceType2", "ServiceType2", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SpecialistServicesLV_tb extends PCFElement {
      public SpecialistServicesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddSpecialistService getAddSpecialistService() {
        return getOrCreateProperty("AddSpecialistService", "AddSpecialistService", null, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV_tb.AddSpecialistService.class);
      }
      
      public RemoveSpecialService getRemoveSpecialService() {
        return getOrCreateProperty("RemoveSpecialService", "RemoveSpecialService", null, pcftest.AddressBookSearchDV.SpecialistServicesInputSet.SpecialistServicesLV_tb.RemoveSpecialService.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddSpecialistService extends ClickableActionElement {
        public AddSpecialistService(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RemoveSpecialService extends ClickableActionElement {
        public RemoveSpecialService(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}