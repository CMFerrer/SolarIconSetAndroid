package com.chiksmedina.solar.boldduotone.notes

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
import com.chiksmedina.solar.boldduotone.NotesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 15.9983f)
                verticalLineTo(9.9983f)
                curveTo(21.0f, 7.1698f, 21.0f, 5.7556f, 20.1213f, 4.8769f)
                curveTo(19.3529f, 4.1086f, 18.175f, 4.0121f, 16.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(5.825f, 4.0121f, 4.6471f, 4.1086f, 3.8787f, 4.8769f)
                curveTo(3.0f, 5.7556f, 3.0f, 7.1698f, 3.0f, 9.9983f)
                verticalLineTo(15.9983f)
                curveTo(3.0f, 18.8267f, 3.0f, 20.2409f, 3.8787f, 21.1196f)
                curveTo(4.7574f, 21.9983f, 6.1716f, 21.9983f, 9.0f, 21.9983f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 21.9983f, 19.2426f, 21.9983f, 20.1213f, 21.1196f)
                curveTo(21.0f, 20.2409f, 21.0f, 18.8267f, 21.0f, 15.9983f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 3.5f)
                curveTo(8.0f, 2.6716f, 8.6716f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.3284f, 2.0f, 16.0f, 2.6716f, 16.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(16.0f, 5.3284f, 15.3284f, 6.0f, 14.5f, 6.0f)
                horizontalLineTo(9.5f)
                curveTo(8.6716f, 6.0f, 8.0f, 5.3284f, 8.0f, 4.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9697f, 10.4697f)
                curveTo(9.2626f, 10.1768f, 9.7374f, 10.1768f, 10.0303f, 10.4697f)
                lineTo(12.0f, 12.4394f)
                lineTo(13.9697f, 10.4697f)
                curveTo(14.2626f, 10.1768f, 14.7374f, 10.1768f, 15.0303f, 10.4697f)
                curveTo(15.3232f, 10.7626f, 15.3232f, 11.2375f, 15.0303f, 11.5304f)
                lineTo(13.0607f, 13.5f)
                lineTo(15.0303f, 15.4696f)
                curveTo(15.3232f, 15.7625f, 15.3232f, 16.2374f, 15.0303f, 16.5303f)
                curveTo(14.7374f, 16.8232f, 14.2625f, 16.8232f, 13.9696f, 16.5303f)
                lineTo(12.0f, 14.5607f)
                lineTo(10.0304f, 16.5303f)
                curveTo(9.7375f, 16.8232f, 9.2626f, 16.8232f, 8.9697f, 16.5303f)
                curveTo(8.6768f, 16.2374f, 8.6768f, 15.7626f, 8.9697f, 15.4697f)
                lineTo(10.9393f, 13.5f)
                lineTo(8.9697f, 11.5303f)
                curveTo(8.6768f, 11.2374f, 8.6768f, 10.7626f, 8.9697f, 10.4697f)
                close()
            }
        }
            .build()
        return _clipboardRemove!!
    }

private var _clipboardRemove: ImageVector? = null
