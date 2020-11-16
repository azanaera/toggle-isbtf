package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WaitingPeriodInputSet.WaitingPeriod;
import pcftest.WaitingPeriodInputSet.WaitingPeriodDetail;
import pcftest.WaitingPeriodInputSet.WaitingPeriodDetail.EditableWaitingPeriodsLV_tb;
import pcftest.WaitingPeriodInputSet.WaitingPeriodDetail.EditableWaitingPeriodsLV_tb.Add;
import pcftest.WaitingPeriodInputSet.WaitingPeriodDetail.EditableWaitingPeriodsLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WaitingPeriodInputSet extends PCFElement {
  public final static String CHECKSUM = "75621156caa9d9e7e88e41a69641bab7";
  
  public WaitingPeriodInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getTTD_RetroactivePeriod() {
    return getOrCreateProperty("TTD_RetroactivePeriod", "TTD_RetroactivePeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getWCDoesnotApplytoPPD() {
    return getOrCreateProperty("WCDoesnotApplytoPPD", "WCDoesnotApplytoPPD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getWCDoesnotApplytoPTD() {
    return getOrCreateProperty("WCDoesnotApplytoPTD", "WCDoesnotApplytoPTD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public WaitingPeriod getWaitingPeriod() {
    return getOrCreateProperty("WaitingPeriod", "WaitingPeriod", null, pcftest.WaitingPeriodInputSet.WaitingPeriod.class);
  }
  
  public BooleanValueElement getWaitingPeriodApplied() {
    return getOrCreateProperty("WaitingPeriodApplied", "WaitingPeriodApplied", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getWaitingPeriodDays() {
    return getOrCreateProperty("WaitingPeriodDays", "WaitingPeriodDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public WaitingPeriodDetail getWaitingPeriodDetail() {
    return getOrCreateProperty("WaitingPeriodDetail", "WaitingPeriodDetail", null, pcftest.WaitingPeriodInputSet.WaitingPeriodDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaitingPeriod extends ValueElement {
    public WaitingPeriod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaitingPeriodDetail extends PCFElement {
    public WaitingPeriodDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableWaitingPeriodsLV getEditableWaitingPeriodsLV() {
      return getOrCreateProperty("EditableWaitingPeriodsLV", "EditableWaitingPeriodsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWaitingPeriodsLV.class);
    }
    
    public EditableWaitingPeriodsLV_tb getEditableWaitingPeriodsLV_tb() {
      return getOrCreateProperty("EditableWaitingPeriodsLV_tb", "EditableWaitingPeriodsLV_tb", null, pcftest.WaitingPeriodInputSet.WaitingPeriodDetail.EditableWaitingPeriodsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableWaitingPeriodsLV_tb extends PCFElement {
      public EditableWaitingPeriodsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WaitingPeriodInputSet.WaitingPeriodDetail.EditableWaitingPeriodsLV_tb.Add.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WaitingPeriodInputSet.WaitingPeriodDetail.EditableWaitingPeriodsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}