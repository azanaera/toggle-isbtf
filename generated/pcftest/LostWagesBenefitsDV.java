package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LostWagesBenefitsDV.ClaimParameters;
import pcftest.LostWagesBenefitsDV.EditableBenefitPeriodsLV_tb;
import pcftest.LostWagesBenefitsDV.EditableSettlementsLV_tb;
import pcftest.LostWagesBenefitsDV.OtherJurisdictionalFactors;
import pcftest.LostWagesBenefitsDV.OtherJurisdictionalFactors.WCBenefitFactorsLV_tb;
import pcftest.LostWagesBenefitsDV.PPD;
import pcftest.LostWagesBenefitsDV.PTD;
import pcftest.LostWagesBenefitsDV.TPD;
import pcftest.LostWagesBenefitsDV.TTD;
import pcftest.LostWagesBenefitsDV.WPInputSet;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LostWagesBenefitsDV extends DetailViewElement {
  public final static String CHECKSUM = "fe27c51b91acc35541662f7047459259";
  
  public LostWagesBenefitsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAWW() {
    return getOrCreateProperty("AWW", "AWW", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimParameters getClaimParameters() {
    return getOrCreateProperty("ClaimParameters", "ClaimParameters", null, pcftest.LostWagesBenefitsDV.ClaimParameters.class);
  }
  
  public ValueElement getDeath_MaxBurialRate() {
    return getOrCreateProperty("Death_MaxBurialRate", "Death_MaxBurialRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableBenefitPeriodsLV getEditableBenefitPeriodsLV() {
    return getOrCreateProperty("EditableBenefitPeriodsLV", "EditableBenefitPeriodsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBenefitPeriodsLV.class);
  }
  
  public EditableBenefitPeriodsLV_tb getEditableBenefitPeriodsLV_tb() {
    return getOrCreateProperty("EditableBenefitPeriodsLV_tb", "EditableBenefitPeriodsLV_tb", null, pcftest.LostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.class);
  }
  
  public EditableSettlementsLV getEditableSettlementsLV() {
    return getOrCreateProperty("EditableSettlementsLV", "EditableSettlementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableSettlementsLV.class);
  }
  
  public EditableSettlementsLV_tb getEditableSettlementsLV_tb() {
    return getOrCreateProperty("EditableSettlementsLV_tb", "EditableSettlementsLV_tb", null, pcftest.LostWagesBenefitsDV.EditableSettlementsLV_tb.class);
  }
  
  public pcftest.LostWagesBenefitsDV.Jurisdiction getJurisdiction() {
    return getOrCreateProperty("Jurisdiction", "Jurisdiction", null, pcftest.LostWagesBenefitsDV.Jurisdiction.class);
  }
  
  public OtherJurisdictionalFactors getOtherJurisdictionalFactors() {
    return getOrCreateProperty("OtherJurisdictionalFactors", "OtherJurisdictionalFactors", null, pcftest.LostWagesBenefitsDV.OtherJurisdictionalFactors.class);
  }
  
  public PPD getPPD() {
    return getOrCreateProperty("PPD", "PPD", null, pcftest.LostWagesBenefitsDV.PPD.class);
  }
  
  public PTD getPTD() {
    return getOrCreateProperty("PTD", "PTD", null, pcftest.LostWagesBenefitsDV.PTD.class);
  }
  
  public TPD getTPD() {
    return getOrCreateProperty("TPD", "TPD", null, pcftest.LostWagesBenefitsDV.TPD.class);
  }
  
  public TTD getTTD() {
    return getOrCreateProperty("TTD", "TTD", null, pcftest.LostWagesBenefitsDV.TTD.class);
  }
  
  public WPInputSet getWPInputSet() {
    return getOrCreateProperty("WPInputSet", "WPInputSet", null, pcftest.LostWagesBenefitsDV.WPInputSet.class);
  }
  
  public ValueElement getWageAmtPostInjury() {
    return getOrCreateProperty("WageAmtPostInjury", "WageAmtPostInjury", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimParameters extends ValueElement {
    public ClaimParameters(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBenefitPeriodsLV_tb extends PCFElement {
    public EditableBenefitPeriodsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Add.class);
    }
    
    public pcftest.LostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LostWagesBenefitsDV.EditableBenefitPeriodsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableSettlementsLV_tb extends PCFElement {
    public EditableSettlementsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LostWagesBenefitsDV.EditableSettlementsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LostWagesBenefitsDV.EditableSettlementsLV_tb.Add.class);
    }
    
    public pcftest.LostWagesBenefitsDV.EditableSettlementsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LostWagesBenefitsDV.EditableSettlementsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherJurisdictionalFactors extends PCFElement {
    public OtherJurisdictionalFactors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCBenefitFactorsLV getWCBenefitFactorsLV() {
      return getOrCreateProperty("WCBenefitFactorsLV", "WCBenefitFactorsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WCBenefitFactorsLV.class);
    }
    
    public WCBenefitFactorsLV_tb getWCBenefitFactorsLV_tb() {
      return getOrCreateProperty("WCBenefitFactorsLV_tb", "WCBenefitFactorsLV_tb", null, pcftest.LostWagesBenefitsDV.OtherJurisdictionalFactors.WCBenefitFactorsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WCBenefitFactorsLV_tb extends PCFElement {
      public WCBenefitFactorsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PPD extends PCFElement {
    public PPD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCBenefitPPDInputSet getWCBenefitPPDInputSet() {
      return getOrCreateProperty("WCBenefitPPDInputSet", "WCBenefitPPDInputSet", null, pcftest.WCBenefitPPDInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PTD extends PCFElement {
    public PTD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCBenefitPTDInputSet getWCBenefitPTDInputSet() {
      return getOrCreateProperty("WCBenefitPTDInputSet", "WCBenefitPTDInputSet", null, pcftest.WCBenefitPTDInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TPD extends PCFElement {
    public TPD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCBenefitTPDInputSet getWCBenefitTPDInputSet() {
      return getOrCreateProperty("WCBenefitTPDInputSet", "WCBenefitTPDInputSet", null, pcftest.WCBenefitTPDInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TTD extends PCFElement {
    public TTD(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCBenefitTTDInputSet getWCBenefitTTDInputSet() {
      return getOrCreateProperty("WCBenefitTTDInputSet", "WCBenefitTTDInputSet", null, pcftest.WCBenefitTTDInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WPInputSet extends PCFElement {
    public WPInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WaitingPeriodInputSet getWaitingPeriodInputSet() {
      return getOrCreateProperty("WaitingPeriodInputSet", "WaitingPeriodInputSet", null, pcftest.WaitingPeriodInputSet.class);
    }
    
    
  }
  
  
}