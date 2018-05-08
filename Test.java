package com.alacriti.demo.test;

import java.io.File;

public class Test {
	
	public static void main(String[] args){
		
		String name = "ProvideTransferInstruction1.2Cross.xml";
		String dir = "/home/ajaykumar/Documents";
		findFile(name, new File(dir));
	}
	
	public static void findFile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println(fil.getParentFile());
            }
        }
    }

}
