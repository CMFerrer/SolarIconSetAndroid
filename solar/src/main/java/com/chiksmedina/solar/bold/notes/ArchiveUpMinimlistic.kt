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

public val NotesGroup.ArchiveUpMinimlistic: ImageVector
    get() {
        if (_archiveUpMinimlistic != null) {
            return _archiveUpMinimlistic!!
        }
        _archiveUpMinimlistic = Builder(name = "ArchiveUpMinimlistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5348f, 3.4645f)
                curveTo(19.0704f, 2.0f, 16.7133f, 2.0f, 11.9993f, 2.0f)
                curveTo(7.2853f, 2.0f, 4.9282f, 2.0f, 3.4638f, 3.4645f)
                curveTo(2.7063f, 4.222f, 2.3406f, 5.2182f, 2.1641f, 6.656f)
                curveTo(2.6947f, 6.0653f, 3.3324f, 5.5733f, 4.0484f, 5.2085f)
                curveTo(4.8298f, 4.8103f, 5.6666f, 4.6488f, 6.5932f, 4.5731f)
                curveTo(7.4883f, 4.5f, 8.5897f, 4.5f, 9.9365f, 4.5f)
                horizontalLineTo(14.0621f)
                curveTo(15.4089f, 4.5f, 16.5103f, 4.5f, 17.4054f, 4.5731f)
                curveTo(18.332f, 4.6488f, 19.1688f, 4.8103f, 19.9502f, 5.2085f)
                curveTo(20.6662f, 5.5733f, 21.3039f, 6.0653f, 21.8345f, 6.656f)
                curveTo(21.658f, 5.2182f, 21.2923f, 4.222f, 20.5348f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(12.5303f, 10.4697f)
                curveTo(12.3897f, 10.329f, 12.1989f, 10.25f, 12.0f, 10.25f)
                curveTo(11.8011f, 10.25f, 11.6103f, 10.329f, 11.4697f, 10.4697f)
                lineTo(8.9697f, 12.9697f)
                curveTo(8.6768f, 13.2626f, 8.6768f, 13.7374f, 8.9697f, 14.0303f)
                curveTo(9.2626f, 14.3232f, 9.7374f, 14.3232f, 10.0303f, 14.0303f)
                lineTo(11.25f, 12.8107f)
                verticalLineTo(17.0f)
                curveTo(11.25f, 17.4142f, 11.5858f, 17.75f, 12.0f, 17.75f)
                curveTo(12.4142f, 17.75f, 12.75f, 17.4142f, 12.75f, 17.0f)
                verticalLineTo(12.8107f)
                lineTo(13.9697f, 14.0303f)
                curveTo(14.2626f, 14.3232f, 14.7374f, 14.3232f, 15.0303f, 14.0303f)
                curveTo(15.3232f, 13.7374f, 15.3232f, 13.2626f, 15.0303f, 12.9697f)
                lineTo(12.5303f, 10.4697f)
                close()
            }
        }
        .build()
        return _archiveUpMinimlistic!!
    }

private var _archiveUpMinimlistic: ImageVector? = null
