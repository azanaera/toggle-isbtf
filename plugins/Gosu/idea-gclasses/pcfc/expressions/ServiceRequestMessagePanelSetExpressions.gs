package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServiceRequestMessagePanelSetExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PanelIteratorEntryExpressionsImpl extends ServiceRequestMessagePanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ReplyMessage) at ServiceRequestMessagePanelSet.pcf: line 29, column 83
    function action_3 () : void {
      ServiceRequestMessagePopup.push(message.ServiceRequest, message.Title)
    }
    
    // 'action' attribute on ToolbarButton (id=ReplyMessage) at ServiceRequestMessagePanelSet.pcf: line 29, column 83
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ServiceRequestMessagePopup.createDestination(message.ServiceRequest, message.Title)
    }
    
    // 'def' attribute on PanelRef at ServiceRequestMessagePanelSet.pcf: line 20, column 48
    function def_onEnter_5 (def :  pcf.ServiceRequestMessageDV) : void {
      def.onEnter(message)
    }
    
    // 'def' attribute on PanelRef at ServiceRequestMessagePanelSet.pcf: line 20, column 48
    function def_refreshVariables_6 (def :  pcf.ServiceRequestMessageDV) : void {
      def.refreshVariables(message)
    }
    
    // 'icon' attribute on TitleBar at ServiceRequestMessagePanelSet.pcf: line 24, column 34
    function icon_2 () : java.lang.String {
      return message.SentFromPortal ? "service_request_inbound_message" : "service_request_outbound_message"
    }
    
    // 'title' attribute on TitleBar at ServiceRequestMessagePanelSet.pcf: line 24, column 34
    function title_1 () : java.lang.String {
      return message.Title
    }
    
    property get message () : entity.ServiceRequestMessage {
      return getIteratedValue(1) as entity.ServiceRequestMessage
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestMessagePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at ServiceRequestMessagePanelSet.pcf: line 18, column 24
    function sortBy_0 (message :  entity.ServiceRequestMessage) : java.lang.Object {
      return message.SendDate
    }
    
    // 'value' attribute on PanelIterator (id=MessageIterator) at ServiceRequestMessagePanelSet.pcf: line 14, column 50
    function value_7 () : entity.ServiceRequestMessage[] {
      return messages
    }
    
    property get messages () : ServiceRequestMessage[] {
      return getRequireValue("messages", 0) as ServiceRequestMessage[]
    }
    
    property set messages ($arg :  ServiceRequestMessage[]) {
      setRequireValue("messages", 0, $arg)
    }
    
    
  }
  
  
}