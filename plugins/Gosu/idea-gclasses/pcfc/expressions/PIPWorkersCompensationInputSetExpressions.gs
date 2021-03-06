package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/shared/exposures/PIPWorkersCompensationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PIPWorkersCompensationInputSetExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/shared/exposures/PIPWorkersCompensationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPWorkersCompensationInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 18, column 285
    function action_10 () : void {
      if (Exposure.wccarrier != null) { ClaimContactDetailPopup.push(Exposure.wccarrier, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_12 () : void {
      ClaimContactDetailPopup.push(Exposure.wccarrier, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_8 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.wccarrier), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.wccarrier, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_9 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.wccarrier), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_5 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.wccarrier), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_6 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.wccarrier), null, Exposure.Claim)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WorkersCompCollected_Question_Input) at PIPWorkersCompensationInputSet.pcf: line 16, column 34
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.WCBenefit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.wccarrier = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on DateInput (id=WCBenefits_BenefitsBeginDate_Input) at PIPWorkersCompensationInputSet.pcf: line 60, column 46
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.WCBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function onPick_14 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.wccarrier); var result = eval("Exposure.wccarrier = Exposure.Claim.resolveContact(Exposure.wccarrier) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at PIPWorkersCompensationInputSet.pcf: line 35, column 51
    function reflectionValue_27 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at PIPWorkersCompensationInputSet.pcf: line 44, column 51
    function reflectionValue_34 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on Reflect at PIPWorkersCompensationInputSet.pcf: line 53, column 42
    function reflectionValue_41 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_18 () : java.lang.Object {
      return Exposure.Claim.RelatedCompanyArray
    }
    
    // 'value' attribute on BooleanRadioInput (id=WorkersCompCollected_Question_Input) at PIPWorkersCompensationInputSet.pcf: line 16, column 34
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryAddress_Input) at PIPWorkersCompensationInputSet.pcf: line 32, column 45
    function valueRoot_31 () : java.lang.Object {
      return Exposure.wccarrier
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryContact_Input) at PIPWorkersCompensationInputSet.pcf: line 41, column 45
    function valueRoot_38 () : java.lang.Object {
      return Exposure.wccarrier.PrimaryContact
    }
    
    // 'value' attribute on DateInput (id=WCBenefits_BenefitsBeginDate_Input) at PIPWorkersCompensationInputSet.pcf: line 60, column 46
    function valueRoot_51 () : java.lang.Object {
      return Exposure.WCBenefits
    }
    
    // 'value' attribute on BooleanRadioInput (id=WorkersCompCollected_Question_Input) at PIPWorkersCompensationInputSet.pcf: line 16, column 34
    function value_0 () : java.lang.Boolean {
      return Exposure.WCBenefit
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function value_15 () : entity.Company {
      return Exposure.wccarrier
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryAddress_Input) at PIPWorkersCompensationInputSet.pcf: line 32, column 45
    function value_30 () : java.lang.String {
      return Exposure.wccarrier.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryContact_Input) at PIPWorkersCompensationInputSet.pcf: line 41, column 45
    function value_37 () : java.lang.String {
      return Exposure.wccarrier.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryPhone_Input) at PIPWorkersCompensationInputSet.pcf: line 50, column 45
    function value_44 () : java.lang.String {
      return Exposure.wccarrier.PrimaryPhoneValue
    }
    
    // 'value' attribute on DateInput (id=WCBenefits_BenefitsBeginDate_Input) at PIPWorkersCompensationInputSet.pcf: line 60, column 46
    function value_49 () : java.util.Date {
      return Exposure.WCBenefits.BenefitsBeginDate
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_20 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at PIPWorkersCompensationInputSet.pcf: line 27, column 46
    function verifyValueType_26 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 12, column 273
    function visible_11 () : java.lang.Boolean {
      return  Exposure.WCBenefit == true
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 14, column 229
    function visible_4 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_WCCarrier_Input) at ClaimContactWidget.xml: line 16, column 225
    function visible_7 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.wccarrier), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}