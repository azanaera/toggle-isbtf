package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonCommandParametersInputSet_createreserve.amount;
import pcftest.RuleComparisonCommandParametersInputSet_createreserve.comments;
import pcftest.RuleComparisonCommandParametersInputSet_createreserve.costcategory;
import pcftest.RuleComparisonCommandParametersInputSet_createreserve.costtype;
import pcftest.RuleComparisonCommandParametersInputSet_createreserve.currency;
import pcftest.RuleComparisonCommandParametersInputSet_createreserve.respectfinancialholds;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandParametersInputSet_createreserve extends RuleComparisonCommandParametersInputSet {
  public final static String CHECKSUM = "f9db50892e8725d2630a554d61368a3c";
  
  public RuleComparisonCommandParametersInputSet_createreserve(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public amount getamount() {
    return getOrCreateProperty("amount", "amount", null, pcftest.RuleComparisonCommandParametersInputSet_createreserve.amount.class);
  }
  
  public comments getcomments() {
    return getOrCreateProperty("comments", "comments", null, pcftest.RuleComparisonCommandParametersInputSet_createreserve.comments.class);
  }
  
  public costcategory getcostcategory() {
    return getOrCreateProperty("costcategory", "costcategory", null, pcftest.RuleComparisonCommandParametersInputSet_createreserve.costcategory.class);
  }
  
  public costtype getcosttype() {
    return getOrCreateProperty("costtype", "costtype", null, pcftest.RuleComparisonCommandParametersInputSet_createreserve.costtype.class);
  }
  
  public currency getcurrency() {
    return getOrCreateProperty("currency", "currency", null, pcftest.RuleComparisonCommandParametersInputSet_createreserve.currency.class);
  }
  
  public respectfinancialholds getrespectfinancialholds() {
    return getOrCreateProperty("respectfinancialholds", "respectfinancialholds", null, pcftest.RuleComparisonCommandParametersInputSet_createreserve.respectfinancialholds.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class amount extends PCFElement {
    public amount(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class comments extends PCFElement {
    public comments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class costcategory extends PCFElement {
    public costcategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class costtype extends PCFElement {
    public costtype(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class currency extends PCFElement {
    public currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class respectfinancialholds extends PCFElement {
    public respectfinancialholds(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  
}