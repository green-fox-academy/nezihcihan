import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.abs;

public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String draw(int score) {
        String sameScore;
        ArrayList<String> result = new ArrayList<>(Arrays.asList("Love-All","Fifteen-All","Thirty-All","Forty-All","Deuce"));
        return result.get(score);
    }

    public String afterFourPoints(String player) {
        String difference ="";
        int minusResult = abs(m_score1-m_score2);
        if (minusResult==1 ) {
            difference +="Advantage ";
        }
        else if (minusResult>=2) {
            difference += "Win for ";
        }
        return  difference.concat(player);
    }

    public String beforeFourPoints(){
        String result = "";
        ArrayList<String> resultList = new ArrayList<>(Arrays.asList("Love","Fifteen","Thirty", "Forty"));
        for (int i=1; i<3; i++) {
//            if (i==1) tempScore = m_score1;
//            else { score+="-"; tempScore = m_score2;}
////            switch(tempScore)
////            {
////                case 0:
////                    score+="Love";
////                    break;
////                case 1:
////                    score+="Fifteen";
////                    break;
////                case 2:
////                    score+="Thirty";
////                    break;
////                case 3:
////                    score+="Forty";
////                    break;
////            }
        }
        String result;
    }

    public String getScore() {
        String score = "";
        int tempScore;

        if (m_score1==m_score2) {
            return draw(m_score1);
        }

        else if (m_score1>=4 || m_score2>=4) {
            String player = m_score1 > m_score2 ? "player1" : "player2";
            return afterFourPoints(player);
        }
        else {
//            for (int i=1; i<3; i++) {
//                if (i==1) tempScore = m_score1;
//                else { score+="-"; tempScore = m_score2;}
//                switch(tempScore)
//                {
//                    case 0:
//                        score+="Love";
//                        break;
//                    case 1:
//                        score+="Fifteen";
//                        break;
//                    case 2:
//                        score+="Thirty";
//                        break;
//                    case 3:
//                        score+="Forty";
//                        break;
//                }
//            }
        }
        return score;
    }
}
