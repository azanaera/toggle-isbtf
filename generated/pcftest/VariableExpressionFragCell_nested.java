package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VariableExpressionFragCell_nested.DisplayText;
import pcftest.VariableExpressionFragCell_nested.PopupLink;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/VariableExpressionFragCell.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VariableExpressionFragCell_nested extends VariableExpressionFragCell {
  public final static String CHECKSUM = "3144d6559bda59529152f5757e764bab";
  
  public VariableExpressionFragCell_nested(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DisplayText getDisplayText() {
    return getOrCreateProperty("DisplayText", "DisplayText", null, pcftest.VariableExpressionFragCell_nested.DisplayText.class);
  }
  
  public PopupLink getPopupLink() {
    return getOrCreateProperty("PopupLink", "PopupLink", null, pcftest.VariableExpressionFragCell_nested.PopupLink.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/VariableExpressionFragCell.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisplayText extends ValueElement {
    public DisplayText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleVariableBuilderExpressionMenuItemSet getRuleVariableBuilderExpressionMenuItemSet() {
      return getOrCreateProperty("RuleVariableBuilderExpressionMenuItemSet", "RuleVariableBuilderExpressionMenuItemSet", null, pcftest.RuleVariableBuilderExpressionMenuItemSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/VariableExpressionFragCell.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PopupLink extends ClickableActionElement {
    public PopupLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}