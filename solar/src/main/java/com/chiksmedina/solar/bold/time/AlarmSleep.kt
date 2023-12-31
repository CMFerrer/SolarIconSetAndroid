package com.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TimeGroup

val TimeGroup.AlarmSleep: ImageVector
    get() {
        if (_alarmSleep != null) {
            return _alarmSleep!!
        }
        _alarmSleep = Builder(
            name = "AlarmSleep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.136f, 1.6026f)
                curveTo(8.3555f, 1.9539f, 8.2487f, 2.4166f, 7.8975f, 2.6361f)
                lineTo(3.8975f, 5.1361f)
                curveTo(3.5462f, 5.3556f, 3.0835f, 5.2488f, 2.864f, 4.8976f)
                curveTo(2.6444f, 4.5463f, 2.7512f, 4.0836f, 3.1025f, 3.8641f)
                lineTo(7.1025f, 1.3641f)
                curveTo(7.4538f, 1.1446f, 7.9165f, 1.2514f, 8.136f, 1.6026f)
                close()
                moveTo(15.864f, 1.6026f)
                curveTo(16.0835f, 1.2514f, 16.5462f, 1.1446f, 16.8975f, 1.3641f)
                lineTo(20.8975f, 3.8641f)
                curveTo(21.2487f, 4.0836f, 21.3555f, 4.5464f, 21.136f, 4.8976f)
                curveTo(20.9164f, 5.2488f, 20.4537f, 5.3556f, 20.1025f, 5.1361f)
                lineTo(16.1025f, 2.6361f)
                curveTo(15.7512f, 2.4166f, 15.6444f, 1.9539f, 15.864f, 1.6026f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0001f)
                curveTo(16.9705f, 22.0001f, 21.0f, 17.9707f, 21.0f, 13.0001f)
                curveTo(21.0f, 8.0295f, 16.9705f, 4.0001f, 12.0f, 4.0001f)
                curveTo(7.0294f, 4.0001f, 3.0f, 8.0295f, 3.0f, 13.0001f)
                curveTo(3.0f, 17.9707f, 7.0294f, 22.0001f, 12.0f, 22.0001f)
                close()
                moveTo(9.0f, 10.7501f)
                curveTo(8.5858f, 10.7501f, 8.25f, 10.4143f, 8.25f, 10.0001f)
                curveTo(8.25f, 9.5859f, 8.5858f, 9.2501f, 9.0f, 9.2501f)
                horizontalLineTo(15.0f)
                curveTo(15.3033f, 9.2501f, 15.5768f, 9.4328f, 15.6929f, 9.7131f)
                curveTo(15.809f, 9.9933f, 15.7448f, 10.3159f, 15.5303f, 10.5304f)
                lineTo(10.8106f, 15.2501f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 15.2501f, 15.75f, 15.5859f, 15.75f, 16.0001f)
                curveTo(15.75f, 16.4143f, 15.4142f, 16.7501f, 15.0f, 16.7501f)
                horizontalLineTo(9.0f)
                curveTo(8.6966f, 16.7501f, 8.4232f, 16.5674f, 8.3071f, 16.2871f)
                curveTo(8.191f, 16.0069f, 8.2551f, 15.6843f, 8.4697f, 15.4698f)
                lineTo(13.1893f, 10.7501f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _alarmSleep!!
    }

private var _alarmSleep: ImageVector? = null
