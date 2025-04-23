import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> list;
  private int x;
  public RandomStringChooser(String[] str){
list = new ArrayList<String>();
    for(int i=0;i<str.length;i++){
list.add(str[i]);
    }
  }
  public String getNext(){
if(list.size()<1){return("NONE");}
return list.remove((int)(Math.random()*list.size()));

  }
}
