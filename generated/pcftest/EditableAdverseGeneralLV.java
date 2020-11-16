package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.EditableAdverseGeneralLV.AdversePartyHeader;
import pcftest.EditableAdverseGeneralLV.Classification1Header;
import pcftest.EditableAdverseGeneralLV.ExpectedRecoveryHeader;
import pcftest.EditableAdverseGeneralLV.ExpectedRecoveryPercentageHeader;
import pcftest.EditableAdverseGeneralLV.LiabilityPercentageHeader;
import pcftest.EditableAdverseGeneralLV.PendingHeader;
import pcftest.EditableAdverseGeneralLV.RecoveredHeader;
import pcftest.EditableAdverseGeneralLV.Strategy1Header;
import pcftest.EditableAdverseGeneralLV._ListPaging;
import pcftest.EditableAdverseGeneralLV.entry;
import pcftest.EditableAdverseGeneralLV.entry.AdverseParty;
import pcftest.EditableAdverseGeneralLV.entry.Classification1;
import pcftest.EditableAdverseGeneralLV.entry.Strategy1;
import typekey.SubroClassification;
import typekey.SubroStrategy;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableAdverseGeneralLV extends PCFElement {
  public final static String CHECKSUM = "188038041cf8f8bcd26b227e2687719d";
  
  public EditableAdverseGeneralLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAdversePartyExpectedRecovery() {
    return getOrCreateProperty("AdversePartyExpectedRecovery", "AdversePartyExpectedRecovery", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAdversePartyExpectedRecoveryAmount() {
    return getOrCreateProperty("AdversePartyExpectedRecoveryAmount", "AdversePartyExpectedRecoveryAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AdversePartyHeader getAdversePartyHeader() {
    return getOrCreateProperty("AdversePartyHeader", "AdversePartyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.AdversePartyHeader.class);
  }
  
  public ValueElement getAdversePartyLiability() {
    return getOrCreateProperty("AdversePartyLiability", "AdversePartyLiability", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAdversePartyPending() {
    return getOrCreateProperty("AdversePartyPending", "AdversePartyPending", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAdversePartyRecovered() {
    return getOrCreateProperty("AdversePartyRecovered", "AdversePartyRecovered", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Classification1Header getClassification1Header() {
    return getOrCreateProperty("Classification1Header", "Classification1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.Classification1Header.class);
  }
  
  public ExpectedRecoveryHeader getExpectedRecoveryHeader() {
    return getOrCreateProperty("ExpectedRecoveryHeader", "ExpectedRecoveryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.ExpectedRecoveryHeader.class);
  }
  
  public ExpectedRecoveryPercentageHeader getExpectedRecoveryPercentageHeader() {
    return getOrCreateProperty("ExpectedRecoveryPercentageHeader", "ExpectedRecoveryPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.ExpectedRecoveryPercentageHeader.class);
  }
  
  public LiabilityPercentageHeader getLiabilityPercentageHeader() {
    return getOrCreateProperty("LiabilityPercentageHeader", "LiabilityPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.LiabilityPercentageHeader.class);
  }
  
  public PendingHeader getPendingHeader() {
    return getOrCreateProperty("PendingHeader", "PendingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.PendingHeader.class);
  }
  
  public RecoveredHeader getRecoveredHeader() {
    return getOrCreateProperty("RecoveredHeader", "RecoveredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.RecoveredHeader.class);
  }
  
  public Strategy1Header getStrategy1Header() {
    return getOrCreateProperty("Strategy1Header", "Strategy1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAdverseGeneralLV.Strategy1Header.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableAdverseGeneralLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableAdverseGeneralLV._ListPaging.class);
  }
  
  public pcftest.EditableAdverseGeneralLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableAdverseGeneralLV._Select.class);
  }
  
  public pcftest.EditableAdverseGeneralLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableAdverseGeneralLV._ViewDetail.class);
  }
  
  public ValueElement getemptyLabel() {
    return getOrCreateProperty("emptyLabel", "emptyLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getemptyLabel0() {
    return getOrCreateProperty("emptyLabel0", "emptyLabel0", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdversePartyHeader extends ValueElement {
    public AdversePartyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Classification1Header extends ValueElement {
    public Classification1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpectedRecoveryHeader extends ValueElement {
    public ExpectedRecoveryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpectedRecoveryPercentageHeader extends ValueElement {
    public ExpectedRecoveryPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LiabilityPercentageHeader extends ValueElement {
    public LiabilityPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PendingHeader extends ValueElement {
    public PendingHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveredHeader extends ValueElement {
    public RecoveredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Strategy1Header extends ValueElement {
    public Strategy1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AdverseParty getAdverseParty() {
      return getOrCreateProperty("AdverseParty", "AdverseParty", null, pcftest.EditableAdverseGeneralLV.entry.AdverseParty.class);
    }
    
    public Classification1 getClassification1() {
      return getOrCreateProperty("Classification1", "Classification1", null, pcftest.EditableAdverseGeneralLV.entry.Classification1.class);
    }
    
    public ValueElement getExpectedRecovery() {
      return getOrCreateProperty("ExpectedRecovery", "ExpectedRecovery", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExpectedRecoveryPercentage() {
      return getOrCreateProperty("ExpectedRecoveryPercentage", "ExpectedRecoveryPercentage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLiabilityPercentage() {
      return getOrCreateProperty("LiabilityPercentage", "LiabilityPercentage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPending() {
      return getOrCreateProperty("Pending", "Pending", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRecovered() {
      return getOrCreateProperty("Recovered", "Recovered", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Strategy1 getStrategy1() {
      return getOrCreateProperty("Strategy1", "Strategy1", null, pcftest.EditableAdverseGeneralLV.entry.Strategy1.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.EditableAdverseGeneralLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableAdverseGeneralLV.entry._Select.class);
    }
    
    public pcftest.EditableAdverseGeneralLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableAdverseGeneralLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdverseParty extends ValueElement {
      public AdverseParty(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SubrogationParties click() {
        return clickThis(pcftest.SubrogationParties.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Classification1 extends SelectElement {
      public Classification1(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(SubroClassification arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public SubroClassification getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroClassification.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(SubroClassification arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Strategy1 extends SelectElement {
      public Strategy1(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(SubroStrategy arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public SubroStrategy getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroStrategy.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(SubroStrategy arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/EditableAdverseGeneralLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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