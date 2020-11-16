package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExpressionFragCell_nested.DisplayText;
import pcftest.ExpressionFragCell_nested.PopupLink;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExpressionFragCell.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExpressionFragCell_nested extends ExpressionFragCell {
  public final static String CHECKSUM = "efa5d28fdb930fc294d35d50e9cbf03a";
  
  public ExpressionFragCell_nested(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DisplayText getDisplayText() {
    return getOrCreateProperty("DisplayText", "DisplayText", null, pcftest.ExpressionFragCell_nested.DisplayText.class);
  }
  
  public PopupLink getPopupLink() {
    return getOrCreateProperty("PopupLink", "PopupLink", null, pcftest.ExpressionFragCell_nested.PopupLink.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExpressionFragCell.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisplayText extends ValueElement {
    public DisplayText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ConditionBuilderExpressionMenuItemSet getConditionBuilderExpressionMenuItemSet() {
      return getOrCreateProperty("ConditionBuilderExpressionMenuItemSet", "ConditionBuilderExpressionMenuItemSet", null, pcftest.ConditionBuilderExpressionMenuItemSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExpressionFragCell.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PopupLink extends ClickableActionElement {
    public PopupLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}