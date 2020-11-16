package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NoteDetailDV.SecurityType;
import pcftest.NoteDetailDV.Topic;
import typekey.NoteSecurityType;
import typekey.NoteTopicType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/notes/NoteDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NoteDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "a1bec28f2d89beafb83a67119942d877";
  
  public NoteDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBody() {
    return getOrCreateProperty("Body", "Body", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getConfidential() {
    return getOrCreateProperty("Confidential", "Confidential", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getNoteBody() {
    return getOrCreateProperty("NoteBody", "NoteBody", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SecurityType getSecurityType() {
    return getOrCreateProperty("SecurityType", "SecurityType", null, pcftest.NoteDetailDV.SecurityType.class);
  }
  
  public ValueElement getSubject() {
    return getOrCreateProperty("Subject", "Subject", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Topic getTopic() {
    return getOrCreateProperty("Topic", "Topic", null, pcftest.NoteDetailDV.Topic.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/NoteDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/notes/NoteDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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