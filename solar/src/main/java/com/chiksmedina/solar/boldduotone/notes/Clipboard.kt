package com.chiksmedina.solar.boldduotone.notes

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
import com.chiksmedina.solar.boldduotone.NotesGroup

public val NotesGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 10.5f)
                curveTo(6.25f, 10.0858f, 6.5858f, 9.75f, 7.0f, 9.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 9.75f, 17.75f, 10.0858f, 17.75f, 10.5f)
                curveTo(17.75f, 10.9142f, 17.4142f, 11.25f, 17.0f, 11.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 11.25f, 6.25f, 10.9142f, 6.25f, 10.5f)
                close()
                moveTo(7.25f, 14.0f)
                curveTo(7.25f, 13.5858f, 7.5858f, 13.25f, 8.0f, 13.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 13.25f, 16.75f, 13.5858f, 16.75f, 14.0f)
                curveTo(16.75f, 14.4142f, 16.4142f, 14.75f, 16.0f, 14.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 14.75f, 7.25f, 14.4142f, 7.25f, 14.0f)
                close()
                moveTo(8.25f, 17.5f)
                curveTo(8.25f, 17.0858f, 8.5858f, 16.75f, 9.0f, 16.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 16.75f, 15.75f, 17.0858f, 15.75f, 17.5f)
                curveTo(15.75f, 17.9142f, 15.4142f, 18.25f, 15.0f, 18.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 18.25f, 8.25f, 17.9142f, 8.25f, 17.5f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
