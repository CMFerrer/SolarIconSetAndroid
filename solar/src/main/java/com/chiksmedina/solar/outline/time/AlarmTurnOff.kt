package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.136f, 1.6026f)
                curveTo(8.3556f, 1.9539f, 8.2488f, 2.4166f, 7.8975f, 2.6361f)
                lineTo(3.8975f, 5.1361f)
                curveTo(3.5462f, 5.3556f, 3.0835f, 5.2488f, 2.864f, 4.8976f)
                curveTo(2.6445f, 4.5463f, 2.7513f, 4.0836f, 3.1025f, 3.8641f)
                lineTo(7.1025f, 1.3641f)
                curveTo(7.4538f, 1.1446f, 7.9165f, 1.2514f, 8.136f, 1.6026f)
                close()
                moveTo(15.864f, 1.6026f)
                curveTo(16.0835f, 1.2514f, 16.5462f, 1.1446f, 16.8975f, 1.3641f)
                lineTo(20.8975f, 3.8641f)
                curveTo(21.2488f, 4.0836f, 21.3555f, 4.5464f, 21.136f, 4.8976f)
                curveTo(20.9165f, 5.2488f, 20.4538f, 5.3556f, 20.1025f, 5.1361f)
                lineTo(16.1025f, 2.6361f)
                curveTo(15.7512f, 2.4166f, 15.6445f, 1.9539f, 15.864f, 1.6026f)
                close()
                moveTo(12.0f, 4.7501f)
                curveTo(7.4436f, 4.7501f, 3.75f, 8.4438f, 3.75f, 13.0001f)
                curveTo(3.75f, 17.5564f, 7.4436f, 21.2501f, 12.0f, 21.2501f)
                curveTo(16.5563f, 21.2501f, 20.25f, 17.5564f, 20.25f, 13.0001f)
                curveTo(20.25f, 8.4438f, 16.5563f, 4.7501f, 12.0f, 4.7501f)
                close()
                moveTo(2.25f, 13.0001f)
                curveTo(2.25f, 7.6153f, 6.6152f, 3.2501f, 12.0f, 3.2501f)
                curveTo(17.3848f, 3.2501f, 21.75f, 7.6153f, 21.75f, 13.0001f)
                curveTo(21.75f, 18.3849f, 17.3848f, 22.7501f, 12.0f, 22.7501f)
                curveTo(6.6152f, 22.7501f, 2.25f, 18.3849f, 2.25f, 13.0001f)
                close()
                moveTo(14.6517f, 10.3484f)
                curveTo(14.9445f, 10.6413f, 14.9445f, 11.1162f, 14.6517f, 11.4091f)
                lineTo(13.0606f, 13.0001f)
                lineTo(14.6516f, 14.5911f)
                curveTo(14.9445f, 14.884f, 14.9445f, 15.3589f, 14.6516f, 15.6518f)
                curveTo(14.3587f, 15.9447f, 13.8839f, 15.9447f, 13.591f, 15.6518f)
                lineTo(12.0f, 14.0608f)
                lineTo(10.409f, 15.6518f)
                curveTo(10.1161f, 15.9446f, 9.6412f, 15.9446f, 9.3483f, 15.6517f)
                curveTo(9.0555f, 15.3589f, 9.0555f, 14.884f, 9.3483f, 14.5911f)
                lineTo(10.9393f, 13.0001f)
                lineTo(9.3483f, 11.4091f)
                curveTo(9.0554f, 11.1162f, 9.0554f, 10.6414f, 9.3483f, 10.3485f)
                curveTo(9.6412f, 10.0556f, 10.1161f, 10.0556f, 10.409f, 10.3485f)
                lineTo(12.0f, 11.9395f)
                lineTo(13.591f, 10.3484f)
                curveTo(13.8839f, 10.0556f, 14.3588f, 10.0556f, 14.6517f, 10.3484f)
                close()
            }
        }
            .build()
        return _alarmTurnOff!!
    }

private var _alarmTurnOff: ImageVector? = null
