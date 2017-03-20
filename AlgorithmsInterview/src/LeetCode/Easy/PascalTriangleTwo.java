package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(2));
	}

	public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        if(rowIndex==0){
            return list;
        }
        
        for(int i=0; i<rowIndex; i++){
            List<Integer> buffer = new ArrayList<Integer>();
            buffer.add(1);
            for(int j=1; j<list.size(); j++){
                buffer.add(list.get(j-1)+list.get(j));
            }
            buffer.add(1);
            list = buffer;
        }
        return list;
    }
}
