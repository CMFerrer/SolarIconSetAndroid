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

public val NotesGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.1716f, 3.1716f)
                curveTo(3.0f, 4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 17.7712f, 3.0f, 19.6569f, 4.1716f, 20.8284f)
                curveTo(5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 22.0f, 18.6569f, 22.0f, 19.8284f, 20.8284f)
                curveTo(21.0f, 19.6569f, 21.0f, 17.7712f, 21.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 6.2288f, 21.0f, 4.3432f, 19.8284f, 3.1716f)
                curveTo(18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 2.0f, 5.3432f, 2.0f, 4.1716f, 3.1716f)
                close()
                moveTo(8.0f, 9.25f)
                curveTo(7.5858f, 9.25f, 7.25f, 9.5858f, 7.25f, 10.0f)
                curveTo(7.25f, 10.4142f, 7.5858f, 10.75f, 8.0f, 10.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 10.75f, 16.75f, 10.4142f, 16.75f, 10.0f)
                curveTo(16.75f, 9.5858f, 16.4142f, 9.25f, 16.0f, 9.25f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 13.25f)
                curveTo(7.5858f, 13.25f, 7.25f, 13.5858f, 7.25f, 14.0f)
                curveTo(7.25f, 14.4142f, 7.5858f, 14.75f, 8.0f, 14.75f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 14.75f, 13.75f, 14.4142f, 13.75f, 14.0f)
                curveTo(13.75f, 13.5858f, 13.4142f, 13.25f, 13.0f, 13.25f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
