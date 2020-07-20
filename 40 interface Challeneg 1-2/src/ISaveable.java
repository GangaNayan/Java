import java.util.List;

public interface ISaveable {
    List<String> write();  //ArrayList<>
    void read(List<String> savedvalue);
}

