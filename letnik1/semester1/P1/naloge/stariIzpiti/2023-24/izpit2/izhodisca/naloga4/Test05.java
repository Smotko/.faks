
import java.util.*;
import java.util.function.*;

public class Test05 {

    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> b.length() - a.length();

        List<List<String>> seznami = List.of(
            List.of("ufzmnwgeryjiidmzrkhi", "fdc", "odafsvufmbh", "fjtdanxzlckeujznnj", "hzdbvr"),
            List.of("vbvbozqgg", "aacaxh", "aacaxh", "hzdbvr", "hzdbvr", "odafsvufmbh", "bayrzl", "vbvbozqgg", "fdc"),
            List.of("kxaqyyanlngblbpt", "bayrzl", "vbvbozqgg", "odafsvufmbh", "fdc"),
            List.of("grvwdfbwvhzlxcin", "odafsvufmbh", "bayrzl"),
            List.of("ufzmnwgeryjiidmzrkhi", "aacaxh", "vbvbozqgg", "odafsvufmbh", "fjtdanxzlckeujznnj", "aacaxh"),
            List.of("ufzmnwgeryjiidmzrkhi", "aacaxh", "kxaqyyanlngblbpt", "odafsvufmbh", "vbvbozqgg", "fjtdanxzlckeujznnj", "fdc"),
            List.of("ufzmnwgeryjiidmzrkhi", "fdc", "ufzmnwgeryjiidmzrkhi", "fdc", "ufzmnwgeryjiidmzrkhi", "fdc", "ufzmnwgeryjiidmzrkhi", "fdc", "fjtdanxzlckeujznnj", "fdc", "fjtdanxzlckeujznnj", "fdc", "kxaqyyanlngblbpt", "hzdbvr", "kxaqyyanlngblbpt", "bayrzl", "kxaqyyanlngblbpt", "bayrzl", "kxaqyyanlngblbpt", "bayrzl", "kxaqyyanlngblbpt", "bayrzl", "kxaqyyanlngblbpt", "bayrzl", "kxaqyyanlngblbpt", "bayrzl", "kxaqyyanlngblbpt", "aacaxh", "grvwdfbwvhzlxcin", "bayrzl", "grvwdfbwvhzlxcin", "hzdbvr", "grvwdfbwvhzlxcin", "bayrzl", "grvwdfbwvhzlxcin", "aacaxh", "odafsvufmbh", "bayrzl", "odafsvufmbh", "aacaxh", "odafsvufmbh", "hzdbvr", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "vbvbozqgg", "bayrzl", "odafsvufmbh", "bayrzl", "odafsvufmbh", "hzdbvr", "odafsvufmbh", "aacaxh", "odafsvufmbh", "aacaxh", "kxaqyyanlngblbpt", "bayrzl", "grvwdfbwvhzlxcin", "hzdbvr", "kxaqyyanlngblbpt", "bayrzl", "grvwdfbwvhzlxcin", "bayrzl", "grvwdfbwvhzlxcin", "aacaxh", "grvwdfbwvhzlxcin", "aacaxh", "grvwdfbwvhzlxcin", "aacaxh", "kxaqyyanlngblbpt", "bayrzl", "grvwdfbwvhzlxcin", "bayrzl", "fjtdanxzlckeujznnj", "bayrzl", "fjtdanxzlckeujznnj", "hzdbvr", "fjtdanxzlckeujznnj", "hzdbvr", "ufzmnwgeryjiidmzrkhi", "bayrzl", "ufzmnwgeryjiidmzrkhi", "fdc", "ufzmnwgeryjiidmzrkhi", "fdc", "ufzmnwgeryjiidmzrkhi", "fdc"),
            List.of("ufzmnwgeryjiidmzrkhi", "hzdbvr", "kxaqyyanlngblbpt", "odafsvufmbh", "vbvbozqgg", "fjtdanxzlckeujznnj", "fdc"),
            List.of("fjtdanxzlckeujznnj", "fdc", "fjtdanxzlckeujznnj", "fdc", "grvwdfbwvhzlxcin", "fdc", "grvwdfbwvhzlxcin", "odafsvufmbh", "kxaqyyanlngblbpt", "hzdbvr", "grvwdfbwvhzlxcin", "bayrzl", "grvwdfbwvhzlxcin", "hzdbvr", "odafsvufmbh", "hzdbvr", "odafsvufmbh", "vbvbozqgg", "fdc", "vbvbozqgg", "vbvbozqgg", "odafsvufmbh", "vbvbozqgg", "grvwdfbwvhzlxcin", "vbvbozqgg", "grvwdfbwvhzlxcin", "hzdbvr", "kxaqyyanlngblbpt", "hzdbvr", "kxaqyyanlngblbpt", "hzdbvr", "kxaqyyanlngblbpt", "aacaxh", "fjtdanxzlckeujznnj", "fdc", "ufzmnwgeryjiidmzrkhi", "fdc", "ufzmnwgeryjiidmzrkhi"),
            List.of("aacaxh")
        );

        for (List<String> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
