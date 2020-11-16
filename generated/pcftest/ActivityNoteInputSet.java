package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityNoteInputSet.SecurityType;
import pcftest.ActivityNoteInputSet.Topic;
import typekey.NoteSecurityType;
import typekey.NoteTopicType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityNoteInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityNoteInputSet extends PCFElement {
  public final static String CHECKSUM = "121bb8e664b22cd407afa4eed787384d";
  
  public ActivityNoteInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getConfidential() {
    return getOrCreateProperty("Confidential", "Confidential", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SecurityType getSecurityType() {
    return getOrCreateProperty("SecurityType", "SecurityType", null, pcftest.ActivityNoteInputSet.SecurityType.class);
  }
  
  public ValueElement getSubject() {
    return getOrCreateProperty("Subject", "Subject", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getText() {
    return getOrCreateProperty("Text", "Text", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Topic getTopic() {
    return getOrCreateProperty("Topic", "Topic", null, pcftest.ActivityNoteInputSet.Topic.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityNoteInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityType extends SelectElement {
    public SecurityType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(NoteSecurityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public NoteSecurityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NoteSecurityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(NoteSecurityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityNoteInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Topic extends SelectElement {
    public Topic(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(NoteTopicType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public NoteTopicType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NoteTopicType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(NoteTopicType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}