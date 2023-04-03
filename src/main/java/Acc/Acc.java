package Acc;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acc {
    public Integer reg;
    public Map<String,Integer> env;
    public Map<String,Integer> lab;
    public ArrayList<String> stringLists;

    public Acc() {
        reg = 0;
        env = new HashMap<String,Integer>();
        lab = new HashMap<String,Integer>();
        stringLists = new ArrayList<>();
    }

    boolean isNumber(String str){
       Pattern pattern=Pattern.compile("-?[0-9]+(\\\\.[0-9]+)?");
       Matcher m = pattern.matcher(str);
       return m.matches();
    }

    public int ex(String res[],int next){
        switch (res[0]){
            case "LOAD":{
                next++;
                if(isNumber(res[1])){
                    reg=Integer.valueOf(res[1]);
                }else{
                    reg=env.get(res[1]);
                }
            }break;
            case "STO":{
                next++;
                env.put(res[1],reg);
            }break;
            case "GET":{
                next++;
                System.out.println("Enter value "+res[1].toLowerCase()+": ");
                Scanner scanner = new Scanner(System.in);
                Integer temp = scanner.nextInt();
                env.put(res[1],temp);
            }break;
            case "PUT":{
                next++;
                System.out.println(env.get(res[1]));
            }break;
            case "ADD":{
                next++;
                if(isNumber(res[1])){
                    reg+=Integer.valueOf(res[1]);
                }else{
                    reg+=Integer.valueOf(env.get(res[1]));
                }
            }break;
            case "SUB":{
                next++;
                if(isNumber(res[1])){
                    reg-=Integer.valueOf(res[1]);
                }else{
                    reg-=Integer.valueOf(env.get(res[1]));
                }
            }break;
            case "MUL":{
                next++;
                if(isNumber(res[1])){
                    reg*=Integer.valueOf(res[1]);
                }else{
                    reg*=Integer.valueOf(env.get(res[1]));
                }
            }break;
            case "DIV":{
                next++;
                if(isNumber(res[1])){
                    reg/=Integer.valueOf(res[1]);
                }else{
                    reg/=Integer.valueOf(env.get(res[1]));
                }
            }break;
            case "AND":{
                next++;
                if(isNumber(res[1])){
                    reg&=Integer.valueOf(res[1]);
                }else{
                    reg&=Integer.valueOf(env.get(res[1]));
                }
            }break;
            case "OR":{
                next++;
                if(isNumber(res[1])){
                    reg|=Integer.valueOf(res[1]);
                }else{
                    reg|=Integer.valueOf(env.get(res[1]));
                }
            }break;
            case "NOT":{
                next++;
                reg=-reg;
            }break;
            case "J":{
                next=stringLists.indexOf(res[1]+" LABLE")+1;
            }break;
            case "JF":{
                if(reg==0){
                    next=stringLists.indexOf(res[1]+" LABLE")+1;
                } else{
                   next++;
                }
            }break;
            //case "LABLE":{}break;
            case "TSTLT":{
                if(reg<0) reg=1;
                else reg=0;
                next++;
            }break;
            case "TSTLE":{
                if(reg<=0) reg=1;
                else reg=0;
                next++;
            }break;
            case "TSTNE":{
                if(reg!=0) reg=1;
                else reg=0;
                next++;
            }break;
            case "TSTEQ":{
                if(reg==0) reg=1;
                else reg=0;
                next++;
            }break;
            case "TSTGE":{
                if(reg>=0) reg=1;
                else reg=0;
                next++;
            }break;
            case "TSTGT":{
                if(reg>0) reg=1;
                else reg=0;
                next++;
            }break;
            case "NO-OP":{}break;
            case "HALT":{
                next=stringLists.size();
            }break;

            default:{
                next++;
                if(res[1].equals("LABLE")){
//                    System.out.println("lable!!!");
                }else{
                    System.out.println("erro!!!");
                    System.out.println("here is the wrong code: "+res[0]+" "+res[1]);
                }
            }
        }
        return next;
    }

    public Integer Inter(){
        File file=new File("a.txt");
        BufferedReader reader=null;
        String tempString=null;
        String res[]=null;

        try{
            reader = new BufferedReader(new FileReader(file));
            while ((tempString=reader.readLine())!=null){
                stringLists.add(tempString);
                //System.out.println(tempString);
//                res=tempString.split(" ");
                   //System.out.println(res[0]);
//                ex(res);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int j=0;
        while(stringLists.size()>j){
            tempString=stringLists.get(j);
            res=tempString.split(" ");
            j=ex(res,j);

        }
//        for(String temp: stringLists){
//            res=temp.split(" ");
//            ex(res);
//        }

        return reg;
    }
}
