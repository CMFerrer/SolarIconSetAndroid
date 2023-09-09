package com.chiksmedina.solar.broken.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.TimeGroup

public val TimeGroup.StopwatchPause: ImageVector
    get() {
        if (_stopwatchPause != null) {
            return _stopwatchPause!!
        }
        _stopwatchPause = Builder(name = "StopwatchPause", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 10.5f)
                curveTo(8.0f, 10.0341f, 8.0f, 9.8011f, 8.0761f, 9.6173f)
                curveTo(8.1776f, 9.3723f, 8.3723f, 9.1776f, 8.6173f, 9.0761f)
                curveTo(8.8011f, 9.0f, 9.0341f, 9.0f, 9.5f, 9.0f)
                curveTo(9.9659f, 9.0f, 10.1989f, 9.0f, 10.3827f, 9.0761f)
                curveTo(10.6277f, 9.1776f, 10.8224f, 9.3723f, 10.9239f, 9.6173f)
                curveTo(11.0f, 9.8011f, 11.0f, 10.0341f, 11.0f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(11.0f, 15.9659f, 11.0f, 16.1989f, 10.9239f, 16.3827f)
                curveTo(10.8224f, 16.6277f, 10.6277f, 16.8224f, 10.3827f, 16.9239f)
                curveTo(10.1989f, 17.0f, 9.9659f, 17.0f, 9.5f, 17.0f)
                curveTo(9.0341f, 17.0f, 8.8011f, 17.0f, 8.6173f, 16.9239f)
                curveTo(8.3723f, 16.8224f, 8.1776f, 16.6277f, 8.0761f, 16.3827f)
                curveTo(8.0f, 16.1989f, 8.0f, 15.9659f, 8.0f, 15.5f)
                verticalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 10.5f)
                curveTo(13.0f, 10.0341f, 13.0f, 9.8011f, 13.0761f, 9.6173f)
                curveTo(13.1776f, 9.3723f, 13.3723f, 9.1776f, 13.6173f, 9.0761f)
                curveTo(13.8011f, 9.0f, 14.0341f, 9.0f, 14.5f, 9.0f)
                curveTo(14.9659f, 9.0f, 15.1989f, 9.0f, 15.3827f, 9.0761f)
                curveTo(15.6277f, 9.1776f, 15.8224f, 9.3723f, 15.9239f, 9.6173f)
                curveTo(16.0f, 9.8011f, 16.0f, 10.0341f, 16.0f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(16.0f, 15.9659f, 16.0f, 16.1989f, 15.9239f, 16.3827f)
                curveTo(15.8224f, 16.6277f, 15.6277f, 16.8224f, 15.3827f, 16.9239f)
                curveTo(15.1989f, 17.0f, 14.9659f, 17.0f, 14.5f, 17.0f)
                curveTo(14.0341f, 17.0f, 13.8011f, 17.0f, 13.6173f, 16.9239f)
                curveTo(13.3723f, 16.8224f, 13.1776f, 16.6277f, 13.0761f, 16.3827f)
                curveTo(13.0f, 16.1989f, 13.0f, 15.9659f, 13.0f, 15.5f)
                verticalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 5.204f)
                curveTo(8.8238f, 4.4383f, 10.3607f, 4.0f, 12.0f, 4.0f)
                curveTo(16.9706f, 4.0f, 21.0f, 8.0294f, 21.0f, 13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                curveTo(3.0f, 11.3607f, 3.4383f, 9.8238f, 4.204f, 8.5f)
            }
        }
        .build()
        return _stopwatchPause!!
    }

private var _stopwatchPause: ImageVector? = null
