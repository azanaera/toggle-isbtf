package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentTemplateSearchDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentTemplateSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateSearchDV.pcf: line 65, column 41
    function def_onEnter_37 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateSearchDV.pcf: line 65, column 41
    function def_refreshVariables_38 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TypeKeyInput (id=TemplateType_Input) at DocumentTemplateSearchDV.pcf: line 17, column 43
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.Type = (__VALUE_TO_SET as typekey.DocumentType)
    }
    
    // 'value' attribute on TextInput (id=Keywords_Input) at DocumentTemplateSearchDV.pcf: line 35, column 53
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.Keywords = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate_Input) at DocumentTemplateSearchDV.pcf: line 42, column 58
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.effectivedate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Section_Input) at DocumentTemplateSearchDV.pcf: line 49, column 70
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.Section = (__VALUE_TO_SET as typekey.DocumentSection)
    }
    
    // 'value' attribute on TextInput (id=Identifier_Input) at DocumentTemplateSearchDV.pcf: line 54, column 55
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.Identifier = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Language_Input) at DocumentTemplateSearchDV.pcf: line 61, column 67
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.Language = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType_Input) at DocumentTemplateSearchDV.pcf: line 23, column 38
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.Lob = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState_Input) at DocumentTemplateSearchDV.pcf: line 30, column 43
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocTemplateSearchCriteria.State = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState_Input) at DocumentTemplateSearchDV.pcf: line 30, column 43
    function filter_11 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'value' attribute on TypeKeyInput (id=TemplateType_Input) at DocumentTemplateSearchDV.pcf: line 17, column 43
    function valueRoot_2 () : java.lang.Object {
      return DocTemplateSearchCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=TemplateType_Input) at DocumentTemplateSearchDV.pcf: line 17, column 43
    function value_0 () : typekey.DocumentType {
      return DocTemplateSearchCriteria.Type
    }
    
    // 'value' attribute on TextInput (id=Keywords_Input) at DocumentTemplateSearchDV.pcf: line 35, column 53
    function value_13 () : java.lang.String {
      return DocTemplateSearchCriteria.Keywords
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate_Input) at DocumentTemplateSearchDV.pcf: line 42, column 58
    function value_17 () : java.util.Date {
      return DocTemplateSearchCriteria.effectivedate
    }
    
    // 'value' attribute on TypeKeyInput (id=Section_Input) at DocumentTemplateSearchDV.pcf: line 49, column 70
    function value_22 () : typekey.DocumentSection {
      return DocTemplateSearchCriteria.Section
    }
    
    // 'value' attribute on TextInput (id=Identifier_Input) at DocumentTemplateSearchDV.pcf: line 54, column 55
    function value_27 () : java.lang.String {
      return DocTemplateSearchCriteria.Identifier
    }
    
    // 'value' attribute on TypeKeyInput (id=Language_Input) at DocumentTemplateSearchDV.pcf: line 61, column 67
    function value_32 () : typekey.LanguageType {
      return DocTemplateSearchCriteria.Language
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType_Input) at DocumentTemplateSearchDV.pcf: line 23, column 38
    function value_4 () : typekey.LOBCode {
      return DocTemplateSearchCriteria.Lob
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState_Input) at DocumentTemplateSearchDV.pcf: line 30, column 43
    function value_8 () : typekey.Jurisdiction {
      return DocTemplateSearchCriteria.State
    }
    
    // 'visible' attribute on TypeKeyInput (id=Section_Input) at DocumentTemplateSearchDV.pcf: line 49, column 70
    function visible_21 () : java.lang.Boolean {
      return DocumentSection.getTypeKeys( false ).Count > 1
    }
    
    // 'visible' attribute on TypeKeyInput (id=Language_Input) at DocumentTemplateSearchDV.pcf: line 61, column 67
    function visible_31 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get DocTemplateSearchCriteria () : DocumentTemplateSearchCriteria {
      return getRequireValue("DocTemplateSearchCriteria", 0) as DocumentTemplateSearchCriteria
    }
    
    property set DocTemplateSearchCriteria ($arg :  DocumentTemplateSearchCriteria) {
      setRequireValue("DocTemplateSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}