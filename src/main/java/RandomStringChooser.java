import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> list;
  private int x;
  public RandomStringChooser(String[] str){
list = new ArrayList<String>();
    for(int i=0;i<str.length;i++){
list.add(String[i]);
    }
  }
  public String getNext(){
if(list.length()<1){return("NONE");}
return list.remove(list.get((int)(math.Random()*list.length())));

  }
}
