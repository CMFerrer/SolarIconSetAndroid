package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

val SportsGroup.Bowling: ImageVector
    get() {
        if (_bowling != null) {
            return _bowling!!
        }
        _bowling = Builder(
            name = "Bowling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 6.25f)
                curveTo(11.5858f, 6.25f, 11.25f, 6.5858f, 11.25f, 7.0f)
                curveTo(11.25f, 7.4142f, 11.5858f, 7.75f, 12.0f, 7.75f)
                curveTo(12.4142f, 7.75f, 12.75f, 7.4142f, 12.75f, 7.0f)
                curveTo(12.75f, 6.5858f, 12.4142f, 6.25f, 12.0f, 6.25f)
                close()
                moveTo(9.75f, 7.0f)
                curveTo(9.75f, 5.7574f, 10.7574f, 4.75f, 12.0f, 4.75f)
                curveTo(13.2426f, 4.75f, 14.25f, 5.7574f, 14.25f, 7.0f)
                curveTo(14.25f, 8.2426f, 13.2426f, 9.25f, 12.0f, 9.25f)
                curveTo(10.7574f, 9.25f, 9.75f, 8.2426f, 9.75f, 7.0f)
                close()
                moveTo(8.0f, 8.75f)
                curveTo(7.5858f, 8.75f, 7.25f, 9.0858f, 7.25f, 9.5f)
                curveTo(7.25f, 9.9142f, 7.5858f, 10.25f, 8.0f, 10.25f)
                curveTo(8.4142f, 10.25f, 8.75f, 9.9142f, 8.75f, 9.5f)
                curveTo(8.75f, 9.0858f, 8.4142f, 8.75f, 8.0f, 8.75f)
                close()
                moveTo(5.75f, 9.5f)
                curveTo(5.75f, 8.2574f, 6.7574f, 7.25f, 8.0f, 7.25f)
                curveTo(9.2426f, 7.25f, 10.25f, 8.2574f, 10.25f, 9.5f)
                curveTo(10.25f, 10.7426f, 9.2426f, 11.75f, 8.0f, 11.75f)
                curveTo(6.7574f, 11.75f, 5.75f, 10.7426f, 5.75f, 9.5f)
                close()
                moveTo(12.0f, 11.25f)
                curveTo(11.5858f, 11.25f, 11.25f, 11.5858f, 11.25f, 12.0f)
                curveTo(11.25f, 12.4142f, 11.5858f, 12.75f, 12.0f, 12.75f)
                curveTo(12.4142f, 12.75f, 12.75f, 12.4142f, 12.75f, 12.0f)
                curveTo(12.75f, 11.5858f, 12.4142f, 11.25f, 12.0f, 11.25f)
                close()
                moveTo(9.75f, 12.0f)
                curveTo(9.75f, 10.7574f, 10.7574f, 9.75f, 12.0f, 9.75f)
                curveTo(13.2426f, 9.75f, 14.25f, 10.7574f, 14.25f, 12.0f)
                curveTo(14.25f, 13.2426f, 13.2426f, 14.25f, 12.0f, 14.25f)
                curveTo(10.7574f, 14.25f, 9.75f, 13.2426f, 9.75f, 12.0f)
                close()
            }
        }
            .build()
        return _bowling!!
    }

private var _bowling: ImageVector? = null
