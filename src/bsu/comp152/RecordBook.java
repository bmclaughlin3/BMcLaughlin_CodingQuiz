package bsu.comp152;

import java.util.ArrayList;

public abstract class RecordBook {
    private ArrayList<Contact> data;
    protected String Label; {

    }
    private string RecordBook;
    private string getRecordBookName;
    private string findContact;

    public RecordBook(String bookName){
        Label = bookName;
        data = new ArrayList<Contact>();
    }

    public abstract void findContact(String name);

    public String getRecordBookName(){
        return Label;
    }

}
