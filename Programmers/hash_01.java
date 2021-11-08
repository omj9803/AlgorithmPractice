public class hash_01 {
    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            boolean found = false;
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    found = true;
                    completion[j] = "";
                    continue;
                }
            }
            if (found == false) answer = participant[i];
        }
        return answer;
    }
}
