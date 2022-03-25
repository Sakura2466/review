package com.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author wanghao
 * @version 1.0
 */
public class StreamUtils {
    public static byte[] toByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] bytes = new byte[4096];
        int len = 0;
        while ((len=is.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }

}
