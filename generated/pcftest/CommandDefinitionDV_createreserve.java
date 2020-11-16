package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandDefinitionDV_createreserve.Amount;
import pcftest.CommandDefinitionDV_createreserve.Comments;
import pcftest.CommandDefinitionDV_createreserve.Currency;
import pcftest.CommandDefinitionDV_createreserve.RespectFinancialHolds;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandDefinitionDV_createreserve extends CommandDefinitionDV {
  public final static String CHECKSUM = "e71a29e994882b147ed7890673b4aae3";
  
  public CommandDefinitionDV_createreserve(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Amount getAmount() {
    return getOrCreateProperty("Amount", "Amount", null, pcftest.CommandDefinitionDV_createreserve.Amount.class);
  }
  
  public Comments getComments() {
    return getOrCreateProperty("Comments", "Comments", null, pcftest.CommandDefinitionDV_createreserve.Comments.class);
  }
  
  public SelectElement getCostCategory() {
    return getOrCreateProperty("CostCategory", "CostCategory", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public pcftest.CommandDefinitionDV_createreserve.CostType getCostType() {
    return getOrCreateProperty("CostType", "CostType", null, pcftest.CommandDefinitionDV_createreserve.CostType.class);
  }
  
  public Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.CommandDefinitionDV_createreserve.Currency.class);
  }
  
  public RespectFinancialHolds getRespectFinancialHolds() {
    return getOrCreateProperty("RespectFinancialHolds", "RespectFinancialHolds", null, pcftest.CommandDefinitionDV_createreserve.RespectFinancialHolds.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Amount extends PCFElement {
    public Amount(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Comments extends PCFElement {
    public Comments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostType extends SelectElement {
    public CostType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CostType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CostType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CostType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends PCFElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.createreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RespectFinancialHolds extends PCFElement {
    public RespectFinancialHolds(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  
}