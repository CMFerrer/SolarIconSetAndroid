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

public val TimeGroup.AlarmPause: ImageVector
    get() {
        if (_alarmPause != null) {
            return _alarmPause!!
        }
        _alarmPause = Builder(name = "AlarmPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 13.0001f)
                curveTo(21.0f, 17.9707f, 16.9705f, 22.0001f, 12.0f, 22.0001f)
                curveTo(7.0294f, 22.0001f, 3.0f, 17.9707f, 3.0f, 13.0001f)
                curveTo(3.0f, 8.0295f, 7.0294f, 4.0001f, 12.0f, 4.0001f)
                curveTo(16.9705f, 4.0001f, 21.0f, 8.0295f, 21.0f, 13.0001f)
                close()
                moveTo(16.0f, 15.5001f)
                curveTo(16.0f, 15.966f, 16.0f, 16.199f, 15.9239f, 16.3828f)
                curveTo(15.8224f, 16.6278f, 15.6277f, 16.8225f, 15.3827f, 16.924f)
                curveTo(15.1989f, 17.0001f, 14.9659f, 17.0001f, 14.5f, 17.0001f)
                curveTo(14.034f, 17.0001f, 13.8011f, 17.0001f, 13.6173f, 16.924f)
                curveTo(13.3723f, 16.8225f, 13.1776f, 16.6278f, 13.0761f, 16.3828f)
                curveTo(13.0f, 16.199f, 13.0f, 15.966f, 13.0f, 15.5001f)
                verticalLineTo(10.5001f)
                curveTo(13.0f, 10.0342f, 13.0f, 9.8012f, 13.0761f, 9.6174f)
                curveTo(13.1776f, 9.3724f, 13.3723f, 9.1777f, 13.6173f, 9.0762f)
                curveTo(13.8011f, 9.0001f, 14.034f, 9.0001f, 14.5f, 9.0001f)
                curveTo(14.9659f, 9.0001f, 15.1989f, 9.0001f, 15.3827f, 9.0762f)
                curveTo(15.6277f, 9.1777f, 15.8224f, 9.3724f, 15.9239f, 9.6174f)
                curveTo(16.0f, 9.8012f, 16.0f, 10.0342f, 16.0f, 10.5001f)
                verticalLineTo(15.5001f)
                close()
                moveTo(11.0f, 15.5001f)
                verticalLineTo(10.5001f)
                curveTo(11.0f, 10.0342f, 11.0f, 9.8012f, 10.9239f, 9.6174f)
                curveTo(10.8224f, 9.3724f, 10.6277f, 9.1777f, 10.3827f, 9.0762f)
                curveTo(10.1989f, 9.0001f, 9.9659f, 9.0001f, 9.5f, 9.0001f)
                curveTo(9.034f, 9.0001f, 8.8011f, 9.0001f, 8.6173f, 9.0762f)
                curveTo(8.3723f, 9.1777f, 8.1776f, 9.3724f, 8.0761f, 9.6174f)
                curveTo(8.0f, 9.8012f, 8.0f, 10.0342f, 8.0f, 10.5001f)
                verticalLineTo(15.5001f)
                curveTo(8.0f, 15.966f, 8.0f, 16.199f, 8.0761f, 16.3828f)
                curveTo(8.1776f, 16.6278f, 8.3723f, 16.8225f, 8.6173f, 16.924f)
                curveTo(8.8011f, 17.0001f, 9.034f, 17.0001f, 9.5f, 17.0001f)
                curveTo(9.9659f, 17.0001f, 10.1989f, 17.0001f, 10.3827f, 16.924f)
                curveTo(10.6277f, 16.8225f, 10.8224f, 16.6278f, 10.9239f, 16.3828f)
                curveTo(11.0f, 16.199f, 11.0f, 15.966f, 11.0f, 15.5001f)
                close()
            }
        }
        .build()
        return _alarmPause!!
    }

private var _alarmPause: ImageVector? = null
