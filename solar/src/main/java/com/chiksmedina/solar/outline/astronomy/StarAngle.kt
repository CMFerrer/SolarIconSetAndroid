package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

public val AstronomyGroup.StarAngle: ImageVector
    get() {
        if (_starAngle != null) {
            return _starAngle!!
        }
        _starAngle = Builder(name = "StarAngle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9238f, 8.7991f)
                lineTo(11.5662f, 8.5954f)
                curveTo(11.1733f, 8.3716f, 10.9769f, 8.2597f, 10.8431f, 8.073f)
                curveTo(10.7094f, 7.8864f, 10.6535f, 7.646f, 10.5416f, 7.1653f)
                lineTo(10.4398f, 6.7276f)
                curveTo(10.0462f, 5.036f, 9.8494f, 4.1901f, 9.2829f, 4.0258f)
                moveTo(11.9238f, 8.7991f)
                curveTo(13.3063f, 9.5864f, 13.9975f, 9.9801f, 14.0217f, 10.6404f)
                curveTo(14.0459f, 11.3006f, 13.3871f, 11.7902f, 12.0695f, 12.7693f)
                lineTo(11.7286f, 13.0226f)
                curveTo(11.3541f, 13.3008f, 11.1669f, 13.4399f, 11.0475f, 13.6446f)
                moveTo(11.9238f, 8.7991f)
                lineTo(19.5438f, 10.9095f)
                moveTo(9.7915f, 17.8917f)
                curveTo(10.3431f, 17.648f, 10.477f, 16.7787f, 10.7447f, 15.0401f)
                lineTo(10.814f, 14.5903f)
                curveTo(10.8901f, 14.0962f, 10.9281f, 13.8492f, 11.0475f, 13.6446f)
                moveTo(9.7915f, 17.8917f)
                curveTo(9.7915f, 17.8917f, 8.636f, 17.5922f, 7.4281f, 16.5056f)
                lineTo(7.1156f, 16.2245f)
                curveTo(6.7723f, 15.9157f, 6.6007f, 15.7614f, 6.3932f, 15.7012f)
                curveTo(6.1856f, 15.641f, 5.9657f, 15.6818f, 5.5258f, 15.7634f)
                lineTo(5.1253f, 15.8376f)
                curveTo(3.5774f, 16.1248f, 2.8035f, 16.2683f, 2.4383f, 15.7587f)
                curveTo(2.0733f, 15.2491f, 2.3588f, 14.4238f, 2.9299f, 12.7732f)
                lineTo(3.0777f, 12.3462f)
                curveTo(3.24f, 11.8771f, 3.3211f, 11.6426f, 3.3122f, 11.4007f)
                curveTo(3.3034f, 11.1589f, 3.2055f, 10.937f, 3.0097f, 10.4934f)
                lineTo(2.8315f, 10.0895f)
                curveTo(2.1425f, 8.5284f, 1.7981f, 7.7478f, 2.124f, 7.1891f)
                curveTo(2.4499f, 6.6304f, 3.2304f, 6.6637f, 4.7913f, 6.7301f)
                lineTo(5.1951f, 6.7473f)
                curveTo(5.6386f, 6.7661f, 5.8604f, 6.7756f, 6.0625f, 6.6863f)
                curveTo(6.2645f, 6.597f, 6.424f, 6.4191f, 6.7428f, 6.0634f)
                lineTo(7.0332f, 5.7394f)
                curveTo(8.1553f, 4.4875f, 8.7164f, 3.8615f, 9.2829f, 4.0258f)
                moveTo(9.7915f, 17.8917f)
                lineTo(16.3385f, 19.7908f)
                curveTo(17.0321f, 19.9921f, 17.379f, 20.0927f, 17.7377f, 19.8866f)
                curveTo(18.0965f, 19.6806f, 18.1952f, 19.3721f, 18.3925f, 18.7553f)
                curveTo(18.5205f, 18.3555f, 18.6408f, 17.8839f, 18.7224f, 17.3542f)
                lineTo(18.7916f, 16.9044f)
                curveTo(18.8677f, 16.4104f, 18.9058f, 16.1633f, 19.0251f, 15.9587f)
                moveTo(11.0475f, 13.6446f)
                lineTo(19.0251f, 15.9587f)
                moveTo(9.2829f, 4.0258f)
                lineTo(17.2605f, 6.34f)
                curveTo(17.8271f, 6.5043f, 18.0239f, 7.3501f, 18.4174f, 9.0418f)
                lineTo(18.5193f, 9.4794f)
                curveTo(18.6311f, 9.9601f, 18.687f, 10.2005f, 18.8208f, 10.3872f)
                curveTo(18.9545f, 10.5739f, 19.1509f, 10.6857f, 19.5438f, 10.9095f)
                moveTo(19.5438f, 10.9095f)
                lineTo(19.9014f, 11.1132f)
                curveTo(21.2839f, 11.9006f, 21.9751f, 12.2943f, 21.9994f, 12.9545f)
                curveTo(22.0236f, 13.6148f, 21.3647f, 14.1043f, 20.0471f, 15.0834f)
                lineTo(19.7062f, 15.3367f)
                curveTo(19.3318f, 15.6149f, 19.1445f, 15.754f, 19.0251f, 15.9587f)
            }
        }
        .build()
        return _starAngle!!
    }

private var _starAngle: ImageVector? = null
