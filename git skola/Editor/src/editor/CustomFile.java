/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;




/**
 *
 * @author student
 */
public class CustomFile {

    private String data;

    CustomFile() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean load(File file, String charset) throws FileNotFoundException {
        data = "";
        try {
            InputStream is = new FileInputStream(file);
            Reader reader = new InputStreamReader(is, charset);
            int ch;//char
            do {
                ch = reader.read();
                if (ch != -1) {
                    data += (char) ch;
                }
            } while (ch != -1);
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public Boolean save(File file, String charset) throws FileNotFoundException{
        try{
            OutputStream os = new FileOutputStream(file);
            try(Writer writer = new OutputStreamWriter(os,charset)){
                writer.write(data);
            }
        }catch(IOException ex){
            return false;
        }
        return true;
    }

}
