package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckRecurrenceDV.EditableRecurrenceChecksLV_tb;
import pcftest.CheckRecurrenceDV.EditableRecurrenceChecksLV_tb.Add;
import pcftest.CheckRecurrenceDV.EditableRecurrenceChecksLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/CheckRecurrenceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceDV extends DetailViewElement {
  public final static String CHECKSUM = "e74da1cd694565ecbb025abfae721883";
  
  public CheckRecurrenceDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableRecurrenceChecksLV getEditableRecurrenceChecksLV() {
    return getOrCreateProperty("EditableRecurrenceChecksLV", "EditableRecurrenceChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRecurrenceChecksLV.class);
  }
  
  public EditableRecurrenceChecksLV_tb getEditableRecurrenceChecksLV_tb() {
    return getOrCreateProperty("EditableRecurrenceChecksLV_tb", "EditableRecurrenceChecksLV_tb", null, pcftest.CheckRecurrenceDV.EditableRecurrenceChecksLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/CheckRecurrenceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecurrenceChecksLV_tb extends PCFElement {
    public EditableRecurrenceChecksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.CheckRecurrenceDV.EditableRecurrenceChecksLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.CheckRecurrenceDV.EditableRecurrenceChecksLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/CheckRecurrenceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/CheckRecurrenceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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