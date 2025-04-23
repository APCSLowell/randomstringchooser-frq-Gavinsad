import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> list;
  private int x;
  public RandomStringChooser(string[] str){
list = new ArrayList<string>();
    for(int i=0;i<str.length;i++){
list.add(string[i]);
    }
  }
  public string getNext(){
if(list.length()<1){return("NONE");}
return list.remove(list.get((int)(math.Random()*list.length())));

  }
}
