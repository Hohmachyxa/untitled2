import org.example.Main;
import org.example.Task;
import org.junit.Test;
import org.junit.Assert;

public class MainTest {

    @Test
    public void adding_test(){
        Task task = new Task(19999, "Logich", "Logich");
        Main.add_tasks(task);
        Assert.assertEquals(task, Main.tasks.getFirst());
    }

    @Test
    public void deleting_test(){
        Task testich = new Task(19999, "Logich", "Logich");
        Main.delete_all_tasks();
        Assert.assertEquals(testich, Main.tasks.contains(testich));
    }
}
