package com.chiksmedina.solar.bold.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NotesGroup

val NotesGroup.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = Builder(
            name = "Notebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.75f, 2.0127f)
                verticalLineTo(22.0f)
                lineTo(15.0f, 22.0f)
                curveTo(17.8284f, 22.0f, 19.2426f, 22.0f, 20.1213f, 21.1213f)
                curveTo(21.0f, 20.2426f, 21.0f, 18.8284f, 21.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 5.1716f, 21.0f, 3.7574f, 20.1213f, 2.8787f)
                curveTo(19.2426f, 2.0f, 17.8284f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                lineTo(8.75f, 2.0127f)
                close()
                moveTo(10.75f, 6.5f)
                curveTo(10.75f, 6.0858f, 11.0858f, 5.75f, 11.5f, 5.75f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 5.75f, 17.25f, 6.0858f, 17.25f, 6.5f)
                curveTo(17.25f, 6.9142f, 16.9142f, 7.25f, 16.5f, 7.25f)
                horizontalLineTo(11.5f)
                curveTo(11.0858f, 7.25f, 10.75f, 6.9142f, 10.75f, 6.5f)
                close()
                moveTo(10.75f, 10.0f)
                curveTo(10.75f, 9.5858f, 11.0858f, 9.25f, 11.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 9.25f, 17.25f, 9.5858f, 17.25f, 10.0f)
                curveTo(17.25f, 10.4142f, 16.9142f, 10.75f, 16.5f, 10.75f)
                horizontalLineTo(11.5f)
                curveTo(11.0858f, 10.75f, 10.75f, 10.4142f, 10.75f, 10.0f)
                close()
                moveTo(3.0007f, 7.25f)
                curveTo(3.0075f, 4.9143f, 3.0814f, 3.676f, 3.8787f, 2.8787f)
                curveTo(4.5537f, 2.2037f, 5.5447f, 2.0472f, 7.25f, 2.011f)
                verticalLineTo(21.9891f)
                curveTo(5.5447f, 21.9528f, 4.5537f, 21.7963f, 3.8787f, 21.1213f)
                curveTo(3.0814f, 20.324f, 3.0075f, 19.0857f, 3.0007f, 16.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 16.75f, 4.75f, 16.4142f, 4.75f, 16.0f)
                curveTo(4.75f, 15.5858f, 4.4142f, 15.25f, 4.0f, 15.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 12.75f, 4.75f, 12.4142f, 4.75f, 12.0f)
                curveTo(4.75f, 11.5858f, 4.4142f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 8.75f, 4.75f, 8.4142f, 4.75f, 8.0f)
                curveTo(4.75f, 7.5858f, 4.4142f, 7.25f, 4.0f, 7.25f)
                horizontalLineTo(3.0007f)
                close()
                moveTo(3.0007f, 7.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 7.25f, 1.25f, 7.5858f, 1.25f, 8.0f)
                curveTo(1.25f, 8.4142f, 1.5858f, 8.75f, 2.0f, 8.75f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 7.7381f, 3.0f, 7.4883f, 3.0007f, 7.25f)
                close()
                moveTo(3.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(3.0f, 15.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 15.25f, 1.25f, 15.5858f, 1.25f, 16.0f)
                curveTo(1.25f, 16.4142f, 1.5858f, 16.75f, 2.0f, 16.75f)
                horizontalLineTo(3.0007f)
                curveTo(3.0f, 16.5117f, 3.0f, 16.2619f, 3.0f, 16.0f)
                verticalLineTo(15.25f)
                close()
            }
        }
            .build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
