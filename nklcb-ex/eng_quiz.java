import java.util.HashMap;
import java.util.Map;

public class eng_quiz {

    public static void main(String[] args) {
        String s1 = "8zerothree2";
        String s2 = "seven73nine";
        String s3 = "two53eightfour";

        System.out.println(solution(s1)); // 8032
        System.out.println(solution(s2)); // 7739
        System.out.println(solution(s3)); // 25384
    }

    static int solution(String s) {
        // 단어를 숫자로 매핑하는 해시맵 생성
        HashMap<String, String> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", "0");
        wordToNumber.put("one", "1");
        wordToNumber.put("two", "2");
        wordToNumber.put("three", "3");
        wordToNumber.put("four", "4");
        wordToNumber.put("five", "5");
        wordToNumber.put("six", "6");
        wordToNumber.put("seven", "7");
        wordToNumber.put("eight", "8");
        wordToNumber.put("nine", "9");

        // 반복문으로 wordToNumber의 각 항목을 반복해서 해당 단어를 숫자로 치환한다.
        for (Map.Entry<String, String> entry : wordToNumber.entrySet()) {
            // 문자열 's' 의 모든 발생을 해당하는 숫자로 바꾼다.
            s = s.replace(entry.getKey(), entry.getValue());
        }

        // 변환된 문자열을 정수로 변환해서 answer 변수에 담아서 값을 반환한다.
        int answer = Integer.parseInt(s);

        return answer;
    }
}