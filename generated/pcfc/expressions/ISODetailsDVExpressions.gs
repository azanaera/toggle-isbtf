package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/exposures/iso/ISODetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ISODetailsDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/exposures/iso/ISODetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISODetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ISODetailsDV.pcf: line 51, column 27
    function def_onEnter_25 (def :  pcf.ISOMatchReportsLV) : void {
      def.onEnter(ISOReportable)
    }
    
    // 'def' attribute on ListViewInput at ISODetailsDV.pcf: line 51, column 27
    function def_refreshVariables_26 (def :  pcf.ISOMatchReportsLV) : void {
      def.refreshVariables(ISOReportable)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status_Input) at ISODetailsDV.pcf: line 22, column 40
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ISOReportable.ISOStatus = (__VALUE_TO_SET as typekey.ISOStatus)
    }
    
    // 'value' attribute on BooleanRadioInput (id=KnownToISO_Input) at ISODetailsDV.pcf: line 46, column 43
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      ISOReportable.ISOKnown = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Status_Input) at ISODetailsDV.pcf: line 22, column 40
    function editable_0 () : java.lang.Boolean {
      return perm.System.integadmin
    }
    
    // 'value' attribute on TypeKeyInput (id=Status_Input) at ISODetailsDV.pcf: line 22, column 40
    function valueRoot_3 () : java.lang.Object {
      return ISOReportable
    }
    
    // 'value' attribute on TypeKeyInput (id=Status_Input) at ISODetailsDV.pcf: line 22, column 40
    function value_1 () : typekey.ISOStatus {
      return ISOReportable.ISOStatus
    }
    
    // 'value' attribute on TextAreaInput (id=ISOErrorMessage_Input) at ISODetailsDV.pcf: line 40, column 78
    function value_13 () : java.lang.String {
      return ISOReportable.ISOErrorMessage
    }
    
    // 'value' attribute on BooleanRadioInput (id=KnownToISO_Input) at ISODetailsDV.pcf: line 46, column 43
    function value_19 () : java.lang.Boolean {
      return ISOReportable.ISOKnown
    }
    
    // 'value' attribute on DateInput (id=SendDate_Input) at ISODetailsDV.pcf: line 28, column 44
    function value_6 () : java.util.Date {
      return ISOReportable.ISOSendDate
    }
    
    // 'value' attribute on DateInput (id=ReceiveDate_Input) at ISODetailsDV.pcf: line 34, column 47
    function value_9 () : java.util.Date {
      return ISOReportable.ISOReceiveDate
    }
    
    // 'visible' attribute on TextAreaInput (id=ISOErrorMessage_Input) at ISODetailsDV.pcf: line 40, column 78
    function visible_12 () : java.lang.Boolean {
      return            ISOReportable.ISOErrorMessage != null         
    }
    
    property get ISOReportable () : ISOReportable {
      return getRequireValue("ISOReportable", 0) as ISOReportable
    }
    
    property set ISOReportable ($arg :  ISOReportable) {
      setRequireValue("ISOReportable", 0, $arg)
    }
    
    
  }
  
  
}