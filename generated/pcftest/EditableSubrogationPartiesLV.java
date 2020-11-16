package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.EditableSubrogationPartiesLV.Classification1Header;
import pcftest.EditableSubrogationPartiesLV.ExpectedRecoveryHeader;
import pcftest.EditableSubrogationPartiesLV.LiabilityPercentage1Header;
import pcftest.EditableSubrogationPartiesLV.Strategy1Header;
import pcftest.EditableSubrogationPartiesLV.SubroRecoveryPayee1Header;
import pcftest.EditableSubrogationPartiesLV.SubrogationFinancialsLink;
import pcftest.EditableSubrogationPartiesLV.entry;
import pcftest.EditableSubrogationPartiesLV.entry.Classification1;
import pcftest.EditableSubrogationPartiesLV.entry.PayeeLink;
import pcftest.EditableSubrogationPartiesLV.entry.Strategy1;
import typekey.SubroClassification;
import typekey.SubroStrategy;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableSubrogationPartiesLV extends PCFElement {
  public final static String CHECKSUM = "84b3e81382fdc6da2132622446deae3a";
  
  public EditableSubrogationPartiesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBlankCell() {
    return getOrCreateProperty("BlankCell", "BlankCell", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimTotal() {
    return getOrCreateProperty("ClaimTotal", "ClaimTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Classification1Header getClassification1Header() {
    return getOrCreateProperty("Classification1Header", "Classification1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSubrogationPartiesLV.Classification1Header.class);
  }
  
  public ExpectedRecoveryHeader getExpectedRecoveryHeader() {
    return getOrCreateProperty("ExpectedRecoveryHeader", "ExpectedRecoveryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSubrogationPartiesLV.ExpectedRecoveryHeader.class);
  }
  
  public ValueElement getExpectedRecoveryTotal() {
    return getOrCreateProperty("ExpectedRecoveryTotal", "ExpectedRecoveryTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LiabilityPercentage1Header getLiabilityPercentage1Header() {
    return getOrCreateProperty("LiabilityPercentage1Header", "LiabilityPercentage1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSubrogationPartiesLV.LiabilityPercentage1Header.class);
  }
  
  public ValueElement getLiabilityPercentageTotal() {
    return getOrCreateProperty("LiabilityPercentageTotal", "LiabilityPercentageTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Strategy1Header getStrategy1Header() {
    return getOrCreateProperty("Strategy1Header", "Strategy1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSubrogationPartiesLV.Strategy1Header.class);
  }
  
  public SubroRecoveryPayee1Header getSubroRecoveryPayee1Header() {
    return getOrCreateProperty("SubroRecoveryPayee1Header", "SubroRecoveryPayee1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSubrogationPartiesLV.SubroRecoveryPayee1Header.class);
  }
  
  public SubrogationFinancialsLink getSubrogationFinancialsLink() {
    return getOrCreateProperty("SubrogationFinancialsLink", "SubrogationFinancialsLink", null, pcftest.EditableSubrogationPartiesLV.SubrogationFinancialsLink.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableSubrogationPartiesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public pcftest.EditableSubrogationPartiesLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableSubrogationPartiesLV._Select.class);
  }
  
  public pcftest.EditableSubrogationPartiesLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableSubrogationPartiesLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Classification1Header extends ValueElement {
    public Classification1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpectedRecoveryHeader extends ValueElement {
    public ExpectedRecoveryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LiabilityPercentage1Header extends ValueElement {
    public LiabilityPercentage1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Strategy1Header extends ValueElement {
    public Strategy1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroRecoveryPayee1Header extends ValueElement {
    public SubroRecoveryPayee1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationFinancialsLink extends ClickableActionElement {
    public SubrogationFinancialsLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SubrogationGeneral click() {
      return clickThis(pcftest.SubrogationGeneral.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Classification1 getClassification1() {
      return getOrCreateProperty("Classification1", "Classification1", null, pcftest.EditableSubrogationPartiesLV.entry.Classification1.class);
    }
    
    public ValueElement getExpectedRecovery() {
      return getOrCreateProperty("ExpectedRecovery", "ExpectedRecovery", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLiabilityPercentage1() {
      return getOrCreateProperty("LiabilityPercentage1", "LiabilityPercentage1", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PayeeLink getPayeeLink() {
      return getOrCreateProperty("PayeeLink", "PayeeLink", null, pcftest.EditableSubrogationPartiesLV.entry.PayeeLink.class);
    }
    
    public Strategy1 getStrategy1() {
      return getOrCreateProperty("Strategy1", "Strategy1", null, pcftest.EditableSubrogationPartiesLV.entry.Strategy1.class);
    }
    
    public ValueElement getSubroRecoveryPayee1() {
      return getOrCreateProperty("SubroRecoveryPayee1", "SubroRecoveryPayee1", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.EditableSubrogationPartiesLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableSubrogationPartiesLV.entry._Select.class);
    }
    
    public pcftest.EditableSubrogationPartiesLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableSubrogationPartiesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeLink extends ClickableActionElement {
      public PayeeLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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