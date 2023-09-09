package com.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TimeGroup

public val TimeGroup.StopwatchPause: ImageVector
    get() {
        if (_stopwatchPause != null) {
            return _stopwatchPause!!
        }
        _stopwatchPause = Builder(name = "StopwatchPause", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 2.75f)
                curveTo(9.25f, 2.3358f, 9.5858f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 2.0f, 14.75f, 2.3358f, 14.75f, 2.75f)
                curveTo(14.75f, 3.1642f, 14.4142f, 3.5f, 14.0f, 3.5f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 3.5f, 9.25f, 3.1642f, 9.25f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(16.9706f, 23.0f, 21.0f, 18.9706f, 21.0f, 14.0f)
                curveTo(21.0f, 9.0294f, 16.9706f, 5.0f, 12.0f, 5.0f)
                curveTo(7.0294f, 5.0f, 3.0f, 9.0294f, 3.0f, 14.0f)
                curveTo(3.0f, 18.9706f, 7.0294f, 23.0f, 12.0f, 23.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.5f)
                verticalLineTo(11.5f)
                verticalLineTo(11.5f)
                curveTo(11.0f, 11.0341f, 11.0f, 10.8011f, 10.9239f, 10.6173f)
                curveTo(10.8224f, 10.3723f, 10.6277f, 10.1776f, 10.3827f, 10.0761f)
                curveTo(10.1989f, 10.0f, 9.9659f, 10.0f, 9.5f, 10.0f)
                curveTo(9.0341f, 10.0f, 8.8011f, 10.0f, 8.6173f, 10.0761f)
                curveTo(8.3723f, 10.1776f, 8.1776f, 10.3723f, 8.0761f, 10.6173f)
                curveTo(8.0f, 10.8011f, 8.0f, 11.0341f, 8.0f, 11.5f)
                verticalLineTo(16.5f)
                curveTo(8.0f, 16.9659f, 8.0f, 17.1989f, 8.0761f, 17.3827f)
                curveTo(8.1776f, 17.6277f, 8.3723f, 17.8224f, 8.6173f, 17.9239f)
                curveTo(8.8011f, 18.0f, 9.0341f, 18.0f, 9.5f, 18.0f)
                curveTo(9.9659f, 18.0f, 10.1989f, 18.0f, 10.3827f, 17.9239f)
                curveTo(10.6277f, 17.8224f, 10.8224f, 17.6277f, 10.9239f, 17.3827f)
                curveTo(11.0f, 17.1989f, 11.0f, 16.9659f, 11.0f, 16.5f)
                verticalLineTo(16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.5f)
                verticalLineTo(11.5f)
                curveTo(16.0f, 11.0341f, 16.0f, 10.8011f, 15.9239f, 10.6173f)
                curveTo(15.8224f, 10.3723f, 15.6277f, 10.1776f, 15.3827f, 10.0761f)
                curveTo(15.1989f, 10.0f, 14.9659f, 10.0f, 14.5f, 10.0f)
                curveTo(14.0341f, 10.0f, 13.8011f, 10.0f, 13.6173f, 10.0761f)
                curveTo(13.3723f, 10.1776f, 13.1776f, 10.3723f, 13.0761f, 10.6173f)
                curveTo(13.0f, 10.8011f, 13.0f, 11.0341f, 13.0f, 11.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 16.9659f, 13.0f, 17.1989f, 13.0761f, 17.3827f)
                curveTo(13.1776f, 17.6277f, 13.3723f, 17.8224f, 13.6173f, 17.9239f)
                curveTo(13.8011f, 18.0f, 14.0341f, 18.0f, 14.5f, 18.0f)
                curveTo(14.9659f, 18.0f, 15.1989f, 18.0f, 15.3827f, 17.9239f)
                curveTo(15.6277f, 17.8224f, 15.8224f, 17.6277f, 15.9239f, 17.3827f)
                curveTo(16.0f, 17.1989f, 16.0f, 16.9659f, 16.0f, 16.5f)
                close()
            }
        }
        .build()
        return _stopwatchPause!!
    }

private var _stopwatchPause: ImageVector? = null
