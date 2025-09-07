package com.chiksmedina.solar.linear.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.AstronomyGroup

val AstronomyGroup.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(
            name = "Stars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.9909f, 16.5f)
                lineTo(9.015f, 16.9741f)
                curveTo(7.0341f, 17.5217f, 6.0436f, 17.7955f, 5.5097f, 17.2192f)
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
                lineTo(15.0609f, 5.6891f)
                curveTo(15.262f, 6.2622f, 15.3625f, 6.5488f, 15.5581f, 6.7599f)
                curveTo(15.7537f, 6.971f, 16.0222f, 7.0827f, 16.5592f, 7.3062f)
                lineTo(17.048f, 7.5097f)
                curveTo(18.9378f, 8.2961f, 19.8826f, 8.6892f, 19.9904f, 9.4929f)
                curveTo(20.0823f, 10.1786f, 19.513f, 10.7756f, 18.3493f, 11.7831f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
        }
            .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
