
import java.util.*;

public class Test38 {

    private static final int[][][] SLIKA = {
        {{ 62,  14, 226}, { 23,   6,  30}, {116, 141, 201}, {  0, 237, 134}, { 68,  69,  80}, {242, 193, 132}, { 25, 228, 139}, { 46, 151, 175}, { 36,  50, 253}, { 99,   9, 120}, {143,  97, 173}, {137, 102, 166}, {135,  60,  10}, { 80, 224, 249}, { 85,  24,  27}, {153,   8,  12}, {209, 172,  28}, {145,  99, 146}, {159,  25, 127}, {187, 116,   3}, {  3, 124,   2}, {179, 136, 163}, { 86,  55, 194}, {106, 131, 195}, {152,   5, 187}, { 48, 228, 111}},
        {{175, 159,  14}, {234, 253, 123}, { 82,  19, 228}, {187,   5,  26}, { 61, 164, 152}, {218, 154, 238}, { 61,  32,  54}, {242, 186, 167}, {233,  94, 111}, { 16, 122,  80}, {161, 126,  18}, { 73,  17,  98}, {110,  64,  47}, {250, 191, 108}, { 56, 110, 156}, {167, 205,   2}, {193,  75,  91}, { 22,  13, 161}, {  1,  52, 154}, {162,   6,   6}, { 14, 104, 171}, {251, 112,  90}, { 95,  51, 179}, { 22,  58, 240}, { 41, 130, 152}, { 93,  24,  16}},
        {{121,  98, 206}, {163,  47, 186}, {109, 253, 241}, { 99,  98,  37}, {203,  94, 227}, { 81,  35,  46}, { 86,  24, 238}, {  8,  19,  22}, {246, 183,  21}, { 72, 145, 118}, {166,  38,  17}, {195, 165,   2}, {253, 210,  88}, {132,  36,  27}, {252,  97, 174}, {  9, 183,  72}, {212, 105, 243}, {195,  61, 121}, {232,  44,  30}, {189,  92,  48}, {181,  58, 250}, { 11, 165, 202}, {194, 123, 187}, {156,  78,  19}, {156, 189, 184}, {233, 137, 118}},
        {{116, 185, 251}, {120,  95,  17}, {103,  38,  97}, {210,  26, 158}, {147, 124, 164}, {172,  43,  86}, {125,  93,  11}, { 68,  35, 168}, {184, 153, 230}, {218, 182, 215}, { 86,  11, 198}, { 81, 239,  85}, {123,   4,   5}, {154, 114,  44}, {104,  91,  65}, {169, 110, 224}, { 71, 187, 141}, { 17, 145,  31}, {148,  39, 173}, {243,  57,  65}, {127,  38, 110}, {215,  37, 140}, { 71, 222,   8}, {101, 214, 116}, { 59, 126, 129}, {127,  87, 168}},
        {{ 23,  23,  27}, {167,  68,  76}, {250,  56,  81}, {164,  35,  74}, {206,  46, 156}, {255, 110, 135}, {170,  29,  87}, {215,  95,  29}, {161, 124, 182}, { 69, 255,  63}, {188, 234, 104}, {242,  48, 208}, {197,  35, 101}, {137, 139, 159}, {216, 198,  50}, { 47,  35,   8}, { 76,  52,   3}, { 51,  13, 170}, {111,  28, 187}, { 25, 117, 238}, {171,  72,  17}, {229, 145, 168}, {101,  59,  19}, { 67, 105, 116}, { 14,  15, 141}, {206,  76, 104}},
        {{ 61,  68,  88}, { 55,  52,  70}, {211, 216, 110}, { 13, 158,  55}, { 51, 191, 175}, {108,  57,  20}, {100,  24,   1}, { 38,  13,  51}, {185, 149, 222}, {122, 232, 154}, { 37, 242, 193}, {152,  58,  67}, {245,  29,  70}, {120, 103, 118}, {189,  12,  90}, { 72,   7, 136}, {147, 141, 182}, {182,   2,  60}, { 85,  74, 147}, {169, 112, 148}, { 56,   1,  86}, { 34, 247,  38}, { 83, 211, 178}, {144,  55, 121}, { 19, 152, 189}, {153,  98,   6}},
        {{ 55,  39, 150}, { 73,  11, 118}, {189,  56, 158}, {170,  18, 178}, {211, 205, 241}, { 97,  22,  48}, {237, 217, 153}, { 54,   4, 170}, {248, 140, 150}, {103, 209, 146}, {116, 135,   2}, {215, 202, 255}, { 53, 123, 193}, {165, 228, 237}, {234, 162, 157}, { 12, 151, 198}, { 35,  45,  69}, { 98,   2,  62}, { 64,  13,  84}, { 83,  61, 148}, {161, 146,  88}, {148, 209,  35}, {175, 138,   6}, { 80,  79,  72}, { 57,  43,  56}, { 11,  41,  91}},
        {{ 59, 255, 168}, {244, 173,  46}, { 38, 183,  89}, { 20,  68, 230}, {178,  60, 170}, { 68, 180,  98}, {217, 151,  74}, {138, 196,  55}, {128, 105, 197}, {141, 247, 117}, {121, 107, 106}, { 16,   9,   8}, {  4,  55, 205}, {114,   7, 175}, {227, 154,  73}, {132,  28, 181}, {239, 180, 218}, {207, 225,  31}, {138,  61, 151}, { 64,  42, 143}, {172, 144, 136}, { 68, 145, 177}, {151,  31, 236}, {151,  61, 255}, {131, 100,  92}, { 81,  76,  14}},
        {{219,  71, 147}, { 67, 125, 143}, {255, 123,  35}, { 43, 111, 160}, {  0, 203, 217}, {182, 100,  33}, {208, 171, 120}, { 64,  25, 162}, {254, 111, 242}, { 51, 196,  61}, { 56,  29, 203}, {194, 178,  68}, {235, 155, 221}, { 75,  58,  83}, {128,  50, 128}, { 71,  57,  77}, { 14,  96, 208}, { 39,  90, 174}, { 59,  58, 219}, {239,  51,  50}, { 65,  89,  99}, {147, 105, 164}, { 28,   9,   2}, { 10, 210,  75}, {243, 232,  15}, { 79,  82,  80}},
        {{ 98,  76,  55}, {218, 207,  26}, {248, 101,  44}, {160,  43,  74}, {198, 102, 166}, {154,  16, 226}, {249,  46, 210}, { 67, 123, 192}, {202, 150,   1}, { 77, 234,  51}, {147,  40, 187}, {108,  41,  99}, {159, 107, 167}, {148,  94, 218}, {  4,  12,  42}, { 26, 169, 242}, {113, 106, 113}, {182, 167,   5}, {134, 152, 237}, {236,  78, 227}, {241,  19,   5}, { 68,  19,  39}, {121, 103, 158}, {220,  28, 120}, { 44,  72, 182}, {228, 118,  61}},
        {{132, 241, 165}, {117, 226,  39}, {155, 172, 201}, { 19, 214, 115}, {113,  17, 134}, {130, 172, 184}, { 33,   9,  24}, {  3, 119, 128}, {251,   3,  49}, {231, 235,  96}, { 49, 109, 169}, {130,  86,   6}, {183, 116,  68}, {202, 170,  95}, {136, 136,  30}, {116,   1,  35}, {239, 173, 121}, {181, 244, 234}, {110, 204, 208}, {182,   7, 229}, {131,  11,  71}, { 70,  61, 239}, {159,  37,  60}, { 20,  34, 126}, { 94,  53, 124}, {187, 240, 232}},
        {{230,   7, 134}, {  4,  18,  54}, {140,  32,  37}, {238, 236,  50}, {115,  86, 108}, {230,  65,  41}, { 37, 120, 240}, {227, 171, 205}, {212,  68, 249}, { 13,  82, 101}, {162,  86, 189}, { 76,  37,  50}, {251,  23,  41}, {107, 249, 167}, {177, 255, 147}, { 21,  35,  45}, { 97,   9,  50}, {250, 173,  46}, { 20, 116, 190}, {221, 200,  63}, {133,  34, 136}, {150,  14,   0}, {204,  32, 225}, {135, 182,   5}, { 72,  16,  28}, { 50,  13, 246}},
        {{128,  83,  47}, {103,  84, 236}, {159,   0, 133}, {184, 152, 171}, { 42,  94,  29}, {  6,  31, 224}, {252,   5, 107}, {238,  50, 102}, {218, 154,  38}, { 28, 232, 182}, {186, 106,  62}, {231, 198, 112}, { 33,  32,  11}, { 29,   6, 224}, {148,  78,  71}, {203,  74,  13}, {130, 158, 100}, { 90, 159, 184}, {201, 153, 184}, {170, 201, 159}, {209, 135, 129}, {161, 151, 133}, { 89, 149, 190}, {127,  62,  71}, {107,  63,  19}, { 55,   5, 182}},
        {{181, 203, 188}, {  2,  36,  45}, {211, 204, 188}, {  5, 219, 229}, {186, 166, 205}, { 43,  52, 249}, {109, 241, 221}, { 14,  64, 211}, { 83,  31, 204}, { 19,  74,  57}, { 31,  67, 119}, { 72,  22,  26}, { 77,  94, 241}, { 19,  75, 161}, {116,  97, 222}, {239,  19, 131}, { 78,  37, 250}, {238,  17,  64}, { 55, 164, 222}, {134,  32, 251}, {169,  44, 193}, {251, 238, 204}, { 28,  21, 231}, { 62, 169, 253}, {218, 110, 184}, { 27, 194, 195}},
        {{ 58,  65, 211}, { 63, 226,  49}, {253, 206,  28}, {182,  74, 192}, {197, 195, 204}, {221,  62, 173}, {122,  68, 124}, { 13,  52, 147}, {199, 164, 242}, {164, 208, 191}, {247, 170, 229}, { 24, 198, 222}, { 65,  60,  38}, { 99,  17,  62}, {  9,   3,  58}, {118, 138, 111}, {212, 239,  15}, { 17,  22, 139}, {145,  96,  64}, { 92,  98, 168}, {  2,  79, 141}, { 77, 102, 231}, { 88,  65,  17}, {220, 175, 244}, {  9,  98, 124}, { 16,  75, 250}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}