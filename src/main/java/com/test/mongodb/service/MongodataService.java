package com.test.mongodb.service;

import java.util.*;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mongodb.model.Incoming;
import com.test.mongodb.model.Outgoing;
import com.test.mongodb.repository.mongorepo;
import com.test.mongodb.repository.outputrepo;

@Service
public class MongodataService 
{
  @Autowired
  private mongorepo repository;
  
  @Autowired
  private outputrepo repo;
  
  //private Outgoing opt;
  
  public Incoming savejsondata(Incoming data)
  {
	  
	  Incoming obj= repository.save(data);
	  Outgoing opt = new Outgoing();
	  opt.setId(checkinteger(obj.getId()));
	  opt.setIsboolean(checkBoolean(obj.getValidateMeOnlyIActuallyShouldBeABoolean()));
	  opt.setMaxnum(maxnum(obj.getNumbersMeetNumbers()));
	  opt.setRemoved_duplicates(remove_duplicates(obj.getFindDuplicates()));
	  opt.setRemoved_whitespaces(remove_spaces(obj.getWhiteSpacesGalore()));
	  repo.save(opt);
	  return obj;
	  
  }
  
  public List<Incoming> getjsondata()
  {
	  return repository.findAll();
  }
  
  public int checkinteger(String s)
  {
	  int a=0;
	  try
	  {
		a= Integer.parseInt(s);
	  }
	  catch(NumberFormatException num)
	  {
		  System.out.println("The number is not numeric");
	  }
	  return a;
  }
  
  public String checkBoolean(String s)
  {
	  if(s.equals("true") || s.equals("false"))
	  {
	     return s+" is Boolean";
	  }
	 
	  // will return Non Boolean value if string does not match true or false
	  return "Non Boolean";
  }
  
  public int maxnum(String str)
  {
	  // storing string array to convert to Integer Array
	  String[] string = str.replaceAll("\\[", "")
              .replaceAll("]", "")
              .split(",");
	  // creating array of length of size of string
	  int[] arr = new int[string.length];
	 
	  // store in an integer array
	  for (int i = 0; i < string.length; i++) {
          arr[i] = Integer.valueOf(string[i]);
      }
	  
	 int max = Arrays.stream(arr).max().getAsInt();
	 return max;
  }
  
  public String remove_duplicates(String str)
  {
	  // remove duplicated Characters
	  String s="";
	  
	  // Case insensitive , taking the input string as it is without converting to Lowecase or Upper case
	  HashMap<Character,Integer> map = new HashMap<>();
	  for(int i=0;i<str.length();i++)
	  {
		  if(map.containsKey(str.charAt(i)))
		  {
			  map.put(str.charAt(i), map.get(str.charAt(i))+1);
		  }
		  else
		  {
			  map.put(str.charAt(i),1);
		  }
	  }
	  for(Map.Entry<Character,Integer> e : map.entrySet())
	  {
		  if(e.getValue()==1)
		  {
			  s=s+e.getKey();
		  }
	  }
	  
	  return s;	  
  }
  public String remove_spaces(String str)
  {
	  String s="";
	  StringTokenizer tokenizer = new StringTokenizer(str," ");
	  while(tokenizer.hasMoreTokens())
	  {
		  s=s+tokenizer.nextToken();
	  }
	  
	  return s;
  }
  
  
}
