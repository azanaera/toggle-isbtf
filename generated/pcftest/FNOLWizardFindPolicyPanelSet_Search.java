package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.AddressHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.CityHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.EffectiveHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.ExpirationHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.InsuredHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.PolicyNumberHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.StateHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.StatusHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.TypeHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.ZipHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.PolicyNumber;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.Status;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.Type;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.selectButton;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.unselectButton;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV_tb;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.Reset;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.Search;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry.otherClaimant;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry.otherID;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry.otherStatus;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherClaimantHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherIDHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherInsuredHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherLossDateHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherPolicyIDHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherStatusHeader;
import pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV_tb;
import typekey.ClaimState;
import typekey.PolicyStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardFindPolicyPanelSet_Search extends FNOLWizardFindPolicyPanelSet {
  public final static String CHECKSUM = "08beeb7bd7fa21f18e643b498da0532e";
  
  public FNOLWizardFindPolicyPanelSet_Search(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getClaimMode() {
    return getOrCreateProperty("ClaimMode", "ClaimMode", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getClaimNumber2() {
    return getOrCreateProperty("ClaimNumber2", "ClaimNumber2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getClaim_LossDate() {
    return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getClaim_lossTime() {
    return getOrCreateProperty("Claim_lossTime", "Claim_lossTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public FNOLWizard_PolicySearchInputSet_default getFNOLWizard_PolicySearchInputSet_default() {
    return getOrCreateProperty("FNOLWizard_PolicySearchInputSet_default", "FNOLWizard_PolicySearchInputSet", null, pcftest.FNOLWizard_PolicySearchInputSet_default.class);
  }
  
  public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
    return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
  }
  
  public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
    return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public CheckboxValueElement getIncludeArchivedPolicies() {
    return getOrCreateProperty("IncludeArchivedPolicies", "IncludeArchivedPolicies", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public PolicyResultLV getPolicyResultLV() {
    return getOrCreateProperty("PolicyResultLV", "PolicyResultLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.class);
  }
  
  public PolicyResultLV_tb getPolicyResultLV_tb() {
    return getOrCreateProperty("PolicyResultLV_tb", "PolicyResultLV_tb", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV_tb.class);
  }
  
  public pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyType getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyType.class);
  }
  
  public Reset getReset() {
    return getOrCreateProperty("Reset", "Reset", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.Reset.class);
  }
  
  public Search getSearch() {
    return getOrCreateProperty("Search", "Search", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.Search.class);
  }
  
  public DateElement getdate() {
    return getOrCreateProperty("date", "date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public otherClaimLV getotherClaimLV() {
    return getOrCreateProperty("otherClaimLV", "otherClaimLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.class);
  }
  
  public otherClaimLV_tb getotherClaimLV_tb() {
    return getOrCreateProperty("otherClaimLV_tb", "otherClaimLV_tb", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV_tb.class);
  }
  
  public ValueElement getpolicyNumber() {
    return getOrCreateProperty("policyNumber", "policyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyResultLV extends PCFElement {
    public PolicyResultLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressHeader getAddressHeader() {
      return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.AddressHeader.class);
    }
    
    public CityHeader getCityHeader() {
      return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.CityHeader.class);
    }
    
    public EffectiveHeader getEffectiveHeader() {
      return getOrCreateProperty("EffectiveHeader", "EffectiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.EffectiveHeader.class);
    }
    
    public ExpirationHeader getExpirationHeader() {
      return getOrCreateProperty("ExpirationHeader", "ExpirationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.ExpirationHeader.class);
    }
    
    public InsuredHeader getInsuredHeader() {
      return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.InsuredHeader.class);
    }
    
    public PolicyNumberHeader getPolicyNumberHeader() {
      return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.PolicyNumberHeader.class);
    }
    
    public ValueElement getSelectHeader() {
      return getOrCreateProperty("SelectHeader", "SelectHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public StateHeader getStateHeader() {
      return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.StateHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.StatusHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.TypeHeader.class);
    }
    
    public ZipHeader getZipHeader() {
      return getOrCreateProperty("ZipHeader", "ZipHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.ZipHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressHeader extends ValueElement {
      public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CityHeader extends ValueElement {
      public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EffectiveHeader extends ValueElement {
      public EffectiveHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExpirationHeader extends ValueElement {
      public ExpirationHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsuredHeader extends ValueElement {
      public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyNumberHeader extends ValueElement {
      public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateHeader extends ValueElement {
      public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ZipHeader extends ValueElement {
      public ZipHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAddress() {
        return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCity() {
        return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getEffective() {
        return getOrCreateProperty("Effective", "Effective", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public DateElement getExpiration() {
        return getOrCreateProperty("Expiration", "Expiration", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getInsured() {
        return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public PolicyNumber getPolicyNumber() {
        return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.PolicyNumber.class);
      }
      
      public pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.State getState() {
        return getOrCreateProperty("State", "State", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.State.class);
      }
      
      public Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.Status.class);
      }
      
      public Type getType() {
        return getOrCreateProperty("Type", "Type", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.Type.class);
      }
      
      public ValueElement getZip() {
        return getOrCreateProperty("Zip", "Zip", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry._Select.class);
      }
      
      public pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry._ViewDetail.class);
      }
      
      public selectButton getselectButton() {
        return getOrCreateProperty("selectButton", "selectButton", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.selectButton.class);
      }
      
      public unselectButton getunselectButton() {
        return getOrCreateProperty("unselectButton", "unselectButton", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.PolicyResultLV.entry.unselectButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PolicyNumber extends ValueElement {
        public PolicyNumber(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PolicySummaryInfoPopup click() {
          return clickThis(pcftest.PolicySummaryInfoPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class State extends SelectElement {
        public State(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(typekey.State arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public typekey.State getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(typekey.State arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends SelectElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(PolicyStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public PolicyStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(PolicyStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Type extends SelectElement {
        public Type(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(typekey.PolicyType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public typekey.PolicyType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(typekey.PolicyType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class selectButton extends ClickableActionElement {
        public selectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class unselectButton extends ClickableActionElement {
        public unselectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyResultLV_tb extends PCFElement {
    public PolicyResultLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyType extends SelectElement {
    public PolicyType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.PolicyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.PolicyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.PolicyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reset extends ClickableActionElement {
    public Reset(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Search extends ClickableActionElement {
    public Search(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class otherClaimLV extends PCFElement {
    public otherClaimLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV._ListPaging.class);
    }
    
    public otherClaimantHeader getotherClaimantHeader() {
      return getOrCreateProperty("otherClaimantHeader", "otherClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherClaimantHeader.class);
    }
    
    public otherIDHeader getotherIDHeader() {
      return getOrCreateProperty("otherIDHeader", "otherIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherIDHeader.class);
    }
    
    public otherInsuredHeader getotherInsuredHeader() {
      return getOrCreateProperty("otherInsuredHeader", "otherInsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherInsuredHeader.class);
    }
    
    public otherLossDateHeader getotherLossDateHeader() {
      return getOrCreateProperty("otherLossDateHeader", "otherLossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherLossDateHeader.class);
    }
    
    public otherPolicyIDHeader getotherPolicyIDHeader() {
      return getOrCreateProperty("otherPolicyIDHeader", "otherPolicyIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherPolicyIDHeader.class);
    }
    
    public otherStatusHeader getotherStatusHeader() {
      return getOrCreateProperty("otherStatusHeader", "otherStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.otherStatusHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry._Select.class);
      }
      
      public pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry._ViewDetail.class);
      }
      
      public otherClaimant getotherClaimant() {
        return getOrCreateProperty("otherClaimant", "otherClaimant", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry.otherClaimant.class);
      }
      
      public otherID getotherID() {
        return getOrCreateProperty("otherID", "otherID", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry.otherID.class);
      }
      
      public ValueElement getotherInsured() {
        return getOrCreateProperty("otherInsured", "otherInsured", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getotherLossDate() {
        return getOrCreateProperty("otherLossDate", "otherLossDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public DateElement getotherPolicyID() {
        return getOrCreateProperty("otherPolicyID", "otherPolicyID", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public otherStatus getotherStatus() {
        return getOrCreateProperty("otherStatus", "otherStatus", null, pcftest.FNOLWizardFindPolicyPanelSet_Search.otherClaimLV.entry.otherStatus.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class otherClaimant extends ValueElement {
        public otherClaimant(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserContactDetailPopup click() {
          return clickThis(pcftest.UserContactDetailPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class otherID extends ValueElement {
        public otherID(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class otherStatus extends SelectElement {
        public otherStatus(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ClaimState arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ClaimState getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimState.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ClaimState arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherClaimantHeader extends ValueElement {
      public otherClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherIDHeader extends ValueElement {
      public otherIDHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherInsuredHeader extends ValueElement {
      public otherInsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherLossDateHeader extends ValueElement {
      public otherLossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherPolicyIDHeader extends ValueElement {
      public otherPolicyIDHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherStatusHeader extends ValueElement {
      public otherStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class otherClaimLV_tb extends PCFElement {
    public otherClaimLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}