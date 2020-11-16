package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/policy/policylocations/EditableRULienholdersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableRULienholdersLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/policy/policylocations/EditableRULienholdersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRULienholdersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on ClaimContactCell (id=Lienholder_Cell) at EditableRULienholdersLV.pcf: line 37, column 46
    function sortValue_0 (PropertyOwner :  entity.PropertyOwner) : java.lang.Object {
      return PropertyOwner.Lienholder
    }
    
    // 'value' attribute on TypeKeyCell (id=OwnerType_Cell) at EditableRULienholdersLV.pcf: line 47, column 42
    function sortValue_1 (PropertyOwner :  entity.PropertyOwner) : java.lang.Object {
      return PropertyOwner.OwnerType
    }
    
    // 'toAdd' attribute on RowIterator (id=EditableRULienholdersLV) at EditableRULienholdersLV.pcf: line 25, column 42
    function toAdd_27 (PropertyOwner :  entity.PropertyOwner) : void {
      RU.addToLienholders(PropertyOwner)
    }
    
    // 'toRemove' attribute on RowIterator (id=EditableRULienholdersLV) at EditableRULienholdersLV.pcf: line 25, column 42
    function toRemove_28 (PropertyOwner :  entity.PropertyOwner) : void {
      RU.removeFromLienholders(PropertyOwner)
    }
    
    // 'value' attribute on RowIterator (id=EditableRULienholdersLV) at EditableRULienholdersLV.pcf: line 25, column 42
    function value_29 () : entity.PropertyOwner[] {
      return RU.Lienholders
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get RU () : LocationBasedRU {
      return getRequireValue("RU", 0) as LocationBasedRU
    }
    
    property set RU ($arg :  LocationBasedRU) {
      setRequireValue("RU", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/policy/policylocations/EditableRULienholdersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableRULienholdersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function action_10 () : void {
      ClaimContactDetailPopup.push(PropertyOwner.Lienholder, Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 16, column 225
    function action_6 () : void {
      AddressBookPickerPopup.push(statictypeof (PropertyOwner.Lienholder), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 18, column 285
    function action_8 () : void {
      if (PropertyOwner.Lienholder != null) { ClaimContactDetailPopup.push(PropertyOwner.Lienholder, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(PropertyOwner.Lienholder, Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_7 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (PropertyOwner.Lienholder), Claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_3 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (PropertyOwner.Lienholder), null, Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_4 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (PropertyOwner.Lienholder), null, Claim)
    }
    
    // 'value' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyOwner.Lienholder = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyCell (id=OwnerType_Cell) at EditableRULienholdersLV.pcf: line 47, column 42
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyOwner.OwnerType = (__VALUE_TO_SET as typekey.OwnerType)
    }
    
    // 'onChange' attribute on ClaimContactCell (id=Lienholder_Cell) at EditableRULienholdersLV.pcf: line 39, column 68
    function onChange_9 () : void {
      PropertyOwner.Property = RU.PolicyLocation
    }
    
    // 'onPick' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function onPick_12 (PickedValue :  Contact) : void {
      var contactType = statictypeof (PropertyOwner.Lienholder); var result = eval("PropertyOwner.Lienholder = Claim.resolveContact(PropertyOwner.Lienholder) as " + contactType.Name + ";return null;"); PropertyOwner.Property = RU.PolicyLocation;
    }
    
    // 'onPick' attribute on ClaimContactCell (id=Lienholder_Cell) at EditableRULienholdersLV.pcf: line 37, column 46
    function onPick_19 (PickedValue :  java.lang.Object) : void {
      PropertyOwner.Property = RU.PolicyLocation
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_16 () : java.lang.Object {
      return Claim.RelatedContacts
    }
    
    // 'value' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_15 () : java.lang.Object {
      return PropertyOwner
    }
    
    // 'value' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function value_13 () : entity.Contact {
      return PropertyOwner.Lienholder
    }
    
    // 'value' attribute on TypeKeyCell (id=OwnerType_Cell) at EditableRULienholdersLV.pcf: line 47, column 42
    function value_23 () : typekey.OwnerType {
      return PropertyOwner.OwnerType
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_17 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_17 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_18 () : void {
      var __valueRangeArg = Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 14, column 229
    function visible_2 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=Lienholder_Cell) at ClaimContactWidget.xml: line 16, column 225
    function visible_5 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (PropertyOwner.Lienholder), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get PropertyOwner () : entity.PropertyOwner {
      return getIteratedValue(1) as entity.PropertyOwner
    }
    
    
  }
  
  
}