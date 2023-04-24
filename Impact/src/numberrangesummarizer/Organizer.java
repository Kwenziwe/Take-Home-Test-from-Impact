package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class Organizer implements NumberRangeSummarizer {

    public int[] storeArr;
    public static int[] strCleanAndSplit(String text) {
        String[] textArray = text.split("[^\\d]+");
        int[] nums = new int[textArray.length];
        for (int i = 0; i < textArray.length; i++){
            nums[i] = Integer.parseInt(textArray[i]);
        }
        return nums;
    }

    public static String rangeNumbers(int[] arrNums ){
        Arrays.sort(arrNums);//Sorting the arraying ascending
        int endseq = arrNums[0];//Setting firt indexs
        String resultStr = "";//Empty string
        ArrayList<Integer> values = new ArrayList<Integer>();//empty list
        values.add(endseq);//Setting the firt element to the array
        for (int i =1;i < arrNums.length;i++){
            if (endseq+1 == arrNums[i]){
                values.add(arrNums[i]);
                endseq = endseq +1;
            }
            else{
                values.add(arrNums[i]);
                if (values.size() <=1 ){
                    resultStr += values+",";
                }
                else {
                    for(int k= 0; k < values.size(); k++){
                        resultStr+= values.get(k);
                    }
                }
                endseq = endseq +1;
            }


        }


        return resultStr;
    }






    @Override
    public int[] collect(String input) {
        return strCleanAndSplit(input);
    }

    @Override
    public String summarizeCollection(int[] input) {
        return rangeNumbers(input);
    }
}
