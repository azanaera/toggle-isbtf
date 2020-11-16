package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewLostWagesBenefitsDV.EditableBenefitPeriodsLV_tb;
import pcftest.NewLostWagesBenefitsDV.EditableSettlementsLV_tb;
import pcftest.NewLostWagesBenefitsDV.PPD_PaymentFrequency;
import pcftest.NewLostWagesBenefitsDV.PTD_PaymentFrequency;
import pcftest.NewLostWagesBenefitsDV.TPD_PaymentFrequency;
import pcftest.NewLostWagesBenefitsDV.TTD_PaymentFrequency;
import pcftest.NewLostWagesBenefitsDV.TTD_RetroactivePeriod;
import typekey.PaymentFrequencyType;
import typekey.RetroPeriodType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewLostWagesBenefitsDV extends DetailViewElement {
  public final static String CHECKSUM = "5e3064fb80a16f6578be15b81380e9b4";
  
  public NewLostWagesBenefitsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDeath_MaxBurialRate() {
    return getOrCreateProperty("Death_MaxBurialRate", "Death_MaxBurialRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableBenefitPeriodsLV getEditableBenefitPeriodsLV() {
    return getOrCreateProperty("EditableBenefitPeriodsLV", "EditableBenefitPeriodsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBenefitPeriodsLV.class);
  }
  
  public EditableBenefitPeriodsLV_tb getEditableBenefitPeriodsLV_tb() {
    return getOrCreateProperty("EditableBenefitPeriodsLV_tb", "EditableBenefitPeriodsLV_tb", null, pcftest.NewLostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.class);
  }
  
  public EditableSettlementsLV getEditableSettlementsLV() {
    return getOrCreateProperty("EditableSettlementsLV", "EditableSettlementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableSettlementsLV.class);
  }
  
  public EditableSettlementsLV_tb getEditableSettlementsLV_tb() {
    return getOrCreateProperty("EditableSettlementsLV_tb", "EditableSettlementsLV_tb", null, pcftest.NewLostWagesBenefitsDV.EditableSettlementsLV_tb.class);
  }
  
  public DateElement getPPD_MMIDate() {
    return getOrCreateProperty("PPD_MMIDate", "PPD_MMIDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPPD_MaxStateCompRate() {
    return getOrCreateProperty("PPD_MaxStateCompRate", "PPD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPD_MinStateCompRate() {
    return getOrCreateProperty("PPD_MinStateCompRate", "PPD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PPD_PaymentFrequency getPPD_PaymentFrequency() {
    return getOrCreateProperty("PPD_PaymentFrequency", "PPD_PaymentFrequency", null, pcftest.NewLostWagesBenefitsDV.PPD_PaymentFrequency.class);
  }
  
  public DateElement getPTD_MMIDate() {
    return getOrCreateProperty("PTD_MMIDate", "PTD_MMIDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPTD_MaxStateCompRate() {
    return getOrCreateProperty("PTD_MaxStateCompRate", "PTD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPTD_MinStateCompRate() {
    return getOrCreateProperty("PTD_MinStateCompRate", "PTD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PTD_PaymentFrequency getPTD_PaymentFrequency() {
    return getOrCreateProperty("PTD_PaymentFrequency", "PTD_PaymentFrequency", null, pcftest.NewLostWagesBenefitsDV.PTD_PaymentFrequency.class);
  }
  
  public ValueElement getTPD_MaxStateCompRate() {
    return getOrCreateProperty("TPD_MaxStateCompRate", "TPD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPD_MinStateCompRate() {
    return getOrCreateProperty("TPD_MinStateCompRate", "TPD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TPD_PaymentFrequency getTPD_PaymentFrequency() {
    return getOrCreateProperty("TPD_PaymentFrequency", "TPD_PaymentFrequency", null, pcftest.NewLostWagesBenefitsDV.TPD_PaymentFrequency.class);
  }
  
  public ValueElement getTTD_MaxStateCompRate() {
    return getOrCreateProperty("TTD_MaxStateCompRate", "TTD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTD_MinStateCompRate() {
    return getOrCreateProperty("TTD_MinStateCompRate", "TTD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TTD_PaymentFrequency getTTD_PaymentFrequency() {
    return getOrCreateProperty("TTD_PaymentFrequency", "TTD_PaymentFrequency", null, pcftest.NewLostWagesBenefitsDV.TTD_PaymentFrequency.class);
  }
  
  public TTD_RetroactivePeriod getTTD_RetroactivePeriod() {
    return getOrCreateProperty("TTD_RetroactivePeriod", "TTD_RetroactivePeriod", null, pcftest.NewLostWagesBenefitsDV.TTD_RetroactivePeriod.class);
  }
  
  public DateElement getTTD_WaitingPeriodBegin() {
    return getOrCreateProperty("TTD_WaitingPeriodBegin", "TTD_WaitingPeriodBegin", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getTTD_WaitingPeriodEnd() {
    return getOrCreateProperty("TTD_WaitingPeriodEnd", "TTD_WaitingPeriodEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBenefitPeriodsLV_tb extends PCFElement {
    public EditableBenefitPeriodsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewLostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewLostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Add.class);
    }
    
    public pcftest.NewLostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewLostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableSettlementsLV_tb extends PCFElement {
    public EditableSettlementsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewLostWagesBenefitsDV.EditableSettlementsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewLostWagesBenefitsDV.EditableSettlementsLV_tb.Add.class);
    }
    
    public pcftest.NewLostWagesBenefitsDV.EditableSettlementsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewLostWagesBenefitsDV.EditableSettlementsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PPD_PaymentFrequency extends SelectElement {
    public PPD_PaymentFrequency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentFrequencyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentFrequencyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentFrequencyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentFrequencyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PTD_PaymentFrequency extends SelectElement {
    public PTD_PaymentFrequency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentFrequencyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentFrequencyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentFrequencyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentFrequencyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TPD_PaymentFrequency extends SelectElement {
    public TPD_PaymentFrequency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentFrequencyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentFrequencyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentFrequencyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentFrequencyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TTD_PaymentFrequency extends SelectElement {
    public TTD_PaymentFrequency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentFrequencyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentFrequencyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentFrequencyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentFrequencyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TTD_RetroactivePeriod extends SelectElement {
    public TTD_RetroactivePeriod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RetroPeriodType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RetroPeriodType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RetroPeriodType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RetroPeriodType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}