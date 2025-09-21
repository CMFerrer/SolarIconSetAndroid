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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.9993f, 2.0f)
                curveTo(16.7133f, 2.0f, 19.0704f, 2.0f, 20.5348f, 3.4645f)
                curveTo(21.2923f, 4.222f, 21.658f, 5.2182f, 21.8345f, 6.656f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.1641f)
                verticalLineTo(6.656f)
                curveTo(2.3406f, 5.2182f, 2.7063f, 4.222f, 3.4638f, 3.4645f)
                curveTo(4.9282f, 2.0f, 7.2853f, 2.0f, 11.9993f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
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
                moveTo(12.75f, 11.0f)
                curveTo(12.75f, 10.5858f, 12.4142f, 10.25f, 12.0f, 10.25f)
                curveTo(11.5858f, 10.25f, 11.25f, 10.5858f, 11.25f, 11.0f)
                verticalLineTo(15.1893f)
                lineTo(10.0303f, 13.9697f)
                curveTo(9.7374f, 13.6768f, 9.2626f, 13.6768f, 8.9697f, 13.9697f)
                curveTo(8.6768f, 14.2626f, 8.6768f, 14.7374f, 8.9697f, 15.0303f)
                lineTo(11.4697f, 17.5303f)
                curveTo(11.6103f, 17.671f, 11.8011f, 17.75f, 12.0f, 17.75f)
                curveTo(12.1989f, 17.75f, 12.3897f, 17.671f, 12.5303f, 17.5303f)
                lineTo(15.0303f, 15.0303f)
                curveTo(15.3232f, 14.7374f, 15.3232f, 14.2626f, 15.0303f, 13.9697f)
                curveTo(14.7374f, 13.6768f, 14.2626f, 13.6768f, 13.9697f, 13.9697f)
                lineTo(12.75f, 15.1893f)
                verticalLineTo(11.0f)
                close()
            }
        }
            .build()
        return _archiveDownMinimlistic!!
    }

private var _archiveDownMinimlistic: ImageVector? = null
