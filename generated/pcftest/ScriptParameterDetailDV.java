package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ScriptParameterDetailDV.GroupValue;
import pcftest.ScriptParameterDetailDV.GroupValue.GroupPickerMenuIcon;
import pcftest.ScriptParameterDetailDV.GroupValue.GroupSearchMenuIcon;
import pcftest.ScriptParameterDetailDV.Type;
import pcftest.ScriptParameterDetailDV.UserValue;
import pcftest.ScriptParameterDetailDV.UserValue.UserValueUserSearchMenuItem;
import pcftest.ScriptParameterDetailDV.UserValue.UserValueUserSelectMenuItem;
import typekey.ScriptParameterType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParameterDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ScriptParameterDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "7998416e0e7d5c3bd829a054739c374e";
  
  public ScriptParameterDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getBitValue() {
    return getOrCreateProperty("BitValue", "BitValue", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getDatetimeValue() {
    return getOrCreateProperty("DatetimeValue", "DatetimeValue", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDecimalValue() {
    return getOrCreateProperty("DecimalValue", "DecimalValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public GroupValue getGroupValue() {
    return getOrCreateProperty("GroupValue", "GroupValue", null, pcftest.ScriptParameterDetailDV.GroupValue.class);
  }
  
  public ValueElement getIntegerValue() {
    return getOrCreateProperty("IntegerValue", "IntegerValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMoneyValue() {
    return getOrCreateProperty("MoneyValue", "MoneyValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMonthlyfrequencyValue() {
    return getOrCreateProperty("MonthlyfrequencyValue", "MonthlyfrequencyValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNonnegativeintegerValue() {
    return getOrCreateProperty("NonnegativeintegerValue", "NonnegativeintegerValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNonnegativemoneyValue() {
    return getOrCreateProperty("NonnegativemoneyValue", "NonnegativemoneyValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPercentageValue() {
    return getOrCreateProperty("PercentageValue", "PercentageValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPercentagedecValue() {
    return getOrCreateProperty("PercentagedecValue", "PercentagedecValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPhoneValue() {
    return getOrCreateProperty("PhoneValue", "PhoneValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPositiveintegerValue() {
    return getOrCreateProperty("PositiveintegerValue", "PositiveintegerValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPositivemoneyValue() {
    return getOrCreateProperty("PositivemoneyValue", "PositivemoneyValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPostalCodeValue() {
    return getOrCreateProperty("PostalCodeValue", "PostalCodeValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRiskValue() {
    return getOrCreateProperty("RiskValue", "RiskValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSpeedValue() {
    return getOrCreateProperty("SpeedValue", "SpeedValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.ScriptParameterDetailDV.Type.class);
  }
  
  public UserValue getUserValue() {
    return getOrCreateProperty("UserValue", "UserValue", null, pcftest.ScriptParameterDetailDV.UserValue.class);
  }
  
  public ValueElement getVarcharValue() {
    return getOrCreateProperty("VarcharValue", "VarcharValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWeeklyfrequencyValue() {
    return getOrCreateProperty("WeeklyfrequencyValue", "WeeklyfrequencyValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getYearValue() {
    return getOrCreateProperty("YearValue", "YearValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupValue extends SelectElement {
    public GroupValue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.ScriptParameterDetailDV.GroupValue.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.ScriptParameterDetailDV.GroupValue.GroupSearchMenuIcon.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupPickerMenuIcon extends ClickableActionElement {
      public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OrganizationGroupTreePopup click() {
        return clickThis(pcftest.OrganizationGroupTreePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupSearchMenuIcon extends ClickableActionElement {
      public GroupSearchMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupSearchPopup click() {
        return clickThis(pcftest.GroupSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/scriptparameters/ScriptParameterDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ScriptParameterType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ScriptParameterType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ScriptParameterType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ScriptParameterType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserValue extends SelectElement {
    public UserValue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserValueUserSearchMenuItem getUserValueUserSearchMenuItem() {
      return getOrCreateProperty("UserValueUserSearchMenuItem", "UserValueUserSearchMenuItem", null, pcftest.ScriptParameterDetailDV.UserValue.UserValueUserSearchMenuItem.class);
    }
    
    public UserValueUserSelectMenuItem getUserValueUserSelectMenuItem() {
      return getOrCreateProperty("UserValueUserSelectMenuItem", "UserValueUserSelectMenuItem", null, pcftest.ScriptParameterDetailDV.UserValue.UserValueUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserValueUserSearchMenuItem extends ClickableActionElement {
      public UserValueUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserValueUserSelectMenuItem extends ClickableActionElement {
      public UserValueUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  
}