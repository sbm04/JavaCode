package interview;

public class ExcelColumnNumber {
    public static int columnNameToNumber(String columnName) {
        int result =0;

        for(int i=0;i<columnName.length();i++){
            char c= columnName.charAt(i);
            int value=c-'A'+1;
            result =result*26 +value;
        }
        return result;
    }

    public static void main(String[] args) {
        String s ="ZY";
        System.out.println(columnNameToNumber(s));

        //https://www.scaler.com/academy/mentee-dashboard/discussion-forum/p/intellimation-ai-senior-software-engineer-tech-r1-rejected/106859
        //https://www.scaler.com/academy/mentee-dashboard/discussion-forum/p/intellimation-ai-backend-tech-rounds-offered/101603
    }
}
