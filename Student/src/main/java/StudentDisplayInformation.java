/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $ANTO$H
 */
import java.io.File;
import java.io.FilenameFilter;

public class StudentDisplayInformation {
    public void listfile(){
        File folder = new File("C:\\Users\\$ANTO$H\\Documents\\NetBeansProjects\\Student\\");
                //Implementing FilenameFilter to retrieve only txt files
 
        FilenameFilter txtFileFilter = new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                if(name.endsWith(".data"))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
 
 
        File[] files = folder.listFiles(txtFileFilter);
 
        for (int i = 0; i < files.length; i++)
        {
            System.out.println(files[i].getName());
        }
    }
}
