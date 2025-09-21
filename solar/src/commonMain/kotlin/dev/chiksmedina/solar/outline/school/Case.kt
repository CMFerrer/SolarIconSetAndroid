package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.Case: ImageVector
    get() {
        if (_case != null) {
            return _case!!
        }
        _case = Builder(
            name = "Case", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.5814f, 1.25f)
                lineTo(10.561f, 1.25f)
                curveTo(10.4474f, 1.25f, 10.3591f, 1.25f, 10.2755f, 1.255f)
                curveTo(9.2151f, 1.3193f, 8.2865f, 1.9885f, 7.8902f, 2.9743f)
                curveTo(7.859f, 3.052f, 7.831f, 3.1358f, 7.7952f, 3.2435f)
                lineTo(7.7887f, 3.2628f)
                lineTo(7.7631f, 3.3398f)
                curveTo(7.7441f, 3.3968f, 7.7388f, 3.4125f, 7.7342f, 3.4252f)
                curveTo(7.5743f, 3.8672f, 7.043f, 4.236f, 6.481f, 4.2502f)
                lineTo(4.6616f, 4.3393f)
                curveTo(3.8754f, 4.4316f, 3.2022f, 4.6283f, 2.6332f, 5.0912f)
                curveTo(2.4345f, 5.2529f, 2.2529f, 5.4345f, 2.0912f, 5.6333f)
                curveTo(1.6283f, 6.2022f, 1.4316f, 6.8754f, 1.3392f, 7.6616f)
                curveTo(1.25f, 8.4214f, 1.25f, 9.3767f, 1.25f, 10.5617f)
                lineTo(1.25f, 10.6089f)
                lineTo(1.25f, 10.6402f)
                curveTo(1.25f, 10.9241f, 1.2499f, 11.1903f, 1.2727f, 11.4144f)
                curveTo(1.2978f, 11.6624f, 1.3557f, 11.9257f, 1.5139f, 12.18f)
                curveTo(1.5653f, 12.2627f, 1.6235f, 12.3409f, 1.6879f, 12.4139f)
                curveTo(1.857f, 12.6055f, 2.0534f, 12.7291f, 2.2505f, 12.8205f)
                curveTo(2.2534f, 14.4357f, 2.2738f, 16.0682f, 2.4188f, 17.4664f)
                curveTo(2.5037f, 18.2856f, 2.634f, 19.0548f, 2.8407f, 19.7106f)
                curveTo(3.0441f, 20.3557f, 3.3444f, 20.9665f, 3.8198f, 21.389f)
                curveTo(4.6432f, 22.1209f, 5.6796f, 22.4436f, 6.9733f, 22.5983f)
                curveTo(8.2432f, 22.75f, 9.8709f, 22.75f, 11.9488f, 22.75f)
                horizontalLineTo(12.0512f)
                curveTo(14.1291f, 22.75f, 15.7568f, 22.75f, 17.0267f, 22.5983f)
                curveTo(18.3204f, 22.4436f, 19.3568f, 22.1209f, 20.1803f, 21.389f)
                curveTo(20.6556f, 20.9665f, 20.9559f, 20.3557f, 21.1593f, 19.7106f)
                curveTo(21.366f, 19.0548f, 21.4963f, 18.2856f, 21.5813f, 17.4664f)
                curveTo(21.7262f, 16.0682f, 21.7466f, 14.4357f, 21.7495f, 12.8205f)
                curveTo(21.9466f, 12.7291f, 22.143f, 12.6055f, 22.3121f, 12.4139f)
                curveTo(22.3765f, 12.3409f, 22.4347f, 12.2627f, 22.4861f, 12.18f)
                curveTo(22.6443f, 11.9257f, 22.7022f, 11.6624f, 22.7273f, 11.4144f)
                curveTo(22.7501f, 11.1903f, 22.75f, 10.9241f, 22.75f, 10.6402f)
                lineTo(22.75f, 10.5616f)
                curveTo(22.75f, 9.3767f, 22.75f, 8.4214f, 22.6608f, 7.6616f)
                curveTo(22.5684f, 6.8754f, 22.3717f, 6.2022f, 21.9088f, 5.6333f)
                curveTo(21.7471f, 5.4345f, 21.5655f, 5.2529f, 21.3668f, 5.0912f)
                curveTo(20.7978f, 4.6283f, 20.1246f, 4.4316f, 19.3384f, 4.3393f)
                lineTo(17.519f, 4.2502f)
                curveTo(16.9572f, 4.236f, 16.4262f, 3.8673f, 16.2663f, 3.4252f)
                curveTo(16.2617f, 3.4125f, 16.2563f, 3.3965f, 16.2374f, 3.3398f)
                lineTo(16.2053f, 3.2435f)
                curveTo(16.1694f, 3.1358f, 16.1415f, 3.0519f, 16.1102f, 2.9743f)
                curveTo(15.714f, 1.9885f, 14.7854f, 1.3193f, 13.725f, 1.255f)
                curveTo(13.6414f, 1.25f, 13.553f, 1.25f, 13.4395f, 1.25f)
                lineTo(10.5814f, 1.25f)
                close()
                moveTo(7.5703f, 5.75f)
                lineTo(7.6089f, 5.75f)
                horizontalLineTo(16.3911f)
                lineTo(16.4297f, 5.75f)
                curveTo(17.6524f, 5.75f, 18.5082f, 5.752f, 19.1634f, 5.829f)
                curveTo(19.809f, 5.9049f, 20.1619f, 6.0447f, 20.4201f, 6.2547f)
                curveTo(20.5393f, 6.3517f, 20.6483f, 6.4607f, 20.7453f, 6.5799f)
                curveTo(20.9553f, 6.8381f, 21.0951f, 7.191f, 21.171f, 7.8366f)
                curveTo(21.2488f, 8.4986f, 21.25f, 9.3656f, 21.25f, 10.6089f)
                curveTo(21.25f, 10.935f, 21.2491f, 11.1238f, 21.235f, 11.263f)
                curveTo(21.2266f, 11.3452f, 21.2161f, 11.3786f, 21.2122f, 11.3882f)
                curveTo(21.2049f, 11.3999f, 21.1967f, 11.4109f, 21.1876f, 11.4212f)
                curveTo(21.1795f, 11.4277f, 21.1506f, 11.4474f, 21.0742f, 11.479f)
                curveTo(20.945f, 11.5326f, 20.7644f, 11.5877f, 20.4521f, 11.6814f)
                lineTo(15.25f, 13.242f)
                verticalLineTo(13.0f)
                curveTo(15.25f, 12.3096f, 14.6904f, 11.75f, 14.0f, 11.75f)
                horizontalLineTo(10.0f)
                curveTo(9.3097f, 11.75f, 8.75f, 12.3096f, 8.75f, 13.0f)
                verticalLineTo(13.242f)
                lineTo(3.5479f, 11.6814f)
                curveTo(3.2356f, 11.5877f, 3.055f, 11.5326f, 2.9258f, 11.479f)
                curveTo(2.8494f, 11.4474f, 2.8205f, 11.4277f, 2.8124f, 11.4212f)
                lineTo(8.75f, 13.242f)
                lineTo(2.7878f, 11.3882f)
                curveTo(2.7839f, 11.3786f, 2.7734f, 11.3452f, 2.765f, 11.263f)
                curveTo(2.7509f, 11.1238f, 2.75f, 10.935f, 2.75f, 10.6089f)
                curveTo(2.75f, 9.3656f, 2.7512f, 8.4986f, 2.829f, 7.8366f)
                curveTo(2.9049f, 7.191f, 3.0447f, 6.8381f, 3.2547f, 6.5799f)
                curveTo(3.3517f, 6.4607f, 3.4607f, 6.3517f, 3.58f, 6.2547f)
                curveTo(3.8381f, 6.0447f, 4.191f, 5.9049f, 4.8366f, 5.829f)
                curveTo(5.4918f, 5.752f, 6.3476f, 5.75f, 7.5703f, 5.75f)
                close()
                moveTo(10.5814f, 2.75f)
                curveTo(10.438f, 2.75f, 10.3984f, 2.7503f, 10.3662f, 2.7523f)
                curveTo(9.8842f, 2.7815f, 9.4621f, 3.0857f, 9.282f, 3.5338f)
                curveTo(9.2699f, 3.5637f, 9.2571f, 3.6012f, 9.2117f, 3.7372f)
                lineTo(9.1834f, 3.8222f)
                curveTo(9.1684f, 3.8674f, 9.1566f, 3.9025f, 9.1447f, 3.9354f)
                curveTo(9.1053f, 4.0445f, 9.0586f, 4.1494f, 9.0056f, 4.25f)
                horizontalLineTo(14.9949f)
                curveTo(14.9418f, 4.1494f, 14.8952f, 4.0445f, 14.8557f, 3.9355f)
                curveTo(14.8438f, 3.9025f, 14.8321f, 3.8674f, 14.8171f, 3.8222f)
                lineTo(14.7887f, 3.7372f)
                curveTo(14.7434f, 3.6012f, 14.7305f, 3.5637f, 14.7185f, 3.5338f)
                curveTo(14.5384f, 3.0857f, 14.1163f, 2.7815f, 13.6343f, 2.7523f)
                curveTo(13.602f, 2.7503f, 13.5625f, 2.75f, 13.4191f, 2.75f)
                horizontalLineTo(10.5814f)
                close()
                moveTo(3.7521f, 13.3087f)
                curveTo(3.7589f, 14.7455f, 3.7878f, 16.1259f, 3.9108f, 17.3118f)
                curveTo(3.9906f, 18.0818f, 4.1074f, 18.7394f, 4.2713f, 19.2596f)
                curveTo(4.4387f, 19.7904f, 4.6326f, 20.1046f, 4.8163f, 20.2679f)
                curveTo(5.3109f, 20.7075f, 5.9942f, 20.9706f, 7.1513f, 21.1089f)
                curveTo(8.3218f, 21.2487f, 9.8598f, 21.25f, 12.0f, 21.25f)
                curveTo(14.1402f, 21.25f, 15.6782f, 21.2487f, 16.8487f, 21.1089f)
                curveTo(18.0058f, 20.9706f, 18.6891f, 20.7075f, 19.1837f, 20.2679f)
                curveTo(19.3674f, 20.1046f, 19.5613f, 19.7904f, 19.7287f, 19.2596f)
                curveTo(19.8926f, 18.7394f, 20.0094f, 18.0818f, 20.0892f, 17.3118f)
                curveTo(20.2122f, 16.1259f, 20.2411f, 14.7455f, 20.2479f, 13.3087f)
                lineTo(15.25f, 14.808f)
                verticalLineTo(15.1615f)
                curveTo(15.25f, 15.6726f, 14.9388f, 16.1323f, 14.4642f, 16.3221f)
                lineTo(13.7641f, 16.6021f)
                curveTo(12.6317f, 17.0551f, 11.3684f, 17.0551f, 10.2359f, 16.6021f)
                lineTo(9.5358f, 16.3221f)
                curveTo(9.0612f, 16.1323f, 8.75f, 15.6726f, 8.75f, 15.1615f)
                verticalLineTo(14.808f)
                lineTo(3.7521f, 13.3087f)
                close()
                moveTo(10.25f, 13.25f)
                verticalLineTo(14.9922f)
                lineTo(10.793f, 15.2094f)
                curveTo(11.5678f, 15.5194f, 12.4322f, 15.5194f, 13.207f, 15.2094f)
                lineTo(13.75f, 14.9922f)
                verticalLineTo(13.25f)
                horizontalLineTo(10.25f)
                close()
            }
        }
            .build()
        return _case!!
    }

private var _case: ImageVector? = null
