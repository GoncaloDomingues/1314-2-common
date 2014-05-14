package apps.http.todo;

import html.HtmlPage;
import todo.ToDo;

public class ToDoView extends HtmlPage {
    
    public ToDoView(ToDo td){
        super("To Do",
            h1(text("To Do")),
            h3(text("Descrição: "+td.getDescription())),
            a(ResolveUrl.ofToDoCollection(), "Collection")            
        );        
    }
}
