package com.chiksmedina.solar.boldduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.HeartLock: ImageVector
    get() {
        if (_heartLock != null) {
            return _heartLock!!
        }
        _heartLock = Builder(
            name = "HeartLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(8.4957f, 20.0367f)
                curveTo(5.9684f, 18.1516f, 3.0f, 15.9375f, 3.0f, 12.0992f)
                curveTo(3.0f, 7.862f, 7.9501f, 4.857f, 12.0f, 8.9306f)
                curveTo(16.0499f, 4.857f, 21.0f, 7.862f, 21.0f, 12.0992f)
                curveTo(21.0f, 15.9375f, 18.0316f, 18.1516f, 15.5044f, 20.0367f)
                curveTo(15.2417f, 20.2327f, 14.9838f, 20.4251f, 14.7344f, 20.6154f)
                curveTo(13.8f, 21.3285f, 12.9f, 22.0f, 12.0f, 22.0f)
                curveTo(11.1f, 22.0f, 10.2f, 21.3285f, 9.2656f, 20.6154f)
                curveTo(9.0162f, 20.4251f, 8.7583f, 20.2327f, 8.4957f, 20.0367f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.9142f, 12.4142f, 15.25f, 12.0f, 15.25f)
                curveTo(11.5858f, 15.25f, 11.25f, 14.9142f, 11.25f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.75f, 7.0f)
                curveTo(7.75f, 5.4953f, 8.1973f, 4.4609f, 8.8889f, 3.7992f)
                curveTo(9.586f, 3.1321f, 10.6294f, 2.75f, 12.0f, 2.75f)
                curveTo(13.3706f, 2.75f, 14.414f, 3.1321f, 15.1112f, 3.7992f)
                curveTo(15.8027f, 4.4609f, 16.25f, 5.4953f, 16.25f, 7.0f)
                verticalLineTo(7.0013f)
                curveTo(16.7736f, 7.0139f, 17.2781f, 7.1143f, 17.75f, 7.2892f)
                verticalLineTo(7.0f)
                curveTo(17.75f, 5.191f, 17.2036f, 3.7253f, 16.1482f, 2.7155f)
                curveTo(15.0985f, 1.711f, 13.6418f, 1.25f, 12.0f, 1.25f)
                curveTo(10.3582f, 1.25f, 8.9015f, 1.711f, 7.8518f, 2.7155f)
                curveTo(6.7965f, 3.7253f, 6.25f, 5.191f, 6.25f, 7.0f)
                verticalLineTo(7.2892f)
                curveTo(6.7219f, 7.1143f, 7.2264f, 7.0139f, 7.75f, 7.0013f)
                verticalLineTo(7.0f)
                close()
            }
        }
            .build()
        return _heartLock!!
    }

private var _heartLock: ImageVector? = null
