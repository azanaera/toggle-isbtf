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
import pcftest.AggregateLimitDetailDV.AggregateLimitCoveragesLV_tb;
import pcftest.AggregateLimitDetailDV.AggregateLimitCoveragesLV_tb.Add;
import pcftest.AggregateLimitDetailDV.AggregateLimitCoveragesLV_tb.Remove;
import pcftest.AggregateLimitDetailDV.AggregateLimit_ValueType;
import pcftest.AggregateLimitDetailDV.aggLimitCalcCriteria;
import pcftest.AggregateLimitDetailDV.agglimitsListView;
import pcftest.AggregateLimitDetailDV.agglimitsListView.AggregateLimitClaimsLV_tb;
import typekey.AggLimitCalcCriteria;
import typekey.AggregateType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "f5bc8e615ef428abfa9ac35828333831";
  
  public AggregateLimitDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AggregateLimitCoveragesLV getAggregateLimitCoveragesLV() {
    return getOrCreateProperty("AggregateLimitCoveragesLV", "AggregateLimitCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AggregateLimitCoveragesLV.class);
  }
  
  public AggregateLimitCoveragesLV_tb getAggregateLimitCoveragesLV_tb() {
    return getOrCreateProperty("AggregateLimitCoveragesLV_tb", "AggregateLimitCoveragesLV_tb", null, pcftest.AggregateLimitDetailDV.AggregateLimitCoveragesLV_tb.class);
  }
  
  public ValueElement getAggregateLimit_AmountRemaining() {
    return getOrCreateProperty("AggregateLimit_AmountRemaining", "AggregateLimit_AmountRemaining", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAggregateLimit_AmountUsed() {
    return getOrCreateProperty("AggregateLimit_AmountUsed", "AggregateLimit_AmountUsed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAggregateLimit_Comments() {
    return getOrCreateProperty("AggregateLimit_Comments", "AggregateLimit_Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAggregateLimit_LimitAmount() {
    return getOrCreateProperty("AggregateLimit_LimitAmount", "AggregateLimit_LimitAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getAggregateLimit_PolicyPeriodType() {
    return getOrCreateProperty("AggregateLimit_PolicyPeriodType", "AggregateLimit_PolicyPeriodType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public AggregateLimit_ValueType getAggregateLimit_ValueType() {
    return getOrCreateProperty("AggregateLimit_ValueType", "AggregateLimit_ValueType", null, pcftest.AggregateLimitDetailDV.AggregateLimit_ValueType.class);
  }
  
  public aggLimitCalcCriteria getaggLimitCalcCriteria() {
    return getOrCreateProperty("aggLimitCalcCriteria", "aggLimitCalcCriteria", null, pcftest.AggregateLimitDetailDV.aggLimitCalcCriteria.class);
  }
  
  public agglimitsListView getagglimitsListView() {
    return getOrCreateProperty("agglimitsListView", "agglimitsListView", null, pcftest.AggregateLimitDetailDV.agglimitsListView.class);
  }
  
  public ValueElement getlid() {
    return getOrCreateProperty("lid", "lid", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getlid1() {
    return getOrCreateProperty("lid1", "lid1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregateLimitCoveragesLV_tb extends PCFElement {
    public AggregateLimitCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AggregateLimitDetailDV.AggregateLimitCoveragesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AggregateLimitDetailDV.AggregateLimitCoveragesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregateLimit_ValueType extends SelectElement {
    public AggregateLimit_ValueType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AggregateType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AggregateType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AggregateType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AggregateType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class aggLimitCalcCriteria extends SelectElement {
    public aggLimitCalcCriteria(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AggLimitCalcCriteria arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AggLimitCalcCriteria getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AggLimitCalcCriteria.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AggLimitCalcCriteria arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class agglimitsListView extends PCFElement {
    public agglimitsListView(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AggregateLimitClaimsLV getAggregateLimitClaimsLV() {
      return getOrCreateProperty("AggregateLimitClaimsLV", "AggregateLimitClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AggregateLimitClaimsLV.class);
    }
    
    public AggregateLimitClaimsLV_tb getAggregateLimitClaimsLV_tb() {
      return getOrCreateProperty("AggregateLimitClaimsLV_tb", "AggregateLimitClaimsLV_tb", null, pcftest.AggregateLimitDetailDV.agglimitsListView.AggregateLimitClaimsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AggregateLimitClaimsLV_tb extends PCFElement {
      public AggregateLimitClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}