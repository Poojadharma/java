
//Problem Statement: Character Count in String
// Given a string 'S' and a character 'K', find how many times 'K' got repeated in 'S'.If 'K' is not found in 'S' print -1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String S=sc.next();
      char K=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<S.length();i++){
          if(S.charAt(i)==K){
              count++;
          }
      }
      if(count==0){
          System.out.println("-1");
      }
      else{
          System.out.println(count);
      }
    }
}