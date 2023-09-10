package com.chiksmedina.solar.bold.notes

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
import com.chiksmedina.solar.bold.NotesGroup

val NotesGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(
            name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 4.0572f, 2.0f, 3.5858f, 2.2929f, 3.2929f)
                curveTo(2.5858f, 3.0f, 3.0572f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.9428f, 3.0f, 21.4142f, 3.0f, 21.7071f, 3.2929f)
                curveTo(22.0f, 3.5858f, 22.0f, 4.0572f, 22.0f, 5.0f)
                curveTo(22.0f, 5.9428f, 22.0f, 6.4142f, 21.7071f, 6.7071f)
                curveTo(21.4142f, 7.0f, 20.9428f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.0572f, 7.0f, 2.5858f, 7.0f, 2.2929f, 6.7071f)
                curveTo(2.0f, 6.4142f, 2.0f, 5.9428f, 2.0f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.0689f, 8.4999f)
                curveTo(20.2101f, 8.5f, 20.3551f, 8.5f, 20.5f, 8.498f)
                verticalLineTo(12.9999f)
                curveTo(20.5f, 16.7711f, 20.5f, 18.6568f, 19.3284f, 19.8283f)
                curveTo(18.1569f, 20.9999f, 16.2712f, 20.9999f, 12.5f, 20.9999f)
                horizontalLineTo(11.5f)
                curveTo(7.7288f, 20.9999f, 5.8432f, 20.9999f, 4.6716f, 19.8283f)
                curveTo(3.5f, 18.6568f, 3.5f, 16.7711f, 3.5f, 12.9999f)
                verticalLineTo(8.498f)
                curveTo(3.6449f, 8.5f, 3.79f, 8.5f, 3.9311f, 8.4999f)
                horizontalLineTo(20.0689f)
                close()
                moveTo(9.0f, 11.9999f)
                curveTo(9.0f, 11.5339f, 9.0f, 11.301f, 9.0761f, 11.1172f)
                curveTo(9.1776f, 10.8722f, 9.3723f, 10.6775f, 9.6173f, 10.576f)
                curveTo(9.8011f, 10.4999f, 10.0341f, 10.4999f, 10.5f, 10.4999f)
                horizontalLineTo(13.5f)
                curveTo(13.9659f, 10.4999f, 14.1989f, 10.4999f, 14.3827f, 10.576f)
                curveTo(14.6277f, 10.6775f, 14.8224f, 10.8722f, 14.9239f, 11.1172f)
                curveTo(15.0f, 11.301f, 15.0f, 11.5339f, 15.0f, 11.9999f)
                curveTo(15.0f, 12.4658f, 15.0f, 12.6988f, 14.9239f, 12.8826f)
                curveTo(14.8224f, 13.1276f, 14.6277f, 13.3223f, 14.3827f, 13.4238f)
                curveTo(14.1989f, 13.4999f, 13.9659f, 13.4999f, 13.5f, 13.4999f)
                horizontalLineTo(10.5f)
                curveTo(10.0341f, 13.4999f, 9.8011f, 13.4999f, 9.6173f, 13.4238f)
                curveTo(9.3723f, 13.3223f, 9.1776f, 13.1276f, 9.0761f, 12.8826f)
                curveTo(9.0f, 12.6988f, 9.0f, 12.4658f, 9.0f, 11.9999f)
                close()
            }
        }
            .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
