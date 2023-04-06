import java.util.*;
public class dataStructure {
    
    public ArrayList<Integer> dataList;
    public String name;
    
    public dataStructure (ArrayList<Integer> dataList, String name) {
        this.dataList = dataList;
        this.name = name;
    }
    
    public int getLength() {
        return dataList.size();
    }
    
    public Integer getValAtIndex(int index) {
        return dataList.get(index);
    }
    
    public void add(Integer num) {
        dataList.add(num);
    }
    
    public ArrayList<Integer> getArrayList() {
        return dataList;
    }
}