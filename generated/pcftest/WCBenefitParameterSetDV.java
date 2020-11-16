package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.WCBenefitParameterSetDV.Factors;
import pcftest.WCBenefitParameterSetDV.Factors.WCBenefitFactorsLV_tb;
import pcftest.WCBenefitParameterSetDV.Factors.WCBenefitFactorsLV_tb.Add;
import pcftest.WCBenefitParameterSetDV.Factors.WCBenefitFactorsLV_tb.Remove;
import pcftest.WCBenefitParameterSetDV.General;
import pcftest.WCBenefitParameterSetDV.PPD;
import pcftest.WCBenefitParameterSetDV.PTD;
import pcftest.WCBenefitParameterSetDV.TPD;
import pcftest.WCBenefitParameterSetDV.TTD;
import pcftest.WCBenefitParameterSetDV.WaitingPeriod;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitParameterSetDV extends DetailViewElement {
  public final static String CHECKSUM = "97a2b6f995bcb3491ecfd8a3518f7d40";
  
  public WCBenefitParameterSetDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getEndDate() {
    return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Factors getFactors() {
    return getOrCreateProperty("Factors", "Factors", null, pcftest.WCBenefitParameterSetDV.Factors.class);
  }
  
  public General getGeneral() {
    return getOrCreateProperty("General", "General", null, pcftest.WCBenefitParameterSetDV.General.class);
  }
  
  public pcftest.WCBenefitParameterSetDV.Jurisdiction getJurisdiction() {
    return getOrCreateProperty("Jurisdiction", "Jurisdiction", null, pcftest.WCBenefitParameterSetDV.Jurisdiction.class);
  }
  
  public PPD getPPD() {
    return getOrCreateProperty("PPD", "PPD", null, pcftest.WCBenefitParameterSetDV.PPD.class);
  }
  
  public ValueElement getPPDMax() {
    return getOrCreateProperty("PPDMax", "PPDMax", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPDMin() {
    return getOrCreateProperty("PPDMin", "PPDMin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getPPDMinAdjToAWW() {
    return getOrCreateProperty("PPDMinAdjToAWW", "PPDMinAdjToAWW", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getPPDPercentOfWages() {
    return getOrCreateProperty("PPDPercentOfWages", "PPDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PTD getPTD() {
    return getOrCreateProperty("PTD", "PTD", null, pcftest.WCBenefitParameterSetDV.PTD.class);
  }
  
  public ValueElement getPTDMin() {
    return getOrCreateProperty("PTDMin", "PTDMin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getPTDMinAdjToAWW() {
    return getOrCreateProperty("PTDMinAdjToAWW", "PTDMinAdjToAWW", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getPTDPercentOfWages() {
    return getOrCreateProperty("PTDPercentOfWages", "PTDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRateCommentsw() {
    return getOrCreateProperty("RateCommentsw", "RateCommentsw", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRetroactivePeriod() {
    return getOrCreateProperty("RetroactivePeriod", "RetroactivePeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getStartDate() {
    return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public TPD getTPD() {
    return getOrCreateProperty("TPD", "TPD", null, pcftest.WCBenefitParameterSetDV.TPD.class);
  }
  
  public ValueElement getTPDMax() {
    return getOrCreateProperty("TPDMax", "TPDMax", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPDMin() {
    return getOrCreateProperty("TPDMin", "TPDMin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getTPDMinAdjToAWW() {
    return getOrCreateProperty("TPDMinAdjToAWW", "TPDMinAdjToAWW", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getTPDPercentOfWages() {
    return getOrCreateProperty("TPDPercentOfWages", "TPDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPTDMax() {
    return getOrCreateProperty("TPTDMax", "TPTDMax", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TTD getTTD() {
    return getOrCreateProperty("TTD", "TTD", null, pcftest.WCBenefitParameterSetDV.TTD.class);
  }
  
  public ValueElement getTTDMax() {
    return getOrCreateProperty("TTDMax", "TTDMax", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTDMin() {
    return getOrCreateProperty("TTDMin", "TTDMin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getTTDMinAdjToAWW() {
    return getOrCreateProperty("TTDMinAdjToAWW", "TTDMinAdjToAWW", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getTTDPercentOfWages() {
    return getOrCreateProperty("TTDPercentOfWages", "TTDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getWPNotAppliedToPPD() {
    return getOrCreateProperty("WPNotAppliedToPPD", "WPNotAppliedToPPD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getWPNotAppliedToPTD() {
    return getOrCreateProperty("WPNotAppliedToPTD", "WPNotAppliedToPTD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public WaitingPeriod getWaitingPeriod() {
    return getOrCreateProperty("WaitingPeriod", "WaitingPeriod", null, pcftest.WCBenefitParameterSetDV.WaitingPeriod.class);
  }
  
  public ValueElement getWaitingPeriodDays() {
    return getOrCreateProperty("WaitingPeriodDays", "WaitingPeriodDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Factors extends PCFElement {
    public Factors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCBenefitFactorsLV getWCBenefitFactorsLV() {
      return getOrCreateProperty("WCBenefitFactorsLV", "WCBenefitFactorsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WCBenefitFactorsLV.class);
    }
    
    public WCBenefitFactorsLV_tb getWCBenefitFactorsLV_tb() {
      return getOrCreateProperty("WCBenefitFactorsLV_tb", "WCBenefitFactorsLV_tb", null, pcftest.WCBenefitParameterSetDV.Factors.WCBenefitFactorsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WCBenefitFactorsLV_tb extends PCFElement {
      public WCBenefitFactorsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WCBenefitParameterSetDV.Factors.WCBenefitFactorsLV_tb.Add.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WCBenefitParameterSetDV.Factors.WCBenefitFactorsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class General extends ValueElement {
    public General(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Jurisdiction extends SelectElement {
    public Jurisdiction(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PPD extends ValueElement {
    public PPD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PTD extends ValueElement {
    public PTD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TPD extends ValueElement {
    public TPD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TTD extends ValueElement {
    public TTD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaitingPeriod extends ValueElement {
    public WaitingPeriod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}