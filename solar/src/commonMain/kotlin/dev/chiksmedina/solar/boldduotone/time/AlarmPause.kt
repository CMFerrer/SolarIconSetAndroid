package dev.chiksmedina.solar.boldduotone.time

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
import dev.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.AlarmPause: ImageVector
    get() {
        if (_alarmPause != null) {
            return _alarmPause!!
        }
        _alarmPause = Builder(
            name = "AlarmPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                moveTo(11.0f, 15.5f)
                verticalLineTo(10.5f)
                verticalLineTo(10.5f)
                curveTo(11.0f, 10.0341f, 11.0f, 9.8011f, 10.9239f, 9.6173f)
                curveTo(10.8224f, 9.3723f, 10.6277f, 9.1776f, 10.3827f, 9.0761f)
                curveTo(10.1989f, 9.0f, 9.9659f, 9.0f, 9.5f, 9.0f)
                curveTo(9.0341f, 9.0f, 8.8011f, 9.0f, 8.6173f, 9.0761f)
                curveTo(8.3723f, 9.1776f, 8.1776f, 9.3723f, 8.0761f, 9.6173f)
                curveTo(8.0f, 9.8011f, 8.0f, 10.0341f, 8.0f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(8.0f, 15.9659f, 8.0f, 16.1989f, 8.0761f, 16.3827f)
                curveTo(8.1776f, 16.6277f, 8.3723f, 16.8224f, 8.6173f, 16.9239f)
                curveTo(8.8011f, 17.0f, 9.0341f, 17.0f, 9.5f, 17.0f)
                curveTo(9.9659f, 17.0f, 10.1989f, 17.0f, 10.3827f, 16.9239f)
                curveTo(10.6277f, 16.8224f, 10.8224f, 16.6277f, 10.9239f, 16.3827f)
                curveTo(11.0f, 16.1989f, 11.0f, 15.9659f, 11.0f, 15.5f)
                verticalLineTo(15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 15.5f)
                verticalLineTo(10.5f)
                curveTo(16.0f, 10.0341f, 16.0f, 9.8011f, 15.9239f, 9.6173f)
                curveTo(15.8224f, 9.3723f, 15.6277f, 9.1776f, 15.3827f, 9.0761f)
                curveTo(15.1989f, 9.0f, 14.9659f, 9.0f, 14.5f, 9.0f)
                curveTo(14.0341f, 9.0f, 13.8011f, 9.0f, 13.6173f, 9.0761f)
                curveTo(13.3723f, 9.1776f, 13.1776f, 9.3723f, 13.0761f, 9.6173f)
                curveTo(13.0f, 9.8011f, 13.0f, 10.0341f, 13.0f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(13.0f, 15.9659f, 13.0f, 16.1989f, 13.0761f, 16.3827f)
                curveTo(13.1776f, 16.6277f, 13.3723f, 16.8224f, 13.6173f, 16.9239f)
                curveTo(13.8011f, 17.0f, 14.0341f, 17.0f, 14.5f, 17.0f)
                curveTo(14.9659f, 17.0f, 15.1989f, 17.0f, 15.3827f, 16.9239f)
                curveTo(15.6277f, 16.8224f, 15.8224f, 16.6277f, 15.9239f, 16.3827f)
                curveTo(16.0f, 16.1989f, 16.0f, 15.9659f, 16.0f, 15.5f)
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
        return _alarmPause!!
    }

private var _alarmPause: ImageVector? = null
