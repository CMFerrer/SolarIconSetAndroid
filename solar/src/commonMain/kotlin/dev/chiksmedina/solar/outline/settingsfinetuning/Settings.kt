package dev.chiksmedina.solar.outline.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SettingsFineTuningGroup

val SettingsFineTuningGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(
            name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 8.25f)
                curveTo(9.9289f, 8.25f, 8.25f, 9.9289f, 8.25f, 12.0f)
                curveTo(8.25f, 14.0711f, 9.9289f, 15.75f, 12.0f, 15.75f)
                curveTo(14.0711f, 15.75f, 15.75f, 14.0711f, 15.75f, 12.0f)
                curveTo(15.75f, 9.9289f, 14.0711f, 8.25f, 12.0f, 8.25f)
                close()
                moveTo(9.75f, 12.0f)
                curveTo(9.75f, 10.7574f, 10.7574f, 9.75f, 12.0f, 9.75f)
                curveTo(13.2426f, 9.75f, 14.25f, 10.7574f, 14.25f, 12.0f)
                curveTo(14.25f, 13.2426f, 13.2426f, 14.25f, 12.0f, 14.25f)
                curveTo(10.7574f, 14.25f, 9.75f, 13.2426f, 9.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9747f, 1.25f)
                curveTo(11.5303f, 1.25f, 11.1592f, 1.25f, 10.8546f, 1.2708f)
                curveTo(10.5375f, 1.2924f, 10.238f, 1.3391f, 9.9476f, 1.4593f)
                curveTo(9.2738f, 1.7384f, 8.7384f, 2.2738f, 8.4593f, 2.9476f)
                curveTo(8.314f, 3.2984f, 8.2747f, 3.6681f, 8.2596f, 4.07f)
                curveTo(8.2476f, 4.393f, 8.0845f, 4.6625f, 7.8439f, 4.8014f)
                curveTo(7.6034f, 4.9403f, 7.2884f, 4.9467f, 7.0027f, 4.7957f)
                curveTo(6.6471f, 4.6078f, 6.3073f, 4.457f, 5.9308f, 4.4074f)
                curveTo(5.2077f, 4.3122f, 4.4764f, 4.5082f, 3.8978f, 4.9522f)
                curveTo(3.6484f, 5.1435f, 3.4583f, 5.3796f, 3.281f, 5.6434f)
                curveTo(3.1107f, 5.8968f, 2.9252f, 6.2182f, 2.7029f, 6.6031f)
                lineTo(2.6777f, 6.6468f)
                curveTo(2.4555f, 7.0317f, 2.2699f, 7.353f, 2.1356f, 7.6272f)
                curveTo(1.9958f, 7.9127f, 1.8864f, 8.1954f, 1.8454f, 8.507f)
                curveTo(1.7502f, 9.2301f, 1.9462f, 9.9614f, 2.3902f, 10.5401f)
                curveTo(2.6213f, 10.8412f, 2.9217f, 11.0602f, 3.2622f, 11.2741f)
                curveTo(3.5359f, 11.4461f, 3.6879f, 11.7221f, 3.6879f, 12.0f)
                curveTo(3.6878f, 12.2778f, 3.5359f, 12.5538f, 3.2622f, 12.7258f)
                curveTo(2.9217f, 12.9397f, 2.6212f, 13.1587f, 2.3901f, 13.4599f)
                curveTo(1.9461f, 14.0385f, 1.7501f, 14.7698f, 1.8453f, 15.4929f)
                curveTo(1.8863f, 15.8045f, 1.9957f, 16.0873f, 2.1355f, 16.3727f)
                curveTo(2.2698f, 16.6469f, 2.4553f, 16.9682f, 2.6776f, 17.3531f)
                lineTo(2.7028f, 17.3969f)
                curveTo(2.9251f, 17.7818f, 3.1106f, 18.1031f, 3.2809f, 18.3565f)
                curveTo(3.4582f, 18.6203f, 3.6483f, 18.8564f, 3.8977f, 19.0477f)
                curveTo(4.4763f, 19.4917f, 5.2076f, 19.6877f, 5.9307f, 19.5925f)
                curveTo(6.3072f, 19.5429f, 6.647f, 19.3922f, 7.0025f, 19.2043f)
                curveTo(7.2883f, 19.0532f, 7.6033f, 19.0596f, 7.8439f, 19.1986f)
                curveTo(8.0845f, 19.3375f, 8.2476f, 19.607f, 8.2596f, 19.9301f)
                curveTo(8.2747f, 20.3319f, 8.314f, 20.7016f, 8.4593f, 21.0524f)
                curveTo(8.7384f, 21.7262f, 9.2738f, 22.2616f, 9.9476f, 22.5407f)
                curveTo(10.238f, 22.661f, 10.5375f, 22.7076f, 10.8546f, 22.7292f)
                curveTo(11.1592f, 22.75f, 11.5303f, 22.75f, 11.9747f, 22.75f)
                horizontalLineTo(12.0252f)
                curveTo(12.4697f, 22.75f, 12.8407f, 22.75f, 13.1454f, 22.7292f)
                curveTo(13.4625f, 22.7076f, 13.762f, 22.661f, 14.0524f, 22.5407f)
                curveTo(14.7262f, 22.2616f, 15.2616f, 21.7262f, 15.5407f, 21.0524f)
                curveTo(15.686f, 20.7016f, 15.7253f, 20.3319f, 15.7403f, 19.93f)
                curveTo(15.7524f, 19.607f, 15.9154f, 19.3375f, 16.156f, 19.1985f)
                curveTo(16.3966f, 19.0596f, 16.7116f, 19.0532f, 16.9974f, 19.2042f)
                curveTo(17.3529f, 19.3921f, 17.6927f, 19.5429f, 18.0692f, 19.5924f)
                curveTo(18.7923f, 19.6876f, 19.5236f, 19.4917f, 20.1022f, 19.0477f)
                curveTo(20.3516f, 18.8563f, 20.5417f, 18.6203f, 20.719f, 18.3565f)
                curveTo(20.8893f, 18.1031f, 21.0748f, 17.7818f, 21.297f, 17.3969f)
                lineTo(21.3223f, 17.3531f)
                curveTo(21.5445f, 16.9682f, 21.7301f, 16.6468f, 21.8644f, 16.3726f)
                curveTo(22.0042f, 16.0872f, 22.1135f, 15.8045f, 22.1546f, 15.4929f)
                curveTo(22.2498f, 14.7697f, 22.0538f, 14.0384f, 21.6098f, 13.4598f)
                curveTo(21.3787f, 13.1586f, 21.0782f, 12.9397f, 20.7378f, 12.7258f)
                curveTo(20.464f, 12.5538f, 20.3121f, 12.2778f, 20.3121f, 11.9999f)
                curveTo(20.3121f, 11.7221f, 20.464f, 11.4462f, 20.7377f, 11.2742f)
                curveTo(21.0783f, 11.0603f, 21.3788f, 10.8414f, 21.6099f, 10.5401f)
                curveTo(22.0539f, 9.9615f, 22.2499f, 9.2302f, 22.1547f, 8.5071f)
                curveTo(22.1136f, 8.1955f, 22.0043f, 7.9127f, 21.8645f, 7.6273f)
                curveTo(21.7302f, 7.3531f, 21.5447f, 7.0318f, 21.3224f, 6.6469f)
                lineTo(21.2972f, 6.6032f)
                curveTo(21.0749f, 6.2182f, 20.8894f, 5.8969f, 20.7191f, 5.6435f)
                curveTo(20.5418f, 5.3797f, 20.3517f, 5.1436f, 20.1023f, 4.9523f)
                curveTo(19.5237f, 4.5083f, 18.7924f, 4.3123f, 18.0692f, 4.4075f)
                curveTo(17.6928f, 4.4571f, 17.353f, 4.6078f, 16.9975f, 4.7957f)
                curveTo(16.7117f, 4.9468f, 16.3967f, 4.9404f, 16.1561f, 4.8014f)
                curveTo(15.9155f, 4.6625f, 15.7524f, 4.393f, 15.7403f, 4.0699f)
                curveTo(15.7253f, 3.6681f, 15.686f, 3.2984f, 15.5407f, 2.9476f)
                curveTo(15.2616f, 2.2738f, 14.7262f, 1.7384f, 14.0524f, 1.4593f)
                curveTo(13.762f, 1.3391f, 13.4625f, 1.2924f, 13.1454f, 1.2708f)
                curveTo(12.8407f, 1.25f, 12.4697f, 1.25f, 12.0252f, 1.25f)
                horizontalLineTo(11.9747f)
                close()
                moveTo(10.5216f, 2.8451f)
                curveTo(10.5988f, 2.8132f, 10.716f, 2.7837f, 10.9567f, 2.7673f)
                curveTo(11.2042f, 2.7504f, 11.5238f, 2.75f, 12.0f, 2.75f)
                curveTo(12.4762f, 2.75f, 12.7958f, 2.7504f, 13.0432f, 2.7673f)
                curveTo(13.284f, 2.7837f, 13.4012f, 2.8132f, 13.4783f, 2.8451f)
                curveTo(13.7846f, 2.972f, 14.028f, 3.2154f, 14.1548f, 3.5217f)
                curveTo(14.1949f, 3.6183f, 14.228f, 3.7689f, 14.2414f, 4.126f)
                curveTo(14.271f, 4.9184f, 14.68f, 5.6813f, 15.4061f, 6.1005f)
                curveTo(16.1321f, 6.5197f, 16.9974f, 6.4924f, 17.6984f, 6.1219f)
                curveTo(18.0143f, 5.9549f, 18.1614f, 5.9083f, 18.265f, 5.8947f)
                curveTo(18.5937f, 5.8514f, 18.9261f, 5.9405f, 19.1891f, 6.1423f)
                curveTo(19.2554f, 6.1931f, 19.3395f, 6.2799f, 19.4741f, 6.4802f)
                curveTo(19.6125f, 6.686f, 19.7726f, 6.9626f, 20.0107f, 7.375f)
                curveTo(20.2488f, 7.7874f, 20.4083f, 8.0644f, 20.5174f, 8.2871f)
                curveTo(20.6235f, 8.5038f, 20.6566f, 8.6201f, 20.6675f, 8.7029f)
                curveTo(20.7108f, 9.0316f, 20.6217f, 9.364f, 20.4199f, 9.627f)
                curveTo(20.3562f, 9.71f, 20.2424f, 9.814f, 19.9397f, 10.0041f)
                curveTo(19.2684f, 10.426f, 18.8122f, 11.1616f, 18.8121f, 11.9999f)
                curveTo(18.8121f, 12.8383f, 19.2683f, 13.574f, 19.9397f, 13.9959f)
                curveTo(20.2423f, 14.186f, 20.3561f, 14.29f, 20.4198f, 14.373f)
                curveTo(20.6216f, 14.636f, 20.7107f, 14.9684f, 20.6674f, 15.2971f)
                curveTo(20.6565f, 15.3799f, 20.6234f, 15.4961f, 20.5173f, 15.7128f)
                curveTo(20.4082f, 15.9355f, 20.2487f, 16.2125f, 20.0106f, 16.6249f)
                curveTo(19.7725f, 17.0373f, 19.6124f, 17.3139f, 19.474f, 17.5198f)
                curveTo(19.3394f, 17.72f, 19.2553f, 17.8068f, 19.189f, 17.8576f)
                curveTo(18.926f, 18.0595f, 18.5936f, 18.1485f, 18.2649f, 18.1053f)
                curveTo(18.1613f, 18.0916f, 18.0142f, 18.045f, 17.6983f, 17.8781f)
                curveTo(16.9973f, 17.5075f, 16.132f, 17.4803f, 15.4059f, 17.8995f)
                curveTo(14.68f, 18.3187f, 14.271f, 19.0816f, 14.2414f, 19.874f)
                curveTo(14.228f, 20.2311f, 14.1949f, 20.3817f, 14.1548f, 20.4784f)
                curveTo(14.028f, 20.7846f, 13.7846f, 21.028f, 13.4783f, 21.1549f)
                curveTo(13.4012f, 21.1868f, 13.284f, 21.2163f, 13.0432f, 21.2327f)
                curveTo(12.7958f, 21.2496f, 12.4762f, 21.25f, 12.0f, 21.25f)
                curveTo(11.5238f, 21.25f, 11.2042f, 21.2496f, 10.9567f, 21.2327f)
                curveTo(10.716f, 21.2163f, 10.5988f, 21.1868f, 10.5216f, 21.1549f)
                curveTo(10.2154f, 21.028f, 9.972f, 20.7846f, 9.8451f, 20.4784f)
                curveTo(9.8051f, 20.3817f, 9.7719f, 20.2311f, 9.7586f, 19.874f)
                curveTo(9.729f, 19.0817f, 9.32f, 18.3187f, 8.5939f, 17.8995f)
                curveTo(7.8678f, 17.4803f, 7.0026f, 17.5076f, 6.3016f, 17.8781f)
                curveTo(5.9857f, 18.0451f, 5.8386f, 18.0917f, 5.735f, 18.1053f)
                curveTo(5.4063f, 18.1486f, 5.0739f, 18.0595f, 4.8108f, 17.8577f)
                curveTo(4.7446f, 17.8069f, 4.6604f, 17.7201f, 4.5259f, 17.5198f)
                curveTo(4.3875f, 17.314f, 4.2274f, 17.0374f, 3.9893f, 16.625f)
                curveTo(3.7511f, 16.2126f, 3.5917f, 15.9356f, 3.4826f, 15.7129f)
                curveTo(3.3765f, 15.4962f, 3.3434f, 15.3799f, 3.3325f, 15.2971f)
                curveTo(3.2892f, 14.9684f, 3.3783f, 14.636f, 3.5801f, 14.373f)
                curveTo(3.6438f, 14.2901f, 3.7576f, 14.186f, 4.0602f, 13.9959f)
                curveTo(4.7316f, 13.5741f, 5.1878f, 12.8384f, 5.1879f, 12.0001f)
                curveTo(5.1879f, 11.1616f, 4.7316f, 10.4259f, 4.0602f, 10.004f)
                curveTo(3.7577f, 9.8139f, 3.6439f, 9.7099f, 3.5802f, 9.6269f)
                curveTo(3.3784f, 9.3639f, 3.2893f, 9.0315f, 3.3326f, 8.7028f)
                curveTo(3.3435f, 8.62f, 3.3766f, 8.5037f, 3.4827f, 8.2871f)
                curveTo(3.5918f, 8.0643f, 3.7513f, 7.7873f, 3.9894f, 7.3749f)
                curveTo(4.2275f, 6.9625f, 4.3876f, 6.686f, 4.526f, 6.4801f)
                curveTo(4.6606f, 6.2798f, 4.7447f, 6.193f, 4.8109f, 6.1422f)
                curveTo(5.0739f, 5.9404f, 5.4064f, 5.8513f, 5.735f, 5.8946f)
                curveTo(5.8387f, 5.9082f, 5.9858f, 5.9548f, 6.3017f, 6.1218f)
                curveTo(7.0027f, 6.4924f, 7.8679f, 6.5196f, 8.5939f, 6.1005f)
                curveTo(9.32f, 5.6813f, 9.729f, 4.9184f, 9.7586f, 4.126f)
                curveTo(9.7719f, 3.7689f, 9.8051f, 3.6183f, 9.8451f, 3.5217f)
                curveTo(9.972f, 3.2154f, 10.2154f, 2.972f, 10.5216f, 2.8451f)
                close()
            }
        }
            .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
