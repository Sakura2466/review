package com.iostream_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author wanghao
 * @version 1.0
 */
public class DeleteFile {
    String path = "C:\\Users\\77479\\Desktop\\test.txt";
    @Test
    public void deleteFile(){
        File file = new File(path);
        file.delete();
    }
}
