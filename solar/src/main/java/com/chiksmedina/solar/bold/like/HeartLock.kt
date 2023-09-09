package com.chiksmedina.solar.bold.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.LikeGroup

public val LikeGroup.HeartLock: ImageVector
    get() {
        if (_heartLock != null) {
            return _heartLock!!
        }
        _heartLock = Builder(name = "HeartLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 7.2892f)
                verticalLineTo(7.0f)
                curveTo(6.25f, 5.191f, 6.7965f, 3.7253f, 7.8518f, 2.7155f)
                curveTo(8.9015f, 1.711f, 10.3582f, 1.25f, 12.0f, 1.25f)
                curveTo(13.6418f, 1.25f, 15.0985f, 1.711f, 16.1482f, 2.7155f)
                curveTo(17.2036f, 3.7253f, 17.75f, 5.191f, 17.75f, 7.0f)
                verticalLineTo(7.2892f)
                curveTo(19.634f, 7.9875f, 21.0f, 9.8733f, 21.0f, 12.0992f)
                curveTo(21.0f, 15.9375f, 18.0316f, 18.1516f, 15.5044f, 20.0368f)
                curveTo(15.2417f, 20.2327f, 14.9838f, 20.4251f, 14.7344f, 20.6154f)
                curveTo(13.8f, 21.3285f, 12.9f, 22.0f, 12.0f, 22.0f)
                curveTo(11.1f, 22.0f, 10.2f, 21.3285f, 9.2656f, 20.6154f)
                curveTo(9.0162f, 20.4251f, 8.7583f, 20.2327f, 8.4957f, 20.0368f)
                curveTo(5.9684f, 18.1516f, 3.0f, 15.9375f, 3.0f, 12.0992f)
                curveTo(3.0f, 9.8733f, 4.366f, 7.9875f, 6.25f, 7.2892f)
                close()
                moveTo(7.75f, 7.0f)
                curveTo(7.75f, 5.4953f, 8.1973f, 4.4609f, 8.8889f, 3.7992f)
                curveTo(9.586f, 3.1321f, 10.6294f, 2.75f, 12.0f, 2.75f)
                curveTo(13.3706f, 2.75f, 14.414f, 3.1321f, 15.1112f, 3.7992f)
                curveTo(15.8027f, 4.4609f, 16.25f, 5.4953f, 16.25f, 7.0f)
                verticalLineTo(7.0013f)
                curveTo(14.8849f, 6.9686f, 13.3895f, 7.533f, 12.0f, 8.9306f)
                curveTo(10.6105f, 7.533f, 9.1151f, 6.9686f, 7.75f, 7.0013f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.9142f, 12.4142f, 15.25f, 12.0f, 15.25f)
                curveTo(11.5858f, 15.25f, 11.25f, 14.9142f, 11.25f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                close()
            }
        }
        .build()
        return _heartLock!!
    }

private var _heartLock: ImageVector? = null
