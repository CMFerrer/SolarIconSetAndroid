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

val NotesGroup.ClipboardRemove: ImageVector
    get() {
        if (_clipboardRemove != null) {
            return _clipboardRemove!!
        }
        _clipboardRemove = Builder(
            name = "ClipboardRemove", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(3.8787f, 4.8769f)
                curveTo(4.448f, 4.3076f, 5.2421f, 4.1072f, 6.5f, 4.0366f)
                verticalLineTo(4.5f)
                curveTo(6.5f, 6.1568f, 7.8432f, 7.5f, 9.5f, 7.5f)
                horizontalLineTo(14.5f)
                curveTo(16.1569f, 7.5f, 17.5f, 6.1568f, 17.5f, 4.5f)
                verticalLineTo(4.0366f)
                curveTo(18.7579f, 4.1072f, 19.552f, 4.3076f, 20.1213f, 4.8769f)
                curveTo(21.0f, 5.7556f, 21.0f, 7.1698f, 21.0f, 9.9983f)
                verticalLineTo(15.9983f)
                curveTo(21.0f, 18.8267f, 21.0f, 20.2409f, 20.1213f, 21.1196f)
                curveTo(19.2426f, 21.9983f, 17.8284f, 21.9983f, 15.0f, 21.9983f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 21.9983f, 4.7574f, 21.9983f, 3.8787f, 21.1196f)
                curveTo(3.0f, 20.2409f, 3.0f, 18.8267f, 3.0f, 15.9983f)
                verticalLineTo(9.9983f)
                curveTo(3.0f, 7.1698f, 3.0f, 5.7556f, 3.8787f, 4.8769f)
                close()
                moveTo(12.0f, 13.4394f)
                lineTo(10.0303f, 11.4697f)
                curveTo(9.7374f, 11.1768f, 9.2626f, 11.1768f, 8.9697f, 11.4697f)
                curveTo(8.6768f, 11.7626f, 8.6768f, 12.2374f, 8.9697f, 12.5303f)
                lineTo(10.9394f, 14.5f)
                lineTo(8.9697f, 16.4697f)
                curveTo(8.6768f, 16.7626f, 8.6768f, 17.2374f, 8.9697f, 17.5303f)
                curveTo(9.2626f, 17.8232f, 9.7375f, 17.8232f, 10.0304f, 17.5303f)
                lineTo(12.0f, 15.5607f)
                lineTo(13.9696f, 17.5303f)
                curveTo(14.2625f, 17.8232f, 14.7374f, 17.8232f, 15.0303f, 17.5303f)
                curveTo(15.3232f, 17.2374f, 15.3232f, 16.7625f, 15.0303f, 16.4697f)
                lineTo(13.0607f, 14.5f)
                lineTo(15.0303f, 12.5303f)
                curveTo(15.3232f, 12.2375f, 15.3232f, 11.7626f, 15.0303f, 11.4697f)
                curveTo(14.7374f, 11.1768f, 14.2626f, 11.1768f, 13.9697f, 11.4697f)
                lineTo(12.0f, 13.4394f)
                close()
            }
        }
            .build()
        return _clipboardRemove!!
    }

private var _clipboardRemove: ImageVector? = null
