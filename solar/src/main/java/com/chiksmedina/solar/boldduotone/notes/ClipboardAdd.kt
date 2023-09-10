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

val NotesGroup.ClipboardAdd: ImageVector
    get() {
        if (_clipboardAdd != null) {
            return _clipboardAdd!!
        }
        _clipboardAdd = Builder(
            name = "ClipboardAdd", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(12.25f)
                lineTo(15.0f, 12.25f)
                curveTo(15.4142f, 12.25f, 15.75f, 12.5858f, 15.75f, 13.0f)
                curveTo(15.75f, 13.4142f, 15.4142f, 13.75f, 15.0f, 13.75f)
                lineTo(12.75f, 13.75f)
                lineTo(12.75f, 16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                lineTo(11.25f, 13.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 13.75f, 8.25f, 13.4142f, 8.25f, 13.0f)
                curveTo(8.25f, 12.5858f, 8.5858f, 12.25f, 9.0f, 12.25f)
                lineTo(11.25f, 12.25f)
                lineTo(11.25f, 10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                close()
            }
        }
            .build()
        return _clipboardAdd!!
    }

private var _clipboardAdd: ImageVector? = null
