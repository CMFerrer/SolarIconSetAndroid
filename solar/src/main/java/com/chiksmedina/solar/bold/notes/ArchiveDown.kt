package com.chiksmedina.solar.bold.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NotesGroup

val NotesGroup.ArchiveDown: ImageVector
    get() {
        if (_archiveDown != null) {
            return _archiveDown!!
        }
        _archiveDown = Builder(
            name = "ArchiveDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                curveTo(18.1569f, 20.9999f, 16.2712f, 20.9999f, 12.5f, 20.9999f)
                horizontalLineTo(11.5f)
                curveTo(7.7288f, 20.9999f, 5.8432f, 20.9999f, 4.6716f, 19.8283f)
                curveTo(3.5f, 18.6568f, 3.5f, 16.7711f, 3.5f, 12.9999f)
                verticalLineTo(8.498f)
                curveTo(3.6449f, 8.5f, 3.79f, 8.5f, 3.9311f, 8.4999f)
                lineTo(11.25f, 8.4999f)
                lineTo(11.25f, 15.0454f)
                lineTo(9.5575f, 13.1648f)
                curveTo(9.2804f, 12.8569f, 8.8062f, 12.832f, 8.4983f, 13.1091f)
                curveTo(8.1904f, 13.3862f, 8.1654f, 13.8604f, 8.4425f, 14.1683f)
                lineTo(11.4425f, 17.5016f)
                curveTo(11.5848f, 17.6596f, 11.7874f, 17.7499f, 12.0f, 17.7499f)
                curveTo(12.2126f, 17.7499f, 12.4152f, 17.6596f, 12.5575f, 17.5016f)
                lineTo(15.5575f, 14.1683f)
                curveTo(15.8346f, 13.8604f, 15.8096f, 13.3862f, 15.5017f, 13.1091f)
                curveTo(15.1938f, 12.832f, 14.7196f, 12.8569f, 14.4425f, 13.1648f)
                lineTo(12.75f, 15.0454f)
                lineTo(12.75f, 8.4999f)
                lineTo(20.0689f, 8.4999f)
                close()
            }
        }
            .build()
        return _archiveDown!!
    }

private var _archiveDown: ImageVector? = null
