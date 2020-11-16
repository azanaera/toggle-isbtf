package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandParameterInputSet_nested.Bar;
import pcftest.CommandParameterInputSet_nested.Label;
import pcftest.CommandParameterInputSet_nested.NestedText;
import pcftest.CommandParameterInputSet_nested.PopupLink;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterInputSet_nested extends CommandParameterInputSet {
  public final static String CHECKSUM = "eb453ba1680d7172c06a8f1350d926e4";
  
  public CommandParameterInputSet_nested(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Bar getBar() {
    return getOrCreateProperty("Bar", "Bar", null, pcftest.CommandParameterInputSet_nested.Bar.class);
  }
  
  public Label getLabel() {
    return getOrCreateProperty("Label", "Label", null, pcftest.CommandParameterInputSet_nested.Label.class);
  }
  
  public NestedText getNestedText() {
    return getOrCreateProperty("NestedText", "NestedText", null, pcftest.CommandParameterInputSet_nested.NestedText.class);
  }
  
  public PopupLink getPopupLink() {
    return getOrCreateProperty("PopupLink", "PopupLink", null, pcftest.CommandParameterInputSet_nested.PopupLink.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Bar extends ClickableActionElement {
    public Bar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Label extends ClickableActionElement {
    public Label(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NestedText extends ValueElement {
    public NestedText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommandParameterMenuItemSet getCommandParameterMenuItemSet() {
      return getOrCreateProperty("CommandParameterMenuItemSet", "CommandParameterMenuItemSet", null, pcftest.CommandParameterMenuItemSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.nested.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PopupLink extends ClickableActionElement {
    public PopupLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}