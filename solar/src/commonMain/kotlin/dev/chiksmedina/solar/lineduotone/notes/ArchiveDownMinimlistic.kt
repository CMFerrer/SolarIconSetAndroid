package dev.chiksmedina.solar.lineduotone.notes

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
import dev.chiksmedina.solar.lineduotone.NotesGroup

val NotesGroup.ArchiveDownMinimlistic: ImageVector
    get() {
        if (_archiveDownMinimlistic != null) {
            return _archiveDownMinimlistic!!
        }
        _archiveDownMinimlistic = Builder(
            name = "ArchiveDownMinimlistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 11.1997f, 2.0f, 9.7996f, 2.545f, 8.7301f)
                curveTo(3.0243f, 7.7892f, 3.7892f, 7.0243f, 4.7301f, 6.545f)
                curveTo(5.7996f, 6.0f, 7.1997f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8003f, 6.0f, 18.2004f, 6.0f, 19.27f, 6.545f)
                curveTo(20.2108f, 7.0243f, 20.9757f, 7.7892f, 21.455f, 8.7301f)
                curveTo(22.0f, 9.7996f, 22.0f, 11.1997f, 22.0f, 14.0f)
                curveTo(22.0f, 16.8003f, 22.0f, 18.2004f, 21.455f, 19.27f)
                curveTo(20.9757f, 20.2108f, 20.2108f, 20.9757f, 19.27f, 21.455f)
                curveTo(18.2004f, 22.0f, 16.8003f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(7.1997f, 22.0f, 5.7996f, 22.0f, 4.7301f, 21.455f)
                curveTo(3.7892f, 20.9757f, 3.0243f, 20.2108f, 2.545f, 19.27f)
                curveTo(2.0f, 18.2004f, 2.0f, 16.8003f, 2.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.0f)
                lineTo(12.0f, 17.0f)
                moveTo(12.0f, 17.0f)
                lineTo(14.5f, 14.5f)
                moveTo(12.0f, 17.0f)
                lineTo(9.5f, 14.5f)
            }
        }
            .build()
        return _archiveDownMinimlistic!!
    }

private var _archiveDownMinimlistic: ImageVector? = null
