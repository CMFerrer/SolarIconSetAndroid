package com.chiksmedina.solar.lineduotone.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.NotesGroup

val NotesGroup.ArchiveUp: ImageVector
    get() {
        if (_archiveUp != null) {
            return _archiveUp!!
        }
        _archiveUp = Builder(
            name = "ArchiveUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.0f)
                lineTo(12.0f, 12.0f)
                moveTo(12.0f, 12.0f)
                lineTo(15.0f, 15.3333f)
                moveTo(12.0f, 12.0f)
                lineTo(9.0f, 15.3333f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(20.5f, 16.7712f, 20.5f, 18.6569f, 19.3284f, 19.8284f)
                curveTo(18.1569f, 21.0f, 16.2712f, 21.0f, 12.5f, 21.0f)
                horizontalLineTo(11.5f)
                curveTo(7.7288f, 21.0f, 5.8432f, 21.0f, 4.6716f, 19.8284f)
                curveTo(3.5f, 18.6569f, 3.5f, 16.7712f, 3.5f, 13.0f)
                verticalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
        }
            .build()
        return _archiveUp!!
    }

private var _archiveUp: ImageVector? = null
