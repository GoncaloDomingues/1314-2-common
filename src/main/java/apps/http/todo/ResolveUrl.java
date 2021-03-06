package apps.http.todo;

import todo.ToDo;

public class ResolveUrl {

    public static String of(ToDo td) {
        return String.format("/todos/%d", td.getId());
    }
    
    public static String ofToDoCollection() {
        return "/todos";
    }    
}
