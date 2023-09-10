package com.chiksmedina.solar.broken.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.TimeGroup

val TimeGroup.AlarmTurnOff: ImageVector
    get() {
        if (_alarmTurnOff != null) {
            return _alarmTurnOff!!
        }
        _alarmTurnOff = Builder(
            name = "AlarmTurnOff", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.1213f, 15.1213f)
                lineTo(12.0f, 13.0f)
                moveTo(12.0f, 13.0f)
                lineTo(9.8787f, 10.8787f)
                moveTo(12.0f, 13.0f)
                lineTo(14.1213f, 10.8787f)
                moveTo(12.0f, 13.0f)
                lineTo(9.8787f, 15.1213f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.5f, 4.5f)
                lineTo(7.5f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 4.5f)
                lineTo(16.5f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 5.204f)
                curveTo(8.8238f, 4.4383f, 10.3607f, 4.0f, 12.0f, 4.0f)
                curveTo(16.9706f, 4.0f, 21.0f, 8.0294f, 21.0f, 13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                curveTo(3.0f, 11.3607f, 3.4383f, 9.8238f, 4.204f, 8.5f)
            }
        }
            .build()
        return _alarmTurnOff!!
    }

private var _alarmTurnOff: ImageVector? = null
