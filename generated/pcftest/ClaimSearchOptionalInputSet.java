package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MultiSelectElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch;
import pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch.ArchiveDateSearchDirectChoice_Choice;
import pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch.ArchiveDateSearchRangeChoice_Choice;
import pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch.ArchiveDateSearchRangeValue;
import pcftest.ClaimSearchOptionalInputSet.DateSearch;
import pcftest.ClaimSearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice;
import pcftest.ClaimSearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice;
import pcftest.ClaimSearchOptionalInputSet.DateSearch.DateSearchRangeValue;
import pcftest.ClaimSearchOptionalInputSet.FinancialCurrency;
import pcftest.ClaimSearchOptionalInputSet.LOB;
import pcftest.ClaimSearchOptionalInputSet.State;
import typekey.Currency;
import typekey.DateRangeChoiceType;
import typekey.Jurisdiction;
import typekey.LOBCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchOptionalInputSet extends PCFElement {
  public final static String CHECKSUM = "7f40cf1f736272c3068718cc3d5c343c";
  
  public ClaimSearchOptionalInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ArchiveDateSearch getArchiveDateSearch() {
    return getOrCreateProperty("ArchiveDateSearch", "ArchiveDateSearch", null, pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch.class);
  }
  
  public SelectElement getClaimStatus() {
    return getOrCreateProperty("ClaimStatus", "ClaimStatus", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public BooleanValueElement getCoverageInQuestion() {
    return getOrCreateProperty("CoverageInQuestion", "CoverageInQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateSearch getDateSearch() {
    return getOrCreateProperty("DateSearch", "DateSearch", null, pcftest.ClaimSearchOptionalInputSet.DateSearch.class);
  }
  
  public ValueElement getFinancialAmountEnd() {
    return getOrCreateProperty("FinancialAmountEnd", "FinancialAmountEnd", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialAmountEndLabel() {
    return getOrCreateProperty("FinancialAmountEndLabel", "FinancialAmountEndLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialAmountStart() {
    return getOrCreateProperty("FinancialAmountStart", "FinancialAmountStart", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialAmountStartLabel() {
    return getOrCreateProperty("FinancialAmountStartLabel", "FinancialAmountStartLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getFinancialChosenOption() {
    return getOrCreateProperty("FinancialChosenOption", "FinancialChosenOption", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public FinancialCurrency getFinancialCurrency() {
    return getOrCreateProperty("FinancialCurrency", "FinancialCurrency", null, pcftest.ClaimSearchOptionalInputSet.FinancialCurrency.class);
  }
  
  public ValueElement getFinancialCurrencyLabel() {
    return getOrCreateProperty("FinancialCurrencyLabel", "FinancialCurrencyLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialExpressionTypeLabel() {
    return getOrCreateProperty("FinancialExpressionTypeLabel", "FinancialExpressionTypeLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.ClaimSearchOptionalInputSet.FlaggedType getFlaggedType() {
    return getOrCreateProperty("FlaggedType", "FlaggedType", null, pcftest.ClaimSearchOptionalInputSet.FlaggedType.class);
  }
  
  public BooleanValueElement getIncidentReport() {
    return getOrCreateProperty("IncidentReport", "IncidentReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public MultiSelectElement getIndicatorSearch() {
    return getOrCreateProperty("IndicatorSearch", "IndicatorSearch", null, gw.smoketest.platform.web.MultiSelectElement.class);
  }
  
  public LOB getLOB() {
    return getOrCreateProperty("LOB", "LOB", null, pcftest.ClaimSearchOptionalInputSet.LOB.class);
  }
  
  public pcftest.ClaimSearchOptionalInputSet.LitigationStatus getLitigationStatus() {
    return getOrCreateProperty("LitigationStatus", "LitigationStatus", null, pcftest.ClaimSearchOptionalInputSet.LitigationStatus.class);
  }
  
  public pcftest.ClaimSearchOptionalInputSet.LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.ClaimSearchOptionalInputSet.LossType.class);
  }
  
  public BooleanValueElement getPendingAssignment() {
    return getOrCreateProperty("PendingAssignment", "PendingAssignment", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getReinsuranceReportable() {
    return getOrCreateProperty("ReinsuranceReportable", "ReinsuranceReportable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public State getState() {
    return getOrCreateProperty("State", "State", null, pcftest.ClaimSearchOptionalInputSet.State.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveDateSearch extends ValueElement {
    public ArchiveDateSearch(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getArchiveDateSearchChosenOption() {
      return getOrCreateProperty("ArchiveDateSearchChosenOption", "ArchiveDateSearchChosenOption", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ArchiveDateSearchDirectChoice_Choice getArchiveDateSearchDirectChoice_Choice() {
      return getOrCreateProperty("ArchiveDateSearchDirectChoice_Choice", "ArchiveDateSearchDirectChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch.ArchiveDateSearchDirectChoice_Choice.class);
    }
    
    public DateElement getArchiveDateSearchEndDate() {
      return getOrCreateProperty("ArchiveDateSearchEndDate", "ArchiveDateSearchEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ArchiveDateSearchRangeChoice_Choice getArchiveDateSearchRangeChoice_Choice() {
      return getOrCreateProperty("ArchiveDateSearchRangeChoice_Choice", "ArchiveDateSearchRangeChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch.ArchiveDateSearchRangeChoice_Choice.class);
    }
    
    public ArchiveDateSearchRangeValue getArchiveDateSearchRangeValue() {
      return getOrCreateProperty("ArchiveDateSearchRangeValue", "ArchiveDateSearchRangeValue", null, pcftest.ClaimSearchOptionalInputSet.ArchiveDateSearch.ArchiveDateSearchRangeValue.class);
    }
    
    public DateElement getArchiveDateSearchStartDate() {
      return getOrCreateProperty("ArchiveDateSearchStartDate", "ArchiveDateSearchStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveDateSearchDirectChoice_Choice extends RadioButtonValueElement {
      public ArchiveDateSearchDirectChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveDateSearchRangeChoice_Choice extends RadioButtonValueElement {
      public ArchiveDateSearchRangeChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveDateSearchRangeValue extends SelectElement {
      public ArchiveDateSearchRangeValue(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DateRangeChoiceType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DateRangeChoiceType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DateRangeChoiceType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DateRangeChoiceType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateSearch extends ValueElement {
    public DateSearch(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getDateSearchChosenOption() {
      return getOrCreateProperty("DateSearchChosenOption", "DateSearchChosenOption", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateSearchDirectChoice_Choice getDateSearchDirectChoice_Choice() {
      return getOrCreateProperty("DateSearchDirectChoice_Choice", "DateSearchDirectChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimSearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice.class);
    }
    
    public DateElement getDateSearchEndDate() {
      return getOrCreateProperty("DateSearchEndDate", "DateSearchEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateSearchRangeChoice_Choice getDateSearchRangeChoice_Choice() {
      return getOrCreateProperty("DateSearchRangeChoice_Choice", "DateSearchRangeChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ClaimSearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice.class);
    }
    
    public DateSearchRangeValue getDateSearchRangeValue() {
      return getOrCreateProperty("DateSearchRangeValue", "DateSearchRangeValue", null, pcftest.ClaimSearchOptionalInputSet.DateSearch.DateSearchRangeValue.class);
    }
    
    public DateElement getDateSearchStartDate() {
      return getOrCreateProperty("DateSearchStartDate", "DateSearchStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchDirectChoice_Choice extends RadioButtonValueElement {
      public DateSearchDirectChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchRangeChoice_Choice extends RadioButtonValueElement {
      public DateSearchRangeChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchRangeValue extends SelectElement {
      public DateSearchRangeValue(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DateRangeChoiceType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DateRangeChoiceType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DateRangeChoiceType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DateRangeChoiceType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/FinancialCriterionMultiCurrencyChoiceWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialCurrency extends SelectElement {
    public FinancialCurrency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FlaggedType extends SelectElement {
    public FlaggedType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.FlaggedType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.FlaggedType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FlaggedType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.FlaggedType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LOB extends SelectElement {
    public LOB(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LOBCode arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LOBCode getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LOBCode arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LitigationStatus extends SelectElement {
    public LitigationStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LitigationStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LitigationStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LitigationStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LitigationStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends SelectElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class State extends SelectElement {
    public State(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}