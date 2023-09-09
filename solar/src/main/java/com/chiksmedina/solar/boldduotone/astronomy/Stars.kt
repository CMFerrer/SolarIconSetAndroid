package com.chiksmedina.solar.boldduotone.astronomy

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
import com.chiksmedina.solar.boldduotone.AstronomyGroup

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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.3312f, 4.252f)
                curveTo(11.6467f, 2.678f, 12.3045f, 1.8909f, 13.0606f, 2.0122f)
                curveTo(13.8167f, 2.1334f, 14.1705f, 3.0826f, 14.8779f, 4.9809f)
                lineTo(15.0609f, 5.472f)
                curveTo(15.262f, 6.0115f, 15.3625f, 6.2812f, 15.5581f, 6.4799f)
                curveTo(15.7537f, 6.6786f, 16.0222f, 6.7838f, 16.5592f, 6.9941f)
                lineTo(17.048f, 7.1856f)
                curveTo(18.9378f, 7.9257f, 19.8826f, 8.2958f, 19.9904f, 9.0522f)
                curveTo(20.0982f, 9.8085f, 19.2974f, 10.4503f, 17.696f, 11.7339f)
                lineTo(17.2817f, 12.066f)
                curveTo(16.8267f, 12.4308f, 16.5991f, 12.6131f, 16.4674f, 12.8628f)
                curveTo(16.3357f, 13.1124f, 16.3147f, 13.4011f, 16.2728f, 13.9783f)
                lineTo(16.2346f, 14.5039f)
                curveTo(16.087f, 16.5353f, 16.0132f, 17.5511f, 15.3237f, 17.8973f)
                curveTo(14.6342f, 18.2436f, 13.7856f, 17.6911f, 12.0884f, 16.586f)
                lineTo(11.6493f, 16.3001f)
                curveTo(11.167f, 15.9861f, 10.9259f, 15.8291f, 10.6489f, 15.7847f)
                curveTo(10.3719f, 15.7403f, 10.0905f, 15.8135f, 9.5275f, 15.96f)
                lineTo(9.015f, 16.0933f)
                curveTo(7.0341f, 16.6087f, 6.0436f, 16.8664f, 5.5097f, 16.324f)
                curveTo(4.9758f, 15.7816f, 5.2521f, 14.7983f, 5.8046f, 12.8317f)
                lineTo(5.9475f, 12.323f)
                curveTo(6.1045f, 11.7641f, 6.183f, 11.4847f, 6.1435f, 11.2076f)
                curveTo(6.104f, 10.9306f, 5.9511f, 10.6872f, 5.6451f, 10.2004f)
                lineTo(5.3665f, 9.7573f)
                curveTo(4.2899f, 8.0443f, 3.7515f, 7.1879f, 4.1111f, 6.5064f)
                curveTo(4.4706f, 5.8249f, 5.4899f, 5.7697f, 7.5286f, 5.6594f)
                lineTo(8.056f, 5.6309f)
                curveTo(8.6353f, 5.5995f, 8.925f, 5.5838f, 9.1776f, 5.457f)
                curveTo(9.4301f, 5.3302f, 9.6171f, 5.1065f, 9.9909f, 4.6592f)
                lineTo(10.3312f, 4.252f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
