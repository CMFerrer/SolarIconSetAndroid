package com.chiksmedina.solar.broken.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.NotesGroup

val NotesGroup.DocumentText: ImageVector
    get() {
        if (_documentText != null) {
            return _documentText!!
        }
        _documentText = Builder(
            name = "DocumentText", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 12.0f)
                horizontalLineTo(9.0f)
                moveTo(16.0f, 12.0f)
                horizontalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 8.0f)
                horizontalLineTo(15.0f)
                moveTo(12.0f, 8.0f)
                horizontalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 16.0f)
                horizontalLineTo(13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 6.2288f, 3.0f, 4.3432f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(20.4816f, 3.8248f, 20.7706f, 4.6999f, 20.8985f, 6.0f)
                moveTo(21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 17.7712f, 21.0f, 19.6569f, 19.8284f, 20.8284f)
                curveTo(18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 22.0f, 5.3432f, 22.0f, 4.1716f, 20.8284f)
                curveTo(3.5184f, 20.1752f, 3.2294f, 19.3001f, 3.1015f, 18.0f)
            }
        }
            .build()
        return _documentText!!
    }

private var _documentText: ImageVector? = null
