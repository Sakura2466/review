package com.iostream_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author wanghao
 * @version 1.0
 */
public class RenameFile {
    @Test
    public void renameFile(){
        String path = "C:\\Users\\77479\\Desktop\\test1.txt";
        File file = new File(path);
        if(file.exists()){
            file.renameTo(new File("C:\\Users\\77479\\Desktop\\test2.txt"));
        }
    }
}
