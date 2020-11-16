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
import pcftest.DocumentNoteDV.Topic;
import typekey.NoteTopicType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/DocumentNoteDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentNoteDV extends DetailViewElement {
  public final static String CHECKSUM = "44e4e80cbbcf22aa7df696afaaf7325f";
  
  public DocumentNoteDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBody() {
    return getOrCreateProperty("Body", "Body", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getConfidential() {
    return getOrCreateProperty("Confidential", "Confidential", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getSubject() {
    return getOrCreateProperty("Subject", "Subject", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Topic getTopic() {
    return getOrCreateProperty("Topic", "Topic", null, pcftest.DocumentNoteDV.Topic.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/DocumentNoteDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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