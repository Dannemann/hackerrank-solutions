package prepare.datastructures.arrays._3_dynamic_array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(output0(), s.dynamicArray(100, input0()));
            assertEquals(List.of(7, 3), s.dynamicArray(2, input10()));
        }
    }

    List<List<Integer>> input0() {
        List<List<Integer>> r = new ArrayList<>(100);
        r.add(Arrays.asList(1, 345255357, 205970905));
        r.add(Arrays.asList(1, 570256166, 75865401));
        r.add(Arrays.asList(1, 94777800, 645102173));
        r.add(Arrays.asList(1, 227496730, 16649450));
        r.add(Arrays.asList(1, 82987157, 486734305));
        r.add(Arrays.asList(1, 917920354, 757848208));
        r.add(Arrays.asList(1, 61379773, 817694251));
        r.add(Arrays.asList(1, 330547128, 112869154));
        r.add(Arrays.asList(1, 328743001, 855677723));
        r.add(Arrays.asList(1, 407951306, 669798718));
        r.add(Arrays.asList(1, 21506172, 676980108));
        r.add(Arrays.asList(1, 49911390, 342109400));
        r.add(Arrays.asList(1, 980306253, 305632965));
        r.add(Arrays.asList(2, 736380701, 402184046));
        r.add(Arrays.asList(2, 798108301, 416334323));
        r.add(Arrays.asList(1, 254839279, 1370035));
        r.add(Arrays.asList(1, 109701362, 2800586));
        r.add(Arrays.asList(1, 374257441, 165208824));
        r.add(Arrays.asList(1, 624259835, 477431250));
        r.add(Arrays.asList(1, 629066664, 454406245));
        r.add(Arrays.asList(1, 135821145, 763845832));
        r.add(Arrays.asList(1, 480298791, 138234911));
        r.add(Arrays.asList(1, 553575409, 835718837));
        r.add(Arrays.asList(1, 13022848, 624652920));
        r.add(Arrays.asList(1, 974893519, 882630870));
        r.add(Arrays.asList(1, 137832930, 216177975));
        r.add(Arrays.asList(1, 453349691, 969255659));
        r.add(Arrays.asList(1, 138396076, 91038209));
        r.add(Arrays.asList(1, 699822497, 941751038));
        r.add(Arrays.asList(1, 116800806, 64071662));
        r.add(Arrays.asList(1, 815273934, 8835809));
        r.add(Arrays.asList(1, 658534867, 657771609));
        r.add(Arrays.asList(1, 183760807, 179377441));
        r.add(Arrays.asList(1, 93984556, 636425656));
        r.add(Arrays.asList(1, 231506463, 836238924));
        r.add(Arrays.asList(1, 214074594, 709571211));
        r.add(Arrays.asList(1, 649641434, 509698468));
        r.add(Arrays.asList(2, 523656673, 709717705));
        r.add(Arrays.asList(2, 261443586, 330808140));
        r.add(Arrays.asList(1, 75924023, 449768243));
        r.add(Arrays.asList(1, 849537714, 354568873));
        r.add(Arrays.asList(2, 641743742, 124196560));
        r.add(Arrays.asList(1, 19829224, 995759639));
        r.add(Arrays.asList(1, 244389335, 108315212));
        r.add(Arrays.asList(1, 877758467, 421383626));
        r.add(Arrays.asList(1, 573278148, 474192994));
        r.add(Arrays.asList(2, 561031511, 448889978));
        r.add(Arrays.asList(1, 773294404, 980994962));
        r.add(Arrays.asList(2, 33088709, 716646168));
        r.add(Arrays.asList(1, 760927835, 441983538));
        r.add(Arrays.asList(1, 273540687, 783321829));
        r.add(Arrays.asList(1, 5933845, 384358662));
        r.add(Arrays.asList(1, 543628702, 372160176));
        r.add(Arrays.asList(2, 136400466, 910559291));
        r.add(Arrays.asList(2, 546568738, 393221347));
        r.add(Arrays.asList(1, 812227065, 694221123));
        r.add(Arrays.asList(1, 311065574, 103905420));
        r.add(Arrays.asList(2, 571344361, 185289590));
        r.add(Arrays.asList(1, 99638520, 173318136));
        r.add(Arrays.asList(1, 854060080, 407068012));
        r.add(Arrays.asList(2, 980658213, 778573744));
        r.add(Arrays.asList(2, 412539660, 476853104));
        r.add(Arrays.asList(1, 530145366, 36493537));
        r.add(Arrays.asList(1, 604875364, 100141497));
        r.add(Arrays.asList(2, 650812104, 64817757));
        r.add(Arrays.asList(1, 141060009, 766603553));
        r.add(Arrays.asList(1, 598398952, 418245941));
        r.add(Arrays.asList(1, 262344011, 431865586));
        r.add(Arrays.asList(2, 56413893, 546484833));
        r.add(Arrays.asList(1, 400736735, 673588153));
        r.add(Arrays.asList(1, 642955232, 803851098));
        r.add(Arrays.asList(1, 917782037, 935143105));
        r.add(Arrays.asList(1, 658284524, 745224102));
        r.add(Arrays.asList(1, 103202288, 501551287));
        r.add(Arrays.asList(1, 162144918, 12888783));
        r.add(Arrays.asList(1, 16486753, 67467208));
        r.add(Arrays.asList(1, 671120703, 941541277));
        r.add(Arrays.asList(1, 47399694, 77707668));
        r.add(Arrays.asList(1, 122011395, 946116527));
        r.add(Arrays.asList(1, 924363862, 886726236));
        r.add(Arrays.asList(2, 657761235, 540240467));
        r.add(Arrays.asList(1, 203175991, 279882007));
        r.add(Arrays.asList(2, 304620923, 162838413));
        r.add(Arrays.asList(1, 440453449, 117964712));
        r.add(Arrays.asList(2, 941868853, 887850334));
        r.add(Arrays.asList(1, 293198923, 466812643));
        r.add(Arrays.asList(1, 461688477, 532794906));
        r.add(Arrays.asList(1, 315016797, 733095902));
        r.add(Arrays.asList(1, 265008751, 913972757));
        r.add(Arrays.asList(1, 887405255, 139170948));
        r.add(Arrays.asList(2, 754223230, 426836947));
        r.add(Arrays.asList(1, 945967814, 852589735));
        r.add(Arrays.asList(1, 168866283, 309720694));
        r.add(Arrays.asList(1, 373861145, 94596540));
        r.add(Arrays.asList(2, 984122495, 20702849));
        r.add(Arrays.asList(2, 233835636, 180460242));
        r.add(Arrays.asList(1, 172787631, 643823473));
        r.add(Arrays.asList(1, 273611372, 616819555));
        r.add(Arrays.asList(1, 196104599, 690080895));
        r.add(Arrays.asList(1, 527554061, 434103342));
        return r;
    }

    List<Integer> output0() {
        return List.of(
                855677723,
                75865401,
                763845832,
                75865401,
                709571211,
                645102173,
                112869154,
                763845832,
                449768243,
                757848208,
                91038209,
                205970905,
                783321829,
                372160176,
                384358662,
                67467208,
                935143105,
                384358662,
                309720694,
                138234911
        );
    }

    List<List<Integer>> input10() {
        List<List<Integer>> r = new ArrayList<>(5);
        r.add(Arrays.asList(1, 0, 5));
        r.add(Arrays.asList(1, 1, 7));
        r.add(Arrays.asList(1, 0, 3));
        r.add(Arrays.asList(2, 1, 0));
        r.add(Arrays.asList(2, 1, 1));
        return r;
    }

}
