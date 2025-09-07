package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.StarAngle: ImageVector
    get() {
        if (_starAngle != null) {
            return _starAngle!!
        }
        _starAngle = Builder(
            name = "StarAngle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.9299f, 12.7732f)
                curveTo(2.3588f, 14.4238f, 2.0733f, 15.2491f, 2.4383f, 15.7587f)
                curveTo(2.8035f, 16.2683f, 3.5774f, 16.1248f, 5.1253f, 15.8376f)
                lineTo(5.5258f, 15.7634f)
                curveTo(5.9657f, 15.6818f, 6.1856f, 15.641f, 6.3932f, 15.7012f)
                curveTo(6.6007f, 15.7614f, 6.7723f, 15.9157f, 7.1156f, 16.2245f)
                lineTo(7.4281f, 16.5056f)
                curveTo(8.636f, 17.5922f, 9.7915f, 17.8917f, 9.7915f, 17.8917f)
                curveTo(10.3431f, 17.648f, 10.477f, 16.7787f, 10.7447f, 15.0401f)
                lineTo(10.814f, 14.5903f)
                curveTo(10.8901f, 14.0962f, 10.9281f, 13.8492f, 11.0475f, 13.6446f)
                curveTo(11.1669f, 13.4399f, 11.3541f, 13.3008f, 11.7286f, 13.0226f)
                lineTo(12.0695f, 12.7693f)
                curveTo(13.3871f, 11.7902f, 14.0459f, 11.3006f, 14.0217f, 10.6404f)
                curveTo(13.9975f, 9.9801f, 13.3063f, 9.5864f, 11.9238f, 8.7991f)
                lineTo(11.5662f, 8.5954f)
                curveTo(11.1733f, 8.3716f, 10.9769f, 8.2597f, 10.8431f, 8.073f)
                curveTo(10.7094f, 7.8864f, 10.6535f, 7.646f, 10.5416f, 7.1653f)
                lineTo(10.4398f, 6.7276f)
                curveTo(10.0462f, 5.036f, 9.8494f, 4.1901f, 9.2829f, 4.0258f)
                curveTo(8.7164f, 3.8615f, 8.1553f, 4.4875f, 7.0332f, 5.7394f)
                lineTo(6.7428f, 6.0634f)
                curveTo(6.424f, 6.4191f, 6.2645f, 6.597f, 6.0625f, 6.6863f)
                curveTo(5.8604f, 6.7756f, 5.6386f, 6.7661f, 5.1951f, 6.7473f)
                lineTo(4.7913f, 6.7301f)
                curveTo(3.2304f, 6.6637f, 2.4499f, 6.6304f, 2.124f, 7.1891f)
                curveTo(1.7981f, 7.7478f, 2.1425f, 8.5284f, 2.8315f, 10.0895f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.9239f, 8.7986f)
                lineTo(15.0f, 9.6506f)
                moveTo(9.7916f, 17.8913f)
                lineTo(13.0651f, 18.8409f)
                moveTo(11.0476f, 13.6441f)
                lineTo(19.0252f, 15.9583f)
                moveTo(9.283f, 4.0254f)
                lineTo(17.2606f, 6.3395f)
                curveTo(17.8271f, 6.5039f, 18.0239f, 7.3497f, 18.4175f, 9.0414f)
                lineTo(18.5193f, 9.479f)
                curveTo(18.6312f, 9.9597f, 18.6871f, 10.2001f, 18.8208f, 10.3868f)
                curveTo(18.9546f, 10.5734f, 19.151f, 10.6853f, 19.5438f, 10.9091f)
                moveTo(19.5438f, 10.9091f)
                lineTo(19.9015f, 11.1128f)
                curveTo(21.284f, 11.9002f, 21.9752f, 12.2939f, 21.9994f, 12.9541f)
                curveTo(22.0236f, 13.6143f, 21.3648f, 14.1039f, 20.0471f, 15.083f)
                lineTo(19.7062f, 15.3363f)
                curveTo(19.3318f, 15.6145f, 19.1446f, 15.7536f, 19.0252f, 15.9583f)
                moveTo(19.5438f, 10.9091f)
                lineTo(17.6388f, 10.3815f)
                moveTo(19.0252f, 15.9583f)
                curveTo(18.9058f, 16.1629f, 18.8678f, 16.4099f, 18.7917f, 16.904f)
                lineTo(18.7224f, 17.3538f)
                curveTo(18.6408f, 17.8835f, 18.5205f, 18.3551f, 18.3926f, 18.7549f)
                curveTo(18.1952f, 19.3717f, 18.0965f, 19.6801f, 17.7378f, 19.8862f)
                curveTo(17.379f, 20.0922f, 17.0322f, 19.9916f, 16.3385f, 19.7904f)
            }
        }
            .build()
        return _starAngle!!
    }

private var _starAngle: ImageVector? = null
