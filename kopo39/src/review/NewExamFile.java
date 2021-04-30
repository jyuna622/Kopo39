package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NewExamFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\jyuna\\OneDrive\\Desktop\\2019airpollution.csv");
        FileOutputStream fo = new FileOutputStream("C:\\Users\\jyuna\\OneDrive\\Desktop\\output.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fi));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));

        String strLine;
        while ((strLine = br.readLine()) != null)   {

              String[] arr = strLine.split(" ");
              String[] nos = arr[1].split(",");

              Set<Integer> set = new HashSet<Integer>();  
              for(int i = 0; i<nos.length; i++){
                  int no = Integer.parseInt(nos[i]);
                       set.add(no); 
                    }
              TreeSet<Integer> sortedSet = new TreeSet<Integer>(set); 

              switch(arr[0]) {

              case "Min:":
                  String msg1="The Min of [" +arr[1]+ "] is " +(Integer)sortedSet.first();
                  bw.write(msg1);
                  bw.newLine();

                  break;

              case "Max:":
                  String msg2="The Max of [" +arr[1]+ "] is " +(Integer)sortedSet.last();
                  bw.write(msg2);
                  bw.newLine();
                  break;

              case "Avg:":
                  Object[] noarray = sortedSet.toArray();
                  int noarraysize = noarray.length-1;
                  int sum=0;
                  for(int i=0;i<=noarraysize;i++) {

                      int no=Integer.valueOf(noarray[i].toString());
                      sum = sum + no;
                      if(i==noarraysize) {
                          String msg3="The Avg of [" +arr[1]+ "] is  " +(double)sum/noarray.length;
                          bw.write(msg3);
                          bw.newLine();
                                                  }
                  }
                  break;

              case "Sum:":
                  Object[] noarray1 = sortedSet.toArray();
                  int noarraysize1 = noarray1.length-1;
                  int sum1=0;
                  for(int i=0;i<=noarraysize1;i++) {
                      int no=Integer.valueOf(noarray1[i].toString());
                      sum1 = sum1 + no;
                      if(i==noarraysize1) {
                          String msg4="The Sum of [" +arr[1]+ "] is  " +sum1;
                          bw.write(msg4);
                          bw.newLine();
                                                  }
                  }
                  break;

            }

    }
        br.close();
        bw.close();

    }
}