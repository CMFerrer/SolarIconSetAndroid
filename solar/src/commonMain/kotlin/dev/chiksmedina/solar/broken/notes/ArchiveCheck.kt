package dev.chiksmedina.solar.broken.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.NotesGroup

val NotesGroup.ArchiveCheck: ImageVector
    get() {
        if (_archiveCheck != null) {
            return _archiveCheck!!
        }
        _archiveCheck = Builder(
            name = "ArchiveCheck", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 13.4f)
                lineTo(10.9286f, 15.0f)
                lineTo(14.5f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(20.5f, 16.7712f, 20.5f, 18.6569f, 19.3284f, 19.8284f)
                curveTo(18.1569f, 21.0f, 16.2712f, 21.0f, 12.5f, 21.0f)
                horizontalLineTo(11.5f)
                moveTo(3.5f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(3.5f, 16.7712f, 3.5f, 18.6569f, 4.6716f, 19.8284f)
                curveTo(5.3763f, 20.5332f, 6.3395f, 20.814f, 7.8161f, 20.9259f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.0572f, 3.0f, 2.5858f, 3.0f, 2.2929f, 3.2929f)
                curveTo(2.0f, 3.5858f, 2.0f, 4.0572f, 2.0f, 5.0f)
                curveTo(2.0f, 5.9428f, 2.0f, 6.4142f, 2.2929f, 6.7071f)
                curveTo(2.5858f, 7.0f, 3.0572f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(20.0f)
                curveTo(20.9428f, 7.0f, 21.4142f, 7.0f, 21.7071f, 6.7071f)
                curveTo(22.0f, 6.4142f, 22.0f, 5.9428f, 22.0f, 5.0f)
                curveTo(22.0f, 4.0572f, 22.0f, 3.5858f, 21.7071f, 3.2929f)
                curveTo(21.4142f, 3.0f, 20.9428f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(16.0f)
            }
        }
            .build()
        return _archiveCheck!!
    }

private var _archiveCheck: ImageVector? = null
