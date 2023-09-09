package com.chiksmedina.solar.bold.notes

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.bold.NotesGroup

public val NotesGroup.ArchiveCheck: ImageVector
    get() {
        if (_archiveCheck != null) {
            return _archiveCheck!!
        }
        _archiveCheck = Builder(name = "ArchiveCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                horizontalLineTo(20.0689f)
                close()
                moveTo(14.9995f, 12.1906f)
                curveTo(15.3085f, 12.4664f, 15.3353f, 12.9405f, 15.0595f, 13.2495f)
                lineTo(11.488f, 17.2495f)
                curveTo(11.3457f, 17.4089f, 11.1422f, 17.5f, 10.9286f, 17.5f)
                curveTo(10.7149f, 17.5f, 10.5114f, 17.4089f, 10.3691f, 17.2495f)
                lineTo(8.9405f, 15.6495f)
                curveTo(8.6647f, 15.3405f, 8.6915f, 14.8664f, 9.0005f, 14.5906f)
                curveTo(9.3095f, 14.3147f, 9.7836f, 14.3415f, 10.0595f, 14.6505f)
                lineTo(10.9286f, 15.6239f)
                lineTo(13.9406f, 12.2505f)
                curveTo(14.2164f, 11.9415f, 14.6905f, 11.9147f, 14.9995f, 12.1906f)
                close()
            }
        }
        .build()
        return _archiveCheck!!
    }

private var _archiveCheck: ImageVector? = null
