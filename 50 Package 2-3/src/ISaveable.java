package com.package_143;

import java.util.List;

public interface ISaveable {
    List<String> write();  //ArrayList<>
    void read(List<String> savedvalue);
}

