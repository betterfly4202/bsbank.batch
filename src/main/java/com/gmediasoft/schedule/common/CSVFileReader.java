package com.gmediasoft.schedule.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 18.
 * Github : http://github.com/betterfly88
 */


/*
    Spring Batch
    http://www.mybatis.org/spring/ko/batch.html
 */

public class CSVFileReader {

    public List<String[]> getFileContents(){
        String filePath = "/Users/betterfly/Desktop/insa.csv";

        File file = new File(filePath);
        String row = null;

        List<String[]> memberArray = new ArrayList<>();

        try{
            BufferedReader br  =  new BufferedReader(new InputStreamReader(new FileInputStream(file),"euc-kr"));

            while((row = br.readLine()) != null) {
                String [] member = row.split("\n",-1); // -1 : 마지막 공백까지 처리
                memberArray.add(member);
            }
        }catch (FileNotFoundException fn){
            fn.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return memberArray;
    }

    public static void main(String [] args){
        CSVFileReader reader = new CSVFileReader();
        List<String[]> getMemberList = reader.getFileContents();

        for(int i=0; i<getMemberList.size(); i++){
            String [] getRowMember = getMemberList.get(i)[0].split("|",-1);
            /**
                 * getRowMember[0] // 행번
                 * getRowMember[1] // 이름
                 * getRowMember[2] // 부속
                 * getRowMember[3] // 직책
             */
        }
//        getMemberList.forEach(getMember ->
//                getMember[0].split("|")
//        );
    }
}
