package com.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TimeGroup

public val TimeGroup.AlarmTurnOff: ImageVector
    get() {
        if (_alarmTurnOff != null) {
            return _alarmTurnOff!!
        }
        _alarmTurnOff = Builder(name = "AlarmTurnOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0001f, 22.0001f)
                curveTo(16.9707f, 22.0001f, 21.0001f, 17.9707f, 21.0001f, 13.0001f)
                curveTo(21.0001f, 8.0295f, 16.9707f, 4.0001f, 12.0001f, 4.0001f)
                curveTo(7.0295f, 4.0001f, 3.0001f, 8.0295f, 3.0001f, 13.0001f)
                curveTo(3.0001f, 17.9707f, 7.0295f, 22.0001f, 12.0001f, 22.0001f)
                close()
                moveTo(14.6518f, 10.3484f)
                curveTo(14.9446f, 10.6413f, 14.9446f, 11.1162f, 14.6518f, 11.4091f)
                lineTo(13.0607f, 13.0001f)
                lineTo(14.6517f, 14.5911f)
                curveTo(14.9446f, 14.884f, 14.9446f, 15.3589f, 14.6517f, 15.6518f)
                curveTo(14.3588f, 15.9447f, 13.884f, 15.9447f, 13.5911f, 15.6518f)
                lineTo(12.0001f, 14.0608f)
                lineTo(10.4091f, 15.6518f)
                curveTo(10.1162f, 15.9446f, 9.6413f, 15.9446f, 9.3484f, 15.6518f)
                curveTo(9.0556f, 15.3589f, 9.0556f, 14.884f, 9.3484f, 14.5911f)
                lineTo(10.9394f, 13.0001f)
                lineTo(9.3484f, 11.4091f)
                curveTo(9.0555f, 11.1162f, 9.0555f, 10.6414f, 9.3484f, 10.3485f)
                curveTo(9.6413f, 10.0556f, 10.1162f, 10.0556f, 10.4091f, 10.3485f)
                lineTo(12.0001f, 11.9395f)
                lineTo(13.5911f, 10.3484f)
                curveTo(13.884f, 10.0556f, 14.3589f, 10.0556f, 14.6518f, 10.3484f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.1361f, 1.6026f)
                curveTo(8.3557f, 1.9539f, 8.2489f, 2.4166f, 7.8976f, 2.6361f)
                lineTo(3.8976f, 5.1361f)
                curveTo(3.5463f, 5.3556f, 3.0836f, 5.2488f, 2.8641f, 4.8976f)
                curveTo(2.6446f, 4.5463f, 2.7513f, 4.0836f, 3.1026f, 3.8641f)
                lineTo(7.1026f, 1.3641f)
                curveTo(7.4539f, 1.1446f, 7.9166f, 1.2514f, 8.1361f, 1.6026f)
                close()
                moveTo(15.8641f, 1.6026f)
                curveTo(16.0836f, 1.2514f, 16.5463f, 1.1446f, 16.8976f, 1.3641f)
                lineTo(20.8976f, 3.8641f)
                curveTo(21.2489f, 4.0836f, 21.3556f, 4.5464f, 21.1361f, 4.8976f)
                curveTo(20.9166f, 5.2488f, 20.4539f, 5.3556f, 20.1026f, 5.1361f)
                lineTo(16.1026f, 2.6361f)
                curveTo(15.7513f, 2.4166f, 15.6446f, 1.9539f, 15.8641f, 1.6026f)
                close()
            }
        }
        .build()
        return _alarmTurnOff!!
    }

private var _alarmTurnOff: ImageVector? = null
