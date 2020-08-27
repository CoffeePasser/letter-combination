import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UpgradeZeroToNineTest {
    @Test
    public void test(){

        int[] digits1 = new int[]{4};
        String expected1 = "g h i";
        String result1 = new UpgradeZeroToNineKeyBoard().getResult(digits1);
        Assert.assertEquals(expected1,result1);

        int[] digits2 = new int[]{3,100};
        String expected2 = "Please enter a number between 0 and 99 !";
        String result2 = new UpgradeZeroToNineKeyBoard().getResult(digits2);
        Assert.assertEquals(expected2,result2);

        int[] digits3 = new int[]{2,99};
        String expected3 = "aww awx awy awz axw axx axy axz ayw ayx ayy ayz azw azx azy azz bww bwx bwy bwz bxw bxx bxy bxz byw byx byy byz bzw bzx bzy bzz cww cwx cwy cwz cxw cxx cxy cxz cyw cyx cyy cyz czw czx czy czz";
        String result3 = new UpgradeZeroToNineKeyBoard().getResult(digits3);
        Assert.assertEquals(expected3,result3);

        int[] digits4 = new int[]{3,25,7};
        String expected4 = "dajp dajq dajr dajs dakp dakq dakr daks dalp dalq dalr dals dbjp dbjq dbjr dbjs dbkp dbkq dbkr dbks dblp dblq dblr dbls dcjp dcjq dcjr dcjs dckp dckq dckr dcks dclp dclq dclr dcls eajp eajq eajr eajs eakp eakq eakr eaks ealp ealq ealr eals ebjp ebjq ebjr ebjs ebkp ebkq ebkr ebks eblp eblq eblr ebls ecjp ecjq ecjr ecjs eckp eckq eckr ecks eclp eclq eclr ecls fajp fajq fajr fajs fakp fakq fakr faks falp falq falr fals fbjp fbjq fbjr fbjs fbkp fbkq fbkr fbks fblp fblq fblr fbls fcjp fcjq fcjr fcjs fckp fckq fckr fcks fclp fclq fclr fcls";
        String result4 = new UpgradeZeroToNineKeyBoard().getResult(digits4);
        Assert.assertEquals(expected4,result4);

        int[] digits5 = new int[]{3,25,7,2};
        String expected5 = "dajpa dajpb dajpc dajqa dajqb dajqc dajra dajrb dajrc dajsa dajsb dajsc dakpa dakpb dakpc dakqa dakqb dakqc dakra dakrb dakrc daksa daksb daksc dalpa dalpb dalpc dalqa dalqb dalqc dalra dalrb dalrc dalsa dalsb dalsc dbjpa dbjpb dbjpc dbjqa dbjqb dbjqc dbjra dbjrb dbjrc dbjsa dbjsb dbjsc dbkpa dbkpb dbkpc dbkqa dbkqb dbkqc dbkra dbkrb dbkrc dbksa dbksb dbksc dblpa dblpb dblpc dblqa dblqb dblqc dblra dblrb dblrc dblsa dblsb dblsc dcjpa dcjpb dcjpc dcjqa dcjqb dcjqc dcjra dcjrb dcjrc dcjsa dcjsb dcjsc dckpa dckpb dckpc dckqa dckqb dckqc dckra dckrb dckrc dcksa dcksb dcksc dclpa dclpb dclpc dclqa dclqb dclqc dclra dclrb dclrc dclsa dclsb dclsc eajpa eajpb eajpc eajqa eajqb eajqc eajra eajrb eajrc eajsa eajsb eajsc eakpa eakpb eakpc eakqa eakqb eakqc eakra eakrb eakrc eaksa eaksb eaksc ealpa ealpb ealpc ealqa ealqb ealqc ealra ealrb ealrc ealsa ealsb ealsc ebjpa ebjpb ebjpc ebjqa ebjqb ebjqc ebjra ebjrb ebjrc ebjsa ebjsb ebjsc ebkpa ebkpb ebkpc ebkqa ebkqb ebkqc ebkra ebkrb ebkrc ebksa ebksb ebksc eblpa eblpb eblpc eblqa eblqb eblqc eblra eblrb eblrc eblsa eblsb eblsc ecjpa ecjpb ecjpc ecjqa ecjqb ecjqc ecjra ecjrb ecjrc ecjsa ecjsb ecjsc eckpa eckpb eckpc eckqa eckqb eckqc eckra eckrb eckrc ecksa ecksb ecksc eclpa eclpb eclpc eclqa eclqb eclqc eclra eclrb eclrc eclsa eclsb eclsc fajpa fajpb fajpc fajqa fajqb fajqc fajra fajrb fajrc fajsa fajsb fajsc fakpa fakpb fakpc fakqa fakqb fakqc fakra fakrb fakrc faksa faksb faksc falpa falpb falpc falqa falqb falqc falra falrb falrc falsa falsb falsc fbjpa fbjpb fbjpc fbjqa fbjqb fbjqc fbjra fbjrb fbjrc fbjsa fbjsb fbjsc fbkpa fbkpb fbkpc fbkqa fbkqb fbkqc fbkra fbkrb fbkrc fbksa fbksb fbksc fblpa fblpb fblpc fblqa fblqb fblqc fblra fblrb fblrc fblsa fblsb fblsc fcjpa fcjpb fcjpc fcjqa fcjqb fcjqc fcjra fcjrb fcjrc fcjsa fcjsb fcjsc fckpa fckpb fckpc fckqa fckqb fckqc fckra fckrb fckrc fcksa fcksb fcksc fclpa fclpb fclpc fclqa fclqb fclqc fclra fclrb fclrc fclsa fclsb fclsc";
        String result5 = new UpgradeZeroToNineKeyBoard().getResult(digits5);
        Assert.assertEquals(expected5,result5);

        int[] digits6 = new int[]{};
        String expected6 = "An empty array was entered";
        String result6 = new UpgradeZeroToNineKeyBoard().getResult(digits6);
        Assert.assertEquals(expected6,result6);

        int[] digits7 = new int[]{0,1};
        String expected7 = "All numbers entered are 0 or 1";
        String result7 = new UpgradeZeroToNineKeyBoard().getResult(digits7);
        Assert.assertEquals(expected7,result7);
    }

}
