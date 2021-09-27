package ex39;

import java.util.*;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class sortRecords {


    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    sortRecords prog = new sortRecords();
        Map<String, String> empName = new TreeMap<>();
        prog.fillname(empName);
        Map<String, String> empJob = new TreeMap<>();
        prog.filljob(empJob);
        Map<String, String> empDate = new TreeMap<>();
        prog.filldate(empDate);
        ArrayList<Map<String, String>> emplist = new ArrayList<>();
        prog.create(emplist,empName,empJob,empDate);
        prog.printstr(emplist,empName,empJob,empDate);
        prog.format(emplist,empName,empJob,empDate);

    }

    private void format(ArrayList<Map<String, String>> emplist, Map<String, String> empName, Map<String, String> empJob, Map<String, String> empDate) {
            create(emplist,empName, empJob, empDate);
            String str1 = "Name";
            String str2 = "Position";
            String str3 = "Separation Date";
            out.println(String.format("%s \t\t\t\t |\t%s \t\t\t|\t%s",str1,str2,str3));
            System.out.println("---------------------|----------------------|---------------------");
            Set<Map.Entry<String,String>> names = empName.entrySet();
            Set<Map.Entry<String,String>> jobs = empJob.entrySet();
            Set<Map.Entry<String,String>> date = empDate.entrySet();

            String[] last = new String[empName.size()];
            String[] first = new String[empName.size()];
            String[] name = new String[empName.size()];
            String[] job = new String[empName.size()];
            String[] d = new String[empName.size()];

            int ncount=0;int jcount=0;int dcount=0;

            for(Map.Entry<String,String> nentry : names){
                last[ncount] = nentry.getKey();
                first[ncount] = nentry.getValue();
                name[ncount] = first[ncount]+" "+last[ncount];
                ncount++;
            }
            for(Map.Entry<String,String> pentry : jobs){
                job[jcount] = pentry.getValue();
                jcount++;
            }
            for(Map.Entry<String,String> dentry : date){
                d[dcount] = dentry.getValue();
                dcount++;
            }
            for (int tcount = 0; tcount < last.length; tcount++) {
                System.out.printf("%-20s | %-20s | %-20s%n", name[tcount], job[tcount], d[tcount]);
            }
    }

    private String printstr(ArrayList<Map<String, String>> emplist, Map<String, String> empName, Map<String, String> empJob, Map<String, String> empDate) {
        create(emplist,empName,empJob,empDate);
        return String.valueOf(emplist);

        }


    private void create(ArrayList<Map<String, String>> emplist, Map<String, String> empName, Map<String, String> empJob, Map<String, String> empDate) {
        emplist.add(empName);
        emplist.add(empJob);
        emplist.add(empDate);
    }

    public void fillname(Map empName) {
        empName.put("Michaelson", "Michaela");
        empName.put("Jacobson", "Jake");
        empName.put("Weber", "Sally");
        empName.put("Xiong", "Tou");
        empName.put("Johnson", "John");
        empName.put("Jackson", "Jacquelyn");
    }

    public void filljob(Map empJob) {
        empJob.put("Jacobson", "Programmer");
        empJob.put("Michaelson", "District Manager");
        empJob.put("Webber", "Web Developer");
        empJob.put("Xiong", "Software Engineer");
        empJob.put("Johnson", "Manager");
        empJob.put("Jackson", "DBA");
    }

    public void filldate(Map empDate) {
        empDate.put("Jacobson", "");
        empDate.put("Michaelson", "2015-12-19");
        empDate.put("Webber", "2015-12-18");
        empDate.put("Xiong", "2016-10-05");
        empDate.put("Johnson", "2016-12-31");
        empDate.put("Jackson", "");
    }

}









//    Name                | Position          | Separation Date
//--------------------|-------------------|----------------
//    Jacquelyn Jackson   | DBA               |
//    Jake Jacobson       | Programmer        |
//    John Johnson        | Manager           | 2016-12-31
//    Michaela Michaelson | District Manager  | 2015-12-19
//    Sally Weber         | Web Developer     | 2015-12-18
//    Tou Xiong           | Software Engineer | 2016-10-05


