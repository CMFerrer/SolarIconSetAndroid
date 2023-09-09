package com.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.AstronomyGroup

public val AstronomyGroup.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(name = "Stars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2516f, 10.689f)
                curveTo(14.265f, 9.5085f, 13.7716f, 8.9182f, 13.2045f, 9.0091f)
                curveTo(12.6375f, 9.1f, 12.3722f, 9.8119f, 11.8416f, 11.2357f)
                lineTo(11.7043f, 11.604f)
                curveTo(11.5535f, 12.0086f, 11.4781f, 12.2109f, 11.3314f, 12.3599f)
                curveTo(11.1848f, 12.509f, 10.9834f, 12.5878f, 10.5806f, 12.7456f)
                lineTo(10.214f, 12.8892f)
                curveTo(8.7967f, 13.4443f, 8.088f, 13.7218f, 8.0072f, 14.2891f)
                curveTo(7.9264f, 14.8564f, 8.5269f, 15.3378f, 9.728f, 16.3004f)
                lineTo(10.0387f, 16.5495f)
                curveTo(10.38f, 16.8231f, 10.5507f, 16.9599f, 10.6494f, 17.1471f)
                curveTo(10.7482f, 17.3343f, 10.7639f, 17.5508f, 10.7954f, 17.9837f)
                lineTo(10.824f, 18.3779f)
                curveTo(10.9347f, 19.9015f, 10.9901f, 20.6633f, 11.5072f, 20.923f)
                curveTo(12.0244f, 21.1827f, 12.6608f, 20.7683f, 13.9337f, 19.9395f)
                lineTo(14.263f, 19.7251f)
                curveTo(14.6247f, 19.4896f, 14.8056f, 19.3718f, 15.0133f, 19.3385f)
                curveTo(15.2211f, 19.3052f, 15.4322f, 19.3601f, 15.8543f, 19.47f)
                lineTo(16.2387f, 19.57f)
                curveTo(17.7244f, 19.9565f, 18.4673f, 20.1498f, 18.8677f, 19.743f)
                curveTo(19.2681f, 19.3362f, 19.061f, 18.5987f, 18.6466f, 17.1238f)
                lineTo(18.5394f, 16.7422f)
                curveTo(18.4216f, 16.3231f, 18.3628f, 16.1135f, 18.3924f, 15.9057f)
                curveTo(18.422f, 15.6979f, 18.5367f, 15.5154f, 18.7662f, 15.1503f)
                lineTo(18.9751f, 14.818f)
                curveTo(19.7826f, 13.5332f, 20.1864f, 12.8909f, 19.9167f, 12.3798f)
                curveTo(19.647f, 11.8687f, 18.8826f, 11.8273f, 17.3536f, 11.7446f)
                lineTo(16.958f, 11.7231f)
                curveTo(16.5235f, 11.6996f, 16.3063f, 11.6879f, 16.1168f, 11.5927f)
                curveTo(15.9274f, 11.4976f, 15.7872f, 11.3299f, 15.5068f, 10.9944f)
                lineTo(15.2516f, 10.689f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8779f, 5.1672f)
                lineTo(15.0609f, 5.6891f)
                curveTo(15.262f, 6.2622f, 15.3625f, 6.5488f, 15.5581f, 6.7599f)
                curveTo(15.7537f, 6.971f, 16.0222f, 7.0827f, 16.5591f, 7.3062f)
                lineTo(17.048f, 7.5097f)
                curveTo(18.9378f, 8.2961f, 19.8826f, 8.6892f, 19.9904f, 9.4929f)
                curveTo(20.0352f, 9.8274f, 19.9227f, 10.1409f, 19.6605f, 10.4912f)
                curveTo(19.5719f, 10.4672f, 19.4866f, 10.4477f, 19.4064f, 10.4313f)
                curveTo(18.8802f, 10.3244f, 18.211f, 10.2883f, 17.5289f, 10.2516f)
                lineTo(17.0392f, 10.2251f)
                curveTo(16.945f, 10.22f, 16.8718f, 10.216f, 16.8091f, 10.2119f)
                curveTo(16.7675f, 10.1633f, 16.7196f, 10.106f, 16.6579f, 10.0322f)
                lineTo(16.3423f, 9.6545f)
                curveTo(15.9019f, 9.1274f, 15.4711f, 8.6116f, 15.0704f, 8.2535f)
                curveTo(14.6431f, 7.8717f, 13.9288f, 7.3736f, 12.9672f, 7.5278f)
                curveTo(11.9955f, 7.6836f, 11.4771f, 8.3906f, 11.1975f, 8.8953f)
                curveTo(10.9384f, 9.3629f, 10.7054f, 9.9886f, 10.4694f, 10.6222f)
                lineTo(10.2989f, 11.08f)
                curveTo(10.27f, 11.1573f, 10.2469f, 11.2193f, 10.2266f, 11.2725f)
                curveTo(10.1732f, 11.2939f, 10.1112f, 11.3183f, 10.0337f, 11.3486f)
                lineTo(9.5782f, 11.527f)
                curveTo(8.9474f, 11.7739f, 8.3249f, 12.0175f, 7.8615f, 12.2842f)
                curveTo(7.3627f, 12.5711f, 6.6614f, 13.1012f, 6.5223f, 14.0773f)
                curveTo(6.3846f, 15.0441f, 6.8995f, 15.7499f, 7.2893f, 16.1685f)
                curveTo(7.5798f, 16.4805f, 7.9701f, 16.8095f, 8.3868f, 17.1468f)
                curveTo(6.8183f, 17.5723f, 5.9839f, 17.7311f, 5.5097f, 17.2192f)
                curveTo(4.9758f, 16.6429f, 5.2521f, 15.5982f, 5.8046f, 13.5087f)
                lineTo(5.9475f, 12.9682f)
                curveTo(6.1045f, 12.3744f, 6.183f, 12.0775f, 6.1435f, 11.7831f)
                curveTo(6.104f, 11.4887f, 5.9511f, 11.2301f, 5.6451f, 10.713f)
                lineTo(5.3665f, 10.2421f)
                curveTo(4.2899f, 8.4221f, 3.7515f, 7.5121f, 4.1111f, 6.788f)
                curveTo(4.4706f, 6.064f, 5.4899f, 6.0054f, 7.5286f, 5.8881f)
                lineTo(8.056f, 5.8578f)
                curveTo(8.6353f, 5.8245f, 8.925f, 5.8078f, 9.1776f, 5.673f)
                curveTo(9.4301f, 5.5383f, 9.6171f, 5.3007f, 9.9909f, 4.8254f)
                lineTo(10.3312f, 4.3927f)
                curveTo(11.6467f, 2.7203f, 12.3045f, 1.8841f, 13.0606f, 2.0129f)
                curveTo(13.8167f, 2.1417f, 14.1705f, 3.1502f, 14.8779f, 5.1672f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
