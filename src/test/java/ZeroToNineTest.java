import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroToNineTest {
    @Test
    public void test(){
        int[] digits1 = new int[]{8};
        String expected1 = "t u v";
        String result1 = new ZeroToNineKeyBoard().getResult(digits1);
        Assert.assertEquals(expected1,result1);

        int[] digits2 = new int[]{1,10};
        String expected2 = "Please enter a number between 0 and 9 !";
        String result2 = new ZeroToNineKeyBoard().getResult(digits2);
        Assert.assertEquals(expected2,result2);

        int[] digits3 = new int[]{2,9};
        String expected3 = "aw ax ay az bw bx by bz cw cx cy cz";
        String result3 = new ZeroToNineKeyBoard().getResult(digits3);
        Assert.assertEquals(expected3,result3);

        int[] digits4 = new int[]{3,5,7};
        String expected4 = "djp djq djr djs dkp dkq dkr dks dlp dlq dlr dls ejp ejq ejr ejs ekp ekq ekr eks elp elq elr els fjp fjq fjr fjs fkp fkq fkr fks flp flq flr fls";
        String result4 = new ZeroToNineKeyBoard().getResult(digits4);
        Assert.assertEquals(expected4,result4);

        int[] digits5 = new int[]{3,5,7,9};
        String expected5 = "djpw djpx djpy djpz djqw djqx djqy djqz djrw djrx djry djrz djsw djsx djsy djsz dkpw dkpx dkpy dkpz dkqw dkqx dkqy dkqz dkrw dkrx dkry dkrz dksw dksx dksy dksz dlpw dlpx dlpy dlpz dlqw dlqx dlqy dlqz dlrw dlrx dlry dlrz dlsw dlsx dlsy dlsz ejpw ejpx ejpy ejpz ejqw ejqx ejqy ejqz ejrw ejrx ejry ejrz ejsw ejsx ejsy ejsz ekpw ekpx ekpy ekpz ekqw ekqx ekqy ekqz ekrw ekrx ekry ekrz eksw eksx eksy eksz elpw elpx elpy elpz elqw elqx elqy elqz elrw elrx elry elrz elsw elsx elsy elsz fjpw fjpx fjpy fjpz fjqw fjqx fjqy fjqz fjrw fjrx fjry fjrz fjsw fjsx fjsy fjsz fkpw fkpx fkpy fkpz fkqw fkqx fkqy fkqz fkrw fkrx fkry fkrz fksw fksx fksy fksz flpw flpx flpy flpz flqw flqx flqy flqz flrw flrx flry flrz flsw flsx flsy flsz";
        String result5 = new ZeroToNineKeyBoard().getResult(digits5);
        Assert.assertEquals(expected5,result5);

        int[] digits6 = new int[]{};
        String expected6 = "An empty array was entered";
        String result6 = new ZeroToNineKeyBoard().getResult(digits6);
        Assert.assertEquals(expected6,result6);

        int[] digits7 = new int[]{1,0,1};
        String expected7 = "All numbers entered are 0 or 1";
        String result7 = new ZeroToNineKeyBoard().getResult(digits7);
        Assert.assertEquals(expected7,result7);
    }
}
