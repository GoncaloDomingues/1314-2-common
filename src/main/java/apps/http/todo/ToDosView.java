package apps.http.todo;

import html.HtmlElem;
import html.HtmlPage;
import todo.ToDo;

import common.Writable;

public class ToDosView extends HtmlPage{

    public ToDosView(Iterable<ToDo> list){
        super("To Do list",
            h1(text("To Do list")),            
            todoItems(list),
            h1(text("Create new To Do")),
            form("POST", "/todos",
                label("description","Descrição: "),
                textInput("description")
            )
        );        
    }
    
    private static Writable todoItems(Iterable<ToDo> list) {
        HtmlElem ul = new HtmlElem("ul");
        for(ToDo todo : list){
            ul.withContent(
                li(a(ResolveUrl.of(todo),todo.toString()))
            );
        }
        return ul;
    }    
}
