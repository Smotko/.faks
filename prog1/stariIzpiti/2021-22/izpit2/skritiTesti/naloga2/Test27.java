
import java.util.*;

public class Test27 {

    private static final int[][][] SLIKA = {
        {{ 85,  43,  75}, {218, 183,  47}, {224,   9, 180}, { 76,  47,  66}, {108,  18,  16}, { 60,   6,  29}, {194, 119, 202}, { 29,  19,  74}, {136,  27, 191}, {151, 131, 177}, { 52,  34,   7}, { 15, 232, 229}, {189, 162,  60}, {181, 250, 183}, { 90,  66, 114}, { 82,   3, 209}, {114, 118, 134}, { 59,  29,  92}, { 58,  80,  82}, {238, 173,   9}, { 57,  38, 179}, { 26, 147, 231}, { 46,  34,  96}, {185,  70,  95}, {128,  61, 218}, {175, 241, 190}, {239, 193,  77}, {119,  58, 101}, { 96, 135, 184}, { 49,  66, 123}, {  7, 106, 145}, { 74,  46, 213}, { 75,  37,  44}, { 37, 150, 236}, {169, 223,   5}, {248, 235,  81}, {186,  28, 222}, { 29, 102, 196}, { 68,  74, 101}, { 73,   3, 237}, {166, 106,  46}, { 59,  18, 132}, {196,  81, 135}, {167, 161, 147}, {249, 177,   6}, {252, 149, 183}, {223,  10, 157}, {144,  51, 192}, {208,  40,  76}, { 92,   5,  15}, { 16, 170,  59}, {145, 128,  76}, { 97, 106, 177}, { 88,  11,   3}, {206, 101,  60}, {172,  50,  11}, { 82,  17, 138}, { 28,  81,  38}, { 16,  46,  65}, {146, 127, 158}, {126,  39, 213}, {222, 176,  84}, {211, 170, 217}, { 77, 153,  49}, {204,   3,  58}, { 52,  82, 139}, {166, 107, 107}, {147,  93, 124}, {219, 130,  52}, {170,  11,  49}, {  6,  43,  71}, {192, 167,  64}, {216,  56,  89}, {244, 229,  39}, { 71,   3, 246}, {133, 182, 199}, {164,  23,  24}, {191,  97, 137}, { 91, 252,  25}, {140, 185, 240}, {184, 139,  54}, {139,  82,  92}, {116, 113, 181}, { 15,  64,  79}, { 79, 190, 255}, {199,  36,  58}, {194,  98,  69}, { 49, 156,  40}, {233, 232, 241}, { 95,  40, 202}},
        {{ 92,  90,  25}, {235,  75,   8}, {147, 106, 146}, {133, 111, 122}, {180,   2,  67}, {188,  32,  20}, {217,  27, 121}, { 36,  64,  81}, { 42,  89, 103}, {255, 123, 175}, { 83,  27, 229}, {161,  88,  69}, { 86,  63, 136}, {226, 138,  48}, { 57,   9, 188}, { 74, 200, 214}, {  2, 164, 165}, {106,  75,  78}, {242, 168, 149}, { 82,  59, 139}, { 48, 229, 120}, {219, 153,  61}, {129,  57,  99}, { 63,  79, 151}, {175,  69,  25}, {136, 139, 195}, {157, 105,  48}, { 14,   5,  52}, {120, 106,  62}, { 55,  82, 172}, {145,  45, 222}, {156,   6, 198}, {187, 141,  43}, { 39,  25,  35}, { 31, 132, 216}, {119,  10,   0}, {190, 178,  64}, {155,  72, 143}, { 75,  42,  66}, {169,  43,   1}, {164,  97, 183}, {252, 241, 206}, { 47,  44, 222}, {113,  84, 132}, { 93, 229,   5}, { 53,  15, 254}, {107, 182, 142}, { 58,  43, 131}, { 94,  27, 107}, {135,  95, 170}, {150,   6, 121}, { 41,  63,  88}, {146, 114, 174}, {131,  41, 134}, { 34,   8,  65}, {235, 128,  14}, { 99, 252,  71}, {242,   1,  52}, {218, 203, 244}, {197,  34,   7}, {143, 126,  80}, {142, 114,  66}, {216,  30,  99}, {237,  87, 111}, { 14,  50, 247}, {193,  95, 121}, {142,  92, 188}, {141,  84,   0}, {125, 162, 206}, { 25, 106, 166}, { 22,  43, 175}, { 45, 236,   6}, {196,  73, 125}, {170,  98, 184}, {133,  12, 120}, {133, 216, 110}, {148,  75, 213}, {202,  72,  28}, { 68, 140,  62}, {242,  37, 231}, {142,  74,  61}, {183, 117, 176}, {116,  88, 134}, {166,  72,  61}, {154,  83, 178}, { 78,  61,  89}, { 96,  93, 225}, {126,  64, 168}, {123,  30, 210}, {146,  29,  55}},
        {{233, 208,  29}, { 88,  85,  45}, { 90, 140, 156}, {228, 122, 125}, {169,  79,  82}, {115,   0, 185}, { 28,  73, 181}, { 11, 104, 108}, {150,   8, 120}, { 83,  76,  45}, {187,  61,  41}, { 42, 168, 181}, {195,  89, 223}, {130, 129,  40}, { 15, 192, 237}, { 80,  57,   7}, { 71,  45,   0}, {142, 131, 135}, {119,  97,  66}, { 82,  59,  70}, { 16,  31,  54}, { 99,  23,  62}, {207,  99,  64}, {176, 147, 192}, { 66,  59, 117}, {109, 198, 111}, {114,   3, 158}, {235, 127, 233}, {237, 167, 157}, {155, 131, 250}, {162, 126, 203}, { 78,  19, 188}, { 78, 145,  23}, {180, 114, 123}, {218,  76, 104}, {233,  20, 243}, {125, 177, 189}, {115, 128,  13}, { 83,  49,  22}, {110, 177, 121}, { 23, 100, 120}, {212,  93, 189}, {203, 183, 185}, {237,  25, 156}, {150,  67,  91}, { 96, 116, 202}, {253,  17, 179}, { 83, 153,  55}, {240, 247, 139}, { 94, 162, 233}, { 49,  30,  54}, {208, 129,  74}, { 66,  50,  62}, {190, 209,  59}, {177,  45,  78}, {210, 207, 113}, { 69, 224, 210}, {184, 127,  43}, { 69, 121,  97}, { 89, 224,  47}, {146, 197, 217}, {157,  30,  51}, { 73, 183,  53}, {114,  23, 116}, {131,  73,  98}, { 58, 108, 243}, { 50,   8, 116}, { 91,  44, 161}, { 51,  49,  23}, { 70,  42,  24}, { 67,  67,  28}, { 60,  21,   3}, { 47,  47,  63}, {154,  82,  54}, {216, 117, 250}, {138,  13, 190}, { 73,  39,  57}, { 12, 148, 156}, { 28, 164,  66}, {139,  51, 137}, {194, 232, 135}, {218, 170, 143}, {207, 112,  89}, { 13,  58,  20}, {206, 247,  61}, {133,  21,  77}, {165,  10, 218}, { 98,  35,  93}, {183,  93, 125}, {136, 172, 252}},
        {{ 66,   0,  30}, { 66,  13,  91}, { 59, 206,  55}, { 45,  20,  34}, {179, 130, 121}, { 48, 126, 154}, {167,  86,  57}, { 60, 198,  61}, { 89,  68,  27}, {107,  35, 253}, {194, 185,  55}, { 20, 114, 184}, { 39,  83, 180}, {  9,  17,  76}, {116,  82, 210}, { 39, 131, 222}, { 52, 242, 248}, {170, 100,  43}, { 99, 254, 155}, {198, 239,  41}, { 55,  76, 107}, { 51,  10, 111}, {110, 122,  37}, { 51,  30, 221}, { 88,  32,  24}, { 90,   4,   1}, { 14,  67,  67}, {123,  98,  52}, {  0,  63, 113}, { 95,  17,  60}, {102, 205, 147}, {164, 128, 238}, { 39, 238,   7}, {239,   5, 185}, { 23,  90, 116}, {253,  46,  65}, { 96, 232,  14}, {254, 241, 146}, {232, 202, 158}, { 49,  66, 116}, {118, 239, 244}, {143,  14, 116}, {203, 174,  34}, { 22,  11,  63}, {226, 110, 169}, {116,   7,  63}, {249,  50, 219}, {251,  40, 157}, { 73,  26,  39}, { 62, 106, 179}, { 57, 173, 137}, { 38,  47,  81}, {199, 129,   1}, { 50,  52, 103}, { 68,   7, 183}, { 12,   7,  76}, { 49, 238, 244}, {241,  58, 175}, {135, 117,  71}, { 52,  49,  82}, {141,  51, 205}, {164,  76, 227}, {171, 116, 250}, { 61, 159,  49}, { 78, 210, 121}, {107, 124, 239}, {234,  95, 151}, {127,  78, 115}, {  6,   0,  31}, { 46,   3, 215}, { 90,  21,  93}, {250,  79, 128}, {206,  56,  22}, { 99,   2, 241}, { 43, 228, 181}, {147,  10,  71}, { 24,  24,  18}, {155, 152,  58}, {130, 171,  60}, { 19, 199, 122}, {138, 190,  52}, { 35,  63, 179}, {168, 141, 109}, {235, 188, 245}, { 10,  82, 122}, { 53, 112, 118}, { 69,   3, 229}, {238, 177, 196}, { 12,  69, 133}, { 45, 124, 154}},
        {{ 94,  54,  95}, {228, 237,  21}, {227,  95,  33}, { 10,  40,  73}, {234, 230,  92}, { 17,  19,  49}, { 76,   9,  66}, {109,  45,  56}, { 59, 126, 254}, {  5, 193, 202}, { 81, 110, 120}, {180,  42,  58}, {178, 101, 224}, { 24,  40, 214}, { 19, 252, 205}, {241, 198, 111}, { 75, 144, 156}, {  2,  12,  74}, {174,   2,  89}, {214, 251,  12}, {109, 117,  65}, {111,   0, 174}, {133, 133,  23}, { 53, 114, 155}, {214,  33, 235}, {191,  84, 138}, {216, 139, 140}, { 60, 238,  76}, { 43,  52,  65}, {111, 186,  32}, {  2, 201,  16}, {128, 208, 213}, { 11,  57, 181}, { 73, 254, 171}, {186,  46,  16}, { 96,  23, 117}, { 63, 155,  90}, { 91, 133, 144}, {230, 108, 167}, {159, 135,   0}, { 45,  83, 190}, {103,  40,  67}, { 64, 119, 181}, {134, 116,  26}, { 51, 159, 209}, {218,  58,  65}, {125,  43, 254}, {235, 152, 254}, {180,  12, 172}, {247, 235,  47}, {234, 189,  25}, {236,  91, 144}, { 59,  57,  87}, {253,  26,  68}, {223, 141, 159}, {  1, 229,  32}, {202, 184,  57}, {100,  53,  56}, {216,  40, 127}, { 18,   0,  10}, {152, 139,  50}, {204,  51,  25}, { 11,  51,  60}, { 33, 112,  56}, { 57,  60, 145}, {212,  13, 130}, {199, 125, 164}, { 64, 211,  85}, { 20, 133, 236}, { 18,   6,  97}, { 87,  91, 147}, {107,  42, 135}, {181, 140, 105}, {120, 243, 231}, {159, 141, 175}, {235, 178, 150}, {120, 133, 124}, {211,  47, 144}, {110, 239, 193}, { 11,  39,  58}, {197, 102, 250}, {121,  55, 149}, {180,   7,  95}, {184, 132,  97}, { 50,  28,  20}, { 65,  41, 153}, { 15,  44, 177}, {  1, 105,  57}, {149,  47,  65}, {221,  57,   7}},
        {{191,  59, 118}, {195, 189, 191}, {252, 238, 235}, {149, 124, 202}, { 49, 117,  39}, { 23,  69,  99}, { 30,  26, 143}, {130,  11,  67}, {192,  76, 156}, {147, 181,  43}, {114, 222, 229}, { 86, 147,  48}, {166, 224, 126}, {132,  48, 138}, {205, 102, 156}, {123,   9,  81}, {180,   0,  33}, { 69,   7,  22}, {244, 177,   0}, { 74,  38,  38}, {135, 151,  83}, { 37,  65,  35}, {184,  43,  52}, { 55,  77, 211}, { 36,  75,  82}, { 41,  29,   9}, {101,  12,  64}, { 17, 251, 112}, { 26, 211,  11}, {242, 148,  10}, { 52,  58, 159}, {102,  31,  33}, { 14, 145, 168}, { 95, 182, 215}, {215,  60, 134}, {157,   8,  40}, {138, 131, 197}, { 28,  62, 182}, {199, 119, 174}, {165,  97,  33}, { 56,  74, 110}, {194,  71, 184}, {108, 246,  52}, { 22,  32,  63}, {118,  47,  71}, { 36,  15,  51}, {151, 118, 173}, {130,  18, 140}, {202, 116, 222}, {160,  95,  56}, {239, 191, 222}, {157, 131, 119}, {155,  80,  31}, {184, 120, 201}, {163, 139,  68}, {113, 173, 203}, {101, 136, 168}, {226, 207,  20}, { 23, 132, 235}, { 85,  43, 113}, { 59,  68,  95}, {171,  73, 137}, { 72,  18,   9}, {143, 171, 118}, { 59,  87,  89}, { 17, 191, 234}, {217, 130, 252}, { 28, 108, 143}, { 23,  46, 226}, { 21,  71, 233}, {106,   0,  97}, {211,  22,  87}, { 15,   6,  42}, {116,  93,  90}, {105,  24,  58}, { 46, 237, 106}, { 44, 113,  17}, {134, 137, 202}, { 47, 135,  50}, {137, 223,  80}, {117, 161, 172}, { 10, 239, 241}, {127, 119,  31}, { 20, 211, 240}, { 87,  49, 147}, {150,   8, 104}, { 96, 161,  66}, {220, 172,  78}, {164, 154, 132}, {113,  80, 162}},
        {{145, 224, 251}, { 17, 108, 192}, {239,  41, 103}, { 61, 101,  12}, {200, 124, 172}, {132,  64,  88}, { 17,  98, 194}, {205,  70, 220}, { 10,  22,  12}, {123,  52, 176}, {192,  53, 118}, { 27,  23,  92}, { 62,  19,  72}, {174, 204,  86}, {208, 168,  85}, {221,  55,  23}, {136,  25,  77}, {122, 240, 132}, { 25,  56,  62}, {126,  64, 190}, {  0, 105,  48}, { 52, 142, 189}, {125,  81, 249}, {191,  14, 120}, { 17,  43,  75}, {125,  32, 205}, {242, 204, 106}, { 75,  73,  39}, {198,  75,  11}, { 31, 155, 202}, {226, 221, 198}, { 61,   0, 120}, {158, 224, 153}, {251, 225,  89}, { 90, 215, 113}, {199,  24,  95}, { 49,  24,  49}, {  2,  55,  99}, {  0,   3,  42}, { 88,  96,  90}, {113,  35,   3}, { 53,  79, 206}, {103, 100, 202}, {102,  56,  81}, { 50,  75, 148}, { 59,  71, 177}, {157, 170,  18}, { 40,  50,  25}, { 57, 251, 221}, {164,   5,  26}, {237, 157, 138}, { 40, 111, 198}, { 59,   6,  37}, {115, 141, 188}, { 53, 126, 203}, { 30,   9, 209}, { 25, 146, 176}, { 63,  57, 233}, {189,  28, 169}, {180,  44, 238}, {132, 244,  84}, {228, 164, 238}, {  5, 147, 250}, {240,  25, 244}, { 36,  27,  10}, {124,   1,  99}, { 96,   4, 254}, {176,   7, 168}, { 22, 254, 155}, {134,  37,  67}, { 26,  47, 201}, {193,  10, 204}, {156,  34, 154}, {159, 136, 103}, {172, 213,  52}, {254, 127,  93}, {196,  53,  27}, { 94,  38,  52}, { 75, 111,  77}, {200, 151,  98}, {176,  33, 159}, {206,  32,  59}, { 32,  24,   0}, { 64,  10, 107}, { 27,  38,  87}, {121,  19,  86}, { 88, 182,  14}, { 38,  25, 132}, {129,  51, 108}, {214, 218,  84}},
        {{ 70,  42,  14}, { 35,  49,  85}, { 37, 194, 131}, {102,  73, 167}, {123,  19,   5}, {186, 172, 233}, { 11,   3, 193}, { 13, 137, 109}, {231, 138,  82}, {230, 148, 223}, {114,  39, 225}, {207, 230, 177}, {134,  50,  25}, { 68, 183, 184}, { 69,  73, 106}, { 96, 252,  72}, {147,  53,  45}, {133,  67,  50}, { 20, 135, 160}, {  9, 163, 186}, { 43,   3,  30}, {123, 223,  10}, {136, 144, 247}, { 52,  37,   6}, { 60, 144, 254}, {210,  40, 188}, { 44,  97, 101}, { 80, 133, 191}, {146, 244, 204}, {130,  61, 126}, { 44, 124, 191}, {  2, 159,  84}, {236, 117, 184}, {136,  71,  17}, {142,  56, 177}, {255, 204, 194}, {230, 125, 108}, { 58,  40,  48}, { 49, 102, 130}, {160,  90, 249}, {125,  86, 201}, { 70, 114, 115}, {103,  74, 198}, {235,  35, 105}, { 83,  54, 214}, { 67,  25,   7}, {221, 147,  86}, { 59, 232, 249}, {227, 222, 123}, {161, 126, 159}, { 30,  43,  61}, { 49,  32,  79}, { 21,  83, 167}, { 13, 158, 143}, { 64,  91, 137}, { 69,  36, 137}, { 56,  44, 121}, {181, 177, 139}, { 48,  83,  51}, {221,  22, 173}, {244, 123,  46}, { 16,  38,  67}, {158,  10,  95}, { 43, 158, 130}, {120, 236,  82}, {131,  27,  31}, {223, 121,  62}, {139, 207,  26}, {123,   8,  99}, { 71, 116, 219}, {100,  57, 207}, { 91,  58, 206}, { 71,  71, 205}, {172, 178,  97}, {192, 228, 120}, {190, 102, 117}, {217, 200,  63}, {121,  86,  64}, {132, 168,  67}, { 63, 175,  68}, {148, 214, 172}, { 74,  53,  61}, {165,  30,  58}, { 11, 206, 250}, { 11, 148,  31}, {136,  10, 166}, { 98, 129,  41}, { 50, 238, 189}, {185,  85,  54}, { 67,  38, 163}},
        {{  4,  19, 129}, {127,   0,  71}, {120,  70, 150}, {156, 138, 147}, {141, 108,  63}, {226,  88, 105}, {169,  87,  80}, {112, 105, 125}, {117,   2, 114}, { 95,  52, 216}, { 14,  94, 144}, {102,  96,  70}, { 69,   4,  16}, { 69, 215, 234}, {175,  21,  74}, { 97, 157,  40}, {178, 171,  98}, {107,  43,  74}, {253,  25,  79}, {227, 213,  75}, {233, 239, 184}, {180,  70, 146}, {175,  13, 111}, { 14,   8, 149}, {176, 156, 199}, {231, 216, 202}, { 90,  94, 216}, {115, 130, 155}, {183,  32, 140}, { 54,  66, 250}, { 20,  35,  93}, {210, 103,  55}, {156,  80, 135}, {117, 195,  19}, {102,  52,  18}, {185, 114, 237}, { 26,  95, 138}, {137,  35, 248}, {211, 103, 115}, {148, 197, 177}, {155, 187, 238}, {221,  46,  34}, { 88, 136,  66}, {179, 164, 104}, {207, 175,  35}, { 66,  54, 144}, { 93,  10,   5}, { 66, 201, 240}, { 96,  50, 100}, { 40,  50,  50}, {234,  49, 102}, { 95,  64,  72}, {218, 206,  70}, {163,  80, 128}, {203, 172, 188}, { 76,  67, 101}, {107,  94, 201}, {157,  48,  50}, {161, 108, 182}, { 56,  16,  55}, {227,  26, 214}, {105, 239, 255}, {215, 133,  53}, { 11,  86, 121}, { 96, 101,  37}, {153, 192, 224}, {246,  82,  21}, {134, 254, 250}, { 69, 190, 174}, {  6, 173, 202}, {209,  53, 138}, {  5, 123, 102}, { 32,  23,  82}, {102, 250, 232}, {127, 248,  88}, {135, 166, 228}, { 54, 138, 195}, { 41, 171,  74}, {197, 245, 217}, { 62,  43,  89}, { 48,  70, 199}, {246, 167, 147}, { 63,  75,  82}, { 81, 197, 208}, {172, 166,  38}, {132, 124,  83}, {108,  92,  71}, {149,  75,  37}, { 60,  78, 169}, { 30, 111,  45}},
        {{214, 145, 219}, {133,  18, 126}, {238, 232, 125}, { 46,  10,  65}, { 56, 179, 181}, {215,  30, 105}, {186,  24, 174}, {131, 150, 125}, {124, 174,  57}, { 45, 206, 107}, {214, 181, 241}, { 16,  97, 248}, {139, 102, 101}, {210, 159,  46}, { 31, 141,  68}, {230, 131, 190}, {171,  13, 235}, {245, 239, 163}, {213, 108, 200}, {206,  88, 159}, { 90,  43,  54}, {106, 171, 173}, { 66,  20, 146}, {105, 135, 165}, {138,  32, 146}, { 81,  69,  41}, { 36,  70, 123}, { 88, 107, 207}, {161,  18, 148}, {102,  89,  11}, {110, 150, 154}, { 10,  49, 126}, {134,  43,  63}, { 34,  66, 167}, { 14, 220, 133}, { 83,  24,  97}, {108,  57, 107}, { 65,  47,   8}, { 24,  10,  10}, {127,  10,  75}, { 97,   5, 130}, {135, 177, 169}, {140, 124,  95}, {238, 122, 128}, { 29,  13,  16}, {164,  80, 249}, {174, 197, 209}, { 63, 146,  89}, {142,  24,  92}, {154,  37,  69}, { 13,  17, 196}, {113,  16,  49}, { 67, 111,  64}, { 22,  58,  26}, {155,  26,  30}, { 25,  59, 168}, {218,  90,  39}, {  1,   1,   7}, {245, 180,  20}, { 17, 164,  22}, {254,  29, 217}, {102,  37, 184}, {143,  88,  15}, {125,  53, 170}, {206,  12,  33}, {198, 171, 219}, {172, 188,  67}, {197, 136, 200}, { 87,  55,  99}, {121, 207,   9}, { 56,  37,  57}, { 52,  36,  39}, {236, 180,  75}, {118, 217, 231}, {228, 248, 250}, { 27,  96,  80}, {215,   8, 182}, { 63, 126, 112}, { 11, 202, 137}, {  3,   0,  16}, {137,  68,  75}, {194,  21,  13}, { 96,  75, 134}, { 73,   8, 101}, {181, 209, 113}, {223, 161, 218}, {119, 111, 167}, { 80, 145,  13}, {170,  97,  80}, {232,  97,  47}},
        {{125,  19,  57}, {134, 197,  10}, {222,  57,  15}, {150, 145, 140}, { 71,  68,  65}, {173, 118,  94}, {192, 102, 213}, {121, 116, 179}, {191,  92, 251}, {207,  87, 234}, { 49,   6,  41}, {107,  81, 100}, {148, 117, 129}, {140,  51, 102}, {122, 181, 213}, { 75,  81, 215}, { 37, 178, 230}, { 34, 136, 233}, { 22, 209, 225}, { 44,  28,  54}, {225, 116,  74}, {201, 184, 208}, {118, 155, 176}, {142,  45, 182}, { 32, 205,  94}, { 21,  36,  30}, {221, 214, 105}, { 34,  26, 128}, { 44, 232, 182}, {250, 117, 231}, {161,  11, 130}, { 65,  40, 151}, {118,   3, 122}, { 29, 229, 243}, {187,  26, 106}, { 19, 155, 215}, { 26,  39,  94}, {183, 193, 117}, {130,  37,  70}, { 68,  22, 108}, {106, 164, 192}, {111, 184,  26}, {  0,  14,  17}, { 61, 186, 229}, { 69, 183, 177}, {218,  13, 119}, {218, 165, 103}, { 49,  69,  78}, { 89,  41, 151}, { 40, 122, 135}, {114, 227, 206}, { 83,  71,  99}, {198, 189,  50}, {135, 172,  76}, {247, 227, 191}, { 52, 133, 138}, {222, 234,  99}, {136, 132, 121}, {224, 148,  18}, { 86, 104, 136}, { 91,  13, 205}, {135,  54, 208}, {  4,  36,  63}, { 76,  75,   8}, {134,  61,  13}, {117,  79,  70}, {194,  34, 161}, {223, 252,  86}, { 61,  97, 155}, {194,  46, 147}, { 95, 190, 152}, {181,  90,  13}, { 23,   3, 185}, { 78,  37,  84}, {183,  97, 141}, {155, 105, 130}, {184,  84, 193}, {164,  92, 171}, { 85, 102,  32}, {241, 120,  73}, {147,  66, 184}, { 80,  32,   7}, {151,  15,  36}, {180, 144,  50}, { 22, 178, 160}, {105, 193,  89}, {129, 183, 215}, {116,  12, 119}, {196, 142,  97}, {  7, 155, 223}},
        {{ 86,  22,  62}, {146, 105, 197}, { 71,  66, 163}, { 76, 245, 120}, { 25,   8,  38}, {  1,   6,  54}, {219, 210,  29}, {105, 182, 245}, {232, 249,   4}, {206, 166,  61}, {177,  72, 183}, { 78,   9, 142}, { 32,  82, 132}, { 74,  14, 180}, {198, 144, 144}, {114, 118, 210}, { 66,  56,  22}, {  0,  85, 184}, {164,  58, 160}, {199, 145, 147}, {163, 138,  58}, {  4, 165, 108}, {133,  21, 149}, {232, 197,   4}, { 85,  22, 159}, {140, 126, 201}, { 93,  32,  67}, { 11, 148, 238}, {170, 151, 150}, {226,  32, 230}, { 88,  93, 230}, {204,  97, 110}, {245, 216, 143}, {249,  64, 134}, {123, 130, 184}, {237, 153, 103}, {208,  37, 253}, {138,  65,  21}, {155,  57,  19}, { 81, 166, 119}, { 80,   4,  73}, { 93,  26,  71}, {110, 135, 135}, {213, 173,  52}, {184, 115, 174}, { 41, 254,  78}, { 43, 212, 146}, {190, 137, 117}, {116,  67, 127}, {125,  51,  76}, {207,  90, 223}, { 32,  80, 236}, {242,  84,  67}, {249, 194, 112}, {180, 181, 163}, { 51,  20,  97}, {  7, 116, 203}, { 78,  16,   2}, { 32, 172, 191}, {250, 181, 138}, {168, 227, 243}, {247, 172, 139}, {136,  99, 192}, { 62,  18, 163}, {163,  52,  20}, {187, 138, 230}, {189, 135,  84}, { 43, 223,   6}, { 77,  76,  25}, {210,  84, 254}, {243, 166,   0}, {  3,  13,  18}, {205,  17, 140}, { 55,   8,  32}, {211,  28, 150}, {249,  64, 126}, {144,   9,  74}, {136, 147, 143}, {151, 233, 209}, {238,  31, 217}, { 13,  18,  54}, { 25, 107, 164}, { 26,  26,  19}, {130,  75, 122}, {207,  39, 156}, {128,  52, 194}, {134, 137,  31}, {  5,  11, 226}, {199, 117, 168}, { 19, 123, 253}},
        {{116,  49, 221}, { 90, 121, 176}, {138, 171,  92}, {244, 180, 112}, { 32, 126, 227}, {110,  59,  51}, {203,  56, 196}, { 14,  28,  44}, {212, 232, 139}, { 66, 139,  15}, {186, 247, 114}, {116,  19,  73}, { 88,  64, 149}, {128, 213,  68}, { 87, 186,  89}, {153, 187, 243}, {119,   8,  80}, {247,  54, 156}, {116,  85,  79}, {220, 196, 154}, {225,  75,  84}, { 15,  49,  24}, {138,  26,  11}, {186,  25, 181}, {223,  83, 246}, {146,   4,  54}, {108, 212, 221}, { 68, 194, 228}, { 50, 241, 254}, { 98, 253,  57}, {136, 135,  76}, {  9,  71, 104}, {181,  33,  46}, { 53, 190, 135}, { 83, 147, 203}, { 74, 124, 180}, { 14, 209, 187}, {152, 119, 141}, {198, 195, 158}, { 49, 168, 217}, {251, 174, 177}, {221,  48, 104}, {128, 157, 210}, {123,   5, 142}, { 72, 129, 181}, {141,  34, 117}, { 27,  92, 123}, { 52,  42, 169}, {  7,  11, 222}, { 17, 147, 236}, {204,  18, 133}, { 86,   6, 225}, {114, 109,  48}, {177,  49, 115}, {186, 148, 165}, {158,   9, 106}, {247,  77, 217}, { 47, 235, 244}, {227,  32, 228}, {120, 226, 177}, {206, 241, 188}, {162, 117,  34}, {203,  78, 189}, {122,  73,  76}, {148,  65,  77}, {220,  68, 230}, {145, 221, 249}, {152,  40,  79}, {225,  21,  29}, {126,  77,  82}, {251,   0, 253}, {246, 208, 109}, { 22,  54, 162}, {135, 135, 163}, {232,  90, 211}, {225, 171, 253}, {211, 189, 129}, {143, 164,  39}, {112, 243, 196}, { 91, 232, 252}, {240,  14, 252}, { 77,  42, 203}, { 57,  30,  25}, { 88,  99, 196}, { 58,   2, 221}, {187, 137,  82}, {110,  69, 115}, {220, 204, 224}, {209,   6,  50}, {165, 127,  46}},
        {{221,  12, 163}, { 28, 239, 166}, { 47,   1,  40}, {181, 196,  83}, { 92, 135, 208}, {152,  51,  27}, { 51,  18, 251}, {158, 105,  51}, {124, 115, 203}, {148, 120,   0}, {230, 159, 204}, {169,  77,  20}, { 57,   3,   1}, {244, 126,  83}, {195, 153, 125}, {176, 180,  16}, { 25,  44, 154}, { 65,  89, 196}, { 38, 114,  36}, {244, 185,  77}, { 61, 238,  36}, {189, 150, 182}, {  9, 194,  41}, { 11, 213, 214}, {147,  55, 179}, {116,  38,  86}, {100,  63,  75}, {147,  66, 133}, {217,  86, 123}, { 87,  85,   5}, {218,   1, 225}, { 33,  44, 216}, {243, 118,  53}, {149,   9, 252}, { 28, 159, 194}, { 32,  70, 186}, {104,  96,  40}, {238, 182, 175}, { 76,  94, 168}, {191,  28,  46}, {185, 126,  69}, { 22, 220,  80}, { 50,  15,  31}, {  4,  11,  11}, {236,  66, 177}, { 85, 232, 134}, {125,  41, 105}, { 31, 140, 210}, { 35,  13,  20}, {169, 156,  17}, { 93,  74, 117}, { 32, 124, 235}, {175,   0,  79}, { 72, 137,  75}, {146,  68,  14}, { 65,  36, 167}, {150,  55, 176}, { 54, 104, 229}, {234, 121,   9}, {125, 196,   5}, { 60,  47, 100}, { 50,  15, 196}, {121,  29,  88}, {  8,  13,  96}, {105, 152, 178}, {211,   4,  18}, {188,  49,  65}, {224,  17,  44}, { 24, 124, 239}, { 51,  34,  91}, { 23, 110, 181}, {102, 215,  17}, {173, 122,  70}, { 18,  88, 179}, { 20, 187, 113}, {184, 130, 167}, {247,  73, 119}, { 92,  65,  37}, { 14, 250, 245}, { 73,   6, 212}, { 97, 247, 118}, {126,  83, 190}, { 40,  52,  63}, {159, 122,  29}, {122,  50, 100}, { 81,  69,  15}, { 80, 229, 215}, {152,  63,  98}, {140,  68,  43}, { 32,  13, 149}},
        {{ 92,  69, 161}, { 59, 169, 199}, { 67,  68,  90}, { 91, 117, 232}, { 20,   0, 247}, { 54,  62, 114}, { 40, 113,   1}, { 68,   0,  36}, {107, 156, 152}, {113, 118, 224}, {246, 104,  75}, { 16, 132, 156}, {  9,  35, 212}, { 22, 107,  78}, {101,  70, 172}, {172,  49, 138}, {172, 140, 186}, {185,  99,  76}, {185,   1, 163}, { 47,  64, 123}, { 52,  40,  58}, {238, 218, 157}, {138, 209, 214}, { 58, 193, 244}, {145, 198, 254}, { 42,  37,  54}, {228, 127,  30}, { 37,  80,  28}, { 32, 194,  57}, {212, 209,  40}, { 14,   5,  30}, { 49,  75, 172}, {136,  59,   1}, {136, 110,  44}, { 17,  25, 160}, { 55,  96, 190}, {180, 135, 114}, {  3,  50, 106}, {215,  61,  54}, { 38,  21,  21}, {207,  12, 217}, { 64,  61, 206}, { 65, 200, 199}, { 11,  17, 162}, {110,   8,  90}, {138,  70,   9}, { 58, 152,  56}, {134,   8,  44}, {231, 197, 252}, {198, 161,  23}, { 67, 143, 165}, {181, 157,  25}, {179, 132,  88}, {246,  52, 231}, {  7, 218, 208}, { 48,  94, 243}, {204, 225, 219}, {199,  68, 201}, { 12,  19,  61}, {171, 170,  22}, {105,  27,  62}, {115, 202, 228}, {234, 191,  21}, {163,  75,  51}, { 75, 192, 194}, {246, 193,  53}, {251,  93, 217}, { 77,  15, 180}, {243,  86,  57}, {168, 228, 198}, { 81,  20, 113}, {135, 160, 162}, {  0,  12,  18}, { 14, 228,  24}, {237, 136, 212}, {100, 189, 135}, {230,  93, 127}, {255, 141, 198}, {142, 224,  38}, { 92, 183, 100}, { 90,  51,  48}, {238, 162,  75}, {138, 233, 172}, {127,  59, 229}, { 62,  70, 123}, {  8, 142,  65}, {100, 253,  84}, { 29, 165, 142}, {101,  58,  24}, { 28,  31, 186}},
        {{ 93,  29,  75}, {154,  24, 250}, { 31,  27, 139}, {242, 210,   3}, { 50,  87, 208}, { 40, 192, 226}, {219, 218,  39}, { 94, 169, 106}, {239, 196, 237}, { 94, 121, 210}, {224, 181, 106}, { 25,  33,  81}, {193,  12, 196}, {227, 138,  88}, { 77,  32,  50}, {183,  31, 250}, {138,   8,  84}, { 98,  99, 142}, { 81,  91, 148}, { 38, 136, 107}, { 78,   1,   7}, {157,  91,  84}, {171, 113,  42}, { 19,  83, 151}, { 93,  24, 134}, {204,  72, 248}, { 55, 106, 150}, {114,  39, 173}, { 36,  27,  40}, { 85,  92, 190}, {140,  31,  65}, { 38, 140, 247}, {142, 143,  12}, {103, 233,  21}, {  3,  47,  67}, { 76,  52,  14}, {231,  83, 102}, { 55, 128, 188}, { 61,  50,  64}, {209,   6, 113}, {255, 222, 232}, {  4, 192,  66}, {165,  82, 145}, { 25,  25,  45}, {152,  50,  94}, {190,  56,  44}, {252,  13,   8}, { 67, 149, 164}, {102,   5, 220}, {178, 126, 136}, {240,  49,   4}, {226, 124, 250}, {180, 130,  52}, { 24, 184, 110}, {158, 225,  58}, {133, 108, 141}, {193,  67, 103}, { 75,  26,  73}, { 41,  27,  42}, { 42, 223,  62}, {135,  73,  56}, {111, 103,  99}, {136, 223, 224}, { 61, 190, 167}, { 56,  59,  63}, {159,  15, 149}, {157, 144,  87}, {205, 139,  89}, {  2,  97, 121}, { 96,  72, 145}, {190, 125, 155}, { 29, 239, 206}, { 13,  25,  66}, { 20,   3,  28}, { 14,  65,  97}, {235, 150, 171}, {110,  49, 194}, { 23, 186, 171}, {120,  96,  80}, {138, 137,  19}, {224,  29, 158}, {244, 144, 116}, {186,  89,  43}, { 24, 132,  60}, { 61,  64,  67}, {248, 130, 223}, { 85, 126, 126}, {100,  15, 113}, { 80,   1, 188}, { 78, 164, 248}},
        {{116,   7, 236}, { 63, 213, 100}, {249,  53, 189}, {127,  94, 109}, { 37, 136, 155}, {246,  30, 160}, {230,  81, 165}, { 29,   1,  80}, {252, 168,  14}, {119, 126, 171}, { 49,  13,  45}, {234, 197,  36}, {101, 103, 109}, { 86, 170,  42}, {129,  78,  61}, {  9, 168, 154}, {157, 127, 211}, { 33,   9, 172}, { 17,   4,  47}, {214, 243, 201}, { 29,  46, 206}, {240,  66,   8}, {130,  57, 161}, {144, 104, 215}, {126,  37, 106}, {139, 117, 236}, { 57,  39,   5}, {187,  85,  90}, { 55,  33,  49}, { 70,  46,  43}, {119, 244, 159}, {101,   2,  28}, {134,  60, 140}, { 76,  83, 128}, { 11, 208, 133}, {153, 184, 190}, {208, 106,  19}, {114, 178, 108}, {  6,  92, 122}, {101, 177,  44}, {134, 119, 180}, { 96,  68, 249}, { 76,  13, 113}, {177,  32,  10}, {236,  21,  73}, {172,  66,  11}, {159, 152, 161}, {173, 123,  69}, {148, 119, 143}, {170,  16, 180}, {242,  44, 177}, {168,  36, 229}, {232, 216,  52}, {207,  21, 157}, {174, 128,  75}, { 27, 220, 186}, {172, 130,  80}, {231, 138, 166}, {112,  28,  19}, {173, 235, 184}, { 21,  23, 168}, {193, 192,  44}, { 79,  47, 125}, {161,  97, 120}, {251, 160, 185}, {157,  97, 243}, {141, 208, 253}, { 33, 105, 125}, {128, 114, 130}, { 18,  47, 225}, {158, 152, 174}, { 41, 112, 131}, { 62,  89, 112}, { 57,  62, 226}, {134,  83, 176}, { 88,  84,  63}, {176, 169,  73}, { 68,  50, 255}, {  0, 215, 112}, {244, 191, 211}, { 26, 132, 156}, {122,  71, 132}, {204,  98, 173}, {118,  90, 166}, {118,   6, 143}, {121,  74, 167}, {126,  37, 229}, { 71,  48,  40}, { 64,  16,  69}, {252,  83, 236}},
        {{  7,   5,  31}, {245, 154,  65}, { 67,  39,  55}, {133, 209, 215}, {186,  85, 123}, {179,  43,  55}, { 43, 159, 176}, {139,  45, 116}, { 38,  28,   7}, {183, 107,  32}, {133,  70,  11}, {197, 202, 253}, {209, 113, 217}, {236,   1, 106}, {172, 218, 221}, {181,  65,  14}, {  8, 130, 130}, {167,  79,  37}, {139,  41,  37}, { 25,  26, 190}, {158,  43, 217}, {237, 211,   8}, { 53, 138,  51}, { 56,  25,   2}, {227,   7, 197}, {134,  16, 105}, {171, 139, 181}, { 80, 250, 173}, {208, 109, 122}, {241, 249,  40}, { 96,  53, 213}, { 56,  72, 104}, { 98,  33, 197}, {153,  22, 149}, {  9,  72, 176}, { 41,  59, 194}, { 17, 116, 247}, {175, 126,   7}, {  1,   8,  18}, {  0, 157, 104}, {217, 124,  78}, {178,  41,  25}, {182,  52, 122}, { 26,  27,  35}, { 13, 149, 254}, {223, 135, 192}, { 64, 197,  82}, { 29, 160,  40}, {  4,  60, 192}, { 79,  73,  87}, { 15, 192,  94}, {127, 175, 223}, { 23,  50, 112}, {139,  37, 205}, {105, 163, 188}, {233,  78,  25}, { 19,  79, 148}, {237, 104, 119}, {250, 124,  74}, {  0,  16,  64}, { 31,  15, 241}, {117, 128, 235}, { 46, 120, 234}, {157, 139, 110}, {  4, 209, 170}, {153,  52, 135}, {184,  36,  33}, {101,  91,  52}, {161, 131, 140}, { 96, 115, 131}, {219, 145, 117}, { 72,  28,  66}, { 89,  68, 155}, { 89, 227,  54}, { 18,   8,  71}, {134,  48,  16}, { 52,  52,  20}, {157,  43, 155}, { 87, 253, 247}, { 26, 177, 170}, { 46, 166,  90}, {109,  97, 124}, {236,   8,  48}, {  6,  85, 203}, {239, 195, 161}, { 20,  11,  83}, { 90,  13, 245}, {105,  95,   2}, {176,  35,  51}, { 12,  85, 180}},
        {{111,   3, 144}, { 77, 147, 158}, {138,  64,  98}, {  1,  20, 185}, {186,  12,   4}, { 53,  25,  66}, {213, 106,  87}, {151,   6, 124}, {134,  29,  52}, {  6,   5, 155}, {215,  35, 137}, {247, 161,  51}, {155,  42, 166}, {187, 175, 247}, { 14, 112, 185}, {  3, 191, 107}, { 39,   4,  38}, {162,   5, 144}, {129,  47, 148}, { 70, 245, 200}, {186,  54, 187}, {133,  58,  95}, {144,  49, 224}, {230, 210, 198}, {156,  62,  85}, { 81,   1,  16}, {101,  22,  42}, {143, 220, 108}, {129,  48,  10}, {252,  63, 140}, {134,  95, 201}, { 15,  54,  34}, {242, 115, 189}, {129, 110, 184}, { 69, 190, 208}, {171, 102, 110}, { 66, 113, 214}, {113, 178, 217}, { 86,   9, 218}, { 65, 108, 136}, { 21, 249, 150}, { 55,  46, 170}, {108,  99, 164}, { 91,  53,  93}, { 38,   2, 120}, {183,  55, 179}, {249,  42,  69}, { 62, 135, 125}, {133, 126, 138}, { 10,   9,  98}, {129, 239, 144}, {214,  71, 105}, {255,  24,  10}, {248,  56, 143}, {242,  30,   8}, { 18,  18,  39}, {103,  39,  21}, {226,   5, 148}, {227, 125,  12}, {224,  84, 170}, { 31, 234, 195}, {212,  21,  16}, {  8,  67, 248}, { 12,  37,  51}, {137,   3,  56}, { 15,  45, 106}, {170,  59,  71}, {105,  42, 228}, { 68,   0, 118}, {212, 145,  75}, {127,  29,  50}, {203,  37,  40}, { 27,   3,  23}, { 57,  46,  28}, {168,  81,  13}, { 48,  19, 113}, {125,  66,  70}, {155,  77, 106}, { 24, 120,   2}, {170, 214,  74}, { 47, 141, 204}, {131,  43,  58}, { 41,  12,  22}, {197, 146, 140}, {237,  70, 190}, { 45,  18,  48}, {  0,  43,  71}, { 87, 115, 171}, {211,   0,  93}, {185, 120, 221}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}