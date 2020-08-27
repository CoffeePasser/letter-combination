import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroToNineTest {
    @Test
    public void test1(){
        int[] digits = new int[]{8};
        String expected = "t u v";
        String result = new ZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test2(){
        int[] digits = new int[]{1,10};
        String expected = "Please enter a number between 0 and 9 !";
        String result = new ZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test3(){
        int[] digits = new int[]{2,9};
        String expected = "aw ax ay az bw bx by bz cw cx cy cz";
        String result = new ZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test4(){
        int[] digits = new int[]{3,5,7};
        String expected = "djp djq djr djs dkp dkq dkr dks dlp dlq dlr dls ejp ejq ejr ejs ekp ekq ekr eks elp elq elr els fjp fjq fjr fjs fkp fkq fkr fks flp flq flr fls";
        String result = new ZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test5(){
        int[] digits = new int[]{3,5,7,9};
        String expected = "djpw djpx djpy djpz djqw djqx djqy djqz djrw djrx djry djrz djsw djsx djsy djsz dkpw dkpx dkpy dkpz dkqw dkqx dkqy dkqz dkrw dkrx dkry dkrz dksw dksx dksy dksz dlpw dlpx dlpy dlpz dlqw dlqx dlqy dlqz dlrw dlrx dlry dlrz dlsw dlsx dlsy dlsz ejpw ejpx ejpy ejpz ejqw ejqx ejqy ejqz ejrw ejrx ejry ejrz ejsw ejsx ejsy ejsz ekpw ekpx ekpy ekpz ekqw ekqx ekqy ekqz ekrw ekrx ekry ekrz eksw eksx eksy eksz elpw elpx elpy elpz elqw elqx elqy elqz elrw elrx elry elrz elsw elsx elsy elsz fjpw fjpx fjpy fjpz fjqw fjqx fjqy fjqz fjrw fjrx fjry fjrz fjsw fjsx fjsy fjsz fkpw fkpx fkpy fkpz fkqw fkqx fkqy fkqz fkrw fkrx fkry fkrz fksw fksx fksy fksz flpw flpx flpy flpz flqw flqx flqy flqz flrw flrx flry flrz flsw flsx flsy flsz";
        String result = new ZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
}
