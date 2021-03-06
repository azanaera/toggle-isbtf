package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/notes/WideNotesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WideNotesLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/notes/WideNotesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WideNotesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at WideNotesLV.pcf: line 26, column 25
    function condition_0 () : java.lang.Boolean {
      return perm.Note.edit(note) or perm.Note.editbody(note)
    }
    
    // 'condition' attribute on ToolbarFlag at WideNotesLV.pcf: line 29, column 27
    function condition_1 () : java.lang.Boolean {
      return perm.Note.delete(note)
    }
    
    // 'label' attribute on TextInput (id=AuthoringDate_Input) at WideNotesLV.pcf: line 69, column 35
    function label_15 () : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(note.AuthoringDate, "medium") + " " + gw.api.util.StringUtil.formatTime(note.AuthoringDate, "short")
    }
    
    // 'value' attribute on TextInput (id=Author_Input) at WideNotesLV.pcf: line 41, column 46
    function valueRoot_3 () : java.lang.Object {
      return note.Author
    }
    
    // 'value' attribute on TextInput (id=Topic_Input) at WideNotesLV.pcf: line 48, column 48
    function valueRoot_6 () : java.lang.Object {
      return note
    }
    
    // 'value' attribute on TextInput (id=Subject_Input) at WideNotesLV.pcf: line 73, column 35
    function value_17 () : java.lang.String {
      return note.Subject
    }
    
    // 'value' attribute on TextInput (id=Author_Input) at WideNotesLV.pcf: line 41, column 46
    function value_2 () : java.lang.String {
      return note.Author.DisplayName
    }
    
    // 'value' attribute on NoteBodyInput (id=Body_Input) at WideNotesLV.pcf: line 78, column 32
    function value_20 () : java.lang.String {
      return note.Body
    }
    
    // 'value' attribute on TextInput (id=Topic_Input) at WideNotesLV.pcf: line 48, column 48
    function value_5 () : typekey.NoteTopicType {
      return note.Topic
    }
    
    // 'value' attribute on TextInput (id=RelatedTo_Input) at WideNotesLV.pcf: line 55, column 41
    function value_9 () : java.lang.String {
      return note.NoteRelatedTo
    }
    
    // 'visible' attribute on TextInput (id=Confidential_Input) at WideNotesLV.pcf: line 60, column 42
    function visible_13 () : java.lang.Boolean {
      return note.Confidential
    }
    
    // 'visible' attribute on TextInput (id=RelatedTo_Input) at WideNotesLV.pcf: line 55, column 41
    function visible_8 () : java.lang.Boolean {
      return relatedToVisible
    }
    
    property get note () : entity.Note {
      return getIteratedValue(1) as entity.Note
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/notes/WideNotesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WideNotesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=NoteIterator) at WideNotesLV.pcf: line 23, column 33
    function value_23 () : entity.Note[] {
      return notes
    }
    
    property get notes () : Note[] {
      return getRequireValue("notes", 0) as Note[]
    }
    
    property set notes ($arg :  Note[]) {
      setRequireValue("notes", 0, $arg)
    }
    
    property get relatedToVisible () : boolean {
      return getRequireValue("relatedToVisible", 0) as java.lang.Boolean
    }
    
    property set relatedToVisible ($arg :  boolean) {
      setRequireValue("relatedToVisible", 0, $arg)
    }
    
    
  }
  
  
}