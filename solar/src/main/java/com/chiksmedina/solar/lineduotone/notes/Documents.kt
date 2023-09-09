package com.chiksmedina.solar.lineduotone.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.NotesGroup

public val NotesGroup.Documents: ImageVector
    get() {
        if (_documents != null) {
            return _documents!!
        }
        _documents = Builder(name = "Documents", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(5.0f, 5.1716f, 5.0f, 3.7574f, 5.8787f, 2.8787f)
                curveTo(6.7574f, 2.0f, 8.1716f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(15.8284f, 2.0f, 17.2426f, 2.0f, 18.1213f, 2.8787f)
                curveTo(19.0f, 3.7574f, 19.0f, 5.1716f, 19.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 18.8284f, 19.0f, 20.2426f, 18.1213f, 21.1213f)
                curveTo(17.2426f, 22.0f, 15.8284f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(8.1716f, 22.0f, 6.7574f, 22.0f, 5.8787f, 21.1213f)
                curveTo(5.0f, 20.2426f, 5.0f, 18.8284f, 5.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0762f)
                curveTo(4.0249f, 4.1721f, 3.3686f, 4.3889f, 2.8787f, 4.8787f)
                curveTo(2.0f, 5.7574f, 2.0f, 7.1716f, 2.0f, 10.0001f)
                verticalLineTo(14.0001f)
                curveTo(2.0f, 16.8285f, 2.0f, 18.2427f, 2.8787f, 19.1214f)
                curveTo(3.3686f, 19.6113f, 4.0249f, 19.828f, 5.0f, 19.9239f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 4.0762f)
                curveTo(19.9751f, 4.1721f, 20.6314f, 4.3889f, 21.1213f, 4.8787f)
                curveTo(22.0f, 5.7574f, 22.0f, 7.1716f, 22.0f, 10.0001f)
                verticalLineTo(14.0001f)
                curveTo(22.0f, 16.8285f, 22.0f, 18.2427f, 21.1213f, 19.1214f)
                curveTo(20.6314f, 19.6113f, 19.9751f, 19.828f, 19.0f, 19.9239f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                horizontalLineTo(12.0f)
            }
        }
        .build()
        return _documents!!
    }

private var _documents: ImageVector? = null
