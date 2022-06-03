public class TextEditor {
    public TextEditor openTextEditor(){
        TextEditor notepad= new TextEditor();
        return notepad;
    }
public void writeIntoTextFile(String enterText){
        System.out.println(enterText);
}
public void closeTextEditor(){
        System.out.println("Text Editor closed");
}
}
