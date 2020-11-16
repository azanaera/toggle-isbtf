package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssigneeAdditionalInfoInputSet_queue.QueuePicker;
import pcftest.AssigneeAdditionalInfoInputSet_queue.QueuePicker.SelectQueuePicker;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.queue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssigneeAdditionalInfoInputSet_queue extends AssigneeAdditionalInfoInputSet {
  public final static String CHECKSUM = "17dbbd8d914b1d85718d8f4a80fad83c";
  
  public AssigneeAdditionalInfoInputSet_queue(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public QueuePicker getQueuePicker() {
    return getOrCreateProperty("QueuePicker", "QueuePicker", null, pcftest.AssigneeAdditionalInfoInputSet_queue.QueuePicker.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.queue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QueuePicker extends BasePickerValueElement {
    public QueuePicker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectQueuePicker getSelectQueuePicker() {
      return getOrCreateProperty("SelectQueuePicker", "SelectQueuePicker", null, pcftest.AssigneeAdditionalInfoInputSet_queue.QueuePicker.SelectQueuePicker.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.queue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectQueuePicker extends ClickableActionElement {
      public SelectQueuePicker(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  
}