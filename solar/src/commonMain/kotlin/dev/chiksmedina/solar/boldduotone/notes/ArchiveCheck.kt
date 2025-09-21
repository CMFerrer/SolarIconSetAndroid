package dev.chiksmedina.solar.boldduotone.notes

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
import dev.chiksmedina.solar.boldduotone.NotesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5f, 21.0f)
                horizontalLineTo(12.5f)
                curveTo(16.2712f, 21.0f, 18.1569f, 21.0f, 19.3284f, 19.8284f)
                curveTo(20.5f, 18.6569f, 20.5f, 16.7713f, 20.5f, 13.0f)
                verticalLineTo(6.9981f)
                curveTo(20.3548f, 7.0001f, 20.1509f, 7.0001f, 20.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.8491f, 7.0001f, 3.6452f, 7.0001f, 3.5f, 6.9981f)
                verticalLineTo(13.0f)
                curveTo(3.5f, 16.7713f, 3.5f, 18.6569f, 4.6716f, 19.8284f)
                curveTo(5.8432f, 21.0f, 7.7288f, 21.0f, 11.5f, 21.0f)
                close()
                moveTo(15.0595f, 11.4995f)
                curveTo(15.3353f, 11.1905f, 15.3085f, 10.7164f, 14.9995f, 10.4406f)
                curveTo(14.6905f, 10.1647f, 14.2164f, 10.1915f, 13.9406f, 10.5005f)
                lineTo(10.9286f, 13.8739f)
                lineTo(10.0595f, 12.9005f)
                curveTo(9.7836f, 12.5915f, 9.3095f, 12.5647f, 9.0005f, 12.8406f)
                curveTo(8.6915f, 13.1164f, 8.6647f, 13.5905f, 8.9405f, 13.8995f)
                lineTo(10.3691f, 15.4995f)
                curveTo(10.5114f, 15.6589f, 10.7149f, 15.75f, 10.9286f, 15.75f)
                curveTo(11.1422f, 15.75f, 11.3457f, 15.6589f, 11.488f, 15.4995f)
                lineTo(15.0595f, 11.4995f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
        return _archiveCheck!!
    }

private var _archiveCheck: ImageVector? = null
