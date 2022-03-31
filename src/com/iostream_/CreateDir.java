package com.iostream_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author wanghao
 * @version 1.0
 */
public class CreateDir {
    @Test
    public void createDir(){
        String path = "C:\\Users\\77479\\Desktop\\test";
        File file = new File(path);
        file.mkdir();
    }
}
