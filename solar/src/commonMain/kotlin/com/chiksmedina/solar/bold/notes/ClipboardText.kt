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

val NotesGroup.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) {
            return _clipboardText!!
        }
        _clipboardText = Builder(
            name = "ClipboardText", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5f, 2.0f)
                curveTo(8.6716f, 2.0f, 8.0f, 2.6716f, 8.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 5.3284f, 8.6716f, 6.0f, 9.5f, 6.0f)
                horizontalLineTo(14.5f)
                curveTo(15.3284f, 6.0f, 16.0f, 5.3284f, 16.0f, 4.5f)
                verticalLineTo(3.5f)
                curveTo(16.0f, 2.6716f, 15.3284f, 2.0f, 14.5f, 2.0f)
                horizontalLineTo(9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.5f, 4.0366f)
                curveTo(5.2421f, 4.1072f, 4.448f, 4.3076f, 3.8787f, 4.8769f)
                curveTo(3.0f, 5.7556f, 3.0f, 7.1698f, 3.0f, 9.9983f)
                verticalLineTo(15.9983f)
                curveTo(3.0f, 18.8267f, 3.0f, 20.2409f, 3.8787f, 21.1196f)
                curveTo(4.7574f, 21.9983f, 6.1716f, 21.9983f, 9.0f, 21.9983f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 21.9983f, 19.2426f, 21.9983f, 20.1213f, 21.1196f)
                curveTo(21.0f, 20.2409f, 21.0f, 18.8267f, 21.0f, 15.9983f)
                verticalLineTo(9.9983f)
                curveTo(21.0f, 7.1698f, 21.0f, 5.7556f, 20.1213f, 4.8769f)
                curveTo(19.552f, 4.3076f, 18.7579f, 4.1072f, 17.5f, 4.0366f)
                verticalLineTo(4.5f)
                curveTo(17.5f, 6.1568f, 16.1569f, 7.5f, 14.5f, 7.5f)
                horizontalLineTo(9.5f)
                curveTo(7.8432f, 7.5f, 6.5f, 6.1568f, 6.5f, 4.5f)
                verticalLineTo(4.0366f)
                close()
                moveTo(7.0f, 13.75f)
                curveTo(6.5858f, 13.75f, 6.25f, 14.0858f, 6.25f, 14.5f)
                curveTo(6.25f, 14.9142f, 6.5858f, 15.25f, 7.0f, 15.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 15.25f, 15.75f, 14.9142f, 15.75f, 14.5f)
                curveTo(15.75f, 14.0858f, 15.4142f, 13.75f, 15.0f, 13.75f)
                horizontalLineTo(7.0f)
                close()
                moveTo(7.0f, 17.25f)
                curveTo(6.5858f, 17.25f, 6.25f, 17.5858f, 6.25f, 18.0f)
                curveTo(6.25f, 18.4142f, 6.5858f, 18.75f, 7.0f, 18.75f)
                horizontalLineTo(12.5f)
                curveTo(12.9142f, 18.75f, 13.25f, 18.4142f, 13.25f, 18.0f)
                curveTo(13.25f, 17.5858f, 12.9142f, 17.25f, 12.5f, 17.25f)
                horizontalLineTo(7.0f)
                close()
            }
        }
            .build()
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
