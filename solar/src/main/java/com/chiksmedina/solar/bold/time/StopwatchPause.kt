package com.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.bold.TimeGroup

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
                moveTo(21.0f, 13.75f)
                curveTo(21.0f, 18.7206f, 16.9706f, 22.75f, 12.0f, 22.75f)
                curveTo(7.0294f, 22.75f, 3.0f, 18.7206f, 3.0f, 13.75f)
                curveTo(3.0f, 8.7794f, 7.0294f, 4.75f, 12.0f, 4.75f)
                curveTo(16.9706f, 4.75f, 21.0f, 8.7794f, 21.0f, 13.75f)
                close()
                moveTo(11.0f, 16.25f)
                verticalLineTo(11.25f)
                curveTo(11.0f, 10.7841f, 11.0f, 10.5511f, 10.9239f, 10.3673f)
                curveTo(10.8224f, 10.1223f, 10.6277f, 9.9276f, 10.3827f, 9.8261f)
                curveTo(10.1989f, 9.75f, 9.9659f, 9.75f, 9.5f, 9.75f)
                curveTo(9.0341f, 9.75f, 8.8011f, 9.75f, 8.6173f, 9.8261f)
                curveTo(8.3723f, 9.9276f, 8.1776f, 10.1223f, 8.0761f, 10.3673f)
                curveTo(8.0f, 10.5511f, 8.0f, 10.7841f, 8.0f, 11.25f)
                verticalLineTo(16.25f)
                curveTo(8.0f, 16.7159f, 8.0f, 16.9489f, 8.0761f, 17.1327f)
                curveTo(8.1776f, 17.3777f, 8.3723f, 17.5724f, 8.6173f, 17.6739f)
                curveTo(8.8011f, 17.75f, 9.0341f, 17.75f, 9.5f, 17.75f)
                curveTo(9.9659f, 17.75f, 10.1989f, 17.75f, 10.3827f, 17.6739f)
                curveTo(10.6277f, 17.5724f, 10.8224f, 17.3777f, 10.9239f, 17.1327f)
                curveTo(11.0f, 16.9489f, 11.0f, 16.7159f, 11.0f, 16.25f)
                close()
                moveTo(16.0f, 16.25f)
                verticalLineTo(11.25f)
                curveTo(16.0f, 10.7841f, 16.0f, 10.5511f, 15.9239f, 10.3673f)
                curveTo(15.8224f, 10.1223f, 15.6277f, 9.9276f, 15.3827f, 9.8261f)
                curveTo(15.1989f, 9.75f, 14.9659f, 9.75f, 14.5f, 9.75f)
                curveTo(14.0341f, 9.75f, 13.8011f, 9.75f, 13.6173f, 9.8261f)
                curveTo(13.3723f, 9.9276f, 13.1776f, 10.1223f, 13.0761f, 10.3673f)
                curveTo(13.0f, 10.5511f, 13.0f, 10.7841f, 13.0f, 11.25f)
                verticalLineTo(16.25f)
                curveTo(13.0f, 16.7159f, 13.0f, 16.9489f, 13.0761f, 17.1327f)
                curveTo(13.1776f, 17.3777f, 13.3723f, 17.5724f, 13.6173f, 17.6739f)
                curveTo(13.8011f, 17.75f, 14.0341f, 17.75f, 14.5f, 17.75f)
                curveTo(14.9659f, 17.75f, 15.1989f, 17.75f, 15.3827f, 17.6739f)
                curveTo(15.6277f, 17.5724f, 15.8224f, 17.3777f, 15.9239f, 17.1327f)
                curveTo(16.0f, 16.9489f, 16.0f, 16.7159f, 16.0f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(9.5858f, 2.0f, 9.25f, 2.3358f, 9.25f, 2.75f)
                curveTo(9.25f, 3.1642f, 9.5858f, 3.5f, 10.0f, 3.5f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 3.5f, 14.75f, 3.1642f, 14.75f, 2.75f)
                curveTo(14.75f, 2.3358f, 14.4142f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _stopwatchPause!!
    }

private var _stopwatchPause: ImageVector? = null
