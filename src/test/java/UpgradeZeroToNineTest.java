import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UpgradeZeroToNineTest {
    @Test
    public void test1(){
        int[] digits = new int[]{4};
        String expected = "g h i";
        String result = new UpgradeZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test2(){
        int[] digits = new int[]{3,100};
        String expected = "Please enter a number between 0 and 99 !";
        String result = new UpgradeZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test3(){
        int[] digits = new int[]{2,99};
        String expected = "aww awx awy awz axw axx axy axz ayw ayx ayy ayz azw azx azy azz bww bwx bwy bwz bxw bxx bxy bxz byw byx byy byz bzw bzx bzy bzz cww cwx cwy cwz cxw cxx cxy cxz cyw cyx cyy cyz czw czx czy czz";
        String result = new UpgradeZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test4(){
        int[] digits = new int[]{3,25,7};
        String expected = "dajp dajq dajr dajs dakp dakq dakr daks dalp dalq dalr dals dbjp dbjq dbjr dbjs dbkp dbkq dbkr dbks dblp dblq dblr dbls dcjp dcjq dcjr dcjs dckp dckq dckr dcks dclp dclq dclr dcls eajp eajq eajr eajs eakp eakq eakr eaks ealp ealq ealr eals ebjp ebjq ebjr ebjs ebkp ebkq ebkr ebks eblp eblq eblr ebls ecjp ecjq ecjr ecjs eckp eckq eckr ecks eclp eclq eclr ecls fajp fajq fajr fajs fakp fakq fakr faks falp falq falr fals fbjp fbjq fbjr fbjs fbkp fbkq fbkr fbks fblp fblq fblr fbls fcjp fcjq fcjr fcjs fckp fckq fckr fcks fclp fclq fclr fcls";
        String result = new UpgradeZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test5(){
        int[] digits = new int[]{3,25,7,2};
        String expected = "dajpa dajpb dajpc dajqa dajqb dajqc dajra dajrb dajrc dajsa dajsb dajsc dakpa dakpb dakpc dakqa dakqb dakqc dakra dakrb dakrc daksa daksb daksc dalpa dalpb dalpc dalqa dalqb dalqc dalra dalrb dalrc dalsa dalsb dalsc dbjpa dbjpb dbjpc dbjqa dbjqb dbjqc dbjra dbjrb dbjrc dbjsa dbjsb dbjsc dbkpa dbkpb dbkpc dbkqa dbkqb dbkqc dbkra dbkrb dbkrc dbksa dbksb dbksc dblpa dblpb dblpc dblqa dblqb dblqc dblra dblrb dblrc dblsa dblsb dblsc dcjpa dcjpb dcjpc dcjqa dcjqb dcjqc dcjra dcjrb dcjrc dcjsa dcjsb dcjsc dckpa dckpb dckpc dckqa dckqb dckqc dckra dckrb dckrc dcksa dcksb dcksc dclpa dclpb dclpc dclqa dclqb dclqc dclra dclrb dclrc dclsa dclsb dclsc eajpa eajpb eajpc eajqa eajqb eajqc eajra eajrb eajrc eajsa eajsb eajsc eakpa eakpb eakpc eakqa eakqb eakqc eakra eakrb eakrc eaksa eaksb eaksc ealpa ealpb ealpc ealqa ealqb ealqc ealra ealrb ealrc ealsa ealsb ealsc ebjpa ebjpb ebjpc ebjqa ebjqb ebjqc ebjra ebjrb ebjrc ebjsa ebjsb ebjsc ebkpa ebkpb ebkpc ebkqa ebkqb ebkqc ebkra ebkrb ebkrc ebksa ebksb ebksc eblpa eblpb eblpc eblqa eblqb eblqc eblra eblrb eblrc eblsa eblsb eblsc ecjpa ecjpb ecjpc ecjqa ecjqb ecjqc ecjra ecjrb ecjrc ecjsa ecjsb ecjsc eckpa eckpb eckpc eckqa eckqb eckqc eckra eckrb eckrc ecksa ecksb ecksc eclpa eclpb eclpc eclqa eclqb eclqc eclra eclrb eclrc eclsa eclsb eclsc fajpa fajpb fajpc fajqa fajqb fajqc fajra fajrb fajrc fajsa fajsb fajsc fakpa fakpb fakpc fakqa fakqb fakqc fakra fakrb fakrc faksa faksb faksc falpa falpb falpc falqa falqb falqc falra falrb falrc falsa falsb falsc fbjpa fbjpb fbjpc fbjqa fbjqb fbjqc fbjra fbjrb fbjrc fbjsa fbjsb fbjsc fbkpa fbkpb fbkpc fbkqa fbkqb fbkqc fbkra fbkrb fbkrc fbksa fbksb fbksc fblpa fblpb fblpc fblqa fblqb fblqc fblra fblrb fblrc fblsa fblsb fblsc fcjpa fcjpb fcjpc fcjqa fcjqb fcjqc fcjra fcjrb fcjrc fcjsa fcjsb fcjsc fckpa fckpb fckpc fckqa fckqb fckqc fckra fckrb fckrc fcksa fcksb fcksc fclpa fclpb fclpc fclqa fclqb fclqc fclra fclrb fclrc fclsa fclsb fclsc";
        String result = new UpgradeZeroToNineKeyBoard().getResult(digits);
        Assert.assertEquals(expected,result);
    }
}
