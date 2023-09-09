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

public val NotesGroup.ArchiveMinimalistic: ImageVector
    get() {
        if (_archiveMinimalistic != null) {
            return _archiveMinimalistic!!
        }
        _archiveMinimalistic = Builder(name = "ArchiveMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.545f, 8.7301f)
                curveTo(2.0f, 9.7996f, 2.0f, 11.1997f, 2.0f, 14.0f)
                curveTo(2.0f, 16.8003f, 2.0f, 18.2004f, 2.545f, 19.27f)
                curveTo(3.0243f, 20.2108f, 3.7892f, 20.9757f, 4.7301f, 21.455f)
                curveTo(5.7996f, 22.0f, 7.1997f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8003f, 22.0f, 18.2004f, 22.0f, 19.27f, 21.455f)
                curveTo(20.2108f, 20.9757f, 20.9757f, 20.2108f, 21.455f, 19.27f)
                curveTo(22.0f, 18.2004f, 22.0f, 16.8003f, 22.0f, 14.0f)
                curveTo(22.0f, 11.1997f, 22.0f, 9.7996f, 21.455f, 8.7301f)
                curveTo(20.9757f, 7.7892f, 20.2108f, 7.0243f, 19.27f, 6.545f)
                curveTo(18.2004f, 6.0f, 16.8003f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(7.1997f, 6.0f, 5.7996f, 6.0f, 4.7301f, 6.545f)
                curveTo(3.7892f, 7.0243f, 3.0243f, 7.7892f, 2.545f, 8.7301f)
                close()
                moveTo(15.0595f, 12.4995f)
                curveTo(15.3353f, 12.1905f, 15.3085f, 11.7164f, 14.9995f, 11.4406f)
                curveTo(14.6905f, 11.1647f, 14.2164f, 11.1915f, 13.9406f, 11.5005f)
                lineTo(10.9286f, 14.8739f)
                lineTo(10.0595f, 13.9005f)
                curveTo(9.7836f, 13.5915f, 9.3095f, 13.5647f, 9.0005f, 13.8406f)
                curveTo(8.6915f, 14.1164f, 8.6647f, 14.5905f, 8.9405f, 14.8995f)
                lineTo(10.3691f, 16.4995f)
                curveTo(10.5114f, 16.6589f, 10.7149f, 16.75f, 10.9286f, 16.75f)
                curveTo(11.1422f, 16.75f, 11.3457f, 16.6589f, 11.488f, 16.4995f)
                lineTo(15.0595f, 12.4995f)
                close()
            }
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
        }
        .build()
        return _archiveMinimalistic!!
    }

private var _archiveMinimalistic: ImageVector? = null
