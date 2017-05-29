import java.awt.*;
import java.awt.event.*;
class TextFieldTextEvent extends Frame implements TextListener
{
TextField t;

    public TextFieldTextEvent()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        setTitle("TextListener for TextField");
        setLayout(new FlowLayout());
        
        // Create textfield that shows upto 20 chars
        t=new TextField(20);
        
        // This object is object of TextListener since
        // it implements TextListener
        t.addTextListener(this);
        
        add(t);
        
        setSize(400,400);
        setVisible(true);
    }
    
    // Called whenever the text in a text component (here t) changes
    public void textValueChanged(TextEvent te)
    {
        // Update the frame title
        setTitle(t.getText());
    }
    
    public static void main(String args[])
    {
        new TextFieldTextEvent();
    }
}