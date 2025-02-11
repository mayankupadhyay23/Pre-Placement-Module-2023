import java.util.HashMap;
import java.util.Map;

class FrequencyTable
{
    // A naive solution to create a frequency map in Java
    public static void main(String[] args)
    {
        String[] chars = { "A", "B", "C", "A", "C", "A" };
        Map<String, Integer> freq = new HashMap<>();

        for (String s: chars)
        {
            int prev = 0;

            // get the previous count
            if (freq.get(s) != null) {
                prev++;
            }

            freq.put(s, prev + 1);
        }

        System.out.println(freq);
    }
}