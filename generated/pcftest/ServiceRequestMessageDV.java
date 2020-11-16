package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ServiceRequestMessageDV.MessageType;
import typekey.ServiceRequestMessageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestMessageDV extends DetailViewElement {
  public final static String CHECKSUM = "9fb994e73bca3c4e6f9389561c4e1b6f";
  
  public ServiceRequestMessageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getMessageBody() {
    return getOrCreateProperty("MessageBody", "MessageBody", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMessageFrom() {
    return getOrCreateProperty("MessageFrom", "MessageFrom", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getMessageSendDate() {
    return getOrCreateProperty("MessageSendDate", "MessageSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public MessageType getMessageType() {
    return getOrCreateProperty("MessageType", "MessageType", null, pcftest.ServiceRequestMessageDV.MessageType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageType extends SelectElement {
    public MessageType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ServiceRequestMessageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ServiceRequestMessageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestMessageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ServiceRequestMessageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}