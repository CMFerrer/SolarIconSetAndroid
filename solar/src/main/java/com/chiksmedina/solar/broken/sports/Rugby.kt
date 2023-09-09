package com.chiksmedina.solar.broken.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SportsGroup

public val SportsGroup.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.3806f, 5.3806f)
                curveTo(3.2518f, 7.5094f, 2.3872f, 10.5738f, 2.1098f, 13.4572f)
                moveTo(13.4572f, 2.1098f)
                curveTo(15.1273f, 1.9491f, 16.7367f, 1.9854f, 18.0686f, 2.0872f)
                curveTo(20.1483f, 2.2463f, 21.7537f, 3.8517f, 21.9127f, 5.9314f)
                curveTo(22.0146f, 7.2633f, 22.0509f, 8.8727f, 21.8902f, 10.5428f)
                moveTo(13.4572f, 2.1098f)
                lineTo(21.8902f, 10.5428f)
                moveTo(13.4572f, 2.1098f)
                curveTo(11.9685f, 2.253f, 10.4315f, 2.5528f, 9.0f, 3.1023f)
                moveTo(21.8902f, 10.5428f)
                curveTo(21.6128f, 13.4262f, 20.7482f, 16.4906f, 18.6194f, 18.6194f)
                moveTo(10.5428f, 21.8902f)
                curveTo(8.8727f, 22.0509f, 7.2633f, 22.0146f, 5.9314f, 21.9127f)
                curveTo(3.8517f, 21.7537f, 2.2463f, 20.1483f, 2.0872f, 18.0686f)
                curveTo(1.9854f, 16.7367f, 1.9491f, 15.1273f, 2.1098f, 13.4572f)
                moveTo(10.5428f, 21.8902f)
                lineTo(2.1098f, 13.4572f)
                moveTo(10.5428f, 21.8902f)
                curveTo(12.0315f, 21.747f, 13.5685f, 21.4472f, 15.0f, 20.8978f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.3098f, 8.6904f)
                lineTo(8.6904f, 15.3098f)
                moveTo(8.6904f, 12.4729f)
                lineTo(11.5273f, 15.3098f)
                moveTo(10.5817f, 10.5817f)
                lineTo(13.4185f, 13.4185f)
                moveTo(12.4729f, 8.6904f)
                lineTo(15.3098f, 11.5273f)
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
