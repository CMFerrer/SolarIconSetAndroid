package com.chiksmedina.solar.boldduotone.time

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
import com.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.AlarmRemove: ImageVector
    get() {
        if (_alarmRemove != null) {
            return _alarmRemove!!
        }
        _alarmRemove = Builder(
            name = "AlarmRemove", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(16.9706f, 22.0f, 21.0f, 17.9706f, 21.0f, 13.0f)
                curveTo(21.0f, 8.0294f, 16.9706f, 4.0f, 12.0f, 4.0f)
                curveTo(7.0294f, 4.0f, 3.0f, 8.0294f, 3.0f, 13.0f)
                curveTo(3.0f, 17.9706f, 7.0294f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 12.25f)
                curveTo(15.4142f, 12.25f, 15.75f, 12.5858f, 15.75f, 13.0f)
                curveTo(15.75f, 13.4142f, 15.4142f, 13.75f, 15.0f, 13.75f)
                lineTo(9.0f, 13.75f)
                curveTo(8.5858f, 13.75f, 8.25f, 13.4142f, 8.25f, 13.0f)
                curveTo(8.25f, 12.5858f, 8.5858f, 12.25f, 9.0f, 12.25f)
                lineTo(15.0f, 12.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2405f, 2.3399f)
                curveTo(8.4541f, 2.6784f, 8.3502f, 3.1244f, 8.0084f, 3.336f)
                lineTo(4.1166f, 5.7456f)
                curveTo(3.7748f, 5.9572f, 3.3246f, 5.8543f, 3.111f, 5.5157f)
                curveTo(2.8974f, 5.1772f, 3.0013f, 4.7312f, 3.3431f, 4.5196f)
                lineTo(7.2349f, 2.11f)
                curveTo(7.5767f, 1.8984f, 8.0269f, 2.0013f, 8.2405f, 2.3399f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.7595f, 2.3398f)
                curveTo(15.9731f, 2.0013f, 16.4233f, 1.8984f, 16.7651f, 2.11f)
                lineTo(20.6569f, 4.5196f)
                curveTo(20.9987f, 4.7312f, 21.1026f, 5.1772f, 20.889f, 5.5157f)
                curveTo(20.6754f, 5.8543f, 20.2252f, 5.9572f, 19.8834f, 5.7456f)
                lineTo(15.9916f, 3.336f)
                curveTo(15.6498f, 3.1244f, 15.5459f, 2.6784f, 15.7595f, 2.3398f)
                close()
            }
        }
            .build()
        return _alarmRemove!!
    }

private var _alarmRemove: ImageVector? = null
