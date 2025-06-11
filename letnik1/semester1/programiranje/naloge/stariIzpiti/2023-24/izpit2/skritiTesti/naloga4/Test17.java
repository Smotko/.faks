
import java.util.*;
import java.util.function.*;

public class Test17 {

    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> a.length() - b.length();

        List<List<String>> seznami = List.of(
            List.of("mfsg", "twjfnviibcpwjvyyqjgm", "kpeoc", "twjfnviibcpwjvyyqjgm", "msffixfk", "pbvinzkmqgahruuuil", "qupjtrx", "pbvinzkmqgahruuuil", "qupjtrx", "pbvinzkmqgahruuuil", "qupjtrx", "pbvinzkmqgahruuuil", "qupjtrx", "pbvinzkmqgahruuuil", "msffixfk", "wlgyndzdtvubx", "msffixfk", "wlgyndzdtvubx", "bwskjpsrg", "wlgyndzdtvubx", "zgxihgommzd", "wlgyndzdtvubx", "zgxihgommzd", "wlgyndzdtvubx", "zgxihgommzd", "zgxihgommzd", "zgxihgommzd", "mttsaespvuy", "mttsaespvuy", "mttsaespvuy", "zgxihgommzd", "zgxihgommzd", "mttsaespvuy", "mttsaespvuy", "zgxihgommzd", "zgxihgommzd", "zgxihgommzd", "zgxihgommzd", "wlgyndzdtvubx", "bwskjpsrg", "wlgyndzdtvubx", "bwskjpsrg", "wlgyndzdtvubx", "bwskjpsrg", "wlgyndzdtvubx", "bwskjpsrg", "wlgyndzdtvubx", "msffixfk", "wlgyndzdtvubx", "msffixfk", "wlgyndzdtvubx", "msffixfk", "wlgyndzdtvubx", "msffixfk", "pbvinzkmqgahruuuil", "qupjtrx", "pbvinzkmqgahruuuil", "msffixfk", "twjfnviibcpwjvyyqjgm", "qupjtrx", "twjfnviibcpwjvyyqjgm", "qupjtrx", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm"),
            List.of("qupjtrx", "pbvinzkmqgahruuuil", "mfsg", "mttsaespvuy", "bwskjpsrg", "msffixfk", "wlgyndzdtvubx", "kpeoc"),
            List.of("kpeoc", "zgxihgommzd", "mfsg", "msffixfk"),
            List.of("mfsg", "twjfnviibcpwjvyyqjgm", "qupjtrx", "wlgyndzdtvubx", "mttsaespvuy", "pbvinzkmqgahruuuil", "msffixfk", "kpeoc"),
            List.of("mfsg", "wlgyndzdtvubx", "qupjtrx", "bwskjpsrg", "pbvinzkmqgahruuuil", "kpeoc", "twjfnviibcpwjvyyqjgm"),
            List.of("mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "kpeoc", "twjfnviibcpwjvyyqjgm", "kpeoc", "twjfnviibcpwjvyyqjgm", "kpeoc", "twjfnviibcpwjvyyqjgm", "kpeoc", "twjfnviibcpwjvyyqjgm", "kpeoc", "pbvinzkmqgahruuuil", "kpeoc", "pbvinzkmqgahruuuil", "kpeoc", "pbvinzkmqgahruuuil", "kpeoc", "pbvinzkmqgahruuuil", "kpeoc", "wlgyndzdtvubx", "kpeoc", "wlgyndzdtvubx", "qupjtrx", "wlgyndzdtvubx", "qupjtrx", "wlgyndzdtvubx", "qupjtrx", "mttsaespvuy", "qupjtrx", "zgxihgommzd", "msffixfk", "mttsaespvuy", "msffixfk", "mttsaespvuy", "msffixfk", "mttsaespvuy", "msffixfk", "zgxihgommzd", "msffixfk", "bwskjpsrg", "bwskjpsrg", "bwskjpsrg", "bwskjpsrg", "bwskjpsrg", "bwskjpsrg", "bwskjpsrg", "bwskjpsrg", "msffixfk", "bwskjpsrg", "msffixfk", "bwskjpsrg", "msffixfk", "bwskjpsrg", "msffixfk", "mttsaespvuy", "qupjtrx", "mttsaespvuy", "qupjtrx", "mttsaespvuy", "qupjtrx", "mttsaespvuy", "qupjtrx", "mttsaespvuy", "qupjtrx", "wlgyndzdtvubx", "kpeoc", "wlgyndzdtvubx", "kpeoc", "wlgyndzdtvubx", "kpeoc", "wlgyndzdtvubx", "kpeoc", "wlgyndzdtvubx", "kpeoc", "pbvinzkmqgahruuuil", "kpeoc", "pbvinzkmqgahruuuil", "mfsg", "pbvinzkmqgahruuuil", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg", "twjfnviibcpwjvyyqjgm", "mfsg"),
            List.of("twjfnviibcpwjvyyqjgm", "mttsaespvuy"),
            List.of("mfsg", "mfsg", "mttsaespvuy", "msffixfk", "mttsaespvuy", "msffixfk", "zgxihgommzd", "qupjtrx", "zgxihgommzd", "zgxihgommzd", "wlgyndzdtvubx"),
            List.of("mfsg", "twjfnviibcpwjvyyqjgm", "kpeoc", "twjfnviibcpwjvyyqjgm", "kpeoc", "twjfnviibcpwjvyyqjgm", "qupjtrx", "twjfnviibcpwjvyyqjgm", "msffixfk", "pbvinzkmqgahruuuil", "bwskjpsrg", "wlgyndzdtvubx", "bwskjpsrg", "wlgyndzdtvubx", "zgxihgommzd", "bwskjpsrg", "wlgyndzdtvubx", "kpeoc", "wlgyndzdtvubx", "mfsg", "wlgyndzdtvubx", "mfsg", "twjfnviibcpwjvyyqjgm"),
            List.of("pbvinzkmqgahruuuil", "kpeoc", "bwskjpsrg", "zgxihgommzd", "wlgyndzdtvubx", "msffixfk", "twjfnviibcpwjvyyqjgm")
        );

        for (List<String> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
