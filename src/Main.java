import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
        public class Main {
            public static void main(String args[])
            {

//create file-choosing object
                final JFileChooser file_chooser = new JFileChooser();
//dialog to select file
                int returnVal = file_chooser.showOpenDialog(null);
//get file
                File file=file_chooser.getSelectedFile();
//variables
                int line_count=0;
                int word_count=0;
                int character_count=0;
                String line="";
                try {
//scanner to read from file
                    Scanner read=new Scanner(file);
// reads until file is empty
                    while(read.hasNextLine())
                    {
                        line=read.nextLine();
//line spaces

                        String words[]=line.split(" ");

//updating the counter

                        character_count=character_count+line.length();
                        word_count=word_count+words.length;
                        line_count=line_count+1;
                    }
                } catch (FileNotFoundException e) {

// TODO Auto-generated catch block
                    e.printStackTrace();
                }

//display everything
                System.out.printf("file name: %s \n character count: %d \n word count: %d \n line count: %d \n",file.getName(),character_count,word_count,line_count);
            }

        }