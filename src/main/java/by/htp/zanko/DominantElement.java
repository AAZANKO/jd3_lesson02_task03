package by.htp.zanko;

import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class DominantElement {

    public int getDominantElement(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            Integer tmpInt = array[i];
            Integer value = map.get(tmpInt);

            if (value == null) {
                map.put(tmpInt, 1);
            } else {
                Integer mapValue = map.get(tmpInt);
                map.put(tmpInt, ++mapValue);
            }
        }

        int maxValue = 0;
        int maxKeyValue = 0;
        int imtValue;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            imtValue = entry.getValue();
            if (imtValue > maxValue) {
                maxValue = entry.getValue();
                maxKeyValue = entry.getKey();
            }
        }
        return maxKeyValue;
    }

}
