package dev.chiksmedina.solar.bold.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.NotesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0689f, 8.4999f)
                curveTo(20.2101f, 8.5f, 20.3551f, 8.5f, 20.5f, 8.498f)
                verticalLineTo(12.9999f)
                curveTo(20.5f, 16.7711f, 20.5f, 18.6568f, 19.3284f, 19.8283f)
                curveTo(18.183f, 20.9737f, 16.3552f, 20.9993f, 12.75f, 20.9999f)
                lineTo(12.75f, 13.9543f)
                lineTo(14.4425f, 15.8349f)
                curveTo(14.7196f, 16.1428f, 15.1938f, 16.1678f, 15.5017f, 15.8907f)
                curveTo(15.8096f, 15.6136f, 15.8346f, 15.1394f, 15.5575f, 14.8315f)
                lineTo(12.5575f, 11.4982f)
                curveTo(12.4152f, 11.3401f, 12.2126f, 11.2499f, 12.0f, 11.2499f)
                curveTo(11.7874f, 11.2499f, 11.5848f, 11.3401f, 11.4425f, 11.4982f)
                lineTo(8.4425f, 14.8315f)
                curveTo(8.1654f, 15.1394f, 8.1904f, 15.6136f, 8.4983f, 15.8907f)
                curveTo(8.8062f, 16.1678f, 9.2804f, 16.1428f, 9.5575f, 15.8349f)
                lineTo(11.25f, 13.9543f)
                lineTo(11.25f, 20.9999f)
                curveTo(7.6448f, 20.9993f, 5.817f, 20.9737f, 4.6716f, 19.8283f)
                curveTo(3.5f, 18.6568f, 3.5f, 16.7711f, 3.5f, 12.9999f)
                verticalLineTo(8.498f)
                curveTo(3.6449f, 8.5f, 3.79f, 8.5f, 3.9311f, 8.4999f)
                horizontalLineTo(20.0689f)
                close()
            }
        }
            .build()
        return _archiveUp!!
    }

private var _archiveUp: ImageVector? = null
